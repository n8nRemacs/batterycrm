package net.bytebuddy;

import AK.c;
import androidx.camera.camera2.internal.G;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.security.PrivilegedAction;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.e;
import net.bytebuddy.utility.nullability.b;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class ClassFileVersion implements Comparable<ClassFileVersion>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final ClassFileVersion f415291c;

    /* renamed from: d, reason: collision with root package name */
    public static final ClassFileVersion f415292d;

    /* renamed from: e, reason: collision with root package name */
    public static final ClassFileVersion f415293e;

    /* renamed from: f, reason: collision with root package name */
    public static final ClassFileVersion f415294f;

    /* renamed from: g, reason: collision with root package name */
    public static final ClassFileVersion f415295g;

    /* renamed from: h, reason: collision with root package name */
    public static final ClassFileVersion f415296h;

    /* renamed from: i, reason: collision with root package name */
    public static final ClassFileVersion f415297i;

    /* renamed from: j, reason: collision with root package name */
    public static final ClassFileVersion f415298j;

    /* renamed from: k, reason: collision with root package name */
    public static final ClassFileVersion f415299k;

    /* renamed from: l, reason: collision with root package name */
    public static final ClassFileVersion f415300l;

    /* renamed from: m, reason: collision with root package name */
    public static final ClassFileVersion f415301m;

    /* renamed from: n, reason: collision with root package name */
    public static final ClassFileVersion f415302n;

    /* renamed from: o, reason: collision with root package name */
    public static final ClassFileVersion f415303o;

    /* renamed from: p, reason: collision with root package name */
    public static final ClassFileVersion f415304p;

    /* renamed from: q, reason: collision with root package name */
    public static final ClassFileVersion f415305q;

    /* renamed from: r, reason: collision with root package name */
    public static final ClassFileVersion f415306r;

    /* renamed from: s, reason: collision with root package name */
    public static final ClassFileVersion f415307s;
    private static final long serialVersionUID = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final ClassFileVersion f415308t;

    /* renamed from: u, reason: collision with root package name */
    public static final ClassFileVersion f415309u;

    /* renamed from: v, reason: collision with root package name */
    public static final VersionLocator f415310v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f415311w;

    /* renamed from: b, reason: collision with root package name */
    public final int f415312b;

    public interface VersionLocator {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Resolver implements PrivilegedAction<VersionLocator> {

            /* renamed from: b, reason: collision with root package name */
            public static final Resolver f415313b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Resolver[] f415314c;

            static {
                Resolver resolver = new Resolver("INSTANCE", 0);
                f415313b = resolver;
                f415314c = new Resolver[]{resolver};
            }

            public Resolver() {
                throw null;
            }

            public static Resolver valueOf(String str) {
                return (Resolver) Enum.valueOf(Resolver.class, str);
            }

            public static Resolver[] values() {
                return (Resolver[]) f415314c.clone();
            }

            @Override // java.security.PrivilegedAction
            @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public final VersionLocator run() {
                try {
                    try {
                        return new a(ClassFileVersion.e(((Integer) Class.forName(Runtime.class.getName().concat("$Version")).getMethod("major", new Class[0]).invoke(Runtime.class.getMethod("version", new Class[0]).invoke(null, new Object[0]), new Object[0])).intValue()));
                    } catch (Throwable th2) {
                        return new b(th2.getMessage());
                    }
                } catch (Throwable unused) {
                    String property = System.getProperty("java.version");
                    if (property == null) {
                        throw new IllegalStateException("Java version property is not set");
                    }
                    if (property.equals("0")) {
                        return new a(ClassFileVersion.f415296h);
                    }
                    int[] iArr = new int[3];
                    iArr[0] = -1;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    for (int i12 = 1; i12 < 3; i12++) {
                        int iIndexOf = property.indexOf(46, iArr[i12 - 1] + 1);
                        iArr[i12] = iIndexOf;
                        if (iIndexOf == -1) {
                            throw new IllegalStateException("This JVM's version string does not seem to be valid: " + property);
                        }
                    }
                    return new a(ClassFileVersion.e(Integer.parseInt(property.substring(iArr[1] + 1, iArr[2]))));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements VersionLocator {

            /* renamed from: a, reason: collision with root package name */
            public final ClassFileVersion f415315a;

            public a(ClassFileVersion classFileVersion) {
                this.f415315a = classFileVersion;
            }

            @Override // net.bytebuddy.ClassFileVersion.VersionLocator
            public final ClassFileVersion a() {
                return this.f415315a;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f415315a.equals(((a) obj).f415315a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f415315a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements VersionLocator {

            /* renamed from: a, reason: collision with root package name */
            public final String f415316a;

            public b(String str) {
                this.f415316a = str;
            }

            @Override // net.bytebuddy.ClassFileVersion.VersionLocator
            public final ClassFileVersion a() {
                throw new IllegalStateException("Failed to resolve the class file version of the current VM: " + this.f415316a);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f415316a.equals(((b) obj).f415316a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f415316a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        ClassFileVersion a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cb  */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.ClassFileVersion.f415311w = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.ClassFileVersion.f415311w = r0
        L19:
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 196653(0x3002d, float:2.7557E-40)
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415291c = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 46
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415292d = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 47
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415293e = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 48
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415294f = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 49
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415295g = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 50
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415296h = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 51
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415297i = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 52
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415298j = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 53
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415299k = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 54
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415300l = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 55
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415301m = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 56
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415302n = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 57
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415303o = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 58
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415304p = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 59
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415305q = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 60
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415306r = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 61
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415307s = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 62
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415308t = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 63
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.f415309u = r0
            net.bytebuddy.ClassFileVersion$VersionLocator$Resolver r0 = net.bytebuddy.ClassFileVersion.VersionLocator.Resolver.f415313b
            boolean r1 = net.bytebuddy.ClassFileVersion.f415311w
            if (r1 == 0) goto Ld0
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            goto Ld4
        Ld0:
            java.lang.Object r0 = r0.run()
        Ld4:
            net.bytebuddy.ClassFileVersion$VersionLocator r0 = (net.bytebuddy.ClassFileVersion.VersionLocator) r0
            net.bytebuddy.ClassFileVersion.f415310v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.ClassFileVersion.<clinit>():void");
    }

    public ClassFileVersion(int i12) {
        this.f415312b = i12;
    }

    public static ClassFileVersion e(int i12) {
        switch (i12) {
            case 1:
                return f415291c;
            case 2:
                return f415292d;
            case 3:
                return f415293e;
            case 4:
                return f415294f;
            case 5:
                return f415295g;
            case 6:
                return f415296h;
            case 7:
                return f415297i;
            case 8:
                return f415298j;
            case 9:
                return f415299k;
            case 10:
                return f415300l;
            case 11:
                return f415301m;
            case 12:
                return f415302n;
            case 13:
                return f415303o;
            case 14:
                return f415304p;
            case 15:
                return f415305q;
            case 16:
                return f415306r;
            case 17:
                return f415307s;
            case 18:
                return f415308t;
            case 19:
                return f415309u;
            default:
                if (!e.f418980a || i12 <= 0) {
                    throw new IllegalArgumentException(c.g(i12, "Unknown Java version: "));
                }
                return new ClassFileVersion(i12 + 44);
        }
    }

    public static ClassFileVersion f(int i12) {
        ClassFileVersion classFileVersion = new ClassFileVersion(i12);
        if (classFileVersion.b() > 44) {
            return classFileVersion;
        }
        throw new IllegalArgumentException(G.e(i12, "Class version ", " is not valid"));
    }

    @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
    public static ClassFileVersion h(ClassFileVersion classFileVersion) {
        try {
            return f415310v.a();
        } catch (Exception unused) {
            return classFileVersion;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ClassFileVersion classFileVersion) {
        short sB2;
        short sB3;
        if (b() == classFileVersion.b()) {
            sB2 = (short) (this.f415312b >> 16);
            sB3 = (short) (classFileVersion.f415312b >> 16);
        } else {
            sB2 = b();
            sB3 = classFileVersion.b();
        }
        return Integer.signum(sB2 - sB3);
    }

    public final short b() {
        return (short) (this.f415312b & 255);
    }

    public final boolean c(ClassFileVersion classFileVersion) {
        return compareTo(classFileVersion) > -1;
    }

    public final boolean d(ClassFileVersion classFileVersion) {
        return compareTo(classFileVersion) < 0;
    }

    public final boolean equals(@b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f415312b == ((ClassFileVersion) obj).f415312b;
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().hashCode() * 31) + this.f415312b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Java ");
        sb2.append(b() - 44);
        sb2.append(" (");
        return c.i(this.f415312b, ")", sb2);
    }
}
