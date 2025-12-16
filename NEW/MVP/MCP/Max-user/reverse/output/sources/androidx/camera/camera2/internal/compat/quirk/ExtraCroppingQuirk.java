package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import defpackage.az1;
import defpackage.cuc;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements cuc {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    public static Size e(int i) {
        if (!f()) {
            return null;
        }
        int iV = az1.v(i);
        if (iV == 0) {
            return new Size(1920, 1080);
        }
        if (iV == 1) {
            return new Size(1280, 720);
        }
        if (iV != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean f() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        HashMap map = a;
        if (!map.containsKey(upperCase)) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
