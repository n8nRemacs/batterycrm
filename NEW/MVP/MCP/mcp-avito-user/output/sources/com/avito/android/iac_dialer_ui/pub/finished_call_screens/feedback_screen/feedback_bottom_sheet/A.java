package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet;

import android.annotation.SuppressLint;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import com.akita.compose.component.bottom_sheet.H;
import com.akita.compose.component.bottom_sheet.I;
import com.akita.compose.component.bottom_sheet.N;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIFeedbackBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "manualProblemText", "", "addBottomSheetInComposition", "Lcom/avito/android/iac_dialer_ui/pub/finished_call_screens/feedback_screen/feedback_bottom_sheet/IacUIFeedbackBottomSheetState;", VoiceInfo.STATE, "_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public static final IacUIFeedbackBottomSheetState f167550a = new IacUIFeedbackBottomSheetState(1, true, C42745f0.U("Прерывистый звук", "Звонок прервался", "Собеседник не слышит меня", "Слышу свой голос", "Шум", "Не слышу собеседника", "Очень тихо"), 2);

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState, @Y61.k C43108m c43108m, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.l lVar3, @Y61.l androidx.compose.runtime.A a12, int i12) {
        B bE2 = a12.E(-975344267);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        bE2.C(-2107396573);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22126m3.g("");
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        Object objI = com.akita.compose.component.accordion.s.i(-2107394298, bE2, false);
        if (objI == obj) {
            objI = C22126m3.g(Boolean.FALSE);
            bE2.H(objI);
        }
        InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objI;
        bE2.X(false);
        Object objT2 = bE2.t();
        if (objT2 == obj) {
            objT2 = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT2);
        }
        T t12 = (T) objT2;
        I iA2 = N.a(false, 0.0f, bE2, 0, 7);
        bE2.C(-2107388729);
        boolean zB2 = bE2.B(t12) | bE2.B(iA2);
        Object objT3 = bE2.t();
        if (zB2 || objT3 == obj) {
            objT3 = new n(iA2, t12);
            bE2.H(objT3);
        }
        Y41.a aVar2 = (Y41.a) objT3;
        bE2.X(false);
        C22187u0.d(new g(c43108m, iA2, interfaceC22204y12, null), bE2, c43108m);
        if (!((Boolean) interfaceC22204y12.getF42167b()).booleanValue()) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new h(iacUIFeedbackBottomSheetState, c43108m, lVar, lVar2, lVar3, aVar, i12);
                return;
            }
            return;
        }
        bE2.C(-2107360164);
        boolean z12 = (((i12 & 896) ^ 384) > 256 && bE2.B(lVar)) || (i12 & 384) == 256;
        Object objT4 = bE2.t();
        if (z12 || objT4 == obj) {
            objT4 = new i(lVar, interfaceC22204y12, interfaceC22204y1);
            bE2.H(objT4);
        }
        bE2.X(false);
        H.a((Y41.a) objT4, aVar, iA2, null, null, null, null, false, false, null, null, null, androidx.compose.runtime.internal.r.c(2121089109, new k(iacUIFeedbackBottomSheetState, aVar2, lVar2, lVar3, interfaceC22204y1), bE2), bE2, 0, 384, 4088);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new l(iacUIFeedbackBottomSheetState, c43108m, lVar, lVar2, lVar3, aVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.foundation.layout.J r38, com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet.IacUIFeedbackBottomSheetState r39, java.lang.String r40, Y41.l r41, Y41.a r42, Y41.l r43, Y41.l r44, Y41.a r45, androidx.compose.ui.v r46, androidx.compose.runtime.A r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet.A.b(androidx.compose.foundation.layout.J, com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet.IacUIFeedbackBottomSheetState, java.lang.String, Y41.l, Y41.a, Y41.l, Y41.l, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }
}
