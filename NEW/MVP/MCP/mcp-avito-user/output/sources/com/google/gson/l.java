package com.google.gson;

import com.google.gson.internal.C;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;

/* compiled from: JsonParser.java */
/* loaded from: classes6.dex */
public final class l {
    @Deprecated
    public l() {
    }

    public static i a(com.google.gson.stream.a aVar) {
        boolean z12 = aVar.f362208c;
        aVar.f362208c = true;
        try {
            try {
                try {
                    return C.a(aVar);
                } catch (StackOverflowError e12) {
                    throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e12);
                }
            } catch (OutOfMemoryError e13) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e13);
            }
        } finally {
            aVar.f362208c = z12;
        }
    }

    public static i b(String str) {
        try {
            com.google.gson.stream.a aVar = new com.google.gson.stream.a(new StringReader(str));
            i iVarA = a(aVar);
            iVarA.getClass();
            if (!(iVarA instanceof j) && aVar.F() != JsonToken.f362205k) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return iVarA;
        } catch (MalformedJsonException e12) {
            throw new JsonSyntaxException(e12);
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        } catch (NumberFormatException e14) {
            throw new JsonSyntaxException(e14);
        }
    }
}
