package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vk3 extends vqa {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vk3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        Object obj;
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ((hk3) this.b).f(new jsa(vtaVar));
                return;
            case 1:
                ((or8) this.b).e(new is8(vtaVar, i));
                return;
            case 2:
                ira iraVar = new ira(vtaVar);
                vtaVar.c(iraVar);
                try {
                    ((usa) this.b).e(iraVar);
                    return;
                } catch (Throwable th) {
                    raj.c(th);
                    iraVar.onError(th);
                    return;
                }
            case 3:
                try {
                    Object obj2 = ((drf) this.b).get();
                    Objects.requireNonNull(obj2, "The supplier returned a null ObservableSource");
                    ((lta) obj2).a(vtaVar);
                    return;
                } catch (Throwable th2) {
                    raj.c(th2);
                    cd5.c(th2, vtaVar);
                    return;
                }
            case 4:
                try {
                    obj = ((kn6) this.b).a;
                } catch (Throwable th3) {
                    th = th3;
                    raj.c(th);
                }
                if (obj == null) {
                    throw bj5.a("Supplier returned a null Throwable.");
                }
                aj5 aj5Var = bj5.a;
                th = (Throwable) obj;
                cd5.c(th, vtaVar);
                return;
            case 5:
                Object[] objArr = (Object[]) this.b;
                hsa hsaVar = new hsa(vtaVar, objArr);
                vtaVar.c(hsaVar);
                if (hsaVar.d) {
                    return;
                }
                int length = objArr.length;
                while (i < length && !hsaVar.o) {
                    Object obj3 = objArr[i];
                    if (obj3 == null) {
                        hsaVar.a.onError(new NullPointerException(wy1.e(i, "The element at index ", " is null")));
                        return;
                    } else {
                        hsaVar.a.f(obj3);
                        i++;
                    }
                }
                if (hsaVar.o) {
                    return;
                }
                hsaVar.a.b();
                return;
            case 6:
                try {
                    Iterator it = ((Iterable) this.b).iterator();
                    try {
                        if (!it.hasNext()) {
                            cd5.a(vtaVar);
                            return;
                        }
                        ksa ksaVar = new ksa(vtaVar, it);
                        vtaVar.c(ksaVar);
                        if (ksaVar.d) {
                            return;
                        }
                        while (!ksaVar.c) {
                            try {
                                Object next = ksaVar.b.next();
                                Objects.requireNonNull(next, "The iterator returned a null value");
                                ksaVar.a.f(next);
                                if (ksaVar.c) {
                                    return;
                                }
                                try {
                                    if (!ksaVar.b.hasNext()) {
                                        if (ksaVar.c) {
                                            return;
                                        }
                                        ksaVar.a.b();
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    raj.c(th4);
                                    ksaVar.a.onError(th4);
                                    return;
                                }
                            } catch (Throwable th5) {
                                raj.c(th5);
                                ksaVar.a.onError(th5);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th6) {
                        raj.c(th6);
                        cd5.c(th6, vtaVar);
                        return;
                    }
                } catch (Throwable th7) {
                    raj.c(th7);
                    cd5.c(th7, vtaVar);
                    return;
                }
            case 7:
                ((p66) this.b).e(new lsa(vtaVar));
                return;
            case 8:
                ((e2f) this.b).k(new is8(vtaVar, i2));
                return;
            default:
                View view = (View) this.b;
                if (fni.a(Looper.myLooper(), Looper.getMainLooper())) {
                    peh pehVar = new peh(view, vtaVar);
                    vtaVar.c(pehVar);
                    view.setOnClickListener(pehVar);
                    return;
                } else {
                    vtaVar.c(new z6(1, pdf.c));
                    vtaVar.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
                    return;
                }
        }
    }
}
