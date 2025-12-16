package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class qsb {
    public static final String[] d = {"android.permission.READ_CONTACTS"};
    public static final String[] e = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    public static final String[] f = {"android.permission.READ_CONTACTS"};
    public static final String[] g = {"android.permission.WRITE_CONTACTS"};
    public static final String[] h = {"android.permission.RECORD_AUDIO"};
    public static final String[] i = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
    public static final String[] j = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    public static final String[] k = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public static final String[] q;
    public final Context a;
    public final tzg b;
    public final ssb c;

    static {
        String[] strArr;
        String[] strArr2 = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Object[] objArrCopyOf = Arrays.copyOf(strArr2, 3);
            objArrCopyOf[2] = "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        l = new String[]{"android.permission.POST_NOTIFICATIONS"};
        String[] strArr3 = {"android.permission.CAMERA"};
        m = strArr3;
        if (i2 >= 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i2 >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else {
            d1e.a.getClass();
            strArr = c1e.c;
        }
        n = strArr;
        int length = strArr.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(strArr, length + 1);
        System.arraycopy(strArr3, 0, objArrCopyOf2, length, 1);
        o = (String[]) objArrCopyOf2;
        p = new String[]{"android.permission.USE_FULL_SCREEN_INTENT"};
        q = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    }

    public qsb(Context context, tzg tzgVar) {
        this.a = context;
        this.b = tzgVar;
        this.c = new ssb(context);
    }

    public static void f(qsb qsbVar, s2i s2iVar, String[] strArr, int i2, boolean z, int i3, int i4, int i5, yrb yrbVar, ffb ffbVar, int i6) {
        if ((i6 & 64) != 0) {
            i5 = pab.g;
        }
        if ((i6 & 256) != 0) {
            ffbVar = null;
        }
        if (z || o(s2iVar, strArr)) {
            s2iVar.c(strArr, i2, i4, i3, i5, yrbVar);
        } else if (ffbVar == null || !qsbVar.c.q(strArr)) {
            qsbVar.j(s2iVar, strArr, i2);
        } else {
            ffbVar.invoke();
        }
    }

    public static void g(qsb qsbVar, s2i s2iVar) {
        ssb ssbVar = qsbVar.c;
        String[] strArr = e;
        boolean z = !ssbVar.q(strArr);
        qsbVar.getClass();
        f(qsbVar, s2iVar, strArr, 156, z, i4d.permissions_contacts_request_rationale, i4d.permissions_contacts_request, i4d.permissions_dialog_yes, new wrb(y9b.e), null, 256);
    }

    public static void n(qsb qsbVar, s2i s2iVar, String[] strArr, int i2, int i3, int i4, int i5) {
        f(qsbVar, s2iVar, strArr, i2, false, i3, (i5 & 16) != 0 ? pab.a : i4, 0, null, null, 320);
    }

    public static boolean o(s2i s2iVar, String[] strArr) {
        for (String str : strArr) {
            if (s2iVar.f(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(String[] strArr, int[] iArr, String[] strArr2) {
        for (String str : strArr2) {
            int iY = ys.y(strArr, str);
            Integer numValueOf = Integer.valueOf(iY);
            if (iY < 0) {
                numValueOf = null;
            }
            if (numValueOf == null || iArr[numValueOf.intValue()] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void q(s2i s2iVar, String[] strArr, int[] iArr, int i2, int i3) {
        int i4;
        zs zsVar = new zs(2, new m2(2, strArr));
        int i5 = to8.i(we3.q(zsVar, 10));
        if (i5 < 16) {
            i5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
        Iterator it = zsVar.iterator();
        while (true) {
            z55 z55Var = (z55) it;
            boolean z = false;
            if (!z55Var.b.hasNext()) {
                break;
            }
            uj7 uj7Var = (uj7) z55Var.next();
            int i6 = uj7Var.a;
            String str = (String) uj7Var.b;
            if (iArr[i6] == 0) {
                z = true;
            }
            linkedHashMap.put(str, Boolean.valueOf(z));
        }
        Object obj = linkedHashMap.get("android.permission.READ_MEDIA_VIDEO");
        Boolean bool = Boolean.TRUE;
        if ((fni.a(obj, bool) && fni.a(linkedHashMap.get("android.permission.READ_MEDIA_IMAGES"), bool)) || fni.a(linkedHashMap.get("android.permission.READ_MEDIA_VISUAL_USER_SELECTED"), bool)) {
            return;
        }
        d1e.a.getClass();
        for (String str2 : c1e.c) {
            if (!fni.a(linkedHashMap.get("android.permission.READ_MEDIA_VIDEO"), Boolean.TRUE)) {
                s2i.g(s2iVar, i2, Integer.valueOf(i3), null, null, false, null, 60);
                return;
            }
        }
    }

    public static boolean r(s2i s2iVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3, wrb wrbVar) {
        if (p(strArr, iArr, strArr2)) {
            wqi.c("qsb", "all permissions granted", new Object[0]);
            return true;
        }
        if (o(s2iVar, strArr2)) {
            wqi.c("qsb", "some permissions denied", new Object[0]);
            return false;
        }
        s2i.g(s2iVar, i2, Integer.valueOf(i3), null, wrbVar, false, null, 48);
        wqi.c("qsb", "some permissions denied forever", new Object[0]);
        return false;
    }

    public static /* synthetic */ boolean s(qsb qsbVar, s2i s2iVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3, int i4) {
        int i5 = mvd.a;
        qsbVar.getClass();
        return r(s2iVar, strArr, iArr, strArr2, i2, i3, null);
    }

    public final boolean a(s2i s2iVar, boolean z) {
        if (!c(i)) {
            String[] strArr = h;
            if (z || !c(strArr)) {
                if (!z) {
                    j(s2iVar, strArr, 178);
                    return false;
                }
                String[] strArr2 = m;
                int length = strArr2.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, 1 + length);
                System.arraycopy(strArr2, 0, objArrCopyOf, 1, length);
                j(s2iVar, (String[]) objArrCopyOf, 178);
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        tzg tzgVar = this.b;
        if (!tzgVar.a) {
            if (Build.VERSION.SDK_INT >= 34) {
                return tzgVar.c.canUseFullScreenIntent();
            }
            return true;
        }
        Context context = (Context) tzgVar.b.b;
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), context.getPackageName())).intValue() == 0;
        } catch (Throwable th) {
            Throwable thA = kpd.a(new ipd(th));
            if (thA == null) {
                return true;
            }
            wqi.c(y6i.class.getName(), "Permission check error " + thA, new Object[0]);
            return true;
        }
    }

    public final boolean c(String[] strArr) {
        for (String str : strArr) {
            if (z7.b(this.a, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        return Build.VERSION.SDK_INT >= 33 ? c(l) : vma.a(new bna(this.a).b);
    }

    public final boolean e() {
        if (c(n)) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 34 ? c(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) : false;
    }

    public final void h(s2i s2iVar, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i2 < 33) {
            int i3 = i4d.permissions_post_notification_request_title;
            Integer numValueOf = Integer.valueOf(i4d.permissions_post_notification_request_rationale);
            String str = ap7.a;
            s2i.g(s2iVar, i3, numValueOf, ap7.d(context), new xrb(aab.a), false, null, 48);
            return;
        }
        String[] strArr = l;
        if (o(s2iVar, strArr) || !this.c.q(strArr)) {
            wqi.c("qsb", "rationalePermissionRequest for post notification permission", new Object[0]);
            s2iVar.c(strArr, 177, i4d.permissions_post_notification_request_title, i4d.permissions_post_notification_request_rationale, i4d.permissions_post_notification_request_positive_button, new xrb(aab.a));
        } else if (z) {
            wqi.c("qsb", "Force show settings for post notification permission", new Object[0]);
            int i4 = i4d.permissions_post_notification_request_title;
            Integer numValueOf2 = Integer.valueOf(i4d.permissions_post_notification_request_rationale);
            String str2 = ap7.a;
            s2i.g(s2iVar, i4, numValueOf2, ap7.d(context), new xrb(aab.a), false, null, 48);
        }
    }

    public final void i(s2i s2iVar, int i2) {
        n(this, s2iVar, h, 160, i2, i4d.permissions_audio_title, 32);
    }

    public final void j(s2i s2iVar, String[] strArr, int i2) {
        s2iVar.e(i2, strArr);
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((bwf) this.c.c).getValue()).edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str + "_req", true);
        }
        editorEdit.apply();
    }

    public final void k(s2i s2iVar) {
        n(this, s2iVar, m, 158, i4d.permissions_camera_request_photo, 0, 48);
    }

    public final void l(s2i s2iVar) {
        j(s2iVar, n, 157);
    }

    public final void m(s2i s2iVar) {
        n(this, s2iVar, m, 159, i4d.permissions_camera_request_video, 0, 48);
    }
}
