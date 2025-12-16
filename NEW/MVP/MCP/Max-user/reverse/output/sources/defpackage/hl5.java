package defpackage;

import android.content.Context;
import android.os.Looper;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class hl5 {
    public final Context a;
    public mwf b;
    public final crf c;
    public crf d;
    public crf e;
    public crf f;
    public crf g;
    public final dm4 h;
    public Looper i;
    public final int j;
    public final k20 k;
    public final int l;
    public final boolean m;
    public final k9e n;
    public final x3e o;
    public final long p;
    public final long q;
    public final long r;
    public yn4 s;
    public final long t;
    public long u;
    public boolean v;
    public pea w;
    public boolean x;
    public final String y;

    public hl5(Context context) {
        this(context, new k30(context, 2), new k30(context, 3));
    }

    public final em5 a() {
        hsi.g(!this.x);
        this.x = true;
        return new em5(this);
    }

    public final void b(jb8 jb8Var) {
        hsi.g(!this.x);
        this.f = new eo4(6, jb8Var);
    }

    public final void c(ar4 ar4Var) {
        hsi.g(!this.x);
        this.e = new eo4(7, ar4Var);
    }

    public hl5(Context context, vld vldVar) {
        this(context, new eo4(3, vldVar), new k30(context, 1));
    }

    public hl5(Context context, crf crfVar, crf crfVar2) {
        k30 k30Var = new k30(context, 5);
        te4 te4Var = new te4(2);
        k30 k30Var2 = new k30(context, 7);
        dm4 dm4Var = new dm4(22);
        context.getClass();
        this.a = context;
        this.c = crfVar;
        this.d = crfVar2;
        this.e = k30Var;
        this.f = te4Var;
        this.g = k30Var2;
        this.h = dm4Var;
        this.i = zxg.z();
        this.k = k20.h;
        this.l = 1;
        this.m = true;
        this.n = k9e.c;
        this.p = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        this.q = BuildConfig.SILENCE_TIME_TO_UPLOAD;
        this.r = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.o = x3e.b;
        this.s = new yn4(1, zxg.U(20L), zxg.U(500L));
        this.b = mwf.a;
        this.t = 500L;
        this.u = 2000L;
        this.v = true;
        this.y = "";
        this.j = -1000;
        new u1j();
    }
}
