package com.avito.avcalls.android.config.proto;

import Y61.k;
import Y61.l;
import com.avito.avcalls.android.signaling.b;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.w;

/* compiled from: GetConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\fB-\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/avito/avcalls/android/config/proto/GetConfigRequest;", "Lcom/avito/avcalls/android/signaling/b;", "", "seen1", "", "sqn", "Lkotlinx/serialization/json/JsonObject;", "params", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IJLkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class GetConfigRequest implements b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f331674a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JsonObject f331675b;

    /* compiled from: GetConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/config/proto/GetConfigRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/config/proto/GetConfigRequest;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<GetConfigRequest> serializer() {
            return GetConfigRequest$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ GetConfigRequest(int i12, long j12, JsonObject jsonObject, P0 p02) {
        if (1 != (i12 & 1)) {
            E0.b(i12, 1, GetConfigRequest$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f331674a = j12;
        if ((i12 & 2) == 0) {
            this.f331675b = new JsonObject(kotlin.collections.P0.c());
        } else {
            this.f331675b = jsonObject;
        }
    }

    @Override // com.avito.avcalls.android.signaling.b
    public final b a(long j12) {
        return new GetConfigRequest(j12, this.f331675b);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetConfigRequest)) {
            return false;
        }
        GetConfigRequest getConfigRequest = (GetConfigRequest) obj;
        return this.f331674a == getConfigRequest.f331674a && L.f(this.f331675b, getConfigRequest.f331675b);
    }

    public final int hashCode() {
        return this.f331675b.f412952b.hashCode() + (Long.hashCode(this.f331674a) * 31);
    }

    @k
    public final String toString() {
        return "GetConfigRequest(sqn=" + this.f331674a + ", params=" + this.f331675b + ')';
    }

    public GetConfigRequest(long j12, @k JsonObject jsonObject) {
        this.f331674a = j12;
        this.f331675b = jsonObject;
    }

    public /* synthetic */ GetConfigRequest(long j12, JsonObject jsonObject, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? new JsonObject(kotlin.collections.P0.c()) : jsonObject);
    }
}
