package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState;
import com.avito.android.permissions.PermissionState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import nJ.C44269d;

/* compiled from: IacFinishedMicRequestScreenReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p implements u<IacFinishedMicRequestScreenInternalAction, IacFinishedMicRequestScreenState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f166806b;

    /* compiled from: IacFinishedMicRequestScreenReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionState permissionState = PermissionState.f215104b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionState permissionState2 = PermissionState.f215104b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public p(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f166806b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final IacFinishedMicRequestScreenState a(IacFinishedMicRequestScreenInternalAction iacFinishedMicRequestScreenInternalAction, IacFinishedMicRequestScreenState iacFinishedMicRequestScreenState) {
        IacFinishedMicRequestScreenState.Granted granted;
        IacFinishedMicRequestScreenInternalAction iacFinishedMicRequestScreenInternalAction2 = iacFinishedMicRequestScreenInternalAction;
        IacFinishedMicRequestScreenState iacFinishedMicRequestScreenState2 = iacFinishedMicRequestScreenState;
        if (iacFinishedMicRequestScreenInternalAction2 instanceof IacFinishedMicRequestScreenInternalAction.SendEvent) {
            return iacFinishedMicRequestScreenState2;
        }
        if (iacFinishedMicRequestScreenInternalAction2 instanceof IacFinishedMicRequestScreenInternalAction.InitScreen) {
            int iOrdinal = ((IacFinishedMicRequestScreenInternalAction.InitScreen) iacFinishedMicRequestScreenInternalAction2).f166774b.ordinal();
            if (iOrdinal != 0) {
                InterfaceC28373a interfaceC28373a = this.f166806b;
                if (iOrdinal == 1) {
                    interfaceC28373a.c(new C44269d(iacFinishedMicRequestScreenState2.getArgument().getCallId(), Boolean.TRUE));
                    return new IacFinishedMicRequestScreenState.Requesting(true, false, iacFinishedMicRequestScreenState2.getArgument());
                }
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC28373a.c(new C44269d(iacFinishedMicRequestScreenState2.getArgument().getCallId(), Boolean.FALSE));
                return new IacFinishedMicRequestScreenState.Requesting(false, false, iacFinishedMicRequestScreenState2.getArgument());
            }
            granted = new IacFinishedMicRequestScreenState.Granted(iacFinishedMicRequestScreenState2.getArgument());
        } else {
            if (iacFinishedMicRequestScreenInternalAction2 instanceof IacFinishedMicRequestScreenInternalAction.RouteToAppSettings) {
                return !(iacFinishedMicRequestScreenState2 instanceof IacFinishedMicRequestScreenState.Requesting) ? iacFinishedMicRequestScreenState2 : IacFinishedMicRequestScreenState.Requesting.copy$default((IacFinishedMicRequestScreenState.Requesting) iacFinishedMicRequestScreenState2, false, true, null, 5, null);
            }
            if (!(iacFinishedMicRequestScreenInternalAction2 instanceof IacFinishedMicRequestScreenInternalAction.OnMicPermissionGranted)) {
                if (iacFinishedMicRequestScreenInternalAction2 instanceof IacFinishedMicRequestScreenInternalAction.HandleDeeplink) {
                    return iacFinishedMicRequestScreenState2;
                }
                throw new NoWhenBranchMatchedException();
            }
            granted = new IacFinishedMicRequestScreenState.Granted(iacFinishedMicRequestScreenState2.getArgument());
        }
        return granted;
    }
}
