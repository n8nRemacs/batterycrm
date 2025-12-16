package com.avito.avcalls.android.signaling.transport;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;

/* compiled from: SignalingProcessor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/signaling/transport/d;", "", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: SignalingProcessor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/transport/d$a;", "Lcom/avito/avcalls/android/signaling/b;", "T", "Lcom/avito/avcalls/android/signaling/a;", "R", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a<T extends com.avito.avcalls.android.signaling.b, R extends com.avito.avcalls.android.signaling.a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.avcalls.android.signaling.b f332165a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final KSerializer<T> f332166b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final KSerializer<R> f332167c;

        public a(@k com.avito.avcalls.android.signaling.b bVar, @k KSerializer<T> kSerializer, @k KSerializer<R> kSerializer2) {
            this.f332165a = bVar;
            this.f332166b = kSerializer;
            this.f332167c = kSerializer2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f332165a, aVar.f332165a) && L.f(this.f332166b, aVar.f332166b) && L.f(this.f332167c, aVar.f332167c);
        }

        public final int hashCode() {
            return this.f332167c.hashCode() + ((this.f332166b.hashCode() + (this.f332165a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "OutgoingMessageRequest(message=" + this.f332165a + ", serializer=" + this.f332166b + ", deserializer=" + this.f332167c + ')';
        }
    }
}
