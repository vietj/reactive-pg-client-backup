package com.julienviet.pgclient.codec.decoder.message;

import com.julienviet.pgclient.codec.Message;

/**
 *
 * The Authentication is succeeded
 *
 * @author <a href="mailto:emad.albloushi@gmail.com">Emad Alblueshi</a>
 */

public class AuthenticationOk implements Message {

  public static final AuthenticationOk INSTANCE = new AuthenticationOk();

  private AuthenticationOk() {}

  @Override
  public String toString() {
    return "AuthenticationOk{}";
  }
}