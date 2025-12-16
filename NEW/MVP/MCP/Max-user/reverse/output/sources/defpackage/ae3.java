package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ae3 implements ws8 {
    public final float[] a;
    public final ArrayList b;
    public final boolean c;

    public ae3(float[] fArr, ArrayList arrayList, boolean z) {
        this.a = fArr;
        this.b = arrayList;
        this.c = z;
    }

    @Override // defpackage.ws8
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ae3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ae3 ae3Var = (ae3) obj;
        return this.c == ae3Var.c && Arrays.equals(this.a, ae3Var.a) && this.b.equals(ae3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((Arrays.hashCode(this.a) + (Boolean.hashCode(this.c) * 31)) * 31);
    }
}
