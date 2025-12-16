package com.avito.avcalls.android.signaling.proto;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import com.avito.avcalls.android.signaling.b;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016Bo\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/CreateCallRequest;", "Lcom/avito/avcalls/android/signaling/b;", "", "seen1", "", "sqn", "", "Lcom/avito/avcalls/android/call/models/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/avcalls/android/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lcom/avito/avcalls/android/signaling/proto/EndpointInfo;", "endpointInfo", "", "isVideo", "Lcom/avito/avcalls/android/call/models/CreateCallMetaInfo;", Constants.REFERRER_API_META, "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/android/signaling/proto/EndpointInfo;ZLcom/avito/avcalls/android/call/models/CreateCallMetaInfo;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class CreateCallRequest implements b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f332073a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f332074b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f332075c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f332076d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final EndpointInfo f332077e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f332078f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final CreateCallMetaInfo f332079g;

    /* compiled from: CreateCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/CreateCallRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/signaling/proto/CreateCallRequest;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        this.f332073a = j12;
        this.f332074b = str;
        this.f332075c = str2;
        this.f332076d = str3;
        this.f332077e = endpointInfo;
        this.f332078f = z12;
        this.f332079g = createCallMetaInfo;
    }

    @Override // com.avito.avcalls.android.signaling.b
    public final b a(long j12) {
        return new CreateCallRequest(j12, this.f332074b, this.f332075c, this.f332076d, this.f332077e, this.f332078f, this.f332079g);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCallRequest)) {
            return false;
        }
        CreateCallRequest createCallRequest = (CreateCallRequest) obj;
        return this.f332073a == createCallRequest.f332073a && L.f(this.f332074b, createCallRequest.f332074b) && L.f(this.f332075c, createCallRequest.f332075c) && L.f(this.f332076d, createCallRequest.f332076d) && L.f(this.f332077e, createCallRequest.f332077e) && this.f332078f == createCallRequest.f332078f && L.f(this.f332079g, createCallRequest.f332079g);
    }

    public final int hashCode() {
        return this.f332079g.hashCode() + r.i((this.f332077e.hashCode() + H.d(H.d(H.d(Long.hashCode(this.f332073a) * 31, 31, this.f332074b), 31, this.f332075c), 31, this.f332076d)) * 31, 31, this.f332078f);
    }

    @k
    public final String toString() {
        return "CreateCallRequest(sqn=" + this.f332073a + ", callId=" + this.f332074b + ", from=" + this.f332075c + ", to=" + this.f332076d + ", endpointInfo=" + this.f332077e + ", isVideo=" + this.f332078f + ", meta=" + this.f332079g + ')';
    }

    public CreateCallRequest(long j12, @k String str, @k String str2, @k String str3, @k EndpointInfo endpointInfo, boolean z12, @k CreateCallMetaInfo createCallMetaInfo) {
        this.f332073a = j12;
        this.f332074b = str;
        this.f332075c = str2;
        this.f332076d = str3;
        this.f332077e = endpointInfo;
        this.f332078f = z12;
        this.f332079g = createCallMetaInfo;
    }
}
