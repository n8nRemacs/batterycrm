package org.mockito.internal.creation.bytebuddy;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.InterfaceC44410t;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.bytebuddy.r;
import org.mockito.internal.creation.bytebuddy.s;

/* compiled from: SubclassBytecodeGenerator.java */
/* loaded from: classes7.dex */
class y implements InterfaceC44924c {

    /* renamed from: b, reason: collision with root package name */
    public final A f421600b;

    /* renamed from: c, reason: collision with root package name */
    public final s f421601c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuddy f421602d;

    /* renamed from: e, reason: collision with root package name */
    public final net.bytebuddy.implementation.d f421603e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC44410t.a f421604f;

    /* renamed from: g, reason: collision with root package name */
    public final net.bytebuddy.implementation.d f421605g;

    /* renamed from: h, reason: collision with root package name */
    public final net.bytebuddy.implementation.d f421606h;

    /* renamed from: i, reason: collision with root package name */
    public final net.bytebuddy.implementation.d f421607i;

    /* renamed from: j, reason: collision with root package name */
    public final net.bytebuddy.implementation.d f421608j;

    public y(A a12) {
        this(a12, null, C44396e.f418422c);
    }

    public static void c(Class<?> cls) {
        if (!Modifier.isPublic(cls.getModifiers())) {
            throw new MockitoException(Y71.l.b(androidx.compose.ui.graphics.colorspace.e.k(cls, "Cannot create mock for "), "", "The type is not public and its mock class is loaded by a different class loader.", "This can have multiple reasons:", " - You are mocking a class with additional interfaces of another class loader", " - Mockito is loaded by a different class loader than the mocked type (e.g. with OSGi)", " - The thread's context class loader is different than the mock's class loader"));
        }
    }

    public static boolean d(Class<?> cls) throws SecurityException {
        for (Method method : cls.getMethods()) {
            if (!Modifier.isPublic(method.getReturnType().getModifiers())) {
                return true;
            }
            for (Class<?> cls2 : method.getParameterTypes()) {
                if (!Modifier.isPublic(cls2.getModifiers())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(Class cls) {
        return (cls.getPackage() != null && "Java Runtime Environment".equalsIgnoreCase(cls.getPackage().getImplementationTitle())) || cls.getName().startsWith("java.") || cls.getName().startsWith("javax.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    @Override // org.mockito.internal.creation.bytebuddy.InterfaceC44924c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Class<? extends T> a(org.mockito.internal.creation.bytebuddy.n<T> r20) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.creation.bytebuddy.y.a(org.mockito.internal.creation.bytebuddy.n):java.lang.Class");
    }

    public y() {
        this(new z());
    }

    public y(net.bytebuddy.implementation.d dVar, InterfaceC44410t.a aVar) {
        this(new z(), dVar, aVar);
    }

    public y(A a12, net.bytebuddy.implementation.d dVar, InterfaceC44410t.a aVar) {
        s cVar;
        this.f421605g = net.bytebuddy.implementation.d.a().a(r.a.class);
        this.f421606h = net.bytebuddy.implementation.d.a().a(r.c.class);
        this.f421607i = net.bytebuddy.implementation.d.a().a(r.b.class);
        this.f421608j = net.bytebuddy.implementation.d.a().a(r.d.class);
        this.f421600b = a12;
        this.f421603e = dVar;
        this.f421604f = aVar;
        ByteBuddy byteBuddyD = new ByteBuddy().d();
        this.f421602d = byteBuddyD;
        s.a aVar2 = null;
        try {
            cVar = new s.b(byteBuddyD, a12, null);
        } catch (Exception unused) {
            cVar = new s.c();
        }
        this.f421601c = cVar;
    }
}
