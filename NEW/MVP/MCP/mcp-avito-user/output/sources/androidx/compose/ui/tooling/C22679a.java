package androidx.compose.ui.tooling;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.text.C43066x;

/* compiled from: ComposableInvoker.jvm.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/a;", "", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: androidx.compose.ui.tooling.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22679a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22679a f42765a = new C22679a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method a(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        boolean z12 = false;
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= length) {
                method = null;
                break;
            }
            method = methodArr[i12];
            if (!kotlin.jvm.internal.L.f(str, method.getName())) {
                if (!C43066x.h0(method.getName(), str + '-', z12)) {
                    continue;
                }
                i12++;
                z12 = false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
            f42765a.getClass();
            if (parameterTypes.length == clsArr2.length) {
                ArrayList arrayList = new ArrayList(parameterTypes.length);
                int length2 = parameterTypes.length;
                boolean z13 = z12;
                ?? r12 = z13;
                for (?? r112 = z13; r112 < length2; r112++) {
                    Class<?> cls = parameterTypes[r112];
                    int i13 = r12 + 1;
                    Class<?> cls2 = clsArr2[r12];
                    n0 n0Var = m0.f406844a;
                    arrayList.add(Boolean.valueOf(n0Var.b(cls).equals(n0Var.b(cls2)) || cls.isAssignableFrom(cls2)));
                    r12 = i13;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            continue;
            i12++;
            z12 = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(androidx.appcompat.app.r.q(str, " not found"));
    }

    public static Method b(Class cls, String str, Object... objArr) throws SecurityException {
        Method method;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i12 = 0;
        while (true) {
            method = null;
            method = null;
            if (i12 >= length) {
                break;
            }
            Object obj = objArr[i12];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i12++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(length2 / 10.0d);
                Class cls3 = Integer.TYPE;
                kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, iCeil);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(lVarR, 10));
                kotlin.ranges.k it = lVarR.iterator();
                while (it.f406910d) {
                    it.a();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                t0 t0Var = new t0(3);
                ArrayList<Object> arrayList3 = t0Var.f406850a;
                t0Var.b(clsArr);
                t0Var.a(androidx.compose.runtime.A.class);
                t0Var.b(clsArr2);
                return a(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method2 : cls.getDeclaredMethods()) {
                    if (!kotlin.jvm.internal.L.f(method2.getName(), str)) {
                        if (!C43066x.h0(method2.getName(), str + '-', false)) {
                        }
                    }
                    method = method2;
                    break;
                }
                return method;
            }
        } catch (ReflectiveOperationException unused2) {
            return method;
        }
    }

    @androidx.compose.ui.p
    public static void c(@Y61.k String str, @Y61.k String str2, @Y61.k androidx.compose.runtime.A a12, @Y61.k Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodB = b(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodB != null) {
                methodB.setAccessible(true);
                if (Modifier.isStatic(methodB.getModifiers())) {
                    d(methodB, null, a12, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    d(methodB, cls.getConstructor(new Class[0]).newInstance(new Object[0]), a12, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e12) {
            H.f42758a.getClass();
            throw e12;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.reflect.Method r10, java.lang.Object r11, androidx.compose.runtime.A r12, java.lang.Object... r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.C22679a.d(java.lang.reflect.Method, java.lang.Object, androidx.compose.runtime.A, java.lang.Object[]):void");
    }
}
