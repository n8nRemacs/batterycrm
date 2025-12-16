package net.bytebuddy.utility;

import java.lang.reflect.Constructor;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ConstructorComparator implements Comparator<Constructor<?>> {

    /* renamed from: b, reason: collision with root package name */
    public static final ConstructorComparator f418849b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ConstructorComparator[] f418850c;

    static {
        ConstructorComparator constructorComparator = new ConstructorComparator("INSTANCE", 0);
        f418849b = constructorComparator;
        f418850c = new ConstructorComparator[]{constructorComparator};
    }

    public ConstructorComparator() {
        throw null;
    }

    public static ConstructorComparator valueOf(String str) {
        return (ConstructorComparator) Enum.valueOf(ConstructorComparator.class, str);
    }

    public static ConstructorComparator[] values() {
        return (ConstructorComparator[]) f418850c.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Constructor<?> constructor, Constructor<?> constructor2) {
        Constructor<?> constructor3 = constructor;
        Constructor<?> constructor4 = constructor2;
        if (constructor3 == constructor4) {
            return 0;
        }
        int iCompareTo = constructor3.getName().compareTo(constructor4.getName());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Class<?>[] parameterTypes = constructor3.getParameterTypes();
        Class<?>[] parameterTypes2 = constructor4.getParameterTypes();
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
        return 0;
    }
}
