package defpackage;

import android.util.LogPrinter;
import android.view.View;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public class cy6 {
    public int a;
    public int b;
    public int c;

    public cy6() {
        c();
    }

    public int a(hy6 hy6Var, View view, bxe bxeVar, int i, boolean z) {
        return this.a - bxeVar.a(view, i, hy6Var.getLayoutMode());
    }

    public void b(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    public void c() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 2;
    }

    public int d(boolean z) {
        if (!z) {
            int i = this.c;
            LogPrinter logPrinter = hy6.v0;
            if ((i & 2) != 0) {
                return BuildConfig.FILE_LENGTH_TO_UPLOAD;
            }
        }
        return this.a + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds{before=");
        sb.append(this.a);
        sb.append(", after=");
        return xc0.h(sb, this.b, '}');
    }
}
