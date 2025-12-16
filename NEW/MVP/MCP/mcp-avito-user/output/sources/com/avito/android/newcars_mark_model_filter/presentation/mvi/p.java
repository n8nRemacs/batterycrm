package com.avito.android.newcars_mark_model_filter.presentation.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsBrandModelFilterBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/p;", "Ldagger/internal/h;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/o;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f207359e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f207360a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f207361b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f207362c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final t f207363d;

    /* compiled from: NewCarsBrandModelFilterBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/p$a;", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(@Y61.k m mVar, @Y61.k k kVar, @Y61.k r rVar, @Y61.k t tVar) {
        this.f207360a = mVar;
        this.f207361b = kVar;
        this.f207362c = rVar;
        this.f207363d = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f207360a.get();
        j jVar = (j) this.f207361b.get();
        this.f207362c.getClass();
        q qVar = new q();
        this.f207363d.getClass();
        s sVar = new s();
        f207359e.getClass();
        o30.c.f419348m.getClass();
        return new o("NewCarsBrandModelFilter", o30.c.f419349n, new n(lVar, jVar, sVar, qVar));
    }
}
