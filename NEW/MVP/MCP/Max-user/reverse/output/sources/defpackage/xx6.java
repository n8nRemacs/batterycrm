package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xx6 extends bxe {
    public final /* synthetic */ bxe e;
    public final /* synthetic */ bxe f;

    public xx6(bxe bxeVar, bxe bxeVar2) {
        this.e = bxeVar;
        this.f = bxeVar2;
    }

    @Override // defpackage.bxe
    public final int a(View view, int i, int i2) {
        WeakHashMap weakHashMap = hfh.a;
        return (view.getLayoutDirection() == 1 ? this.f : this.e).a(view, i, i2);
    }

    @Override // defpackage.bxe
    public final String c() {
        return "SWITCHING[L:" + this.e.c() + ", R:" + this.f.c() + "]";
    }

    @Override // defpackage.bxe
    public final int e(View view, int i) {
        WeakHashMap weakHashMap = hfh.a;
        return (view.getLayoutDirection() == 1 ? this.f : this.e).e(view, i);
    }
}
