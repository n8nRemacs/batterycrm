package com.avito.android.serp.adapter.witcher;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.witcher.WitcherItem;
import java.util.Iterator;
import js0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FeaturedWitcherAnalyticsInteractorImpl.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/a;", "Lcom/avito/android/serp/adapter/witcher/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.witcher.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34882a implements InterfaceC34885d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f273841a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f273842b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WitcherItem f273843c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273844d;

    public C34882a(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k WitcherItem witcherItem, int i12) {
        this.f273841a = gVar;
        this.f273842b = interfaceC28373a;
        this.f273843c = witcherItem;
        this.f273844d = i12;
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void a() {
        Integer numValueOf = Integer.valueOf(this.f273844d);
        WitcherItem witcherItem = this.f273843c;
        d.a.a(this.f273841a, numValueOf, "featured", witcherItem.f273816g, null, null, null, null, witcherItem.f273823n, 120);
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void b(@Y61.k String str) {
        this.f273842b.c(new P(str));
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void c() {
        this.f273841a.j("featured", null);
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void d(@Y61.k String str) {
        Integer numValueOf = Integer.valueOf(this.f273844d);
        StringBuilder sb2 = new StringBuilder();
        WitcherItem witcherItem = this.f273843c;
        String strG = androidx.camera.camera2.internal.G.g(sb2, witcherItem.f273816g, ", click on ", str);
        Iterator<PersistableSerpItem> it = witcherItem.f273815f.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (kotlin.jvm.internal.L.f(it.next().getF138457b(), str)) {
                break;
            } else {
                i12++;
            }
        }
        d.a.a(this.f273841a, numValueOf, "featured", strG, null, Integer.valueOf(i12), null, null, witcherItem.f273823n, 104);
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34885d
    public final void e() {
        Integer numValueOf = Integer.valueOf(this.f273844d);
        StringBuilder sb2 = new StringBuilder();
        WitcherItem witcherItem = this.f273843c;
        sb2.append(witcherItem.f273816g);
        sb2.append(", ");
        WitcherItem.Action action = witcherItem.f273818i;
        sb2.append(action != null ? action.f273828b : null);
        d.a.a(this.f273841a, numValueOf, "featured", sb2.toString(), null, null, null, null, witcherItem.f273823n, 120);
    }
}
