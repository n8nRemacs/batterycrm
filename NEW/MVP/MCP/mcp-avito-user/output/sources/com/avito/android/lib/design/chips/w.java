package com.avito.android.lib.design.chips;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsStateManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/w;", "Lcom/avito/android/lib/design/chips/v;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public SelectStrategy f178804a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f178805b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Integer, Boolean, G0> f178806c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Integer, Boolean, G0> f178807d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.p<Integer, Boolean, G0> f178808e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f178809f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, Boolean> f178810g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.p<Boolean, Integer, G0> f178811h;

    /* renamed from: i, reason: collision with root package name */
    public int f178812i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f178813j;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@Y61.k SelectStrategy selectStrategy, boolean z12, @Y61.k Y41.p<? super Integer, ? super Boolean, G0> pVar, @Y61.k Y41.p<? super Integer, ? super Boolean, G0> pVar2, @Y61.l Y41.p<? super Integer, ? super Boolean, G0> pVar3, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.l<? super Integer, Boolean> lVar, int i12, @Y61.l Y41.p<? super Boolean, ? super Integer, G0> pVar4) {
        this.f178804a = selectStrategy;
        this.f178805b = z12;
        this.f178806c = pVar;
        this.f178807d = pVar2;
        this.f178808e = pVar3;
        this.f178809f = aVar;
        this.f178810g = lVar;
        this.f178811h = pVar4;
        this.f178812i = i12;
        this.f178813j = new LinkedHashSet();
    }

    @Override // com.avito.android.lib.design.chips.v
    @Y61.k
    public final List<Integer> a() {
        return C42745f0.M0(this.f178813j);
    }

    @Override // com.avito.android.lib.design.chips.v
    public final boolean b() {
        return this.f178812i != -1 && this.f178813j.size() == this.f178812i;
    }

    @Override // com.avito.android.lib.design.chips.v
    public final boolean c(int i12) {
        return this.f178813j.contains(Integer.valueOf(i12));
    }

    @Override // com.avito.android.lib.design.chips.v
    public final void d(int i12, boolean z12, boolean z13) {
        Y41.a<G0> aVar;
        LinkedHashSet linkedHashSet = this.f178813j;
        if (linkedHashSet.size() == this.f178812i && (aVar = this.f178809f) != null) {
            aVar.invoke();
        }
        if (z13) {
            linkedHashSet.remove(Integer.valueOf(i12));
        }
        this.f178807d.invoke(Integer.valueOf(i12), Boolean.valueOf(z12));
    }

    @Override // com.avito.android.lib.design.chips.v
    public final void e(int i12, boolean z12, boolean z13) {
        Y41.a<G0> aVar;
        Y41.p<Integer, Boolean, G0> pVar = this.f178808e;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i12), Boolean.valueOf(z12));
        }
        boolean zC2 = c(i12);
        LinkedHashSet linkedHashSet = this.f178813j;
        if (zC2) {
            if (linkedHashSet.size() == 1 && this.f178805b) {
                return;
            }
            d(i12, z12, z13);
            return;
        }
        SelectStrategy selectStrategy = this.f178804a;
        if (selectStrategy == SelectStrategy.f178716b || selectStrategy == SelectStrategy.f178718d) {
            Integer num = (Integer) C42745f0.F(linkedHashSet);
            if (num != null) {
                this.f178807d.invoke(Integer.valueOf(num.intValue()), Boolean.valueOf(z12));
            }
            linkedHashSet.clear();
        }
        Y41.l<Integer, Boolean> lVar = this.f178810g;
        boolean zBooleanValue = lVar != null ? lVar.invoke(Integer.valueOf(i12)).booleanValue() : true;
        Y41.p<Boolean, Integer, G0> pVar2 = this.f178811h;
        if (pVar2 != null) {
            pVar2.invoke(Boolean.valueOf(zBooleanValue), Integer.valueOf(i12));
        }
        if (zBooleanValue) {
            if (z13) {
                linkedHashSet.add(Integer.valueOf(i12));
            }
            this.f178806c.invoke(Integer.valueOf(i12), Boolean.valueOf(z12));
        }
        if (linkedHashSet.size() != this.f178812i || (aVar = this.f178809f) == null) {
            return;
        }
        aVar.invoke();
    }

    public /* synthetic */ w(SelectStrategy selectStrategy, boolean z12, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, Y41.a aVar, Y41.l lVar, int i12, Y41.p pVar4, int i13, C42822w c42822w) {
        this(selectStrategy, z12, pVar, pVar2, (i13 & 16) != 0 ? null : pVar3, (i13 & 32) != 0 ? null : aVar, (i13 & 64) != 0 ? null : lVar, (i13 & 128) != 0 ? -1 : i12, (i13 & 256) != 0 ? null : pVar4);
    }
}
