package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.util.j;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: FilteringGeneratorDelegate.java */
/* loaded from: classes3.dex */
public class a extends j {

    /* renamed from: c, reason: collision with root package name */
    public mX0.b f341133c;

    /* renamed from: d, reason: collision with root package name */
    public TokenFilter f341134d;

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void A() {
        mX0.b bVar = this.f341133c;
        if (bVar.f414557g) {
            throw null;
        }
        if (bVar.f414556f != null) {
            TokenFilter tokenFilter = TokenFilter.f341131a;
        }
        mX0.b bVar2 = bVar.f414553c;
        this.f341133c = bVar2;
        if (bVar2 != null) {
            this.f341134d = bVar2.f414556f;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void B() {
        mX0.b bVar = this.f341133c;
        if (bVar.f414557g) {
            throw null;
        }
        if (bVar.f414556f != null) {
            TokenFilter tokenFilter = TokenFilter.f341131a;
        }
        mX0.b bVar2 = bVar.f414553c;
        this.f341133c = bVar2;
        if (bVar2 != null) {
            this.f341134d = bVar2.f414556f;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void D(long j12) {
        G(Long.toString(j12));
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void F(l lVar) {
        TokenFilter tokenFilterN = this.f341133c.n(lVar.getValue());
        if (tokenFilterN == null) {
            this.f341134d = null;
            return;
        }
        TokenFilter tokenFilter = TokenFilter.f341131a;
        if (tokenFilterN == tokenFilter) {
            this.f341134d = tokenFilterN;
            throw null;
        }
        TokenFilter tokenFilterE = tokenFilterN.e();
        this.f341134d = tokenFilterE;
        if (tokenFilterE == tokenFilter) {
            mX0.b bVar = this.f341133c;
            bVar.f414556f = null;
            mX0.b bVar2 = bVar.f414553c;
            for (mX0.b bVar3 = bVar2; bVar3 != null; bVar3 = bVar3.f414553c) {
                bVar2.f414556f = null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void G(String str) {
        TokenFilter tokenFilterN = this.f341133c.n(str);
        if (tokenFilterN == null) {
            this.f341134d = null;
            return;
        }
        TokenFilter tokenFilter = TokenFilter.f341131a;
        if (tokenFilterN == tokenFilter) {
            this.f341134d = tokenFilterN;
            throw null;
        }
        TokenFilter tokenFilterE = tokenFilterN.e();
        this.f341134d = tokenFilterE;
        if (tokenFilterE == tokenFilter) {
            mX0.b bVar = this.f341133c;
            bVar.f414556f = null;
            mX0.b bVar2 = bVar.f414553c;
            for (mX0.b bVar3 = bVar2; bVar3 != null; bVar3 = bVar3.f414553c) {
                bVar2.f414556f = null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void H() {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void I(double d12) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void J(float f12) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void L(int i12) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void M(long j12) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void N(String str) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void O(BigDecimal bigDecimal) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void P(BigInteger bigInteger) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void Q(short s5) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void S(Object obj) {
        if (this.f341134d != null) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void T() {
        if (this.f341134d != null) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void U(char c12) {
        if (n0()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void V(int i12, char[] cArr) {
        if (n0()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void W(l lVar) {
        if (n0()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void X(String str) {
        if (n0()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void Z(String str) {
        if (n0()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void a0() {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            this.f341133c = this.f341133c.k(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter == tokenFilter2) {
            this.f341133c = this.f341133c.k(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
        this.f341134d = tokenFilterJ;
        if (tokenFilterJ == null) {
            this.f341133c = this.f341133c.k(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f341134d = tokenFilterJ.b();
        }
        TokenFilter tokenFilter3 = this.f341134d;
        if (tokenFilter3 != tokenFilter2) {
            this.f341133c = this.f341133c.k(tokenFilter3, false);
        } else {
            m0();
            this.f341133c = this.f341133c.k(this.f341134d, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void b0(int i12, Object obj) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            this.f341133c = this.f341133c.k(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter == tokenFilter2) {
            this.f341133c = this.f341133c.k(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
        this.f341134d = tokenFilterJ;
        if (tokenFilterJ == null) {
            this.f341133c = this.f341133c.k(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f341134d = tokenFilterJ.b();
        }
        TokenFilter tokenFilter3 = this.f341134d;
        if (tokenFilter3 != tokenFilter2) {
            this.f341133c = this.f341133c.k(tokenFilter3, false);
        } else {
            m0();
            this.f341133c = this.f341133c.k(this.f341134d, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void c0(Object obj) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            this.f341133c = this.f341133c.k(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter == tokenFilter2) {
            this.f341133c = this.f341133c.k(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
        this.f341134d = tokenFilterJ;
        if (tokenFilterJ == null) {
            this.f341133c = this.f341133c.k(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f341134d = tokenFilterJ.b();
        }
        TokenFilter tokenFilter3 = this.f341134d;
        if (tokenFilter3 != tokenFilter2) {
            this.f341133c = this.f341133c.k(tokenFilter3, false);
        } else {
            m0();
            this.f341133c = this.f341133c.k(this.f341134d, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void d0() {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            this.f341133c = this.f341133c.k(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter == tokenFilter2) {
            this.f341133c = this.f341133c.k(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
        this.f341134d = tokenFilterJ;
        if (tokenFilterJ == null) {
            this.f341133c = this.f341133c.k(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f341134d = tokenFilterJ.b();
        }
        TokenFilter tokenFilter3 = this.f341134d;
        if (tokenFilter3 != tokenFilter2) {
            this.f341133c = this.f341133c.k(tokenFilter3, false);
        } else {
            m0();
            this.f341133c = this.f341133c.k(this.f341134d, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void e0() {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            this.f341133c = this.f341133c.l(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter == tokenFilter2) {
            this.f341133c = this.f341133c.l(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
        if (tokenFilterJ == null) {
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            tokenFilterJ = tokenFilterJ.c();
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f341133c = this.f341133c.l(tokenFilterJ, false);
        } else {
            m0();
            this.f341133c = this.f341133c.l(tokenFilterJ, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void f0(Object obj) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            this.f341133c = this.f341133c.l(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter == tokenFilter2) {
            this.f341133c = this.f341133c.l(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
        if (tokenFilterJ == null) {
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            tokenFilterJ = tokenFilterJ.c();
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f341133c = this.f341133c.l(tokenFilterJ, false);
        } else {
            m0();
            this.f341133c = this.f341133c.l(tokenFilterJ, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final g g() {
        return this.f341133c;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void g0(Object obj) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            this.f341133c = this.f341133c.l(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter == tokenFilter2) {
            this.f341133c = this.f341133c.l(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
        if (tokenFilterJ == null) {
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            tokenFilterJ = tokenFilterJ.c();
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f341133c = this.f341133c.l(tokenFilterJ, false);
        } else {
            m0();
            this.f341133c = this.f341133c.l(tokenFilterJ, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void h0(l lVar) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                lVar.getClass();
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void i0(String str) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void j0(char[] cArr, int i12, int i13) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            new String(cArr, i12, i13);
            TokenFilter tokenFilterJ = this.f341133c.j(this.f341134d);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void l0(Object obj) {
        if (this.f341134d != null) {
            throw null;
        }
    }

    public final void m0() {
        mX0.b bVar = this.f341133c;
        bVar.f414556f = null;
        mX0.b bVar2 = bVar.f414553c;
        for (mX0.b bVar3 = bVar2; bVar3 != null; bVar3 = bVar3.f414553c) {
            bVar2.f414556f = null;
        }
    }

    public final boolean n0() {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return false;
        }
        if (tokenFilter == TokenFilter.f341131a) {
            return true;
        }
        tokenFilter.a();
        m0();
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final int u(Base64Variant base64Variant, InputStream inputStream, int i12) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return -1;
        }
        if (tokenFilter != TokenFilter.f341131a) {
            tokenFilter.a();
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i12, int i13) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        if (tokenFilter != TokenFilter.f341131a) {
            tokenFilter.a();
            m0();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.j, com.fasterxml.jackson.core.JsonGenerator
    public final void y(boolean z12) {
        TokenFilter tokenFilter = this.f341134d;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f341131a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.f341133c.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                tokenFilterJ.a();
            }
            m0();
        }
        throw null;
    }
}
