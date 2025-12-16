package Wa;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionScreenData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWa/a;", "", "_avito_advert-collection-sharing-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wa.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C15735a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f17949a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f17950b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f17951c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f17952d;

    public C15735a(@l String str, @l String str2, @l Boolean bool, @l String str3) {
        this.f17949a = str;
        this.f17950b = str2;
        this.f17951c = bool;
        this.f17952d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15735a)) {
            return false;
        }
        C15735a c15735a = (C15735a) obj;
        return L.f(this.f17949a, c15735a.f17949a) && L.f(this.f17950b, c15735a.f17950b) && L.f(this.f17951c, c15735a.f17951c) && L.f(this.f17952d, c15735a.f17952d);
    }

    public final int hashCode() {
        String str = this.f17949a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17950b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f17951c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f17952d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCollectionScreenData(userId=");
        sb2.append(this.f17949a);
        sb2.append(", deviceId=");
        sb2.append(this.f17950b);
        sb2.append(", isOwner=");
        sb2.append(this.f17951c);
        sb2.append(", collectionId=");
        return C22026a.c(sb2, this.f17952d, ')');
    }
}
