package com.avito.android.bxcontent.beduin_v2.favorite;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxFavoriteButtonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/favorite/g;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f109536a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f109537b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f109538c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f109539d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f109540e;

    public g(@Y61.k String str, @l String str2, @l String str3, @l String str4, boolean z12) {
        this.f109536a = str;
        this.f109537b = z12;
        this.f109538c = str2;
        this.f109539d = str3;
        this.f109540e = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f109536a, gVar.f109536a) && this.f109537b == gVar.f109537b && L.f(this.f109538c, gVar.f109538c) && L.f(this.f109539d, gVar.f109539d) && L.f(this.f109540e, gVar.f109540e);
    }

    public final int hashCode() {
        int i12 = r.i(this.f109536a.hashCode() * 31, 31, this.f109537b);
        String str = this.f109538c;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f109539d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f109540e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BxFavoriteButtonState(itemId=");
        sb2.append(this.f109536a);
        sb2.append(", isFavorite=");
        sb2.append(this.f109537b);
        sb2.append(", analyticsContext=");
        sb2.append(this.f109538c);
        sb2.append(", deeplink=");
        sb2.append(this.f109539d);
        sb2.append(", categoryId=");
        return C22026a.c(sb2, this.f109540e, ')');
    }
}
