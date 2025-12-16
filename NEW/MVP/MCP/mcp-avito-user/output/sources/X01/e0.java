package x01;

/* loaded from: classes7.dex */
public abstract class e0 {
    public static String a(String str, String str2) {
        return "_default_config_tag".equals(str) ? str : androidx.appcompat.app.r.r(str, "-", str2);
    }

    public static String b(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return androidx.camera.camera2.internal.G.f("_default_config_tag#", str3);
        }
        return str + "-" + str2 + "#" + str3;
    }
}
