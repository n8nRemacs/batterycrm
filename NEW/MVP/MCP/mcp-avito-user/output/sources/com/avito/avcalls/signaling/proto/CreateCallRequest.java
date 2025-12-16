package com.avito.avcalls.signaling.proto;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.avcalls.call.models.CreateCallMetaInfo;
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

/* compiled from: CreateCall.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016Bo\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/avcalls/signaling/proto/CreateCallRequest;", "Lcom/avito/avcalls/signaling/b;", "", "seen1", "", "sqn", "", "Lcom/avito/avcalls/call/models/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/avcalls/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lcom/avito/avcalls/signaling/proto/EndpointInfo;", "endpointInfo", "", "isVideo", "Lcom/avito/avcalls/call/models/CreateCallMetaInfo;", Constants.REFERRER_API_META, "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/signaling/proto/EndpointInfo;ZLcom/avito/avcalls/call/models/CreateCallMetaInfo;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class CreateCallRequest implements b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f333291a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333292b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f333293c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f333294d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final EndpointInfo f333295e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f333296f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final CreateCallMetaInfo f333297g;

    /* compiled from: CreateCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/CreateCallRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/CreateCallRequest;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<CreateCallRequest> serializer() {
            return CreateCallRequest$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ CreateCallRequest(int i12, long j12, String str, String str2, String str3, EndpointInfo endpointInfo, boolean z12, CreateCallMetaInfo createCallMetaInfo, P0 p02) {
        if (127 != (i12 & 127)) {
            E0.b(i12, 127, CreateCallRequest$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f333291a = j12;
        this.f333292b = str;
        this.f333293c = str2;
        this.f333294d = str3;
        this.f333295e = endpointInfo;
        this.f333296f = z12;
        this.f333297g = createCallMetaInfo;
    }

    @Override // com.avito.avcalls.signaling.b
    public final b a(long j12) {
        return new CreateCallRequest(j12, this.f333292b, this.f333293c, this.f333294d, this.f333295e, this.f333296f, this.f333297g);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCallRequest)) {
            return false;
        }
        CreateCallRequest createCallRequest = (CreateCallRequest) obj;
        return this.f333291a == createCallRequest.f333291a && L.f(this.f333292b, createCallRequest.f333292b) && L.f(this.f333293c, createCallRequest.f333293c) && L.f(this.f333294d, createCallRequest.f333294d) && L.f(this.f333295e, createCallRequest.f333295e) && this.f333296f == createCallRequest.f333296f && L.f(this.f333297g, createCallRequest.f333297g);
    }

    public final int hashCode() {
        return this.f333297g.hashCode() + r.i((this.f333295e.hashCode() + H.d(H.d(H.d(Long.hashCode(this.f333291a) * 31, 31, this.f333292b), 31, this.f333293c), 31, this.f333294d)) * 31, 31, this.f333296f);
    }

    @k
    public final String toString() {
        return "CreateCallRequest(sqn=" + this.f333291a + ", callId=" + this.f333292b + ", from=" + this.f333293c + ", to=" + this.f333294d + ", endpointInfo=" + this.f333295e + ", isVideo=" + this.f333296f + ", meta=" + this.f333297g + ')';
    }

    public CreateCallRequest(long j12, @k String str, @k String str2, @k String str3, @k EndpointInfo endpointInfo, boolean z12, @k CreateCallMetaInfo createCallMetaInfo) {
        this.f333291a = j12;
        this.f333292b = str;
        this.f333293c = str2;
        this.f333294d = str3;
        this.f333295e = endpointInfo;
        this.f333296f = z12;
        this.f333297g = createCallMetaInfo;
    }
}
