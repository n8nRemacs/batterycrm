package mX0;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.g;

/* compiled from: TokenFilterContext.java */
/* loaded from: classes3.dex */
public class b extends g {

    /* renamed from: c, reason: collision with root package name */
    public final b f414553c;

    /* renamed from: d, reason: collision with root package name */
    public b f414554d;

    /* renamed from: e, reason: collision with root package name */
    public String f414555e;

    /* renamed from: f, reason: collision with root package name */
    public TokenFilter f414556f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f414557g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f414558h;

    public b(int i12, b bVar, TokenFilter tokenFilter, boolean z12) {
        this.f341141a = i12;
        this.f414553c = bVar;
        this.f414556f = tokenFilter;
        this.f341142b = -1;
        this.f414557g = z12;
        this.f414558h = false;
    }

    @Override // com.fasterxml.jackson.core.g
    public final String a() {
        return this.f414555e;
    }

    @Override // com.fasterxml.jackson.core.g
    public final Object b() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.g
    public final g c() {
        return this.f414553c;
    }

    public final void i(StringBuilder sb2) {
        b bVar = this.f414553c;
        if (bVar != null) {
            bVar.i(sb2);
        }
        int i12 = this.f341141a;
        if (i12 == 2) {
            sb2.append('{');
            if (this.f414555e != null) {
                sb2.append('\"');
                sb2.append(this.f414555e);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append('}');
            return;
        }
        if (i12 != 1) {
            sb2.append("/");
            return;
        }
        sb2.append('[');
        int i13 = this.f341142b;
        if (i13 < 0) {
            i13 = 0;
        }
        sb2.append(i13);
        sb2.append(']');
    }

    public final TokenFilter j(TokenFilter tokenFilter) {
        int i12 = this.f341141a;
        if (i12 == 2) {
            return tokenFilter;
        }
        this.f341142b++;
        if (i12 == 1) {
            return tokenFilter.d();
        }
        tokenFilter.getClass();
        return tokenFilter;
    }

    public final b k(TokenFilter tokenFilter, boolean z12) {
        b bVar = this.f414554d;
        if (bVar == null) {
            b bVar2 = new b(1, this, tokenFilter, z12);
            this.f414554d = bVar2;
            return bVar2;
        }
        bVar.f341141a = 1;
        bVar.f414556f = tokenFilter;
        bVar.f341142b = -1;
        bVar.f414555e = null;
        bVar.f414557g = z12;
        bVar.f414558h = false;
        return bVar;
    }

    public final b l(TokenFilter tokenFilter, boolean z12) {
        b bVar = this.f414554d;
        if (bVar == null) {
            b bVar2 = new b(2, this, tokenFilter, z12);
            this.f414554d = bVar2;
            return bVar2;
        }
        bVar.f341141a = 2;
        bVar.f414556f = tokenFilter;
        bVar.f341142b = -1;
        bVar.f414555e = null;
        bVar.f414557g = z12;
        bVar.f414558h = false;
        return bVar;
    }

    public final JsonToken m() {
        if (!this.f414557g) {
            this.f414557g = true;
            return this.f341141a == 2 ? JsonToken.START_OBJECT : JsonToken.START_ARRAY;
        }
        if (!this.f414558h || this.f341141a != 2) {
            return null;
        }
        this.f414558h = false;
        return JsonToken.FIELD_NAME;
    }

    public final TokenFilter n(String str) {
        this.f414555e = str;
        this.f414558h = true;
        return this.f414556f;
    }

    @Override // com.fasterxml.jackson.core.g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        i(sb2);
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.core.g
    public final void g(Object obj) {
    }
}
