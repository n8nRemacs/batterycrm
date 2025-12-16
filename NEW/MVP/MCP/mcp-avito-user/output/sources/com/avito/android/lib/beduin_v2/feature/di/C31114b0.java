package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.android.analytics.InterfaceC28373a;
import gT.C40620a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideErrorAnalyticsSenderFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/b0;", "Ldagger/internal/h;", "LaU0/b;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/BeduinErrorTracker;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.b0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31114b0 implements dagger.internal.h<aU0.b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f176077e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f176078a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f176079b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f176080c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<C40620a> f176081d;

    /* compiled from: BeduinFeatureModule_ProvideErrorAnalyticsSenderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/b0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.b0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31114b0(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f176078a = fVar;
        this.f176079b = lVar;
        this.f176080c = provider;
        this.f176081d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f176078a.get();
        ZS.b bVar = (ZS.b) this.f176079b.f393949a;
        com.avito.android.util.C c12 = this.f176080c.get();
        C40620a c40620a = this.f176081d.get();
        f176077e.getClass();
        L.f176033a.getClass();
        return new com.avito.android.lib.beduin_v2.feature.tracker.a(interfaceC28373a, bVar, c12, c40620a);
    }
}
