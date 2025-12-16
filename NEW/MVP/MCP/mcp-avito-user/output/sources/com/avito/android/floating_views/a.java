package com.avito.android.floating_views;

import com.avito.android.floating_views.FloatingViewsPresenter;
import kotlin.Metadata;

/* compiled from: BaseFloatingViewsPresenterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/floating_views/a;", "Lcom/avito/android/floating_views/FloatingViewsPresenter;", "<init>", "()V", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class a implements FloatingViewsPresenter {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public com.avito.android.ui.adapter.f f158455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public FloatingViewsPresenter.Subscriber f158456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Integer f158457c;

    @Override // com.avito.android.floating_views.FloatingViewsPresenter
    public final void a() {
        this.f158456b = null;
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter
    public final void b() {
        this.f158456b = null;
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter
    public void c(@Y61.k FloatingViewsPresenter.Subscriber subscriber) {
        this.f158456b = subscriber;
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter
    public final void e(@Y61.l Integer num) {
        this.f158457c = num;
    }

    @Override // com.avito.android.floating_views.j.a
    public void f(int i12, int i13, int i14, int i15, int i16) {
        Integer num = this.f158457c;
        if (i12 <= (num != null ? num.intValue() : -1)) {
            h();
        } else if (i13 < i12) {
            h();
        } else if (i13 > i12) {
            i();
        }
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter
    public final void g(@Y61.k com.avito.android.ui.adapter.f fVar) {
        this.f158455a = fVar;
    }

    public abstract void h();

    public abstract void i();

    @Override // com.avito.android.floating_views.FloatingViewsPresenter
    public void d(boolean z12) {
    }
}
