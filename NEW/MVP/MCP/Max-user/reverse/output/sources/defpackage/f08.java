package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class f08 extends FrameLayout implements u6g {
    public static final /* synthetic */ yy7[] c;
    public final TextView a;
    public final nk b;

    static {
        z8a z8aVar = new z8a(f08.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;");
        vid.a.getClass();
        c = new yy7[]{z8aVar};
    }

    public f08(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        textView.setId(zud.E0);
        dpg.m.b(textView, t75.b);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLetterSpacing(0.0f);
        textView.setSingleLine(true);
        this.a = textView;
        this.b = new nk((aya) aya.g.getValue(), 11, this);
        b(getTabItem().c, a93.s0.y(this));
        setLayoutParams(new ViewGroup.LayoutParams(kti.d(72 * vw4.d().getDisplayMetrics().density), -2));
        setClipToPadding(false);
        addView(textView);
    }

    public static final void a(f08 f08Var) {
        f08Var.setText(f08Var.getTabItem().b);
        f08Var.a.setTextColor(b(f08Var.getTabItem().c, a93.s0.y(f08Var)).a);
        f08Var.requestLayout();
        f08Var.invalidate();
    }

    public static e08 b(int i, yeb yebVar) {
        int iV = az1.v(i);
        if (iV == 0) {
            return new e08(yebVar.getText().e);
        }
        if (iV == 1) {
            return new e08(yebVar.getText().g);
        }
        if (iV == 2) {
            return new e08(yebVar.c().c.b.e);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final aya getTabItem() {
        yy7 yy7Var = c[0];
        return (aya) this.b.b;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setTextColor(b(getTabItem().c, yebVar).a);
        a93.h(a93.s0.x(getContext()), this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(aya.a(getTabItem(), null, z ? 1 : 2, null, 59));
        }
        super.setSelected(z);
    }

    public final void setTabItem(aya ayaVar) {
        this.b.O(this, c[0], ayaVar);
    }
}
