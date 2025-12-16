package com.avito.android.clientEventBus.useCase;

import Go.InterfaceC13901a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.A;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SubscribeToActiveTopicsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/clientEventBus/useCase/h;", "", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.repository.socketEvents.a f118579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13901a f118580b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f118581c;

    @Inject
    public h(@Y61.k com.avito.android.clientEventBus.repository.socketEvents.a aVar, @Y61.k InterfaceC13901a interfaceC13901a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f118579a = aVar;
        this.f118580b = interfaceC13901a;
        this.f118581c = interfaceC35745a5;
    }

    @Y61.k
    public final A a() {
        return (A) new G(new VH0.c(this, 14)).o(new g(this));
    }
}
