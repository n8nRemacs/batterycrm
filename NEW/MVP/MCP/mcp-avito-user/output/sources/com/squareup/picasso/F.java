package com.squareup.picasso;

import java.io.PrintWriter;

/* compiled from: StatsSnapshot.java */
/* loaded from: classes7.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    public final int f366346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f366348c;

    /* renamed from: d, reason: collision with root package name */
    public final long f366349d;

    /* renamed from: e, reason: collision with root package name */
    public final long f366350e;

    /* renamed from: f, reason: collision with root package name */
    public final long f366351f;

    /* renamed from: g, reason: collision with root package name */
    public final long f366352g;

    /* renamed from: h, reason: collision with root package name */
    public final long f366353h;

    /* renamed from: i, reason: collision with root package name */
    public final long f366354i;

    /* renamed from: j, reason: collision with root package name */
    public final long f366355j;

    /* renamed from: k, reason: collision with root package name */
    public final int f366356k;

    /* renamed from: l, reason: collision with root package name */
    public final int f366357l;

    /* renamed from: m, reason: collision with root package name */
    public final int f366358m;

    /* renamed from: n, reason: collision with root package name */
    public final long f366359n;

    public F(int i12, int i13, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i14, int i15, int i16, long j22) {
        this.f366346a = i12;
        this.f366347b = i13;
        this.f366348c = j12;
        this.f366349d = j13;
        this.f366350e = j14;
        this.f366351f = j15;
        this.f366352g = j16;
        this.f366353h = j17;
        this.f366354i = j18;
        this.f366355j = j19;
        this.f366356k = i14;
        this.f366357l = i15;
        this.f366358m = i16;
        this.f366359n = j22;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f366346a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f366347b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((r1 / r0) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f366348c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f366349d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f366356k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f366350e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f366353h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f366357l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f366351f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f366358m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f366352g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f366354i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f366355j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsSnapshot{maxSize=");
        sb2.append(this.f366346a);
        sb2.append(", size=");
        sb2.append(this.f366347b);
        sb2.append(", cacheHits=");
        sb2.append(this.f366348c);
        sb2.append(", cacheMisses=");
        sb2.append(this.f366349d);
        sb2.append(", downloadCount=");
        sb2.append(this.f366356k);
        sb2.append(", totalDownloadSize=");
        sb2.append(this.f366350e);
        sb2.append(", averageDownloadSize=");
        sb2.append(this.f366353h);
        sb2.append(", totalOriginalBitmapSize=");
        sb2.append(this.f366351f);
        sb2.append(", totalTransformedBitmapSize=");
        sb2.append(this.f366352g);
        sb2.append(", averageOriginalBitmapSize=");
        sb2.append(this.f366354i);
        sb2.append(", averageTransformedBitmapSize=");
        sb2.append(this.f366355j);
        sb2.append(", originalBitmapCount=");
        sb2.append(this.f366357l);
        sb2.append(", transformedBitmapCount=");
        sb2.append(this.f366358m);
        sb2.append(", timeStamp=");
        return androidx.appcompat.app.r.u(sb2, this.f366359n, '}');
    }
}
