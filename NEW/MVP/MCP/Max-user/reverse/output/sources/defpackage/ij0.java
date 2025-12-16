package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public abstract class ij0 implements Continuation, h84, Serializable {
    public final Continuation a;

    public ij0(Continuation continuation) {
        this.a = continuation;
    }

    @Override // defpackage.h84
    public h84 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof h84) {
            return (h84) continuation;
        }
        return null;
    }

    @Override // defpackage.h84
    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        rg4 rg4Var = (rg4) getClass().getAnnotation(rg4.class);
        String str = null;
        if (rg4Var == null) {
            return null;
        }
        int iV = rg4Var.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? rg4Var.l()[iIntValue] : -1;
        lc3 lc3Var = uei.b;
        lc3 lc3Var2 = uei.a;
        if (lc3Var == null) {
            try {
                lc3 lc3Var3 = new lc3(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(SdkMetricStatEvent.NAME_KEY, null));
                uei.b = lc3Var3;
                lc3Var = lc3Var3;
            } catch (Exception unused2) {
                uei.b = lc3Var2;
                lc3Var = lc3Var2;
            }
        }
        if (lc3Var != lc3Var2) {
            Method method = lc3Var.a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = lc3Var.b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = lc3Var.c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = rg4Var.c();
        } else {
            strC = str + '/' + rg4Var.c();
        }
        return new StackTraceElement(strC, rg4Var.m(), rg4Var.f(), i);
    }

    public Continuation l(Object obj, Continuation continuation) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object n(Object obj);

    public void o() {
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Continuation continuation = this;
        while (true) {
            ij0 ij0Var = (ij0) continuation;
            Continuation continuation2 = ij0Var.a;
            try {
                obj = ij0Var.n(obj);
                if (obj == g84.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new ipd(th);
            }
            ij0Var.o();
            if (!(continuation2 instanceof ij0)) {
                continuation2.resumeWith(obj);
                return;
            }
            continuation = continuation2;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
