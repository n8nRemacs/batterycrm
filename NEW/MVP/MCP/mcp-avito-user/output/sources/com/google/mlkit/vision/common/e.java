package com.google.mlkit.vision.common;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class e extends b {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            int iFloatToIntBits = Float.floatToIntBits(0.0f);
            ((b) obj).getClass();
            if (iFloatToIntBits == Float.floatToIntBits(0.0f) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) ^ ((((Float.floatToIntBits(0.0f) ^ 1000003) * 1000003) ^ Float.floatToIntBits(0.0f)) * 1000003);
    }

    public final String toString() {
        return "PointF3D{x=0.0, y=0.0, z=0.0}";
    }
}
