package net.bytebuddy.utility;

import java.security.AccessController;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* compiled from: FileSystem.java */
/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f418917a;

    /* compiled from: FileSystem.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class a extends b {
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public final int hashCode() {
            return getClass().hashCode();
        }
    }

    /* compiled from: FileSystem.java */
    @HashCodeAndEqualsPlugin.Enhance
    /* renamed from: net.bytebuddy.utility.b$b, reason: collision with other inner class name */
    public static class C12146b extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f418918b;

        /* renamed from: c, reason: collision with root package name */
        public static final InterfaceC12147b f418919c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f418920d;

        /* compiled from: FileSystem.java */
        @JavaDispatcher.i("java.io.File")
        /* renamed from: net.bytebuddy.utility.b$b$a */
        public interface a {
        }

        /* compiled from: FileSystem.java */
        @JavaDispatcher.i("java.nio.file.Files")
        /* renamed from: net.bytebuddy.utility.b$b$b, reason: collision with other inner class name */
        public interface InterfaceC12147b {
        }

        /* compiled from: FileSystem.java */
        @JavaDispatcher.i("java.nio.file.StandardCopyOption")
        /* renamed from: net.bytebuddy.utility.b$b$c */
        public interface c {
        }

        static {
            JavaDispatcher javaDispatcherA = JavaDispatcher.a(a.class);
            boolean z12 = b.f418917a;
            f418918b = (a) (z12 ? AccessController.doPrivileged(javaDispatcherA) : javaDispatcherA.run());
            JavaDispatcher javaDispatcherA2 = JavaDispatcher.a(InterfaceC12147b.class);
            f418919c = (InterfaceC12147b) (z12 ? AccessController.doPrivileged(javaDispatcherA2) : javaDispatcherA2.run());
            JavaDispatcher javaDispatcherA3 = JavaDispatcher.a(c.class);
            f418920d = (c) (z12 ? AccessController.doPrivileged(javaDispatcherA3) : javaDispatcherA3.run());
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public final int hashCode() {
            return getClass().hashCode();
        }
    }

    static {
        boolean z12 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f418917a = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f418917a = z12;
        } catch (SecurityException unused2) {
            z12 = true;
            f418917a = z12;
        }
    }
}
