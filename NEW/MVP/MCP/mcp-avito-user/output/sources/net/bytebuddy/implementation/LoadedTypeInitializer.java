package net.bytebuddy.implementation;

import androidx.compose.foundation.H;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* loaded from: classes7.dex */
public interface LoadedTypeInitializer {

    @SuppressFBWarnings(justification = "Serialization is considered opt-in for a rare use case", value = {"SE_BAD_FIELD"})
    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements LoadedTypeInitializer, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f417355b;

        public a() {
            throw null;
        }

        public a(LoadedTypeInitializer... loadedTypeInitializerArr) {
            List<LoadedTypeInitializer> listAsList = Arrays.asList(loadedTypeInitializerArr);
            this.f417355b = new ArrayList();
            for (LoadedTypeInitializer loadedTypeInitializer : listAsList) {
                if (loadedTypeInitializer instanceof a) {
                    this.f417355b.addAll(((a) loadedTypeInitializer).f417355b);
                } else if (!(loadedTypeInitializer instanceof NoOp)) {
                    this.f417355b.add(loadedTypeInitializer);
                }
            }
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public final void a(Class<?> cls) {
            Iterator it = this.f417355b.iterator();
            while (it.hasNext()) {
                ((LoadedTypeInitializer) it.next()).a(cls);
            }
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public final boolean c() {
            Iterator it = this.f417355b.iterator();
            while (it.hasNext()) {
                if (((LoadedTypeInitializer) it.next()).c()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f417355b.equals(((a) obj).f417355b);
        }

        public final int hashCode() {
            return this.f417355b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements LoadedTypeInitializer, Serializable {

        /* renamed from: e, reason: collision with root package name */
        public static final boolean f417356e;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final String f417357b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f417358c;

        /* renamed from: d, reason: collision with root package name */
        @HashCodeAndEqualsPlugin.ValueHandling
        @net.bytebuddy.utility.nullability.b
        public final transient AccessControlContext f417359d;

        static {
            boolean z12 = false;
            try {
                Class.forName("java.security.AccessController", false, null);
                f417356e = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                f417356e = z12;
            } catch (SecurityException unused2) {
                z12 = true;
                f417356e = z12;
            }
        }

        public b(String str, Object obj) {
            this.f417357b = str;
            this.f417358c = obj;
            this.f417359d = f417356e ? AccessController.getContext() : null;
        }

        private Object readResolve() {
            return new b(this.f417357b, this.f417358c);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[Catch: NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x004b, TryCatch #2 {IllegalAccessException -> 0x004b, NoSuchFieldException -> 0x0049, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x001e, B:9:0x0024, B:11:0x003b, B:22:0x005f, B:18:0x004d, B:20:0x0058, B:21:0x005c), top: B:28:0x0002 }] */
        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Modules are assumed available when module system is supported", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.lang.Class<?> r6) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
            /*
                r5 = this;
                java.lang.String r0 = r5.f417357b
                java.lang.reflect.Field r1 = r6.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                int r2 = r1.getModifiers()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                if (r2 == 0) goto L4d
                java.lang.Class r2 = r1.getDeclaringClass()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                int r2 = r2.getModifiers()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                if (r2 == 0) goto L4d
                boolean r2 = net.bytebuddy.utility.d.b()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                if (r2 == 0) goto L5f
                net.bytebuddy.utility.d r2 = net.bytebuddy.utility.d.c(r6)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.d.A0(r6)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                net.bytebuddy.description.type.a r3 = r3.y5()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                java.lang.Class<net.bytebuddy.implementation.LoadedTypeInitializer$b> r4 = net.bytebuddy.implementation.LoadedTypeInitializer.b.class
                net.bytebuddy.utility.d r4 = net.bytebuddy.utility.d.c(r4)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                r2.getClass()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                if (r3 == 0) goto L5f
                r3.getName()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                java.lang.reflect.AnnotatedElement r2 = r4.f418924b     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                net.bytebuddy.utility.d$a r2 = net.bytebuddy.utility.d.f418922d     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                boolean r2 = r2.d()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                if (r2 == 0) goto L4d
                goto L5f
            L49:
                r1 = move-exception
                goto L66
            L4b:
                r1 = move-exception
                goto L82
            L4d:
                net.bytebuddy.utility.privilege.c r2 = new net.bytebuddy.utility.privilege.c     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                r2.<init>(r1)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                java.security.AccessControlContext r3 = r5.f417359d     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                boolean r4 = net.bytebuddy.implementation.LoadedTypeInitializer.b.f417356e     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                if (r4 == 0) goto L5c
                java.security.AccessController.doPrivileged(r2, r3)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                goto L5f
            L5c:
                r2.run()     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
            L5f:
                java.lang.Object r2 = r5.f417358c     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                r3 = 0
                r1.set(r3, r2)     // Catch: java.lang.NoSuchFieldException -> L49 java.lang.IllegalAccessException -> L4b
                return
            L66:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "There is no field "
                r3.<init>(r4)
                r3.append(r0)
                java.lang.String r0 = " defined on "
                r3.append(r0)
                r3.append(r6)
                java.lang.String r6 = r3.toString()
                r2.<init>(r6, r1)
                throw r2
            L82:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Cannot access "
                r3.<init>(r4)
                r3.append(r0)
                java.lang.String r0 = " from "
                r3.append(r0)
                r3.append(r6)
                java.lang.String r6 = r3.toString()
                r2.<init>(r6, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.implementation.LoadedTypeInitializer.b.a(java.lang.Class):void");
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public final boolean c() {
            return true;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417357b.equals(bVar.f417357b) && this.f417358c.equals(bVar.f417358c);
        }

        public final int hashCode() {
            return this.f417358c.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f417357b);
        }
    }

    void a(Class<?> cls);

    boolean c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements LoadedTypeInitializer {

        /* renamed from: b, reason: collision with root package name */
        public static final NoOp f417353b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f417354c;

        static {
            NoOp noOp = new NoOp("INSTANCE", 0);
            f417353b = noOp;
            f417354c = new NoOp[]{noOp};
        }

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f417354c.clone();
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public final boolean c() {
            return false;
        }

        @Override // net.bytebuddy.implementation.LoadedTypeInitializer
        public final void a(Class<?> cls) {
        }
    }
}
