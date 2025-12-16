package com.avito.android.travel_onboarding.ui.items;

import android.content.Context;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConditionsHeader.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class H extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f302372l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.tooltip.t f302373m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(kotlinx.coroutines.T t12, com.akita.compose.component.tooltip.t tVar) {
        super(2);
        this.f302372l = t12;
        this.f302373m = tVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(C35835l0.j(R.attr.ic_help20, (Context) a13.o(AndroidCompositionLocals_androidKt.f41069b)), 0, a13);
            U.a aVar = androidx.compose.ui.graphics.U.f39332b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            androidx.compose.ui.graphics.F fA2 = U.a.a(aVar, com.akita.compose.theme.re23.b.f63984b.f63894W.c(a13));
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            C20806p1.a(eVarA, null, C21086w0.b(C20588k2.o(androidx.compose.ui.v.f42878y1, 20), null, null, false, null, new G(this.f302372l, this.f302373m), 28), null, null, 0.0f, fA2, a13, 56, 56);
        }
        return G0.f406611a;
    }
}
