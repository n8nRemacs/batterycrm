package com.avito.android.lib.beduin_v2.repository.domain.client_event_bus;

import Y41.l;
import Y61.k;
import cV0.InterfaceC27110a;
import com.avito.android.advertising.loaders.beduin.C28349c;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import dV0.C39630a;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClientEventBusRepositoryClientImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/client_event_bus/d;", "LcV0/a;", "_design-modules_beduin-v2_interactions_repository_domain_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements InterfaceC27110a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.clientEventBus.a f176583a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f176584b;

    @Inject
    public d(@k com.avito.android.clientEventBus.a aVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f176583a = aVar;
        this.f176584b = interfaceC35745a5;
    }

    @Override // cV0.InterfaceC27110a
    @k
    public final C28349c a(@k C39630a c39630a, @k l lVar, @k Y41.a aVar) {
        B0 b0A = this.f176583a.a();
        InterfaceC35745a5 interfaceC35745a5 = this.f176584b;
        return new C28349c((y) b0A.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).y0(new a(this, c39630a, lVar, aVar)).s0(), 1);
    }
}
