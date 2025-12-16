package com.avito.android.serp.adapter.search_bar;

import com.avito.android.floating_views.FloatingViewsPresenter;
import kotlin.Metadata;

/* compiled from: SearchBarItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/search_bar/L;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class L implements FloatingViewsPresenter.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f271599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f271600c;

    public L(M m12) {
        this.f271600c = m12;
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void l(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) {
        if (this.f271599b) {
            boolean z12 = bVar instanceof FloatingViewsPresenter.Subscriber.b.C4630b;
            if (z12) {
                if (((FloatingViewsPresenter.Subscriber.b.C4630b) bVar).f158446a == FloatingViewsPresenter.Subscriber.DisplayMode.f158441b) {
                    return;
                }
            }
            M m12 = this.f271600c;
            if (!z12) {
                m12.f271603d.e(false, false);
            } else {
                FloatingViewsPresenter.Subscriber.b.C4630b c4630b = (FloatingViewsPresenter.Subscriber.b.C4630b) bVar;
                m12.f271603d.e(c4630b.f158447b, c4630b.f158448c);
            }
        }
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void i(boolean z12) {
    }
}
