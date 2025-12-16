package com.avito.android.user_adverts.tab_screens.advert_list.progress;

import Y61.k;
import com.avito.android.di.B;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.root_screen.adverts_host.placeholder.UserAdvertsPlaceholderView;
import com.avito.android.user_adverts.tab_screens.advert_list.progress.a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProgressOverlayItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/d;", "LTV0/d;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/h;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<h, com.avito.android.user_adverts.tab_screens.advert_list.progress.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f314758b;

    /* compiled from: ProgressOverlayItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/d$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void s4();
    }

    @Inject
    public d(@k a aVar) {
        this.f314758b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a.AbstractC9732a abstractC9732a = ((com.avito.android.user_adverts.tab_screens.advert_list.progress.a) aVar).f314750b;
        boolean z12 = abstractC9732a instanceof a.AbstractC9732a.C9733a;
        UserAdvertsPlaceholderView userAdvertsPlaceholderView = ((h) eVar).f314762b;
        if (z12) {
            userAdvertsPlaceholderView.f313773b.setVisibility(0);
            userAdvertsPlaceholderView.f313774c.setVisibility(8);
        } else if (abstractC9732a instanceof a.AbstractC9732a.b) {
            ApiError apiError = ((a.AbstractC9732a.b) abstractC9732a).f314753b;
            e eVar2 = new e(this);
            userAdvertsPlaceholderView.setAdvertsError(apiError);
            userAdvertsPlaceholderView.setRefreshClickListener(new g(eVar2));
        }
    }
}
