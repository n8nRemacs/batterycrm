package androidx.view;

import Y61.k;
import Y61.l;
import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.graphics.colorspace.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* compiled from: SavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* renamed from: androidx.lifecycle.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23076z0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final List<Class<?>> f46930a = C42745f0.U(Application.class, C23060r0.class);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final List<Class<?>> f46931b = Collections.singletonList(C23060r0.class);

    @l
    public static final <T> Constructor<T> a(@k Class<T> cls, @k List<? extends Class<?>> list) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            List listG0 = C42756l.g0(constructor.getParameterTypes());
            if (list.equals(listG0)) {
                return constructor;
            }
            if (list.size() == listG0.size() && listG0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends M0> T b(@k Class<T> cls, @k Constructor<T> constructor, @k Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e.k(cls, "Failed to access "), e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException(e.k(cls, "An exception happened in constructor of "), e14.getCause());
        }
    }
}
