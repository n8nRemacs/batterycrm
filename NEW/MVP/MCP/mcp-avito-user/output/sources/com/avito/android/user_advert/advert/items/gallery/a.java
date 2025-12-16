package com.avito.android.user_advert.advert.items.gallery;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertGalleryItemViewSettings.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/gallery/a;", "Lcom/avito/android/user_advert/advert/items/gallery/r;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f309408a;

    @Inject
    public a(@Y61.k ActivityC22955m activityC22955m) {
        this.f309408a = activityC22955m;
    }

    @Override // com.avito.android.user_advert.advert.items.gallery.r
    @Y61.k
    public final FragmentManager a() {
        return this.f309408a.getSupportFragmentManager();
    }

    @Override // com.avito.android.user_advert.advert.items.gallery.r
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final ActivityC22955m getF309408a() {
        return this.f309408a;
    }
}
