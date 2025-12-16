package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class w42 extends View implements zof {
    public final ArrayList a;
    public List b;
    public float c;
    public e52 d;
    public float o;

    public w42(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
        this.d = e52.g;
        this.o = 0.08f;
    }

    @Override // defpackage.zof
    public final void a(List list, e52 e52Var, float f, float f2) {
        this.b = list;
        this.d = e52Var;
        this.c = f;
        this.o = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new pof(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0467  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w42.dispatchDraw(android.graphics.Canvas):void");
    }
}
