package com.avito.avcalls.call.models;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.avcalls.call.models.CallMetaInfo;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: CallMetaInfo.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/call/models/CallMetaInfoSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/call/models/CallMetaInfo;", "<init>", "()V", "RemoteModel", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallMetaInfoSerializer implements KSerializer<CallMetaInfo> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SerialDescriptor f332717a = RemoteModel.INSTANCE.serializer().getF412706c();

    /* compiled from: CallMetaInfo.kt */
    @v
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019BÉ\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\u0004\u0018\u0001`\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/avito/avcalls/call/models/CallMetaInfoSerializer$RemoteModel;", "", "", "seen1", "", "scenario", "", "itemId", "itemTitle", "itemPrice", "", "Lcom/avito/avcalls/call/models/ImagePack;", "itemImageUrls", "peerName", "peerAvatarUrls", "gsmLink", "msgLink", "startCallDelayMs", "itemLink", "Lcom/avito/avcalls/call/models/ExtraMetaInfo;", "extraInfo", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class RemoteModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: m, reason: collision with root package name */
        @f
        @k
        public static final KSerializer<Object>[] f332718m;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f332719a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f332720b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f332721c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f332722d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Map<String, String> f332723e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f332724f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Map<String, String> f332725g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f332726h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f332727i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Long f332728j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final String f332729k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Map<String, String> f332730l;

        /* compiled from: CallMetaInfo.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/call/models/CallMetaInfoSerializer$RemoteModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/call/models/CallMetaInfoSerializer$RemoteModel;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<RemoteModel> serializer() {
                return CallMetaInfoSerializer$RemoteModel$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        static {
            V0 v02 = V0.f412822a;
            f332718m = new KSerializer[]{null, null, null, null, new C43400e0(v02, v02), null, new C43400e0(v02, v02), null, null, null, null, new C43400e0(v02, v02)};
        }

        @InterfaceC42830m
        public /* synthetic */ RemoteModel(int i12, String str, Long l12, String str2, Long l13, Map map, String str3, Map map2, String str4, String str5, Long l14, String str6, Map map3, P0 p02) {
            if (1 != (i12 & 1)) {
                E0.b(i12, 1, CallMetaInfoSerializer$RemoteModel$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f332719a = str;
            if ((i12 & 2) == 0) {
                this.f332720b = null;
            } else {
                this.f332720b = l12;
            }
            if ((i12 & 4) == 0) {
                this.f332721c = null;
            } else {
                this.f332721c = str2;
            }
            if ((i12 & 8) == 0) {
                this.f332722d = null;
            } else {
                this.f332722d = l13;
            }
            if ((i12 & 16) == 0) {
                this.f332723e = null;
            } else {
                this.f332723e = map;
            }
            if ((i12 & 32) == 0) {
                this.f332724f = null;
            } else {
                this.f332724f = str3;
            }
            if ((i12 & 64) == 0) {
                this.f332725g = null;
            } else {
                this.f332725g = map2;
            }
            if ((i12 & 128) == 0) {
                this.f332726h = null;
            } else {
                this.f332726h = str4;
            }
            if ((i12 & 256) == 0) {
                this.f332727i = null;
            } else {
                this.f332727i = str5;
            }
            if ((i12 & 512) == 0) {
                this.f332728j = null;
            } else {
                this.f332728j = l14;
            }
            if ((i12 & 1024) == 0) {
                this.f332729k = null;
            } else {
                this.f332729k = str6;
            }
            if ((i12 & 2048) == 0) {
                this.f332730l = null;
            } else {
                this.f332730l = map3;
            }
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteModel)) {
                return false;
            }
            RemoteModel remoteModel = (RemoteModel) obj;
            return L.f(this.f332719a, remoteModel.f332719a) && L.f(this.f332720b, remoteModel.f332720b) && L.f(this.f332721c, remoteModel.f332721c) && L.f(this.f332722d, remoteModel.f332722d) && L.f(this.f332723e, remoteModel.f332723e) && L.f(this.f332724f, remoteModel.f332724f) && L.f(this.f332725g, remoteModel.f332725g) && L.f(this.f332726h, remoteModel.f332726h) && L.f(this.f332727i, remoteModel.f332727i) && L.f(this.f332728j, remoteModel.f332728j) && L.f(this.f332729k, remoteModel.f332729k) && L.f(this.f332730l, remoteModel.f332730l);
        }

        public final int hashCode() {
            int iHashCode = this.f332719a.hashCode() * 31;
            Long l12 = this.f332720b;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f332721c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l13 = this.f332722d;
            int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Map<String, String> map = this.f332723e;
            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            String str2 = this.f332724f;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map2 = this.f332725g;
            int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
            String str3 = this.f332726h;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f332727i;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l14 = this.f332728j;
            int iHashCode10 = (iHashCode9 + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str5 = this.f332729k;
            int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, String> map3 = this.f332730l;
            return iHashCode11 + (map3 != null ? map3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoteModel(scenario=");
            sb2.append(this.f332719a);
            sb2.append(", itemId=");
            sb2.append(this.f332720b);
            sb2.append(", itemTitle=");
            sb2.append(this.f332721c);
            sb2.append(", itemPrice=");
            sb2.append(this.f332722d);
            sb2.append(", itemImageUrls=");
            sb2.append(this.f332723e);
            sb2.append(", peerName=");
            sb2.append(this.f332724f);
            sb2.append(", peerAvatarUrls=");
            sb2.append(this.f332725g);
            sb2.append(", gsmLink=");
            sb2.append(this.f332726h);
            sb2.append(", msgLink=");
            sb2.append(this.f332727i);
            sb2.append(", startCallDelayMs=");
            sb2.append(this.f332728j);
            sb2.append(", itemLink=");
            sb2.append(this.f332729k);
            sb2.append(", extraInfo=");
            return r.w(sb2, this.f332730l, ')');
        }

        public RemoteModel(@k String str, @l Long l12, @l String str2, @l Long l13, @l Map<String, String> map, @l String str3, @l Map<String, String> map2, @l String str4, @l String str5, @l Long l14, @l String str6, @l Map<String, String> map3) {
            this.f332719a = str;
            this.f332720b = l12;
            this.f332721c = str2;
            this.f332722d = l13;
            this.f332723e = map;
            this.f332724f = str3;
            this.f332725g = map2;
            this.f332726h = str4;
            this.f332727i = str5;
            this.f332728j = l14;
            this.f332729k = str6;
            this.f332730l = map3;
        }

        public /* synthetic */ RemoteModel(String str, Long l12, String str2, Long l13, Map map, String str3, Map map2, String str4, String str5, Long l14, String str6, Map map3, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : l12, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : l13, (i12 & 16) != 0 ? null : map, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : map2, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? null : l14, (i12 & 1024) != 0 ? null : str6, (i12 & 2048) == 0 ? map3 : null);
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        RemoteModel remoteModel = (RemoteModel) decoder.m(RemoteModel.INSTANCE.serializer());
        String str = remoteModel.f332719a;
        Long l12 = remoteModel.f332720b;
        CallMetaInfo.a aVar = l12 != null ? new CallMetaInfo.a(l12.longValue(), remoteModel.f332721c, remoteModel.f332722d, remoteModel.f332723e, remoteModel.f332729k) : null;
        String str2 = remoteModel.f332724f;
        return new CallMetaInfo(str, str2 != null ? new CallMetaInfo.b(str2, remoteModel.f332725g) : null, aVar, remoteModel.f332726h, remoteModel.f332727i, remoteModel.f332728j, remoteModel.f332730l);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor, reason: from getter */
    public final SerialDescriptor getF412706c() {
        return this.f332717a;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        CallMetaInfo callMetaInfo = (CallMetaInfo) obj;
        String scenario = callMetaInfo.getScenario();
        CallMetaInfo.a item = callMetaInfo.getItem();
        Long lValueOf = item != null ? Long.valueOf(item.f332710a) : null;
        CallMetaInfo.a item2 = callMetaInfo.getItem();
        String str = item2 != null ? item2.f332711b : null;
        CallMetaInfo.a item3 = callMetaInfo.getItem();
        Long l12 = item3 != null ? item3.f332712c : null;
        CallMetaInfo.a item4 = callMetaInfo.getItem();
        Map<String, String> map = item4 != null ? item4.f332713d : null;
        CallMetaInfo.a item5 = callMetaInfo.getItem();
        String str2 = item5 != null ? item5.f332714e : null;
        CallMetaInfo.b peer = callMetaInfo.getPeer();
        String str3 = peer != null ? peer.f332715a : null;
        CallMetaInfo.b peer2 = callMetaInfo.getPeer();
        encoder.f(RemoteModel.INSTANCE.serializer(), new RemoteModel(scenario, lValueOf, str, l12, map, str3, peer2 != null ? peer2.f332716b : null, callMetaInfo.getGsmLink(), callMetaInfo.getMsgLink(), callMetaInfo.getStartCallDelayMs(), str2, callMetaInfo.getExtraInfo()));
    }
}
