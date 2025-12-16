package com.avito.beduin.v2.component.lazy_column.compose;

import androidx.compose.foundation.layout.I0;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FlexColumnComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/I0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/I0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.q<I0, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.component.flexlayout.state.b f335916l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f335917m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f335918n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f335919o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.beduin.v2.component.flexlayout.state.b bVar, boolean z12, boolean z13, boolean z14) {
        super(3);
        this.f335916l = bVar;
        this.f335917m = z12;
        this.f335918n = z13;
        this.f335919o = z14;
    }

    @Override // Y41.q
    public final G0 invoke(I0 i02, A a12, Integer num) {
        I0 i03 = i02;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(i03) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.avito.beduin.v2.component.flexlayout.state.b bVar = this.f335916l;
            i.a(bVar.f335733b, androidx.compose.runtime.internal.r.c(-1489079172, new c(bVar, this.f335917m, this.f335918n, this.f335919o, i03), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
