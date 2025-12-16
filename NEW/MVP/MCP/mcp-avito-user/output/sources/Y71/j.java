package Y71;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Platform.java */
/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f19326a = Pattern.compile("1\\.8\\.0_(\\d+)(?:-ea)?(?:-b\\d+)?");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f19327b = Pattern.compile("1\\.8\\.0b\\d+_u(\\d+)");

    /* renamed from: c, reason: collision with root package name */
    public static final String f19328c = System.getProperty("java.specification.version");

    /* renamed from: d, reason: collision with root package name */
    public static final String f19329d = System.getProperty("java.runtime.version");

    /* renamed from: e, reason: collision with root package name */
    public static final String f19330e = System.getProperty("java.vm.vendor");

    /* renamed from: f, reason: collision with root package name */
    public static final String f19331f = System.getProperty("java.vm.version");

    /* renamed from: g, reason: collision with root package name */
    public static final String f19332g = System.getProperty("java.vm.name");

    /* renamed from: h, reason: collision with root package name */
    public static final String f19333h = System.getProperty("java.vm.info");

    /* renamed from: i, reason: collision with root package name */
    public static final String f19334i = System.getProperty("os.name");

    /* renamed from: j, reason: collision with root package name */
    public static final String f19335j = System.getProperty("os.version");

    public static String a() {
        StringBuilder sb2 = new StringBuilder("Java               : ");
        sb2.append(f19328c);
        sb2.append("\nJVM vendor name    : ");
        sb2.append(f19330e);
        sb2.append("\nJVM vendor version : ");
        sb2.append(f19331f);
        sb2.append("\nJVM name           : ");
        sb2.append(f19332g);
        sb2.append("\nJVM version        : ");
        sb2.append(f19329d);
        sb2.append("\nJVM info           : ");
        sb2.append(f19333h);
        sb2.append("\nOS name            : ");
        sb2.append(f19334i);
        sb2.append("\nOS version         : ");
        String strS = AK.c.s(sb2, f19335j, "\n");
        return System.getProperty("java.vendor", "").toLowerCase(Locale.US).contains("android") ? l.b("IMPORTANT INFORMATION FOR ANDROID USERS:", "", "The regular Byte Buddy mock makers cannot generate code on an Android VM!", "To resolve this, please use the 'mockito-android' dependency for your application:", "https://search.maven.org/artifact/org.mockito/mockito-android", "", strS) : strS;
    }

    public static boolean b() {
        String str = f19329d;
        if (str == null) {
            return false;
        }
        Matcher matcher = f19326a.matcher(str);
        if (!matcher.matches()) {
            Matcher matcher2 = f19327b.matcher(str);
            if (!matcher2.matches()) {
                return Pattern.compile("1\\.8\\.0-b\\d+").matcher(str).matches();
            }
            if (Integer.parseInt(matcher2.group(1)) >= 45) {
                return false;
            }
        } else if (Integer.parseInt(matcher.group(1)) >= 45) {
            return false;
        }
        return true;
    }
}
