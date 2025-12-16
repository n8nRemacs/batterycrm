package net.bytebuddy.dynamic.loading;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* loaded from: classes8.dex */
public interface PackageDefinitionStrategy {

    public interface Definition {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Trivial implements Definition {

            /* renamed from: b, reason: collision with root package name */
            public static final Trivial f416789b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Trivial[] f416790c;

            static {
                Trivial trivial = new Trivial("INSTANCE", 0);
                f416789b = trivial;
                f416790c = new Trivial[]{trivial};
            }

            public Trivial() {
                throw null;
            }

            public static Trivial valueOf(String str) {
                return (Trivial) Enum.valueOf(Trivial.class, str);
            }

            public static Trivial[] values() {
                return (Trivial[]) f416790c.clone();
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final boolean a() {
                return true;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String b() {
                return null;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final boolean c(Package r12) {
                return true;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String d() {
                return null;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final String e() {
                return null;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final URL f() {
                return null;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String h() {
                return null;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String i() {
                return null;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String k() {
                return null;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Undefined implements Definition {

            /* renamed from: b, reason: collision with root package name */
            public static final Undefined f416791b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Undefined[] f416792c;

            static {
                Undefined undefined = new Undefined("INSTANCE", 0);
                f416791b = undefined;
                f416792c = new Undefined[]{undefined};
            }

            public Undefined() {
                throw null;
            }

            public static Undefined valueOf(String str) {
                return (Undefined) Enum.valueOf(Undefined.class, str);
            }

            public static Undefined[] values() {
                return (Undefined[]) f416792c.clone();
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final boolean a() {
                return false;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final String b() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final boolean c(Package r22) {
                throw new IllegalStateException("Cannot check compatibility to undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final String d() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final String e() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final URL f() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final String h() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final String i() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final String k() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }
        }

        public static class a implements Definition {

            /* renamed from: b, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final URL f416793b;

            /* renamed from: c, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f416794c;

            /* renamed from: d, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f416795d;

            /* renamed from: e, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f416796e;

            /* renamed from: f, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f416797f;

            /* renamed from: g, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f416798g;

            /* renamed from: h, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f416799h;

            public a(@net.bytebuddy.utility.nullability.b String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String str4, @net.bytebuddy.utility.nullability.b String str5, @net.bytebuddy.utility.nullability.b String str6, @net.bytebuddy.utility.nullability.b URL url) {
                this.f416794c = str;
                this.f416795d = str2;
                this.f416796e = str3;
                this.f416797f = str4;
                this.f416798g = str5;
                this.f416799h = str6;
                this.f416793b = url;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final boolean a() {
                return true;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String b() {
                return this.f416794c;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public final boolean c(Package r22) {
                URL url = this.f416793b;
                return url == null ? !r22.isSealed() : r22.isSealed(url);
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String d() {
                return this.f416796e;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String e() {
                return this.f416799h;
            }

            @SuppressFBWarnings(justification = "Package sealing relies on URL equality.", value = {"DMI_BLOCKING_METHODS_ON_URL"})
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                String str = aVar.f416794c;
                String str2 = this.f416794c;
                if (str2 == null ? str == null : str2.equals(str)) {
                    String str3 = aVar.f416795d;
                    String str4 = this.f416795d;
                    if (str4 == null ? str3 == null : str4.equals(str3)) {
                        String str5 = aVar.f416796e;
                        String str6 = this.f416796e;
                        if (str6 == null ? str5 == null : str6.equals(str5)) {
                            String str7 = aVar.f416797f;
                            String str8 = this.f416797f;
                            if (str8 == null ? str7 == null : str8.equals(str7)) {
                                String str9 = aVar.f416798g;
                                String str10 = this.f416798g;
                                if (str10 == null ? str9 == null : str10.equals(str9)) {
                                    String str11 = aVar.f416799h;
                                    String str12 = this.f416799h;
                                    if (str12 == null ? str11 == null : str12.equals(str11)) {
                                        URL url = aVar.f416793b;
                                        URL url2 = this.f416793b;
                                        if (url2 != null) {
                                            if (url2.equals(url)) {
                                                return true;
                                            }
                                        } else if (url == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final URL f() {
                return this.f416793b;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String h() {
                return this.f416798g;
            }

            @SuppressFBWarnings(justification = "Package sealing relies on URL equality.", value = {"DMI_BLOCKING_METHODS_ON_URL"})
            public final int hashCode() {
                String str = this.f416794c;
                int iHashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f416795d;
                int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f416796e;
                int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.f416797f;
                int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
                String str5 = this.f416798g;
                int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
                String str6 = this.f416799h;
                int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
                URL url = this.f416793b;
                return iHashCode6 + (url != null ? url.hashCode() : 0);
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String i() {
                return this.f416797f;
            }

            @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            @net.bytebuddy.utility.nullability.b
            public final String k() {
                return this.f416795d;
            }
        }

        boolean a();

        @net.bytebuddy.utility.nullability.b
        String b();

        boolean c(Package r12);

        @net.bytebuddy.utility.nullability.b
        String d();

        @net.bytebuddy.utility.nullability.b
        String e();

        @net.bytebuddy.utility.nullability.b
        URL f();

        @net.bytebuddy.utility.nullability.b
        String h();

        @net.bytebuddy.utility.nullability.b
        String i();

        @net.bytebuddy.utility.nullability.b
        String k();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ManifestReading implements PackageDefinitionStrategy {

        /* renamed from: c, reason: collision with root package name */
        public static final Attributes.Name[] f416800c = {Attributes.Name.SPECIFICATION_TITLE, Attributes.Name.SPECIFICATION_VERSION, Attributes.Name.SPECIFICATION_VENDOR, Attributes.Name.IMPLEMENTATION_TITLE, Attributes.Name.IMPLEMENTATION_VERSION, Attributes.Name.IMPLEMENTATION_VENDOR, Attributes.Name.SEALED};

        /* renamed from: b, reason: collision with root package name */
        public final SealBaseLocator.b f416801b = new SealBaseLocator.b();

        public interface SealBaseLocator {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NonSealing implements SealBaseLocator {

                /* renamed from: b, reason: collision with root package name */
                public static final NonSealing f416802b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ NonSealing[] f416803c;

                static {
                    NonSealing nonSealing = new NonSealing("INSTANCE", 0);
                    f416802b = nonSealing;
                    f416803c = new NonSealing[]{nonSealing};
                }

                public NonSealing() {
                    throw null;
                }

                public static NonSealing valueOf(String str) {
                    return (NonSealing) Enum.valueOf(NonSealing.class, str);
                }

                public static NonSealing[] values() {
                    return (NonSealing[]) f416803c.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements SealBaseLocator {
                @SuppressFBWarnings(justification = "Package sealing relies on URL equality.", value = {"DMI_BLOCKING_METHODS_ON_URL"})
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return true;
                }

                @SuppressFBWarnings(justification = "Package sealing relies on URL equality.", value = {"DMI_BLOCKING_METHODS_ON_URL"})
                public final int hashCode() {
                    return 17;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements SealBaseLocator {
                @net.bytebuddy.utility.nullability.b
                public final URL a(ClassLoader classLoader, String str) {
                    URL resource = classLoader.getResource(str.replace('.', '/') + ".class");
                    if (resource != null) {
                        try {
                            if (resource.getProtocol().equals("jar")) {
                                return new URL(resource.getPath().substring(0, resource.getPath().indexOf(33)));
                            }
                            if (resource.getProtocol().equals("file")) {
                                return resource;
                            }
                            if (resource.getProtocol().equals("jrt")) {
                                String path = resource.getPath();
                                int iIndexOf = path.indexOf(47, 1);
                                if (iIndexOf == -1) {
                                    return resource;
                                }
                                return new URL("jrt:" + path.substring(0, iIndexOf));
                            }
                        } catch (MalformedURLException e12) {
                            throw new IllegalStateException("Unexpected URL: " + resource, e12);
                        }
                    }
                    Attributes.Name[] nameArr = ManifestReading.f416800c;
                    return null;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Object obj2 = NonSealing.f416802b;
                    return obj2.equals(obj2);
                }

                public final int hashCode() {
                    return NonSealing.f416802b.hashCode() + (getClass().hashCode() * 31);
                }
            }
        }

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public final Definition a(ClassLoader classLoader, String str, String str2) throws IOException {
            InputStream resourceAsStream = classLoader.getResourceAsStream("META-INF/MANIFEST.MF");
            try {
                if (resourceAsStream == null) {
                    return Definition.Trivial.f416789b;
                }
                try {
                    Manifest manifest = new Manifest(resourceAsStream);
                    HashMap map = new HashMap();
                    Attributes mainAttributes = manifest.getMainAttributes();
                    Attributes.Name[] nameArr = f416800c;
                    if (mainAttributes != null) {
                        for (Attributes.Name name : nameArr) {
                            map.put(name, mainAttributes.getValue(name));
                        }
                    }
                    Attributes attributes = manifest.getAttributes(str.replace('.', '/').concat("/"));
                    if (attributes != null) {
                        for (Attributes.Name name2 : nameArr) {
                            String value = attributes.getValue(name2);
                            if (value != null) {
                                map.put(name2, value);
                            }
                        }
                    }
                    Definition.a aVar = new Definition.a((String) map.get(Attributes.Name.SPECIFICATION_TITLE), (String) map.get(Attributes.Name.SPECIFICATION_VERSION), (String) map.get(Attributes.Name.SPECIFICATION_VENDOR), (String) map.get(Attributes.Name.IMPLEMENTATION_TITLE), (String) map.get(Attributes.Name.IMPLEMENTATION_VERSION), (String) map.get(Attributes.Name.IMPLEMENTATION_VENDOR), Boolean.parseBoolean((String) map.get(Attributes.Name.SEALED)) ? this.f416801b.a(classLoader, str2) : null);
                    resourceAsStream.close();
                    return aVar;
                } catch (Throwable th2) {
                    resourceAsStream.close();
                    throw th2;
                }
            } catch (IOException e12) {
                throw new IllegalStateException("Error while reading manifest file", e12);
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416801b.equals(((ManifestReading) obj).f416801b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416801b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements PackageDefinitionStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final NoOp f416804b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f416805c;

        static {
            NoOp noOp = new NoOp("INSTANCE", 0);
            f416804b = noOp;
            f416805c = new NoOp[]{noOp};
        }

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f416805c.clone();
        }

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public final Definition a(ClassLoader classLoader, String str, String str2) {
            return Definition.Undefined.f416791b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Trivial implements PackageDefinitionStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final Trivial f416806b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Trivial[] f416807c;

        static {
            Trivial trivial = new Trivial("INSTANCE", 0);
            f416806b = trivial;
            f416807c = new Trivial[]{trivial};
        }

        public Trivial() {
            throw null;
        }

        public static Trivial valueOf(String str) {
            return (Trivial) Enum.valueOf(Trivial.class, str);
        }

        public static Trivial[] values() {
            return (Trivial[]) f416807c.clone();
        }

        @Override // net.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public final Definition a(ClassLoader classLoader, String str, String str2) {
            return Definition.Trivial.f416789b;
        }
    }

    Definition a(ClassLoader classLoader, String str, String str2);
}
