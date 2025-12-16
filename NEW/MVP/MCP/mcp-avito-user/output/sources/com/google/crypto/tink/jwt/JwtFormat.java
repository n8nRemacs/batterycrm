package com.google.crypto.tink.jwt;

import AK.c;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Base64;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.m;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Optional;

/* loaded from: classes6.dex */
final class JwtFormat {

    public static class Parts {
        String header;
        String payload;
        byte[] signatureOrMac;
        String unsignedCompact;

        public Parts(String str, byte[] bArr, String str2, String str3) {
            this.unsignedCompact = str;
            this.signatureOrMac = bArr;
            this.header = str2;
            this.payload = str3;
        }
    }

    private JwtFormat() {
    }

    public static String createHeader(String str, Optional<String> optional, Optional<String> optional2) throws InvalidAlgorithmParameterException {
        validateAlgorithm(str);
        k kVar = new k();
        if (optional2.isPresent()) {
            kVar.y("kid", optional2.get());
        }
        kVar.y("alg", str);
        if (optional.isPresent()) {
            kVar.y("typ", optional.get());
        }
        return Base64.urlSafeEncode(kVar.toString().getBytes(Util.UTF_8));
    }

    public static String createSignedCompact(String str, byte[] bArr) {
        StringBuilder sbZ = r.z(str, ".");
        sbZ.append(encodeSignature(bArr));
        return sbZ.toString();
    }

    public static String createUnsignedCompact(String str, Optional<String> optional, RawJwt rawJwt) {
        String jsonPayload = rawJwt.getJsonPayload();
        return createHeader(str, rawJwt.hasTypeHeader() ? Optional.of(rawJwt.getTypeHeader()) : Optional.empty(), optional) + "." + encodePayload(jsonPayload);
    }

    public static String decodeHeader(String str) throws JwtInvalidException, CharacterCodingException {
        byte[] bArrStrictUrlSafeDecode = strictUrlSafeDecode(str);
        validateUtf8(bArrStrictUrlSafeDecode);
        return new String(bArrStrictUrlSafeDecode, Util.UTF_8);
    }

    public static String decodePayload(String str) throws JwtInvalidException, CharacterCodingException {
        byte[] bArrStrictUrlSafeDecode = strictUrlSafeDecode(str);
        validateUtf8(bArrStrictUrlSafeDecode);
        return new String(bArrStrictUrlSafeDecode, Util.UTF_8);
    }

    public static byte[] decodeSignature(String str) {
        return strictUrlSafeDecode(str);
    }

    public static String encodePayload(String str) {
        return Base64.urlSafeEncode(str.getBytes(Util.UTF_8));
    }

    public static String encodeSignature(byte[] bArr) {
        return Base64.urlSafeEncode(bArr);
    }

    public static Optional<Integer> getKeyId(String str) {
        byte[] bArrUrlSafeDecode = Base64.urlSafeDecode(str);
        return bArrUrlSafeDecode.length != 4 ? Optional.empty() : Optional.of(Integer.valueOf(ByteBuffer.wrap(bArrUrlSafeDecode).getInt()));
    }

    public static Optional<String> getKid(int i12, OutputPrefixType outputPrefixType) throws JwtInvalidException {
        if (outputPrefixType == OutputPrefixType.RAW) {
            return Optional.empty();
        }
        if (outputPrefixType == OutputPrefixType.TINK) {
            return Optional.of(Base64.urlSafeEncode(ByteBuffer.allocate(4).putInt(i12).array()));
        }
        throw new JwtInvalidException("unsupported output prefix type");
    }

    private static String getStringHeader(k kVar, String str) throws JwtInvalidException {
        if (!kVar.f362194b.containsKey(str)) {
            throw new JwtInvalidException(c.k("header ", str, " does not exist"));
        }
        i iVarD = kVar.D(str);
        iVarD.getClass();
        if ((iVarD instanceof m) && (kVar.D(str).j().f362195b instanceof String)) {
            return kVar.D(str).s();
        }
        throw new JwtInvalidException(c.k("header ", str, " is not a string"));
    }

