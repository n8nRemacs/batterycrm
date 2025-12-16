package com.facebook.drawee.generic;

import I41.h;
import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;

@Nullsafe
/* loaded from: classes10.dex */
public class RoundingParams {

    /* renamed from: a, reason: collision with root package name */
    public RoundingMethod f340151a = RoundingMethod.f340159c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f340152b = false;

    /* renamed from: c, reason: collision with root package name */
    @h
    public float[] f340153c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f340154d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f340155e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f340156f = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f340157g = 0.0f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RoundingMethod {

        /* renamed from: b, reason: collision with root package name */
        public static final RoundingMethod f340158b;

        /* renamed from: c, reason: collision with root package name */
        public static final RoundingMethod f340159c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ RoundingMethod[] f340160d;

        static {
            RoundingMethod roundingMethod = new RoundingMethod("OVERLAY_COLOR", 0);
            f340158b = roundingMethod;
            RoundingMethod roundingMethod2 = new RoundingMethod("BITMAP_ONLY", 1);
            f340159c = roundingMethod2;
            f340160d = new RoundingMethod[]{roundingMethod, roundingMethod2};
        }

        public RoundingMethod() {
            throw null;
        }

        public static RoundingMethod valueOf(String str) {
            return (RoundingMethod) Enum.valueOf(RoundingMethod.class, str);
        }

        public static RoundingMethod[] values() {
            return (RoundingMethod[]) f340160d.clone();
        }
    }

    public static RoundingParams a(float[] fArr) {
        RoundingParams roundingParams = new RoundingParams();
        fArr.getClass();
        o.b("radii should have exactly 8 values", fArr.length == 8);
        if (roundingParams.f340153c == null) {
            roundingParams.f340153c = new float[8];
        }
        System.arraycopy(fArr, 0, roundingParams.f340153c, 0, 8);
        return roundingParams;
    }

    public static RoundingParams b(float f12) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.e(f12);
        return roundingParams;
    }

    public final void c(float f12) {
        o.b("the border width cannot be < 0", f12 >= 0.0f);
        this.f340155e = f12;
    }

    public final void d(float f12, float f13, float f14, float f15) {
        if (this.f340153c == null) {
            this.f340153c = new float[8];
        }
        float[] fArr = this.f340153c;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[3] = f13;
        fArr[2] = f13;
        fArr[5] = f14;
        fArr[4] = f14;
        fArr[7] = f15;
        fArr[6] = f15;
    }

    public final void e(float f12) {
        if (this.f340153c == null) {
            this.f340153c = new float[8];
        }
        Arrays.fill(this.f340153c, f12);
    }

    public final boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f340152b == roundingParams.f340152b && this.f340154d == roundingParams.f340154d && Float.compare(roundingParams.f340155e, this.f340155e) == 0 && this.f340156f == roundingParams.f340156f && Float.compare(roundingParams.f340157g, this.f340157g) == 0 && this.f340151a == roundingParams.f340151a) {
            return Arrays.equals(this.f340153c, roundingParams.f340153c);
        }
        return false;
    }

    public final void f(float f12) {
        o.b("the padding cannot be < 0", f12 >= 0.0f);
        this.f340157g = f12;
    }

    public final int hashCode() {
        RoundingMethod roundingMethod = this.f340151a;
        int iHashCode = (((roundingMethod != null ? roundingMethod.hashCode() : 0) * 31) + (this.f340152b ? 1 : 0)) * 31;
        float[] fArr = this.f340153c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f340154d) * 31;
        float f12 = this.f340155e;
        int iFloatToIntBits = (((iHashCode2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31) + this.f340156f) * 31;
        float f13 = this.f340157g;
        return (iFloatToIntBits + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 961;
    }
}
