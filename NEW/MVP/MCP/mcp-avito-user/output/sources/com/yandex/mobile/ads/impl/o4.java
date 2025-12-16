package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.android.exoplayer2.source.ads.a;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final b3 f388434a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final u3 f388435b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final h4 f388436c;

    public o4(@j.N t6 t6Var, @j.N b3 b3Var) {
        this.f388434a = b3Var;
        this.f388435b = t6Var.a();
        this.f388436c = t6Var.c();
    }

    public final void a(@j.N VideoAd videoAd) {
        if (videoAd.getMediaFile() instanceof e60) {
            e60 e60Var = (e60) videoAd.getMediaFile();
            q3 q3Var = new q3(this.f388434a.a(e60Var.a()), videoAd.getAdPodInfo().getAdPosition() - 1);
            this.f388435b.a(q3Var, videoAd);
            com.google.android.exoplayer2.source.ads.a aVarA = this.f388436c.a();
            if (aVarA.d(q3Var.a(), q3Var.b())) {
                return;
            }
            com.google.android.exoplayer2.source.ads.a aVarE = aVarA.e(q3Var.a(), videoAd.getAdPodInfo().getAdsCount());
            Uri uri = Uri.parse(e60Var.getUrl());
            int iA2 = q3Var.a();
            int iB2 = q3Var.b();
            int i12 = iA2 - aVarE.f346186f;
            a.b[] bVarArr = aVarE.f346187g;
            a.b[] bVarArr2 = (a.b[]) com.google.android.exoplayer2.util.U.J(bVarArr.length, bVarArr);
            a.b bVar = bVarArr2[i12];
            int[] iArr = bVar.f346192e;
            int length = iArr.length;
            int iMax = Math.max(iB2 + 1, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArrA = bVar.f346193f;
            if (jArrA.length != iArrCopyOf.length) {
                jArrA = a.b.a(jArrA, iArrCopyOf.length);
            }
            long[] jArr = jArrA;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(bVar.f346191d, iArrCopyOf.length);
            uriArr[iB2] = uri;
            iArrCopyOf[iB2] = 1;
            bVarArr2[i12] = new a.b(bVar.f346189b, bVar.f346190c, iArrCopyOf, uriArr, jArr, bVar.f346194g, bVar.f346195h);
            this.f388436c.a(new com.google.android.exoplayer2.source.ads.a(aVarE.f346182b, bVarArr2, aVarE.f346184d, aVarE.f346185e, aVarE.f346186f));
        }
    }
}
