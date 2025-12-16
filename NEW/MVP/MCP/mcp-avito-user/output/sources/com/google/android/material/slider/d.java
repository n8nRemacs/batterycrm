package com.google.android.material.slider;

import j.N;
import java.util.Locale;

/* compiled from: BasicLabelFormatter.java */
/* loaded from: classes6.dex */
public final class d implements e {
    @Override // com.google.android.material.slider.e
    @N
    public final String a(float f12) {
        return f12 >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f12 / 1.0E12f)) : f12 >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f12 / 1.0E9f)) : f12 >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f12 / 1000000.0f)) : f12 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f12 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f12));
    }
}
