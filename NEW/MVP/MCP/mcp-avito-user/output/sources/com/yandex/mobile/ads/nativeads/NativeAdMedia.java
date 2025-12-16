package com.yandex.mobile.ads.nativeads;

/* loaded from: classes8.dex */
public final class NativeAdMedia {

    /* renamed from: a, reason: collision with root package name */
    private final float f392554a;

    public NativeAdMedia(float f12) {
        this.f392554a = f12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NativeAdMedia.class == obj.getClass() && Float.compare(((NativeAdMedia) obj).f392554a, this.f392554a) == 0;
    }

    public float getAspectRatio() {
        return this.f392554a;
    }

    public int hashCode() {
        float f12 = this.f392554a;
        if (f12 != 0.0f) {
            return Float.floatToIntBits(f12);
        }
        return 0;
    }
}
