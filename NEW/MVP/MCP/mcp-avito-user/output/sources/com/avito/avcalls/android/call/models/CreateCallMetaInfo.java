package com.avito.avcalls.android.call.models;

import X41.f;
import Y61.k;
import Y61.l;
import com.avito.avcalls.android.utils.n;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;

/* compiled from: CreateCallMetaInfo.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fBK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/avcalls/android/call/models/CreateCallMetaInfo;", "", "", "seen1", "", "scenario", "", "itemId", "", "Lcom/avito/avcalls/android/call/models/ExtraMetaInfo;", "extraInfo", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class CreateCallMetaInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f331567d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f331568a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f331569b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Map<String, String> f331570c;

    /* compiled from: CreateCallMetaInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/call/models/CreateCallMetaInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/call/models/CreateCallMetaInfo;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<CreateCallMetaInfo> serializer() {
            return CreateCallMetaInfo$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    static {
        V0 v02 = V0.f412822a;
        f331567d = new KSerializer[]{null, null, new C43400e0(v02, v02)};
    }

    @InterfaceC42830m
    public /* synthetic */ CreateCallMetaInfo(int i12, String str, Long l12, Map map, P0 p02) {
        if (3 != (i12 & 3)) {
            E0.b(i12, 3, CreateCallMetaInfo$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f331568a = str;
        this.f331569b = l12;
        if ((i12 & 4) == 0) {
            this.f331570c = null;
        } else {
            this.f331570c = map;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCallMetaInfo)) {
            return false;
        }
        CreateCallMetaInfo createCallMetaInfo = (CreateCallMetaInfo) obj;
        return L.f(this.f331568a, createCallMetaInfo.f331568a) && L.f(this.f331569b, createCallMetaInfo.f331569b) && L.f(this.f331570c, createCallMetaInfo.f331570c);
    }

    public final int hashCode() {
        int iHashCode = this.f331568a.hashCode() * 31;
        Long l12 = this.f331569b;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Map<String, String> map = this.f331570c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CreateCallMetaInfo(scenario=" + this.f331568a);
        Long l12 = this.f331569b;
        if (l12 != null) {
            sb2.append(", itemId=" + l12);
        }
        Map<String, String> map = this.f331570c;
        if (map != null) {
            sb2.append(", extraInfo=".concat(n.b(map)));
        }
        sb2.append(")");
        return sb2.toString();
    }

    public CreateCallMetaInfo(@k String str, @l Long l12, @l Map<String, String> map) {
        this.f331568a = str;
        this.f331569b = l12;
        this.f331570c = map;
    }

    public /* synthetic */ CreateCallMetaInfo(String str, Long l12, Map map, int i12, C42822w c42822w) {
        this(str, l12, (i12 & 4) != 0 ? null : map);
    }
}