    public static Optional<String> getTypeHeader(k kVar) {
        return kVar.f362194b.containsKey("typ") ? Optional.of(getStringHeader(kVar, "typ")) : Optional.empty();
    }

    public static boolean isValidUrlsafeBase64Char(char c12) {
        return (c12 >= 'a' && c12 <= 'z') || (c12 >= 'A' && c12 <= 'Z') || ((c12 >= '0' && c12 <= '9') || c12 == '-' || c12 == '_');
    }

    public static Parts splitSignedCompact(String str) throws JwtInvalidException {
        validateASCII(str);
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrDecodeSignature = decodeSignature(str.substring(iLastIndexOf + 1));
        int iIndexOf = strSubstring.indexOf(46);
        if (iIndexOf < 0) {
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String strSubstring3 = strSubstring.substring(iIndexOf + 1);
        if (strSubstring3.indexOf(46) <= 0) {
            return new Parts(strSubstring, bArrDecodeSignature, decodeHeader(strSubstring2), decodePayload(strSubstring3));
        }
        throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
    }

    public static byte[] strictUrlSafeDecode(String str) throws JwtInvalidException {
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (!isValidUrlsafeBase64Char(str.charAt(i12))) {
                throw new JwtInvalidException("invalid encoding");
            }
        }
        try {
            return Base64.urlSafeDecode(str);
        } catch (IllegalArgumentException e12) {
            throw new JwtInvalidException("invalid encoding: " + e12);
        }
    }

    public static void validateASCII(String str) throws JwtInvalidException {
        for (int i12 = 0; i12 < str.length(); i12++) {
            if ((str.charAt(i12) & 128) > 0) {
                throw new JwtInvalidException("Non ascii character");
            }
        }
    }

    private static void validateAlgorithm(String str) throws InvalidAlgorithmParameterException {
        str.getClass();
        switch (str) {
            case "ES256":
            case "ES384":
            case "ES512":
            case "HS256":
            case "HS384":
            case "HS512":
            case "PS256":
            case "PS384":
            case "PS512":
            case "RS256":
            case "RS384":
            case "RS512":
                return;
            default:
                throw new InvalidAlgorithmParameterException("invalid algorithm: ".concat(str));
        }
    }

    public static void validateHeader(String str, Optional<String> optional, Optional<String> optional2, k kVar) throws JwtInvalidException, InvalidAlgorithmParameterException {
        validateAlgorithm(str);
        String stringHeader = getStringHeader(kVar, "alg");
        if (!stringHeader.equals(str)) {
            throw new InvalidAlgorithmParameterException(e.n("invalid algorithm; expected ", str, ", got ", stringHeader));
        }
        if (kVar.f362194b.containsKey("crit")) {
            throw new JwtInvalidException("all tokens with crit headers are rejected");
        }
        if (optional.isPresent() && optional2.isPresent()) {
            throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
        }
        boolean zContainsKey = kVar.f362194b.containsKey("kid");
        if (optional.isPresent()) {
            if (!zContainsKey) {
                throw new JwtInvalidException("missing kid in header");
            }
            validateKidInHeader(optional.get(), kVar);
        }
        if (optional2.isPresent() && zContainsKey) {
            validateKidInHeader(optional2.get(), kVar);
        }
    }

    private static void validateKidInHeader(String str, k kVar) throws JwtInvalidException {
        if (!getStringHeader(kVar, "kid").equals(str)) {
            throw new JwtInvalidException("invalid kid in header");
        }
    }

    public static void validateUtf8(byte[] bArr) throws JwtInvalidException, CharacterCodingException {
        try {
            Util.UTF_8.newDecoder().decode(ByteBuffer.wrap(bArr));
        } catch (CharacterCodingException e12) {
            throw new JwtInvalidException(e12.getMessage());
        }
    }
}
