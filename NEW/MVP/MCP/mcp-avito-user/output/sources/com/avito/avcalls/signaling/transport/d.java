package com.avito.avcalls.signaling.transport;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;

/* compiled from: SignalingProcessor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/signaling/transport/d;", "", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: SignalingProcessor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/transport/d$a;", "Lcom/avito/avcalls/signaling/b;", "T", "Lcom/avito/avcalls/signaling/a;", "R", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a<T extends com.avito.avcalls.signaling.b, R extends com.avito.avcalls.signaling.a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.avcalls.signaling.b f333386a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final KSerializer<T> f333387b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final KSerializer<R> f333388c;

        public a(@k com.avito.avcalls.signaling.b bVar, @k KSerializer<T> kSerializer, @k KSerializer<R> kSerializer2) {
            this.f333386a = bVar;
            this.f333387b = kSerializer;
            this.f333388c = kSerializer2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f333386a, aVar.f333386a) && L.f(this.f333387b, aVar.f333387b) && L.f(this.f333388c, aVar.f333388c);
        }

        public final int hashCode() {
            return this.f333388c.hashCode() + ((this.f333387b.hashCode() + (this.f333386a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "OutgoingMessageRequest(message=" + this.f333386a + ", serializer=" + this.f333387b + ", deserializer=" + this.f333388c + ')';
        }
    }
}
