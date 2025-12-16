package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;

/* loaded from: classes.dex */
public abstract class wqi {
    public static volatile l6b a;

    public static final boolean a() {
        l6b l6bVar = a;
        if (l6bVar != null) {
            return ((Boolean) l6bVar.d.getValue()).booleanValue();
        }
        return false;
    }

    public static final void b(String str, String str2, Throwable th) {
        l6b l6bVar = a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (str2 == null) {
                str2 = "";
            }
            l6b.f(l6bVar, lg8Var, str, str2, null, th, 8);
        }
    }

    public static final void c(String str, String str2, Object... objArr) {
        lg8 lg8Var = lg8.d;
        l6b l6bVar = a;
        if (l6bVar == null) {
            return;
        }
        if (objArr.length == 0) {
            l6bVar.c(lg8Var, str, str2, null);
        } else {
            l6b.f(l6bVar, lg8Var, str, str2, objArr, null, 16);
        }
    }

    public static final void e(String str, String str2, Throwable th) {
        l6b l6bVar = a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.Y;
            if (str2 == null) {
                str2 = "";
            }
            l6b.f(l6bVar, lg8Var, str, str2, null, th, 8);
        }
    }

    public static final void f(String str, String str2, Object... objArr) {
        l6b l6bVar = a;
        if (l6bVar != null) {
            l6b.f(l6bVar, lg8.Y, str, str2, objArr, null, 16);
        }
    }

    public static final void g(String str, Throwable th, String str2, Object... objArr) {
        l6b l6bVar = a;
        if (l6bVar != null) {
            l6bVar.e(lg8.Y, str, str2, objArr, th);
        }
    }

    public static final void h(String str, String str2, CancellationException cancellationException) {
        l6b l6bVar = a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.o;
            if (str2 == null) {
                str2 = "";
            }
            l6b.f(l6bVar, lg8Var, str, str2, null, cancellationException, 8);
        }
    }

    public static final void i(String str, String str2, Object... objArr) {
        lg8 lg8Var = lg8.o;
        l6b l6bVar = a;
        if (l6bVar == null) {
            return;
        }
        if (objArr.length == 0) {
            l6bVar.c(lg8Var, str, str2, null);
        } else {
            l6b.f(l6bVar, lg8Var, str, str2, objArr, null, 16);
        }
    }

    public static final boolean j(ApiInvocationException apiInvocationException) {
        String str;
        int i = apiInvocationException.a;
        return i == 102 || i == 103 || (i == 100 && (((str = apiInvocationException.b) != null && vmf.s(str, "session_key", false)) || fni.a(apiInvocationException.c, "session_key")));
    }

    public static final void k(lg8 lg8Var, String str, String str2, Object... objArr) {
        int iOrdinal = lg8Var.ordinal();
        if (iOrdinal == 0) {
            m(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal == 1) {
            c(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal == 2) {
            i(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal == 3) {
            q(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal == 4) {
            f(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l6b l6bVar = a;
        if (l6bVar != null) {
            l6b.f(l6bVar, lg8.Z, str, str2, objArrCopyOf, null, 16);
        }
    }

    public static final void l(View view, kyd kydVar) {
        view.setTag(rxc.view_tree_saved_state_registry_owner, kydVar);
    }

    public static final void m(String str, String str2, Object... objArr) {
        lg8 lg8Var = lg8.c;
        l6b l6bVar = a;
        if (l6bVar == null) {
            return;
        }
        if (objArr.length == 0) {
            l6bVar.c(lg8Var, str, str2, null);
        } else {
            l6b.f(l6bVar, lg8Var, str, str2, objArr, null, 16);
        }
    }

    public static final void o(String str, Exception exc, String str2, Object... objArr) {
        lg8 lg8Var = lg8.X;
        l6b l6bVar = a;
        if (l6bVar == null) {
            return;
        }
        if (objArr.length == 0) {
            l6b.f(l6bVar, lg8Var, str, str2, null, exc, 8);
        } else {
            l6bVar.e(lg8Var, str, str2, objArr, exc);
        }
    }

    public static final void p(String str, String str2, Throwable th) {
        l6b l6bVar = a;
        if (l6bVar != null) {
            l6b.f(l6bVar, lg8.X, str, str2, null, th, 8);
        }
    }

    public static final void q(String str, String str2, Object... objArr) {
        o(str, null, str2, Arrays.copyOf(objArr, objArr.length));
    }
}
