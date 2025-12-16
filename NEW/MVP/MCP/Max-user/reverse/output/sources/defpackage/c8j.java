package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class c8j {
    public static final Field a(Field field, String str) {
        try {
            Field declaredField = ExecutorsRegistrar.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            field.setInt(declaredField, declaredField.getModifiers() & (-17));
            return declaredField;
        } catch (Throwable th) {
            wqi.e("ReplaceExecutorRegistrarLogic", "fail to fetch executor field ".concat(str), th);
            return null;
        }
    }

    public static final void b(Field field, cm6 cm6Var) throws IllegalAccessException, IllegalArgumentException {
        field.set(null, new l18(new ql3(3, cm6Var)));
    }

    public static final rgb c(ze4 ze4Var) {
        return new rgb(ze4Var.a, ze4.b(ze4Var.c), ze4Var.e, ze4Var.f, ze4Var.g, ze4Var.i);
    }
}
