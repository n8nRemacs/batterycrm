package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.r;
import com.avito.android.iac_dialer.impl_module.camera.IacCameraPosition;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OnChangeCameraClickedAction.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/OnChangeCameraClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnChangeCameraClickedAction implements IacAction {
    public static final int $stable = 0;

    @k
    public static final OnChangeCameraClickedAction INSTANCE = new OnChangeCameraClickedAction();

    /* compiled from: OnChangeCameraClickedAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165501a;

        static {
            int[] iArr = new int[IacCameraPosition.values().length];
            try {
                iArr[IacCameraPosition.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacCameraPosition.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f165501a = iArr;
        }
    }

    private OnChangeCameraClickedAction() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof OnChangeCameraClickedAction);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -1830269494;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacCameraPosition iacCameraPosition;
        if (!(iacActionProcessing.getState() instanceof IacState.InUse) || !com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.e.b(iacActionProcessing.getState())) {
            com.avito.android.bxcontent.mvi.entity.f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        if (iacActionProcessing.getState().getAppearance().getCamera() == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new r("Can't switch camera cause it is not enabled yet"));
            return;
        }
        IacCameraPosition camera = iacActionProcessing.getState().getAppearance().getCamera();
        int i12 = camera == null ? -1 : a.f165501a[camera.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                iacCameraPosition = IacCameraPosition.BACK;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iacCameraPosition = IacCameraPosition.FRONT;
            }
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.SwitchCamera(iacCameraPosition));
        }
    }

    @k
    public String toString() {
        return "OnChangeCameraClickedAction";
    }
}
