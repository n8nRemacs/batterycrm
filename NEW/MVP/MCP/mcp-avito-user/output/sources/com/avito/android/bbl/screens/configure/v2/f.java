package com.avito.android.bbl.screens.configure.v2;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import com.avito.android.bbl.screens.configure.v2.BblConfigureV2Fragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BblConfigureV2Fragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BblConfigureV2Fragment f99322l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ah.c f99323m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BblConfigureV2Fragment bblConfigureV2Fragment, Ah.c cVar) {
        super(2);
        this.f99322l = bblConfigureV2Fragment;
        this.f99323m = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            a13.C(1464108869);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = U2.a(0);
                a13.H(objT);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            a13.h();
            BblConfigureV2Fragment.a aVar = BblConfigureV2Fragment.f99264C0;
            BblConfigureV2Fragment bblConfigureV2Fragment = this.f99322l;
            bblConfigureV2Fragment.r5().addOnLayoutChangeListener(new d(0, interfaceC22196w1, bblConfigureV2Fragment));
            Ah.c cVar = this.f99323m;
            com.avito.android.bbl.screens.configure.v2.ui.items.cards.g.a(cVar.f578h, interfaceC22196w1.e(), new e(bblConfigureV2Fragment), cVar.f579i, a13, 4104);
        }
        return G0.f406611a;
    }
}
