package com.avito.android.beduin.common.analytics;

import Y41.q;
import Y61.k;
import androidx.camera.camera2.internal.G;
import com.avito.android.AbstractC35201t;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.H;
import com.avito.android.analytics.screens.Screen;
import dj.InterfaceC39736a;
import dj.InterfaceC39737b;
import gi.C40685a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPerformanceTrackerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/analytics/c;", "Ldj/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC39737b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f100597a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H f100598b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC35201t f100599c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f100600d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashMap f100601e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final q<String, Long, Boolean, G0> f100602f;

    @Inject
    public c(@k C40685a c40685a, @k InterfaceC28373a interfaceC28373a, @k H h12, @k AbstractC35201t abstractC35201t) {
        this.f100597a = interfaceC28373a;
        this.f100598b = h12;
        this.f100599c = abstractC35201t;
        this.f100600d = AK.c.s(new StringBuilder(), h12.f90370a, ".beduin-extra-performance.unknown-beduin-screen");
        ArrayList arrayList = c40685a.f396727a;
        int iF2 = P0.f(C42745f0.q(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.android.beduin.common.component.b bVar = (com.avito.android.beduin.common.component.b) it.next();
            linkedHashMap.put(bVar.S(), C42745f0.E(bVar.a()));
        }
        this.f100601e = linkedHashMap;
        this.f100602f = new b(this);
    }

    @Override // dj.InterfaceC39737b
    @k
    public final InterfaceC39736a F() {
        return this.f100599c.z().invoke().booleanValue() ? new a(this.f100601e, this.f100602f) : new g();
    }

    @Override // dj.InterfaceC39737b
    public final void g(@k Screen screen) {
        this.f100600d = G.g(new StringBuilder(), this.f100598b.f90370a, ".beduin-extra-performance.", screen.f90471b);
    }
}
