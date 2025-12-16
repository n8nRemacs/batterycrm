package defpackage;

import android.util.Rational;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class vi5 implements Comparator {
    public static final d73 c = new d73(17);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vi5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iB;
        int iB2;
        switch (this.a) {
            case 0:
                s8a s8aVar = (s8a) this.b;
                int i = Integer.MAX_VALUE;
                int i2 = (obj == null || (iB2 = s8aVar.b(obj)) < 0) ? Integer.MAX_VALUE : s8aVar.c[iB2];
                if (obj2 != null && (iB = s8aVar.b(obj2)) >= 0) {
                    i = s8aVar.c[iB];
                }
                return fni.b(i2, i);
            case 1:
                Map map = (Map) this.b;
                return b5j.b((Long) map.get((zi1) obj), (Long) map.get((zi1) obj2));
            case 2:
                int iCompare = ((s55) this.b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : b5j.b(Integer.valueOf(((xx3) obj2).y0), Integer.valueOf(((xx3) obj).y0));
            case 3:
                int iCompare2 = ((dj3) this.b).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                Thread thread = (Thread) obj;
                Thread thread2 = (Thread) obj2;
                return b5j.b(thread != null ? Long.valueOf(thread.getId()) : comparable, thread2 != null ? Long.valueOf(thread2.getId()) : 0);
            case 4:
                int iCompare3 = ((vi5) this.b).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : b5j.b(Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(System.identityHashCode(obj2)));
            case 5:
                bj7 bj7Var = (bj7) this.b;
                vd8 vd8Var = (vd8) bj7Var.A0.get(((vo6) obj2).a);
                Long lValueOf = vd8Var != null ? Long.valueOf(vd8Var.o) : null;
                vd8 vd8Var2 = (vd8) bj7Var.A0.get(((vo6) obj).a);
                return b5j.b(lValueOf, vd8Var2 != null ? Long.valueOf(vd8Var2.o) : null);
            case 6:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.b;
                int iCompareTo = Boolean.valueOf(materialButton.B0).compareTo(Boolean.valueOf(materialButton2.B0));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 7:
                List list = (List) this.b;
                return b5j.b(Integer.valueOf(list.indexOf(((pw8) obj).a)), Integer.valueOf(list.indexOf(((pw8) obj2).a)));
            case 8:
                int iCompare4 = ((vs6) this.b).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : b5j.b(Integer.valueOf(((xx3) obj2).y0), Integer.valueOf(((xx3) obj).y0));
            default:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.b;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
        }
    }

    public vi5(List list) {
        this.a = 0;
        uog.d(1, c);
        s8a s8aVar = new s8a(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            s8aVar.d(i, it.next());
            i = i2;
        }
        this.b = s8aVar;
    }
}
