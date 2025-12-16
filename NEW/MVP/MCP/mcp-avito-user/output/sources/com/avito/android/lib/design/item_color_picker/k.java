package com.avito.android.lib.design.item_color_picker;

import Y41.l;
import Y41.p;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ItemColorSelectManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/k;", "Lcom/avito/android/lib/design/item_color_picker/j;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public SelectStrategy f179479a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f179480b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p<Integer, Boolean, G0> f179481c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p<Integer, Boolean, G0> f179482d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f179483e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final l<Integer, Boolean> f179484f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final p<Boolean, Integer, G0> f179485g;

    /* renamed from: h, reason: collision with root package name */
    public int f179486h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f179487i;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k SelectStrategy selectStrategy, boolean z12, @Y61.k p<? super Integer, ? super Boolean, G0> pVar, @Y61.k p<? super Integer, ? super Boolean, G0> pVar2, @Y61.k Y41.a<G0> aVar, @Y61.k l<? super Integer, Boolean> lVar, int i12, @Y61.k p<? super Boolean, ? super Integer, G0> pVar3) {
        this.f179479a = selectStrategy;
        this.f179480b = z12;
        this.f179481c = pVar;
        this.f179482d = pVar2;
        this.f179483e = aVar;
        this.f179484f = lVar;
        this.f179485g = pVar3;
        this.f179486h = i12;
        this.f179487i = new LinkedHashSet();
    }

    @Override // com.avito.android.lib.design.item_color_picker.j
    @Y61.k
    public final List<Integer> a() {
        return C42745f0.M0(this.f179487i);
    }

    @Override // com.avito.android.lib.design.item_color_picker.j
    public final boolean b() {
        return this.f179486h != -1 && this.f179487i.size() == this.f179486h;
    }

    @Override // com.avito.android.lib.design.item_color_picker.j
    public final boolean c(int i12) {
        return this.f179487i.contains(Integer.valueOf(i12));
    }

    @Override // com.avito.android.lib.design.item_color_picker.j
    public final void d(int i12) {
        boolean zC2 = c(i12);
        LinkedHashSet linkedHashSet = this.f179487i;
        Y41.a<G0> aVar = this.f179483e;
        p<Integer, Boolean, G0> pVar = this.f179482d;
        if (zC2) {
            if (linkedHashSet.size() == 1 && this.f179480b) {
                return;
            }
            if (linkedHashSet.size() == this.f179486h) {
                aVar.invoke();
            }
            linkedHashSet.remove(Integer.valueOf(i12));
            pVar.invoke(Integer.valueOf(i12), Boolean.TRUE);
            return;
        }
        SelectStrategy selectStrategy = this.f179479a;
        if (selectStrategy == SelectStrategy.f179468b || selectStrategy == SelectStrategy.f179470d) {
            Integer num = (Integer) C42745f0.F(linkedHashSet);
            if (num != null) {
                pVar.invoke(Integer.valueOf(num.intValue()), Boolean.TRUE);
            }
            linkedHashSet.clear();
        }
        Boolean boolInvoke = this.f179484f.invoke(Integer.valueOf(i12));
        boolean zBooleanValue = boolInvoke.booleanValue();
        this.f179485g.invoke(boolInvoke, Integer.valueOf(i12));
        if (zBooleanValue) {
            linkedHashSet.add(Integer.valueOf(i12));
            this.f179481c.invoke(Integer.valueOf(i12), Boolean.TRUE);
        }
        if (linkedHashSet.size() == this.f179486h) {
            aVar.invoke();
        }
    }

    public /* synthetic */ k(SelectStrategy selectStrategy, boolean z12, p pVar, p pVar2, Y41.a aVar, l lVar, int i12, p pVar3, int i13, C42822w c42822w) {
        this(selectStrategy, z12, pVar, pVar2, aVar, lVar, (i13 & 64) != 0 ? -1 : i12, pVar3);
    }
}
