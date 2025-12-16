package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class do7 extends wa2 {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public do7(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // defpackage.wa2
    public final void b(s3i s3iVar) {
        this.c.setTranslationY(0.0f);
    }

    @Override // defpackage.wa2
    public final void c(s3i s3iVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // defpackage.wa2
    public final g4i d(g4i g4iVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((s3i) it.next()).a.c() & 8) != 0) {
                this.c.setTranslationY(rg.c(this.e, r0.a.b(), 0));
                break;
            }
        }
        return g4iVar;
    }

    @Override // defpackage.wa2
    public final ssb e(s3i s3iVar, ssb ssbVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return ssbVar;
    }
}
