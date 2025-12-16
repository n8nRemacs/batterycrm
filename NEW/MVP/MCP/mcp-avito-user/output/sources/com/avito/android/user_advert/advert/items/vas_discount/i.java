package com.avito.android.user_advert.advert.items.vas_discount;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasDiscountItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/vas_discount/i;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f310359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f310360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f310361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Image f310362e;

    public i(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l Image image) {
        this.f310359b = str;
        this.f310360c = str2;
        this.f310361d = str3;
        this.f310362e = image;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f310359b, iVar.f310359b) && L.f(this.f310360c, iVar.f310360c) && L.f(this.f310361d, iVar.f310361d) && L.f(this.f310362e, iVar.f310362e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return getF306970b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF306970b() {
        return this.f310359b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f310359b.hashCode() * 31, 31, this.f310360c), 31, this.f310361d);
        Image image = this.f310362e;
        return iD2 + (image == null ? 0 : image.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasDiscountItem(stringId=");
        sb2.append(this.f310359b);
        sb2.append(", title=");
        sb2.append(this.f310360c);
        sb2.append(", description=");
        sb2.append(this.f310361d);
        sb2.append(", icon=");
        return AK.c.o(sb2, this.f310362e, ')');
    }
}
