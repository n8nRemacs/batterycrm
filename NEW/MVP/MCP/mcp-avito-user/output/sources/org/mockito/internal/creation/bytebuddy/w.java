package org.mockito.internal.creation.bytebuddy;

import i81.InterfaceC41246f;
import java.lang.reflect.Modifier;
import org.mockito.creation.instance.InstantiationException;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: SubclassByteBuddyMockMaker.java */
/* loaded from: classes7.dex */
public class w implements InterfaceC44925d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC44924c f421598a = new C(new y(new z()), false);

    /* compiled from: SubclassByteBuddyMockMaker.java */
    public class a implements InterfaceC41246f.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f421599a;

        public a(Class cls) {
            this.f421599a = cls;
        }

        @Override // i81.InterfaceC41246f.c
        public final boolean a() {
            Class<?> cls = this.f421599a;
            return (cls.isPrimitive() || Modifier.isFinal(cls.getModifiers()) || D.f421525b.a(cls)) ? false : true;
        }

        @Override // i81.InterfaceC41246f.c
        public final String b() {
            if (a()) {
                return "";
            }
            Class<?> cls = this.f421599a;
            return cls.isPrimitive() ? "primitive type" : Modifier.isFinal(cls.getModifiers()) ? "final class" : D.f421525b.a(cls) ? "sealed class" : Y71.l.b("not handled type");
        }
    }

    public static String b(Class<?> cls) {
        if (cls == null) {
            return "null";
        }
        return "'" + cls.getCanonicalName() + "', loaded by classloader : '" + cls.getClassLoader() + "'";
    }

    @Override // i81.InterfaceC41246f
    public final InterfaceC41246f.c a(Class<?> cls) {
        return new a(cls);
    }

    @Override // org.mockito.internal.creation.bytebuddy.InterfaceC44925d
    public final Class c(N71.a aVar) {
        String str;
        try {
            return ((C) this.f421598a).a(new n(aVar.f11211b, aVar.f11212c, aVar.f11215f, false, aVar.f11213d));
        } catch (Exception e12) {
            String str2 = "";
            if (aVar.f11211b.isArray()) {
                throw new MockitoException(Y71.l.b("Mockito cannot mock arrays: " + aVar.f11211b + ".", ""), e12);
            }
            if (Modifier.isPrivate(aVar.f11211b.getModifiers())) {
                throw new MockitoException(Y71.l.b("Mockito cannot mock this class: " + aVar.f11211b + ".", "Most likely it is due to mocking a private class that is not visible to Mockito", ""), e12);
            }
            String str3 = "Mockito cannot mock this class: " + aVar.f11211b + ".";
            String str4 = Y71.j.b() ? "Java 8 early builds have bugs that were addressed in Java 1.8.0_45, please update your JDK!\n" : "";
            String str5 = Y71.j.f19332g;
            if (!str5.contains("IBM J9 VM")) {
                if (str5.contains("Hotspot")) {
                    str = str4;
                }
                throw new MockitoException(Y71.l.b(str3, "", "Mockito can only mock non-private & non-final classes, but the root cause of this error might be different.", "Please check the full stacktrace to understand what the issue is.", "If you're still not sure why you're getting this error, please open an issue on GitHub.", "", str, Y71.j.a(), "", "Underlying exception : " + e12), e12);
            }
            str2 = "Early IBM virtual machine are known to have issues with Mockito, please upgrade to an up-to-date version.\n";
            str = str2;
            throw new MockitoException(Y71.l.b(str3, "", "Mockito can only mock non-private & non-final classes, but the root cause of this error might be different.", "Please check the full stacktrace to understand what the issue is.", "If you're still not sure why you're getting this error, please open an issue on GitHub.", "", str, Y71.j.a(), "", "Underlying exception : " + e12), e12);
        }
    }

    @Override // i81.InterfaceC41246f
    public final Object d(N71.a aVar, e81.h hVar) {
        Object objB;
        Class clsC = c(aVar);
        D71.a aVarA = org.mockito.internal.configuration.plugins.j.b().a(aVar);
        try {
            try {
                objB = aVarA.b(clsC);
                try {
                    new r(aVar, hVar);
                    ((m) objB).b();
                    return aVar.f11211b.cast(objB);
                } catch (ClassCastException e12) {
                    e = e12;
                    String str = "  class to mock : " + b(aVar.f11211b);
                    String str2 = "  created class : " + b(clsC);
                    StringBuilder sb2 = new StringBuilder("  proxy instance class : ");
                    sb2.append(objB == null ? "null" : b(objB.getClass()));
                    throw new MockitoException(Y71.l.b("ClassCastException occurred while creating the mockito mock :", str, str2, sb2.toString(), "  instance creation by : ".concat(aVarA.getClass().getSimpleName()), "", "You might experience classloading issues, please ask the mockito mailing-list.", ""), e);
                }
            } catch (InstantiationException e13) {
                throw new MockitoException("Unable to create mock instance of type '" + clsC.getSuperclass().getSimpleName() + "'", e13);
            }
        } catch (ClassCastException e14) {
            e = e14;
            objB = null;
        }
    }

    @Override // i81.InterfaceC41246f
    public final e81.h e(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).a().f421580b;
        }
        return null;
    }
}
