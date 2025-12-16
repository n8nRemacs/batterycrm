package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import com.google.android.exoplayer2.util.U;
import j.InterfaceC42156l;
import java.util.Locale;

/* compiled from: HtmlUtils.java */
/* loaded from: classes6.dex */
final class l {
    public static String a(@InterfaceC42156l int i12) {
        Object[] objArr = {Integer.valueOf(Color.red(i12)), Integer.valueOf(Color.green(i12)), Integer.valueOf(Color.blue(i12)), Double.valueOf(Color.alpha(i12) / 255.0d)};
        int i13 = U.f348106a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
