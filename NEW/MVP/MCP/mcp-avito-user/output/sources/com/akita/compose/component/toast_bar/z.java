package com.akita.compose.component.toast_bar;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.foundation.layout.R1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class z extends N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f63308l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63309m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f63310n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar, InterfaceC27357f interfaceC27357f, J j12) {
        super(3);
        this.f63308l = pVar;
        this.f63309m = interfaceC27357f;
        this.f63310n = j12;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            a13.C(930781218);
            Y41.p<androidx.compose.runtime.A, Integer, G0> pVar = this.f63308l;
            if (pVar != null) {
                pVar.invoke(a13, 0);
                G0 g02 = G0.f406611a;
            }
            a13.h();
            String f167346a = this.f63309m.getF167346a();
            J j12 = this.f63310n;
            com.akita.compose.foundation.ui.p.b(f167346a, j12.f63215a, R1.m(androidx.compose.ui.v.f42878y1, pVar != null ? j12.f63224j : j12.f63220f, 0.0f, 0.0f, j12.f63229o, 6), false, j12.f63218d.c(a13), null, 0, 0, false, null, a13, 0, 1000);
        }
        return G0.f406611a;
    }
}
