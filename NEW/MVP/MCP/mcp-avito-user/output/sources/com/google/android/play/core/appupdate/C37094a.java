package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import j.P;
import java.util.HashMap;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: com.google.android.play.core.appupdate.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37094a {

    /* renamed from: a, reason: collision with root package name */
    @JY0.e
    public final int f358005a;

    /* renamed from: b, reason: collision with root package name */
    @JY0.d
    public final int f358006b;

    /* renamed from: c, reason: collision with root package name */
    public final long f358007c;

    /* renamed from: d, reason: collision with root package name */
    public final long f358008d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final PendingIntent f358009e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final PendingIntent f358010f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final PendingIntent f358011g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final PendingIntent f358012h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f358013i = false;

    public C37094a(@JY0.e int i12, @JY0.d int i13, long j12, long j13, @P PendingIntent pendingIntent, @P PendingIntent pendingIntent2, @P PendingIntent pendingIntent3, @P PendingIntent pendingIntent4, HashMap map) {
        this.f358005a = i12;
        this.f358006b = i13;
        this.f358007c = j12;
        this.f358008d = j13;
        this.f358009e = pendingIntent;
        this.f358010f = pendingIntent2;
        this.f358011g = pendingIntent3;
        this.f358012h = pendingIntent4;
    }

    @P
    public final PendingIntent a(AbstractC37097d abstractC37097d) {
        int iB2 = abstractC37097d.b();
        long j12 = this.f358008d;
        long j13 = this.f358007c;
        if (iB2 == 0) {
            PendingIntent pendingIntent = this.f358010f;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!abstractC37097d.a() || j13 > j12) {
                return null;
            }
            return this.f358012h;
        }
        if (abstractC37097d.b() == 1) {
            PendingIntent pendingIntent2 = this.f358009e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (abstractC37097d.a() && j13 <= j12) {
                return this.f358011g;
            }
        }
        return null;
    }
}
