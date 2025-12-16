package com.google.android.gms.common.internal;

import android.widget.Button;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class G extends Button {
    public static final int a(int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return i13;
        }
        if (i12 == 1) {
            return i14;
        }
        if (i12 == 2) {
            return i15;
        }
        throw new IllegalStateException(AK.c.g(i12, "Unknown color scheme: "));
    }
}
