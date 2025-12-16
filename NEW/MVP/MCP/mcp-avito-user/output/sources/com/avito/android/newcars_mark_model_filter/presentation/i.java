package com.avito.android.newcars_mark_model_filter.presentation;

import Y61.k;
import com.avito.android.newcars_mark_model_filter.presentation.mvi.o;
import com.avito.android.newcars_mark_model_filter.presentation.mvi.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsBrandModelFilterViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/i;", "Ldagger/internal/h;", "Lcom/avito/android/newcars_mark_model_filter/presentation/h;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f207315b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f207316a;

    /* compiled from: NewCarsBrandModelFilterViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/i$a;", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@k p pVar) {
        this.f207316a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        o oVar = (o) this.f207316a.get();
        f207315b.getClass();
        return new h(oVar, null, 2, null);
    }
}
