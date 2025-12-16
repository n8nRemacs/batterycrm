package com.avito.beduin.v2.component.lazy_column.compose;

import androidx.compose.foundation.layout.InterfaceC20611q1;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FlexRowComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/q1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/q1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class m extends N implements Y41.q<InterfaceC20611q1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.component.flexlayout.state.b f335942l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f335943m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f335944n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f335945o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.avito.beduin.v2.component.flexlayout.state.b bVar, boolean z12, boolean z13, boolean z14) {
        super(3);
        this.f335942l = bVar;
        this.f335943m = z12;
        this.f335944n = z13;
        this.f335945o = z14;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20611q1 interfaceC20611q1, A a12, Integer num) {
        InterfaceC20611q1 interfaceC20611q12 = interfaceC20611q1;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20611q12) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.avito.beduin.v2.component.flexlayout.state.b bVar = this.f335942l;
            i.a(bVar.f335733b, androidx.compose.runtime.internal.r.c(-204586498, new l(bVar, this.f335943m, this.f335944n, this.f335945o, interfaceC20611q12), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
