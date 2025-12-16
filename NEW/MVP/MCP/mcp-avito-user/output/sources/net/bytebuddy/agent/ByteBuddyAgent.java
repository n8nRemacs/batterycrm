package net.bytebuddy.agent;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import net.bytebuddy.agent.VirtualMachine;

/* loaded from: classes8.dex */
public class ByteBuddyAgent {

    /* renamed from: a, reason: collision with root package name */
    public static final AttachmentTypeEvaluator f415335a = (AttachmentTypeEvaluator) b(AttachmentTypeEvaluator.InstallationAction.f415361b);

    public interface AgentProvider {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForByteBuddyAgent implements AgentProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final ForByteBuddyAgent f415336b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForByteBuddyAgent[] f415337c;

            static {
                ForByteBuddyAgent forByteBuddyAgent = new ForByteBuddyAgent("INSTANCE", 0);
                f415336b = forByteBuddyAgent;
                f415337c = new ForByteBuddyAgent[]{forByteBuddyAgent};
            }

            public ForByteBuddyAgent() {
                throw null;
            }

            public static File a() throws IOException {
                InputStream resourceAsStream = b.class.getResourceAsStream("/" + b.class.getName().replace('.', '/') + ".class");
                if (resourceAsStream == null) {
                    throw new IllegalStateException("Cannot locate class file for Byte Buddy installer");
                }
                try {
                    File fileCreateTempFile = File.createTempFile("byteBuddyAgent", ".jar");
                    fileCreateTempFile.deleteOnExit();
                    Manifest manifest = new Manifest();
                    manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
                    manifest.getMainAttributes().put(new Attributes.Name("Agent-Class"), b.class.getName());
                    Attributes mainAttributes = manifest.getMainAttributes();
                    Attributes.Name name = new Attributes.Name("Can-Redefine-Classes");
                    Boolean bool = Boolean.TRUE;
                    mainAttributes.put(name, bool.toString());
                    manifest.getMainAttributes().put(new Attributes.Name("Can-Retransform-Classes"), bool.toString());
                    manifest.getMainAttributes().put(new Attributes.Name("Can-Set-Native-Method-Prefix"), bool.toString());
                    JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(fileCreateTempFile), manifest);
                    try {
                        jarOutputStream.putNextEntry(new JarEntry(b.class.getName().replace('.', '/') + ".class"));
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i12 = resourceAsStream.read(bArr);
                            if (i12 == -1) {
                                jarOutputStream.closeEntry();
                                jarOutputStream.close();
                                return fileCreateTempFile;
                            }
                            jarOutputStream.write(bArr, 0, i12);
                        }
                    } catch (Throwable th2) {
                        jarOutputStream.close();
                        throw th2;
                    }
                } finally {
                    resourceAsStream.close();
                }
            }

            @net.bytebuddy.agent.utility.nullability.b
            public static File c() throws IOException {
                File file;
                ProtectionDomain protectionDomain = b.class.getProtectionDomain();
                if (Boolean.getBoolean("net.bytebuddy.agent.latent")) {
                    AttachmentTypeEvaluator attachmentTypeEvaluator = ByteBuddyAgent.f415335a;
                    return null;
                }
                if (protectionDomain == null) {
                    AttachmentTypeEvaluator attachmentTypeEvaluator2 = ByteBuddyAgent.f415335a;
                    return null;
                }
                CodeSource codeSource = protectionDomain.getCodeSource();
                if (codeSource == null) {
                    AttachmentTypeEvaluator attachmentTypeEvaluator3 = ByteBuddyAgent.f415335a;
                    return null;
                }
                URL location = codeSource.getLocation();
                if (!location.getProtocol().equals("file")) {
                    AttachmentTypeEvaluator attachmentTypeEvaluator4 = ByteBuddyAgent.f415335a;
                    return null;
                }
                try {
                    file = new File(location.toURI());
                } catch (URISyntaxException unused) {
                    file = new File(location.getPath());
                }
                if (!file.isFile() || !file.canRead()) {
                    AttachmentTypeEvaluator attachmentTypeEvaluator5 = ByteBuddyAgent.f415335a;
                    return null;
                }
                JarInputStream jarInputStream = new JarInputStream(new FileInputStream(file));
                try {
                    Manifest manifest = jarInputStream.getManifest();
                    if (manifest == null) {
                        AttachmentTypeEvaluator attachmentTypeEvaluator6 = ByteBuddyAgent.f415335a;
                        return null;
                    }
                    Attributes mainAttributes = manifest.getMainAttributes();
                    if (mainAttributes == null) {
                        AttachmentTypeEvaluator attachmentTypeEvaluator7 = ByteBuddyAgent.f415335a;
                        return null;
                    }
                    if (b.class.getName().equals(mainAttributes.getValue("Agent-Class")) && Boolean.parseBoolean(mainAttributes.getValue("Can-Redefine-Classes")) && Boolean.parseBoolean(mainAttributes.getValue("Can-Retransform-Classes")) && Boolean.parseBoolean(mainAttributes.getValue("Can-Set-Native-Method-Prefix"))) {
                        return file;
                    }
                    AttachmentTypeEvaluator attachmentTypeEvaluator8 = ByteBuddyAgent.f415335a;
                    return null;
                } finally {
                    jarInputStream.close();
                }
            }

            public static ForByteBuddyAgent valueOf(String str) {
                return (ForByteBuddyAgent) Enum.valueOf(ForByteBuddyAgent.class, str);
            }

            public static ForByteBuddyAgent[] values() {
                return (ForByteBuddyAgent[]) f415337c.clone();
            }

            public final File b() {
                try {
                    File fileC = c();
                    return fileC == null ? a() : fileC;
                } catch (Exception unused) {
                    return a();
                }
            }
        }

        public static class a implements AgentProvider {
        }
    }

    @SuppressFBWarnings(justification = "Safe initialization is implied", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
    public interface AttachmentProvider {

        /* renamed from: w2, reason: collision with root package name */
        public static final a f415338w2 = new a(ForModularizedVm.f415349b, ForJ9Vm.f415347b, ForStandardToolsJarVm.JVM_ROOT, ForStandardToolsJarVm.JDK_ROOT, ForStandardToolsJarVm.MACINTOSH, ForUserDefinedToolsJar.f415356b, ForEmulatedAttachment.f415345b);

        public interface Accessor {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Unavailable implements Accessor {

                /* renamed from: b, reason: collision with root package name */
                public static final Unavailable f415339b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Unavailable[] f415340c;

                static {
                    Unavailable unavailable = new Unavailable("INSTANCE", 0);
                    f415339b = unavailable;
                    f415340c = new Unavailable[]{unavailable};
                }

                public Unavailable() {
                    throw null;
                }

                public static Unavailable valueOf(String str) {
                    return (Unavailable) Enum.valueOf(Unavailable.class, str);
                }

                public static Unavailable[] values() {
                    return (Unavailable[]) f415340c.clone();
                }

                @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                public final a a() {
                    throw new IllegalStateException("Cannot read the virtual machine type for an unavailable accessor");
                }

                @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                public final boolean b() {
                    return false;
                }

                @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                public final Class<?> c() {
                    throw new IllegalStateException("Cannot read the virtual machine type for an unavailable accessor");
                }

                @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                public final boolean d() {
                    throw new IllegalStateException("Cannot read the virtual machine type for an unavailable accessor");
                }
            }

            public static class a {

                /* renamed from: a, reason: collision with root package name */
                public final String f415341a;

                /* renamed from: b, reason: collision with root package name */
                public final List<File> f415342b;

                public a(String str, List<File> list) {
                    this.f415341a = str;
                    this.f415342b = list;
                }
            }

            public static abstract class b implements Accessor {

                /* renamed from: b, reason: collision with root package name */
                public final Class<?> f415343b;

                public static class a extends b {
                    public a() {
                        throw null;
                    }

                    @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                    public final a a() {
                        throw new IllegalStateException("Cannot apply external attachment");
                    }

                    @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                    public final boolean d() {
                        return false;
                    }
                }

                /* renamed from: net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Accessor$b$b, reason: collision with other inner class name */
                public static class C11870b extends b {

                    /* renamed from: c, reason: collision with root package name */
                    public final List<File> f415344c;

                    public C11870b(Class<?> cls, List<File> list) {
                        super(cls);
                        this.f415344c = list;
                    }

                    @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                    public final a a() {
                        return new a(this.f415343b.getName(), this.f415344c);
                    }

                    @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                    public final boolean d() {
                        return true;
                    }
                }

                public b(Class<?> cls) {
                    this.f415343b = cls;
                }

                public static Accessor e(@net.bytebuddy.agent.utility.nullability.b ClassLoader classLoader, File... fileArr) {
                    try {
                        return new C11870b(Class.forName("com.sun.tools.attach.VirtualMachine", false, classLoader), Arrays.asList(fileArr));
                    } catch (ClassNotFoundException unused) {
                        return Unavailable.f415339b;
                    }
                }

                @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                public final boolean b() {
                    return true;
                }

                @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor
                public final Class<?> c() {
                    return this.f415343b;
                }
            }

            a a();

            boolean b();

            Class<?> c();

            boolean d();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForEmulatedAttachment implements AttachmentProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final ForEmulatedAttachment f415345b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForEmulatedAttachment[] f415346c;

            static {
                ForEmulatedAttachment forEmulatedAttachment = new ForEmulatedAttachment("INSTANCE", 0);
                f415345b = forEmulatedAttachment;
                f415346c = new ForEmulatedAttachment[]{forEmulatedAttachment};
            }

            public ForEmulatedAttachment() {
                throw null;
            }

            public static ForEmulatedAttachment valueOf(String str) {
                return (ForEmulatedAttachment) Enum.valueOf(ForEmulatedAttachment.class, str);
            }

            public static ForEmulatedAttachment[] values() {
                return (ForEmulatedAttachment[]) f415346c.clone();
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider
            public final Accessor a() {
                try {
                    return new Accessor.b.a((Class) ByteBuddyAgent.b(VirtualMachine.Resolver.f415372b));
                } catch (Throwable unused) {
                    return Accessor.Unavailable.f415339b;
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForJ9Vm implements AttachmentProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final ForJ9Vm f415347b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForJ9Vm[] f415348c;

            static {
                ForJ9Vm forJ9Vm = new ForJ9Vm("INSTANCE", 0);
                f415347b = forJ9Vm;
                f415348c = new ForJ9Vm[]{forJ9Vm};
            }

            public ForJ9Vm() {
                throw null;
            }

            public static ForJ9Vm valueOf(String str) {
                return (ForJ9Vm) Enum.valueOf(ForJ9Vm.class, str);
            }

            public static ForJ9Vm[] values() {
                return (ForJ9Vm[]) f415348c.clone();
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider
            public final Accessor a() {
                try {
                    return new Accessor.b.C11870b(ClassLoader.getSystemClassLoader().loadClass("com.ibm.tools.attach.VirtualMachine"), Collections.emptyList());
                } catch (ClassNotFoundException unused) {
                    return Accessor.Unavailable.f415339b;
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForModularizedVm implements AttachmentProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final ForModularizedVm f415349b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForModularizedVm[] f415350c;

            static {
                ForModularizedVm forModularizedVm = new ForModularizedVm("INSTANCE", 0);
                f415349b = forModularizedVm;
                f415350c = new ForModularizedVm[]{forModularizedVm};
            }

            public ForModularizedVm() {
                throw null;
            }

            public static ForModularizedVm valueOf(String str) {
                return (ForModularizedVm) Enum.valueOf(ForModularizedVm.class, str);
            }

            public static ForModularizedVm[] values() {
                return (ForModularizedVm[]) f415350c.clone();
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider
            public final Accessor a() {
                return Accessor.b.e(ClassLoader.getSystemClassLoader(), new File[0]);
            }
        }

        public enum ForStandardToolsJarVm implements AttachmentProvider {
            JVM_ROOT("../lib/tools.jar"),
            JDK_ROOT("lib/tools.jar"),
            MACINTOSH("../Classes/classes.jar");


            /* renamed from: b, reason: collision with root package name */
            public final String f415355b;

            ForStandardToolsJarVm(String str) {
                this.f415355b = str;
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider
            @SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
            public final Accessor a() {
                File file = new File(System.getProperty("java.home"), this.f415355b);
                try {
                    if (!file.isFile() || !file.canRead()) {
                        return Accessor.Unavailable.f415339b;
                    }
                    URL[] urlArr = {file.toURI().toURL()};
                    AttachmentTypeEvaluator attachmentTypeEvaluator = ByteBuddyAgent.f415335a;
                    return Accessor.b.e(new URLClassLoader(urlArr, null), file);
                } catch (MalformedURLException unused) {
                    throw new IllegalStateException("Could not represent " + file + " as URL");
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForUserDefinedToolsJar implements AttachmentProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final ForUserDefinedToolsJar f415356b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForUserDefinedToolsJar[] f415357c;

            static {
                ForUserDefinedToolsJar forUserDefinedToolsJar = new ForUserDefinedToolsJar("INSTANCE", 0);
                f415356b = forUserDefinedToolsJar;
                f415357c = new ForUserDefinedToolsJar[]{forUserDefinedToolsJar};
            }

            public ForUserDefinedToolsJar() {
                throw null;
            }

            public static ForUserDefinedToolsJar valueOf(String str) {
                return (ForUserDefinedToolsJar) Enum.valueOf(ForUserDefinedToolsJar.class, str);
            }

            public static ForUserDefinedToolsJar[] values() {
                return (ForUserDefinedToolsJar[]) f415357c.clone();
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider
            @SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
            public final Accessor a() {
                String property = System.getProperty("net.bytebuddy.agent.toolsjar");
                if (property == null) {
                    return Accessor.Unavailable.f415339b;
                }
                File file = new File(property);
                try {
                    URL[] urlArr = {file.toURI().toURL()};
                    AttachmentTypeEvaluator attachmentTypeEvaluator = ByteBuddyAgent.f415335a;
                    return Accessor.b.e(new URLClassLoader(urlArr, null), file);
                } catch (MalformedURLException unused) {
                    throw new IllegalStateException("Could not represent " + file + " as URL");
                }
            }
        }

        public static class a implements AttachmentProvider {

            /* renamed from: b, reason: collision with root package name */
            public final ArrayList f415358b;

            public a() {
                throw null;
            }

            public a(AttachmentProvider... attachmentProviderArr) {
                List<AttachmentProvider> listAsList = Arrays.asList(attachmentProviderArr);
                this.f415358b = new ArrayList();
                for (AttachmentProvider attachmentProvider : listAsList) {
                    if (attachmentProvider instanceof a) {
                        this.f415358b.addAll(((a) attachmentProvider).f415358b);
                    } else {
                        this.f415358b.add(attachmentProvider);
                    }
                }
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider
            public final Accessor a() {
                Iterator it = this.f415358b.iterator();
                while (it.hasNext()) {
                    Accessor accessorA = ((AttachmentProvider) it.next()).a();
                    if (accessorA.b()) {
                        return accessorA;
                    }
                }
                return Accessor.Unavailable.f415339b;
            }
        }

        Accessor a();
    }

    public interface AttachmentTypeEvaluator {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Disabled implements AttachmentTypeEvaluator {

            /* renamed from: b, reason: collision with root package name */
            public static final Disabled f415359b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Disabled[] f415360c;

            static {
                Disabled disabled = new Disabled("INSTANCE", 0);
                f415359b = disabled;
                f415360c = new Disabled[]{disabled};
            }

            public Disabled() {
                throw null;
            }

            public static Disabled valueOf(String str) {
                return (Disabled) Enum.valueOf(Disabled.class, str);
            }

            public static Disabled[] values() {
                return (Disabled[]) f415360c.clone();
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentTypeEvaluator
            public final boolean a(String str) {
                return false;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class InstallationAction implements PrivilegedAction<AttachmentTypeEvaluator> {

            /* renamed from: b, reason: collision with root package name */
            public static final InstallationAction f415361b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ InstallationAction[] f415362c;

            static {
                InstallationAction installationAction = new InstallationAction("INSTANCE", 0);
                f415361b = installationAction;
                f415362c = new InstallationAction[]{installationAction};
            }

            public InstallationAction() {
                throw null;
            }

            public static InstallationAction valueOf(String str) {
                return (InstallationAction) Enum.valueOf(InstallationAction.class, str);
            }

            public static InstallationAction[] values() {
                return (InstallationAction[]) f415362c.clone();
            }

            @Override // java.security.PrivilegedAction
            @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public final AttachmentTypeEvaluator run() {
                Disabled disabled = Disabled.f415359b;
                try {
                    return Boolean.getBoolean("jdk.attach.allowAttachSelf") ? disabled : new a(Class.forName("java.lang.ProcessHandle").getMethod("current", new Class[0]), Class.forName("java.lang.ProcessHandle").getMethod("pid", new Class[0]));
                } catch (Exception unused) {
                    return disabled;
                }
            }
        }

        public static class a implements AttachmentTypeEvaluator {

            /* renamed from: b, reason: collision with root package name */
            public final Method f415363b;

            /* renamed from: c, reason: collision with root package name */
            public final Method f415364c;

            public a(Method method, Method method2) {
                this.f415363b = method;
                this.f415364c = method2;
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.AttachmentTypeEvaluator
            public final boolean a(String str) {
                try {
                    return this.f415364c.invoke(this.f415363b.invoke(null, new Object[0]), new Object[0]).toString().equals(str);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException("Cannot access Java 9 process API", e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException("Error when accessing Java 9 process API", e13.getTargetException());
                }
            }
        }

        boolean a(String str);
    }

    public interface ProcessProvider {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForCurrentVm implements ProcessProvider {

            /* renamed from: c, reason: collision with root package name */
            public static final ForCurrentVm f415365c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ ForCurrentVm[] f415366d;

            /* renamed from: b, reason: collision with root package name */
            public final ProcessProvider f415367b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ForLegacyVm implements ProcessProvider {

                /* renamed from: b, reason: collision with root package name */
                public static final ForLegacyVm f415368b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ ForLegacyVm[] f415369c;

                static {
                    ForLegacyVm forLegacyVm = new ForLegacyVm("INSTANCE", 0);
                    f415368b = forLegacyVm;
                    f415369c = new ForLegacyVm[]{forLegacyVm};
                }

                public ForLegacyVm() {
                    throw null;
                }

                public static ForLegacyVm valueOf(String str) {
                    return (ForLegacyVm) Enum.valueOf(ForLegacyVm.class, str);
                }

                public static ForLegacyVm[] values() {
                    return (ForLegacyVm[]) f415369c.clone();
                }

                @Override // net.bytebuddy.agent.ByteBuddyAgent.ProcessProvider
                @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                public final String a() throws NoSuchMethodException, SecurityException {
                    try {
                        Method method = Class.forName("java.lang.management.ManagementFactory").getMethod("getRuntimeMXBean", new Class[0]);
                        String str = (String) method.getReturnType().getMethod("getName", new Class[0]).invoke(method.invoke(null, new Object[0]), new Object[0]);
                        int iIndexOf = str.indexOf(64);
                        if (iIndexOf != -1) {
                            return str.substring(0, iIndexOf);
                        }
                        throw new IllegalStateException("Cannot extract process id from runtime management bean");
                    } catch (Exception e12) {
                        throw new IllegalStateException("Failed to access VM name via management factory", e12);
                    }
                }
            }

            public static class a implements ProcessProvider {

                /* renamed from: b, reason: collision with root package name */
                public final Method f415370b;

                /* renamed from: c, reason: collision with root package name */
                public final Method f415371c;

                public a(Method method, Method method2) {
                    this.f415370b = method;
                    this.f415371c = method2;
                }

                @Override // net.bytebuddy.agent.ByteBuddyAgent.ProcessProvider
                public final String a() {
                    try {
                        return this.f415371c.invoke(this.f415370b.invoke(null, new Object[0]), new Object[0]).toString();
                    } catch (IllegalAccessException e12) {
                        throw new IllegalStateException("Cannot access Java 9 process API", e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException("Error when accessing Java 9 process API", e13.getTargetException());
                    }
                }
            }

            static {
                ForCurrentVm forCurrentVm = new ForCurrentVm();
                f415365c = forCurrentVm;
                f415366d = new ForCurrentVm[]{forCurrentVm};
            }

            public ForCurrentVm() {
                ProcessProvider aVar;
                try {
                    aVar = new a(Class.forName("java.lang.ProcessHandle").getMethod("current", new Class[0]), Class.forName("java.lang.ProcessHandle").getMethod("pid", new Class[0]));
                } catch (Exception unused) {
                    aVar = ForLegacyVm.f415368b;
                }
                this.f415367b = aVar;
            }

            public static ForCurrentVm valueOf(String str) {
                return (ForCurrentVm) Enum.valueOf(ForCurrentVm.class, str);
            }

            public static ForCurrentVm[] values() {
                return (ForCurrentVm[]) f415366d.clone();
            }

            @Override // net.bytebuddy.agent.ByteBuddyAgent.ProcessProvider
            public final String a() {
                return this.f415367b.a();
            }
        }

        String a();
    }

    public ByteBuddyAgent() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    @net.bytebuddy.agent.utility.nullability.b
    @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
    public static Instrumentation a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(b.class.getName(), true, ClassLoader.getSystemClassLoader());
            try {
                Class<?> cls2 = Class.forName("java.lang.Module");
                Method method = Class.class.getMethod("getModule", new Class[0]);
                Object objInvoke = method.invoke(ByteBuddyAgent.class, new Object[0]);
                Object objInvoke2 = method.invoke(cls, new Object[0]);
                if (!((Boolean) cls2.getMethod("canRead", cls2).invoke(objInvoke, objInvoke2)).booleanValue()) {
                    cls2.getMethod("addReads", cls2).invoke(objInvoke, objInvoke2);
                }
            } catch (ClassNotFoundException unused) {
            }
            return (Instrumentation) Class.forName(b.class.getName(), true, ClassLoader.getSystemClassLoader()).getMethod("getInstrumentation", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static <T> T b(PrivilegedAction<T> privilegedAction) {
        try {
            return (T) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedAction.class).invoke(null, privilegedAction);
        } catch (ClassNotFoundException unused) {
            return privilegedAction.run();
        } catch (IllegalAccessException e12) {
            throw new IllegalStateException("Failed to access access controller", e12);
        } catch (NoSuchMethodException e13) {
            throw new IllegalStateException("Failed to resolve well-known access controller method", e13);
        } catch (InvocationTargetException e14) {
            throw new IllegalStateException("Failed to invoke access controller", e14.getTargetException());
        }
    }

    public static Instrumentation c() {
        Instrumentation instrumentationA;
        AttachmentProvider.a aVar = AttachmentProvider.f415338w2;
        ProcessProvider.ForCurrentVm forCurrentVm = ProcessProvider.ForCurrentVm.f415365c;
        synchronized (ByteBuddyAgent.class) {
            instrumentationA = a();
            if (instrumentationA == null) {
                d(aVar, forCurrentVm.f415367b.a());
                instrumentationA = a();
                if (instrumentationA == null) {
                    throw new IllegalStateException("The Byte Buddy agent is not initialized or unavailable");
                }
            }
        }
        return instrumentationA;
    }

    public static void d(AttachmentProvider.a aVar, String str) throws Throwable {
        AgentProvider.ForByteBuddyAgent forByteBuddyAgent = AgentProvider.ForByteBuddyAgent.f415336b;
        AttachmentProvider.Accessor accessorA = aVar.a();
        if (!accessorA.b()) {
            throw new IllegalStateException("No compatible attachment provider is available");
        }
        try {
            if (accessorA.d() && f415335a.a(str)) {
                e(accessorA.a(), str, forByteBuddyAgent.b());
            } else {
                a.a(str, forByteBuddyAgent.b().getAbsolutePath(), accessorA.c());
            }
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception e13) {
            throw new IllegalStateException("Error during attachment using: " + aVar, e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6 A[Catch: all -> 0x00f9, LOOP:0: B:47:0x00e0->B:49:0x00e6, LOOP_END, TryCatch #2 {all -> 0x00f9, blocks: (B:43:0x00cb, B:46:0x00d3, B:47:0x00e0, B:49:0x00e6, B:52:0x00fd, B:56:0x0133, B:63:0x0172, B:64:0x0179), top: B:74:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172 A[Catch: all -> 0x00f9, TRY_ENTER, TryCatch #2 {all -> 0x00f9, blocks: (B:43:0x00cb, B:46:0x00d3, B:47:0x00e0, B:49:0x00e6, B:52:0x00fd, B:56:0x0133, B:63:0x0172, B:64:0x0179), top: B:74:0x00cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(net.bytebuddy.agent.ByteBuddyAgent.AttachmentProvider.Accessor.a r13, java.lang.String r14, java.io.File r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.agent.ByteBuddyAgent.e(net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Accessor$a, java.lang.String, java.io.File):void");
    }
}
