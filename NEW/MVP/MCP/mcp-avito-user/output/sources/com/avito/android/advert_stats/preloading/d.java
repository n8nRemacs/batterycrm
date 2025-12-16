package com.avito.android.advert_stats.preloading;

import Y61.k;
import Y61.l;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import jb.InterfaceC42343a;
import kb.C42659a;
import kotlin.Metadata;
import nb.InterfaceC44368a;

/* compiled from: AdvertStatsPreloadable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_stats/preloading/d;", "Lcom/avito/android/preloading/d;", "", "Lcom/avito/android/util/P2;", "Lkb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements com.avito.android.preloading.d<String, P2<? super C42659a>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42343a f86834a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f86835b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC44368a f86836c;

    public d(@k InterfaceC42343a interfaceC42343a, @k InterfaceC35745a5 interfaceC35745a5, @l InterfaceC44368a interfaceC44368a) {
        this.f86834a = interfaceC42343a;
        this.f86835b = interfaceC35745a5;
        this.f86836c = interfaceC44368a;
    }

    @Override // com.avito.android.preloading.d
    public final z<? extends P2<? super C42659a>> a(String str) {
        z<U> zVarR0 = this.f86834a.b(str).x0(this.f86835b.a()).d0(a.f86831b).r0(P2.c.f318721a);
        b bVar = new b(this);
        zVarR0.getClass();
        return zVarR0.J(io.reactivex.rxjava3.internal.functions.a.f401993c, bVar).K(new c(this));
    }
}
