package com.akita.compose.component.modal;

import androidx.compose.foundation.O1;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.S;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class y extends N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f62144l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f62145m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f62146n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(C c12, Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar2) {
        super(3);
        this.f62144l = c12;
        this.f62145m = pVar;
        this.f62146n = pVar2;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            S.a(O1.f26808a.b(null), androidx.compose.runtime.internal.r.c(-116566715, new x(a2.a(a13), this.f62144l, this.f62145m, this.f62146n), a13), a13, 56);
        }
        return G0.f406611a;
    }
}
