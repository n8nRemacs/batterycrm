package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* loaded from: classes.dex */
public final class a89 {
    public static final boolean c = f89.b;
    public Context a;
    public ContentResolver b;

    public final boolean a(e89 e89Var, String str) {
        Context context = this.a;
        int i = e89Var.b;
        return i < 0 ? context.getPackageManager().checkPermission(str, e89Var.a) == 0 : context.checkPermission(str, i, e89Var.c) == 0;
    }
}
