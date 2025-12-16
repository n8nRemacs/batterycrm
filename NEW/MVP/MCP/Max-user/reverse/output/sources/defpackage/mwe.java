package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class mwe extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nwe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwe(Object obj, nwe nweVar, int i) {
        super(12, obj);
        this.c = i;
        this.d = nweVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, k18] */
    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        int i = this.c;
        nwe nweVar = this.d;
        switch (i) {
            case 0:
                if (fni.a(obj, obj2)) {
                    return;
                }
                ((cw0) nweVar.b.getValue()).a(a93.s0.x(nweVar.a).k(), nweVar.a(), nweVar.b());
                nweVar.invalidateSelf();
                return;
            case 1:
                if (fni.a(obj, obj2)) {
                    return;
                }
                ((Number) obj2).intValue();
                ((Number) obj).intValue();
                nweVar.invalidateSelf();
                return;
            case 2:
                if (fni.a(obj, obj2)) {
                    return;
                }
                float[] fArr = (float[]) obj2;
                nweVar.X.setFloatValues(Arrays.copyOf(fArr, fArr.length));
                return;
            case 3:
                qoc qocVar = nweVar.d;
                ObjectAnimator objectAnimator = nweVar.X;
                if (fni.a(obj, obj2)) {
                    return;
                }
                int iOrdinal = ((lwe) obj2).ordinal();
                if (iOrdinal == 0) {
                    objectAnimator.setValues(PropertyValuesHolder.ofFloat(qocVar, 0.0f, 359.0f));
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objectAnimator.setValues(PropertyValuesHolder.ofFloat(qocVar, 359.0f, 0.0f));
                    return;
                }
            case 4:
                if (fni.a(obj, obj2)) {
                    return;
                }
                long jLongValue = ((Number) obj2).longValue();
                ((Number) obj).longValue();
                nweVar.X.setDuration(jLongValue);
                return;
            case 5:
                if (fni.a(obj, obj2)) {
                    return;
                }
                float[] fArr2 = (float[]) obj2;
                nweVar.o.setFloatValues(Arrays.copyOf(fArr2, fArr2.length));
                return;
            case 6:
                if (fni.a(obj, obj2)) {
                    return;
                }
                long jLongValue2 = ((Number) obj2).longValue();
                ((Number) obj).longValue();
                nweVar.o.setDuration(jLongValue2);
                return;
            case 7:
                if (fni.a(obj, obj2)) {
                    return;
                }
                nweVar.invalidateSelf();
                return;
            default:
                if (fni.a(obj, obj2)) {
                    return;
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                if (zBooleanValue) {
                    nweVar.e();
                } else {
                    ObjectAnimator objectAnimator2 = nweVar.o;
                    if (objectAnimator2.isRunning()) {
                        objectAnimator2.cancel();
                    }
                }
                nweVar.invalidateSelf();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwe(nwe nweVar, int i) {
        super(12, kwe.a);
        this.c = i;
        switch (i) {
            case 3:
                this.d = nweVar;
                super(12, lwe.a);
                break;
            case 4:
                this.d = nweVar;
                super(12, (Object) 8000L);
                break;
            case 5:
            default:
                this.d = nweVar;
                break;
            case 6:
                this.d = nweVar;
                super(12, (Object) 8000L);
                break;
            case 7:
                this.d = nweVar;
                super(12, (Object) null);
                break;
            case 8:
                Boolean bool = Boolean.TRUE;
                this.d = nweVar;
                super(12, bool);
                break;
        }
    }
}
