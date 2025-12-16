package com.avito.android.iac_dialer.impl_module.screens.call_screen.permission;

import Y61.l;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_analytics.public_module.analytics_models.MicAccessScenario;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_util_deeplinks.public_module.ClickStreamLocalLink;
import com.avito.android.iac_util_deeplinks.public_module.OpenSystemSettingsLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import com.avito.android.iac_util_deeplinks.public_module.SetFlowResultLink;
import com.avito.android.remote.model.ParametrizedEvent;
import io.reactivex.rxjava3.internal.operators.observable.S;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import nJ.C44274i;
import nJ.H;
import nJ.I;
import nJ.J;
import tM.C48576a;
import xK.InterfaceC49851a;

/* compiled from: IacCallScreenPermissionRequesterImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/permission/b;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/permission/a;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final AtomicInteger f166266e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f166267a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49851a f166268b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Resources f166269c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f166270d = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: IacCallScreenPermissionRequesterImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/permission/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "uniqueCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacCallScreenPermissionRequesterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C4935b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166271a;

        static {
            int[] iArr = new int[IacCallDirection.values().length];
            try {
                iArr[IacCallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacCallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166271a = iArr;
        }
    }

    static {
        new a(null);
        f166266e = new AtomicInteger(0);
    }

    @Inject
    public b(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC49851a interfaceC49851a, @Y61.k Resources resources) {
        this.f166267a = aVar;
        this.f166268b = interfaceC49851a;
        this.f166269c = resources;
    }

    public final void a(boolean z12, @Y61.k String str, @Y61.k String str2, @l String str3, @Y61.k IacCallDirection iacCallDirection) throws Resources.NotFoundException {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f166267a;
        AtomicInteger atomicInteger = f166266e;
        io.reactivex.rxjava3.disposables.c cVar = this.f166270d;
        Resources resources = this.f166269c;
        if (z12) {
            String str4 = "requestCameraInCall_" + atomicInteger.incrementAndGet();
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallScreenPermissionRequester", str4 + " started", null);
            PermissionSystemRequestLink.ResultValue resultValue = PermissionSystemRequestLink.ResultValue.f169265b;
            PermissionSystemRequestLink.ResultValue resultValue2 = PermissionSystemRequestLink.ResultValue.f169267d;
            Q q12 = new Q("next_key_on_granted", C42745f0.U(resultValue, resultValue2));
            PermissionSystemRequestLink.ResultValue resultValue3 = PermissionSystemRequestLink.ResultValue.f169268e;
            Q q13 = new Q("next_key_on_denied", Collections.singletonList(resultValue3));
            PermissionSystemRequestLink.ResultValue resultValue4 = PermissionSystemRequestLink.ResultValue.f169269f;
            PermissionSystemRequestLink permissionSystemRequestLink = new PermissionSystemRequestLink("android.permission.CAMERA", (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) P0.g(q12, q13, new Q("next_key_on_forever_denied", Collections.singletonList(resultValue4)), new Q("next_key_on_need_to_ask_for_settings", Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169266c))), (Map<String, ? extends DeepLink>) P0.g(new Q("next_key_on_granted", new SetFlowResultLink("flow_result_key_granted")), new Q("next_key_on_denied", new SetFlowResultLink("flow_result_key_denied")), new Q("next_key_on_forever_denied", new SetFlowResultLink("flow_result_key_forever_denied")), new Q("next_key_on_need_to_ask_for_settings", new DialogDeepLink(DialogDeepLink.ControlsDirection.f133264b, false, false, null, C42745f0.U(new DialogDeepLink.DialogButton(new SetFlowResultLink("flow_result_key_forever_denied"), resources.getString(R.string.iac_dialer_impl_camera_in_call_dialog_btn_cancel), DialogDeepLink.DialogButtonStyle.SECONDARY), new DialogDeepLink.DialogButton(new PermissionSystemSettingsLink("android.permission.CAMERA", C42745f0.U(new Q(C42745f0.U(PermissionSystemSettingsLink.ResultValue.f169279b, PermissionSystemSettingsLink.ResultValue.f169280c), new SetFlowResultLink("flow_result_key_granted")), new Q(Collections.singletonList(PermissionSystemSettingsLink.ResultValue.f169281d), new SetFlowResultLink("flow_result_key_forever_denied"))), (List) null, (ParametrizedEvent) null, 12, (C42822w) null), resources.getString(R.string.iac_dialer_impl_camera_in_call_dialog_btn_settings), DialogDeepLink.DialogButtonStyle.PRIMARY)), resources.getString(R.string.iac_dialer_impl_camera_in_call_dialog_title), null, null, null, null, 968, null))), (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) P0.g(new Q("analytic_key_track_granted", Collections.singletonList(resultValue2)), new Q("analytic_key_track_denied", C42745f0.U(resultValue3, resultValue4))), (Map<String, ParametrizedEvent>) P0.g(new Q("analytic_key_track_granted", C48576a.a(new C44274i(str2, str3 == null ? "" : str3, str, true))), new Q("analytic_key_track_denied", C48576a.a(new C44274i(str2, str3 == null ? "" : str3, str, false)))));
            cVar.b(A1.i(new S(aVar.V9().N(new c(str4))), null, new d(str4, this, str), 3));
            b.a.a(aVar, permissionSystemRequestLink, str4, null, 4);
            return;
        }
        String str5 = "requestCameraInPreconditions_" + atomicInteger.incrementAndGet();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallScreenPermissionRequester", str5 + " started", null);
        PermissionSystemRequestLink.ResultValue resultValue5 = PermissionSystemRequestLink.ResultValue.f169265b;
        PermissionSystemRequestLink.ResultValue resultValue6 = PermissionSystemRequestLink.ResultValue.f169267d;
        Q q14 = new Q("next_key_on_granted", C42745f0.U(resultValue5, resultValue6));
        PermissionSystemRequestLink.ResultValue resultValue7 = PermissionSystemRequestLink.ResultValue.f169268e;
        Q q15 = new Q("next_key_on_denied", Collections.singletonList(resultValue7));
        PermissionSystemRequestLink.ResultValue resultValue8 = PermissionSystemRequestLink.ResultValue.f169269f;
        PermissionSystemRequestLink permissionSystemRequestLink2 = new PermissionSystemRequestLink("android.permission.CAMERA", (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) P0.g(q14, q15, new Q("next_key_on_forever_denied", Collections.singletonList(resultValue8)), new Q("next_key_on_need_to_ask_for_settings", Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169266c))), (Map<String, ? extends DeepLink>) P0.g(new Q("next_key_on_granted", new SetFlowResultLink("flow_result_key_granted")), new Q("next_key_on_denied", new SetFlowResultLink("flow_result_key_denied")), new Q("next_key_on_forever_denied", new SetFlowResultLink("flow_result_key_forever_denied")), new Q("next_key_on_need_to_ask_for_settings", new DialogDeepLink(DialogDeepLink.ControlsDirection.f133265c, false, false, resources.getString(R.string.iac_dialer_impl_camera_before_call_dialog_body), C42745f0.U(new DialogDeepLink.DialogButton(new OpenSystemSettingsLink(new SetFlowResultLink("flow_result_key_routed_to_settings"), null), resources.getString(R.string.iac_dialer_impl_camera_before_call_dialog_btn_settings), DialogDeepLink.DialogButtonStyle.PRIMARY), new DialogDeepLink.DialogButton(new SetFlowResultLink("flow_result_key_forever_denied"), resources.getString(R.string.iac_dialer_impl_camera_before_call_dialog_btn_cancel), DialogDeepLink.DialogButtonStyle.SECONDARY)), resources.getString(R.string.iac_dialer_impl_camera_before_call_dialog_title), null, null, null, null, 960, null))), (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) P0.g(new Q("analytic_key_track_granted", Collections.singletonList(resultValue6)), new Q("analytic_key_track_denied", C42745f0.U(resultValue7, resultValue8))), (Map<String, ParametrizedEvent>) P0.g(new Q("analytic_key_track_granted", C48576a.a(new C44274i(str2, str3 == null ? "" : str3, str, true))), new Q("analytic_key_track_denied", C48576a.a(new C44274i(str2, str3 == null ? "" : str3, str, false)))));
        cVar.b(A1.i(new S(aVar.V9().N(new e(str5))), null, new f(str5, this, iacCallDirection), 3));
        b.a.a(aVar, permissionSystemRequestLink2, str5, null, 4);
    }

    public final void b(@Y61.k String str, @Y61.k String str2, @l String str3, @Y61.k IacCallDirection iacCallDirection) throws Resources.NotFoundException {
        int i12 = C4935b.f166271a[iacCallDirection.ordinal()];
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f166267a;
        AtomicInteger atomicInteger = f166266e;
        io.reactivex.rxjava3.disposables.c cVar = this.f166270d;
        Resources resources = this.f166269c;
        if (i12 != 1) {
            if (i12 == 2) {
                String str4 = "requestMicInIncomingCallPreconditions_" + atomicInteger.incrementAndGet();
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallScreenPermissionRequester", str4 + " started", null);
                PermissionSystemRequestLink.ResultValue resultValue = PermissionSystemRequestLink.ResultValue.f169266c;
                PermissionSystemRequestLink.ResultValue resultValue2 = PermissionSystemRequestLink.ResultValue.f169268e;
                PermissionSystemRequestLink.ResultValue resultValue3 = PermissionSystemRequestLink.ResultValue.f169269f;
                Map mapSingletonMap = Collections.singletonMap("next_key_on_need_to_show_toast", C42745f0.U(resultValue, resultValue2, resultValue3));
                Map mapSingletonMap2 = Collections.singletonMap("next_key_on_need_to_show_toast", new ToastMessageLink(resources.getString(R.string.iac_dialer_impl_mic_permission_required_incoming), ToastMessageLink.ToastType.f133734c, null, null, null, false, null, 124, null));
                Map mapG = P0.g(new Q("analytic_key_track_granted", Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169267d)), new Q("analytic_key_track_denied", C42745f0.U(resultValue2, resultValue3)));
                MicAccessScenario.f164289b.getClass();
                PermissionSystemRequestLink permissionSystemRequestLink = new PermissionSystemRequestLink("android.permission.RECORD_AUDIO", (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) mapSingletonMap, (Map<String, ? extends DeepLink>) mapSingletonMap2, (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) mapG, (Map<String, ParametrizedEvent>) P0.g(new Q("analytic_key_track_granted", C48576a.a(new J(true, MicAccessScenario.a.a(str2), str3, str, null, null, 48, null))), new Q("analytic_key_track_denied", C48576a.a(new J(false, MicAccessScenario.a.a(str2), str3, str, null, null, 48, null)))));
                cVar.b(A1.i(new S(aVar.V9().N(new g(permissionSystemRequestLink, str4))), null, new h(str4, this), 3));
                b.a.a(aVar, permissionSystemRequestLink, str4, null, 4);
            }
            return;
        }
        String str5 = "requestMicInOutgoingCallPreconditions_" + atomicInteger.incrementAndGet();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacCallScreenPermissionRequester", str5 + " started", null);
        PermissionSystemRequestLink.ResultValue resultValue4 = PermissionSystemRequestLink.ResultValue.f169265b;
        PermissionSystemRequestLink.ResultValue resultValue5 = PermissionSystemRequestLink.ResultValue.f169267d;
        Q q12 = new Q("next_key_on_granted", C42745f0.U(resultValue4, resultValue5));
        PermissionSystemRequestLink.ResultValue resultValue6 = PermissionSystemRequestLink.ResultValue.f169268e;
        Q q13 = new Q("next_key_on_denied", Collections.singletonList(resultValue6));
        PermissionSystemRequestLink.ResultValue resultValue7 = PermissionSystemRequestLink.ResultValue.f169269f;
        Map mapG2 = P0.g(q12, q13, new Q("next_key_on_forever_denied", Collections.singletonList(resultValue7)), new Q("next_key_on_need_to_ask_for_settings", Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169266c)));
        Q q14 = new Q("next_key_on_granted", new SetFlowResultLink("flow_result_key_granted"));
        SetFlowResultLink setFlowResultLink = new SetFlowResultLink("flow_result_key_denied");
        String string = resources.getString(R.string.iac_dialer_impl_mic_permission_required_outgoing);
        ToastMessageLink.ToastType toastType = ToastMessageLink.ToastType.f133734c;
        Q q15 = new Q("next_key_on_denied", new RunMultipleLink(setFlowResultLink, new ToastMessageLink(string, toastType, null, null, null, false, null, 124, null)));
        Q q16 = new Q("next_key_on_forever_denied", new RunMultipleLink(new SetFlowResultLink("flow_result_key_forever_denied"), new ToastMessageLink(resources.getString(R.string.iac_dialer_impl_mic_permission_required_outgoing), toastType, null, null, null, false, null, 124, null)));
        DialogDeepLink.ControlsDirection controlsDirection = DialogDeepLink.ControlsDirection.f133265c;
        String string2 = resources.getString(R.string.iac_dialer_impl_mic_before_call_dialog_title);
        String string3 = resources.getString(R.string.iac_dialer_impl_mic_before_call_dialog_body);
        DialogDeepLink.DialogButtonStyle dialogButtonStyle = DialogDeepLink.DialogButtonStyle.PRIMARY;
        String string4 = resources.getString(R.string.iac_dialer_impl_mic_before_call_dialog_btn_settings);
        SetFlowResultLink setFlowResultLink2 = new SetFlowResultLink("flow_result_key_routed_to_settings");
        CallsPopupType callsPopupType = CallsPopupType.f164277b;
        Map mapG3 = P0.g(q14, q15, q16, new Q("next_key_on_need_to_ask_for_settings", new ClickStreamLocalLink(new I(str3, str), new DialogDeepLink(controlsDirection, false, false, string3, C42745f0.U(new DialogDeepLink.DialogButton(new OpenSystemSettingsLink(setFlowResultLink2, C48576a.a(new H(str3, str))), string4, dialogButtonStyle), new DialogDeepLink.DialogButton(new RunMultipleLink(new SetFlowResultLink("flow_result_key_forever_denied"), new ToastMessageLink(resources.getString(R.string.iac_dialer_impl_mic_permission_required_outgoing), toastType, null, null, null, false, null, 124, null)), resources.getString(R.string.iac_dialer_impl_mic_before_call_dialog_btn_cancel), DialogDeepLink.DialogButtonStyle.SECONDARY)), string2, null, null, null, null, 960, null))));
        Map mapG4 = P0.g(new Q("analytic_key_track_granted", Collections.singletonList(resultValue5)), new Q("analytic_key_track_denied", C42745f0.U(resultValue6, resultValue7)));
        MicAccessScenario.f164289b.getClass();
        PermissionSystemRequestLink permissionSystemRequestLink2 = new PermissionSystemRequestLink("android.permission.RECORD_AUDIO", (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) mapG2, (Map<String, ? extends DeepLink>) mapG3, (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) mapG4, (Map<String, ParametrizedEvent>) P0.g(new Q("analytic_key_track_granted", C48576a.a(new J(true, MicAccessScenario.a.a(str2), str3, str, null, null, 48, null))), new Q("analytic_key_track_denied", C48576a.a(new J(false, MicAccessScenario.a.a(str2), str3, str, null, null, 48, null)))));
        cVar.b(A1.i(new S(aVar.V9().N(new i(str5))), null, new j(str5, this), 3));
        b.a.a(aVar, permissionSystemRequestLink2, str5, null, 4);
    }
}
