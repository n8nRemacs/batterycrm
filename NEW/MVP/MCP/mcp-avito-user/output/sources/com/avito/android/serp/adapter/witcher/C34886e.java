package com.avito.android.serp.adapter.witcher;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.PersistableSerpItem;
import java.util.Iterator;
import js0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WitcherAnalyticsInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/e;", "Lcom/avito/android/serp/adapter/witcher/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.witcher.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34886e implements InterfaceC34885d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f273850a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f273851b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WitcherItem f273852c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273853d;

    public C34886e(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k WitcherItem witcherItem, int i12) {
        this.f273850a = gVar;
        this.f273851b = interfaceC28373a;
        this.f273852c = witcherItem;
        this.f273853d = i12;
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void a() {
        this.f273851b.c(new L(1));
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void b(@Y61.k String str) {
        this.f273851b.c(new P(str));
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void d(@Y61.k String str) {
        Integer numValueOf = Integer.valueOf(this.f273853d);
        StringBuilder sb2 = new StringBuilder();
        WitcherItem witcherItem = this.f273852c;
        String strG = androidx.camera.camera2.internal.G.g(sb2, witcherItem.f273816g, ", click on ", str);
        Iterator<PersistableSerpItem> it = witcherItem.f273815f.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (kotlin.jvm.internal.L.f(it.next().getF75841c(), str)) {
                break;
            } else {
                i12++;
            }
        }
        d.a.a(this.f273850a, numValueOf, "seen_items", strG, null, Integer.valueOf(i12), null, null, witcherItem.f273823n, 104);
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void e() {
        this.f273851b.c(new L(0));
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void c() {
    }
}
