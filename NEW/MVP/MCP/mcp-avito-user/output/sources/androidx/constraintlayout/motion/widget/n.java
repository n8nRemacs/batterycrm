package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.utils.d;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.d;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
class n implements Comparable<n> {

    /* renamed from: d, reason: collision with root package name */
    public int f43981d;

    /* renamed from: b, reason: collision with root package name */
    public float f43979b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f43980c = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f43982e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f43983f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f43984g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f43985h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f43986i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f43987j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f43988k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f43989l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f43990m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f43991n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public float f43992o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f43993p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f43994q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashMap<String, ConstraintAttribute> f43995r = new LinkedHashMap<>();

    public static boolean c(float f12, float f13) {
        return (Float.isNaN(f12) || Float.isNaN(f13)) ? Float.isNaN(f12) != Float.isNaN(f13) : Math.abs(f12 - f13) > 1.0E-6f;
    }

    public final void a(int i12, HashMap map) {
        androidx.constraintlayout.motion.utils.d dVar;
        for (String str : map.keySet()) {
            dVar = (androidx.constraintlayout.motion.utils.d) map.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    dVar.b(Float.isNaN(this.f43984g) ? 0.0f : this.f43984g, i12);
                    break;
                case "rotationY":
                    dVar.b(Float.isNaN(this.f43985h) ? 0.0f : this.f43985h, i12);
                    break;
                case "translationX":
                    dVar.b(Float.isNaN(this.f43990m) ? 0.0f : this.f43990m, i12);
                    break;
                case "translationY":
                    dVar.b(Float.isNaN(this.f43991n) ? 0.0f : this.f43991n, i12);
                    break;
                case "translationZ":
                    dVar.b(Float.isNaN(this.f43992o) ? 0.0f : this.f43992o, i12);
                    break;
                case "progress":
                    dVar.b(Float.isNaN(this.f43994q) ? 0.0f : this.f43994q, i12);
                    break;
                case "scaleX":
                    dVar.b(Float.isNaN(this.f43986i) ? 1.0f : this.f43986i, i12);
                    break;
                case "scaleY":
                    dVar.b(Float.isNaN(this.f43987j) ? 1.0f : this.f43987j, i12);
                    break;
                case "transformPivotX":
                    dVar.b(Float.isNaN(this.f43988k) ? 0.0f : this.f43988k, i12);
                    break;
                case "transformPivotY":
                    dVar.b(Float.isNaN(this.f43989l) ? 0.0f : this.f43989l, i12);
                    break;
                case "rotation":
                    dVar.b(Float.isNaN(this.f43983f) ? 0.0f : this.f43983f, i12);
                    break;
                case "elevation":
                    dVar.b(Float.isNaN(this.f43982e) ? 0.0f : this.f43982e, i12);
                    break;
                case "transitionPathRotate":
                    dVar.b(Float.isNaN(this.f43993p) ? 0.0f : this.f43993p, i12);
                    break;
                case "alpha":
                    dVar.b(Float.isNaN(this.f43979b) ? 1.0f : this.f43979b, i12);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, ConstraintAttribute> linkedHashMap = this.f43995r;
                        if (linkedHashMap.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = linkedHashMap.get(str2);
                            if (dVar instanceof d.b) {
                                ((d.b) dVar).f43701f.append(i12, constraintAttribute);
                                break;
                            } else {
                                constraintAttribute.a();
                                Objects.toString(dVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
            }
        }
    }

    public final void b(View view) {
        this.f43981d = view.getVisibility();
        this.f43979b = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f43982e = view.getElevation();
        this.f43983f = view.getRotation();
        this.f43984g = view.getRotationX();
        this.f43985h = view.getRotationY();
        this.f43986i = view.getScaleX();
        this.f43987j = view.getScaleY();
        this.f43988k = view.getPivotX();
        this.f43989l = view.getPivotY();
        this.f43990m = view.getTranslationX();
        this.f43991n = view.getTranslationY();
        this.f43992o = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(n nVar) {
        nVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, androidx.constraintlayout.widget.d dVar, int i12, int i13) {
        rect.width();
        rect.height();
        d.a aVarP = dVar.p(i13);
        d.C1714d c1714d = aVarP.f44267c;
        int i14 = c1714d.f44370c;
        this.f43980c = i14;
        int i15 = c1714d.f44369b;
        this.f43981d = i15;
        this.f43979b = (i15 == 0 || i14 != 0) ? c1714d.f44371d : 0.0f;
        d.e eVar = aVarP.f44270f;
        boolean z12 = eVar.f44386m;
        this.f43982e = eVar.f44387n;
        this.f43983f = eVar.f44375b;
        this.f43984g = eVar.f44376c;
        this.f43985h = eVar.f44377d;
        this.f43986i = eVar.f44378e;
        this.f43987j = eVar.f44379f;
        this.f43988k = eVar.f44380g;
        this.f43989l = eVar.f44381h;
        this.f43990m = eVar.f44383j;
        this.f43991n = eVar.f44384k;
        this.f43992o = eVar.f44385l;
        d.c cVar = aVarP.f44268d;
        androidx.constraintlayout.core.motion.utils.d.c(cVar.f44358d);
        this.f43993p = cVar.f44362h;
        this.f43994q = aVarP.f44267c.f44372e;
        for (String str : aVarP.f44271g.keySet()) {
            ConstraintAttribute constraintAttribute = aVarP.f44271g.get(str);
            int iOrdinal = constraintAttribute.f44137c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f43995r.put(str, constraintAttribute);
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        return;
                    }
                }
            }
            float f12 = this.f43983f + 90.0f;
            this.f43983f = f12;
            if (f12 > 180.0f) {
                this.f43983f = f12 - 360.0f;
                return;
            }
            return;
        }
        this.f43983f -= 90.0f;
    }
}
