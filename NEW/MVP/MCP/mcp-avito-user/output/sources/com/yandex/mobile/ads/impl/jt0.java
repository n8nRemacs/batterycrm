package com.yandex.mobile.ads.impl;

import android.media.metrics.LogSessionId;

/* loaded from: classes8.dex */
public final class jt0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final a f386974a;

    @j.X
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f386975b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f386976a;

        static {
            LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f386976a = logSessionId;
        }
    }

    static {
        if (pc1.f388768a < 31) {
            new jt0();
        } else {
            int i12 = a.f386975b;
        }
    }

    public jt0() {
        this((a) null);
        db.b(pc1.f388768a < 31);
    }

    @j.X
    public final LogSessionId a() {
        a aVar = this.f386974a;
        aVar.getClass();
        return aVar.f386976a;
    }

    @j.X
    public jt0(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private jt0(@j.P a aVar) {
        this.f386974a = aVar;
    }
}
