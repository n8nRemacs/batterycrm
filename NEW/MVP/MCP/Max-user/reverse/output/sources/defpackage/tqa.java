package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class tqa extends uai implements kb7 {
    public final Object d;

    public tqa(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.d = obj;
    }

    public static kb7 W(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof kb7 ? (kb7) iInterfaceQueryLocalInterface : new cfi(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object X(kb7 kb7Var) throws SecurityException {
        if (kb7Var instanceof tqa) {
            return ((tqa) kb7Var).d;
        }
        IBinder iBinderAsBinder = kb7Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(ho7.f(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        s5j.g(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
