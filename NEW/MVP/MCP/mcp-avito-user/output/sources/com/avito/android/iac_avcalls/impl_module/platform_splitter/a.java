package com.avito.android.iac_avcalls.impl_module.platform_splitter;

import com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.C30832a;
import com.avito.android.iac_avcalls.public_module.analytics.AvCallsFunnelEventsObserver;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AvCallsFunnelEventsObserverSplitter.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/a;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements AvCallsFunnelEventsObserver {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FJ.a f164493a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<C30832a> f164494b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.iac_avcalls.impl_module.platform.avcalls.a> f164495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f164496d = C42727D.c(new C4811a());

    /* compiled from: AvCallsFunnelEventsObserverSplitter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_avcalls.impl_module.platform_splitter.a$a, reason: collision with other inner class name */
    public static final class C4811a extends N implements Y41.a<AvCallsFunnelEventsObserver> {
        public C4811a() {
            super(0);
        }

        @Override // Y41.a
        public final AvCallsFunnelEventsObserver invoke() {
            a aVar = a.this;
            return aVar.f164493a.v().invoke().booleanValue() ? aVar.f164495c.get() : aVar.f164494b.get();
        }
    }

    @Inject
    public a(@Y61.k FJ.a aVar, @Y61.k h31.e<C30832a> eVar, @Y61.k h31.e<com.avito.android.iac_avcalls.impl_module.platform.avcalls.a> eVar2) {
        this.f164493a = aVar;
        this.f164494b = eVar;
        this.f164495c = eVar2;
    }

    @Override // com.avito.android.iac_avcalls.public_module.analytics.AvCallsFunnelEventsObserver
    @Y61.k
    public final InterfaceC43160i<AvCallsFunnelEventsObserver.Event> getEvents() {
        return ((AvCallsFunnelEventsObserver) this.f164496d.getValue()).getEvents();
    }
}
