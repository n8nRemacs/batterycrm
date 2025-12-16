package com.avito.android.extended_profile_selection_create.select.select;

import Y61.k;
import com.avito.android.floating_views.FloatingViewsPresenter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileSelectionCreateFloatingViewsPresenterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/select/a;", "Lcom/avito/android/floating_views/a;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends com.avito.android.floating_views.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public VisibilityState f152420d = VisibilityState.f152416c;

    /* compiled from: ExtendedProfileSelectionCreateFloatingViewsPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_selection_create.select.select.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4454a {
        static {
            int[] iArr = new int[VisibilityState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VisibilityState visibilityState = VisibilityState.f152415b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VisibilityState visibilityState2 = VisibilityState.f152415b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a() {
    }

    @Override // com.avito.android.floating_views.a, com.avito.android.floating_views.FloatingViewsPresenter
    public final void c(@k FloatingViewsPresenter.Subscriber subscriber) {
        FloatingViewsPresenter.Subscriber.b aVar;
        this.f158456b = subscriber;
        int iOrdinal = this.f152420d.ordinal();
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
            VisibilityState visibilityState = this.f152420d;
            VisibilityState visibilityState2 = VisibilityState.f152417d;
            if (visibilityState != visibilityState2) {
                this.f152420d = visibilityState2;
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
        VisibilityState visibilityState = this.f152420d;
        VisibilityState visibilityState2 = VisibilityState.f152415b;
        if (visibilityState != visibilityState2) {
            this.f152420d = visibilityState2;
            FloatingViewsPresenter.Subscriber.b.a aVar = new FloatingViewsPresenter.Subscriber.b.a(true);
            FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
            if (subscriber != null) {
                subscriber.l(aVar);
            }
        }
    }

    @Override // com.avito.android.floating_views.a
    public final void i() {
        VisibilityState visibilityState = this.f152420d;
        VisibilityState visibilityState2 = VisibilityState.f152416c;
        if (visibilityState != visibilityState2) {
            this.f152420d = visibilityState2;
            FloatingViewsPresenter.Subscriber.b.C4630b c4630b = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, true);
            FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
            if (subscriber != null) {
                subscriber.l(c4630b);
            }
        }
    }
}
