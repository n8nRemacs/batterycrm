package net.bytebuddy.utility;

import java.security.AccessController;
import java.util.Queue;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* compiled from: QueueFactory.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f418983b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f418984c;

    /* renamed from: a, reason: collision with root package name */
    public final a f418985a;

    /* compiled from: QueueFactory.java */
    @JavaDispatcher.i("java.util.ArrayDeque")
    @JavaDispatcher.c
    public interface a {
        @JavaDispatcher.i("arrayDeque")
        @JavaDispatcher.g
        @net.bytebuddy.utility.nullability.b
        Queue a();
    }

    static {
        boolean z12 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f418984c = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f418984c = z12;
            f418983b = new f();
        } catch (SecurityException unused2) {
            z12 = true;
            f418984c = z12;
            f418983b = new f();
        }
        f418983b = new f();
    }

    public f() {
        JavaDispatcher javaDispatcherA = JavaDispatcher.a(a.class);
        this.f418985a = (a) (f418984c ? AccessController.doPrivileged(javaDispatcherA) : javaDispatcherA.run());
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418985a.equals(((f) obj).f418985a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f418985a.hashCode() + (getClass().hashCode() * 31);
    }
}
