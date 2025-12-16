package com.avito.android.str_booking.ui.gallery;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingGalleryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/gallery/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Image> f286033b;

    public c(@k List list) {
        this.f286033b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f286033b, cVar.f286033b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return -196315310;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF285943b() {
        return AdvertDetailsBlockIdKt.GALLERY_BLOCK;
    }

    public final int hashCode() {
        return this.f286033b.hashCode() - 1790807314;
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("StrBookingGalleryItem(stringId=gallery, images="), this.f286033b, ')');
    }
}
