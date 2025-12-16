package com.avito.android.floating_views;

import com.avito.android.floating_views.FloatingViewsPresenter;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StatelessFloatingViewsPresenterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/floating_views/k;", "Lcom/avito/android/floating_views/a;", "<init>", "()V", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends a {
    @Inject
    public k() {
    }

    @Override // com.avito.android.floating_views.a
    public final void h() {
        FloatingViewsPresenter.Subscriber.b.a aVar = new FloatingViewsPresenter.Subscriber.b.a(true);
        FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
        if (subscriber != null) {
            subscriber.l(aVar);
        }
    }

    @Override // com.avito.android.floating_views.a
    public final void i() {
        FloatingViewsPresenter.Subscriber.b.C4630b c4630b = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, true);
        FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
        if (subscriber != null) {
            subscriber.l(c4630b);
        }
    }
}
