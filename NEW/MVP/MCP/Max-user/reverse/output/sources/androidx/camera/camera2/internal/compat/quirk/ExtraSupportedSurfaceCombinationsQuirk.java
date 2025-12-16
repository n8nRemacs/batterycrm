package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.ctd;
import defpackage.cuc;
import defpackage.qb0;
import defpackage.vrf;
import defpackage.wrf;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements cuc {
    public static final vrf a;
    public static final vrf b;
    public static final HashSet c;
    public static final HashSet d;

    static {
        vrf vrfVar = new vrf();
        wrf wrfVar = wrf.VGA;
        ctd.k(2, wrfVar, 0L, vrfVar);
        wrf wrfVar2 = wrf.PREVIEW;
        ctd.k(1, wrfVar2, 0L, vrfVar);
        wrf wrfVar3 = wrf.MAXIMUM;
        ctd.k(2, wrfVar3, 0L, vrfVar);
        a = vrfVar;
        vrf vrfVar2 = new vrf();
        vrfVar2.a(new qb0(1, wrfVar2, 0L));
        vrfVar2.a(new qb0(1, wrfVar, 0L));
        ctd.k(2, wrfVar3, 0L, vrfVar2);
        b = vrfVar2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
