package com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerGalleryImageItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/seller/gallery/item/image/c;", "LTV0/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f121506b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Uri f121507c;

    public c(@l Uri uri, long j12) {
        this.f121506b = j12;
        this.f121507c = uri;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f121506b == cVar.f121506b && L.f(this.f121507c, cVar.f121507c);
    }

    @Override // TV0.a
    public final long getId() {
        return this.f121506b;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f121506b) * 31;
        Uri uri = this.f121507c;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerGalleryImageItem(id=");
        sb2.append(this.f121506b);
        sb2.append(", image=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f121507c, ')');
    }
}
