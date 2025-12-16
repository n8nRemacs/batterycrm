package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.JsonParser;
import com.google.gson.JsonParseException;
import com.google.gson.f;
import com.google.gson.k;
import java.io.IOException;

/* loaded from: classes6.dex */
final class JsonUtil {
    private JsonUtil() {
    }

    public static boolean isValidString(String str) {
        return JsonParser.isValidString(str);
    }

    public static k parseJson(String str) throws JwtInvalidException {
        try {
            return JsonParser.parse(str).i();
        } catch (JsonParseException | IOException | IllegalStateException e12) {
            throw new JwtInvalidException("invalid JSON: " + e12);
        }
    }

    public static f parseJsonArray(String str) throws JwtInvalidException {
        try {
            return JsonParser.parse(str).h();
        } catch (JsonParseException | IOException | IllegalStateException e12) {
            throw new JwtInvalidException("invalid JSON: " + e12);
        }
    }
}
