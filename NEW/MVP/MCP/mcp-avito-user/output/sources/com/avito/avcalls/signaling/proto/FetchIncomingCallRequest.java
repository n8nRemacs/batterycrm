package com.avito.avcalls.signaling.proto;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
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

/* compiled from: FetchIncomingCall.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011BM\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/signaling/proto/FetchIncomingCallRequest;", "Lcom/avito/avcalls/signaling/b;", "", "seen1", "", "sqn", "", "Lcom/avito/avcalls/call/models/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/avcalls/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/avcalls/signaling/proto/EndpointInfo;", "endpointInfo", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/signaling/proto/EndpointInfo;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class FetchIncomingCallRequest implements b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f333306a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333307b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f333308c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final EndpointInfo f333309d;

    /* compiled from: FetchIncomingCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/FetchIncomingCallRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/FetchIncomingCallRequest;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<FetchIncomingCallRequest> serializer() {
            return FetchIncomingCallRequest$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ FetchIncomingCallRequest(int i12, long j12, String str, String str2, EndpointInfo endpointInfo, P0 p02) {
        if (15 != (i12 & 15)) {
            E0.b(i12, 15, FetchIncomingCallRequest$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f333306a = j12;
        this.f333307b = str;
        this.f333308c = str2;
        this.f333309d = endpointInfo;
    }

    @Override // com.avito.avcalls.signaling.b
    public final b a(long j12) {
        return new FetchIncomingCallRequest(j12, this.f333307b, this.f333308c, this.f333309d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchIncomingCallRequest)) {
            return false;
        }
        FetchIncomingCallRequest fetchIncomingCallRequest = (FetchIncomingCallRequest) obj;
        return this.f333306a == fetchIncomingCallRequest.f333306a && L.f(this.f333307b, fetchIncomingCallRequest.f333307b) && L.f(this.f333308c, fetchIncomingCallRequest.f333308c) && L.f(this.f333309d, fetchIncomingCallRequest.f333309d);
    }

    public final int hashCode() {
        return this.f333309d.hashCode() + H.d(H.d(Long.hashCode(this.f333306a) * 31, 31, this.f333307b), 31, this.f333308c);
    }

    @k
    public final String toString() {
        return "FetchIncomingCallRequest(sqn=" + this.f333306a + ", callId=" + this.f333307b + ", from=" + this.f333308c + ", endpointInfo=" + this.f333309d + ')';
    }

    public FetchIncomingCallRequest(long j12, @k String str, @k String str2, @k EndpointInfo endpointInfo) {
        this.f333306a = j12;
        this.f333307b = str;
        this.f333308c = str2;
        this.f333309d = endpointInfo;
    }
}
