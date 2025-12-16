package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReflectionAccessFilterHelper.java */
/* loaded from: classes6.dex */
public class B {

    /* compiled from: ReflectionAccessFilterHelper.java */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f362001a;

        /* compiled from: ReflectionAccessFilterHelper.java */
        public class a extends b {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Method f362002b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super();
                this.f362002b = method;
            }

            @Override // com.google.gson.internal.B.b
            public final boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f362002b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e12) {
                    throw new RuntimeException("Failed invoking canAccess", e12);
                }
            }
        }

        /* compiled from: ReflectionAccessFilterHelper.java */
        /* renamed from: com.google.gson.internal.B$b$b, reason: collision with other inner class name */
        public class C10730b extends b {
            public C10730b() {
                super();
            }

            @Override // com.google.gson.internal.B.b
            public final boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (u.f362168a >= 9) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C10730b();
            }
            f362001a = aVar;
        }

        public b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(Field field, Object obj) {
        return b.f362001a.a(field, obj);
    }

    public static ReflectionAccessFilter.FilterResult b(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult filterResultA = ((ReflectionAccessFilter) it.next()).a(cls);
            if (filterResultA != ReflectionAccessFilter.FilterResult.f361976c) {
                return filterResultA;
            }
        }
        return ReflectionAccessFilter.FilterResult.f361975b;
    }
}
