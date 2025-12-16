package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import Y41.p;
import androidx.compose.runtime.A;
import com.akita.compose.component.button.t;
import hL0.C40847b;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoprolongReducer.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/button/t;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/button/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements p<A, Integer, t> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C40847b f319557l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C40847b c40847b) {
        super(2);
        this.f319557l = c40847b;
    }

    @Override // Y41.p
    public final t invoke(A a12, Integer num) {
        t tVarA;
        A a13 = a12;
        num.intValue();
        a13.C(483530254);
        String style = this.f319557l.getStyle();
        a13.C(-602733747);
        if (style == null) {
            tVarA = null;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            tVarA = com.akita.compose.theme.re23.style.N.a(com.akita.compose.theme.re23.b.c(a13), style);
        }
        a13.h();
        if (tVarA == null) {
            tVarA = com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13);
        }
        a13.h();
        return tVarA;
    }
}
