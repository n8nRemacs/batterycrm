package yK;

import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import xK.InterfaceC49853c;

/* compiled from: IacEvent_To_IacCallScreenDialerMediatorEvent_Mapper.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LyK/b;", "LJK/j;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "LxK/c;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yK.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50123b implements j<IacEvent, InterfaceC49853c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C50123b f443029b = new C50123b();

    @Override // JK.j
    public final InterfaceC49853c b(IacEvent iacEvent) {
        InterfaceC49853c gVar;
        IacEvent iacEvent2 = iacEvent;
        if (!(iacEvent2 instanceof IacEvent.CallScreen)) {
            return null;
        }
        IacEvent.CallScreen callScreen = (IacEvent.CallScreen) iacEvent2;
        if (callScreen instanceof IacEvent.CallScreen.WaitBottomSheet) {
            IacEvent.CallScreen.WaitBottomSheet waitBottomSheet = (IacEvent.CallScreen.WaitBottomSheet) iacEvent2;
            if (waitBottomSheet instanceof IacEvent.CallScreen.WaitBottomSheet.DisplayWaitDialingBottomSheet) {
                return InterfaceC49853c.h.b.f442393a;
            }
            if (waitBottomSheet instanceof IacEvent.CallScreen.WaitBottomSheet.DisplayWaitGsmBottomSheet) {
                return InterfaceC49853c.h.C12867c.f442394a;
            }
            if (waitBottomSheet instanceof IacEvent.CallScreen.WaitBottomSheet.DisplayWaitRingingBottomSheet) {
                return InterfaceC49853c.h.d.f442395a;
            }
            if (waitBottomSheet instanceof IacEvent.CallScreen.WaitBottomSheet.CloseAnyWaitBottomSheet) {
                return InterfaceC49853c.h.a.f442392a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (callScreen instanceof IacEvent.CallScreen.ActiveFallbackDialog) {
            IacEvent.CallScreen.ActiveFallbackDialog activeFallbackDialog = (IacEvent.CallScreen.ActiveFallbackDialog) iacEvent2;
            if (activeFallbackDialog instanceof IacEvent.CallScreen.ActiveFallbackDialog.DisplayActiveFallbackDialog) {
                return InterfaceC49853c.a.C12865a.f442378a;
            }
            if (activeFallbackDialog instanceof IacEvent.CallScreen.ActiveFallbackDialog.CloseActiveFallbackDialog) {
                return InterfaceC49853c.a.b.f442379a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (callScreen instanceof IacEvent.CallScreen.CloseScreenAfterUnsuitableEmptyArgument) {
            return InterfaceC49853c.b.f442380a;
        }
        if (callScreen instanceof IacEvent.CallScreen.RequestCameraPermission) {
            IacEvent.CallScreen.RequestCameraPermission requestCameraPermission = (IacEvent.CallScreen.RequestCameraPermission) iacEvent2;
            gVar = new InterfaceC49853c.e(requestCameraPermission.isInCall(), requestCameraPermission.getCallId(), requestCameraPermission.getScenario(), requestCameraPermission.getItemId(), requestCameraPermission.getDirection());
        } else if (callScreen instanceof IacEvent.CallScreen.RequestMicPermission) {
            IacEvent.CallScreen.RequestMicPermission requestMicPermission = (IacEvent.CallScreen.RequestMicPermission) iacEvent2;
            gVar = new InterfaceC49853c.f(requestMicPermission.getCallId(), requestMicPermission.getScenario(), requestMicPermission.getItemId(), requestMicPermission.getDirection());
        } else {
            if (!(callScreen instanceof IacEvent.CallScreen.RunDeepLinkInAppActivityTask)) {
                if (callScreen instanceof IacEvent.CallScreen.OpenAudioDevicesBottomSheet) {
                    return InterfaceC49853c.C12866c.f442381a;
                }
                throw new NoWhenBranchMatchedException();
            }
            gVar = new InterfaceC49853c.g(((IacEvent.CallScreen.RunDeepLinkInAppActivityTask) iacEvent2).getDeeplink());
        }
        return gVar;
    }
}
