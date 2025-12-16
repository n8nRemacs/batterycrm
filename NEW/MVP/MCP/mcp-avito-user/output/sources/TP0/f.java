package TP0;

import Y61.k;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.widget_filters_shared.b;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WidgetFiltersSharedModule_ProvideWidgetFiltersSharedViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LTP0/f;", "Ldagger/internal/h;", "Lcom/avito/android/widget_filters_shared/a;", "a", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements h<com.avito.android.widget_filters_shared.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f15664c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f15665a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.widget_filters_shared.c f15666b;

    /* compiled from: WidgetFiltersSharedModule_ProvideWidgetFiltersSharedViewModelFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTP0/f$a;", "", "<init>", "()V", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k e eVar, @k l lVar, @k com.avito.android.widget_filters_shared.c cVar) {
        this.f15665a = lVar;
        this.f15666b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f15665a.f393949a;
        b.C10261b.a aVar = (b.C10261b.a) this.f15666b.get();
        f15664c.getClass();
        return (com.avito.android.widget_filters_shared.a) new P0(t02, aVar).a(com.avito.android.widget_filters_shared.b.class);
    }
}
