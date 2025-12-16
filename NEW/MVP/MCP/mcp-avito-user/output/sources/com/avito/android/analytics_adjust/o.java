package com.avito.android.analytics_adjust;

import android.app.Application;
import com.avito.android.di.module.C30131o;
import java.util.Optional;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdjustImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_adjust/o;", "Ldagger/internal/h;", "Lcom/avito/android/analytics_adjust/k;", "a", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<k> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final a f91233j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f91234a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f91235b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30131o f91236c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<String> f91237d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<r> f91238e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<String> f91239f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Provider<u> f91240g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f91241h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f91242i;

    /* compiled from: AdjustImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_adjust/o$a;", "", "<init>", "()V", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k C30131o c30131o, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k Provider provider5, @Y61.k dagger.internal.l lVar2, @Y61.k dagger.internal.l lVar3) {
        this.f91234a = lVar;
        this.f91235b = provider;
        this.f91236c = c30131o;
        this.f91237d = provider2;
        this.f91238e = provider3;
        this.f91239f = provider4;
        this.f91240g = provider5;
        this.f91241h = lVar2;
        this.f91242i = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f91234a.f393949a;
        com.avito.android.util.C c12 = this.f91235b.get();
        InterfaceC28534b interfaceC28534b = (InterfaceC28534b) this.f91236c.get();
        String str = this.f91237d.get();
        r rVar = this.f91238e.get();
        String str2 = this.f91239f.get();
        u uVar = this.f91240g.get();
        Optional optional = (Optional) this.f91241h.f393949a;
        Optional optional2 = (Optional) this.f91242i.f393949a;
        f91233j.getClass();
        return new k(application, c12, interfaceC28534b, str, rVar, str2, uVar, optional, optional2);
    }
}
