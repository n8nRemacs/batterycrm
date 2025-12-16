package com.avito.beduin.v2.avito.component.gradient.content;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GradientContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/gradient/content/a;", "Lcom/avito/beduin/v2/avito/component/gradient/content/b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a extends b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f334361a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f334362b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f334363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, int i12, C42822w c42822w) {
        super(null);
        str = (i12 & 1) != 0 ? "token" : str;
        this.f334361a = str;
        this.f334362b = str2;
        this.f334363c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f334361a, aVar.f334361a) && L.f(this.f334362b, aVar.f334362b) && L.f(this.f334363c, aVar.f334363c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f334361a.hashCode() * 31, 31, this.f334362b);
        String str = this.f334363c;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoLocalContent(mode=");
        sb2.append(this.f334361a);
        sb2.append(", name=");
        sb2.append(this.f334362b);
        sb2.append(", themeName=");
        return C22026a.c(sb2, this.f334363c, ')');
    }
}
