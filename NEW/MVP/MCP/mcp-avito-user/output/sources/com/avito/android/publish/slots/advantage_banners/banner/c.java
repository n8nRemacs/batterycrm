package com.avito.android.publish.slots.advantage_banners.banner;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvantageBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/advantage_banners/banner/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f242989b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f242990c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f242991d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f242992e;

    public c(@k String str, @l String str2, @l String str3, @k String str4) {
        this.f242989b = str;
        this.f242990c = str2;
        this.f242991d = str3;
        this.f242992e = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f242989b, cVar.f242989b) && L.f(this.f242990c, cVar.f242990c) && L.f(this.f242991d, cVar.f242991d) && L.f(this.f242992e, cVar.f242992e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return getF228671b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF228671b() {
        return this.f242989b;
    }

    public final int hashCode() {
        int iHashCode = this.f242989b.hashCode() * 31;
        String str = this.f242990c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f242991d;
        return this.f242992e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvantageBannerItem(stringId=");
        sb2.append(this.f242989b);
        sb2.append(", image=");
        sb2.append(this.f242990c);
        sb2.append(", title=");
        sb2.append(this.f242991d);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f242992e, ')');
    }
}
