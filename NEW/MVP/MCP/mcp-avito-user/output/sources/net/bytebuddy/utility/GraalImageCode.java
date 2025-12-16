package net.bytebuddy.utility;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: classes7.dex */
public final class GraalImageCode {

    /* renamed from: d, reason: collision with root package name */
    public static final GraalImageCode f418853d;

    /* renamed from: e, reason: collision with root package name */
    public static final GraalImageCode f418854e;

    /* renamed from: f, reason: collision with root package name */
    public static final GraalImageCode f418855f;

    /* renamed from: g, reason: collision with root package name */
    public static final GraalImageCode f418856g;

    /* renamed from: h, reason: collision with root package name */
    public static final GraalImageCode f418857h;

    /* renamed from: i, reason: collision with root package name */
    @net.bytebuddy.utility.nullability.b
    public static GraalImageCode f418858i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ GraalImageCode[] f418859j;

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f418860k;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f418861b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f418862c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ImageCodeContextAction implements PrivilegedAction<GraalImageCode> {

        /* renamed from: b, reason: collision with root package name */
        public static final ImageCodeContextAction f418863b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ImageCodeContextAction[] f418864c;

        static {
            ImageCodeContextAction imageCodeContextAction = new ImageCodeContextAction("INSTANCE", 0);
            f418863b = imageCodeContextAction;
            f418864c = new ImageCodeContextAction[]{imageCodeContextAction};
        }

        public ImageCodeContextAction() {
            throw null;
        }

        public static ImageCodeContextAction valueOf(String str) {
            return (ImageCodeContextAction) Enum.valueOf(ImageCodeContextAction.class, str);
        }

        public static ImageCodeContextAction[] values() {
            return (ImageCodeContextAction[]) f418864c.clone();
        }

        @Override // java.security.PrivilegedAction
        public final GraalImageCode run() {
            try {
                Method method = Class.forName("java.lang.management.ManagementFactory").getMethod("getRuntimeMXBean", new Class[0]);
                Iterator it = ((List) method.getReturnType().getMethod("getInputArguments", new Class[0]).invoke(method.invoke(null, new Object[0]), new Object[0])).iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).startsWith("-agentlib:native-image-agent")) {
                        return GraalImageCode.f418853d;
                    }
                }
            } catch (Throwable unused) {
            }
            return GraalImageCode.f418857h;
        }
    }

    static {
        try {
            Class.forName("java.security.AccessController", false, null);
            f418860k = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f418860k = false;
        } catch (SecurityException unused2) {
            f418860k = true;
        }
        GraalImageCode graalImageCode = new GraalImageCode("AGENT", 0, true, false);
        f418853d = graalImageCode;
        GraalImageCode graalImageCode2 = new GraalImageCode("BUILD", 1, true, false);
        f418854e = graalImageCode2;
        GraalImageCode graalImageCode3 = new GraalImageCode("RUNTIME", 2, true, true);
        f418855f = graalImageCode3;
        GraalImageCode graalImageCode4 = new GraalImageCode(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, false, false);
        f418856g = graalImageCode4;
        GraalImageCode graalImageCode5 = new GraalImageCode("NONE", 4, false, false);
        f418857h = graalImageCode5;
        f418859j = new GraalImageCode[]{graalImageCode, graalImageCode2, graalImageCode3, graalImageCode4, graalImageCode5};
    }

    public GraalImageCode(String str, int i12, boolean z12, boolean z13) {
        this.f418861b = z12;
        this.f418862c = z13;
    }

    @SuppressFBWarnings(justification = "This behaviour is intended to avoid early binding in native images.", value = {"LI_LAZY_INIT_STATIC", "NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public static GraalImageCode a() {
        GraalImageCode graalImageCode = f418858i;
        if (graalImageCode == null) {
            net.bytebuddy.utility.privilege.b bVar = new net.bytebuddy.utility.privilege.b("org.graalvm.nativeimage.imagecode");
            boolean z12 = f418860k;
            String str = (String) (z12 ? AccessController.doPrivileged(bVar) : bVar.run());
            if (str == null) {
                net.bytebuddy.utility.privilege.b bVar2 = new net.bytebuddy.utility.privilege.b("java.vm.vendor");
                String str2 = (String) (z12 ? AccessController.doPrivileged(bVar2) : bVar2.run());
                if (str2 == null || !str2.toLowerCase(Locale.US).contains("graalvm")) {
                    graalImageCode = f418857h;
                } else {
                    ImageCodeContextAction imageCodeContextAction = ImageCodeContextAction.f418863b;
                    graalImageCode = (GraalImageCode) (z12 ? AccessController.doPrivileged(imageCodeContextAction) : imageCodeContextAction.run());
                }
            } else {
                graalImageCode = str.equalsIgnoreCase("agent") ? f418853d : str.equalsIgnoreCase("runtime") ? f418855f : str.equalsIgnoreCase("buildtime") ? f418854e : f418856g;
            }
            f418858i = graalImageCode;
        }
        return graalImageCode;
    }

    public static GraalImageCode valueOf(String str) {
        return (GraalImageCode) Enum.valueOf(GraalImageCode.class, str);
    }

    public static GraalImageCode[] values() {
        return (GraalImageCode[]) f418859j.clone();
    }

    public final void b(Object[] objArr, Comparator comparator) {
        if (this.f418861b) {
            Arrays.sort(objArr, comparator);
        }
    }
}
