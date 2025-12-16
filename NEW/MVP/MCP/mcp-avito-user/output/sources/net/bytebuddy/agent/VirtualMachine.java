package net.bytebuddy.agent;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Closeable;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Locale;

/* loaded from: classes8.dex */
public interface VirtualMachine {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Resolver implements PrivilegedAction<Class<? extends VirtualMachine>> {

        /* renamed from: b, reason: collision with root package name */
        public static final Resolver f415372b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Resolver[] f415373c;

        static {
            Resolver resolver = new Resolver("INSTANCE", 0);
            f415372b = resolver;
            f415373c = new Resolver[]{resolver};
        }

        public Resolver() {
            throw null;
        }

        public static Resolver valueOf(String str) {
            return (Resolver) Enum.valueOf(Resolver.class, str);
        }

        public static Resolver[] values() {
            return (Resolver[]) f415373c.clone();
        }

        @Override // java.security.PrivilegedAction
        public final Class<? extends VirtualMachine> run() throws ClassNotFoundException {
            try {
                Class.forName("com.sun.jna.Platform");
                return System.getProperty("java.vm.name", "").toUpperCase(Locale.US).contains("J9") ? d.class : c.class;
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException("Optional JNA dependency is not available", e12);
            }
        }
    }

    public static abstract class b implements VirtualMachine {
    }

    public static class d extends b {

        public interface a {

            /* renamed from: net.bytebuddy.agent.VirtualMachine$d$a$a, reason: collision with other inner class name */
            public static class C11885a implements a {

                /* renamed from: net.bytebuddy.agent.VirtualMachine$d$a$a$a, reason: collision with other inner class name */
                public interface InterfaceC11886a extends Library {

                    /* renamed from: net.bytebuddy.agent.VirtualMachine$d$a$a$a$a, reason: collision with other inner class name */
                    public static class C11887a extends Structure {
                    }
                }
            }

            public static class b implements a {

                /* renamed from: a, reason: collision with root package name */
                public final InterfaceC11889b f415378a = (InterfaceC11889b) Native.loadLibrary("kernel32", InterfaceC11889b.class, W32APIOptions.DEFAULT_OPTIONS);

                /* renamed from: net.bytebuddy.agent.VirtualMachine$d$a$b$a, reason: collision with other inner class name */
                public static class C11888a implements Closeable {
                    /* JADX INFO: Thrown type has an unknown type hierarchy: com.sun.jna.platform.win32.Win32Exception */
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() throws Win32Exception {
                        Kernel32 kernel32;
                        try {
                            if (!Kernel32.INSTANCE.CloseHandle((WinNT.HANDLE) null)) {
                                throw new Win32Exception(Kernel32.INSTANCE.GetLastError());
                            }
                            if (!kernel32.CloseHandle(handle)) {
                                throw new Win32Exception(Kernel32.INSTANCE.GetLastError());
                            }
                        } finally {
                            Kernel32.INSTANCE.CloseHandle((WinNT.HANDLE) null);
                        }
                    }
                }

                /* renamed from: net.bytebuddy.agent.VirtualMachine$d$a$b$b, reason: collision with other inner class name */
                public interface InterfaceC11889b extends StdCallLibrary {

                    @SuppressFBWarnings(justification = "Field required by native implementation.", value = {"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD", "UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
                    /* renamed from: net.bytebuddy.agent.VirtualMachine$d$a$b$b$a, reason: collision with other inner class name */
                    public static class C11890a extends Structure {
                    }
                }
            }
        }

        static {
            new SecureRandom();
        }
    }

    public static class c extends b {

        public interface a extends Closeable {

            /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$a, reason: collision with other inner class name */
            public interface InterfaceC11871a {

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC11872a implements InterfaceC11871a {
                }
            }

            public static class d implements a {

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$d$a, reason: collision with other inner class name */
                public static class C11881a implements InterfaceC11871a {

                    /* renamed from: a, reason: collision with root package name */
                    public final InterfaceC11883d f415374a = (InterfaceC11883d) Native.loadLibrary("kernel32", InterfaceC11883d.class, W32APIOptions.DEFAULT_OPTIONS);

                    /* renamed from: b, reason: collision with root package name */
                    public final InterfaceC11882c f415375b = (InterfaceC11882c) Native.loadLibrary(System.getProperty("net.bytebuddy.library.name", "attach_hotspot_windows"), InterfaceC11882c.class);
                }

                public static class b implements f {
                    /* JADX INFO: Thrown type has an unknown type hierarchy: com.sun.jna.platform.win32.Win32Exception */
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() throws Win32Exception {
                        try {
                            if (!Kernel32.INSTANCE.DisconnectNamedPipe((WinNT.HANDLE) null)) {
                                throw new Win32Exception(Native.getLastError());
                            }
                            if (!Kernel32.INSTANCE.CloseHandle((WinNT.HANDLE) null)) {
                                throw new Win32Exception(Native.getLastError());
                            }
                        } catch (Throwable th2) {
                            if (!Kernel32.INSTANCE.CloseHandle((WinNT.HANDLE) null)) {
                                throw new Win32Exception(Native.getLastError());
                            }
                            throw th2;
                        }
                    }
                }

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$d$c, reason: collision with other inner class name */
                public interface InterfaceC11882c extends StdCallLibrary {
                }

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$d$d, reason: collision with other inner class name */
                public interface InterfaceC11883d extends StdCallLibrary {
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: com.sun.jna.platform.win32.Win32Exception */
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws Win32Exception {
                    WinDef.LPVOID lpvoid = null;
                    try {
                        lpvoid.getPointer();
                        throw null;
                    } catch (Throwable th2) {
                        if (!Kernel32.INSTANCE.CloseHandle((WinNT.HANDLE) null)) {
                            throw new Win32Exception(Native.getLastError());
                        }
                        throw th2;
                    }
                }
            }

            public static abstract class e<T> implements a {

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$e$a, reason: collision with other inner class name */
                public class C11884a implements f {

                    /* renamed from: b, reason: collision with root package name */
                    public final T f415376b;

                    public C11884a() {
                        throw null;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public C11884a(Object obj, a aVar) {
                        this.f415376b = obj;
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        e.this.a(this.f415376b);
                        throw null;
                    }
                }

                public abstract void a(T t12);
            }

            public interface f extends Closeable {
            }

            public static class b extends e<Integer> {

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$b$a, reason: collision with other inner class name */
                public static class C11873a extends InterfaceC11871a.AbstractC11872a {

                    /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$b$a$a, reason: collision with other inner class name */
                    public interface InterfaceC11874a extends Library {
                    }
                }

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$b$b, reason: collision with other inner class name */
                public interface InterfaceC11875b extends Library {

                    /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$b$b$a, reason: collision with other inner class name */
                    public static class C11876a extends Structure {
                    }
                }

                @Override // net.bytebuddy.agent.VirtualMachine.c.a.e
                public final void a(Integer num) {
                    num.getClass();
                    throw null;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            }

            /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$c, reason: collision with other inner class name */
            public static class C11877c implements a {

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$c$a, reason: collision with other inner class name */
                public static class C11878a extends InterfaceC11871a.AbstractC11872a {
                }

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$c$b */
                public static class b implements f {
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        throw null;
                    }
                }

                /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$c$c, reason: collision with other inner class name */
                public interface InterfaceC11879c extends Library {

                    /* renamed from: net.bytebuddy.agent.VirtualMachine$c$a$c$c$a, reason: collision with other inner class name */
                    public static class C11880a extends Structure {
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            }
        }
    }
}
