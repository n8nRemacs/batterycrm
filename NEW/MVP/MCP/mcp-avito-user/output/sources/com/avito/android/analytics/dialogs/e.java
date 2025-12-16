package com.avito.android.analytics.dialogs;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.analytics.n;
import dagger.internal.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ErrorDialogsAnalyticsImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/dialogs/e;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/dialogs/d;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f89891c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<n> f89892a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f89893b;

    /* compiled from: ErrorDialogsAnalyticsImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/dialogs/e$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k f fVar, @k Provider provider) {
        this.f89892a = provider;
        this.f89893b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = this.f89892a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f89893b.get();
        f89891c.getClass();
        return new d(nVar, interfaceC28373a);
    }
}
