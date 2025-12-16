package com.avito.android.beduin.common.analytics;

import Y41.q;
import Y61.k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.beduin_models.BeduinModel;
import dj.InterfaceC39736a;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BeduinAdapterPerformanceListenerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/analytics/a;", "Ldj/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC39736a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f100592a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q<String, Long, Boolean, G0> f100593b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final F f100594c;

    /* renamed from: d, reason: collision with root package name */
    public int f100595d;

    public a(@k LinkedHashMap linkedHashMap, @k q qVar) {
        this.f100592a = linkedHashMap;
        this.f100593b = qVar;
        new D();
        this.f100594c = new F();
        this.f100595d = -1;
    }

    @Override // dj.InterfaceC39736a
    public final void a(@k BeduinModel beduinModel, int i12) {
        if (i12 <= this.f100595d) {
            return;
        }
        this.f100595d = i12;
        e(beduinModel, false);
    }

    @Override // dj.InterfaceC39736a
    public final void b(@k BeduinModel beduinModel) {
        e(beduinModel, true);
    }

    @Override // dj.InterfaceC39736a
    public final void c(@k BeduinModel beduinModel, int i12) {
        d();
    }

    @Override // dj.InterfaceC39736a
    public final void d() {
        this.f100594c.c();
    }

    public final void e(BeduinModel beduinModel, boolean z12) {
        String str = (String) this.f100592a.get(beduinModel.getClass());
        if (str == null) {
            return;
        }
        ((b) this.f100593b).invoke(str, Long.valueOf(this.f100594c.b()), Boolean.valueOf(z12));
    }
}
