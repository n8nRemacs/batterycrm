package yK;

import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.screen.OnScreenArgumentEmptyAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.screen.OnScreenArgumentWithoutActionAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.screen.OnScreenCreatedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.screen.OnScreenDestroyedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.screen.OnScreenStartedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.screen.OnScreenStoppedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.devices.OnAudioDeviceListItemClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.devices.OnChangeAudioDeviceClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.mic.OnToggleMicClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.controls.OnToggleControlsClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.dtmf.OnDtmfButtonClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.dtmf.OnOpenDtmfKeyboardClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.hangup.OnHangupClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.item_clicked.OnItemButtonClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.vpn_toast.OnHideVpnToastClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.rejecting.OnIncomingCallRejectClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.resolving.OnIncomingCameraPermissionResultAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.resolving.OnIncomingMicPermissionResultAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.resolving.OnIncomingRoutedToSystemSettingsAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.waiting.OnIncomingCallAnswerClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.resolving.OnOutgoingCameraPermissionResultAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.resolving.OnOutgoingMicPermissionResultAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.resolving.OnOutgoingRoutedToSystemSettingsAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.OnWaitBottomSheetGsmClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.OnWaitBottomSheetHangupClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.active_fallback.OnActiveFallbackDialogGsmClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.OnChangeCameraClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.OnInCallCameraPermissionResultAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.OnToggleCameraClickedAction;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.permissions.PermissionState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import xK.InterfaceC49852b;

