package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class hud {
    public final /* synthetic */ int a;
    public final gud b;
    public lud c;
    public jw4 d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public hud(gud gudVar) {
        this.a = 0;
        this.c = null;
        this.d = null;
        this.e = TimeUnit.MILLISECONDS.toMillis(200L);
        this.f = TimeUnit.SECONDS.toMillis(4L);
        this.g = 2.0f;
        this.h = 0.1f;
        this.b = gudVar;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RtcCommandConfig{command=" + this.b + ", sentListener=null, successListener=" + this.c + ", errorListener=" + this.d + ", maxRetryCount=0, minRetryTimeoutMs=" + this.e + ", maxRetryTimeoutMs=" + this.f + ", retryBackoffFactor=" + this.g + ", retryBackoffJitter=" + this.h + '}';
            default:
                return super.toString();
        }
    }

    public hud(hud hudVar) {
        this.a = 1;
        gud gudVar = hudVar.b;
        float f = hudVar.h;
        float f2 = hudVar.g;
        long j = hudVar.f;
        long j2 = hudVar.e;
        if (gudVar == null) {
            throw new IllegalArgumentException("Illegal 'command' value: null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(vb9.e(j2, "Illegal 'minRetryTimeoutMs' value: "));
        }
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "Illegal 'maxRetryTimeoutMs' value: "));
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f2);
        }
        if (f >= 0.0f) {
            this.b = gudVar;
            this.c = hudVar.c;
            this.d = hudVar.d;
            this.e = j2;
            this.f = j;
            this.g = f2;
            this.h = f;
            return;
        }
        throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f);
    }
}
