package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class mgf {
    public final View a;
    public int b;
    public int c;
    public final kt d;
    public fff e;

    public mgf(View view) {
        this.a = view;
        kt ktVar = new kt(9);
        ktVar.b = 0;
        ktVar.c = 0;
        this.d = ktVar;
    }

    public final kt a(int i, int i2) {
        kt ktVar = this.d;
        ktVar.b = i;
        ktVar.c = i2;
        fff fffVar = this.e;
        if (fffVar == null) {
            return ktVar;
        }
        int i3 = fffVar.Z;
        int iMin = this.b;
        if (i3 >= iMin && i3 <= (iMin = this.c)) {
            iMin = i3;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.a;
        if (mode == 1073741824) {
            iMin = (int) Math.min(iMin, (View.MeasureSpec.getSize(i2) - view.getPaddingBottom()) - view.getPaddingTop());
        }
        ktVar.b = View.MeasureSpec.makeMeasureSpec(view.getPaddingRight() + view.getPaddingLeft() + ((int) ((fffVar.Y / i3) * iMin)), 1073741824);
        ktVar.c = View.MeasureSpec.makeMeasureSpec(view.getPaddingBottom() + view.getPaddingTop() + iMin, 1073741824);
        return ktVar;
    }

    public final void b(fff fffVar) {
        this.e = fffVar;
        c();
    }

    public final void c() {
        float f = 170;
        this.b = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.c = kti.d(f * vw4.d().getDisplayMetrics().density);
    }
}
