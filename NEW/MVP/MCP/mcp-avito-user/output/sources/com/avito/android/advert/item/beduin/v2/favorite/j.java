package com.avito.android.advert.item.beduin.v2.favorite;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteButtonState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/favorite/j;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f73338a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f73340c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f73341d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f73342e;

    public j(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
        this.f73338a = str;
        this.f73339b = z12;
        this.f73340c = str2;
        this.f73341d = str3;
        this.f73342e = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f73338a, jVar.f73338a) && this.f73339b == jVar.f73339b && L.f(this.f73340c, jVar.f73340c) && L.f(this.f73341d, jVar.f73341d) && L.f(this.f73342e, jVar.f73342e);
    }

    public final int hashCode() {
        int i12 = r.i(this.f73338a.hashCode() * 31, 31, this.f73339b);
        String str = this.f73340c;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73341d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73342e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteButtonState(itemId=");
        sb2.append(this.f73338a);
        sb2.append(", isFavorite=");
        sb2.append(this.f73339b);
        sb2.append(", analyticsContext=");
        sb2.append(this.f73340c);
        sb2.append(", deeplink=");
        sb2.append(this.f73341d);
        sb2.append(", categoryId=");
        return C22026a.c(sb2, this.f73342e, ')');
    }
}
