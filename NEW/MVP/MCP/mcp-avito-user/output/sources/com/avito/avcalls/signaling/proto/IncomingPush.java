package com.avito.avcalls.signaling.proto;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: IncomingPush.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011BM\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/signaling/proto/IncomingPush;", "Lcom/avito/avcalls/signaling/a;", "", "seen1", "", "Lcom/avito/avcalls/call/models/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/avcalls/call/models/UserId;", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "", "isVideo", "Lcom/avito/avcalls/call/models/CallMetaInfo;", Constants.REFERRER_API_META, "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLcom/avito/avcalls/call/models/CallMetaInfo;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class IncomingPush implements com.avito.avcalls.signaling.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f333331e = {null, null, null, CallMetaInfo.INSTANCE.serializer()};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f333332a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f333333b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f333334c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CallMetaInfo f333335d;

    /* compiled from: IncomingPush.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/IncomingPush$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/IncomingPush;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<IncomingPush> serializer() {
            return IncomingPush$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ IncomingPush(int i12, String str, String str2, boolean z12, CallMetaInfo callMetaInfo, P0 p02) {
        if (15 != (i12 & 15)) {
            E0.b(i12, 15, IncomingPush$$serializer.INSTANCE.getF332717a());
            throw null;
        }
        this.f333332a = str;
        this.f333333b = str2;
        this.f333334c = z12;
        this.f333335d = callMetaInfo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncomingPush)) {
            return false;
        }
        IncomingPush incomingPush = (IncomingPush) obj;
        return L.f(this.f333332a, incomingPush.f333332a) && L.f(this.f333333b, incomingPush.f333333b) && this.f333334c == incomingPush.f333334c && L.f(this.f333335d, incomingPush.f333335d);
    }

    public final int hashCode() {
        return this.f333335d.hashCode() + r.i(H.d(this.f333332a.hashCode() * 31, 31, this.f333333b), 31, this.f333334c);
    }

    @k
    public final String toString() {
        return "IncomingPush(callId=" + this.f333332a + ", to=" + this.f333333b + ", isVideo=" + this.f333334c + ", meta=" + this.f333335d + ')';
    }
}
