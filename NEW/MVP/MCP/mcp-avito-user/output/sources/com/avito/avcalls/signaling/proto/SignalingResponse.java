package com.avito.avcalls.signaling.proto;

import Y61.k;
import Y61.l;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.w;

/* compiled from: SignalingResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\fB/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/avito/avcalls/signaling/proto/SignalingResponse;", "", "", "seen1", "Lkotlinx/serialization/json/JsonElement;", "data", "Lcom/avito/avcalls/signaling/proto/SignalingRawError;", "error", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILkotlinx/serialization/json/JsonElement;Lcom/avito/avcalls/signaling/proto/SignalingRawError;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class SignalingResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final JsonElement f333344a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SignalingRawError f333345b;

    /* compiled from: SignalingResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/SignalingResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/SignalingResponse;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<SignalingResponse> serializer() {
            return SignalingResponse$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public SignalingResponse() {
        this((JsonElement) null, (SignalingRawError) null, 3, (C42822w) null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalingResponse)) {
            return false;
        }
        SignalingResponse signalingResponse = (SignalingResponse) obj;
        return L.f(this.f333344a, signalingResponse.f333344a) && L.f(this.f333345b, signalingResponse.f333345b);
    }

    public final int hashCode() {
        JsonElement jsonElement = this.f333344a;
        int iHashCode = (jsonElement == null ? 0 : jsonElement.hashCode()) * 31;
        SignalingRawError signalingRawError = this.f333345b;
        return iHashCode + (signalingRawError != null ? signalingRawError.f333343a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SignalingResponse(data=" + this.f333344a + ", error=" + this.f333345b + ')';
    }

    @InterfaceC42830m
    public /* synthetic */ SignalingResponse(int i12, JsonElement jsonElement, SignalingRawError signalingRawError, P0 p02) {
        if ((i12 & 1) == 0) {
            this.f333344a = null;
        } else {
            this.f333344a = jsonElement;
        }
        if ((i12 & 2) == 0) {
            this.f333345b = null;
        } else {
            this.f333345b = signalingRawError;
        }
    }

    public SignalingResponse(JsonElement jsonElement, SignalingRawError signalingRawError, int i12, C42822w c42822w) {
        jsonElement = (i12 & 1) != 0 ? null : jsonElement;
        signalingRawError = (i12 & 2) != 0 ? null : signalingRawError;
        this.f333344a = jsonElement;
        this.f333345b = signalingRawError;
    }
}
