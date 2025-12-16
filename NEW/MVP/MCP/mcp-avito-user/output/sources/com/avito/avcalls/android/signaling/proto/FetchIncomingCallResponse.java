package com.avito.avcalls.android.signaling.proto;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: FetchIncomingCall.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011BI\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/FetchIncomingCallResponse;", "Lcom/avito/avcalls/android/signaling/a;", "", "seen1", "Lcom/avito/avcalls/android/signaling/proto/IceConfig;", "iceConfig", "Lcom/avito/avcalls/android/signaling/proto/VoipMessage;", "msg", "", "Lcom/avito/avcalls/android/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/avcalls/android/call/models/CallMetaInfo;", Constants.REFERRER_API_META, "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/android/signaling/proto/IceConfig;Lcom/avito/avcalls/android/signaling/proto/VoipMessage;Ljava/lang/String;Lcom/avito/avcalls/android/call/models/CallMetaInfo;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class FetchIncomingCallResponse implements com.avito.avcalls.android.signaling.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f332092e = {null, null, null, CallMetaInfo.INSTANCE.serializer()};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IceConfig f332093a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final VoipMessage f332094b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f332095c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CallMetaInfo f332096d;

    /* compiled from: FetchIncomingCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/FetchIncomingCallResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/signaling/proto/FetchIncomingCallResponse;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        this.f332093a = iceConfig;
        this.f332094b = voipMessage;
        this.f332095c = str;
        this.f332096d = callMetaInfo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchIncomingCallResponse)) {
            return false;
        }
        FetchIncomingCallResponse fetchIncomingCallResponse = (FetchIncomingCallResponse) obj;
        return L.f(this.f332093a, fetchIncomingCallResponse.f332093a) && L.f(this.f332094b, fetchIncomingCallResponse.f332094b) && L.f(this.f332095c, fetchIncomingCallResponse.f332095c) && L.f(this.f332096d, fetchIncomingCallResponse.f332096d);
    }

    public final int hashCode() {
        return this.f332096d.hashCode() + H.d((this.f332094b.hashCode() + (this.f332093a.f332098a.hashCode() * 31)) * 31, 31, this.f332095c);
    }

    @k
    public final String toString() {
        return "FetchIncomingCallResponse(iceConfig=" + this.f332093a + ", msg=" + this.f332094b + ", from=" + this.f332095c + ", meta=" + this.f332096d + ')';
    }
}
