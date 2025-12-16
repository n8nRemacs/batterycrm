package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.util.k;
import com.fasterxml.jackson.databind.util.C36500f;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: FilteringParserDelegate.java */
/* loaded from: classes3.dex */
public class b extends k {

    /* renamed from: e, reason: collision with root package name */
    public JsonToken f341135e;

    /* renamed from: f, reason: collision with root package name */
    public mX0.b f341136f;

    /* renamed from: g, reason: collision with root package name */
    public mX0.b f341137g;

    /* renamed from: h, reason: collision with root package name */
    public TokenFilter f341138h;

    /* renamed from: i, reason: collision with root package name */
    public int f341139i;

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final long A() {
        return this.f341306d.A();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final JsonParser.NumberType B() {
        return this.f341306d.B();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final Number D() {
        return this.f341306d.D();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final g H() {
        mX0.b bVar = this.f341137g;
        return bVar != null ? bVar : this.f341136f;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final short J() {
        return this.f341306d.J();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final String L() {
        return this.f341135e == JsonToken.FIELD_NAME ? d() : this.f341306d.L();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final char[] M() {
        return this.f341135e == JsonToken.FIELD_NAME ? d().toCharArray() : this.f341306d.M();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final int N() {
        return this.f341135e == JsonToken.FIELD_NAME ? d().length() : this.f341306d.N();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final int O() {
        if (this.f341135e == JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.f341306d.O();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final e P() {
        return this.f341306d.P();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final int R() {
        return this.f341306d.R();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final int S() {
        return this.f341306d.S();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final long T() {
        return this.f341306d.T();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final long U() {
        return this.f341306d.U();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final String V() {
        return this.f341135e == JsonToken.FIELD_NAME ? d() : this.f341306d.V();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final String W() {
        return this.f341135e == JsonToken.FIELD_NAME ? d() : this.f341306d.W();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final boolean X() {
        if (this.f341135e == JsonToken.FIELD_NAME) {
            return false;
        }
        return this.f341306d.X();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final boolean Y(JsonToken jsonToken) {
        return this.f341135e == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final boolean Z() {
        JsonToken jsonToken = this.f341135e;
        return jsonToken != null && jsonToken.f341099e == 5;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final boolean b0() {
        return this.f341135e == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final void c() {
        if (this.f341135e != null) {
            this.f341135e = null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final boolean c0() {
        return this.f341135e == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final String d() {
        mX0.b bVar = this.f341137g;
        if (bVar == null) {
            bVar = this.f341136f;
        }
        JsonToken jsonToken = this.f341135e;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return bVar.f414555e;
        }
        mX0.b bVar2 = bVar.f414553c;
        if (bVar2 == null) {
            return null;
        }
        return bVar2.f414555e;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final JsonToken f() {
        return this.f341135e;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final int g() {
        JsonToken jsonToken = this.f341135e;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.f341099e;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.core.JsonToken g0() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.filter.b.g0():com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final BigInteger h() {
        return this.f341306d.h();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final JsonToken h0() throws JsonParseException {
        JsonToken jsonTokenG0 = g0();
        return jsonTokenG0 == JsonToken.FIELD_NAME ? g0() : jsonTokenG0;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final byte[] i(Base64Variant base64Variant) {
        return this.f341306d.i(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final int i0(Base64Variant base64Variant, C36500f c36500f) {
        return this.f341306d.i0(base64Variant, c36500f);
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final byte j() {
        return this.f341306d.j();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final JsonParser l0() throws JsonParseException {
        JsonToken jsonToken = this.f341135e;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i12 = 1;
        while (true) {
            JsonToken jsonTokenG0 = g0();
            if (jsonTokenG0 == null) {
                return this;
            }
            if (jsonTokenG0.f341100f) {
                i12++;
            } else if (jsonTokenG0.f341101g && i12 - 1 == 0) {
                return this;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final e m() {
        return this.f341306d.m();
    }

    public final JsonToken m0(mX0.b bVar) throws JsonParseException {
        this.f341137g = bVar;
        JsonToken jsonTokenM = bVar.m();
        if (jsonTokenM != null) {
            return jsonTokenM;
        }
        while (bVar != this.f341136f) {
            mX0.b bVar2 = this.f341137g;
            mX0.b bVar3 = bVar2.f414553c;
            if (bVar3 == bVar) {
                bVar = bVar2;
            } else {
                while (true) {
                    if (bVar3 == null) {
                        bVar = null;
                        break;
                    }
                    mX0.b bVar4 = bVar3.f414553c;
                    if (bVar4 == bVar) {
                        bVar = bVar3;
                        break;
                    }
                    bVar3 = bVar4;
                }
            }
            this.f341137g = bVar;
            if (bVar == null) {
                throw new JsonParseException(this, "Unexpected problem: chain of filtered context broken");
            }
            JsonToken jsonTokenM2 = bVar.m();
            if (jsonTokenM2 != null) {
                return jsonTokenM2;
            }
        }
        throw new JsonParseException(this, "Internal error: failed to locate expected buffered tokens");
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final String n() {
        mX0.b bVar = this.f341137g;
        if (bVar == null) {
            bVar = this.f341136f;
        }
        JsonToken jsonToken = this.f341135e;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return bVar.f414555e;
        }
        mX0.b bVar2 = bVar.f414553c;
        if (bVar2 == null) {
            return null;
        }
        return bVar2.f414555e;
    }

    public final JsonToken n0(mX0.b bVar) {
        while (true) {
            JsonToken jsonTokenG0 = this.f341306d.g0();
            if (jsonTokenG0 == null) {
                return jsonTokenG0;
            }
            boolean z12 = false;
            int i12 = jsonTokenG0.f341099e;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        TokenFilter tokenFilterJ = this.f341136f.j(this.f341138h);
                        if (tokenFilterJ == null) {
                            this.f341306d.l0();
                        } else {
                            TokenFilter tokenFilter = TokenFilter.f341131a;
                            if (tokenFilterJ != tokenFilter) {
                                tokenFilterJ = tokenFilterJ.b();
                            }
                            this.f341138h = tokenFilterJ;
                            if (tokenFilterJ == tokenFilter) {
                                this.f341136f = this.f341136f.k(tokenFilterJ, true);
                                return m0(bVar);
                            }
                            this.f341136f = this.f341136f.k(tokenFilterJ, false);
                        }
                    } else if (i12 != 4) {
                        if (i12 != 5) {
                            TokenFilter tokenFilter2 = this.f341138h;
                            TokenFilter tokenFilter3 = TokenFilter.f341131a;
                            if (tokenFilter2 == tokenFilter3) {
                                return m0(bVar);
                            }
                            if (tokenFilter2 == null) {
                                continue;
                            } else {
                                TokenFilter tokenFilterJ2 = this.f341136f.j(tokenFilter2);
                                if (tokenFilterJ2 != tokenFilter3) {
                                    if (tokenFilterJ2 != null) {
                                        tokenFilterJ2.a();
                                    } else {
                                        continue;
                                    }
                                }
                                if (o0()) {
                                    return m0(bVar);
                                }
                            }
                        } else {
                            String strN = this.f341306d.n();
                            TokenFilter tokenFilterN = this.f341136f.n(strN);
                            TokenFilter tokenFilter4 = TokenFilter.f341131a;
                            if (tokenFilterN == tokenFilter4) {
                                this.f341138h = tokenFilterN;
                                return m0(bVar);
                            }
                            if (tokenFilterN == null) {
                                this.f341306d.g0();
                                this.f341306d.l0();
                            } else {
                                TokenFilter tokenFilterE = tokenFilterN.e();
                                if (tokenFilterE == null) {
                                    this.f341306d.g0();
                                    this.f341306d.l0();
                                } else {
                                    this.f341138h = tokenFilterE;
                                    if (tokenFilterE != tokenFilter4) {
                                        continue;
                                    } else {
                                        if (o0()) {
                                            return m0(bVar);
                                        }
                                        this.f341138h = this.f341136f.n(strN);
                                    }
                                }
                            }
                        }
                    }
                }
                mX0.b bVar2 = this.f341136f;
                if (bVar2.f414556f != null) {
                    TokenFilter tokenFilter5 = TokenFilter.f341131a;
                }
                if (bVar2 == bVar && bVar2.f414557g) {
                    z12 = true;
                }
                mX0.b bVar3 = bVar2.f414553c;
                this.f341136f = bVar3;
                this.f341138h = bVar3.f414556f;
                if (z12) {
                    return jsonTokenG0;
                }
            } else {
                TokenFilter tokenFilter6 = this.f341138h;
                TokenFilter tokenFilter7 = TokenFilter.f341131a;
                if (tokenFilter6 == tokenFilter7) {
                    this.f341136f = this.f341136f.l(tokenFilter6, true);
                    return jsonTokenG0;
                }
                if (tokenFilter6 == null) {
                    this.f341306d.l0();
                } else {
                    TokenFilter tokenFilterJ3 = this.f341136f.j(tokenFilter6);
                    if (tokenFilterJ3 == null) {
                        this.f341306d.l0();
                    } else {
                        if (tokenFilterJ3 != tokenFilter7) {
                            tokenFilterJ3 = tokenFilterJ3.c();
                        }
                        this.f341138h = tokenFilterJ3;
                        if (tokenFilterJ3 == tokenFilter7) {
                            this.f341136f = this.f341136f.l(tokenFilterJ3, true);
                            return m0(bVar);
                        }
                        this.f341136f = this.f341136f.l(tokenFilterJ3, false);
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final JsonToken o() {
        return this.f341135e;
    }

    public final boolean o0() {
        int i12 = this.f341139i;
        if (i12 != 0) {
            return false;
        }
        this.f341139i = i12 + 1;
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public final int p() {
        return g();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final BigDecimal q() {
        return this.f341306d.q();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final double u() {
        return this.f341306d.u();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final Object x() {
        return this.f341306d.x();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final float y() {
        return this.f341306d.y();
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final int z() {
        return this.f341306d.z();
    }
}
