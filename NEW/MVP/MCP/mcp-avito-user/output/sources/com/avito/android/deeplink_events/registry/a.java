package com.avito.android.deeplink_events.registry;

import Ru.InterfaceC15081a;
import Y61.k;
import io.reactivex.rxjava3.internal.operators.observable.T0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeeplinkEventObserverRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_events/registry/a;", "Lcom/avito/android/deeplink_events/registry/c;", "<init>", "()V", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<InterfaceC15081a> f134151a = new io.reactivex.rxjava3.subjects.e<>();

    @Inject
    public a() {
    }

    @Override // com.avito.android.deeplink_events.registry.e
    @k
    public final T0 a() {
        return this.f134151a.p0();
    }

    @Override // com.avito.android.deeplink_events.registry.d
    public final void b(@k InterfaceC15081a interfaceC15081a) {
        this.f134151a.onNext(interfaceC15081a);
    }
}
