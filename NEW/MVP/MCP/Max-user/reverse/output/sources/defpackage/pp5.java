package defpackage;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class pp5 implements ch8 {
    public static final pp5 b;
    public int a;

    static {
        pp5 pp5Var = new pp5();
        pp5Var.a = 5;
        b = pp5Var;
    }

    public static void b(String str, Throwable th, int i, String str2) {
        String strConcat = "unknown:".concat(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('\n');
        sb.append(th == null ? "" : Log.getStackTraceString(th));
        Log.println(i, strConcat, sb.toString());
    }

    @Override // defpackage.ch8
    public final void a(IOException iOException) {
        b("HeifExifUtil", iOException, 3, "Failed reading Heif Exif orientation -> ignoring");
    }

    @Override // defpackage.ch8
    public final void c(String str, String str2) {
        Log.println(6, "unknown:".concat(str), str2);
    }

    @Override // defpackage.ch8
    public final void d(String str, String str2) {
        Log.println(3, "unknown:".concat(str), str2);
    }

    @Override // defpackage.ch8
    public final void e(String str, String str2, Throwable th) {
        b(str, th, 6, str2);
    }

    @Override // defpackage.ch8
    public final void f(Exception exc, String str) {
        b(str, exc, 6, "unhandled exception");
    }

    @Override // defpackage.ch8
    public final boolean h(int i) {
        return this.a <= i;
    }

    @Override // defpackage.ch8
    public final void i(int i) {
        this.a = i;
    }

    @Override // defpackage.ch8
    public final void v(String str, String str2) {
        Log.println(2, "unknown:".concat(str), str2);
    }

    @Override // defpackage.ch8
    public final void w(String str, String str2, Throwable th) {
        b(str, th, 5, str2);
    }

    @Override // defpackage.ch8
    public final void e(String str, String str2) {
        Log.println(6, "unknown:".concat(str), str2);
    }

    @Override // defpackage.ch8
    public final void w(String str, String str2) {
        Log.println(5, "unknown:".concat(str), str2);
    }
}
