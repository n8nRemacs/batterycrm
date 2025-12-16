package io.noties.markwon.image;

import io.noties.markwon.image.i;
import j.N;

/* compiled from: ImageSizeResolverDef.java */
/* loaded from: classes8.dex */
public class k extends j {
    public static int a(@N i.a aVar, float f12) {
        boolean zEquals = "em".equals(aVar.f401917b);
        float f13 = aVar.f401916a;
        if (zEquals) {
            f13 *= f12;
        }
        return (int) (f13 + 0.5f);
    }
}