/* compiled from: IacCallScreenDialerMediatorAction_To_IacAction_Mapper.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LyK/a;", "LJK/j;", "LxK/b;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yK.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50122a implements j<InterfaceC49852b, IacAction> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C50122a f443027b = new C50122a();

    /* compiled from: IacCallScreenDialerMediatorAction_To_IacAction_Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yK.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C12898a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f443028a;

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
            f443028a = iArr;
        }
    }

    @Override // JK.j
    public final IacAction b(InterfaceC49852b interfaceC49852b) {
        IacAction onOutgoingMicPermissionResultAction;
        OnWaitBottomSheetHangupClickedAction.FromArg fromArg;
        OnIncomingCallAnswerClickedAction.FromArg fromArg2;
        InterfaceC49852b interfaceC49852b2 = interfaceC49852b;
        if (interfaceC49852b2 instanceof InterfaceC49852b.p) {
            return OnScreenArgumentEmptyAction.INSTANCE;
        }
        if (interfaceC49852b2 instanceof InterfaceC49852b.q) {
            onOutgoingMicPermissionResultAction = new OnScreenArgumentWithoutActionAction(((InterfaceC49852b.q) interfaceC49852b2).f442363a);
        } else if (interfaceC49852b2 instanceof InterfaceC49852b.r) {
            onOutgoingMicPermissionResultAction = new OnScreenCreatedAction(((InterfaceC49852b.r) interfaceC49852b2).f442364a);
        } else if (interfaceC49852b2 instanceof InterfaceC49852b.s) {
            onOutgoingMicPermissionResultAction = new OnScreenDestroyedAction(((InterfaceC49852b.s) interfaceC49852b2).f442365a);
        } else if (interfaceC49852b2 instanceof InterfaceC49852b.t) {
            InterfaceC49852b.t tVar = (InterfaceC49852b.t) interfaceC49852b2;
            onOutgoingMicPermissionResultAction = new OnScreenStartedAction(tVar.f442366a, tVar.f442367b, tVar.f442368c);
        } else if (interfaceC49852b2 instanceof InterfaceC49852b.u) {
            onOutgoingMicPermissionResultAction = new OnScreenStoppedAction(((InterfaceC49852b.u) interfaceC49852b2).f442369a);
        } else if (interfaceC49852b2 instanceof InterfaceC49852b.i) {
            InterfaceC49852b.i.a.C12861a c12861a = InterfaceC49852b.i.a.C12861a.f442351a;
            InterfaceC49852b.i.a aVar = ((InterfaceC49852b.i) interfaceC49852b2).f442350a;
            if (L.f(aVar, c12861a)) {
                fromArg2 = OnIncomingCallAnswerClickedAction.FromCallNotification.INSTANCE;
            } else if (L.f(aVar, InterfaceC49852b.i.a.C12862b.f442352a)) {
                fromArg2 = OnIncomingCallAnswerClickedAction.FromCallScreen.INSTANCE;
            } else {
                if (!L.f(aVar, InterfaceC49852b.i.a.c.f442353a)) {
                    throw new NoWhenBranchMatchedException();
                }
                fromArg2 = OnIncomingCallAnswerClickedAction.FromReserveNotification.INSTANCE;
            }
            onOutgoingMicPermissionResultAction = new OnIncomingCallAnswerClickedAction(fromArg2);
        } else {
            if (interfaceC49852b2 instanceof InterfaceC49852b.j) {
                return new OnIncomingCallRejectClickedAction(OnIncomingCallRejectClickedAction.FromCallScreen.INSTANCE);
            }
            if (interfaceC49852b2 instanceof InterfaceC49852b.f) {
                return new OnHangupClickedAction(OnHangupClickedAction.FromCallScreen.INSTANCE);
            }
            if (interfaceC49852b2 instanceof InterfaceC49852b.k) {
                return OnItemButtonClickedAction.INSTANCE;
            }
            if (interfaceC49852b2 instanceof InterfaceC49852b.C12860b) {
                InterfaceC49852b.C12860b c12860b = (InterfaceC49852b.C12860b) interfaceC49852b2;
                onOutgoingMicPermissionResultAction = new OnAudioDeviceListItemClickedAction(c12860b.f442341a, c12860b.f442342b);
            } else if (interfaceC49852b2 instanceof InterfaceC49852b.c) {
                onOutgoingMicPermissionResultAction = new OnChangeAudioDeviceClickedAction(((InterfaceC49852b.c) interfaceC49852b2).f442343a ? OnChangeAudioDeviceClickedAction.From.f165448c : OnChangeAudioDeviceClickedAction.From.f165449d);
            } else {
                if (interfaceC49852b2 instanceof InterfaceC49852b.x) {
                    return OnToggleMicClickedAction.INSTANCE;
                }
                if (interfaceC49852b2 instanceof InterfaceC49852b.v) {
                    return OnToggleCameraClickedAction.INSTANCE;
                }
                if (interfaceC49852b2 instanceof InterfaceC49852b.d) {
                    return OnChangeCameraClickedAction.INSTANCE;
                }
                if (interfaceC49852b2 instanceof InterfaceC49852b.w) {
                    return OnToggleControlsClickedAction.INSTANCE;
                }
                if (interfaceC49852b2 instanceof InterfaceC49852b.g) {
                    return OnHideVpnToastClickedAction.INSTANCE;
                }
                if (interfaceC49852b2 instanceof InterfaceC49852b.l) {
                    return OnOpenDtmfKeyboardClickedAction.INSTANCE;
                }
                if (interfaceC49852b2 instanceof InterfaceC49852b.e) {
                    onOutgoingMicPermissionResultAction = new OnDtmfButtonClickedAction(((InterfaceC49852b.e) interfaceC49852b2).f442345a);
                } else if (interfaceC49852b2 instanceof InterfaceC49852b.z) {
                    InterfaceC49852b.z.a.C12863a c12863a = InterfaceC49852b.z.a.C12863a.f442375a;
                    InterfaceC49852b.z.a aVar2 = ((InterfaceC49852b.z) interfaceC49852b2).f442374a;
                    if (L.f(aVar2, c12863a)) {
                        fromArg = OnWaitBottomSheetHangupClickedAction.Dialing.INSTANCE;
                    } else if (L.f(aVar2, InterfaceC49852b.z.a.C12864b.f442376a)) {
                        fromArg = OnWaitBottomSheetHangupClickedAction.Gsm.INSTANCE;
                    } else {
                        if (!L.f(aVar2, InterfaceC49852b.z.a.c.f442377a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fromArg = OnWaitBottomSheetHangupClickedAction.Ringing.INSTANCE;
                    }
                    onOutgoingMicPermissionResultAction = new OnWaitBottomSheetHangupClickedAction(fromArg);
                } else {
                    if (interfaceC49852b2 instanceof InterfaceC49852b.y) {
                        return OnWaitBottomSheetGsmClickedAction.INSTANCE;
                    }
                    if (interfaceC49852b2 instanceof InterfaceC49852b.a) {
                        return OnActiveFallbackDialogGsmClickedAction.INSTANCE;
                    }
                    if (interfaceC49852b2 instanceof InterfaceC49852b.h) {
                        InterfaceC49852b.h hVar = (InterfaceC49852b.h) interfaceC49852b2;
                        onOutgoingMicPermissionResultAction = new OnInCallCameraPermissionResultAction(hVar.f442348a, hVar.f442349b);
                    } else if (interfaceC49852b2 instanceof InterfaceC49852b.m) {
                        InterfaceC49852b.m mVar = (InterfaceC49852b.m) interfaceC49852b2;
                        int i12 = C12898a.f443028a[mVar.f442358b.ordinal()];
                        PermissionState permissionState = mVar.f442357a;
                        if (i12 == 1) {
                            onOutgoingMicPermissionResultAction = new OnOutgoingCameraPermissionResultAction(permissionState);
                        } else {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            onOutgoingMicPermissionResultAction = new OnIncomingCameraPermissionResultAction(permissionState);
                        }
                    } else {
                        if (!(interfaceC49852b2 instanceof InterfaceC49852b.n)) {
                            if (!(interfaceC49852b2 instanceof InterfaceC49852b.o)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i13 = C12898a.f443028a[((InterfaceC49852b.o) interfaceC49852b2).f442361a.ordinal()];
                            if (i13 == 1) {
                                return OnOutgoingRoutedToSystemSettingsAction.INSTANCE;
                            }
                            if (i13 == 2) {
                                return OnIncomingRoutedToSystemSettingsAction.INSTANCE;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC49852b.n nVar = (InterfaceC49852b.n) interfaceC49852b2;
                        int i14 = C12898a.f443028a[nVar.f442360b.ordinal()];
                        PermissionState permissionState2 = nVar.f442359a;
                        if (i14 == 1) {
                            onOutgoingMicPermissionResultAction = new OnOutgoingMicPermissionResultAction(permissionState2);
                        } else {
                            if (i14 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            onOutgoingMicPermissionResultAction = new OnIncomingMicPermissionResultAction(permissionState2);
                        }
                    }
                }
            }
        }
        return onOutgoingMicPermissionResultAction;
    }
}
