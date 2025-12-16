package com.avito.android.progress_info_toast_bar.interactor;

import com.avito.android.util.R0;
import id0.InterfaceC41386a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VacancyProgressInfoInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/interactor/e;", "Ldagger/internal/h;", "Lcom/avito/android/progress_info_toast_bar/interactor/d;", "a", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f231535c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC41386a> f231536a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f231537b;

    /* compiled from: VacancyProgressInfoInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/interactor/e$a;", "", "<init>", "()V", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k Provider<InterfaceC41386a> provider, @Y61.k Provider<R0> provider2) {
        this.f231536a = provider;
        this.f231537b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f231536a);
        R0 r02 = this.f231537b.get();
        f231535c.getClass();
        return new d(r02, eVarB);
    }
}
