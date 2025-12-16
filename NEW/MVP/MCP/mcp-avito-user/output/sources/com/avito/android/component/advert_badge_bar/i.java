package com.avito.android.component.advert_badge_bar;

import Y61.k;
import hw.InterfaceC41178c;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExpandableDataSource.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/i;", "LUV0/a;", "Lcom/avito/conveyor_item/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements UV0.a<com.avito.conveyor_item.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f125002b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.conveyor_item.a f125003c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125004d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125005e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f125006f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public List<? extends com.avito.conveyor_item.a> f125007g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f125008h;

    public i() {
        throw null;
    }

    public i(List list, com.avito.conveyor_item.a aVar, int i12, boolean z12, int i13, C42822w c42822w) {
        i12 = (i13 & 4) != 0 ? list.size() : i12;
        z12 = (i13 & 8) != 0 ? false : z12;
        this.f125002b = list;
        this.f125003c = aVar;
        this.f125004d = i12;
        this.f125005e = z12;
        this.f125006f = C42727D.c(h.f125001l);
        this.f125007g = C42784z0.f406748b;
        this.f125007g = list.size() > i12 ? C42745f0.i0(aVar, a(C42745f0.E0(list, i12))) : a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<com.avito.conveyor_item.a> a(List<? extends com.avito.conveyor_item.a> list) {
        return this.f125005e ? ((com.avito.android.lib.util.groupable_item.g) this.f125006f.getValue()).a(list, new QV.e(0, 0, 3, null)) : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r4) {
        /*
            r3 = this;
            java.util.List<com.avito.conveyor_item.a> r0 = r3.f125002b
            if (r4 != 0) goto L1f
            int r1 = r0.size()
            int r2 = r3.f125004d
            if (r1 <= r2) goto L1f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.C42745f0.E0(r0, r2)
            java.util.List r0 = r3.a(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            com.avito.conveyor_item.a r1 = r3.f125003c
            java.util.ArrayList r0 = kotlin.collections.C42745f0.i0(r1, r0)
            goto L23
        L1f:
            java.util.List r0 = r3.a(r0)
        L23:
            r3.f125007g = r0
            r3.f125008h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.component.advert_badge_bar.i.c(boolean):void");
    }

    @Override // UV0.a
    public final int getCount() {
        return this.f125007g.size();
    }

    @Override // UV0.a
    public final com.avito.conveyor_item.a getItem(int i12) {
        return this.f125007g.get(i12);
    }

    @Override // UV0.a
    public final boolean isEmpty() {
        return this.f125002b.isEmpty();
    }
}
