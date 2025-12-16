package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AutoEnableCameraMiddleware.kt */
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/AutoEnableCameraMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/AutoEnableCameraMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/AutoEnableCameraMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/AutoEnableCameraMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/AutoEnableCameraMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class AutoEnableCameraMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final AutoEnableCameraMiddleware INSTANCE = new AutoEnableCameraMiddleware();

    /* compiled from: AutoEnableCameraMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/video/AutoEnableCameraMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "shouldEnableDefaultCameraOrRequestPermission", "", "(Z)V", "getShouldEnableDefaultCameraOrRequestPermission", "()Z", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 0;
        private final boolean shouldEnableDefaultCameraOrRequestPermission;

        public Payload(boolean z12) {
            this.shouldEnableDefaultCameraOrRequestPermission = z12;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = payload.shouldEnableDefaultCameraOrRequestPermission;
            }
            return payload.copy(z12);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldEnableDefaultCameraOrRequestPermission() {
            return this.shouldEnableDefaultCameraOrRequestPermission;
        }

        @k
        public final Payload copy(boolean shouldEnableDefaultCameraOrRequestPermission) {
            return new Payload(shouldEnableDefaultCameraOrRequestPermission);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && this.shouldEnableDefaultCameraOrRequestPermission == ((Payload) other).shouldEnableDefaultCameraOrRequestPermission;
        }

        public final boolean getShouldEnableDefaultCameraOrRequestPermission() {
            return this.shouldEnableDefaultCameraOrRequestPermission;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldEnableDefaultCameraOrRequestPermission);
        }

        @k
        public String toString() {
            return r.x(new StringBuilder("Payload(shouldEnableDefaultCameraOrRequestPermission="), this.shouldEnableDefaultCameraOrRequestPermission, ')');
        }
    }

    private AutoEnableCameraMiddleware() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof AutoEnableCameraMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return 1651457032;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "AutoEnableCameraMiddleware";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.AutoEnableCameraMiddleware.Payload getPayloadFromState(@Y61.k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r3) {
        /*
            r2 = this;
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.AutoEnableCameraMiddleware$Payload r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.AutoEnableCameraMiddleware$Payload
            boolean r1 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.e.b(r3)
            if (r1 == 0) goto L1c
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState$InUse r3 = r3.asInUse()
            if (r3 == 0) goto L1c
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState r3 = r3.getCall()
            if (r3 == 0) goto L1c
            boolean r3 = r3.getDefaultCameraEnabled()
            r1 = 1
            if (r3 != r1) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.AutoEnableCameraMiddleware.getPayloadFromState(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState):com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.AutoEnableCameraMiddleware$Payload");
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        if (payload2.getShouldEnableDefaultCameraOrRequestPermission()) {
            iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), EnableDefaultCameraOrRequestPermissionAction.INSTANCE);
        }
    }
}
