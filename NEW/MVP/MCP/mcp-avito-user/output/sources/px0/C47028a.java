package pX0;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.p;
import com.fasterxml.jackson.core.util.r;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kX0.InterfaceC42643a;

/* compiled from: NonBlockingJsonParser.java */
/* renamed from: pX0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C47028a extends AbstractC47029b implements InterfaceC42643a {

    /* renamed from: S, reason: collision with root package name */
    public static final int f428587S;

    /* renamed from: T, reason: collision with root package name */
    public static final int f428588T;

    static {
        int i12 = JsonParser.Feature.ALLOW_TRAILING_COMMA.f341073c;
        int i13 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.f341073c;
        int i14 = JsonParser.Feature.ALLOW_MISSING_VALUES.f341073c;
        int i15 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.f341073c;
        int i16 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.f341073c;
        f428587S = JsonParser.Feature.ALLOW_COMMENTS.f341073c;
        f428588T = JsonParser.Feature.ALLOW_YAML_COMMENTS.f341073c;
        char[] cArr = com.fasterxml.jackson.core.io.b.f341144a;
        char[] cArr2 = com.fasterxml.jackson.core.io.b.f341144a;
    }

    @Override // lX0.AbstractC43699b
    public final char H0() {
        r.c();
        throw null;
    }

    public final void e1() {
        int i12 = this.f413852p;
        if (i12 >= this.f413853q) {
            return;
        }
        this.f413852p = i12 + 1;
        throw null;
    }

    public final JsonToken f1(int i12, boolean z12) {
        int i13 = this.f413852p;
        if (i13 < this.f413853q) {
            this.f413852p = i13 + 1;
            throw null;
        }
        this.f428592P = z12 ? 52 : 53;
        this.f428590N = i12;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.f413872d = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken g0() throws JsonParseException {
        p pVar = this.f413862z;
        int i12 = this.f413852p;
        int i13 = this.f413853q;
        if (i12 >= i13) {
            if (this.f413851o) {
                return null;
            }
            return JsonToken.NOT_AVAILABLE;
        }
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        if (jsonToken != jsonToken2) {
            this.f413842E = 0;
            this.f413857u = this.f413854r + i12;
            this.f413841D = null;
            this.f413852p = i12 + 1;
            throw null;
        }
        int i14 = this.f428592P;
        if (i14 == 1) {
            int i15 = this.f428590N;
            if (i12 < i13) {
                this.f413852p = i12 + 1;
                throw null;
            }
            this.f428590N = i15;
            this.f428592P = 1;
            this.f413872d = jsonToken2;
            return jsonToken2;
        }
        if (i14 == 4) {
            this.f413852p = i12 + 1;
            throw null;
        }
        if (i14 == 5) {
            this.f413852p = i12 + 1;
            throw null;
        }
        switch (i14) {
            case 7:
                int i16 = this.f428590N;
                int i17 = this.f428591O;
                if (i12 < i13) {
                    this.f413852p = i12 + 1;
                    throw null;
                }
                this.f428590N = i16;
                this.f428591O = i17;
                this.f428592P = 7;
                this.f413872d = jsonToken2;
                return jsonToken2;
            case 8:
                e1();
                this.f428592P = 8;
                return jsonToken2;
            case 9:
                int i18 = this.f428590N;
                int i19 = this.f428591O;
                if (i12 < i13) {
                    this.f413852p = i12 + 1;
                    throw null;
                }
                this.f428590N = i18;
                this.f428591O = i19;
                this.f428592P = 9;
                this.f413872d = jsonToken2;
                return jsonToken2;
            case 10:
                int i22 = this.f428590N;
                int i23 = this.f428591O;
                char[] cArr = com.fasterxml.jackson.core.io.b.f341144a;
                if (i12 < i13) {
                    throw null;
                }
                this.f428590N = i22;
                this.f428591O = i23;
                this.f428592P = 10;
                this.f413872d = jsonToken2;
                return jsonToken2;
            default:
                switch (i14) {
                    case 12:
                        this.f413852p = i12 + 1;
                        throw null;
                    case 13:
                        this.f413852p = i12 + 1;
                        throw null;
                    case 14:
                        this.f413852p = i12 + 1;
                        throw null;
                    case 15:
                        this.f413852p = i12 + 1;
                        throw null;
                    case 16:
                        return i1(this.f428590N, "null");
                    case 17:
                        return i1(this.f428590N, "true");
                    case 18:
                        return i1(this.f428590N, "false");
                    case 19:
                        int i24 = this.f428593Q;
                        int i25 = this.f428590N;
                        AbstractC47029b.f428589R[i24].getClass();
                        if (this.f413852p < this.f413853q) {
                            throw null;
                        }
                        this.f428593Q = i24;
                        this.f428590N = i25;
                        this.f428592P = 19;
                        JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                        this.f413872d = jsonToken3;
                        return jsonToken3;
                    default:
                        switch (i14) {
                            case 23:
                                this.f413852p = i12 + 1;
                                throw null;
                            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                                if (i12 < i13) {
                                    this.f413852p = i12 + 1;
                                    throw null;
                                }
                                this.f428592P = 24;
                                this.f413872d = jsonToken2;
                                return jsonToken2;
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                if (i12 < i13) {
                                    this.f413852p = i12 + 1;
                                    throw null;
                                }
                                this.f428592P = 25;
                                this.f413872d = jsonToken2;
                                return jsonToken2;
                            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                int i26 = pVar.f341321i;
                                if (i12 < i13) {
                                    throw null;
                                }
                                this.f428592P = 26;
                                pVar.f341321i = i26;
                                this.f413872d = jsonToken2;
                                return jsonToken2;
                            default:
                                switch (i14) {
                                    case 30:
                                        this.f413852p = i12 + 1;
                                        throw null;
                                    case 31:
                                        this.f413852p = i12 + 1;
                                        throw null;
                                    case 32:
                                        this.f413852p = i12 + 1;
                                        throw null;
                                    default:
                                        switch (i14) {
                                            case 40:
                                                char[] cArrK = pVar.f341320h;
                                                int i27 = pVar.f341321i;
                                                int i28 = this.f413852p;
                                                while (i28 < this.f413853q) {
                                                    if (i27 >= cArrK.length) {
                                                        cArrK = pVar.k();
                                                        i27 = 0;
                                                    }
                                                    if (i28 < Math.min(this.f413853q, (cArrK.length - i27) + i28)) {
                                                        throw null;
                                                    }
                                                }
                                                this.f413852p = i28;
                                                this.f428592P = 40;
                                                pVar.f341321i = i27;
                                                JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                                                this.f413872d = jsonToken4;
                                                return jsonToken4;
                                            case 41:
                                                e1();
                                                return jsonToken2;
                                            case 42:
                                                this.f413852p = i12 + 1;
                                                throw null;
                                            case 43:
                                                this.f413852p = i12 + 1;
                                                throw null;
                                            case 44:
                                                this.f413852p = i12 + 1;
                                                throw null;
                                            case 45:
                                                char[] cArrK2 = pVar.f341320h;
                                                int i29 = pVar.f341321i;
                                                int i32 = this.f413852p;
                                                while (i32 < this.f413853q) {
                                                    if (i29 >= cArrK2.length) {
                                                        cArrK2 = pVar.k();
                                                        i29 = 0;
                                                    }
                                                    if (i32 < Math.min(this.f413853q, (cArrK2.length - i29) + i32)) {
                                                        throw null;
                                                    }
                                                }
                                                this.f413852p = i32;
                                                this.f428592P = 45;
                                                pVar.f341321i = i29;
                                                JsonToken jsonToken5 = JsonToken.NOT_AVAILABLE;
                                                this.f413872d = jsonToken5;
                                                return jsonToken5;
                                            default:
                                                switch (i14) {
                                                    case 50:
                                                        if (i12 >= i13) {
                                                            this.f413872d = jsonToken2;
                                                            return jsonToken2;
                                                        }
                                                        this.f413852p = i12 + 1;
                                                        throw null;
                                                    case 51:
                                                        int i33 = this.f428590N;
                                                        if ((this.f341055b & f428587S) == 0) {
                                                            v0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
                                                            throw null;
                                                        }
                                                        int i34 = this.f413852p;
                                                        if (i34 < this.f413853q) {
                                                            this.f413852p = i34 + 1;
                                                            throw null;
                                                        }
                                                        this.f428590N = i33;
                                                        this.f428592P = 51;
                                                        JsonToken jsonToken6 = JsonToken.NOT_AVAILABLE;
                                                        this.f413872d = jsonToken6;
                                                        return jsonToken6;
                                                    case 52:
                                                        return f1(this.f428590N, true);
                                                    case 53:
                                                        return f1(this.f428590N, false);
                                                    case 54:
                                                        int i35 = this.f428590N;
                                                        if (i12 < i13) {
                                                            this.f413852p = i12 + 1;
                                                            throw null;
                                                        }
                                                        this.f428592P = 54;
                                                        this.f428590N = i35;
                                                        this.f413872d = jsonToken2;
                                                        return jsonToken2;
                                                    case 55:
                                                        int i36 = this.f428590N;
                                                        if ((this.f341055b & f428588T) == 0) {
                                                            v0(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
                                                            throw null;
                                                        }
                                                        int i37 = this.f413852p;
                                                        if (i37 < this.f413853q) {
                                                            this.f413852p = i37 + 1;
                                                            throw null;
                                                        }
                                                        this.f428592P = 55;
                                                        this.f428590N = i36;
                                                        JsonToken jsonToken7 = JsonToken.NOT_AVAILABLE;
                                                        this.f413872d = jsonToken7;
                                                        return jsonToken7;
                                                    default:
                                                        r.c();
                                                        throw null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final JsonToken i1(int i12, String str) {
        if (this.f413852p < this.f413853q) {
            throw null;
        }
        this.f428590N = i12;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.f413872d = jsonToken;
        return jsonToken;
    }
}
