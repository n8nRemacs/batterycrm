package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class meb extends LinearLayout implements u6g {
    public static final /* synthetic */ yy7[] v0 = {new z8a(meb.class, "isIndicatorVisible", "isIndicatorVisible()Z"), u45.h(vid.a, meb.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;")};
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object o;
    public final keb s0;
    public final keb t0;
    public dyf u0;

    public meb(Context context) {
        super(context, null);
        this.a = true;
        mgb.a(this, new r98(12, this, this));
        this.b = ipi.b(3, new p1b(context, 12));
        this.c = ipi.b(3, new p1b(context, 13));
        this.d = ipi.b(3, new p1b(context, 14));
        this.o = ipi.b(3, new l3b(context, 3, this));
        this.s0 = new keb(this);
        this.t0 = new keb((aya) aya.g.getValue(), this);
        this.u0 = q08.f(getTabItem().c, a93.s0.y(this));
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setClipToPadding(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    public static final void a(meb mebVar) {
        ?? r0 = mebVar.c;
        mebVar.setText(mebVar.getTabItem().b);
        mebVar.u0 = q08.f(mebVar.getTabItem().c, a93.s0.y(mebVar));
        ?? r1 = mebVar.o;
        ?? r2 = mebVar.d;
        Drawable drawable = mebVar.getTabItem().e;
        if (drawable != null) {
            ImageView imageView = (ImageView) r0.getValue();
            imageView.setImageDrawable(drawable);
            dqi.a(mebVar, imageView, Integer.valueOf(mebVar.b(imageView.getId())));
        }
        keb kebVar = mebVar.s0;
        yy7 yy7Var = v0[0];
        if (((Boolean) kebVar.b).booleanValue()) {
            ozi oziVar = mebVar.getTabItem().d;
            if (oziVar instanceof xxa) {
                w2b w2bVar = (w2b) r2.getValue();
                dqi.a(mebVar, w2bVar, Integer.valueOf(mebVar.b(w2bVar.getId())));
            } else if (fni.a(oziVar, yxa.a)) {
                k3b k3bVar = (k3b) r1.getValue();
                k3bVar.setVisibility(mebVar.u0.d ? 0 : 8);
                dqi.a(mebVar, k3bVar, Integer.valueOf(mebVar.b(k3bVar.getId())));
            } else {
                if (!fni.a(oziVar, zxa.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (r1.e()) {
                    ((k3b) r1.getValue()).setVisibility(8);
                }
                if (r2.e()) {
                    ((w2b) r2.getValue()).setVisibility(8);
                }
            }
        }
        mebVar.c();
        if (r0.e()) {
            ImageView imageView2 = (ImageView) r0.getValue();
            leb lebVar = new leb(mebVar, 0);
            if (imageView2.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                lebVar.invoke(marginLayoutParams);
                imageView2.setLayoutParams(marginLayoutParams);
            }
        }
        ?? r02 = mebVar.b;
        if (r02.e()) {
            TextView textView = (TextView) r02.getValue();
            leb lebVar2 = new leb(mebVar, 1);
            if (textView.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                lebVar2.invoke(marginLayoutParams2);
                textView.setLayoutParams(marginLayoutParams2);
            }
        }
        mebVar.requestLayout();
        mebVar.invalidate();
    }

    public static /* synthetic */ void getTabItem$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.b.getValue();
        textView.setText(charSequence);
        dqi.a(this, textView, Integer.valueOf(b(textView.getId())));
    }

    public final int b(int i) {
        if (i == zud.C0) {
            return 0;
        }
        if (i == zud.E0) {
            return lee.e(jqi.e(this)) / 2;
        }
        if (i == zud.D0) {
            return lee.e(jqi.e(this)) - 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    public final void c() {
        ?? r0 = this.b;
        if (r0.e()) {
            ((TextView) r0.getValue()).setTextColor(this.u0.b);
        }
        ?? r02 = this.c;
        if (r02.e()) {
            ((ImageView) r02.getValue()).setImageTintList(ColorStateList.valueOf(this.u0.a));
        }
        yy7 yy7Var = v0[0];
        if (((Boolean) this.s0.b).booleanValue()) {
            ozi oziVar = getTabItem().d;
            boolean zA = fni.a(oziVar, yxa.a);
            ?? r3 = this.o;
            if (zA) {
                if (r3.e()) {
                    ((k3b) r3.getValue()).setVisibility(this.u0.d ? 0 : 8);
                    return;
                }
                return;
            }
            boolean z = oziVar instanceof xxa;
            ?? r5 = this.d;
            if (!z) {
                if (!fni.a(oziVar, zxa.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (r5.e()) {
                    ((w2b) r5.getValue()).setVisibility(8);
                }
                if (r3.e()) {
                    ((k3b) r3.getValue()).setVisibility(8);
                    return;
                }
                return;
            }
            boolean z2 = this.u0.d && ((xxa) oziVar).a != 0;
            if (r5.e()) {
                w2b w2bVar = (w2b) r5.getValue();
                w2bVar.setVisibility(z2 ? 0 : 8);
                int iV = az1.v(getTabItem().c);
                r2b r2bVar = r2b.a;
                if (iV != 0) {
                    if (iV == 1) {
                        r2bVar = r2b.c;
                    } else if (iV != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                w2bVar.setAppearance(r2bVar);
                w2bVar.g(((xxa) oziVar).a, !this.a);
            }
        }
    }

    public final aya getTabItem() {
        yy7 yy7Var = v0[1];
        return (aya) this.t0.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ?? r0 = this.b;
        if (r0.e()) {
            TextView textView = (TextView) r0.getValue();
            CharSequence text = textView.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), FitFontImageSpan.class) : null;
            if (spans == null) {
                spans = new FitFontImageSpan[0];
            }
            for (Object obj : spans) {
                ((FitFontImageSpan) obj).updateDrawableSize(kti.d(15 * vw4.d().getDisplayMetrics().density), a16.c, false);
            }
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.u0 = q08.f(getTabItem().c, yebVar);
        c();
        a93.h(a93.s0.x(getContext()), this);
    }

    public final void setIndicatorVisible(boolean z) {
        this.s0.O(this, v0[0], Boolean.valueOf(z));
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(aya.a(getTabItem(), null, z ? 1 : 2, null, 59));
        }
        super.setSelected(z);
    }

    public final void setTabItem(aya ayaVar) {
        this.t0.O(this, v0[1], ayaVar);
    }
}
