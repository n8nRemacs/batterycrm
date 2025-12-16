package com.avito.android.floating_views;

import android.os.Bundle;
import com.avito.android.floating_views.FloatingViewsPresenter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: FloatingViewsPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/floating_views/b;", "Lcom/avito/android/floating_views/a;", "Lcom/avito/android/floating_views/f;", "a", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends com.avito.android.floating_views.a implements f {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public VisibilityState f158458d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f158459e;

    /* renamed from: f, reason: collision with root package name */
    public int f158460f;

    /* compiled from: FloatingViewsPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/floating_views/b$a;", "", "<init>", "()V", "", "SCROLL_TO_TOP_VISIBLE_OFFSET", "I", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FloatingViewsPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.floating_views.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C4632b {
        static {
            int[] iArr = new int[VisibilityState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VisibilityState visibilityState = VisibilityState.f158450b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VisibilityState visibilityState2 = VisibilityState.f158450b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.floating_views.a, com.avito.android.floating_views.FloatingViewsPresenter
    public final void c(@Y61.k FloatingViewsPresenter.Subscriber subscriber) {
        this.f158456b = subscriber;
        j();
    }

    @Override // com.avito.android.floating_views.a, com.avito.android.floating_views.FloatingViewsPresenter
    public final void d(boolean z12) {
        this.f158459e = z12;
    }

    @Override // com.avito.android.floating_views.f
    @Y61.l
    public final Bundle d0() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("subscriber_visibility", this.f158458d);
        return bundle;
    }

    @Override // com.avito.android.floating_views.a, com.avito.android.floating_views.j.a
    public final void f(int i12, int i13, int i14, int i15, int i16) {
        FloatingViewsPresenter.Subscriber subscriber;
        if (!this.f158459e) {
            super.f(i12, i13, i14, i15, i16);
            return;
        }
        if (i13 < i12) {
            h();
            FloatingViewsPresenter.Subscriber subscriber2 = this.f158456b;
            if (subscriber2 != null) {
                subscriber2.i(false);
            }
            this.f158460f = i13 - 8;
            return;
        }
        if (i13 > i12) {
            if (i12 == 0) {
                i();
                FloatingViewsPresenter.Subscriber subscriber3 = this.f158456b;
                if (subscriber3 != null) {
                    subscriber3.i(false);
                }
                this.f158460f = -8;
            } else {
                VisibilityState visibilityState = this.f158458d;
                VisibilityState visibilityState2 = VisibilityState.f158452d;
                if (visibilityState != visibilityState2) {
                    this.f158458d = visibilityState2;
                    FloatingViewsPresenter.Subscriber.b.C4630b c4630b = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158441b, false, true);
                    FloatingViewsPresenter.Subscriber subscriber4 = this.f158456b;
                    if (subscriber4 != null) {
                        subscriber4.l(c4630b);
                    }
                }
            }
            if (this.f158460f < i12 || (subscriber = this.f158456b) == null) {
                return;
            }
            subscriber.i(true);
        }
    }

    @Override // com.avito.android.floating_views.a
    public final void h() {
        VisibilityState visibilityState = this.f158458d;
        VisibilityState visibilityState2 = VisibilityState.f158450b;
        if (visibilityState != visibilityState2) {
            this.f158458d = visibilityState2;
            FloatingViewsPresenter.Subscriber.b.a aVar = new FloatingViewsPresenter.Subscriber.b.a(true);
            FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
            if (subscriber != null) {
                subscriber.l(aVar);
            }
        }
    }

    @Override // com.avito.android.floating_views.a
    public final void i() {
        VisibilityState visibilityState = this.f158458d;
        VisibilityState visibilityState2 = VisibilityState.f158451c;
        if (visibilityState != visibilityState2) {
            this.f158458d = visibilityState2;
            FloatingViewsPresenter.Subscriber.b.C4630b c4630b = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, true);
            FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
            if (subscriber != null) {
                subscriber.l(c4630b);
            }
        }
    }

    public final void j() {
        FloatingViewsPresenter.Subscriber.b aVar;
        int iOrdinal = this.f158458d.ordinal();
        if (iOrdinal == 0) {
            aVar = new FloatingViewsPresenter.Subscriber.b.a(false);
        } else if (iOrdinal == 1) {
            aVar = new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, false);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = this.f158459e ? new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158441b, false, false) : new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, false);
        }
        FloatingViewsPresenter.Subscriber subscriber = this.f158456b;
        if (subscriber != null) {
            subscriber.l(aVar);
        }
    }

    @Override // com.avito.android.floating_views.f
    public final void reset() {
        VisibilityState visibilityState = this.f158458d;
        VisibilityState visibilityState2 = VisibilityState.f158451c;
        if (visibilityState != visibilityState2) {
            this.f158458d = visibilityState2;
            j();
        }
    }
}
