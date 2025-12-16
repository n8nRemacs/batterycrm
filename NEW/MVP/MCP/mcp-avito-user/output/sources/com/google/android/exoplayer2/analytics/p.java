package com.google.android.exoplayer2.analytics;

import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import j.X;

/* compiled from: PlayerId.java */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f343842b = 0;

    /* renamed from: a, reason: collision with root package name */
    @P
    public final a f343843a;

    /* compiled from: PlayerId.java */
    @X
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f343844b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f343845a;

        static {
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f343845a = logSessionId;
        }
    }

    static {
        if (U.f348106a < 31) {
            new p();
        } else {
            int i12 = a.f343844b;
        }
    }

    public p() {
        this((a) null);
        C36585a.d(U.f348106a < 31);
    }

    @X
    public final LogSessionId a() {
        a aVar = this.f343843a;
        aVar.getClass();
        return aVar.f343845a;
    }

    @X
    public p(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public p(@P a aVar) {
        this.f343843a = aVar;
    }
}
