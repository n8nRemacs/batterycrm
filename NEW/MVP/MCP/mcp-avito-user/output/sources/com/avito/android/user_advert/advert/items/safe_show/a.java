package com.avito.android.user_advert.advert.items.safe_show;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafeShowItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_show/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f310078b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f310079c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f310080d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f310081e;

    public a(@k String str, @k String str2, @k String str3, @k String str4) {
        this.f310078b = str;
        this.f310079c = str2;
        this.f310080d = str3;
        this.f310081e = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f310078b, aVar.f310078b) && L.f(this.f310079c, aVar.f310079c) && L.f(this.f310080d, aVar.f310080d) && L.f(this.f310081e, aVar.f310081e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return getF310078b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF310078b() {
        return this.f310078b;
    }

    public final int hashCode() {
        return this.f310081e.hashCode() + H.d(H.d(this.f310078b.hashCode() * 31, 31, this.f310079c), 31, this.f310080d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SafeShowItem(stringId=");
        sb2.append(this.f310078b);
        sb2.append(", teaserTitle=");
        sb2.append(this.f310079c);
        sb2.append(", infoTitle=");
        sb2.append(this.f310080d);
        sb2.append(", infoText=");
        return C22026a.c(sb2, this.f310081e, ')');
    }
}
