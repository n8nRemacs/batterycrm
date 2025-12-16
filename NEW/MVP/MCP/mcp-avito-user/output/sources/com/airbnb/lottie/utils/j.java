package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.appcompat.app.r;
import j.InterfaceC42167x;
import java.util.ArrayList;

/* compiled from: MiscUtils.java */
/* loaded from: classes10.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f60122a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f12, float f13, float f14) {
        return Math.max(f13, Math.min(f14, f12));
    }

    public static int c(int i12) {
        return Math.max(0, Math.min(255, i12));
    }

    public static int d(float f12, float f13) {
        int i12 = (int) f12;
        int i13 = (int) f13;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (!((i12 ^ i13) >= 0) && i15 != 0) {
            i14--;
        }
        return i12 - (i13 * i14);
    }

    public static void e(com.airbnb.lottie.model.content.j jVar, Path path) {
        path.reset();
        PointF pointF = jVar.f59759b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f60122a;
        pointF2.set(pointF.x, pointF.y);
        int i12 = 0;
        while (true) {
            ArrayList arrayList = jVar.f59758a;
            if (i12 >= arrayList.size()) {
                break;
            }
            O2.a aVar = (O2.a) arrayList.get(i12);
            PointF pointF3 = aVar.f11929a;
            boolean zEquals = pointF3.equals(pointF2);
            PointF pointF4 = aVar.f11930b;
            PointF pointF5 = aVar.f11931c;
            if (zEquals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i12++;
        }
        if (jVar.f59760c) {
            path.close();
        }
    }

    public static float f(float f12, float f13, @InterfaceC42167x float f14) {
        return r.c(f13, f12, f14, f12);
    }

    public static void g(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2, com.airbnb.lottie.animation.content.k kVar) {
        if (dVar.a(i12, kVar.getName())) {
            String name = kVar.getName();
            O2.d dVar3 = new O2.d(dVar2);
            dVar3.f11942a.add(name);
            O2.d dVar4 = new O2.d(dVar3);
            dVar4.f11943b = kVar;
            arrayList.add(dVar4);
        }
    }
}
