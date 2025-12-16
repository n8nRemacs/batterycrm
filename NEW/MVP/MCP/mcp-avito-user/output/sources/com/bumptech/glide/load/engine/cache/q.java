package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f338972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f338973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f338974c;

    /* compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f338975a;

        /* renamed from: b, reason: collision with root package name */
        public final ActivityManager f338976b;

        /* renamed from: c, reason: collision with root package name */
        public final b f338977c;

        /* renamed from: d, reason: collision with root package name */
        public final float f338978d;

        public a(Context context) {
            this.f338978d = 1;
            this.f338975a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f338976b = activityManager;
            this.f338977c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.f338978d = 0.0f;
            }
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f338979a;

        public b(DisplayMetrics displayMetrics) {
            this.f338979a = displayMetrics;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    public interface c {
    }

    public q(a aVar) {
        Context context = aVar.f338975a;
        ActivityManager activityManager = aVar.f338976b;
        int i12 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f338974c = i12;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f338977c.f338979a;
        float f12 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f13 = aVar.f338978d;
        int iRound2 = Math.round(f12 * f13);
        int iRound3 = Math.round(f12 * 2.0f);
        int i13 = iRound - i12;
        if (iRound3 + iRound2 <= i13) {
            this.f338973b = iRound3;
            this.f338972a = iRound2;
        } else {
            float f14 = i13 / (f13 + 2.0f);
            this.f338973b = Math.round(2.0f * f14);
            this.f338972a = Math.round(f14 * f13);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.f338973b);
            Formatter.formatFileSize(context, this.f338972a);
            Formatter.formatFileSize(context, i12);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
