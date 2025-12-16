package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* loaded from: classes.dex */
public final class cs extends h6f implements fhd {
    public final int a;
    public hx4 b;

    public cs(Context context, int i) {
        this.a = i;
        this.b = new hx4(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // defpackage.fhd
    public final h6f a(Context context) {
        this.b = new hx4(new File(context.getApplicationInfo().nativeLibraryDir), this.a | 1);
        return this;
    }

    @Override // defpackage.h6f
    public final String b() {
        throw null;
    }

    @Override // defpackage.h6f
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.b.c(str, i, threadPolicy);
    }

    @Override // defpackage.h6f
    public final void d(int i) {
        this.b.getClass();
    }

    @Override // defpackage.h6f
    public final String toString() {
        return "ApplicationSoSource[" + this.b.toString() + "]";
    }
}
