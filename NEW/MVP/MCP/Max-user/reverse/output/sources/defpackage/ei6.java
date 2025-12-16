package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.b;

/* loaded from: classes.dex */
public final class ei6 extends q08 implements ggh, j48, kyd, vi6 {
    public final ti6 X;
    public final /* synthetic */ b Y;
    public final b c;
    public final b d;
    public final Handler o;

    public ei6(b bVar) {
        this.Y = bVar;
        Handler handler = new Handler();
        this.c = bVar;
        this.d = bVar;
        this.o = handler;
        this.X = new ti6();
    }

    @Override // defpackage.vi6
    public final void a(a aVar) {
    }

    @Override // defpackage.q08
    public final View d(int i) {
        return this.Y.findViewById(i);
    }

    @Override // defpackage.q08
    public final boolean e() {
        Window window = this.Y.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ggh
    public final fgh h() {
        return this.Y.h();
    }

    @Override // defpackage.kyd
    public final pn l() {
        return (pn) this.Y.d.d;
    }

    @Override // defpackage.j48
    public final l48 p() {
        return this.Y.E0;
    }
}
