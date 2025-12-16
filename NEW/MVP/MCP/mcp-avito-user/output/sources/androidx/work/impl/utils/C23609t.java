package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PackageManagerHelper.java */
/* renamed from: androidx.work.impl.utils.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23609t {
    static {
        androidx.work.G.b("PackageManagerHelper");
    }

    public static void a(@j.N Context context, @j.N Class<?> cls, boolean z12) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z13 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z13 = true;
            }
            if (z12 != z13) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z12 ? 1 : 2, 1);
                androidx.work.G.a().getClass();
            } else {
                androidx.work.G gA2 = androidx.work.G.a();
                "Skipping component enablement for ".concat(cls.getName());
                gA2.getClass();
            }
        } catch (Exception unused) {
            androidx.work.G.a().getClass();
        }
    }
}
