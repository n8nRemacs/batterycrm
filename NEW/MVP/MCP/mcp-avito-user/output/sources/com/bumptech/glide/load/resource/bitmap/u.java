package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.util.Log;
import j.k0;
import java.io.File;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: f, reason: collision with root package name */
    public static final File f339397f = new File("/proc/self/fd");

    /* renamed from: g, reason: collision with root package name */
    public static volatile u f339398g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f339399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f339400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f339401c;

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public int f339402d;

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public boolean f339403e = true;

    @k0
    public u() {
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            str.substring(0, 7).getClass();
        }
        this.f339399a = true;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f339400b = 20000;
            this.f339401c = 0;
        } else {
            this.f339400b = 700;
            this.f339401c = 128;
        }
    }

    public static u a() {
        if (f339398g == null) {
            synchronized (u.class) {
                try {
                    if (f339398g == null) {
                        f339398g = new u();
                    }
                } finally {
                }
            }
        }
        return f339398g;
    }

    public final boolean b(int i12, int i13, boolean z12, boolean z13) {
        int i14;
        boolean z14;
        if (!z12 || !this.f339399a || z13 || i12 < (i14 = this.f339401c) || i13 < i14) {
            return false;
        }
        synchronized (this) {
            try {
                int i15 = this.f339402d + 1;
                this.f339402d = i15;
                if (i15 >= 50) {
                    this.f339402d = 0;
                    boolean z15 = f339397f.list().length < this.f339400b;
                    this.f339403e = z15;
                    if (!z15) {
                        Log.isLoggable("Downsampler", 5);
                    }
                }
                z14 = this.f339403e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z14;
    }
}
