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

/* compiled from: VoipMessage.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B]\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/avcalls/signaling/proto/VoipMessageRequest;", "Lcom/avito/avcalls/signaling/b;", "", "seen1", "", "sqn", "", "Lcom/avito/avcalls/call/models/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/avcalls/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lcom/avito/avcalls/signaling/proto/VoipMessage;", "msg", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/signaling/proto/VoipMessage;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class VoipMessageRequest implements b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f333364a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333365b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f333366c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f333367d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final VoipMessage f333368e;

    /* compiled from: VoipMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/VoipMessageRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/VoipMessageRequest;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<VoipMessageRequest> serializer() {
            return VoipMessageRequest$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ VoipMessageRequest(int i12, long j12, String str, String str2, String str3, VoipMessage voipMessage, P0 p02) {
        if (31 != (i12 & 31)) {
            E0.b(i12, 31, VoipMessageRequest$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f333364a = j12;
        this.f333365b = str;
        this.f333366c = str2;
        this.f333367d = str3;
        this.f333368e = voipMessage;
    }

    @Override // com.avito.avcalls.signaling.b
    public final b a(long j12) {
        return new VoipMessageRequest(j12, this.f333365b, this.f333366c, this.f333367d, this.f333368e);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipMessageRequest)) {
            return false;
        }
        VoipMessageRequest voipMessageRequest = (VoipMessageRequest) obj;
        return this.f333364a == voipMessageRequest.f333364a && L.f(this.f333365b, voipMessageRequest.f333365b) && L.f(this.f333366c, voipMessageRequest.f333366c) && L.f(this.f333367d, voipMessageRequest.f333367d) && L.f(this.f333368e, voipMessageRequest.f333368e);
    }

    public final int hashCode() {
        return this.f333368e.hashCode() + H.d(H.d(H.d(Long.hashCode(this.f333364a) * 31, 31, this.f333365b), 31, this.f333366c), 31, this.f333367d);
    }

    @k
    public final String toString() {
        return "VoipMessageRequest(sqn=" + this.f333364a + ", callId=" + this.f333365b + ", from=" + this.f333366c + ", to=" + this.f333367d + ", msg=" + this.f333368e + ')';
    }

    public VoipMessageRequest(long j12, @k String str, @k String str2, @k String str3, @k VoipMessage voipMessage) {
        this.f333364a = j12;
        this.f333365b = str;
        this.f333366c = str2;
        this.f333367d = str3;
        this.f333368e = voipMessage;
    }
}
