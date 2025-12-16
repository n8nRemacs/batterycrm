package com.avito.avcalls.signaling;

import androidx.compose.foundation.H;
import com.avito.avcalls.signaling.proto.SignalingRawError;
import com.avito.avcalls.signaling.proto.SignalingResponse;
import com.avito.avcalls.signaling.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.p0;

/* compiled from: SignalingResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/avcalls/signaling/x;", "T", "", "<init>", "()V", "Companion", "a", "b", "c", "Lcom/avito/avcalls/signaling/x$b;", "Lcom/avito/avcalls/signaling/x$c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class x<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: SignalingResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/signaling/x$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.signaling.x$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static x a(@Y61.k String str, @Y61.k KSerializer kSerializer) {
            String str2;
            try {
                SignalingResponse signalingResponse = (SignalingResponse) com.avito.avcalls.utils.i.a().d(str, SignalingResponse.INSTANCE.serializer());
                if (signalingResponse.f333344a != null) {
                    AbstractC43443a abstractC43443aA = com.avito.avcalls.utils.i.a();
                    JsonElement jsonElement = signalingResponse.f333344a;
                    abstractC43443aA.getClass();
                    return new c(p0.a(abstractC43443aA, jsonElement, kSerializer));
                }
                SignalingRawError signalingRawError = signalingResponse.f333345b;
                v.Companion companion = v.INSTANCE;
                if (signalingRawError == null || (str2 = signalingRawError.f333343a) == null) {
                    str2 = "unknown";
                }
                companion.getClass();
                return new b(v.Companion.a(str2));
            } catch (SerializationException e12) {
                String message = e12.getMessage();
                return new b(new v.f(message != null ? message : "unknown", null));
            }
        }

        public Companion() {
        }
    }

    /* compiled from: SignalingResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/signaling/x$b;", "T", "Lcom/avito/avcalls/signaling/x;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b<T> extends x<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final v f333442a;

        public b(@Y61.k v vVar) {
            super(null);
            this.f333442a = vVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f333442a, ((b) obj).f333442a);
        }

        public final int hashCode() {
            return this.f333442a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Error(error=" + this.f333442a + ')';
        }
    }

    /* compiled from: SignalingResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/signaling/x$c;", "T", "Lcom/avito/avcalls/signaling/x;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c<T> extends x<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f333443a;

        public c(T t12) {
            super(null);
            this.f333443a = t12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f333443a, ((c) obj).f333443a);
        }

        public final int hashCode() {
            T t12 = this.f333443a;
            if (t12 == null) {
                return 0;
            }
            return t12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("Success(data="), this.f333443a, ')');
        }
    }

    public /* synthetic */ x(C42822w c42822w) {
        this();
    }

    public x() {
    }
}
