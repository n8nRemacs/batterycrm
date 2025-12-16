package org.mockito.internal.util.reflection;

import i81.InterfaceC41245e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.bytebuddy.ClassFileVersion;

/* compiled from: ModuleMemberAccessor.java */
/* loaded from: classes7.dex */
public class l implements InterfaceC41245e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC41245e f421776a;

    public l() {
        InterfaceC41245e mVar;
        try {
            mVar = ClassFileVersion.f415310v.a().c(ClassFileVersion.f415299k) ? new j() : new m();
        } catch (Throwable unused) {
            mVar = new m();
        }
        this.f421776a = mVar;
    }

    @Override // i81.InterfaceC41245e
    /* renamed from: a */
    public final Object d(Constructor<?> constructor, Object... objArr) {
        return this.f421776a.d(constructor, objArr);
    }

    @Override // i81.InterfaceC41245e
    public final void b(Field field, Object obj, Object obj2) {
        this.f421776a.b(field, obj, obj2);
    }

    @Override // i81.InterfaceC41245e
    public final Object c(Constructor<?> constructor, InterfaceC41245e.b bVar, Object... objArr) {
        return this.f421776a.c(constructor, bVar, objArr);
    }

    @Override // i81.InterfaceC41245e
    public final Object e(Field field, Object obj) {
        return this.f421776a.e(field, obj);
    }

    @Override // i81.InterfaceC41245e
    public final Object invoke(Object obj, Method method, Object... objArr) {
        return this.f421776a.invoke(obj, method, objArr);
    }
}
