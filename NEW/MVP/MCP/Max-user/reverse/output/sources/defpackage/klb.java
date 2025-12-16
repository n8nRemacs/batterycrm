package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class klb {
    public static final String a = cei.m("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            cei ceiVarG = cei.g();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            ceiVarG.c(str, sb.toString());
        } catch (Exception e) {
            cei ceiVarG2 = cei.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            ceiVarG2.d(str, sb2.toString(), e);
        }
    }
}
