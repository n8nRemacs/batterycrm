package com.avito.android.newcars_mark_model_filter.link;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsBrandModelFilterDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/link/b;", "Ldagger/internal/h;", "Lcom/avito/android/newcars_mark_model_filter/link/a;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements h<com.avito.android.newcars_mark_model_filter.link.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f207274b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f207275a;

    /* compiled from: NewCarsBrandModelFilterDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/link/b$a;", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k dv.b bVar) {
        this.f207275a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.d dVar = (a.d) this.f207275a.get();
        f207274b.getClass();
        return new com.avito.android.newcars_mark_model_filter.link.a(dVar);
    }
}
