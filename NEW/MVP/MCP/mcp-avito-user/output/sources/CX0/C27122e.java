package cX0;

import com.facebook.common.internal.j;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collections;

/* compiled from: JpegTranscoderUtils.java */
@Nullsafe
/* renamed from: cX0.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C27122e {

    /* renamed from: a, reason: collision with root package name */
    public static final j<Integer> f57919a;

    static {
        j<Integer> jVar = new j<>(4);
        Collections.addAll(jVar, 2, 7, 4, 5);
        f57919a = jVar;
    }

    public static int a(UW0.e eVar, YW0.d dVar) throws Throwable {
        dVar.m();
        int i12 = dVar.f19501e;
        j<Integer> jVar = f57919a;
        int iIndexOf = jVar.indexOf(Integer.valueOf(i12));
        if (iIndexOf >= 0) {
            return jVar.get(iIndexOf % jVar.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int b(UW0.e eVar, YW0.d dVar) throws Throwable {
        eVar.getClass();
        dVar.m();
        int i12 = dVar.f19500d;
        if (i12 != 90 && i12 != 180 && i12 != 270) {
            return 0;
        }
        dVar.m();
        return dVar.f19500d;
    }

    public static int c(UW0.e eVar, @I41.h UW0.d dVar, YW0.d dVar2, boolean z12) throws Throwable {
        int i12;
        int i13;
        if (!z12 || dVar == null) {
            return 8;
        }
        int iB2 = b(eVar, dVar2);
        j<Integer> jVar = f57919a;
        dVar2.m();
        int iA2 = jVar.contains(Integer.valueOf(dVar2.f19501e)) ? a(eVar, dVar2) : 0;
        boolean z13 = iB2 == 90 || iB2 == 270 || iA2 == 5 || iA2 == 7;
        if (z13) {
            dVar2.m();
            i12 = dVar2.f19503g;
        } else {
            dVar2.m();
            i12 = dVar2.f19502f;
        }
        if (z13) {
            dVar2.m();
            i13 = dVar2.f19502f;
        } else {
            dVar2.m();
            i13 = dVar2.f19503g;
        }
        float f12 = i12;
        float f13 = i13;
        float fMax = Math.max(dVar.f16412a / f12, dVar.f16413b / f13);
        float f14 = f12 * fMax;
        float f15 = dVar.f16414c;
        if (f14 > f15) {
            fMax = f15 / f12;
        }
        if (f13 * fMax > f15) {
            fMax = f15 / f13;
        }
        int i14 = (int) ((fMax * 8.0f) + dVar.f16415d);
        if (i14 > 8) {
            return 8;
        }
        if (i14 < 1) {
            return 1;
        }
        return i14;
    }
}
