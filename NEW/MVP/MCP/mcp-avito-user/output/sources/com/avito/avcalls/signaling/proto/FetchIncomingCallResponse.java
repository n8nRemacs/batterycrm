package com.avito.avcalls.signaling.proto;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.avcalls.call.models.CallMetaInfo;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: FetchIncomingCall.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011BI\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/signaling/proto/FetchIncomingCallResponse;", "Lcom/avito/avcalls/signaling/a;", "", "seen1", "Lcom/avito/avcalls/signaling/proto/IceConfig;", "iceConfig", "Lcom/avito/avcalls/signaling/proto/VoipMessage;", "msg", "", "Lcom/avito/avcalls/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/avcalls/call/models/CallMetaInfo;", Constants.REFERRER_API_META, "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/signaling/proto/IceConfig;Lcom/avito/avcalls/signaling/proto/VoipMessage;Ljava/lang/String;Lcom/avito/avcalls/call/models/CallMetaInfo;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class FetchIncomingCallResponse implements com.avito.avcalls.signaling.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f333310e = {null, null, null, CallMetaInfo.INSTANCE.serializer()};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IceConfig f333311a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final VoipMessage f333312b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f333313c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CallMetaInfo f333314d;

    /* compiled from: FetchIncomingCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/FetchIncomingCallResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/FetchIncomingCallResponse;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<FetchIncomingCallResponse> serializer() {
            return FetchIncomingCallResponse$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ FetchIncomingCallResponse(int i12, IceConfig iceConfig, VoipMessage voipMessage, String str, CallMetaInfo callMetaInfo, P0 p02) {
        if (15 != (i12 & 15)) {
            E0.b(i12, 15, FetchIncomingCallResponse$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f333311a = iceConfig;
        this.f333312b = voipMessage;
        this.f333313c = str;
        this.f333314d = callMetaInfo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchIncomingCallResponse)) {
            return false;
        }
        FetchIncomingCallResponse fetchIncomingCallResponse = (FetchIncomingCallResponse) obj;
        return L.f(this.f333311a, fetchIncomingCallResponse.f333311a) && L.f(this.f333312b, fetchIncomingCallResponse.f333312b) && L.f(this.f333313c, fetchIncomingCallResponse.f333313c) && L.f(this.f333314d, fetchIncomingCallResponse.f333314d);
    }

    public final int hashCode() {
        return this.f333314d.hashCode() + H.d((this.f333312b.hashCode() + (this.f333311a.f333316a.hashCode() * 31)) * 31, 31, this.f333313c);
    }

    @k
    public final String toString() {
        return "FetchIncomingCallResponse(iceConfig=" + this.f333311a + ", msg=" + this.f333312b + ", from=" + this.f333313c + ", meta=" + this.f333314d + ')';
    }
}
