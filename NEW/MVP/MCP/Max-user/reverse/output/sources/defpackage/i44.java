package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i44 extends LinearLayout implements u1g {
    public static final /* synthetic */ yy7[] d;
    public static final int o;
    public final float a;
    public final ArrayList b;
    public final nk c;

    static {
        z8a z8aVar = new z8a(i44.class, "customTheme", "getCustomTheme()Lru/ok/tamtam/themes/TamTheme;");
        vid.a.getClass();
        d = new yy7[]{z8aVar};
        kti.d(24 * vw4.d().getDisplayMetrics().density);
        o = kti.d(8 * vw4.d().getDisplayMetrics().density);
    }

    public i44(Context context) {
        q1g q1gVarD;
        super(context, null);
        this.a = getContext().getResources().getDimension(xvc.bottom_sheet_corner_radius);
        this.b = new ArrayList();
        this.c = new nk(7, this);
        setOrientation(1);
        if (isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context2 = getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context2);
        }
        k(q1gVarD);
        addOnAttachStateChangeListener(new r40(16, this));
        setClipChildren(true);
        setClipToPadding(true);
        setClipToOutline(true);
        setOutlineProvider(new f83(this, 2));
        if (isInEditMode()) {
            int i = 9;
            a(ve3.j(new a44(new n5g(c5d.tt_sms_invite_text), Integer.valueOf(oxc.btn_radio_off_mtrl), new ps3(i), 12), new a44(new n5g(c5d.tt_sms_invite_text), Integer.valueOf(R.drawable.ic_menu_save), new ps3(i), 12)), null);
        }
    }

    private final q1g getCurrentTheme() {
        q1g customTheme = getCustomTheme();
        if (customTheme != null) {
            return customTheme;
        }
        if (isInEditMode()) {
            return bq4.e0;
        }
        Context context = getContext();
        bwf bwfVar = q1g.a0;
        return nca.d(context);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, k18] */
    public final void a(List list, qk qkVar) {
        int size = list.size();
        ArrayList arrayList = this.b;
        int iD = (size == 1 && arrayList.isEmpty()) ? kti.d(16 * vw4.d().getDisplayMetrics().density) : kti.d(12 * vw4.d().getDisplayMetrics().density);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a44 a44Var = (a44) it.next();
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            appCompatTextView.setGravity(8388627);
            n5g n5gVar = a44Var.a;
            Integer num = a44Var.b;
            appCompatTextView.setText(n5gVar.b(appCompatTextView.getContext()));
            Integer num2 = (Integer) ((Map) getCurrentTheme().f.T.getValue()).get(p1g.C0);
            appCompatTextView.setTextColor(num2 != null ? num2.intValue() : getCurrentTheme().F);
            appCompatTextView.setTextSize(15.0f);
            if (num != null) {
                Drawable drawableB = r34.b(appCompatTextView.getContext(), num.intValue());
                Integer num3 = (Integer) ((Map) getCurrentTheme().f.T.getValue()).get(p1g.t0);
                cei.k(drawableB, num3 != null ? num3.intValue() : getCurrentTheme().w);
                appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
                appCompatTextView.setCompoundDrawablePadding(o);
            }
            appCompatTextView.setBackground(uga.c(getCurrentTheme().m, getCurrentTheme().i));
            if (num != null) {
                float f = 16;
                appCompatTextView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(22 * vw4.d().getDisplayMetrics().density), iD);
            } else {
                float f2 = 12;
                appCompatTextView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density), iD);
            }
            addView(appCompatTextView, new LinearLayout.LayoutParams(-1, -2));
            arrayList.add(new imb(a44Var, appCompatTextView));
            if (qkVar != null) {
                qkVar.invoke(a44Var, appCompatTextView);
            }
        }
    }

    public final ArrayList<imb> getActions() {
        return this.b;
    }

    public final q1g getCustomTheme() {
        yy7 yy7Var = d[0];
        return (q1g) this.c.b;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, k18] */
    @Override // defpackage.u1g
    public final void k(q1g q1gVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            imb imbVar = (imb) it.next();
            a44 a44Var = (a44) imbVar.a;
            View view = (View) imbVar.b;
            if (a44Var instanceof a44) {
                view.setBackground(uga.c(getCurrentTheme().m, getCurrentTheme().i));
                AppCompatTextView appCompatTextView = (AppCompatTextView) view;
                Drawable drawable = (Drawable) ys.x(0, appCompatTextView.getCompoundDrawables());
                if (drawable != null) {
                    q1g currentTheme = getCurrentTheme();
                    a44Var.getClass();
                    Integer num = (Integer) ((Map) currentTheme.f.T.getValue()).get(p1g.t0);
                    cei.k(drawable, num != null ? num.intValue() : getCurrentTheme().w);
                }
                q1g currentTheme2 = getCurrentTheme();
                a44Var.getClass();
                Integer num2 = (Integer) ((Map) currentTheme2.f.T.getValue()).get(p1g.C0);
                appCompatTextView.setTextColor(num2 != null ? num2.intValue() : getCurrentTheme().F);
            }
        }
    }

    public final void setCustomTheme(q1g q1gVar) {
        this.c.O(this, d[0], q1gVar);
    }
}
