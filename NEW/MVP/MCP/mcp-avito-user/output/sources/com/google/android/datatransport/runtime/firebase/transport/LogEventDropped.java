package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.c;

/* loaded from: classes10.dex */
public final class LogEventDropped {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f343151c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f343152a;

    /* renamed from: b, reason: collision with root package name */
    public final Reason f343153b;

    public enum Reason implements c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: b, reason: collision with root package name */
        public final int f343162b;

        Reason(int i12) {
            this.f343162b = i12;
        }

        @Override // com.google.firebase.encoders.proto.c
        public final int getNumber() {
            return this.f343162b;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f343163a = 0;

        /* renamed from: b, reason: collision with root package name */
        public Reason f343164b = Reason.REASON_UNKNOWN;
    }

    static {
        new a();
    }

    public LogEventDropped(long j12, Reason reason) {
        this.f343152a = j12;
        this.f343153b = reason;
    }
}
