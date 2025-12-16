package com.avito.android.cyclic_gallery_widget.image_carousel;

import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.remote.model.GalleryItemConfigModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: CarouselActions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/a;", "", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ActionType f131993a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f131994b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131995c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final GalleryItemConfigModel f131996d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public PhoneLoadingState f131997e;

    public a(ActionType actionType, String str, int i12, GalleryItemConfigModel galleryItemConfigModel, int i13, C42822w c42822w) {
        i12 = (i13 & 4) != 0 ? R.attr.textBodySmall : i12;
        galleryItemConfigModel = (i13 & 8) != 0 ? null : galleryItemConfigModel;
        this.f131993a = actionType;
        this.f131994b = str;
        this.f131995c = i12;
        this.f131996d = galleryItemConfigModel;
        this.f131997e = PhoneLoadingState.f430441b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f131993a == aVar.f131993a && L.f(this.f131994b, aVar.f131994b) && this.f131995c == aVar.f131995c && L.f(this.f131996d, aVar.f131996d);
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f131995c, H.d(this.f131993a.hashCode() * 31, 31, this.f131994b), 31);
        GalleryItemConfigModel galleryItemConfigModel = this.f131996d;
        return iE2 + (galleryItemConfigModel == null ? 0 : galleryItemConfigModel.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ActionData(actionType=" + this.f131993a + ", title=" + this.f131994b + ", titleAppearanceAttrId=" + this.f131995c + ", config=" + this.f131996d + ')';
    }
}
