package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.util.UUID;

/* compiled from: UUIDSerializer.java */
/* loaded from: classes4.dex */
public class U extends L<UUID> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f342355e = "0123456789abcdef".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f342356d;

    public U(Boolean bool) {
        super(UUID.class);
        this.f342356d = bool;
    }

    public static final void p(int i12, int i13, byte[] bArr) {
        bArr[i13] = (byte) (i12 >> 24);
        bArr[i13 + 1] = (byte) (i12 >> 16);
        bArr[i13 + 2] = (byte) (i12 >> 8);
        bArr[i13 + 3] = (byte) i12;
    }

    public static void q(char[] cArr, int i12, int i13) {
        char[] cArr2 = f342355e;
        cArr[i13] = cArr2[(i12 >> 12) & 15];
        cArr[i13 + 1] = cArr2[(i12 >> 8) & 15];
        cArr[i13 + 2] = cArr2[(i12 >> 4) & 15];
        cArr[i13 + 3] = cArr2[i12 & 15];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    @Override // com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r2, com.fasterxml.jackson.databind.c r3) {
        /*
            r1 = this;
            java.lang.Class<T> r0 = r1.f342353b
            com.fasterxml.jackson.annotation.JsonFormat$b r2 = com.fasterxml.jackson.databind.ser.std.M.l(r2, r3, r0)
            if (r2 == 0) goto L18
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.f340941k
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.f340948c
            if (r2 != r3) goto L11
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L19
        L11:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.f340940j
            if (r2 != r3) goto L18
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.Boolean r3 = r1.f342356d
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L27
            com.fasterxml.jackson.databind.ser.std.U r3 = new com.fasterxml.jackson.databind.ser.std.U
            r3.<init>(r2)
            return r3
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.U.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        UUID uuid = (UUID) obj;
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        UUID uuid = (UUID) obj;
        Boolean bool = this.f342356d;
        if (bool != null ? bool.booleanValue() : !(jsonGenerator instanceof com.fasterxml.jackson.databind.util.C) && jsonGenerator.c()) {
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            p((int) (mostSignificantBits >> 32), 0, bArr);
            p((int) mostSignificantBits, 4, bArr);
            p((int) (leastSignificantBits >> 32), 8, bArr);
            p((int) leastSignificantBits, 12, bArr);
            jsonGenerator.getClass();
            jsonGenerator.x(com.fasterxml.jackson.core.a.f341119b, bArr, 0, 16);
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        int i12 = (int) (mostSignificantBits2 >> 32);
        q(cArr, i12 >> 16, 0);
        q(cArr, i12, 4);
        cArr[8] = '-';
        int i13 = (int) mostSignificantBits2;
        q(cArr, i13 >>> 16, 9);
        cArr[13] = '-';
        q(cArr, i13, 14);
        cArr[18] = '-';
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        q(cArr, (int) (leastSignificantBits2 >>> 48), 19);
        cArr[23] = '-';
        q(cArr, (int) (leastSignificantBits2 >>> 32), 24);
        int i14 = (int) leastSignificantBits2;
        q(cArr, i14 >> 16, 28);
        q(cArr, i14, 32);
        jsonGenerator.j0(cArr, 0, 36);
    }

    public U() {
        this(null);
    }
}
