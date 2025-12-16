package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import j.X;

/* compiled from: PlayerId.java */
@J
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f48756b = 0;

    /* renamed from: a, reason: collision with root package name */
    @P
    public final a f48757a;

    /* compiled from: PlayerId.java */
    @X
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f48758b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f48759a;

        static {
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f48759a = logSessionId;
        }
    }

    static {
        if (M.f47887a < 31) {
            new w();
        } else {
            int i12 = a.f48758b;
        }
    }

    public w() {
        this((a) null);
        C23110a.g(M.f47887a < 31);
    }

    @X
    public final LogSessionId a() {
        a aVar = this.f48757a;
        aVar.getClass();
        return aVar.f48759a;
    }

    @X
    public w(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public w(@P a aVar) {
        this.f48757a = aVar;
    }
}
