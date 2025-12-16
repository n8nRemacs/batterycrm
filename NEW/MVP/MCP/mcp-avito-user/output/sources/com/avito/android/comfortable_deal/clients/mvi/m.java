package com.avito.android.comfortable_deal.clients.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.clients.model.ClientsArguments;
import com.avito.android.comfortable_deal.clients.model.ClientsInfo;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.comfortable_deal.paging.PagingState;
import dagger.internal.x;
import dagger.internal.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import jp.C42409a;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kp.C43481g;
import kp.C43482h;
import kp.InterfaceC43479e;

/* compiled from: ClientsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f120362a;

    /* renamed from: b, reason: collision with root package name */
    public final h f120363b;

    /* renamed from: c, reason: collision with root package name */
    public final o f120364c;

    /* renamed from: d, reason: collision with root package name */
    public final q f120365d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f120366e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f120367f;

    public m(j jVar, h hVar, o oVar, q qVar, Provider provider, dagger.internal.l lVar) {
        this.f120362a = jVar;
        this.f120363b = hVar;
        this.f120364c = oVar;
        this.f120365d = qVar;
        this.f120366e = provider;
        this.f120367f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ClientsInfo clientsInfo;
        i iVar = (i) this.f120362a.get();
        g gVar = (g) this.f120363b.get();
        this.f120364c.getClass();
        n nVar = new n();
        p pVar = (p) this.f120365d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f120366e.get();
        ClientsArguments clientsArguments = (ClientsArguments) this.f120367f.f393949a;
        C43481g.f413207l.getClass();
        List list = RequestType.f120272f;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = ((AbstractC42738c) list).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            clientsInfo = clientsArguments.f120265b;
            if (!zHasNext) {
                break;
            }
            RequestType requestType = (RequestType) it.next();
            arrayList.add(C42409a.a(requestType, clientsInfo.f120268d.get(requestType)));
        }
        List<ClientCardData> list2 = clientsInfo.f120266b;
        PagingState pagingState = PagingState.f122408b;
        int i12 = list2 != null ? 0 : -1;
        C42784z0 c42784z0 = C42784z0.f406748b;
        return new l("Clients", new C43481g(pagingState, i12, null, null, null, list2, c42784z0, arrayList, 0, new C43482h(c42784z0, arrayList, 0, null, null, null, list2 != null ? new InterfaceC43479e.a(list2, pagingState) : InterfaceC43479e.d.f413204a)), new k(iVar, gVar, screenPerformanceTracker, pVar, nVar));
    }
}
