package com.avito.android.progress_info_toast_bar.presenter;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import fa.InterfaceC40383a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProgressInfoToastBarPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/g;", "Ldagger/internal/h;", "Lcom/avito/android/progress_info_toast_bar/presenter/b;", "a", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<b> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f231577e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC40383a> f231578a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f231579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dagger.internal.f f231580c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.progress_info_toast_bar.interactor.e f231581d;

    /* compiled from: ProgressInfoToastBarPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/g$a;", "", "<init>", "()V", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k Provider provider, @k Provider provider2, @k dagger.internal.f fVar, @k com.avito.android.progress_info_toast_bar.interactor.e eVar) {
        this.f231578a = provider;
        this.f231579b = provider2;
        this.f231580c = fVar;
        this.f231581d = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f231578a);
        InterfaceC35745a5 interfaceC35745a5 = this.f231579b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f231580c.get();
        com.avito.android.progress_info_toast_bar.interactor.b bVar = (com.avito.android.progress_info_toast_bar.interactor.b) this.f231581d.get();
        f231577e.getClass();
        return new b(eVarB, interfaceC35745a5, interfaceC28373a, bVar);
    }
}
