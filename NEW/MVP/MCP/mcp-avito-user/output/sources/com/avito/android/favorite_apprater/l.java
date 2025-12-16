package com.avito.android.favorite_apprater;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.app_rater.events.AppRaterEventSourcePage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FavoriteAppRaterView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_apprater/l;", "Lcom/avito/android/favorite_apprater/k;", "_avito_favorite-apprater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f155280b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_rater.a f155281c;

    @Inject
    public l(@Y61.k FragmentManager fragmentManager, @Y61.k com.avito.android.app_rater.a aVar) {
        this.f155280b = fragmentManager;
        this.f155281c = aVar;
    }

    @Override // com.avito.android.favorite_apprater.k
    public final void n() {
        ActivityC22955m activityC22955mL1;
        Fragment fragment = (Fragment) C42745f0.S(this.f155280b.P());
        if (fragment == null || (activityC22955mL1 = fragment.l1()) == null) {
            return;
        }
        this.f155281c.a(activityC22955mL1, AppRaterEventSourcePage.f91797f);
    }
}
