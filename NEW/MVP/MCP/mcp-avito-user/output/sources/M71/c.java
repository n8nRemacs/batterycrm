package M71;

import java.util.Arrays;

/* compiled from: SuspendMethod.java */
/* loaded from: classes7.dex */
public final class c {
    public static Class<?>[] a(Class<?>[] clsArr) {
        int length = clsArr.length;
        if (length <= 0) {
            return clsArr;
        }
        int i12 = length - 1;
        String name = clsArr[i12].getName();
        return (name.equals("kotlin.coroutines.Continuation") || name.equals("kotlin.coroutines.experimental.Continuation")) ? (Class[]) Arrays.copyOf(clsArr, i12) : clsArr;
    }
}
