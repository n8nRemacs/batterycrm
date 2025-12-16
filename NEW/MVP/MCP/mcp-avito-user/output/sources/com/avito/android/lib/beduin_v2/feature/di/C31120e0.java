package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideInteractionsProcessorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/e0;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/handler/flow/processor/b;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.e0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31120e0 implements dagger.internal.h<com.avito.beduin.v2.handler.flow.processor.b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f176092e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176093a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC36238a> f176094b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC36274k> f176095c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C30276e0 f176096d;

    /* compiled from: BeduinFeatureModule_ProvideInteractionsProcessorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/e0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.e0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31120e0(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k C30276e0 c30276e0) {
        this.f176093a = uVar;
        this.f176094b = provider;
        this.f176095c = provider2;
        this.f176096d = c30276e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.handler.flow.f fVar = (com.avito.beduin.v2.handler.flow.f) this.f176093a.get();
        InterfaceC36238a interfaceC36238a = this.f176094b.get();
        InterfaceC36274k interfaceC36274k = this.f176095c.get();
        C29270c0 c29270c0 = (C29270c0) this.f176096d.get();
        f176092e.getClass();
        L.f176033a.getClass();
        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[3];
        return new com.avito.beduin.v2.handler.flow.processor.b(fVar, interfaceC36238a, interfaceC36274k, ((Boolean) c29270c0.f113267e.a().invoke()).booleanValue());
    }
}
