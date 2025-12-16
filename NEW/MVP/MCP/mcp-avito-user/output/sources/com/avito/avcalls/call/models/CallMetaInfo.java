package com.avito.avcalls.call.models;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.w;

/* compiled from: CallMetaInfo.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0003*+,Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R+\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/avito/avcalls/call/models/CallMetaInfo;", "", "", "scenario", "Lcom/avito/avcalls/call/models/CallMetaInfo$b;", "peer", "Lcom/avito/avcalls/call/models/CallMetaInfo$a;", "item", "gsmLink", "msgLink", "", "startCallDelayMs", "", "Lcom/avito/avcalls/call/models/ExtraMetaInfo;", "extraInfo", "<init>", "(Ljava/lang/String;Lcom/avito/avcalls/call/models/CallMetaInfo$b;Lcom/avito/avcalls/call/models/CallMetaInfo$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScenario", "Lcom/avito/avcalls/call/models/CallMetaInfo$b;", "getPeer", "()Lcom/avito/avcalls/call/models/CallMetaInfo$b;", "Lcom/avito/avcalls/call/models/CallMetaInfo$a;", "getItem", "()Lcom/avito/avcalls/call/models/CallMetaInfo$a;", "getGsmLink", "getMsgLink", "Ljava/lang/Long;", "getStartCallDelayMs", "()Ljava/lang/Long;", "Ljava/util/Map;", "getExtraInfo", "()Ljava/util/Map;", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w(with = CallMetaInfoSerializer.class)
/* loaded from: classes5.dex */
public final /* data */ class CallMetaInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final Map<String, String> extraInfo;

    @l
    private final String gsmLink;

    @l
    private final a item;

    @l
    private final String msgLink;

    @l
    private final b peer;

    @k
    private final String scenario;

    @l
    private final Long startCallDelayMs;

    /* compiled from: CallMetaInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/call/models/CallMetaInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/call/models/CallMetaInfo;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<CallMetaInfo> serializer() {
            return new CallMetaInfoSerializer();
        }

        public Companion() {
        }
    }

    /* compiled from: CallMetaInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/call/models/CallMetaInfo$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f332715a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Map<String, String> f332716b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f332715a, bVar.f332715a) && L.f(this.f332716b, bVar.f332716b);
        }

        public final int hashCode() {
            String str = this.f332715a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, String> map = this.f332716b;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("User(");
            String str = this.f332715a;
            if (str == null) {
                sb2.append("name=null");
            }
            if (str != null) {
                sb2.append("name=***");
            }
            Map<String, String> map = this.f332716b;
            if (map != null) {
                sb2.append(", avatarUrls.size=" + map.size());
            }
            sb2.append(")");
            return sb2.toString();
        }

        public b(@l String str, @l Map<String, String> map) {
            this.f332715a = str;
            this.f332716b = map;
        }

        public /* synthetic */ b(String str, Map map, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : map);
        }
    }

    public CallMetaInfo(@k String str, @l b bVar, @l a aVar, @l String str2, @l String str3, @l Long l12, @l Map<String, String> map) {
        this.scenario = str;
        this.peer = bVar;
        this.item = aVar;
        this.gsmLink = str2;
        this.msgLink = str3;
        this.startCallDelayMs = l12;
        this.extraInfo = map;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallMetaInfo)) {
            return false;
        }
        CallMetaInfo callMetaInfo = (CallMetaInfo) other;
        return L.f(this.scenario, callMetaInfo.scenario) && L.f(this.peer, callMetaInfo.peer) && L.f(this.item, callMetaInfo.item) && L.f(this.gsmLink, callMetaInfo.gsmLink) && L.f(this.msgLink, callMetaInfo.msgLink) && L.f(this.startCallDelayMs, callMetaInfo.startCallDelayMs) && L.f(this.extraInfo, callMetaInfo.extraInfo);
    }

    @l
    public final Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    @l
    public final String getGsmLink() {
        return this.gsmLink;
    }

    @l
    public final a getItem() {
        return this.item;
    }

    @l
    public final String getMsgLink() {
        return this.msgLink;
    }

    @l
    public final b getPeer() {
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
        int iHashCode = this.scenario.hashCode() * 31;
        b bVar = this.peer;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.item;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.gsmLink;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.msgLink;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.startCallDelayMs;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Map<String, String> map = this.extraInfo;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CallMetaInfo(scenario=" + this.scenario);
        if (this.peer != null) {
            sb2.append(", peer=" + this.peer);
        }
        if (this.item != null) {
            sb2.append(", item=" + this.item);
        }
        String str = this.gsmLink;
        if (str != null) {
            sb2.append(", gsmLink=".concat(com.avito.avcalls.utils.l.a(str)));
        }
        String str2 = this.msgLink;
        if (str2 != null) {
            sb2.append(", msgLink=".concat(com.avito.avcalls.utils.l.a(str2)));
        }
        if (this.startCallDelayMs != null) {
            sb2.append(", startCallDelayMs=" + this.startCallDelayMs);
        }
        Map<String, String> map = this.extraInfo;
        if (map != null) {
            sb2.append(", extraInfo=".concat(com.avito.avcalls.utils.l.b(map)));
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* compiled from: CallMetaInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/call/models/CallMetaInfo$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f332710a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f332711b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f332712c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Map<String, String> f332713d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f332714e;

        public a(long j12, @l String str, @l Long l12, @l Map<String, String> map, @l String str2) {
            this.f332710a = j12;
            this.f332711b = str;
            this.f332712c = l12;
            this.f332713d = map;
            this.f332714e = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f332710a == aVar.f332710a && L.f(this.f332711b, aVar.f332711b) && L.f(this.f332712c, aVar.f332712c) && L.f(this.f332713d, aVar.f332713d) && L.f(this.f332714e, aVar.f332714e);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f332710a) * 31;
            String str = this.f332711b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l12 = this.f332712c;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Map<String, String> map = this.f332713d;
            int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            String str2 = this.f332714e;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Item(itemId=" + this.f332710a);
            if (this.f332711b != null) {
                sb2.append(", title=***");
            }
            if (this.f332712c != null) {
                sb2.append(", price=***");
            }
            Map<String, String> map = this.f332713d;
            if (map != null) {
                sb2.append(", imageUrls.size=" + map.size());
            }
            String str = this.f332714e;
            if (str != null) {
                sb2.append(", itemLink=".concat(com.avito.avcalls.utils.l.a(str)));
            }
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ a(long j12, String str, Long l12, Map map, String str2, int i12, C42822w c42822w) {
            this(j12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? null : map, (i12 & 16) != 0 ? null : str2);
        }
    }

    public /* synthetic */ CallMetaInfo(String str, b bVar, a aVar, String str2, String str3, Long l12, Map map, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : bVar, aVar, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : l12, (i12 & 64) != 0 ? null : map);
    }
}
