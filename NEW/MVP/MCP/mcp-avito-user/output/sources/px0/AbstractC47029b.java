package pX0;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.j;
import com.fasterxml.jackson.core.util.c;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.core.util.p;
import com.fasterxml.jackson.databind.util.C36500f;
import java.io.IOException;
import lX0.AbstractC43699b;

/* compiled from: NonBlockingJsonParserBase.java */
/* renamed from: pX0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC47029b extends AbstractC43699b {

    /* renamed from: R, reason: collision with root package name */
    public static final String[] f428589R = {"NaN", "Infinity", "+Infinity", "-Infinity"};

    /* renamed from: N, reason: collision with root package name */
    public int f428590N;

    /* renamed from: O, reason: collision with root package name */
    public int f428591O;

    /* renamed from: P, reason: collision with root package name */
    public int f428592P;

    /* renamed from: Q, reason: collision with root package name */
    public int f428593Q;

    @Override // lX0.AbstractC43699b
    public final void B0() {
        this.f413853q = 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final i<StreamReadCapability> I() {
        return AbstractC43699b.f413837M;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String L() {
        int i12;
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        p pVar = this.f413862z;
        if (jsonToken == jsonToken2) {
            return pVar.g();
        }
        if (jsonToken == null || (i12 = jsonToken.f341099e) == -1) {
            return null;
        }
        return i12 != 5 ? (i12 == 6 || i12 == 7 || i12 == 8) ? pVar.g() : jsonToken.f341096b : this.f413860x.f419829f;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] M() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return null;
        }
        int i12 = jsonToken.f341099e;
        if (i12 != 5) {
            return (i12 == 6 || i12 == 7 || i12 == 8) ? this.f413862z.m() : jsonToken.f341097c;
        }
        if (!this.f413839B) {
            String str = this.f413860x.f419829f;
            int length = str.length();
            char[] cArr = this.f413838A;
            if (cArr == null) {
                this.f413838A = this.f413850n.c(length);
            } else if (cArr.length < length) {
                this.f413838A = new char[length];
            }
            str.getChars(0, length, this.f413838A, 0);
            this.f413839B = true;
        }
        return this.f413838A;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int N() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return 0;
        }
        int i12 = jsonToken.f341099e;
        return i12 != 5 ? (i12 == 6 || i12 == 7 || i12 == 8) ? this.f413862z.q() : jsonToken.f341097c.length : this.f413860x.f419829f.length();
    }

    @Override // lX0.AbstractC43699b
    public final void N0() {
        super.N0();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int O() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return 0;
        }
        int i12 = jsonToken.f341099e;
        if (i12 == 6 || i12 == 7 || i12 == 8) {
            return this.f413862z.n();
        }
        return 0;
    }

    @Override // lX0.AbstractC43699b, lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final e P() {
        return new e(D0(), this.f413857u, -1L, this.f413858v, this.f413859w);
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String V() {
        JsonToken jsonToken = this.f413872d;
        return jsonToken == JsonToken.VALUE_STRING ? this.f413862z.g() : jsonToken == JsonToken.FIELD_NAME ? n() : super.W();
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String W() {
        JsonToken jsonToken = this.f413872d;
        return jsonToken == JsonToken.VALUE_STRING ? this.f413862z.g() : jsonToken == JsonToken.FIELD_NAME ? n() : super.W();
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final boolean X() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == JsonToken.VALUE_STRING) {
            p pVar = this.f413862z;
            return pVar.f341315c >= 0 || pVar.f341323k != null || pVar.f341322j == null;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f413839B;
        }
        return false;
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final byte[] i(Base64Variant base64Variant) throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING) {
            throw new JsonParseException(this, "Current token (" + jsonToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f413841D == null) {
            c cVarJ0 = J0();
            m0(L(), cVarJ0, base64Variant);
            this.f413841D = cVarJ0.g();
        }
        return this.f413841D;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int i0(Base64Variant base64Variant, C36500f c36500f) throws IOException {
        byte[] bArrI = i(base64Variant);
        c36500f.write(bArrI);
        return bArrI.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final j k() {
        return null;
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final e m() {
        return new e(D0(), this.f413854r + this.f413852p, -1L, Math.max(this.f413855s, 0), (this.f413852p - this.f413856t) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Object x() {
        if (this.f413872d == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.f413841D;
        }
        return null;
    }
}
