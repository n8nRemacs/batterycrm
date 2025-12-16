package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.y;
import com.google.android.gms.dynamic.d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.N;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@y
@RX0.a
/* loaded from: classes6.dex */
public final class f<T> extends d.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f349643a;

    public f(Object obj) {
        this.f349643a = obj;
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public static <T> T g4(@N d dVar) throws SecurityException {
        if (dVar instanceof f) {
            return (T) ((f) dVar).f349643a;
        }
        IBinder iBinderAsBinder = dVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i12 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i12++;
                field = field2;
            }
        }
        if (i12 != 1) {
            throw new IllegalArgumentException(AK.c.g(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        C36729v.j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e12) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e12);
        } catch (NullPointerException e13) {
            throw new IllegalArgumentException("Binder object is null.", e13);
        }
    }
}
