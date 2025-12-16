package com.avito.android.navigation_config.service;

import Y61.k;
import dagger.internal.u;
import dagger.internal.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationConfigServiceImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation_config/service/f;", "Ldagger/internal/h;", "Lcom/avito/android/navigation_config/service/e;", "a", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f207251b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f207252a;

    /* compiled from: NavigationConfigServiceImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation_config/service/f$a;", "", "<init>", "()V", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k u uVar) {
        this.f207252a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f207252a));
        f207251b.getClass();
        return new e(eVarA);
    }
}
