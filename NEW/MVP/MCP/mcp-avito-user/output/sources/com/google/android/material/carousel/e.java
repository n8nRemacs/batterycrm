package com.google.android.material.carousel;

import androidx.appcompat.app.r;
import com.google.android.material.carousel.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lY0.C43707b;

/* compiled from: KeylineStateList.java */
/* loaded from: classes6.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f356166a;

    /* renamed from: b, reason: collision with root package name */
    public final List<d> f356167b;

    /* renamed from: c, reason: collision with root package name */
    public final List<d> f356168c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f356169d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f356170e;

    /* renamed from: f, reason: collision with root package name */
    public final float f356171f;

    /* renamed from: g, reason: collision with root package name */
    public final float f356172g;

    public e(d dVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f356166a = dVar;
        this.f356167b = Collections.unmodifiableList(arrayList);
        this.f356168c = Collections.unmodifiableList(arrayList2);
        float f12 = ((d) r.j(1, arrayList)).b().f356162a - dVar.b().f356162a;
        this.f356171f = f12;
        float f13 = dVar.d().f356162a - ((d) r.j(1, arrayList2)).d().f356162a;
        this.f356172g = f13;
        this.f356169d = a(f12, arrayList, true);
        this.f356170e = a(f13, arrayList2, false);
    }

    public static float[] a(float f12, ArrayList arrayList, boolean z12) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i12 = 1;
        while (i12 < size) {
            int i13 = i12 - 1;
            d dVar = (d) arrayList.get(i13);
            d dVar2 = (d) arrayList.get(i12);
            fArr[i12] = i12 == size + (-1) ? 1.0f : fArr[i13] + ((z12 ? dVar2.b().f356162a - dVar.b().f356162a : dVar.d().f356162a - dVar2.d().f356162a) / f12);
            i12++;
        }
        return fArr;
    }

    public static d b(List<d> list, float f12, float[] fArr) {
        int size = list.size();
        float f13 = fArr[0];
        int i12 = 1;
        while (i12 < size) {
            float f14 = fArr[i12];
            if (f12 <= f14) {
                float fB2 = C43707b.b(0.0f, 1.0f, f13, f14, f12);
                d dVar = list.get(i12 - 1);
                d dVar2 = list.get(i12);
                if (dVar.f356151a != dVar2.f356151a) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
                }
                List<d.c> list2 = dVar.f356152b;
                int size2 = list2.size();
                List<d.c> list3 = dVar2.f356152b;
                if (size2 != list3.size()) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < list2.size(); i13++) {
                    d.c cVar = list2.get(i13);
                    d.c cVar2 = list3.get(i13);
                    arrayList.add(new d.c(C43707b.a(cVar.f356162a, cVar2.f356162a, fB2), C43707b.a(cVar.f356163b, cVar2.f356163b, fB2), C43707b.a(cVar.f356164c, cVar2.f356164c, fB2), C43707b.a(cVar.f356165d, cVar2.f356165d, fB2)));
                }
                return new d(dVar.f356151a, arrayList, C43707b.c(fB2, dVar.f356153c, dVar2.f356153c), C43707b.c(fB2, dVar.f356154d, dVar2.f356154d));
            }
            i12++;
            f13 = f14;
        }
        return list.get(0);
    }

    public static d c(d dVar, int i12, int i13, float f12, int i14, int i15) {
        ArrayList arrayList = new ArrayList(dVar.f356152b);
        arrayList.add(i13, (d.c) arrayList.remove(i12));
        d.b bVar = new d.b(dVar.f356151a);
        int i16 = 0;
        while (i16 < arrayList.size()) {
            d.c cVar = (d.c) arrayList.get(i16);
            float f13 = cVar.f356165d;
            bVar.a((f13 / 2.0f) + f12, cVar.f356164c, i16 >= i14 && i16 <= i15, f13);
            f12 += cVar.f356165d;
            i16++;
        }
        return bVar.b();
    }
}
