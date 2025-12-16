package com.avito.android.widget_filters_shared;

import Y61.k;
import com.avito.android.widget_filters_shared.b;
import com.avito.android.widget_filters_shared.mvi.e;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WidgetFiltersSharedViewModelImpl_Companion_Factory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters_shared/c;", "Ldagger/internal/h;", "Lcom/avito/android/widget_filters_shared/b$b$a;", "a", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements h<b.C10261b.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f330581b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f330582a;

    /* compiled from: WidgetFiltersSharedViewModelImpl_Companion_Factory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters_shared/c$a;", "", "<init>", "()V", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k e eVar) {
        this.f330582a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.widget_filters_shared.mvi.d dVar = (com.avito.android.widget_filters_shared.mvi.d) this.f330582a.get();
        f330581b.getClass();
        return new b.C10261b.a(dVar);
    }
}
