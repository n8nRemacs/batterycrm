package com.avito.android.mortgage.sending_confirm;

import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.toggle.ToggleState;
import com.akita.compose.component.toggle.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SendingConfirmContentScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f203508l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f203509m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f203510n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z12, boolean z13, Y41.l<? super Boolean, G0> lVar) {
        super(2);
        this.f203508l = z12;
        this.f203509m = z13;
        this.f203510n = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            ToggleState toggleState = this.f203508l ? ToggleState.f63313d : ToggleState.f63311b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.toggle.j.b(this.f203509m, this.f203510n, u.a(com.akita.compose.theme.re23.b.m(a13).getF66432c().f61954f, 4, null, 65527), null, toggleState, null, a13, 0, 104);
        }
        return G0.f406611a;
    }
}
