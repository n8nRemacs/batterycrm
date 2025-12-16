package com.yandex.mobile.ads.nativeads;

import android.graphics.Bitmap;
import j.P;

/* loaded from: classes8.dex */
public final class NativeAdImage {

    /* renamed from: a, reason: collision with root package name */
    @P
    private Bitmap f392548a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private String f392549b;

    /* renamed from: c, reason: collision with root package name */
    private int f392550c;

    /* renamed from: d, reason: collision with root package name */
    private int f392551d;

    public final void a(@P Bitmap bitmap) {
        this.f392548a = bitmap;
    }

    public final void b(int i12) {
        this.f392551d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeAdImage.class != obj.getClass()) {
            return false;
        }
        NativeAdImage nativeAdImage = (NativeAdImage) obj;
        if (this.f392550c != nativeAdImage.f392550c || this.f392551d != nativeAdImage.f392551d) {
            return false;
        }
        Bitmap bitmap = this.f392548a;
        if (bitmap == null ? nativeAdImage.f392548a != null : !bitmap.equals(nativeAdImage.f392548a)) {
            return false;
        }
        String str = this.f392549b;
        String str2 = nativeAdImage.f392549b;
        return str == null ? str2 == null : str.equals(str2);
    }

    @P
    public Bitmap getBitmap() {
        return this.f392548a;
    }

    public int getHeight() {
        return this.f392550c;
    }

    public int getWidth() {
        return this.f392551d;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f392548a;
        int iHashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        String str = this.f392549b;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f392550c) * 31) + this.f392551d;
    }

    public final void a(int i12) {
        this.f392550c = i12;
    }

    public final void a(@P String str) {
        this.f392549b = str;
    }

    @P
    public final String a() {
        return this.f392549b;
    }
}
