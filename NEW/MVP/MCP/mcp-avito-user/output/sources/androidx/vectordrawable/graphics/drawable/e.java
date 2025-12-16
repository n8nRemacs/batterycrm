package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.p;

/* compiled from: AnimatorInflaterCompat.java */
@RestrictTo
/* loaded from: classes10.dex */
public class e {

    /* compiled from: AnimatorInflaterCompat.java */
    public static class a implements TypeEvaluator<p.b[]> {

        /* renamed from: a, reason: collision with root package name */
        public p.b[] f54886a;

        @Override // android.animation.TypeEvaluator
        public final p.b[] evaluate(float f12, p.b[] bVarArr, p.b[] bVarArr2) {
            p.b[] bVarArr3 = bVarArr;
            p.b[] bVarArr4 = bVarArr2;
            if (!p.a(bVarArr3, bVarArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!p.a(this.f54886a, bVarArr3)) {
                this.f54886a = p.e(bVarArr3);
            }
            for (int i12 = 0; i12 < bVarArr3.length; i12++) {
                p.b bVar = this.f54886a[i12];
                p.b bVar2 = bVarArr3[i12];
                p.b bVar3 = bVarArr4[i12];
                bVar.getClass();
                bVar.f44781a = bVar2.f44781a;
                int i13 = 0;
                while (true) {
                    float[] fArr = bVar2.f44782b;
                    if (i13 < fArr.length) {
                        bVar.f44782b[i13] = (bVar3.f44782b[i13] * f12) + ((1.0f - f12) * fArr[i13]);
                        i13++;
                    }
                }
            }
            return this.f54886a;
        }
    }
}
