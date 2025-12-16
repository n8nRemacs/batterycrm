package com.avito.avcalls.signaling.proto;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: IncomingDataMessage.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011BM\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/signaling/proto/IncomingDataMessage;", "Lcom/avito/avcalls/signaling/a;", "", "seen1", "", "Lcom/avito/avcalls/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/avcalls/call/models/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/avcalls/signaling/proto/VoipMessage;", "msg", "", "sqn", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/signaling/proto/VoipMessage;JLkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class IncomingDataMessage implements com.avito.avcalls.signaling.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f333321a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333322b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final VoipMessage f333323c;

    /* renamed from: d, reason: collision with root package name */
    public final long f333324d;

    /* compiled from: IncomingDataMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/IncomingDataMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/IncomingDataMessage;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<IncomingDataMessage> serializer() {
            return IncomingDataMessage$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ IncomingDataMessage(int i12, String str, String str2, VoipMessage voipMessage, long j12, P0 p02) {
        if (15 != (i12 & 15)) {
            E0.b(i12, 15, IncomingDataMessage$$serializer.INSTANCE.getF332717a());
            throw null;
        }
        this.f333321a = str;
        this.f333322b = str2;
        this.f333323c = voipMessage;
        this.f333324d = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncomingDataMessage)) {
            return false;
        }
        IncomingDataMessage incomingDataMessage = (IncomingDataMessage) obj;
        return L.f(this.f333321a, incomingDataMessage.f333321a) && L.f(this.f333322b, incomingDataMessage.f333322b) && L.f(this.f333323c, incomingDataMessage.f333323c) && this.f333324d == incomingDataMessage.f333324d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f333324d) + ((this.f333323c.hashCode() + H.d(this.f333321a.hashCode() * 31, 31, this.f333322b)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncomingDataMessage(from=");
        sb2.append(this.f333321a);
        sb2.append(", callId=");
        sb2.append(this.f333322b);
        sb2.append(", msg=");
        sb2.append(this.f333323c);
        sb2.append(", sqn=");
        return r.u(sb2, this.f333324d, ')');
    }
}
