package com.avito.android.adapter.gallery;

import android.net.Uri;
import androidx.media3.common.C23088b;
import com.avito.android.adapter.gallery.GalleryItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryPaginationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adapter/gallery/m;", "", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f68471a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f68472b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Uri f68473c;

    public m(@Y61.k List<GalleryItem.GalleyReview> list, @Y61.k List<GalleryItem.GalleryImage> list2, @Y61.l Uri uri) {
        this.f68471a = list;
        this.f68472b = list2;
        this.f68473c = uri;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f68471a, mVar.f68471a) && L.f(this.f68472b, mVar.f68472b) && L.f(this.f68473c, mVar.f68473c);
    }

    public final int hashCode() {
        int iA2 = C23088b.a(this.f68471a.hashCode() * 31, 31, this.f68472b);
        Uri uri = this.f68473c;
        return iA2 + (uri == null ? 0 : uri.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryPaginationItem(reviews=");
        sb2.append(this.f68471a);
        sb2.append(", images=");
        sb2.append(this.f68472b);
        sb2.append(", nextPage=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f68473c, ')');
    }
}
