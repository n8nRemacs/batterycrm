package com.avito.beduin.v2.theme;

import kotlin.Metadata;

/* compiled from: StyleProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/theme/k;", "Lcom/avito/beduin/v2/theme/p;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36353a f338363a;

    public k(@Y61.k C36353a c36353a) {
        this.f338363a = c36353a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        kVar.getClass();
        return this.f338363a.equals(kVar.f338363a);
    }

    public final int hashCode() {
        return this.f338363a.hashCode() + 108339916;
    }

    @Y61.k
    public final String toString() {
        return "ScreenStyleProvider(defThemeName=re23, styleProvider=" + this.f338363a + ')';
    }
}
