package com.avito.android.publish.slots.fashion_authentication_check_banner.item;

import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FashionAuthenticationCheckBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/fashion_authentication_check_banner/item/i;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class i implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f243885b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f243886c;

    public i(@Y61.k String str, @l String str2) {
        this.f243885b = str;
        this.f243886c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f243885b, iVar.f243885b) && L.f(this.f243886c, iVar.f243886c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return getF243885b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243885b() {
        return this.f243885b;
    }

    public final int hashCode() {
        int iHashCode = this.f243885b.hashCode() * 31;
        String str = this.f243886c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FashionAuthenticationCheckBannerItem(stringId=");
        sb2.append(this.f243885b);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f243886c, ')');
    }
}
