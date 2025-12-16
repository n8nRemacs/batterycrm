package com.avito.android.deeplink_handler.handler.registry;

import Ru.b;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.C23060r0;
import androidx.view.M0;
import com.avito.android.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.handler.bundle.DeeplinkBundleSaver;
import com.avito.android.version_conflict.i;
import ev.AbstractC40161a;
import ev.AbstractC40162b;
import hv.C41170a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import iv.C42114a;
import j.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jv.C42431a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kv.C43501a;
import lv.C43834a;

/* compiled from: DeeplinkHandlerRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/registry/e;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/deeplink_handler/handler/registry/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends M0 implements a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Map<Class<DeepLink>, C43834a> f134563E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.d f134564J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final C42114a f134565K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_events.registry.d f134566L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final i f134567M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final P f134568N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.registry.result.a f134569O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final C41170a f134570P;

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final iv.c f134571Q;

    /* renamed from: R, reason: collision with root package name */
    @k
    public final AtomicBoolean f134572R;

    public e() {
        throw null;
    }

    public e(Map map, com.avito.android.deeplink_handler.handler.d dVar, C23060r0 c23060r0, C42114a c42114a, DeeplinkBundleSaver deeplinkBundleSaver, com.avito.android.deeplink_events.registry.d dVar2, i iVar, P p12, int i12, C42822w c42822w) {
        c42114a = (i12 & 8) != 0 ? new C42114a() : c42114a;
        deeplinkBundleSaver = (i12 & 16) != 0 ? new DeeplinkBundleSaver(c23060r0) : deeplinkBundleSaver;
        this.f134563E = map;
        this.f134564J = dVar;
        this.f134565K = c42114a;
        this.f134566L = dVar2;
        this.f134567M = iVar;
        this.f134568N = p12;
        com.avito.android.deeplink_handler.handler.registry.result.a aVar = new com.avito.android.deeplink_handler.handler.registry.result.a(c42114a, deeplinkBundleSaver, dVar2);
        this.f134569O = aVar;
        this.f134570P = new C41170a(aVar, deeplinkBundleSaver, c42114a, c23060r0);
        this.f134571Q = new iv.c();
        this.f134572R = new AtomicBoolean(false);
    }

    @Override // com.avito.android.deeplink_handler.handler.composite.a
    public final void Qb(@k Bundle bundle) {
        if (this.f134572R.get()) {
            iv.c cVar = this.f134571Q;
            synchronized (cVar.f405357a) {
                cVar.f405358b = C42431a.a(cVar.f405358b, bundle);
                G0 g02 = G0.f406611a;
            }
        }
    }

    @Override // com.avito.android.deeplink_handler.handler.b
    @k
    public final z<C43501a> V9() {
        BK0.a<C43501a> aVar = this.f134569O.f134576d;
        aVar.getClass();
        return new C41981q0(aVar).i0(this.f134564J.V9());
    }

    @Override // com.avito.android.deeplink_handler.handler.b
    @k
    public final W d9() {
        return b.a.b(this);
    }

    @Override // com.avito.android.deeplink_handler.handler.composite.a
    public final void h(@k String str) {
        Collection collectionValues = this.f134565K.f405355a.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            com.avito.android.deeplink_handler.handler.b bVar = (com.avito.android.deeplink_handler.handler.b) obj;
            if (bVar instanceof com.avito.android.deeplink_handler.handler.a) {
                AbstractC40161a abstractC40161a = bVar instanceof AbstractC40161a ? (AbstractC40161a) bVar : null;
                if (L.f(abstractC40161a != null ? abstractC40161a.e() : null, str)) {
                    arrayList.add(obj);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.avito.android.deeplink_handler.handler.a) ((com.avito.android.deeplink_handler.handler.b) it.next())).cancel();
        }
    }

    @Override // com.avito.android.deeplink_handler.handler.lifecycle.c
    public final void nc() {
        if (this.f134572R.get()) {
            for (com.avito.android.deeplink_handler.handler.b bVar : this.f134565K.f405355a.values()) {
                com.avito.android.deeplink_handler.handler.lifecycle.c cVar = bVar instanceof com.avito.android.deeplink_handler.handler.lifecycle.c ? (com.avito.android.deeplink_handler.handler.lifecycle.c) bVar : null;
                if (cVar != null) {
                    cVar.nc();
                }
            }
        }
    }

    @Override // androidx.view.M0
    @k0
    public final void onCleared() {
        ConcurrentHashMap concurrentHashMap = this.f134565K.f405355a;
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC40161a) it.next()).g();
        }
        concurrentHashMap.clear();
        this.f134569O.f134577e.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.deeplink_handler.handler.b
    public final void r6(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
        AbstractC40161a<DeepLink> abstractC40161a;
        C43834a c43834a = this.f134563E.get(deepLink.getClass());
        Bundle bundle2 = this.f134571Q.f405358b;
        if (bundle == null) {
            bundle = bundle2;
        } else if (bundle2 != null) {
            bundle = C42431a.a(bundle2, bundle);
        }
        C43834a.b bVar = c43834a != null ? c43834a.f414238c : null;
        if (this.f134567M.c()) {
            P p12 = this.f134568N;
            p12.getClass();
            n<Object> nVar = P.f67370w0[74];
            if (((Boolean) p12.f67411h0.a().invoke()).booleanValue()) {
                this.f134567M.b();
                return;
            }
        }
        com.avito.android.deeplink_handler.handler.bundle.a aVar = new com.avito.android.deeplink_handler.handler.bundle.a(bundle, deepLink, str);
        this.f134566L.b(new b.e(bundle, deepLink, str));
        if (bVar == null) {
            this.f134564J.r6(bundle, deepLink, str);
            return;
        }
        C41170a c41170a = this.f134570P;
        c41170a.getClass();
        if (bVar instanceof C43834a.b.C11808a) {
            C43834a.b.C11808a c11808a = (C43834a.b.C11808a) bVar;
            AbstractC40161a<DeepLink> abstractC40161a2 = c11808a.f414240b.get();
            String str2 = abstractC40161a2.f395444b;
            DeeplinkBundleSaver deeplinkBundleSaver = c41170a.f398293b;
            String str3 = c11808a.f414239a;
            deeplinkBundleSaver.b(str3, aVar, str2);
            c41170a.a(abstractC40161a2, str3, str2, aVar);
            abstractC40161a = abstractC40161a2;
        } else {
            if (!(bVar instanceof C43834a.b.C11809b)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC40162b abstractC40162b = (AbstractC40162b) ((C43834a.b.C11809b) bVar).f414241a.get();
            c41170a.f398292a.b(abstractC40162b);
            abstractC40161a = abstractC40162b;
        }
        abstractC40161a.r6(bundle, deepLink, str);
    }

    @Override // com.avito.android.deeplink_handler.handler.registry.a
    public final void wc() {
        if (this.f134572R.getAndSet(true)) {
            return;
        }
        com.avito.android.util.concurrent.b.a(new d(this));
    }
}
