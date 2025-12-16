package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet;

import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.C22501m2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIFeedbackBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class k extends N implements Y41.q<J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUIFeedbackBottomSheetState f167575l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167576m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f167577n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f167578o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<String> f167579p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState, Y41.a<G0> aVar, Y41.l<? super Integer, G0> lVar, Y41.l<? super Integer, G0> lVar2, InterfaceC22204y1<String> interfaceC22204y1) {
        super(3);
        this.f167575l = iacUIFeedbackBottomSheetState;
        this.f167576m = aVar;
        this.f167577n = lVar;
        this.f167578o = lVar2;
        this.f167579p = interfaceC22204y1;
    }

    @Override // Y41.q
    public final G0 invoke(J j12, androidx.compose.runtime.A a12, Integer num) {
        J j13 = j12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(j13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState = A.f167550a;
            InterfaceC22204y1<String> interfaceC22204y1 = this.f167579p;
            String f42167b = interfaceC22204y1.getF42167b();
            a13.C(371202922);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new j(interfaceC22204y1);
                a13.H(objT);
            }
            Y41.l lVar = (Y41.l) objT;
            a13.h();
            a13.C(371206672);
            Object obj = this.f167577n;
            boolean zB2 = a13.B(obj);
            Object objT2 = a13.t();
            if (zB2 || objT2 == c1651a) {
                a13.H(obj);
            } else {
                obj = objT2;
            }
            Y41.l lVar2 = (Y41.l) obj;
            a13.h();
            a13.C(371209202);
            Object obj2 = this.f167578o;
            boolean zB3 = a13.B(obj2);
            Object objT3 = a13.t();
            if (zB3 || objT3 == c1651a) {
                a13.H(obj2);
            } else {
                obj2 = objT3;
            }
            a13.h();
            Y41.a<G0> aVar = this.f167576m;
            A.b(j13, this.f167575l, f42167b, lVar, aVar, lVar2, (Y41.l) obj2, aVar, C22501m2.a(androidx.compose.ui.v.f42878y1, "IacUIFinishedFeedbackScreenTestTags.BOTTOM_SHEET_CONTENT_ROOT"), a13, (iIntValue & 14) | 100666432, 0);
        }
        return G0.f406611a;
    }
}
