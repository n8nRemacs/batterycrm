package com.avito.avcalls.android.signaling.proto;

import X41.f;
import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: CreateCall.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eB9\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/CreateCallResponse;", "Lcom/avito/avcalls/android/signaling/a;", "", "seen1", "Lcom/avito/avcalls/android/signaling/proto/IceConfig;", "iceConfig", "Lcom/avito/avcalls/android/signaling/proto/OptionsUpdate;", "options", "Lcom/avito/avcalls/android/call/models/CallMetaInfo;", Constants.REFERRER_API_META, "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/android/signaling/proto/IceConfig;Lcom/avito/avcalls/android/signaling/proto/OptionsUpdate;Lcom/avito/avcalls/android/call/models/CallMetaInfo;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class CreateCallResponse implements com.avito.avcalls.android.signaling.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f332080d = {null, null, CallMetaInfo.INSTANCE.serializer()};

    /* renamed from: a, reason: collision with root package name */
    @l
    public final IceConfig f332081a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final OptionsUpdate f332082b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CallMetaInfo f332083c;

    /* compiled from: CreateCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/CreateCallResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/signaling/proto/CreateCallResponse;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<CreateCallResponse> serializer() {
            return CreateCallResponse$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ CreateCallResponse(int i12, IceConfig iceConfig, OptionsUpdate optionsUpdate, CallMetaInfo callMetaInfo, P0 p02) {
        if (4 != (i12 & 4)) {
            E0.b(i12, 4, CreateCallResponse$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        if ((i12 & 1) == 0) {
            this.f332081a = null;
        } else {
            this.f332081a = iceConfig;
        }
        if ((i12 & 2) == 0) {
            this.f332082b = null;
        } else {
            this.f332082b = optionsUpdate;
        }
        this.f332083c = callMetaInfo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCallResponse)) {
            return false;
        }
        CreateCallResponse createCallResponse = (CreateCallResponse) obj;
        return L.f(this.f332081a, createCallResponse.f332081a) && L.f(this.f332082b, createCallResponse.f332082b) && L.f(this.f332083c, createCallResponse.f332083c);
    }

    public final int hashCode() {
        IceConfig iceConfig = this.f332081a;
        int iHashCode = (iceConfig == null ? 0 : iceConfig.f332098a.hashCode()) * 31;
        OptionsUpdate optionsUpdate = this.f332082b;
        return this.f332083c.hashCode() + ((iHashCode + (optionsUpdate != null ? optionsUpdate.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "CreateCallResponse(iceConfig=" + this.f332081a + ", options=" + this.f332082b + ", meta=" + this.f332083c + ')';
    }

    public CreateCallResponse(IceConfig iceConfig, OptionsUpdate optionsUpdate, CallMetaInfo callMetaInfo, int i12, C42822w c42822w) {
        iceConfig = (i12 & 1) != 0 ? null : iceConfig;
        optionsUpdate = (i12 & 2) != 0 ? null : optionsUpdate;
        this.f332081a = iceConfig;
        this.f332082b = optionsUpdate;
        this.f332083c = callMetaInfo;
    }
}
