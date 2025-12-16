package com.avito.android.mortgage.person_form.suggestion;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestionScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class A extends N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f201340l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(Y41.a<G0> aVar) {
        super(3);
        this.f201340l = (N) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [Y41.a, java.lang.Object, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, 0.0f, 4, 7);
            a13.C(-855987020);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = androidx.compose.foundation.interaction.l.a();
                a13.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            a13.h();
            a13.C(-855989853);
            ?? r32 = this.f201340l;
            boolean zB2 = a13.B(r32);
            Object objT2 = a13.t();
            if (zB2 || objT2 == obj) {
                objT2 = new z(r32);
                a13.H(objT2);
            }
            a13.h();
            u.b(C21086w0.b(vVarM, mVar, null, false, null, (Y41.a) objT2, 28), a13, 0);
        }
        return G0.f406611a;
    }
}
