package com.avito.android.util;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import kotlin.Metadata;

/* compiled from: DeviceMetrics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/M0;", "Lcom/avito/android/util/L0;", "_common_config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"SupportAnnotationUsage"})
/* loaded from: classes5.dex */
public final class M0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C f318655a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Display f318656b;

    /* renamed from: c, reason: collision with root package name */
    public final float f318657c;

    /* renamed from: d, reason: collision with root package name */
    public final float f318658d;

    /* renamed from: e, reason: collision with root package name */
    public final int f318659e;

    public M0(@Y61.k C c12, @Y61.k Display display, @Y61.k DisplayMetrics displayMetrics) {
        this.f318655a = c12;
        this.f318656b = display;
        this.f318657c = displayMetrics.density;
        this.f318658d = displayMetrics.scaledDensity;
        this.f318659e = displayMetrics.densityDpi;
    }

    @Override // com.avito.android.util.L0
    public final int a() {
        this.f318656b.getRealSize(new Point());
        return (int) (r0.x / this.f318657c);
    }

    @Override // com.avito.android.util.L0
    public final int b() {
        return (int) (d() / this.f318657c);
    }

    @Override // com.avito.android.util.L0
    public final int c() {
        Point point = new Point();
        this.f318656b.getSize(point);
        return point.x;
    }

    @Override // com.avito.android.util.L0
    public final int d() {
        Point point = new Point();
        this.f318656b.getSize(point);
        return point.y;
    }

    @Override // com.avito.android.util.L0
    /* renamed from: e, reason: from getter */
    public final int getF318659e() {
        return this.f318659e;
    }

    @Override // com.avito.android.util.L0
    public final int f() {
        return (int) (c() / this.f318657c);
    }

    @Override // com.avito.android.util.L0
    /* renamed from: g, reason: from getter */
    public final float getF318658d() {
        return this.f318658d;
    }

    @Override // com.avito.android.util.L0
    public final int h() {
        this.f318656b.getRealSize(new Point());
        return (int) (r0.y / this.f318657c);
    }

    @Override // com.avito.android.util.L0
    /* renamed from: i, reason: from getter */
    public final float getF318657c() {
        return this.f318657c;
    }

    @Override // com.avito.android.util.L0
    @Y61.k
    /* renamed from: j, reason: from getter */
    public final C getF318655a() {
        return this.f318655a;
    }
}
