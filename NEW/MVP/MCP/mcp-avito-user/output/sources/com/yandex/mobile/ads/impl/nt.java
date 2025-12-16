package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.ads.a;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class nt {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f388365a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final u3 f388366b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final m4 f388367c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final h4 f388368d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final xf f388369e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final wt f388370f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final t7 f388371g = new t7();

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final Handler f388372h = new Handler(Looper.getMainLooper());

    public nt(@j.N xf xfVar, @j.N t6 t6Var, @j.N m4 m4Var, @j.N wt wtVar) {
        this.f388366b = t6Var.a();
        this.f388365a = t6Var.b();
        this.f388368d = t6Var.c();
        this.f388367c = m4Var;
        this.f388369e = xfVar;
        this.f388370f = wtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final int i12, final int i13, final long j12) {
        if (SystemClock.elapsedRealtime() - j12 >= 200) {
            VideoAd videoAdA = this.f388366b.a(new q3(i12, i13));
            if (videoAdA != null) {
                this.f388365a.a(videoAdA, f50.f385173b);
                this.f388367c.onAdPrepared(videoAdA);
                return;
            }
            return;
        }
        com.google.android.exoplayer2.d0 d0VarA = this.f388370f.a();
        if (d0VarA == null || d0VarA.getDuration() == -9223372036854775807L) {
            this.f388372h.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.C1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f383181b.a(i12, i13, j12);
                }
            }, 20L);
            return;
        }
        VideoAd videoAdA2 = this.f388366b.a(new q3(i12, i13));
        if (videoAdA2 != null) {
            this.f388365a.a(videoAdA2, f50.f385173b);
            this.f388367c.onAdPrepared(videoAdA2);
        }
    }

    public final void a(int i12, int i13) {
        a(i12, i13, SystemClock.elapsedRealtime());
    }

    private void a(int i12, int i13, @j.N IOException iOException) {
        com.google.android.exoplayer2.source.ads.a aVarA = this.f388368d.a();
        int i14 = i12 - aVarA.f346186f;
        a.b[] bVarArr = aVarA.f346187g;
        a.b[] bVarArr2 = (a.b[]) com.google.android.exoplayer2.util.U.J(bVarArr.length, bVarArr);
        bVarArr2[i14] = bVarArr2[i14].d(4, i13);
        this.f388368d.a(new com.google.android.exoplayer2.source.ads.a(aVarA.f346182b, bVarArr2, aVarA.f346184d, aVarA.f346185e, aVarA.f346186f));
        VideoAd videoAdA = this.f388366b.a(new q3(i12, i13));
        if (videoAdA != null) {
            this.f388365a.a(videoAdA, f50.f385177f);
            this.f388371g.getClass();
            this.f388367c.onError(videoAdA, t7.c(iOException));
        }
    }

    public final void b(int i12, int i13, @j.N IOException iOException) {
        if (this.f388370f.b() && this.f388369e.b()) {
            try {
                a(i12, i13, iOException);
            } catch (RuntimeException unused) {
            }
        }
    }
}
