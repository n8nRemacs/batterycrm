package com.avito.avcalls.signaling.proto;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.avcalls.signaling.b;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: Ping.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fBC\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/avcalls/signaling/proto/PingRequest;", "Lcom/avito/avcalls/signaling/b;", "", "seen1", "", "sqn", "", "Lcom/avito/avcalls/call/models/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/avcalls/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class PingRequest implements b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f333339a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333340b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f333341c;

    /* compiled from: Ping.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/PingRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/PingRequest;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<PingRequest> serializer() {
            return PingRequest$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ PingRequest(int i12, long j12, String str, String str2, P0 p02) {
        if (7 != (i12 & 7)) {
            E0.b(i12, 7, PingRequest$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f333339a = j12;
        this.f333340b = str;
        this.f333341c = str2;
    }

    @Override // com.avito.avcalls.signaling.b
    public final b a(long j12) {
        return new PingRequest(j12, this.f333340b, this.f333341c);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PingRequest)) {
            return false;
        }
        PingRequest pingRequest = (PingRequest) obj;
        return this.f333339a == pingRequest.f333339a && L.f(this.f333340b, pingRequest.f333340b) && L.f(this.f333341c, pingRequest.f333341c);
    }

    public final int hashCode() {
        return this.f333341c.hashCode() + H.d(Long.hashCode(this.f333339a) * 31, 31, this.f333340b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PingRequest(sqn=");
        sb2.append(this.f333339a);
        sb2.append(", callId=");
        sb2.append(this.f333340b);
        sb2.append(", from=");
        return C22026a.c(sb2, this.f333341c, ')');
    }

    public PingRequest(long j12, @k String str, @k String str2) {
        this.f333339a = j12;
        this.f333340b = str;
        this.f333341c = str2;
    }
}
