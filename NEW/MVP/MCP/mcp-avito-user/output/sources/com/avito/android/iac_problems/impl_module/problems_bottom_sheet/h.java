package com.avito.android.iac_problems.impl_module.problems_bottom_sheet;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_analytics.public_module.analytics_models.MicAccessScenario;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.IacProblemsBottomSheetFragment;
import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import com.avito.android.iac_util_deeplinks.public_module.OpenSystemSettingsLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import com.avito.android.iac_util_deeplinks.public_module.SetFlowResultLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.V2;
import eM.b;
import io.reactivex.rxjava3.internal.operators.observable.S;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nJ.J;
import tM.C48576a;

/* compiled from: IacProblemsBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LeM/b;", "it", "Lkotlin/G0;", "emit", "(LeM/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IacProblemsBottomSheetFragment f168899b;

    public h(IacProblemsBottomSheetFragment iacProblemsBottomSheetFragment) {
        this.f168899b = iacProblemsBottomSheetFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.avito.android.remote.model.ParametrizedEvent, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.avito.android.iac_problems.impl_module.problems_bottom_sheet.e] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        eM.b bVar = (eM.b) obj;
        IacProblemsBottomSheetFragment.a aVar = IacProblemsBottomSheetFragment.f168849t0;
        IacProblemsBottomSheetFragment iacProblemsBottomSheetFragment = this.f168899b;
        if (L.f(bVar, b.a.f395122a)) {
            iacProblemsBottomSheetFragment.f5(IacProblemBottomSheetDialogResult.f168845b);
            com.avito.android.lib.design.bottom_sheet.d dVar = iacProblemsBottomSheetFragment.f168858o0;
            if (dVar != null) {
                dVar.r();
            }
        } else {
            if (L.f(bVar, b.C11073b.f395123a)) {
                e eVar = iacProblemsBottomSheetFragment.f168856m0;
                (eVar != null ? eVar : null).b();
            } else if (L.f(bVar, b.c.f395124a)) {
                e eVar2 = iacProblemsBottomSheetFragment.f168856m0;
                (eVar2 != null ? eVar2 : null).a();
            } else if (L.f(bVar, b.d.f395125a)) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = iacProblemsBottomSheetFragment.f168854k0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, new IacMiuiDisplayOnLockedScreenPermissionLink("problems"), null, null, 6);
            } else if (L.f(bVar, b.e.f395126a)) {
                e eVar3 = iacProblemsBottomSheetFragment.f168856m0;
                (eVar3 != null ? eVar3 : 0).c();
            } else if (L.f(bVar, b.f.f395127a)) {
                iacProblemsBottomSheetFragment.f5(IacProblemBottomSheetDialogResult.f168846c);
            } else if (L.f(bVar, b.g.f395128a)) {
                String str = "requestMicOnProblemsBottomSheet_" + IacProblemsBottomSheetFragment.f168850u0.incrementAndGet();
                V2.f318762a.c("IacProblemsBottomSheetFragment", str + " started", null);
                PermissionSystemRequestLink.ResultValue resultValue = PermissionSystemRequestLink.ResultValue.f169265b;
                PermissionSystemRequestLink.ResultValue resultValue2 = PermissionSystemRequestLink.ResultValue.f169267d;
                PermissionSystemRequestLink.ResultValue resultValue3 = PermissionSystemRequestLink.ResultValue.f169268e;
                PermissionSystemRequestLink.ResultValue resultValue4 = PermissionSystemRequestLink.ResultValue.f169269f;
                Map mapG = P0.g(new Q("nextKeyOnFinished", C42745f0.U(resultValue, resultValue2, resultValue3, resultValue4)), new Q("nextKeyOnNeedToRouteToSettings", Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169266c)));
                Map mapG2 = P0.g(new Q("nextKeyOnFinished", new SetFlowResultLink("flowResultKeyFinished")), new Q("nextKeyOnNeedToRouteToSettings", new OpenSystemSettingsLink(new SetFlowResultLink("flowResultKeyRoutedToSettings"), , 2, )));
                Map mapG3 = P0.g(new Q("analyticKeyTrackSystemRequestGranted", Collections.singletonList(resultValue2)), new Q("analyticKeyTrackSystemRequestDenied", C42745f0.U(resultValue3, resultValue4)));
                MicAccessScenario micAccessScenario = MicAccessScenario.f164300m;
                PermissionSystemRequestLink permissionSystemRequestLink = new PermissionSystemRequestLink("android.permission.RECORD_AUDIO", (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) mapG, (Map<String, ? extends DeepLink>) mapG2, (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) mapG3, (Map<String, ParametrizedEvent>) P0.g(new Q("analyticKeyTrackSystemRequestGranted", C48576a.a(new J(true, micAccessScenario, null, null, null, null, 60, null))), new Q("analyticKeyTrackSystemRequestDenied", C48576a.a(new J(false, micAccessScenario, null, null, null, null, 60, null)))));
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = iacProblemsBottomSheetFragment.f168854k0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                iacProblemsBottomSheetFragment.f168860q0.b(A1.i(new S(aVar3.V9().N(new i(str))), null, new j(str, iacProblemsBottomSheetFragment), 3));
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = iacProblemsBottomSheetFragment.f168854k0;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.a.a(aVar4, permissionSystemRequestLink, str, null, 4);
            }
        }
        return G0.f406611a;
    }
}
