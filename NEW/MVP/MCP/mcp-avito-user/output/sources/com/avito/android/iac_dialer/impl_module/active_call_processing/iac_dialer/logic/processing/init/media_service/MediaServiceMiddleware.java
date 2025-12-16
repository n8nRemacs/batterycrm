package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.media_service;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.FgType;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.ServiceStatus;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Collection;
import java.util.Iterator;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MediaServiceMiddleware.kt */
@P
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/media_service/MediaServiceMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/media_service/MediaServiceMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/media_service/MediaServiceMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/media_service/MediaServiceMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/media_service/MediaServiceMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class MediaServiceMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final MediaServiceMiddleware INSTANCE = new MediaServiceMiddleware();

    /* compiled from: MediaServiceMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/media_service/MediaServiceMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "wantedFgType", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;)V", "getWantedFgType", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 0;

        @l
        private final FgType wantedFgType;

        public Payload(@l FgType fgType) {
            this.wantedFgType = fgType;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, FgType fgType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                fgType = payload.wantedFgType;
            }
            return payload.copy(fgType);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final FgType getWantedFgType() {
            return this.wantedFgType;
        }

        @k
        public final Payload copy(@l FgType wantedFgType) {
            return new Payload(wantedFgType);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && L.f(this.wantedFgType, ((Payload) other).wantedFgType);
        }

        @l
        public final FgType getWantedFgType() {
            return this.wantedFgType;
        }

        public int hashCode() {
            FgType fgType = this.wantedFgType;
            if (fgType == null) {
                return 0;
            }
            return fgType.hashCode();
        }

        @k
        public String toString() {
            return "Payload(wantedFgType=" + this.wantedFgType + ')';
        }
    }

    private MediaServiceMiddleware() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof MediaServiceMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return 927763881;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "MediaServiceMiddleware";
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @k
    public Payload getPayloadFromState(@k IacState state) {
        Collection<CallInit> collectionValues = state.getAppearance().getCallInits().values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!(((CallInit) it.next()).getTelecom() instanceof CallInit.Telecom.Creating)) {
                    boolean z12 = false;
                    boolean z13 = state.getAppearance().getMicPerm().b() && state.getAppearance().getApp().getIsAtLeastStarted();
                    if (state.getAppearance().getCameraPerm().b() && state.getAppearance().getApp().getIsAtLeastStarted()) {
                        z12 = true;
                    }
                    return new Payload(new FgType(z13, z12));
                }
            }
        }
        return new Payload(null);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        FgType fgType;
        ServiceStatus service;
        FgType fgType2;
        if (payload2.getWantedFgType() != null) {
            if (payload.getWantedFgType() == null) {
                iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.MediaService.Start(payload2.getWantedFgType()));
                return;
            }
            if (!payload.getWantedFgType().getMic() && payload2.getWantedFgType().getMic() && ((service = iacMiddlewareProcessing.getNewState().getAppearance().getService()) == null || (fgType2 = service.getFgType()) == null || !fgType2.getMic())) {
                iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.MediaService.Start(payload2.getWantedFgType()));
                return;
            }
            if (payload.getWantedFgType().getCamera() || !payload2.getWantedFgType().getCamera()) {
                return;
            }
            ServiceStatus service2 = iacMiddlewareProcessing.getNewState().getAppearance().getService();
            if (service2 == null || (fgType = service2.getFgType()) == null || !fgType.getCamera()) {
                iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.MediaService.Start(payload2.getWantedFgType()));
                return;
            }
            return;
        }
        iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), IacEvent.MediaService.Stop.INSTANCE);
    }
}
