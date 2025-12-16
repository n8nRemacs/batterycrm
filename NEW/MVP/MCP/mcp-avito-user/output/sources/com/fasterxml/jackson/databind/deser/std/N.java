package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: UUIDDeserializer.java */
/* loaded from: classes4.dex */
public class N extends p<UUID> {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f341761f;
    private static final long serialVersionUID = 1;

    static {
        int[] iArr = new int[127];
        f341761f = iArr;
        Arrays.fill(iArr, -1);
        for (int i12 = 0; i12 < 10; i12++) {
            f341761f[i12 + 48] = i12;
        }
        for (int i13 = 0; i13 < 6; i13++) {
            int[] iArr2 = f341761f;
            int i14 = i13 + 10;
            iArr2[i13 + 97] = i14;
            iArr2[i13 + 65] = i14;
        }
    }

    public N() {
        super(UUID.class);
    }

    public static int x0(int i12, byte[] bArr) {
        return (bArr[i12 + 3] & 255) | (bArr[i12] << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
    }

    public final int A0(String str, int i12, com.fasterxml.jackson.databind.f fVar) {
        return y0(str, i12 + 2, fVar) + (y0(str, i12, fVar) << 8);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return new UUID(0L, 0L);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.p
    public final Object q0(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidFormatException {
        int length = str.length();
        Class<?> cls = this.f341716b;
        if (length != 36) {
            if (str.length() != 24) {
                fVar.I(cls, str, "UUID has to be represented by standard 36-char representation", new Object[0]);
                throw null;
            }
            Base64Variant base64Variant = com.fasterxml.jackson.core.a.f341119b;
            base64Variant.getClass();
            com.fasterxml.jackson.core.util.c cVar = new com.fasterxml.jackson.core.util.c();
            base64Variant.b(str, cVar);
            return w0(cVar.g(), fVar);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            fVar.I(cls, str, "UUID has to be represented by standard 36-char representation", new Object[0]);
            throw null;
        }
        return new UUID((z0(str, 0, fVar) << 32) + ((A0(str, 9, fVar) << 16) | A0(str, 14, fVar)), ((z0(str, 28, fVar) << 32) >>> 32) | (((A0(str, 19, fVar) << 16) | A0(str, 24, fVar)) << 32));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.p
    public final Object r0(com.fasterxml.jackson.databind.f fVar, Object obj) throws MismatchedInputException {
        if (obj instanceof byte[]) {
            return w0((byte[]) obj, fVar);
        }
        super.r0(fVar, obj);
        throw null;
    }

    public final UUID w0(byte[] bArr, com.fasterxml.jackson.databind.f fVar) throws InvalidFormatException {
        if (bArr.length == 16) {
            return new UUID((x0(0, bArr) << 32) | ((x0(4, bArr) << 32) >>> 32), (x0(8, bArr) << 32) | ((x0(12, bArr) << 32) >>> 32));
        }
        throw new InvalidFormatException(fVar.f341924g, AK.c.i(bArr.length, " bytes", new StringBuilder("Can only construct UUIDs from byte[16]; got ")), bArr);
    }

    public final int y0(String str, int i12, com.fasterxml.jackson.databind.f fVar) throws InvalidFormatException {
        int i13;
        char cCharAt = str.charAt(i12);
        char cCharAt2 = str.charAt(i12 + 1);
        int[] iArr = f341761f;
        if (cCharAt <= 127 && cCharAt2 <= 127 && (i13 = (iArr[cCharAt] << 4) | iArr[cCharAt2]) >= 0) {
            return i13;
        }
        Class<?> cls = this.f341716b;
        if (cCharAt > 127 || iArr[cCharAt] < 0) {
            throw fVar.a0(str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt), Integer.toHexString(cCharAt)), cls);
        }
        throw fVar.a0(str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt2), Integer.toHexString(cCharAt2)), cls);
    }

    public final int z0(String str, int i12, com.fasterxml.jackson.databind.f fVar) {
        return y0(str, i12 + 6, fVar) + (y0(str, i12, fVar) << 24) + (y0(str, i12 + 2, fVar) << 16) + (y0(str, i12 + 4, fVar) << 8);
    }
}
