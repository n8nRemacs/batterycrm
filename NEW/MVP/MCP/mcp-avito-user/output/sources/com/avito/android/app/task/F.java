package com.avito.android.app.task;

import com.avito.android.ab_tests.C27653p;
import com.avito.android.error_reporting.app_state.C30365d;
import com.avito.android.error_reporting.app_state.C30366e;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FetchABTestsConfigTaskForeground_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app/task/F;", "Ldagger/internal/h;", "Lcom/avito/android/app/task/FetchABTestsConfigTaskForeground;", "a", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F implements dagger.internal.h<FetchABTestsConfigTaskForeground> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f91397e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ab_tests.r f91398a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.account.E> f91399b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30366e f91400c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.R0> f91401d;

    /* compiled from: FetchABTestsConfigTaskForeground_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app/task/F$a;", "", "<init>", "()V", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public F(@Y61.k com.avito.android.ab_tests.r rVar, @Y61.k Provider provider, @Y61.k C30366e c30366e, @Y61.k Provider provider2) {
        this.f91398a = rVar;
        this.f91399b = provider;
        this.f91400c = c30366e;
        this.f91401d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C27653p c27653p = (C27653p) this.f91398a.get();
        com.avito.android.account.E e12 = this.f91399b.get();
        C30365d c30365d = (C30365d) this.f91400c.get();
        com.avito.android.util.R0 r02 = this.f91401d.get();
        f91397e.getClass();
        return new FetchABTestsConfigTaskForeground(c27653p, e12, c30365d, r02);
    }
}
