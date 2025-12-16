package com.avito.android.iac_dialer.impl_module.final_link;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiInt;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiLong;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiMapStringString;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacMetaInfoStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage;", "", "Data", "StorageCallMeta", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacMetaInfoStorage {

    /* compiled from: IacMetaInfoStorage.kt */
    @P
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JP\u0010\u0019\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b'\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0018¨\u0006,"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$Data;", "LdL/d;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "localUserId", "peerUserId", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;", Constants.REFERRER_API_META, "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;", "component6", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$Data;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Z", "getLocalUserId", "getPeerUserId", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;", "getMeta", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Data implements dL.d {
        public static final int $stable = 8;

        @k
        private final String callId;

        @k
        private final IacCallDirection direction;
        private final boolean isVideo;

        @k
        private final String localUserId;

        @k
        private final StorageCallMeta meta;

        @k
        private final String peerUserId;

        public Data(@k String str, boolean z12, @k String str2, @k String str3, @k StorageCallMeta storageCallMeta, @k IacCallDirection iacCallDirection) {
            this.callId = str;
            this.isVideo = z12;
            this.localUserId = str2;
            this.peerUserId = str3;
            this.meta = storageCallMeta;
            this.direction = iacCallDirection;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, boolean z12, String str2, String str3, StorageCallMeta storageCallMeta, IacCallDirection iacCallDirection, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = data.callId;
            }
            if ((i12 & 2) != 0) {
                z12 = data.isVideo;
            }
            boolean z13 = z12;
            if ((i12 & 4) != 0) {
                str2 = data.localUserId;
            }
            String str4 = str2;
            if ((i12 & 8) != 0) {
                str3 = data.peerUserId;
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                storageCallMeta = data.meta;
            }
            StorageCallMeta storageCallMeta2 = storageCallMeta;
            if ((i12 & 32) != 0) {
                iacCallDirection = data.direction;
            }
            return data.copy(str, z13, str4, str5, storageCallMeta2, iacCallDirection);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getLocalUserId() {
            return this.localUserId;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getPeerUserId() {
            return this.peerUserId;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final StorageCallMeta getMeta() {
            return this.meta;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final IacCallDirection getDirection() {
            return this.direction;
        }

        @k
        public final Data copy(@k String callId, boolean isVideo, @k String localUserId, @k String peerUserId, @k StorageCallMeta meta, @k IacCallDirection direction) {
            return new Data(callId, isVideo, localUserId, peerUserId, meta, direction);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return L.f(this.callId, data.callId) && this.isVideo == data.isVideo && L.f(this.localUserId, data.localUserId) && L.f(this.peerUserId, data.peerUserId) && L.f(this.meta, data.meta) && this.direction == data.direction;
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        @k
        public final IacCallDirection getDirection() {
            return this.direction;
        }

        @k
        public final String getLocalUserId() {
            return this.localUserId;
        }

        @k
        public final StorageCallMeta getMeta() {
            return this.meta;
        }

        @k
        public final String getPeerUserId() {
            return this.peerUserId;
        }

        public int hashCode() {
            return this.direction.hashCode() + ((this.meta.hashCode() + H.d(H.d(r.i(this.callId.hashCode() * 31, 31, this.isVideo), 31, this.localUserId), 31, this.peerUserId)) * 31);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        @k
        public String toString() {
            return "Data(callId=" + this.callId + ", isVideo=" + this.isVideo + ", localUserId=" + this.localUserId + ", peerUserId=" + this.peerUserId + ", meta=" + this.meta + ", direction=" + this.direction + ')';
        }
    }

    /* compiled from: IacMetaInfoStorage.kt */
    @P
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u000267BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b1\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001d¨\u00068"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;", "item", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;", "peer", "", "scenario", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "gsmLink", "msgLink", "", "startCallDelayMs", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "extraInfo", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Ljava/lang/Long;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;", "component2", "()Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component5", "component6", "()Ljava/lang/Long;", "component7", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Ljava/lang/Long;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;", "getItem", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;", "getPeer", "Ljava/lang/String;", "getScenario", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "getGsmLink", "getMsgLink", "Ljava/lang/Long;", "getStartCallDelayMs", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "getExtraInfo", "Item", "User", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StorageCallMeta implements dL.d {
        public static final int $stable = 8;

        @l
        private final IacPiiMapStringString extraInfo;

        @l
        private final IacPiiDeepLink gsmLink;

        @l
        private final Item item;

        @l
        private final IacPiiDeepLink msgLink;

        @l
        private final User peer;

        @k
        private final String scenario;

        @l
        private final Long startCallDelayMs;

        /* compiled from: IacMetaInfoStorage.kt */
        @P
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;", "LdL/d;", "", "id", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "title", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;", "price", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "imageUrls", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "itemLink", "<init>", "(JLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "component1", "()J", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component3", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "component5", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "copy", "(JLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$Item;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getTitle", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;", "getPrice", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "getImageUrls", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "getItemLink", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Item implements dL.d {
            public static final int $stable = 8;
            private final long id;

            @l
            private final IacPiiMapStringString imageUrls;

            @l
            private final IacPiiDeepLink itemLink;

            @l
            private final IacPiiLong price;

            @l
            private final IacPiiString title;

            public Item(long j12, @l IacPiiString iacPiiString, @l IacPiiLong iacPiiLong, @l IacPiiMapStringString iacPiiMapStringString, @l IacPiiDeepLink iacPiiDeepLink) {
                this.id = j12;
                this.title = iacPiiString;
                this.price = iacPiiLong;
                this.imageUrls = iacPiiMapStringString;
                this.itemLink = iacPiiDeepLink;
            }

            public static /* synthetic */ Item copy$default(Item item, long j12, IacPiiString iacPiiString, IacPiiLong iacPiiLong, IacPiiMapStringString iacPiiMapStringString, IacPiiDeepLink iacPiiDeepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    j12 = item.id;
                }
                long j13 = j12;
                if ((i12 & 2) != 0) {
                    iacPiiString = item.title;
                }
                IacPiiString iacPiiString2 = iacPiiString;
                if ((i12 & 4) != 0) {
                    iacPiiLong = item.price;
                }
                IacPiiLong iacPiiLong2 = iacPiiLong;
                if ((i12 & 8) != 0) {
                    iacPiiMapStringString = item.imageUrls;
                }
                IacPiiMapStringString iacPiiMapStringString2 = iacPiiMapStringString;
                if ((i12 & 16) != 0) {
                    iacPiiDeepLink = item.itemLink;
                }
                return item.copy(j13, iacPiiString2, iacPiiLong2, iacPiiMapStringString2, iacPiiDeepLink);
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final IacPiiString getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final IacPiiLong getPrice() {
                return this.price;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final IacPiiMapStringString getImageUrls() {
                return this.imageUrls;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final IacPiiDeepLink getItemLink() {
                return this.itemLink;
            }

            @k
            public final Item copy(long id2, @l IacPiiString title, @l IacPiiLong price, @l IacPiiMapStringString imageUrls, @l IacPiiDeepLink itemLink) {
                return new Item(id2, title, price, imageUrls, itemLink);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return this.id == item.id && L.f(this.title, item.title) && L.f(this.price, item.price) && L.f(this.imageUrls, item.imageUrls) && L.f(this.itemLink, item.itemLink);
            }

            public final long getId() {
                return this.id;
            }

            @l
            public final IacPiiMapStringString getImageUrls() {
                return this.imageUrls;
            }

            @l
            public final IacPiiDeepLink getItemLink() {
                return this.itemLink;
            }

            @l
            public final IacPiiLong getPrice() {
                return this.price;
            }

            @l
            public final IacPiiString getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = Long.hashCode(this.id) * 31;
                IacPiiString iacPiiString = this.title;
                int iHashCode2 = (iHashCode + (iacPiiString == null ? 0 : iacPiiString.hashCode())) * 31;
                IacPiiLong iacPiiLong = this.price;
                int iHashCode3 = (iHashCode2 + (iacPiiLong == null ? 0 : iacPiiLong.hashCode())) * 31;
                IacPiiMapStringString iacPiiMapStringString = this.imageUrls;
                int iHashCode4 = (iHashCode3 + (iacPiiMapStringString == null ? 0 : iacPiiMapStringString.hashCode())) * 31;
                IacPiiDeepLink iacPiiDeepLink = this.itemLink;
                return iHashCode4 + (iacPiiDeepLink != null ? iacPiiDeepLink.hashCode() : 0);
            }

            @k
            public String toString() {
                return "Item(id=" + this.id + ", title=" + this.title + ", price=" + this.price + ", imageUrls=" + this.imageUrls + ", itemLink=" + this.itemLink + ')';
            }
        }

        /* compiled from: IacMetaInfoStorage.kt */
        @P
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;", "LdL/d;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "name", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "avatarUrls", "rating", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "callerReviewCount", "<init>", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;)V", "component1", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "component3", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "copy", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacMetaInfoStorage$StorageCallMeta$User;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "getAvatarUrls", "getRating", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "getCallerReviewCount", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class User implements dL.d {
            public static final int $stable = 8;

            @l
            private final IacPiiMapStringString avatarUrls;

            @l
            private final IacPiiInt callerReviewCount;

            @l
            private final IacPiiString name;

            @l
            private final IacPiiString rating;

            public User(@l IacPiiString iacPiiString, @l IacPiiMapStringString iacPiiMapStringString, @l IacPiiString iacPiiString2, @l IacPiiInt iacPiiInt) {
                this.name = iacPiiString;
                this.avatarUrls = iacPiiMapStringString;
                this.rating = iacPiiString2;
                this.callerReviewCount = iacPiiInt;
            }

            public static /* synthetic */ User copy$default(User user, IacPiiString iacPiiString, IacPiiMapStringString iacPiiMapStringString, IacPiiString iacPiiString2, IacPiiInt iacPiiInt, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacPiiString = user.name;
                }
                if ((i12 & 2) != 0) {
                    iacPiiMapStringString = user.avatarUrls;
                }
                if ((i12 & 4) != 0) {
                    iacPiiString2 = user.rating;
                }
                if ((i12 & 8) != 0) {
                    iacPiiInt = user.callerReviewCount;
                }
                return user.copy(iacPiiString, iacPiiMapStringString, iacPiiString2, iacPiiInt);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final IacPiiString getName() {
                return this.name;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final IacPiiMapStringString getAvatarUrls() {
                return this.avatarUrls;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final IacPiiString getRating() {
                return this.rating;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final IacPiiInt getCallerReviewCount() {
                return this.callerReviewCount;
            }

            @k
            public final User copy(@l IacPiiString name, @l IacPiiMapStringString avatarUrls, @l IacPiiString rating, @l IacPiiInt callerReviewCount) {
                return new User(name, avatarUrls, rating, callerReviewCount);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof User)) {
                    return false;
                }
                User user = (User) other;
                return L.f(this.name, user.name) && L.f(this.avatarUrls, user.avatarUrls) && L.f(this.rating, user.rating) && L.f(this.callerReviewCount, user.callerReviewCount);
            }

            @l
            public final IacPiiMapStringString getAvatarUrls() {
                return this.avatarUrls;
            }

            @l
            public final IacPiiInt getCallerReviewCount() {
                return this.callerReviewCount;
            }

            @l
            public final IacPiiString getName() {
                return this.name;
            }

            @l
            public final IacPiiString getRating() {
                return this.rating;
            }

            public int hashCode() {
                IacPiiString iacPiiString = this.name;
                int iHashCode = (iacPiiString == null ? 0 : iacPiiString.hashCode()) * 31;
                IacPiiMapStringString iacPiiMapStringString = this.avatarUrls;
                int iHashCode2 = (iHashCode + (iacPiiMapStringString == null ? 0 : iacPiiMapStringString.hashCode())) * 31;
                IacPiiString iacPiiString2 = this.rating;
                int iHashCode3 = (iHashCode2 + (iacPiiString2 == null ? 0 : iacPiiString2.hashCode())) * 31;
                IacPiiInt iacPiiInt = this.callerReviewCount;
                return iHashCode3 + (iacPiiInt != null ? iacPiiInt.hashCode() : 0);
            }

            @k
            public String toString() {
                return "User(name=" + this.name + ", avatarUrls=" + this.avatarUrls + ", rating=" + this.rating + ", callerReviewCount=" + this.callerReviewCount + ')';
            }
        }

        public StorageCallMeta(@l Item item, @l User user, @k String str, @l IacPiiDeepLink iacPiiDeepLink, @l IacPiiDeepLink iacPiiDeepLink2, @l Long l12, @l IacPiiMapStringString iacPiiMapStringString) {
            this.item = item;
            this.peer = user;
            this.scenario = str;
            this.gsmLink = iacPiiDeepLink;
            this.msgLink = iacPiiDeepLink2;
            this.startCallDelayMs = l12;
            this.extraInfo = iacPiiMapStringString;
        }

        public static /* synthetic */ StorageCallMeta copy$default(StorageCallMeta storageCallMeta, Item item, User user, String str, IacPiiDeepLink iacPiiDeepLink, IacPiiDeepLink iacPiiDeepLink2, Long l12, IacPiiMapStringString iacPiiMapStringString, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                item = storageCallMeta.item;
            }
            if ((i12 & 2) != 0) {
                user = storageCallMeta.peer;
            }
            User user2 = user;
            if ((i12 & 4) != 0) {
                str = storageCallMeta.scenario;
            }
            String str2 = str;
            if ((i12 & 8) != 0) {
                iacPiiDeepLink = storageCallMeta.gsmLink;
            }
            IacPiiDeepLink iacPiiDeepLink3 = iacPiiDeepLink;
            if ((i12 & 16) != 0) {
                iacPiiDeepLink2 = storageCallMeta.msgLink;
            }
            IacPiiDeepLink iacPiiDeepLink4 = iacPiiDeepLink2;
            if ((i12 & 32) != 0) {
                l12 = storageCallMeta.startCallDelayMs;
            }
            Long l13 = l12;
            if ((i12 & 64) != 0) {
                iacPiiMapStringString = storageCallMeta.extraInfo;
            }
            return storageCallMeta.copy(item, user2, str2, iacPiiDeepLink3, iacPiiDeepLink4, l13, iacPiiMapStringString);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Item getItem() {
            return this.item;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final User getPeer() {
            return this.peer;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getScenario() {
            return this.scenario;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final IacPiiDeepLink getGsmLink() {
            return this.gsmLink;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final IacPiiDeepLink getMsgLink() {
            return this.msgLink;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Long getStartCallDelayMs() {
            return this.startCallDelayMs;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final IacPiiMapStringString getExtraInfo() {
            return this.extraInfo;
        }

        @k
        public final StorageCallMeta copy(@l Item item, @l User peer, @k String scenario, @l IacPiiDeepLink gsmLink, @l IacPiiDeepLink msgLink, @l Long startCallDelayMs, @l IacPiiMapStringString extraInfo) {
            return new StorageCallMeta(item, peer, scenario, gsmLink, msgLink, startCallDelayMs, extraInfo);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StorageCallMeta)) {
                return false;
            }
            StorageCallMeta storageCallMeta = (StorageCallMeta) other;
            return L.f(this.item, storageCallMeta.item) && L.f(this.peer, storageCallMeta.peer) && L.f(this.scenario, storageCallMeta.scenario) && L.f(this.gsmLink, storageCallMeta.gsmLink) && L.f(this.msgLink, storageCallMeta.msgLink) && L.f(this.startCallDelayMs, storageCallMeta.startCallDelayMs) && L.f(this.extraInfo, storageCallMeta.extraInfo);
        }

        @l
        public final IacPiiMapStringString getExtraInfo() {
            return this.extraInfo;
        }

        @l
        public final IacPiiDeepLink getGsmLink() {
            return this.gsmLink;
        }

        @l
        public final Item getItem() {
            return this.item;
        }

        @l
        public final IacPiiDeepLink getMsgLink() {
            return this.msgLink;
        }

        @l
        public final User getPeer() {
            return this.peer;
        }

        @k
        public final String getScenario() {
            return this.scenario;
        }

        @l
        public final Long getStartCallDelayMs() {
            return this.startCallDelayMs;
        }

        public int hashCode() {
            Item item = this.item;
            int iHashCode = (item == null ? 0 : item.hashCode()) * 31;
            User user = this.peer;
            int iD2 = H.d((iHashCode + (user == null ? 0 : user.hashCode())) * 31, 31, this.scenario);
            IacPiiDeepLink iacPiiDeepLink = this.gsmLink;
            int iHashCode2 = (iD2 + (iacPiiDeepLink == null ? 0 : iacPiiDeepLink.hashCode())) * 31;
            IacPiiDeepLink iacPiiDeepLink2 = this.msgLink;
            int iHashCode3 = (iHashCode2 + (iacPiiDeepLink2 == null ? 0 : iacPiiDeepLink2.hashCode())) * 31;
            Long l12 = this.startCallDelayMs;
            int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            IacPiiMapStringString iacPiiMapStringString = this.extraInfo;
            return iHashCode4 + (iacPiiMapStringString != null ? iacPiiMapStringString.hashCode() : 0);
        }

        @k
        public String toString() {
            return "StorageCallMeta(item=" + this.item + ", peer=" + this.peer + ", scenario=" + this.scenario + ", gsmLink=" + this.gsmLink + ", msgLink=" + this.msgLink + ", startCallDelayMs=" + this.startCallDelayMs + ", extraInfo=" + this.extraInfo + ')';
        }
    }

    @k
    /* renamed from: a */
    LinkedHashMap getF166043a();
}
