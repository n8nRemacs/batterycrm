package defpackage;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class el6 implements ch8, n54 {
    public final /* synthetic */ kj0 a = new kj0();
    public final xs b = zri.a("WrappingUtils");
    public int c = 6;

    @Override // defpackage.ch8
    public final void a(IOException iOException) {
        if (ue3.A(this.b, "HeifExifUtil")) {
            return;
        }
        wqi.b("Fresco:".concat("HeifExifUtil"), "Failed reading Heif Exif orientation -> ignoring", iOException);
    }

    @Override // defpackage.n54
    public final void b(String str, Object obj, Animatable animatable) {
        this.a.getClass();
    }

    @Override // defpackage.ch8
    public final void c(String str, String str2) {
        if (ue3.A(this.b, str)) {
            return;
        }
        String strConcat = "Fresco:".concat(str);
        Object[] objArr = new Object[0];
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            l6b.f(l6bVar, lg8.Z, strConcat, str2, objArr, null, 16);
        }
    }

    @Override // defpackage.ch8
    public final void d(String str, String str2) {
        if (ue3.A(this.b, str)) {
            return;
        }
        wqi.c("Fresco:".concat(str), str2, new Object[0]);
    }

    @Override // defpackage.n54
    public final void e(String str) {
        this.a.getClass();
    }

    @Override // defpackage.ch8
    public final void f(Exception exc, String str) {
        if (ue3.A(this.b, str)) {
            return;
        }
        String strConcat = "Fresco:".concat(str);
        String strConcat2 = "unhandled exception".concat(saj.d(exc));
        Object[] objArr = new Object[0];
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            l6b.f(l6bVar, lg8.Z, strConcat, strConcat2, objArr, null, 16);
        }
    }

    @Override // defpackage.n54
    public final void g(String str) {
    }

    @Override // defpackage.ch8
    public final boolean h(int i) {
        return this.c <= i;
    }

    @Override // defpackage.ch8
    public final void i(int i) {
        this.c = i;
    }

    @Override // defpackage.n54
    public final void j(String str, Throwable th) {
        wqi.e("Fresco:".concat("ControllerListener"), "onIntermediateImageFailed " + str, th);
    }

    @Override // defpackage.n54
    public final void onIntermediateImageSet(String str, Object obj) {
        this.a.getClass();
    }

    @Override // defpackage.ch8
    public final void v(String str, String str2) {
        if (ue3.A(this.b, str)) {
            return;
        }
        Log.v("Fresco:".concat(str), str2);
    }

    @Override // defpackage.ch8
    public final void w(String str, String str2) {
        if (ue3.A(this.b, str)) {
            return;
        }
        wqi.q("Fresco:".concat(str), str2, new Object[0]);
    }

    @Override // defpackage.ch8
    public final void e(String str, String str2) {
        if (ue3.A(this.b, str)) {
            return;
        }
        wqi.e("Fresco:".concat(str), str2, null);
    }

    @Override // defpackage.n54
    public final void d(String str, Throwable th) {
        wqi.e("Fresco:".concat("ControllerListener"), "onFailure " + str, th);
    }

    @Override // defpackage.ch8
    public final void w(String str, String str2, Throwable th) {
        if (ue3.A(this.b, str)) {
            return;
        }
        wqi.p("Fresco:".concat(str), str2, th);
    }

    @Override // defpackage.ch8
    public final void e(String str, String str2, Throwable th) {
        if (ue3.A(this.b, str)) {
            return;
        }
        wqi.g("Fresco:".concat(str), th, str2, new Object[0]);
    }
}
