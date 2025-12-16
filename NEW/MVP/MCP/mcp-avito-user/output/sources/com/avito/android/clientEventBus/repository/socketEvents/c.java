package com.avito.android.clientEventBus.repository.socketEvents;

import Fo.C13821a;
import Y61.k;
import com.google.gson.Gson;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import mx0.e;
import nx0.InterfaceC44488b;

/* compiled from: SocketEventsRepositoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/clientEventBus/repository/socketEvents/c;", "Lcom/avito/android/clientEventBus/repository/socketEvents/a;", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC44488b f118560a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f118561b;

    @Inject
    public c(@k InterfaceC44488b interfaceC44488b, @k Gson gson) {
        this.f118560a = interfaceC44488b;
        this.f118561b = gson;
    }

    @Override // com.avito.android.clientEventBus.repository.socketEvents.a
    @k
    public final O a(@k List list) {
        List<e> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (e eVar : list2) {
            arrayList.add(new C13821a.C0302a(eVar.f414833a, eVar.f414834b));
        }
        return this.f118560a.a(this.f118561b.l(new C13821a(arrayList))).r(new b(this));
    }
}
