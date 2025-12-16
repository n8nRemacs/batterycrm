package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b1i extends FrameLayout implements zof {
    public final w42 a;
    public final z0i b;
    public List c;
    public e52 d;
    public float o;
    public float s0;

    public b1i(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = e52.g;
        this.o = 0.0533f;
        this.s0 = 0.08f;
        w42 w42Var = new w42(context, 0);
        this.a = w42Var;
        z0i z0iVar = new z0i(context, null);
        this.b = z0iVar;
        z0iVar.setBackgroundColor(0);
        addView(w42Var);
        addView(z0iVar);
    }

    @Override // defpackage.zof
    public final void a(List list, e52 e52Var, float f, float f2) {
        this.d = e52Var;
        this.o = f;
        this.s0 = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            gb4 gb4Var = (gb4) list.get(i);
            if (gb4Var.d != null) {
                arrayList.add(gb4Var);
            } else {
                arrayList2.add(gb4Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, e52Var, f, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float fD = zg4.d(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fD == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fD / getContext().getResources().getDisplayMetrics().density)};
        int i2 = xxg.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x052c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1i.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
