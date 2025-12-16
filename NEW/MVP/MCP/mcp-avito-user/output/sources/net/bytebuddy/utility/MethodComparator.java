package net.bytebuddy.utility;

import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MethodComparator implements Comparator<Method> {

    /* renamed from: b, reason: collision with root package name */
    public static final MethodComparator f418915b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ MethodComparator[] f418916c;

    static {
        MethodComparator methodComparator = new MethodComparator("INSTANCE", 0);
        f418915b = methodComparator;
        f418916c = new MethodComparator[]{methodComparator};
    }

    public MethodComparator() {
        throw null;
    }

    public static MethodComparator valueOf(String str) {
        return (MethodComparator) Enum.valueOf(MethodComparator.class, str);
    }

    public static MethodComparator[] values() {
        return (MethodComparator[]) f418916c.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Method method, Method method2) {
        Method method3 = method;
        Method method4 = method2;
        if (method3 == method4) {
            return 0;
        }
        int iCompareTo = method3.getName().compareTo(method4.getName());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Class<?>[] parameterTypes = method3.getParameterTypes();
        Class<?>[] parameterTypes2 = method4.getParameterTypes();
        if (parameterTypes.length < parameterTypes2.length) {
            return -1;
        }
        if (parameterTypes.length > parameterTypes2.length) {
            return 1;
        }
        for (int i12 = 0; i12 < parameterTypes.length; i12++) {
            int iCompareTo2 = parameterTypes[i12].getName().compareTo(parameterTypes2[i12].getName());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return method3.getReturnType().getName().compareTo(method4.getReturnType().getName());
    }
}
