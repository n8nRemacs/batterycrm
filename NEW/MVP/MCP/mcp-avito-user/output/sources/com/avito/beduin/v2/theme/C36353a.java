package com.avito.beduin.v2.theme;

import kotlin.Metadata;

/* compiled from: StyleProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/theme/a;", "Lcom/avito/beduin/v2/theme/p;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.theme.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C36353a implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f338350a;

    public C36353a(@Y61.k A a12) {
        this.f338350a = a12;
    }

    @Y61.l
    public final Object a(@Y61.k String str) {
        return this.f338350a.a("re23").a(str);
    }

    @Y61.k
    public final Object b(@Y61.k String str, @Y61.l String str2) {
        if (str2 == null) {
            str2 = "re23";
        }
        return this.f338350a.a(str2).b(str);
    }

    @Y61.k
    public final Object c(@Y61.k String str, @Y61.l String str2) {
        if (str2 == null) {
            str2 = "re23";
        }
        return this.f338350a.a(str2).c(str);
    }

    @Y61.k
    public final Object d(@Y61.k String str, @Y61.l String str2) {
        if (str2 == null) {
            str2 = "re23";
        }
        return this.f338350a.a(str2).d(str);
    }

    @Y61.k
    public final c e(@Y61.k l lVar) {
        String f335452a;
        String strB;
        m mVarA = lVar.a();
        if (mVarA == null || (f335452a = mVarA.getF333813a()) == null) {
            f335452a = "re23";
        }
        if (mVarA == null || (strB = mVarA.getF333814b()) == null) {
            strB = lVar.getF338359b();
        }
        return this.f338350a.a(f335452a).e(strB);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36353a) && this.f338350a.equals(((C36353a) obj).f338350a);
    }

    public final int hashCode() {
        return this.f338350a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AppStyleProvider(themes=" + this.f338350a + ')';
    }
}
