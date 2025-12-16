package com.avito.android.extended_profile_serp;

import com.avito.android.floating_views.FloatingViewsPresenter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileSerpFloatingViewsPresenterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/b;", "Lcom/avito/android/floating_views/a;", "<init>", "()V", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30512b extends com.avito.android.floating_views.a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public VisibilityState f152645d = VisibilityState.f152581c;

    /* compiled from: ExtendedProfileSerpFloatingViewsPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_serp.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[VisibilityState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VisibilityState visibilityState = VisibilityState.f152580b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VisibilityState visibilityState2 = VisibilityState.f152580b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public C30512b() {
    }

    @Override // com.avito.android.floating_views.a, com.avito.android.floating_views.FloatingViewsPresenter
    public final void c(@Y61.k FloatingViewsPresenter.Subscriber subscriber) {
        FloatingViewsPresenter.Subscriber.b aVar;
        this.f158456b = subscriber;
        int iOrdinal = this.f152645d.ordinal();
        if (iOrdinal == 0) {
            aVar = new FloatingViewsPresenter.Subscriber.b.a(false);
        } else if (iOrdinal == 1) {
            aVar = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, false);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158441b, false, false);
        }
        FloatingViewsPresenter.Subscriber subscriber2 = this.f158456b;
        if (subscriber2 != null) {
            subscriber2.l(aVar);
        }
    }

    @Override // com.avito.android.floating_views.a, com.avito.android.floating_views.j.a
    public final void f(int i12, int i13, int i14, int i15, int i16) {
        if (i13 < i12 && i12 > 1) {
            h();
            return;
        }
        if (i13 > i12) {
            if (i12 == 0) {
                i();
                return;
            }
            VisibilityState visibilityState = this.f152645d;
            VisibilityState visibilityState2 = VisibilityState.f152582d;
            if (visibilityState != visibilityState2) {
                this.f152645d = visibilityState2;
                FloatingViewsPresenter.Subscriber.b.C4630b c4630b = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158441b, false, true);
                FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
                if (subscriber != null) {
                    subscriber.l(c4630b);
                }
            }
        }
    }

    @Override // com.avito.android.floating_views.a
    public final void h() {
        VisibilityState visibilityState = this.f152645d;
        VisibilityState visibilityState2 = VisibilityState.f152580b;
        if (visibilityState != visibilityState2) {
            this.f152645d = visibilityState2;
            FloatingViewsPresenter.Subscriber.b.a aVar = new FloatingViewsPresenter.Subscriber.b.a(true);
            FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
            if (subscriber != null) {
                subscriber.l(aVar);
            }
        }
    }

    @Override // com.avito.android.floating_views.a
    public final void i() {
        VisibilityState visibilityState = this.f152645d;
        VisibilityState visibilityState2 = VisibilityState.f152581c;
        if (visibilityState != visibilityState2) {
            this.f152645d = visibilityState2;
            FloatingViewsPresenter.Subscriber.b.C4630b c4630b = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, true);
            FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
            if (subscriber != null) {
                subscriber.l(c4630b);
            }
        }
    }
}
