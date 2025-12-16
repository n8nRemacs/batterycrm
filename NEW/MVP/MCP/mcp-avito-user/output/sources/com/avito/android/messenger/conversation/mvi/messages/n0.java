package com.avito.android.messenger.conversation.mvi.messages;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;

/* compiled from: MessageListView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q0 f193042l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ComposeView composeView, q0 q0Var) {
        super(2);
        this.f193042l = q0Var;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        InterfaceC22204y1 interfaceC22204y1J;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            a13.C(858842746);
            q0 q0Var = this.f193042l;
            if (q0Var.f193109g != null) {
                a13.C(-505665487);
                a13.C(-1124689423);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = C22126m3.g(new g0.c(new g0.a.c((List) q0Var.f193109g.invoke(), new g0.a.c.InterfaceC5705a.C5706a(0), false, null), false));
                    a13.H(objT);
                }
                interfaceC22204y1J = (InterfaceC22204y1) objT;
                a13.h();
                a13.h();
            } else {
                a13.C(-505507542);
                Z1<g0.c> z12 = q0Var.f193115m;
                a13.C(1129822464);
                interfaceC22204y1J = C22126m3.j(z12.getValue(), z12, new r0(q0Var, z12, null), a13);
                a13.h();
                a13.h();
            }
            a13.h();
            com.avito.android.analytics.screens.compose.q.b(q0Var.f193113k, androidx.compose.runtime.internal.r.c(-1643941690, new m0(interfaceC22204y1J, q0Var), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
