package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.text.Collator;
import java.util.Comparator;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class dj3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dj3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iB;
        int iB2;
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                s55 s55Var = (s55) obj3;
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return s55Var.compare(obj, obj2);
            case 1:
                for (em6 em6Var : (em6[]) obj3) {
                    int iB3 = b5j.b((Comparable) em6Var.invoke(obj), (Comparable) em6Var.invoke(obj2));
                    if (iB3 != 0) {
                        return iB3;
                    }
                }
                return 0;
            case 2:
                l8a l8aVar = (l8a) obj3;
                ku3 ku3Var = (ku3) obj2;
                int iB4 = l8aVar.b(((ku3) obj).p());
                long j = iB4 >= 0 ? l8aVar.c[iB4] : 0L;
                int iB5 = l8aVar.b(ku3Var.p());
                return pmi.a(j, iB5 >= 0 ? l8aVar.c[iB5] : 0L);
            case 3:
                return v04.a((ku3) obj, (ku3) obj2, (Collator) ((v04) obj3).a.e());
            case 4:
                yy7[] yy7VarArr = DevMenuFeatureTogglesPageScreen.t0;
                return ((Number) ((qk) obj3).invoke(obj, obj2)).intValue();
            case 5:
                return ((Number) ((cj0) obj3).invoke(obj, obj2)).intValue();
            case 6:
                u6e u6eVar = (u6e) obj;
                u6e u6eVar2 = (u6e) obj2;
                long j2 = ((wm8) obj3).b;
                if (u6eVar2 != null) {
                    pb2 pb2Var = u6eVar2.d;
                    pb2 pb2Var2 = u6eVar.d;
                    if (pb2Var2 != null && pb2Var != null) {
                        long jO = pb2Var.o();
                        long jO2 = pb2Var2.o();
                        if (pb2Var.b.e(j2)) {
                            jO = Long.MAX_VALUE;
                        }
                        if (pb2Var2.b.e(j2)) {
                            jO2 = Long.MAX_VALUE;
                        }
                        return Long.compare(jO, jO2);
                    }
                    if (pb2Var2 != null && pb2Var == null) {
                        return -1;
                    }
                }
                return 0;
            case 7:
                ax8 ax8Var = (ax8) obj3;
                iB = ax8Var.b(obj2);
                iB2 = ax8Var.b(obj);
                break;
            case 8:
                bx8 bx8Var = (bx8) obj3;
                iB = bx8Var.b(obj2);
                iB2 = bx8Var.b(obj);
                break;
            case 9:
                return ((Number) ((ir9) obj3).invoke(obj, obj2)).intValue();
            case 10:
                return ((Number) ((hwd) obj3).invoke(obj, obj2)).intValue();
            case 11:
                kb0 kb0Var = (kb0) obj2;
                ((xn3) obj3).getClass();
                Class cls = ((kb0) obj).a.j;
                int i3 = cls == MediaCodec.class ? 2 : cls == r8c.class ? 0 : 1;
                Class cls2 = kb0Var.a.j;
                if (cls2 == MediaCodec.class) {
                    i2 = 2;
                } else if (cls2 == r8c.class) {
                    i2 = 0;
                }
                return i3 - i2;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((Number) ((qk) obj3).invoke(obj, obj2)).intValue();
            default:
                Rect rect = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
        return iB - iB2;
    }
}
