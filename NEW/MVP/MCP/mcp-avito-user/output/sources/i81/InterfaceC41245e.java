package i81;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: MemberAccessor.java */
/* renamed from: i81.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC41245e {

    /* compiled from: MemberAccessor.java */
    /* renamed from: i81.e$a */
    public interface a {
        Object newInstance();
    }

    /* compiled from: MemberAccessor.java */
    /* renamed from: i81.e$b */
    public interface b {
        Object d(a aVar);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    Object d(Constructor<?> constructor, Object... objArr);

    void b(Field field, Object obj, Object obj2);

    default Object c(Constructor<?> constructor, b bVar, Object... objArr) {
        return ((org.mockito.internal.creation.bytebuddy.k) bVar).d(new FX0.b(this, constructor, objArr, 20));
    }

    Object e(Field field, Object obj);

    Object invoke(Object obj, Method method, Object... objArr);
}
