package com.akita.compose.component.input;

import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.A;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Input.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m extends N implements Y41.q<InterfaceC20640y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f61766l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar) {
        super(3);
        this.f61766l = vVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.spinner.h hVar = this.f61766l.f61846s;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            com.akita.compose.component.spinner.b.a(hVar, interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39080f), a13, 0, 0);
        }
        return G0.f406611a;
    }
}
