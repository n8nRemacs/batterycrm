package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37206h extends AbstractC37204f {

    /* renamed from: a, reason: collision with root package name */
    public final int f358718a;

    /* renamed from: b, reason: collision with root package name */
    public final int f358719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f358720c;

    /* renamed from: d, reason: collision with root package name */
    public final long f358721d;

    /* renamed from: e, reason: collision with root package name */
    public final long f358722e;

    /* renamed from: f, reason: collision with root package name */
    public final List f358723f;

    /* renamed from: g, reason: collision with root package name */
    public final List f358724g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f358725h;

    /* renamed from: i, reason: collision with root package name */
    public final List f358726i;

    public C37206h(int i12, int i13, int i14, long j12, long j13, @j.P List list, @j.P List list2, @j.P PendingIntent pendingIntent, @j.P List list3) {
        this.f358718a = i12;
        this.f358719b = i13;
        this.f358720c = i14;
        this.f358721d = j12;
        this.f358722e = j13;
        this.f358723f = list;
        this.f358724g = list2;
        this.f358725h = pendingIntent;
        this.f358726i = list3;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    public final long a() {
        return this.f358721d;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    @PY0.a
    public final int c() {
        return this.f358720c;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC37204f) {
            AbstractC37204f abstractC37204f = (AbstractC37204f) obj;
            if (this.f358718a == abstractC37204f.h() && this.f358719b == abstractC37204f.i() && this.f358720c == abstractC37204f.c() && this.f358721d == abstractC37204f.a() && this.f358722e == abstractC37204f.j() && ((list = this.f358723f) != null ? list.equals(abstractC37204f.l()) : abstractC37204f.l() == null) && ((list2 = this.f358724g) != null ? list2.equals(abstractC37204f.k()) : abstractC37204f.k() == null) && ((pendingIntent = this.f358725h) != null ? pendingIntent.equals(abstractC37204f.g()) : abstractC37204f.g() == null) && ((list3 = this.f358726i) != null ? list3.equals(abstractC37204f.m()) : abstractC37204f.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    @j.P
    @Deprecated
    public final PendingIntent g() {
        return this.f358725h;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    public final int h() {
        return this.f358718a;
    }

    public final int hashCode() {
        int i12 = (((((this.f358718a ^ 1000003) * 1000003) ^ this.f358719b) * 1000003) ^ this.f358720c) * 1000003;
        long j12 = this.f358721d;
        int i13 = (i12 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f358722e;
        int i14 = (i13 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        List list = this.f358723f;
        int iHashCode = (i14 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f358724g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f358725h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f358726i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    @PY0.b
    public final int i() {
        return this.f358719b;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    public final long j() {
        return this.f358722e;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    @j.P
    public final List k() {
        return this.f358724g;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    @j.P
    public final List l() {
        return this.f358723f;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC37204f
    @j.P
    public final List m() {
        return this.f358726i;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f358723f);
        String strValueOf2 = String.valueOf(this.f358724g);
        String strValueOf3 = String.valueOf(this.f358725h);
        String strValueOf4 = String.valueOf(this.f358726i);
        StringBuilder sb2 = new StringBuilder("SplitInstallSessionState{sessionId=");
        sb2.append(this.f358718a);
        sb2.append(", status=");
        sb2.append(this.f358719b);
        sb2.append(", errorCode=");
        sb2.append(this.f358720c);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f358721d);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.f358722e);
        sb2.append(", moduleNamesNullable=");
        sb2.append(strValueOf);
        androidx.media3.exoplayer.analytics.m.p(sb2, ", languagesNullable=", strValueOf2, ", resolutionIntent=", strValueOf3);
        return androidx.camera.camera2.internal.G.g(sb2, ", splitFileIntents=", strValueOf4, "}");
    }
}
