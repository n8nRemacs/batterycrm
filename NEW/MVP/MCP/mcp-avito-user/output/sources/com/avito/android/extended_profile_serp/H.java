package com.avito.android.extended_profile_serp;

import com.avito.android.floating_views.FloatingViewsPresenter;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/H;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$a;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class H implements FloatingViewsPresenter.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f152551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f152552c;

    public H(F f12) {
        this.f152552c = f12;
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void l(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) {
        boolean z12 = bVar instanceof FloatingViewsPresenter.Subscriber.b.C4630b;
        if (z12) {
            if (((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158446a == FloatingViewsPresenter.Subscriber.DisplayMode.f158441b) {
                return;
            }
        }
        F f12 = this.f152552c;
        if (z12) {
            f12.f152547x.setFilterEnabled(((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158448c);
        } else {
            f12.f152547x.setFilterEnabled(false);
        }
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void i(boolean z12) {
    }
}
