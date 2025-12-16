package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class veb extends ViewGroup implements u6g {
    public static final /* synthetic */ yy7[] E0 = {new z8a(veb.class, "endIconDrawable", "getEndIconDrawable()Lkotlin/Lazy;"), u45.h(vid.a, veb.class, "maxLengthForLabel", "getMaxLengthForLabel()I"), new z8a(veb.class, "typingMode", "getTypingMode()Lone/me/sdk/uikit/common/views/OneMeTextInput$TypingMode;"), new z8a(veb.class, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;"), new z8a(veb.class, "hint", "getHint()Ljava/lang/String;"), new z8a(veb.class, "filters", "getFilters()[Landroid/text/InputFilter;"), new z8a(veb.class, "textColorAttr", "getTextColorAttr()I"), new z8a(veb.class, "hintColorAttr", "getHintColorAttr()I"), new z8a(veb.class, "currentPlaceholderType", "getCurrentPlaceholderType()Lone/me/sdk/uikit/common/views/OneMeTextInput$PlaceholderType;")};
    public final ueb A0;
    public final ueb B0;
    public final ueb C0;
    public final ueb D0;
    public final w3b a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object o;
    public final Object s0;
    public final Object t0;
    public em6 u0;
    public final ueb v0;
    public final ueb w0;
    public final ueb x0;
    public final ueb y0;
    public final ueb z0;

    /* JADX WARN: Multi-variable type inference failed */
    public veb(final Context context) {
        super(context, null);
        w3b w3bVar = new w3b(context, 14);
        w3bVar.setMinimumHeight(kti.d(52 * vw4.d().getDisplayMetrics().density));
        w3bVar.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(kti.d(2 * vw4.d().getDisplayMetrics().density), w3bVar.getLineHeight());
        mfh.l(w3bVar, gradientDrawable);
        dpg.h.b(w3bVar, t75.b);
        float f = 12;
        w3bVar.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), w3bVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), w3bVar.getPaddingBottom());
        w3bVar.setClipToOutline(true);
        w3bVar.setOutlineProvider(new u74(kti.d(16 * vw4.d().getDisplayMetrics().density)));
        w3bVar.setImportantForAutofill(1);
        w3bVar.setSingleLine(true);
        w3bVar.setInputType(w3bVar.getInputType() | 16384);
        w3bVar.addTextChangedListener(new p3(6, this));
        this.a = w3bVar;
        final int i = 0;
        this.b = ipi.b(3, new cm6() { // from class: qeb
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TextView textView = new TextView(context);
                        dpg.l.b(textView, t75.b);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        float f2 = 12;
                        float f3 = 4;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                        this.addView(textView);
                        return textView;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        int iD = kti.d(10 * vw4.d().getDisplayMetrics().density);
                        imageView.post(new nm3(imageView, iD, iD, iD, iD, imageView, 1));
                        veb vebVar = this;
                        f8j.d(imageView, 300L, new ye6(24, vebVar));
                        vebVar.addView(imageView);
                        return imageView;
                    default:
                        TextView textView2 = new TextView(context);
                        dpg.r.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        this.addView(textView2);
                        return textView2;
                }
            }
        });
        final int i2 = 0;
        k18 k18VarB = ipi.b(3, new cm6(this) { // from class: reb
            public final /* synthetic */ veb b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i3 = yud.r0;
                        v1a v1aVar = a93.s0;
                        veb vebVar = this.b;
                        int i4 = v1aVar.y(vebVar).getIcon().j;
                        Drawable drawableMutate = r34.b(vebVar.getContext(), i3).mutate();
                        cei.k(drawableMutate, i4);
                        float f2 = 20;
                        drawableMutate.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate;
                    case 1:
                        int i5 = ivd.J1;
                        v1a v1aVar2 = a93.s0;
                        veb vebVar2 = this.b;
                        int i6 = v1aVar2.y(vebVar2).getIcon().f;
                        Drawable drawableMutate2 = r34.b(vebVar2.getContext(), i5).mutate();
                        cei.k(drawableMutate2, i6);
                        float f3 = 20;
                        drawableMutate2.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate2;
                    default:
                        int i7 = ivd.v;
                        v1a v1aVar3 = a93.s0;
                        veb vebVar3 = this.b;
                        int i8 = v1aVar3.y(vebVar3).getIcon().f;
                        Drawable drawableMutate3 = r34.b(vebVar3.getContext(), i7).mutate();
                        cei.k(drawableMutate3, i8);
                        float f4 = 20;
                        drawableMutate3.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate3;
                }
            }
        });
        this.c = k18VarB;
        final int i3 = 1;
        this.d = ipi.b(3, new cm6(this) { // from class: reb
            public final /* synthetic */ veb b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i32 = yud.r0;
                        v1a v1aVar = a93.s0;
                        veb vebVar = this.b;
                        int i4 = v1aVar.y(vebVar).getIcon().j;
                        Drawable drawableMutate = r34.b(vebVar.getContext(), i32).mutate();
                        cei.k(drawableMutate, i4);
                        float f2 = 20;
                        drawableMutate.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate;
                    case 1:
                        int i5 = ivd.J1;
                        v1a v1aVar2 = a93.s0;
                        veb vebVar2 = this.b;
                        int i6 = v1aVar2.y(vebVar2).getIcon().f;
                        Drawable drawableMutate2 = r34.b(vebVar2.getContext(), i5).mutate();
                        cei.k(drawableMutate2, i6);
                        float f3 = 20;
                        drawableMutate2.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate2;
                    default:
                        int i7 = ivd.v;
                        v1a v1aVar3 = a93.s0;
                        veb vebVar3 = this.b;
                        int i8 = v1aVar3.y(vebVar3).getIcon().f;
                        Drawable drawableMutate3 = r34.b(vebVar3.getContext(), i7).mutate();
                        cei.k(drawableMutate3, i8);
                        float f4 = 20;
                        drawableMutate3.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate3;
                }
            }
        });
        final int i4 = 2;
        this.o = ipi.b(3, new cm6(this) { // from class: reb
            public final /* synthetic */ veb b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        int i32 = yud.r0;
                        v1a v1aVar = a93.s0;
                        veb vebVar = this.b;
                        int i42 = v1aVar.y(vebVar).getIcon().j;
                        Drawable drawableMutate = r34.b(vebVar.getContext(), i32).mutate();
                        cei.k(drawableMutate, i42);
                        float f2 = 20;
                        drawableMutate.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate;
                    case 1:
                        int i5 = ivd.J1;
                        v1a v1aVar2 = a93.s0;
                        veb vebVar2 = this.b;
                        int i6 = v1aVar2.y(vebVar2).getIcon().f;
                        Drawable drawableMutate2 = r34.b(vebVar2.getContext(), i5).mutate();
                        cei.k(drawableMutate2, i6);
                        float f3 = 20;
                        drawableMutate2.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate2;
                    default:
                        int i7 = ivd.v;
                        v1a v1aVar3 = a93.s0;
                        veb vebVar3 = this.b;
                        int i8 = v1aVar3.y(vebVar3).getIcon().f;
                        Drawable drawableMutate3 = r34.b(vebVar3.getContext(), i7).mutate();
                        cei.k(drawableMutate3, i8);
                        float f4 = 20;
                        drawableMutate3.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        return drawableMutate3;
                }
            }
        });
        final int i5 = 1;
        this.s0 = ipi.b(3, new cm6() { // from class: qeb
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        TextView textView = new TextView(context);
                        dpg.l.b(textView, t75.b);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        float f2 = 12;
                        float f3 = 4;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                        this.addView(textView);
                        return textView;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        int iD = kti.d(10 * vw4.d().getDisplayMetrics().density);
                        imageView.post(new nm3(imageView, iD, iD, iD, iD, imageView, 1));
                        veb vebVar = this;
                        f8j.d(imageView, 300L, new ye6(24, vebVar));
                        vebVar.addView(imageView);
                        return imageView;
                    default:
                        TextView textView2 = new TextView(context);
                        dpg.r.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        this.addView(textView2);
                        return textView2;
                }
            }
        });
        final int i6 = 2;
        this.t0 = ipi.b(3, new cm6() { // from class: qeb
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        TextView textView = new TextView(context);
                        dpg.l.b(textView, t75.b);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        float f2 = 12;
                        float f3 = 4;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                        this.addView(textView);
                        return textView;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        int iD = kti.d(10 * vw4.d().getDisplayMetrics().density);
                        imageView.post(new nm3(imageView, iD, iD, iD, iD, imageView, 1));
                        veb vebVar = this;
                        f8j.d(imageView, 300L, new ye6(24, vebVar));
                        vebVar.addView(imageView);
                        return imageView;
                    default:
                        TextView textView2 = new TextView(context);
                        dpg.r.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        this.addView(textView2);
                        return textView2;
                }
            }
        });
        this.v0 = new ueb(k18VarB, this, 0);
        this.w0 = new ueb(this, 1);
        this.x0 = new ueb(this, 2);
        this.y0 = new ueb(this, 3, (boolean) (0 == true ? 1 : 0));
        this.z0 = new ueb(this, 4);
        this.A0 = new ueb(new InputFilter[0], this, 5);
        this.B0 = new ueb(Integer.valueOf(w9b.X), this, 6);
        this.C0 = new ueb(Integer.valueOf(w9b.Y), this, 7);
        this.D0 = new ueb(this, 8, false);
        addView(w3bVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    public static final void a(veb vebVar) {
        w3b w3bVar = vebVar.a;
        if (dqi.r(vebVar.t0) && vebVar.getMaxLengthLabelView().getMeasuredWidth() == 0) {
            vebVar.getMaxLengthLabelView().measure(View.MeasureSpec.makeMeasureSpec((vebVar.getMeasuredWidth() - vebVar.getPaddingStart()) - vebVar.getPaddingEnd(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int endPaddingByVisibleViews = vebVar.getEndPaddingByVisibleViews();
        if (w3bVar.getPaddingEnd() != endPaddingByVisibleViews) {
            w3bVar.setPaddingRelative(w3bVar.getPaddingStart(), w3bVar.getPaddingTop(), endPaddingByVisibleViews, w3bVar.getPaddingBottom());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    public static final void b(veb vebVar, k18 k18Var) {
        if (vebVar.getText().length() != 0 && k18Var != null && vebVar.a.isEnabled()) {
            ImageView endIconView = vebVar.getEndIconView();
            endIconView.setVisibility(0);
            endIconView.setImageDrawable((Drawable) k18Var.getValue());
        } else {
            ?? r1 = vebVar.s0;
            if (r1.e()) {
                ((ImageView) r1.getValue()).setVisibility(8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    public static final void c(veb vebVar, int i, int i2) {
        if (vebVar.getText().length() == 0 || i == 0 || i2 == 0 || !vebVar.a.isEnabled()) {
            ?? r1 = vebVar.t0;
            if (r1.e()) {
                ((TextView) r1.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        TextView maxLengthLabelView = vebVar.getMaxLengthLabelView();
        maxLengthLabelView.setVisibility(0);
        int i3 = i - i2;
        maxLengthLabelView.setText(String.valueOf(i3 >= 0 ? i3 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, k18] */
    public static final void d(veb vebVar, teb tebVar) {
        w3b w3bVar = vebVar.a;
        int iOrdinal = tebVar.ordinal();
        if (iOrdinal == 0) {
            if (vebVar.getEndIconDrawable() != null) {
                vebVar.setEndIconDrawable(vebVar.c);
            }
            if (w3bVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
                w3bVar.setTransformationMethod(SingleLineTransformationMethod.getInstance());
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            w3bVar.setInputType(128);
            w3bVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
            vebVar.setEndIconDrawable(vebVar.d);
        }
        vebVar.setEndIconTint(a93.s0.y(vebVar));
    }

    private final seb getCurrentPlaceholderType() {
        yy7 yy7Var = E0[8];
        return (seb) this.D0.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getEndIconView() {
        return (ImageView) this.s0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    private final int getEndPaddingByVisibleViews() {
        ?? r0 = this.s0;
        boolean zR = dqi.r(r0);
        ?? r3 = this.t0;
        if (zR && dqi.r(r3)) {
            return u45.c(20, vw4.d().getDisplayMetrics().density, u45.c(8, vw4.d().getDisplayMetrics().density, getMaxLengthLabelView().getMeasuredWidth() + (kti.d(12 * vw4.d().getDisplayMetrics().density) * 2)));
        }
        if (dqi.r(r0)) {
            return u45.c(20, vw4.d().getDisplayMetrics().density, kti.d(12 * vw4.d().getDisplayMetrics().density) * 2);
        }
        if (!dqi.r(r3)) {
            return kti.d(12 * vw4.d().getDisplayMetrics().density);
        }
        return getMaxLengthLabelView().getMeasuredWidth() + (kti.d(12 * vw4.d().getDisplayMetrics().density) * 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getMaxLengthLabelView() {
        return (TextView) this.t0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getPlaceholderView() {
        return (TextView) this.b.getValue();
    }

    private final void setCurrentPlaceholderType(seb sebVar) {
        this.D0.O(this, E0[8], sebVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final void setEndIconTint(yeb yebVar) {
        if (this.s0.e()) {
            getEndIconView().setImageTintList(ColorStateList.valueOf(getTypingMode() == teb.b ? yebVar.getIcon().f : yebVar.getIcon().j));
        }
    }

    public final void e() {
        getPlaceholderView().setText((CharSequence) null);
        getPlaceholderView().setVisibility(8);
        setCurrentPlaceholderType(null);
    }

    public final void f(em6 em6Var) {
        this.a.addTextChangedListener(new p3(5, em6Var));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    public final boolean g() {
        return getCurrentPlaceholderType() == seb.a && dqi.r(this.b);
    }

    public final Integer getBackgroundColorAttr() {
        yy7 yy7Var = E0[3];
        return (Integer) this.y0.b;
    }

    public final em6 getEndIconAction() {
        return this.u0;
    }

    public final k18 getEndIconDrawable() {
        yy7 yy7Var = E0[0];
        return (k18) this.v0.b;
    }

    public final InputFilter[] getFilters() {
        yy7 yy7Var = E0[5];
        return (InputFilter[]) this.A0.b;
    }

    public final String getHint() {
        yy7 yy7Var = E0[4];
        return (String) this.z0.b;
    }

    public final int getHintColorAttr() {
        yy7 yy7Var = E0[7];
        return ((Number) this.C0.b).intValue();
    }

    public final int getInputHeight() {
        return this.a.getMeasuredHeight();
    }

    public final int getMaxLengthForLabel() {
        yy7 yy7Var = E0[1];
        return ((Number) this.w0.b).intValue();
    }

    public final CharSequence getText() {
        Editable text = this.a.getText();
        CharSequence charSequenceA = text != null ? kzi.a(text) : null;
        return charSequenceA == null ? "" : charSequenceA;
    }

    public final int getTextColor() {
        return this.a.getTextColors().getDefaultColor();
    }

    public final int getTextColorAttr() {
        yy7 yy7Var = E0[6];
        return ((Number) this.B0.b).intValue();
    }

    public final teb getTypingMode() {
        yy7 yy7Var = E0[2];
        return (teb) this.x0.b;
    }

    public final void h(String str, seb sebVar) {
        if (fni.a(getPlaceholderView().getText(), str) && sebVar == getCurrentPlaceholderType()) {
            return;
        }
        getPlaceholderView().setText(str);
        getPlaceholderView().setVisibility(0);
        setCurrentPlaceholderType(sebVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    public final void i(yeb yebVar, seb sebVar) {
        int i;
        int iOrdinal = sebVar.ordinal();
        if (iOrdinal == 0) {
            i = yebVar.getText().b;
        } else if (iOrdinal == 1) {
            i = yebVar.getText().e;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = yebVar.getText().i;
        }
        ?? r3 = this.b;
        if (r3.e()) {
            ((TextView) r3.getValue()).setTextColor(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iQ;
        int measuredWidth;
        int paddingTop = getPaddingTop();
        int paddingStart = getPaddingStart();
        w3b w3bVar = this.a;
        cri.c(w3bVar, paddingStart, paddingTop, 0, 12);
        int measuredHeight = w3bVar.getMeasuredHeight() + paddingTop;
        ?? r5 = this.s0;
        if (dqi.r(r5)) {
            cri.c(getEndIconView(), u45.q(12, vw4.d().getDisplayMetrics().density, m8j.d(w3bVar) ? w3bVar.getLeft() : w3bVar.getRight()) - getEndIconView().getMeasuredWidth(), (w3bVar.getMeasuredHeight() / 2) - (getEndIconView().getMeasuredHeight() / 2), 0, 12);
        }
        if (dqi.r(this.t0)) {
            if (dqi.r(r5)) {
                iQ = u45.q(8, vw4.d().getDisplayMetrics().density, m8j.c(getEndIconView()));
                measuredWidth = getMaxLengthLabelView().getMeasuredWidth();
            } else {
                iQ = u45.q(12, vw4.d().getDisplayMetrics().density, m8j.d(w3bVar) ? w3bVar.getLeft() : w3bVar.getRight());
                measuredWidth = getMaxLengthLabelView().getMeasuredWidth();
            }
            cri.c(getMaxLengthLabelView(), iQ - measuredWidth, (w3bVar.getMeasuredHeight() / 2) - (getMaxLengthLabelView().getMeasuredHeight() / 2), 0, 12);
        }
        if (dqi.r(this.b)) {
            cri.c(getPlaceholderView(), paddingStart, u45.c(4, vw4.d().getDisplayMetrics().density, measuredHeight), 0, 12);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd(), 1073741824);
        w3b w3bVar = this.a;
        w3bVar.measure(iMakeMeasureSpec, i2);
        int measuredHeight = w3bVar.getMeasuredHeight();
        ?? r2 = this.s0;
        if (dqi.r(r2)) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(kti.d(20 * vw4.d().getDisplayMetrics().density), 1073741824);
            ((ImageView) r2.getValue()).measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
        }
        if (dqi.r(this.b)) {
            getPlaceholderView().measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = utb.j(4, vw4.d().getDisplayMetrics().density, getPlaceholderView().getMeasuredHeight(), measuredHeight);
        }
        if (dqi.r(this.t0)) {
            getMaxLengthLabelView().measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iMakeMeasureSpec), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(iMakeMeasureSpec), measuredHeight);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        w3b w3bVar = this.a;
        Drawable drawableF = mfh.f(w3bVar);
        GradientDrawable gradientDrawable = drawableF instanceof GradientDrawable ? (GradientDrawable) drawableF : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(yebVar.getText().j));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        if (backgroundColorAttr != null) {
            w3bVar.setBackgroundColor(v1aVar.y(this).g(backgroundColorAttr.intValue()));
        }
        w3bVar.setTextColor(v1aVar.y(this).g(getTextColorAttr()));
        w3bVar.setHintTextColor(v1aVar.y(this).g(getHintColorAttr()));
        t2i.c(w3bVar, v1aVar.y(this));
        setEndIconTint(yebVar);
        if (this.t0.e()) {
            getMaxLengthLabelView().setTextColor(yebVar.getText().g);
        }
        seb currentPlaceholderType = getCurrentPlaceholderType();
        if (currentPlaceholderType != null) {
            i(yebVar, currentPlaceholderType);
        }
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.y0.O(this, E0[3], num);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
    }

    public final void setEndIconAction(em6 em6Var) {
        this.u0 = em6Var;
    }

    public final void setEndIconDrawable(k18 k18Var) {
        this.v0.O(this, E0[0], k18Var);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        this.A0.O(this, E0[5], inputFilterArr);
    }

    public final void setHint(String str) {
        this.z0.O(this, E0[4], str);
    }

    public final void setHintColorAttr(int i) {
        this.C0.O(this, E0[7], Integer.valueOf(i));
    }

    public final void setImeOptions(Integer num) {
        this.a.setImeOptions(num != null ? num.intValue() : 0);
    }

    public final void setInputType(int i) {
        this.a.setInputType(i);
    }

    public final void setMaxLengthForLabel(int i) {
        this.w0.O(this, E0[1], Integer.valueOf(i));
    }

    public final void setSelection(int i) {
        this.a.setSelection(i);
    }

    public final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    public final void setTextColorAttr(int i) {
        this.B0.O(this, E0[6], Integer.valueOf(i));
    }

    public final void setTypingMode(teb tebVar) {
        this.x0.O(this, E0[2], tebVar);
    }
}
