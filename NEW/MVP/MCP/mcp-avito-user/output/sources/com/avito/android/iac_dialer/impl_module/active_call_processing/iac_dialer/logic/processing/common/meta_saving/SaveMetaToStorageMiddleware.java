package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.meta_saving;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallMeta;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.huawei.hms.api.FailedBinderCallBack;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SaveMetaToStorageMiddleware.kt */
@P
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0007\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0013\u0010\u0007\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/meta_saving/SaveMetaToStorageMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/meta_saving/SaveMetaToStorageMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;", "toStorageMeta", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/meta_saving/SaveMetaToStorageMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/meta_saving/SaveMetaToStorageMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/meta_saving/SaveMetaToStorageMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class SaveMetaToStorageMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final SaveMetaToStorageMiddleware INSTANCE = new SaveMetaToStorageMiddleware();

    /* compiled from: SaveMetaToStorageMiddleware.kt */
    @P
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/meta_saving/SaveMetaToStorageMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "dataToSave", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$Data;", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$Data;)V", "getCallId", "()Ljava/lang/String;", "getDataToSave", "()Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$Data;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 8;

        @l
        private final String callId;

        @l
        private final IacMetaInfoStorage.Data dataToSave;

        public Payload(@l String str, @l IacMetaInfoStorage.Data data) {
            this.callId = str;
            this.dataToSave = data;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, String str, IacMetaInfoStorage.Data data, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = payload.callId;
            }
            if ((i12 & 2) != 0) {
                data = payload.dataToSave;
            }
            return payload.copy(str, data);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final IacMetaInfoStorage.Data getDataToSave() {
            return this.dataToSave;
        }

        @k
        public final Payload copy(@l String callId, @l IacMetaInfoStorage.Data dataToSave) {
            return new Payload(callId, dataToSave);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return L.f(this.callId, payload.callId) && L.f(this.dataToSave, payload.dataToSave);
        }

        @l
        public final String getCallId() {
            return this.callId;
        }

        @l
        public final IacMetaInfoStorage.Data getDataToSave() {
            return this.dataToSave;
        }

        public int hashCode() {
            String str = this.callId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            IacMetaInfoStorage.Data data = this.dataToSave;
            return iHashCode + (data != null ? data.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Payload(callId=" + this.callId + ", dataToSave=" + this.dataToSave + ')';
        }
    }

    private SaveMetaToStorageMiddleware() {
    }

    private final IacMetaInfoStorage.StorageCallMeta toStorageMeta(CallMeta callMeta) {
        CallMeta.Item item = callMeta.getItem();
        IacMetaInfoStorage.StorageCallMeta.Item storageMeta = item != null ? toStorageMeta(item) : null;
        CallMeta.User peer = callMeta.getPeer();
        return new IacMetaInfoStorage.StorageCallMeta(storageMeta, peer != null ? toStorageMeta(peer) : null, callMeta.getScenario(), callMeta.getGsmLink(), callMeta.getMsgLink(), callMeta.getStartCallDelayMs(), callMeta.getExtraInfo());
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof SaveMetaToStorageMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -848107041;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "SaveMetaToStorageMiddleware";
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @k
    public Payload getPayloadFromState(@k IacState state) {
        if (!(state instanceof IacState.InUse)) {
            return new Payload(null, null);
        }
        IacState.InUse inUse = (IacState.InUse) state;
        return new Payload(inUse.getCallId(), new IacMetaInfoStorage.Data(inUse.getCallId(), inUse.getCall().isVideo(), inUse.getCall().getLocalUserId(), inUse.getCall().getPeerUserId(), toStorageMeta(inUse.getCall().getMeta()), inUse.getCall().getDirection()));
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        if (payload2.getCallId() == null || payload2.getDataToSave() == null) {
            return;
        }
        iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.Finalizing.SaveMetaToFinalLinkStorage(payload2.getCallId(), payload2.getDataToSave()));
    }

    private final IacMetaInfoStorage.StorageCallMeta.Item toStorageMeta(CallMeta.Item item) {
        return new IacMetaInfoStorage.StorageCallMeta.Item(item.getId(), item.getTitle(), item.getPrice(), item.getImageUrls(), item.getItemLink());
    }

    private final IacMetaInfoStorage.StorageCallMeta.User toStorageMeta(CallMeta.User user) {
        return new IacMetaInfoStorage.StorageCallMeta.User(user.getName(), user.getAvatarUrls(), user.getRating(), user.getCallerReviewCount());
    }
}
