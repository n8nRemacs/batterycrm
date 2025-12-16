package com.avito.android.newcars_mark_model_filter.domain;

import Y61.k;
import com.avito.android.util.R0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import s30.InterfaceC47990a;

/* compiled from: NewCarsBrandModelFilterInteractor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/domain/b;", "Ldagger/internal/h;", "Lcom/avito/android/newcars_mark_model_filter/domain/a;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements h<com.avito.android.newcars_mark_model_filter.domain.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f207269c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC47990a> f207270a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<R0> f207271b;

    /* compiled from: NewCarsBrandModelFilterInteractor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/domain/b$a;", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k Provider<InterfaceC47990a> provider, @k Provider<R0> provider2) {
        this.f207270a = provider;
        this.f207271b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47990a interfaceC47990a = this.f207270a.get();
        R0 r02 = this.f207271b.get();
        f207269c.getClass();
        return new com.avito.android.newcars_mark_model_filter.domain.a(interfaceC47990a, r02);
    }
}
