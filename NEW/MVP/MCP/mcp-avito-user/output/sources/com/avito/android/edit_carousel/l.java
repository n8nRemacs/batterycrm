package com.avito.android.edit_carousel;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditCarouselResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/l;", "Lcom/avito/android/edit_carousel/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f146417a;

    @Inject
    public l(@Y61.k Resources resources) {
        this.f146417a = resources;
    }

    @Override // com.avito.android.edit_carousel.k
    @Y61.k
    public final String a(int i12, int i13, int i14) throws Resources.NotFoundException {
        Resources resources = this.f146417a;
        if (i12 < i13) {
            return resources.getString(R.string.extended_profile_carousel_edit_hint_less, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        if (i12 >= i14) {
            return resources.getString(R.string.extended_profile_carousel_edit_hint_max, Integer.valueOf(i14));
        }
        return resources.getString(R.string.extended_profile_carousel_edit_hint_valid, Integer.valueOf(i12), resources.getQuantityString(R.plurals.extended_profile_carousel_edit_adverts, i12), Integer.valueOf(i14 - i12));
    }

    @Override // com.avito.android.edit_carousel.k
    @Y61.k
    public final String b() {
        return this.f146417a.getString(R.string.extended_profile_carousel_edit_adverts_save);
    }

    @Override // com.avito.android.edit_carousel.k
    @Y61.k
    public final String c(int i12) {
        return this.f146417a.getQuantityString(R.plurals.extended_profile_carousel_edit_days_left, i12, Integer.valueOf(i12));
    }

    @Override // com.avito.android.edit_carousel.k
    @Y61.k
    public final String d() {
        return this.f146417a.getString(R.string.extended_profile_carousel_edit_title_search_mode);
    }
}
