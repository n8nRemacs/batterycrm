package defpackage;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class h2a extends BaseAdapter {
    public static final int d = vxg.c(null).getMaximum(4);
    public static final int o = (vxg.c(null).getMaximum(7) + vxg.c(null).getMaximum(5)) - 1;
    public final g2a a;
    public i5i b;
    public final mz0 c;

    public h2a(g2a g2aVar, mz0 mz0Var) {
        this.a = g2aVar;
        this.c = mz0Var;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.c.o;
        g2a g2aVar = this.a;
        Calendar calendar = g2aVar.a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + g2aVar.d : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarA = vxg.a(this.a.a);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.o) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return o;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            i5i r1 = r4.b
            if (r1 != 0) goto Lf
            i5i r1 = new i5i
            r1.<init>(r0)
            r4.b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L26
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r0 = defpackage.k1d.mtrl_calendar_day
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5c
            g2a r7 = r4.a
            int r2 = r7.o
            if (r6 < r2) goto L35
            goto L5c
        L35:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L64
        L5c:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L64:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6b
            goto L6d
        L6b:
            if (r0 != 0) goto L6e
        L6d:
            return r0
        L6e:
            r0.getContext()
            java.util.Calendar r5 = defpackage.vxg.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
