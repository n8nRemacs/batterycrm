package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes8.dex */
public final class hu {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final RectF f386212a;

    /* renamed from: b, reason: collision with root package name */
    private final int f386213b;

    public hu(int i12, @j.P RectF rectF) {
        this.f386213b = i12;
        this.f386212a = rectF;
    }

    public final int a() {
        return this.f386213b;
    }

    @j.P
    public final RectF b() {
        return this.f386212a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hu.class != obj.getClass()) {
            return false;
        }
        hu huVar = (hu) obj;
        if (this.f386213b != huVar.f386213b) {
            return false;
        }
        RectF rectF = this.f386212a;
        return rectF != null ? rectF.equals(huVar.f386212a) : huVar.f386212a == null;
    }

    public final int hashCode() {
        RectF rectF = this.f386212a;
        return ((rectF != null ? rectF.hashCode() : 0) * 31) + this.f386213b;
    }
}
