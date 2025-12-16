package androidx.media3.extractor;

import j.P;

/* compiled from: DolbyVisionConfig.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23193l {

    /* renamed from: a, reason: collision with root package name */
    public final String f50617a;

    public C23193l(String str) {
        this.f50617a = str;
    }

    @P
    public static C23193l a(androidx.media3.common.util.z zVar) {
        String str;
        zVar.G(2);
        int iU2 = zVar.u();
        int i12 = iU2 >> 1;
        int iU3 = ((zVar.u() >> 3) & 31) | ((iU2 & 1) << 5);
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
        sb2.append(iU3 >= 10 ? "." : ".0");
        sb2.append(iU3);
        return new C23193l(sb2.toString());
    }
}
