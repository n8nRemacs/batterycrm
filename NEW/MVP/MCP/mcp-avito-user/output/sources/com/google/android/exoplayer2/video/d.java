package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.F;
import j.P;

/* compiled from: DolbyVisionConfig.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f348211a;

    public d(String str) {
        this.f348211a = str;
    }

    @P
    public static d a(F f12) {
        String str;
        f12.C(2);
        int iR2 = f12.r();
        int i12 = iR2 >> 1;
        int iR3 = ((f12.r() >> 3) & 31) | ((iR2 & 1) << 5);
        if (i12 == 4 || i12 == 5 || i12 == 7) {
            str = "dvhe";
        } else if (i12 == 8) {
            str = "hev1";
        } else {
            if (i12 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i12);
        sb2.append(iR3 >= 10 ? "." : ".0");
        sb2.append(iR3);
        return new d(sb2.toString());
    }
}
