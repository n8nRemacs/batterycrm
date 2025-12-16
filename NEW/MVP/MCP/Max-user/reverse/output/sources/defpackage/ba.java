package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ba implements t74 {
    public final t74 a;
    public final float b;

    public ba(float f, t74 t74Var) {
        while (t74Var instanceof ba) {
            t74Var = ((ba) t74Var).a;
            f += ((ba) t74Var).b;
        }
        this.a = t74Var;
        this.b = f;
    }

    @Override // defpackage.t74
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return this.a.equals(baVar.a) && this.b == baVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
