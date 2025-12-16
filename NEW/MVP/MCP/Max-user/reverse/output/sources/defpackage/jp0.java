package defpackage;

import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* loaded from: classes.dex */
public final class jp0 implements ty0 {
    public final String a;
    public final ynd b;
    public final ysd c;
    public final ie7 d;
    public final ty0 e;
    public final String f;
    public Object g;
    public final int h;

    public jp0(String str, ynd yndVar, ysd ysdVar, ie7 ie7Var, ty0 ty0Var, String str2) {
        this.a = str;
        this.b = yndVar;
        this.c = ysdVar;
        this.d = ie7Var;
        this.e = ty0Var;
        this.f = str2;
        this.h = ((((ie7Var.hashCode() + ((ysdVar.hashCode() + (((str.hashCode() * 31) + (yndVar != null ? yndVar.hashCode() : 0)) * 31)) * 31)) * 31) + (ty0Var != null ? ty0Var.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ty0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ty0
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jp0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jp0 jp0Var = (jp0) obj;
        return fni.a(this.a, jp0Var.a) && fni.a(this.b, jp0Var.b) && fni.a(this.c, jp0Var.c) && fni.a(this.d, jp0Var.d) && fni.a(this.e, jp0Var.e) && fni.a(this.f, jp0Var.f);
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}
