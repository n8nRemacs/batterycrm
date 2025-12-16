package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.C36600p;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.spherical.e;
import j.P;
import java.nio.FloatBuffer;

/* compiled from: ProjectionRenderer.java */
/* loaded from: classes6.dex */
final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f348350i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f348351j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f348352k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f348353a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public a f348354b;

    /* renamed from: c, reason: collision with root package name */
    public C36600p f348355c;

    /* renamed from: d, reason: collision with root package name */
    public int f348356d;

    /* renamed from: e, reason: collision with root package name */
    public int f348357e;

    /* renamed from: f, reason: collision with root package name */
    public int f348358f;

    /* renamed from: g, reason: collision with root package name */
    public int f348359g;

    /* renamed from: h, reason: collision with root package name */
    public int f348360h;

    /* compiled from: ProjectionRenderer.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f348361a;

        /* renamed from: b, reason: collision with root package name */
        public final FloatBuffer f348362b;

        /* renamed from: c, reason: collision with root package name */
        public final FloatBuffer f348363c;

        /* renamed from: d, reason: collision with root package name */
        public final int f348364d;

        public a(e.c cVar) {
            float[] fArr = cVar.f348348c;
            this.f348361a = fArr.length / 3;
            this.f348362b = GlUtil.c(fArr);
            this.f348363c = GlUtil.c(cVar.f348349d);
            int i12 = cVar.f348347b;
            if (i12 == 1) {
                this.f348364d = 5;
            } else if (i12 != 2) {
                this.f348364d = 4;
            } else {
                this.f348364d = 6;
            }
        }
    }

    public static boolean a(e eVar) {
        e.c[] cVarArr = eVar.f348341a.f348345a;
        if (cVarArr.length != 1 || cVarArr[0].f348346a != 0) {
            return false;
        }
        e.c[] cVarArr2 = eVar.f348342b.f348345a;
        return cVarArr2.length == 1 && cVarArr2[0].f348346a == 0;
    }
}
