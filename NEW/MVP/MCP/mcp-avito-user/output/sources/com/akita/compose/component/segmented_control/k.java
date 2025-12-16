package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentedControl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f62566l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.f f62567m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f62568n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z0 f62569o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f62570p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f62571q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.f f62572r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ArrayList arrayList, l0.f fVar, int i12, Z0 z02, int i13, C22096n c22096n, l0.f fVar2) {
        super(1);
        this.f62566l = arrayList;
        this.f62567m = fVar;
        this.f62568n = i12;
        this.f62569o = z02;
        this.f62570p = i13;
        this.f62571q = c22096n;
        this.f62572r = fVar2;
    }

    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        ArrayList arrayList = this.f62566l;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            K0 k02 = (K0) arrayList.get(i14);
            aVar2.h(k02, i13, 0, 1.0f);
            if (i14 == this.f62570p) {
                i12 = i13;
            }
            i13 += k02.f40345b;
        }
        int i15 = this.f62567m.f406840b;
        List<InterfaceC22363h0> listH0 = this.f62569o.h0(y.f62605c, new C22096n(-1521190675, new j(this.f62571q, new d(i12, this.f62568n)), true));
        int size2 = listH0.size();
        for (int i16 = 0; i16 < size2; i16++) {
            InterfaceC22363h0 interfaceC22363h0 = listH0.get(i16);
            C22712b.a aVar3 = C22712b.f42842b;
            int i17 = this.f62572r.f406840b;
            aVar3.getClass();
            aVar2.h(interfaceC22363h0.I(C22712b.a.c(i15, i17)), 0, 0, 0.0f);
        }
        return G0.f406611a;
    }
}
