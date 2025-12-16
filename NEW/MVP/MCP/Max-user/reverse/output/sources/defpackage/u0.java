package defpackage;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u0 implements n54 {
    public final ArrayList a = new ArrayList(2);

    public final synchronized void a(n54 n54Var) {
        this.a.add(n54Var);
    }

    @Override // defpackage.n54
    public final synchronized void b(String str, Object obj, Animatable animatable) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                n54 n54Var = (n54) this.a.get(i);
                if (n54Var != null) {
                    n54Var.b(str, obj, animatable);
                }
            } catch (Exception e) {
                c(e, "InternalListener exception in onFinalImageSet");
            }
        }
    }

    public final synchronized void c(Exception exc, String str) {
        Log.e("FdingControllerListener", str, exc);
    }

    @Override // defpackage.n54
    public final synchronized void d(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                n54 n54Var = (n54) this.a.get(i);
                if (n54Var != null) {
                    n54Var.d(str, th);
                }
            } catch (Exception e) {
                c(e, "InternalListener exception in onFailure");
            }
        }
    }

    @Override // defpackage.n54
    public final synchronized void e(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                n54 n54Var = (n54) this.a.get(i);
                if (n54Var != null) {
                    n54Var.e(str);
                }
            } catch (Exception e) {
                c(e, "InternalListener exception in onRelease");
            }
        }
    }

    @Override // defpackage.n54
    public final synchronized void g(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                n54 n54Var = (n54) this.a.get(i);
                if (n54Var != null) {
                    n54Var.g(str);
                }
            } catch (Exception e) {
                c(e, "InternalListener exception in onSubmit");
            }
        }
    }

    @Override // defpackage.n54
    public final void j(String str, Throwable th) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                n54 n54Var = (n54) arrayList.get(i);
                if (n54Var != null) {
                    n54Var.j(str, th);
                }
            } catch (Exception e) {
                c(e, "InternalListener exception in onIntermediateImageFailed");
            }
        }
    }

    @Override // defpackage.n54
    public final void onIntermediateImageSet(String str, Object obj) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                n54 n54Var = (n54) arrayList.get(i);
                if (n54Var != null) {
                    n54Var.onIntermediateImageSet(str, obj);
                }
            } catch (Exception e) {
                c(e, "InternalListener exception in onIntermediateImageSet");
            }
        }
    }
}
