package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.util.C36500f;
import java.math.BigDecimal;
import java.math.BigInteger;
import lX0.AbstractC43700c;

/* compiled from: TreeTraversingParser.java */
/* loaded from: classes4.dex */
public class x extends AbstractC43700c {

    /* renamed from: n, reason: collision with root package name */
    public p f342220n;

    /* compiled from: TreeTraversingParser.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342221a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f342221a = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342221a[JsonToken.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342221a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342221a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342221a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f342221a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f342221a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f342221a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f342221a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long A() throws JsonParseException {
        B0();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonParser.NumberType B() throws JsonParseException {
        B0();
        throw null;
    }

    public final com.fasterxml.jackson.databind.j B0() throws JsonParseException {
        throw new JsonParseException(this, "Current token (" + ((Object) null) + ") not numeric, cannot use numeric value accessors");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number D() throws JsonParseException {
        B0();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.g H() {
        return this.f342220n;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.util.i<StreamReadCapability> I() {
        return JsonParser.f341054c;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String L() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return null;
        }
        switch (jsonToken.ordinal()) {
            case 5:
                return this.f342220n.f342207d;
            case 6:
            default:
                return this.f413872d.f341096b;
            case 7:
                throw null;
            case 8:
            case 9:
                throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] M() {
        return L().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int N() {
        return L().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int O() {
        return 0;
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.e P() {
        return com.fasterxml.jackson.core.e.f341122h;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean X() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean d0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.core.JsonToken g0() {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.node.p r0 = r2.f342220n
            com.fasterxml.jackson.core.JsonToken r0 = r0.i()
            r2.f413872d = r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L2d
            r1 = 2
            if (r0 == r1) goto L26
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L26
            goto L35
        L1d:
            com.fasterxml.jackson.databind.node.p r0 = r2.f342220n
            com.fasterxml.jackson.databind.node.p$a r0 = r0.j()
            r2.f342220n = r0
            goto L35
        L26:
            com.fasterxml.jackson.databind.node.p r0 = r2.f342220n
            com.fasterxml.jackson.databind.node.p r0 = r0.f342206c
            r2.f342220n = r0
            goto L35
        L2d:
            com.fasterxml.jackson.databind.node.p r0 = r2.f342220n
            com.fasterxml.jackson.databind.node.p$b r0 = r0.k()
            r2.f342220n = r0
        L35:
            com.fasterxml.jackson.core.JsonToken r0 = r2.f413872d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.x.g0():com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigInteger h() throws JsonParseException {
        B0();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final byte[] i(Base64Variant base64Variant) {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int i0(Base64Variant base64Variant, C36500f c36500f) {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.j k() {
        return null;
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final JsonParser l0() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == JsonToken.START_OBJECT) {
            this.f342220n = this.f342220n.f342206c;
            this.f413872d = JsonToken.END_OBJECT;
        } else if (jsonToken == JsonToken.START_ARRAY) {
            this.f342220n = this.f342220n.f342206c;
            this.f413872d = JsonToken.END_ARRAY;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.e m() {
        return com.fasterxml.jackson.core.e.f341122h;
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String n() {
        p pVar = this.f342220n;
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            pVar = pVar.f342206c;
        }
        if (pVar == null) {
            return null;
        }
        return pVar.f342207d;
    }

    @Override // lX0.AbstractC43700c
    public final void o0() {
        com.fasterxml.jackson.core.util.r.c();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigDecimal q() throws JsonParseException {
        B0();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final double u() throws JsonParseException {
        B0();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Object x() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final float y() throws JsonParseException {
        B0();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int z() throws JsonParseException {
        B0();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
