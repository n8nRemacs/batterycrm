package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.apache.http.HttpHost;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class svi {
    public static final cs4 a(f84 f84Var, x74 x74Var, i84 i84Var, sm6 sm6Var) {
        x74 x74VarC = z6j.c(f84Var, x74Var);
        i84Var.getClass();
        cs4 m18Var = i84Var == i84.b ? new m18(x74VarC, sm6Var) : new cs4(x74VarC, true, true);
        m18Var.start(i84Var, m18Var, sm6Var);
        return m18Var;
    }

    public static /* synthetic */ cs4 b(f84 f84Var, z74 z74Var, sm6 sm6Var, int i) {
        x74 x74Var = z74Var;
        if ((i & 1) != 0) {
            x74Var = bd5.a;
        }
        return a(f84Var, x74Var, i84.a, sm6Var);
    }

    public static String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    public static final x9f d(f84 f84Var, x74 x74Var, i84 i84Var, sm6 sm6Var) {
        x74 x74VarC = z6j.c(f84Var, x74Var);
        i84Var.getClass();
        x9f q18Var = i84Var == i84.b ? new q18(x74VarC, sm6Var) : new x9f(x74VarC, true, true);
        q18Var.start(i84Var, q18Var, sm6Var);
        return q18Var;
    }

    public static /* synthetic */ x9f e(f84 f84Var, x74 x74Var, i84 i84Var, sm6 sm6Var, int i) {
        if ((i & 1) != 0) {
            x74Var = bd5.a;
        }
        if ((i & 2) != 0) {
            i84Var = i84.a;
        }
        return d(f84Var, x74Var, i84Var, sm6Var);
    }

    public static void f(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        if (obj == null) {
            return;
        }
        int i = 0;
        if (obj instanceof fl9) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(c(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        f(name, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        f(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i2 = 0; i2 < length2; i2++) {
                            f(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            Method[] methods = cls.getMethods();
            int length3 = methods.length;
            while (i < length3) {
                String name2 = methods[i].getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        if (((Boolean) cls.getMethod("has" + strSubstring, null).invoke(obj, null)).booleanValue()) {
                            f(strSubstring, cls.getMethod("get" + strSubstring, null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                i++;
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        if (obj instanceof Map) {
            String strC = c(str);
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strC);
                stringBuffer2.append(" <\n");
                int length4 = stringBuffer.length();
                stringBuffer.append("  ");
                f("key", entry.getKey(), stringBuffer, stringBuffer2);
                f(SdkMetricStatEvent.VALUE_KEY, entry.getValue(), stringBuffer, stringBuffer2);
                stringBuffer.setLength(length4);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
            return;
        }
        String strC2 = c(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(strC2);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith(HttpHost.DEFAULT_SCHEME_NAME) && str2.length() > 200) {
                str2 = str2.substring(0, 200) + "[...]";
            }
            int length5 = str2.length();
            StringBuilder sb = new StringBuilder(length5);
            while (i < length5) {
                char cCharAt = str2.charAt(i);
                if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                    sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                } else {
                    sb.append(cCharAt);
                }
                i++;
            }
            String string = sb.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(string);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            stringBuffer2.append('\"');
            while (i < bArr.length) {
                int i3 = bArr[i] & 255;
                if (i3 == 92 || i3 == 34) {
                    stringBuffer2.append('\\');
                    stringBuffer2.append((char) i3);
                } else if (i3 < 32 || i3 >= 127) {
                    stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i3)));
                } else {
                    stringBuffer2.append((char) i3);
                }
                i++;
            }
            stringBuffer2.append('\"');
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    public static final Object g(x74 x74Var, sm6 sm6Var) throws Throwable {
        ki5 ki5VarA;
        x74 x74VarA;
        Thread threadCurrentThread = Thread.currentThread();
        w74 w74Var = jbe.t0;
        r44 r44Var = (r44) x74Var.get(w74Var);
        bd5 bd5Var = bd5.a;
        if (r44Var == null) {
            ki5VarA = r7g.a();
            x74VarA = z6j.a(bd5Var, x74Var.plus(ki5VarA), true);
            ep4 ep4Var = gy4.a;
            if (x74VarA != ep4Var && x74VarA.get(w74Var) == null) {
                x74VarA = x74VarA.plus(ep4Var);
            }
        } else {
            if (r44Var instanceof ki5) {
            }
            ki5VarA = (ki5) r7g.a.get();
            x74VarA = z6j.a(bd5Var, x74Var, true);
            ep4 ep4Var2 = gy4.a;
            if (x74VarA != ep4Var2 && x74VarA.get(w74Var) == null) {
                x74VarA = x74VarA.plus(ep4Var2);
            }
        }
        oq0 oq0Var = new oq0(x74VarA, threadCurrentThread, ki5VarA);
        oq0Var.start(i84.a, oq0Var, sm6Var);
        ki5 ki5Var = oq0Var.b;
        if (ki5Var != null) {
            int i = ki5.d;
            ki5Var.P(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jZ = ki5Var != null ? ki5Var.Z() : BuildConfig.MAX_TIME_TO_UPLOAD;
                if (oq0Var.isCompleted()) {
                    if (ki5Var != null) {
                        int i2 = ki5.d;
                        ki5Var.d(false);
                    }
                    Object objA = tu7.a(oq0Var.getState$kotlinx_coroutines_core());
                    zk3 zk3Var = objA instanceof zk3 ? (zk3) objA : null;
                    if (zk3Var == null) {
                        return objA;
                    }
                    throw zk3Var.a;
                }
                LockSupport.parkNanos(oq0Var, jZ);
            } catch (Throwable th) {
                if (ki5Var != null) {
                    int i3 = ki5.d;
                    ki5Var.d(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        oq0Var.cancelCoroutine(interruptedException);
        throw interruptedException;
    }

    public static final Object i(x74 x74Var, sm6 sm6Var, Continuation continuation) {
        x74 context = continuation.getContext();
        x74 x74VarPlus = !((Boolean) x74Var.fold(Boolean.FALSE, new cj0(12))).booleanValue() ? context.plus(x74Var) : z6j.a(context, x74Var, false);
        eoi.d(x74VarPlus);
        if (x74VarPlus == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(x74VarPlus, continuation);
            return sni.b(scopeCoroutine, scopeCoroutine, sm6Var);
        }
        jbe jbeVar = jbe.t0;
        if (fni.a(x74VarPlus.get(jbeVar), context.get(jbeVar))) {
            lqg lqgVar = new lqg(x74VarPlus, continuation);
            x74 context2 = lqgVar.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, null);
            try {
                return sni.b(lqgVar, lqgVar, sm6Var);
            } finally {
                ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
            }
        }
        dy4 dy4Var = new dy4(x74VarPlus, continuation);
        pyi.b(sm6Var, dy4Var, dy4Var);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = dy4.a;
        do {
            int i = atomicIntegerFieldUpdater.get(dy4Var);
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objA = tu7.a(dy4Var.getState$kotlinx_coroutines_core());
                if (objA instanceof zk3) {
                    throw ((zk3) objA).a;
                }
                return objA;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(dy4Var, 0, 1));
        return g84.a;
    }
}
