package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b51;
import com.yandex.mobile.ads.impl.fi;
import com.yandex.mobile.ads.impl.lp;
import com.yandex.mobile.ads.impl.sl1;
import java.util.Comparator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class A implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383164b;

    public /* synthetic */ A(int i12) {
        this.f383164b = i12;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f383164b) {
            case 0:
                return b51.a((b51.a) obj, (b51.a) obj2);
            case 1:
                return b51.b((b51.a) obj, (b51.a) obj2);
            case 2:
                return fi.a.a((fi.a) obj, (fi.a) obj2);
            case 3:
                return lp.h.a((List<lp.h>) obj, (List<lp.h>) obj2);
            case 4:
                return lp.f.a((List) obj, (List) obj2);
            case 5:
                return lp.a.a((List<lp.a>) obj, (List<lp.a>) obj2);
            case 6:
                return lp.h.a((lp.h) obj, (lp.h) obj2);
            case 7:
                return lp.h.b((lp.h) obj, (lp.h) obj2);
            case 8:
                return sl1.a.a((sl1.a) obj, (sl1.a) obj2);
            case 9:
                return vl1.a((rl1) obj, (rl1) obj2);
            case 10:
                return c90.a((lh) obj, (lh) obj2);
            case 11:
                return hf.a((vw) obj, (vw) obj2);
            case 12:
                return lp.a((Integer) obj, (Integer) obj2);
            default:
                return lp.b((Integer) obj, (Integer) obj2);
        }
    }
}
