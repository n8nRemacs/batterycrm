package org.mockito.internal.creation.bytebuddy;

import i81.InterfaceC41245e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.concurrent.locks.ReentrantLock;
import org.mockito.exceptions.base.MockitoSerializationIssue;
import org.mockito.mock.SerializableMode;

/* compiled from: ByteBuddyCrossClassLoaderSerializationSupport.java */
/* renamed from: org.mockito.internal.creation.bytebuddy.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C44922a implements Serializable {
    private static final long serialVersionUID = 7411152578314420778L;

    /* compiled from: ByteBuddyCrossClassLoaderSerializationSupport.java */
    /* renamed from: org.mockito.internal.creation.bytebuddy.a$a, reason: collision with other inner class name */
    public interface InterfaceC12228a {
    }

    /* compiled from: ByteBuddyCrossClassLoaderSerializationSupport.java */
    /* renamed from: org.mockito.internal.creation.bytebuddy.a$b */
    public static class b implements Serializable {
        private static final long serialVersionUID = -7600267929109286514L;

        private Object readResolve() throws ClassNotFoundException, IOException {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(null);
                c cVar = new c(byteArrayInputStream);
                Object object = cVar.readObject();
                byteArrayInputStream.close();
                cVar.close();
                return object;
            } catch (IOException unused) {
                throw null;
            } catch (ClassNotFoundException e12) {
                throw new MockitoSerializationIssue(Y71.l.b("A class couldn't be found while deserializing a Mockito mock, you should check your classpath. The error was :", "  " + e12.getMessage(), "If you are still unsure what is the reason of this exception, feel free to open an issue on GitHub."), e12);
            }
        }
    }

    /* compiled from: ByteBuddyCrossClassLoaderSerializationSupport.java */
    /* renamed from: org.mockito.internal.creation.bytebuddy.a$c */
    public static class c extends ObjectInputStream {
        public c(ByteArrayInputStream byteArrayInputStream) throws SecurityException {
            super(byteArrayInputStream);
            enableResolveObject(true);
        }

        public static void a(ObjectStreamClass objectStreamClass, Class cls) throws MockitoSerializationIssue, NoSuchFieldException {
            try {
                InterfaceC41245e interfaceC41245eC = org.mockito.internal.configuration.plugins.j.c();
                Field declaredField = objectStreamClass.getClass().getDeclaredField("name");
                try {
                    interfaceC41245eC.b(declaredField, objectStreamClass, cls.getCanonicalName());
                } catch (IllegalAccessException e12) {
                    throw new MockitoSerializationIssue("Access to " + declaredField + " was denied", e12);
                }
            } catch (NoSuchFieldException e13) {
                throw new MockitoSerializationIssue(Y71.l.b("Wow, the class 'ObjectStreamClass' in the JDK don't have the field 'name',", "this is definitely a bug in our code as it means the JDK team changed a few internal things.", "", "Please report an issue with the JDK used, a code sample and a link to download the JDK would be welcome."), e13);
            }
        }

        @Override // java.io.ObjectInputStream
        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws MockitoSerializationIssue, NoSuchFieldException {
            if (!"ByteBuddyMockitoProxyMarker".equals(readObject())) {
                return super.resolveClass(objectStreamClass);
            }
            try {
                InterfaceC44925d interfaceC44925d = (InterfaceC44925d) org.mockito.internal.configuration.plugins.j.d();
                N71.a aVar = new N71.a();
                aVar.f11211b = null;
                aVar.f11212c = null;
                aVar.f11215f = SerializableMode.f421783c;
                Class<?> clsC = interfaceC44925d.c(aVar);
                a(objectStreamClass, clsC);
                return clsC;
            } catch (ClassCastException e12) {
                throw new MockitoSerializationIssue(Y71.l.b("A Byte Buddy-generated mock cannot be deserialized into a non-Byte Buddy generated mock class", "", "The mock maker in use was: " + org.mockito.internal.configuration.plugins.j.d().getClass()), e12);
            }
        }
    }

    /* compiled from: ByteBuddyCrossClassLoaderSerializationSupport.java */
    /* renamed from: org.mockito.internal.creation.bytebuddy.a$d */
    public static class d extends ObjectOutputStream {
        @Override // java.io.ObjectOutputStream
        public final void annotateClass(Class<?> cls) throws IOException {
            writeObject(InterfaceC12228a.class.isAssignableFrom(cls) ? "ByteBuddyMockitoProxyMarker" : "");
        }
    }

    public C44922a() {
        new ReentrantLock();
    }
}
