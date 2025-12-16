package com.avito.avcalls.rtc.connecting;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PeerConnectionEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/avcalls/rtc/connecting/a$a;", "Lcom/avito/avcalls/rtc/connecting/a$b;", "Lcom/avito/avcalls/rtc/connecting/a$c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a {

    /* compiled from: PeerConnectionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/a$a;", "Lcom/avito/avcalls/rtc/connecting/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.rtc.connecting.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10347a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final IceConnectionState f333089a;

        public C10347a(@k IceConnectionState iceConnectionState) {
            super(null);
            this.f333089a = iceConnectionState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10347a) && this.f333089a == ((C10347a) obj).f333089a;
        }

        public final int hashCode() {
            return this.f333089a.hashCode();
        }

        @k
        public final String toString() {
            return "ConnectionStateChanged(state=" + this.f333089a + ')';
        }
    }

    /* compiled from: PeerConnectionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/a$b;", "Lcom/avito/avcalls/rtc/connecting/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final IceCandidate f333090a;

        public b(@k IceCandidate iceCandidate) {
            super(null);
            this.f333090a = iceCandidate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f333090a, ((b) obj).f333090a);
        }

        public final int hashCode() {
            return this.f333090a.hashCode();
        }

        @k
        public final String toString() {
            return "NewIceCandidate(iceCandidate=" + this.f333090a + ')';
        }
    }

    /* compiled from: PeerConnectionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/a$c;", "Lcom/avito/avcalls/rtc/connecting/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SignalingState f333091a;

        public c(@k SignalingState signalingState) {
            super(null);
            this.f333091a = signalingState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f333091a == ((c) obj).f333091a;
        }

        public final int hashCode() {
            return this.f333091a.hashCode();
        }

        @k
        public final String toString() {
            return "SignalingStateChanged(state=" + this.f333091a + ')';
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
