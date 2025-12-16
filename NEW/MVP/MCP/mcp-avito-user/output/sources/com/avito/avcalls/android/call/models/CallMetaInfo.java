package com.avito.avcalls.android.call.models;

import Y61.k;
import Y61.l;
import com.avito.avcalls.android.utils.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.w;

/* compiled from: CallMetaInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/android/call/models/CallMetaInfo;", "", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w(with = CallMetaInfoSerializer.class)
/* loaded from: classes5.dex */
public final /* data */ class CallMetaInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f331539a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final b f331540b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final a f331541c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f331542d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f331543e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Long f331544f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Map<String, String> f331545g;

    /* compiled from: CallMetaInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/call/models/CallMetaInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/call/models/CallMetaInfo;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/models/CallMetaInfo$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f331551a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Map<String, String> f331552b;

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
            return L.f(this.f331551a, bVar.f331551a) && L.f(this.f331552b, bVar.f331552b);
        }

        public final int hashCode() {
            String str = this.f331551a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, String> map = this.f331552b;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("User(");
            String str = this.f331551a;
            if (str == null) {
                sb2.append("name=null");
            }
            if (str != null) {
                sb2.append("name=***");
            }
            Map<String, String> map = this.f331552b;
            if (map != null) {
                sb2.append(", avatarUrls.size=" + map.size());
            }
            sb2.append(")");
            return sb2.toString();
        }

        public b(@l String str, @l Map<String, String> map) {
            this.f331551a = str;
            this.f331552b = map;
        }

        public /* synthetic */ b(String str, Map map, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : map);
        }
    }

    public CallMetaInfo(@k String str, @l b bVar, @l a aVar, @l String str2, @l String str3, @l Long l12, @l Map<String, String> map) {
        this.f331539a = str;
        this.f331540b = bVar;
        this.f331541c = aVar;
        this.f331542d = str2;
        this.f331543e = str3;
        this.f331544f = l12;
        this.f331545g = map;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallMetaInfo)) {
            return false;
        }
        CallMetaInfo callMetaInfo = (CallMetaInfo) obj;
        return L.f(this.f331539a, callMetaInfo.f331539a) && L.f(this.f331540b, callMetaInfo.f331540b) && L.f(this.f331541c, callMetaInfo.f331541c) && L.f(this.f331542d, callMetaInfo.f331542d) && L.f(this.f331543e, callMetaInfo.f331543e) && L.f(this.f331544f, callMetaInfo.f331544f) && L.f(this.f331545g, callMetaInfo.f331545g);
    }

    public final int hashCode() {
        int iHashCode = this.f331539a.hashCode() * 31;
        b bVar = this.f331540b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.f331541c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f331542d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f331543e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.f331544f;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Map<String, String> map = this.f331545g;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CallMetaInfo(scenario=" + this.f331539a);
        b bVar = this.f331540b;
        if (bVar != null) {
            sb2.append(", peer=" + bVar);
        }
        a aVar = this.f331541c;
        if (aVar != null) {
            sb2.append(", item=" + aVar);
        }
        String str = this.f331542d;
        if (str != null) {
            sb2.append(", gsmLink=".concat(n.a(str)));
        }
        String str2 = this.f331543e;
        if (str2 != null) {
            sb2.append(", msgLink=".concat(n.a(str2)));
        }
        Long l12 = this.f331544f;
        if (l12 != null) {
            sb2.append(", startCallDelayMs=" + l12);
        }
        Map<String, String> map = this.f331545g;
        if (map != null) {
            sb2.append(", extraInfo=".concat(n.b(map)));
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* compiled from: CallMetaInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/models/CallMetaInfo$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f331546a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f331547b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f331548c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Map<String, String> f331549d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f331550e;

        public a(long j12, @l String str, @l Long l12, @l Map<String, String> map, @l String str2) {
            this.f331546a = j12;
            this.f331547b = str;
            this.f331548c = l12;
            this.f331549d = map;
            this.f331550e = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f331546a == aVar.f331546a && L.f(this.f331547b, aVar.f331547b) && L.f(this.f331548c, aVar.f331548c) && L.f(this.f331549d, aVar.f331549d) && L.f(this.f331550e, aVar.f331550e);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f331546a) * 31;
            String str = this.f331547b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l12 = this.f331548c;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Map<String, String> map = this.f331549d;
            int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            String str2 = this.f331550e;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Item(itemId=" + this.f331546a);
            if (this.f331547b != null) {
                sb2.append(", title=***");
            }
            if (this.f331548c != null) {
                sb2.append(", price=***");
            }
            Map<String, String> map = this.f331549d;
            if (map != null) {
                sb2.append(", imageUrls.size=" + map.size());
            }
            String str = this.f331550e;
            if (str != null) {
                sb2.append(", itemLink=".concat(n.a(str)));
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
