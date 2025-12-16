package com.iab.omid.library.corpmailru.a;

/* loaded from: classes7.dex */
public class a {
    public float a(int i12, int i13) {
        if (i13 <= 0 || i12 <= 0) {
            return 0.0f;
        }
        float f12 = i12 / i13;
        if (f12 > 1.0f) {
            return 1.0f;
        }
        return f12;
    }
}
