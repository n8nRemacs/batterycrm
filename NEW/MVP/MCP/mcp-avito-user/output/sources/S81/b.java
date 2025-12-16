package s81;

import java.lang.reflect.Field;
import org.objenesis.ObjenesisException;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtils.java */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f437496a;

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            try {
                f437496a = (Unsafe) declaredField.get(null);
            } catch (IllegalAccessException e12) {
                throw new ObjenesisException(e12);
            }
        } catch (NoSuchFieldException e13) {
            throw new ObjenesisException(e13);
        }
    }
}
