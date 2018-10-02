package com.newsletter.sub.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception for checking the email existance validation.
 * <p/>
 * 
 * @author Ahmed ElGamal
 * @version 1.0
 * @since 01.10.2018
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Account is already un-subscribed...")
public class EntityAlreadyUnSubscribedException extends Exception {

	static final long serialVersionUID = -3387516993224229948L;

	public EntityAlreadyUnSubscribedException(String message) {
		super(message);
	}

}
