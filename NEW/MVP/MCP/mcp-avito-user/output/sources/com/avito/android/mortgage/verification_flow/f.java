package com.avito.android.mortgage.verification_flow;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import s10.InterfaceC47958b;

/* compiled from: VerificationFlowFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f203880l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ VerificationFlowFragment f203881m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC22204y1 interfaceC22204y1, VerificationFlowFragment verificationFlowFragment) {
        super(2);
        this.f203880l = interfaceC22204y1;
        this.f203881m = verificationFlowFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            VerificationFlowFragment verificationFlowFragment = this.f203881m;
            InterfaceC43160i<InterfaceC47958b> events = ((u) verificationFlowFragment.f203848o0.getValue()).getEvents();
            a13.C(-1486397981);
            Object objT = a13.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new a(verificationFlowFragment);
                a13.H(objT);
            }
            Y41.a aVar = (Y41.a) objT;
            a13.h();
            a13.C(-1486394768);
            Object objT2 = a13.t();
            if (objT2 == c1651a) {
                objT2 = new b(verificationFlowFragment);
                a13.H(objT2);
            }
            Y41.l lVar = (Y41.l) objT2;
            a13.h();
            a13.C(-1486391086);
            Object objT3 = a13.t();
            if (objT3 == c1651a) {
                objT3 = new c(verificationFlowFragment);
                a13.H(objT3);
            }
            Y41.l lVar2 = (Y41.l) objT3;
            a13.h();
            a13.C(-1486387549);
            Object objT4 = a13.t();
            if (objT4 == c1651a) {
                d dVar = new d(0, verificationFlowFragment, VerificationFlowFragment.class, "goBack", "goBack()V", 0);
                a13.H(dVar);
                objT4 = dVar;
            }
            a13.h();
            Y41.a aVar2 = (Y41.a) ((kotlin.reflect.i) objT4);
            a13.C(-1486385205);
            Object objT5 = a13.t();
            if (objT5 == c1651a) {
                e eVar = new e(1, verificationFlowFragment, VerificationFlowFragment.class, "handleDeeplink", "handleDeeplink(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0);
                a13.H(eVar);
                objT5 = eVar;
            }
            a13.h();
            t.a(this.f203880l, events, aVar, lVar, lVar2, aVar2, (Y41.l) ((kotlin.reflect.i) objT5), a13, 1797568);
        }
        return G0.f406611a;
    }
}
