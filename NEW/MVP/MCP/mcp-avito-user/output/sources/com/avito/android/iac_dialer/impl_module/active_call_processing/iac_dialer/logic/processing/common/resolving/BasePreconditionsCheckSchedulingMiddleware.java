package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.p;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: BasePreconditionsCheckSchedulingMiddleware.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckSchedulingMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckSchedulingMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "", "isResolvingState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Z", "isStepNotChecked", "isStepRoutedToSystemSettingsForPermissions", "", "preconditionScreenId", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)I", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "createCheckPreconditionAction", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckSchedulingMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckSchedulingMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckSchedulingMiddleware$Payload;)V", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface BasePreconditionsCheckSchedulingMiddleware extends IacMiddlewareDistinctBy<Payload> {

    /* compiled from: BasePreconditionsCheckSchedulingMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckSchedulingMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "isNotChecked", "", "isScreenStarted", "screenId", "", "(ZZI)V", "()Z", "getScreenId", "()I", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 0;
        private final boolean isNotChecked;
        private final boolean isScreenStarted;
        private final int screenId;

        public Payload(boolean z12, boolean z13, int i12) {
            this.isNotChecked = z12;
            this.isScreenStarted = z13;
            this.screenId = i12;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z12, boolean z13, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z12 = payload.isNotChecked;
            }
            if ((i13 & 2) != 0) {
                z13 = payload.isScreenStarted;
            }
            if ((i13 & 4) != 0) {
                i12 = payload.screenId;
            }
            return payload.copy(z12, z13, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsNotChecked() {
            return this.isNotChecked;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsScreenStarted() {
            return this.isScreenStarted;
        }

        /* renamed from: component3, reason: from getter */
        public final int getScreenId() {
            return this.screenId;
        }

        @k
        public final Payload copy(boolean isNotChecked, boolean isScreenStarted, int screenId) {
            return new Payload(isNotChecked, isScreenStarted, screenId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.isNotChecked == payload.isNotChecked && this.isScreenStarted == payload.isScreenStarted && this.screenId == payload.screenId;
        }

        public final int getScreenId() {
            return this.screenId;
        }

        public int hashCode() {
            return Integer.hashCode(this.screenId) + r.i(Boolean.hashCode(this.isNotChecked) * 31, 31, this.isScreenStarted);
        }

        public final boolean isNotChecked() {
            return this.isNotChecked;
        }

        public final boolean isScreenStarted() {
            return this.isScreenStarted;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Payload(isNotChecked=");
            sb2.append(this.isNotChecked);
            sb2.append(", isScreenStarted=");
            sb2.append(this.isScreenStarted);
            sb2.append(", screenId=");
            return r.t(sb2, this.screenId, ')');
        }
    }

    /* compiled from: BasePreconditionsCheckSchedulingMiddleware.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(@k BasePreconditionsCheckSchedulingMiddleware basePreconditionsCheckSchedulingMiddleware, @k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
            if (basePreconditionsCheckSchedulingMiddleware.isResolvingState(iacMiddlewareProcessing.getNewState())) {
                if (!payload.isNotChecked() && payload2.isNotChecked()) {
                    iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new p("IacPreconditionState became NotChecked - lets recheck preconditions"));
                    iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), basePreconditionsCheckSchedulingMiddleware.createCheckPreconditionAction());
                    return;
                }
                if (payload.isScreenStarted() || !payload2.isScreenStarted()) {
                    return;
                }
                if (basePreconditionsCheckSchedulingMiddleware.isStepRoutedToSystemSettingsForPermissions(iacMiddlewareProcessing.getNewState())) {
                    iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new p("We just returned from system settings permissions - lets recheck preconditions"));
                    iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), basePreconditionsCheckSchedulingMiddleware.createCheckPreconditionAction());
                } else if (basePreconditionsCheckSchedulingMiddleware.preconditionScreenId(iacMiddlewareProcessing.getNewState()) != payload2.getScreenId()) {
                    iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new p("Screen is recreated during preconditions resolving - lets recheck preconditions"));
                    iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), basePreconditionsCheckSchedulingMiddleware.createCheckPreconditionAction());
                }
            }
        }
    }

    @k
    IacAction createCheckPreconditionAction();

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    /* synthetic */ String getName();

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @k
    Payload getPayloadFromState(@k IacState state);

    boolean isResolvingState(@k IacState state);

    boolean isStepNotChecked(@k IacState state);

    boolean isStepRoutedToSystemSettingsForPermissions(@k IacState state);

    int preconditionScreenId(@k IacState state);

    void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2);
}
