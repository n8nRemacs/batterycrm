package xa1;

import android.graphics.Point;
import java.util.ArrayList;

/* renamed from: xa1.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49914h {
    public static AbstractC49913g a(ArrayList arrayList) {
        Point point = new Point(((int[]) arrayList.get(0))[0], ((int[]) arrayList.get(0))[1]);
        Point point2 = new Point(((int[]) arrayList.get(1))[0], ((int[]) arrayList.get(1))[1]);
        Point point3 = new Point(((int[]) arrayList.get(3))[0], ((int[]) arrayList.get(3))[1]);
        Point point4 = new Point(((int[]) arrayList.get(4))[0], ((int[]) arrayList.get(4))[1]);
        Math.atan2(point2.y - point.y, point2.x - point.x);
        Math.atan2(point3.y - point4.y, point3.x - point4.x);
        float fHypot = (((float) Math.hypot(point2.x - point.x, point2.y - point.y)) - ((float) Math.hypot(point3.x - point4.x, point3.y - point4.y))) * (-1);
        return (fHypot <= 60.0f || fHypot >= 170.0f) ? fHypot > 170.0f ? C49910d.f442563a : C49911e.f442564a : C49912f.f442565a;
    }
}
