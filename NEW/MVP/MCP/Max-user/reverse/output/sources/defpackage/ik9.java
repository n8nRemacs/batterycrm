package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ik9 extends LinearLayout implements u6g, be6 {
    public static final /* synthetic */ yy7[] Q0;
    public final Object A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public wj9 E0;
    public boolean F0;
    public final nk G0;
    public boolean H0;
    public ck9 I0;
    public final tcf J0;
    public final hbd K0;
    public final tcf L0;
    public final hbd M0;
    public final Object N0;
    public final Rect O0;
    public final Object P0;
    public int a;
    public final ImageView b;
    public dk9 c;
    public final fk9 d;
    public final int o;
    public final Object s0;
    public final Object t0;
    public final xcf u0;
    public final ImageView v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public final Object z0;

    static {
        z8a z8aVar = new z8a(ik9.class, "isVideoMessageEnabled", "isVideoMessageEnabled()Z");
        vid.a.getClass();
        Q0 = new yy7[]{z8aVar};
    }

    public ik9(Context context) {
        super(context, null, 0, 0);
        float f = 4;
        this.a = kti.d(vw4.d().getDisplayMetrics().density * f);
        ImageView imageView = new ImageView(context);
        imageView.setId(zud.U);
        v1a v1aVar = a93.s0;
        imageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView).a().k().b.b));
        float f2 = 28;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        layoutParams.setMargins(kti.d(f * vw4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, this.a);
        imageView.setLayoutParams(layoutParams);
        this.b = imageView;
        fk9 fk9Var = new fk9(context, this);
        fk9Var.setId(zud.T);
        fk9Var.setBackground(null);
        fk9Var.setPadding(0, 0, 0, 0);
        fk9Var.setMaxLines(8);
        vz2.m.b(fk9Var, t75.b);
        fk9Var.setInputType(fk9Var.getInputType() | 16384);
        fk9Var.setImeOptions(268435456);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(kti.d(2 * vw4.d().getDisplayMetrics().density), fk9Var.getLineHeight());
        mfh.l(fk9Var, gradientDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 16;
        float f3 = 6;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f3);
        layoutParams2.setMargins(iD, iD, iD, iD);
        fk9Var.setLayoutParams(layoutParams2);
        fk9Var.setLayerType(1, null);
        GestureDetector gestureDetector = new GestureDetector(context, new kx0(10, this));
        gestureDetector.setIsLongpressEnabled(true);
        fk9Var.setOnTouchListener(new or6(gestureDetector, 2));
        jgh.a(fk9Var);
        this.d = fk9Var;
        this.o = yud.Q0;
        this.s0 = ipi.b(3, new qn2(context, 27, this));
        this.t0 = ipi.b(3, new ns2(context, 16));
        xcf xcfVar = new xcf(null, null);
        xcfVar.a(new int[]{R.attr.state_enabled}, new ShapeDrawable(new OvalShape()));
        xcfVar.a(new int[]{-16842910}, new ShapeDrawable(new OvalShape()));
        this.u0 = xcfVar;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(zud.X);
        float f4 = 36;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density));
        layoutParams3.gravity = 80;
        layoutParams3.setMarginStart(kti.d(12 * vw4.d().getDisplayMetrics().density));
        imageView2.setLayoutParams(layoutParams3);
        this.v0 = imageView2;
        this.w0 = ipi.b(3, new ns2(context, 17));
        this.x0 = ipi.b(3, new uj9(this, 4));
        this.y0 = ipi.b(3, new uj9(this, 5));
        this.z0 = ipi.b(3, new uj9(this, 6));
        this.A0 = ipi.b(3, new uj9(this, 0));
        this.B0 = ipi.b(3, new uj9(this, 1));
        this.C0 = ipi.b(3, new uj9(this, 2));
        this.D0 = ipi.b(3, new uj9(this, 3));
        this.E0 = wj9.a;
        this.G0 = new nk(this);
        this.I0 = new yj9();
        tcf tcfVarA = ucf.a(null);
        this.J0 = tcfVarA;
        this.K0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(0);
        this.L0 = tcfVarA2;
        this.M0 = new hbd(tcfVarA2);
        this.N0 = ipi.b(3, new c38(25));
        this.O0 = new Rect();
        this.P0 = ipi.b(3, new c38(26));
        setId(zud.Z);
        setClipChildren(false);
        setClipToPadding(false);
        int iD2 = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        setPadding(iD2, iD2, iD2, iD2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        setLayoutParams(layoutParams4);
        addView(imageView);
        addView(fk9Var);
        addView(imageView2);
        imageView.setImageResource(yud.U0);
        int i = 1;
        fk9Var.setAccessibilityDelegate(new wj7(i, this));
        fk9Var.addTextChangedListener(new jc5(i, this));
        onThemeChanged(v1aVar.y(this));
    }

    public static LayerDrawable b(ik9 ik9Var) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{ik9Var.u0, ik9Var.getArrowDrawable()});
        float f = 4;
        layerDrawable.setLayerInset(1, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    public static LayerDrawable c(ik9 ik9Var) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{ik9Var.u0, ik9Var.getCheckDrawable()});
        float f = 4;
        layerDrawable.setLayerInset(1, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getArrowDrawable() {
        return (Drawable) this.x0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getCheckDrawable() {
        return (Drawable) this.z0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final LayerDrawable getCheckIcon() {
        return (LayerDrawable) this.A0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getEmojiArrowDownDrawable() {
        return (Drawable) this.D0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getEmojiArrowUpDrawable() {
        return (Drawable) this.C0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final InputFilter getEmptyFilter() {
        return (InputFilter) this.N0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ArrayList<Rect> getGestureExclusionRects() {
        return (ArrayList) this.P0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getMicIcon() {
        return (Drawable) this.B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.y0.getValue();
    }

    private final void setSendActionState(ck9 ck9Var) {
        this.I0 = ck9Var;
        k(a93.s0.y(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    public final void setVideoMsgButtonVisible(boolean z) {
        View view = this.v0;
        ?? r2 = this.w0;
        if (z) {
            fqi.c(this, (View) r2.getValue(), Integer.valueOf(indexOfChild(view)));
            ((View) r2.getValue()).setVisibility(0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(kti.d(6 * vw4.d().getDisplayMetrics().density));
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        if (r2.e()) {
            ((ImageView) r2.getValue()).setVisibility(8);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(kti.d(12 * vw4.d().getDisplayMetrics().density));
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    @Override // defpackage.be6
    public final void a(t75 t75Var) {
        addOnLayoutChangeListener(new pt1(this, 2, t75Var));
    }

    public final void e(boolean z) {
        this.H0 = z;
        fk9 fk9Var = this.d;
        if (z) {
            api.f(fk9Var);
        } else {
            api.e(fk9Var);
        }
    }

    public final void f(CharSequence charSequence) {
        fk9 fk9Var = this.d;
        Editable text = fk9Var.getText();
        if (text == null || charSequence == null) {
            setText(charSequence);
            return;
        }
        int selectionStart = fk9Var.getSelectionStart();
        int selectionEnd = fk9Var.getSelectionEnd();
        int iMax = Math.max(selectionStart, 0);
        int iMax2 = Math.max(selectionEnd, 0);
        int iMin = Math.min(iMax, iMax2);
        int iMax3 = Math.max(iMax, iMax2);
        if (selectionStart == -1 && selectionEnd == -1) {
            text.append(charSequence);
        } else {
            text.replace(iMin, iMax3, charSequence, 0, charSequence.length());
        }
    }

    public final boolean g() {
        Editable text = this.d.getText();
        return text == null || vmf.F(text);
    }

    public final View getAudioRecordAnchor() {
        return this.v0;
    }

    public final int getCursorPosition() {
        return this.d.getSelectionEnd();
    }

    public final Editable getEditableOriginal() {
        return this.d.getText();
    }

    public final wj9 getEmojiExpandableState() {
        return this.E0;
    }

    public final mcf getMessagePosition() {
        return this.M0;
    }

    public final mcf getMessageState() {
        return this.K0;
    }

    public final int getSelectionEnd() {
        return this.d.getSelectionEnd();
    }

    public final int getSelectionStart() {
        return this.d.getSelectionStart();
    }

    public final ck9 getSendActionState() {
        return this.I0;
    }

    public final CharSequence getText() {
        Editable text = this.d.getText();
        if (text != null) {
            return kzi.a(text);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final View getVideoMessageRecordAnchor() {
        ?? r0 = this.w0;
        if (dqi.r(r0)) {
            return (View) r0.getValue();
        }
        return null;
    }

    public final void h(int i) {
        if (i == -1) {
            return;
        }
        fk9 fk9Var = this.d;
        fk9Var.setSelection(Math.min(i, fk9Var.length()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.t0
            boolean r1 = r0.e()
            if (r1 != 0) goto L9
            return
        L9:
            fk9 r1 = r5.d
            android.text.Editable r1 = r1.getText()
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.String r3 = "\n"
            boolean r1 = defpackage.vmf.s(r1, r3, r2)
            r3 = 1
            if (r1 != r3) goto L1c
            goto L1d
        L1c:
            r3 = r2
        L1d:
            boolean r1 = r5.g()
            ubf r4 = defpackage.ubf.b
            if (r1 == 0) goto L48
            boolean r1 = r5.F0
            if (r1 != 0) goto L48
            if (r3 == 0) goto L2c
            goto L48
        L2c:
            boolean r1 = r5.H0
            if (r1 == 0) goto L3c
            r5.H0 = r2
            java.lang.Object r0 = r0.getValue()
            wbf r0 = (defpackage.wbf) r0
            r0.setExpandableState(r4)
            return
        L3c:
            java.lang.Object r0 = r0.getValue()
            wbf r0 = (defpackage.wbf) r0
            ubf r1 = defpackage.ubf.a
            r0.setExpandableState(r1)
            return
        L48:
            java.lang.Object r0 = r0.getValue()
            wbf r0 = (defpackage.wbf) r0
            r0.setExpandableState(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik9.i():void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void j() {
        ?? r0 = this.s0;
        if (r0.e()) {
            ImageView imageView = (ImageView) r0.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView).a().k().b.b));
        }
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, k18] */
    public final void k(yeb yebVar) {
        wj9 wj9Var;
        v1a v1aVar = a93.s0;
        ck9 ck9Var = this.I0;
        boolean zG = g();
        bk9 bk9Var = bk9.a;
        ImageView imageView = this.v0;
        if (zG && fni.a(ck9Var, bk9Var)) {
            cei.k(getCheckDrawable(), yebVar.c().b.a.b);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setImageDrawable(getCheckIcon());
            imageView.setEnabled(false);
            setVideoMsgButtonVisible(false);
        } else {
            boolean zA = fni.a(ck9Var, ak9.a);
            xcf xcfVar = this.u0;
            if (zA || fni.a(ck9Var, bk9Var)) {
                xcfVar.setState(new int[]{R.attr.state_enabled});
                imageView.setPadding(0, 0, 0, 0);
                Drawable checkDrawable = getCheckDrawable();
                yebVar.getIcon();
                cei.k(checkDrawable, -1);
                imageView.setImageDrawable(getCheckIcon());
                imageView.setEnabled(true);
                setVideoMsgButtonVisible(false);
            } else if (g() && (wj9Var = this.E0) != wj9.a) {
                Drawable emojiArrowDownDrawable = wj9Var == wj9.b ? getEmojiArrowDownDrawable() : getEmojiArrowUpDrawable();
                imageView.setImageDrawable(emojiArrowDownDrawable);
                cei.k(emojiArrowDownDrawable, v1aVar.y(this).a().k().b.b);
                setVideoMsgButtonVisible(false);
            } else if (g() && (ck9Var instanceof yj9)) {
                ((yj9) ck9Var).getClass();
                if (ek9.$EnumSwitchMapping$0[az1.v(1)] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                cei.k(getMicIcon(), v1aVar.y(this).a().k().b.b);
                if (imageView.getDrawable() == getMicIcon()) {
                    return;
                }
                imageView.setImageDrawable(getMicIcon());
                imageView.setEnabled(true);
                u45.n(4, vw4.d().getDisplayMetrics().density, imageView);
                ?? r11 = this.w0;
                if (r11.e()) {
                    yy7 yy7Var = Q0[0];
                    setVideoMsgButtonVisible(((Boolean) this.G0.b).booleanValue());
                }
            } else {
                if (imageView.getDrawable() != getSendIcon()) {
                    xcfVar.setState(new int[]{R.attr.state_enabled});
                    imageView.setImageDrawable(getSendIcon());
                    imageView.setPadding(0, 0, 0, 0);
                    imageView.setEnabled(true);
                }
                Drawable arrowDrawable = getArrowDrawable();
                yebVar.getIcon();
                cei.k(arrowDrawable, -1);
                setVideoMsgButtonVisible(false);
            }
        }
        i();
        imageView.invalidate();
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        String[] strArrG = hfh.g(this);
        if (strArrG == null || editorInfo == null) {
            return inputConnectionOnCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArrG;
        return new jm7(inputConnectionOnCreateInputConnection, new sl6(6, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && Build.VERSION.SDK_INT >= 29) {
            getGestureExclusionRects().clear();
            ImageView imageView = this.v0;
            float f = 12;
            int iC = u45.c(f, vw4.d().getDisplayMetrics().density, imageView.getLeft());
            int iC2 = u45.c(f, vw4.d().getDisplayMetrics().density, imageView.getTop());
            int iC3 = u45.c(f, vw4.d().getDisplayMetrics().density, imageView.getRight());
            int iC4 = u45.c(f, vw4.d().getDisplayMetrics().density, imageView.getBottom());
            Rect rect = this.O0;
            rect.set(iC, iC2, iC3, iC4);
            getGestureExclusionRects().add(rect);
            setSystemGestureExclusionRects(getGestureExclusionRects());
        }
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        TouchDelegate touchDelegate = getTouchDelegate();
        mm3 mm3Var = touchDelegate instanceof mm3 ? (mm3) touchDelegate : null;
        if (mm3Var != null) {
            mm3Var.a.clear();
        }
        float f = 10;
        e5j.a(this, this.b, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f));
        float f2 = 12;
        e5j.a(this, this.d, 0, kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density));
        float f3 = 6;
        e5j.a(this, this.v0, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3));
        ?? r1 = this.s0;
        if (r1.e()) {
            e5j.a(this, (ImageView) r1.getValue(), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f * vw4.d().getDisplayMetrics().density));
        }
        ?? r12 = this.w0;
        if (r12.e()) {
            e5j.a(this, (ImageView) r12.getValue(), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3));
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Paint paint;
        Paint paint2;
        v1a v1aVar = a93.s0;
        setBackgroundColor(v1aVar.y(this).a().k().a.d);
        this.b.setImageTintList(ColorStateList.valueOf(v1aVar.y(this).a().k().b.b));
        int i = yebVar.getText().e;
        fk9 fk9Var = this.d;
        fk9Var.setTextColor(i);
        fk9Var.setHintTextColor(zob.b(yebVar.getText().i, 0.4f));
        Drawable drawableF = mfh.f(fk9Var);
        GradientDrawable gradientDrawable = drawableF instanceof GradientDrawable ? (GradientDrawable) drawableF : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(yebVar.getText().j));
        }
        Editable text = fk9Var.getText();
        if (text != null) {
            for (Object obj : text.getSpans(0, text.length(), Object.class)) {
                if (obj instanceof fj9) {
                    ((fj9) obj).b = v1aVar.y(fk9Var).a().i().d.b;
                } else if (obj instanceof b88) {
                    ((b88) obj).a = yebVar.getText().j;
                } else if (obj instanceof d88) {
                    ((d88) obj).b = yebVar.getText().j;
                } else if (obj instanceof u6g) {
                    ((u6g) obj).onThemeChanged(yebVar);
                }
            }
        }
        t2i.c(fk9Var, yebVar);
        int[] iArr = {R.attr.state_enabled};
        xcf xcfVar = this.u0;
        Drawable drawableD = pbj.d(xcfVar, iArr);
        ShapeDrawable shapeDrawable = drawableD instanceof ShapeDrawable ? (ShapeDrawable) drawableD : null;
        if (shapeDrawable != null && (paint2 = shapeDrawable.getPaint()) != null) {
            paint2.setColor(yebVar.b().a.n);
        }
        Drawable drawableD2 = pbj.d(xcfVar, new int[]{-16842910});
        ShapeDrawable shapeDrawable2 = drawableD2 instanceof ShapeDrawable ? (ShapeDrawable) drawableD2 : null;
        if (shapeDrawable2 != null && (paint = shapeDrawable2.getPaint()) != null) {
            paint.setColor(-16776961);
        }
        k(yebVar);
        j();
        invalidate();
    }

    public final void setCustomSelectionActionModeCallback(em6 em6Var) {
        fk9 fk9Var = this.d;
        fk9Var.setCustomSelectionActionModeCallback((ActionMode.Callback) em6Var.invoke(fk9Var));
    }

    public final void setEmojiExpandableState(wj9 wj9Var) {
        this.E0 = wj9Var;
        k(a93.s0.y(this));
    }

    public final void setInputEnabled(boolean z) {
        fk9 fk9Var = this.d;
        if (z) {
            fk9Var.setFilters(new InputFilter[0]);
        } else {
            fk9Var.setFilters(new InputFilter[]{getEmptyFilter()});
        }
    }

    public final void setInputHint(CharSequence charSequence) {
        this.d.setHint(charSequence);
    }

    public final void setInputKeyListener(View.OnKeyListener onKeyListener) {
        this.d.setOnKeyListener(onKeyListener);
    }

    public final void setKeyboardVisible(boolean z) {
        this.F0 = z;
        i();
    }

    public final void setLeftIcon(int i) {
        this.b.setImageResource(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setLeftInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setLeftOuterIconOnClickListener(cm6 cm6Var) {
        f8j.d((View) this.t0.getValue(), 300L, new x6(7, cm6Var));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setLeftOuterIconText(CharSequence charSequence) {
        ?? r0 = this.t0;
        fqi.c(this, (View) r0.getValue(), 0);
        ((wbf) r0.getValue()).setText(charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setLeftOuterIconVisible(boolean z) {
        ?? r0 = this.t0;
        if (z) {
            fqi.c(this, (View) r0.getValue(), 0);
        } else if (r0.e()) {
            removeView((View) r0.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        ?? r0 = this.s0;
        if (onTouchListener != null) {
            ((ImageView) r0.getValue()).setOnTouchListener(onTouchListener);
        } else if (r0.e()) {
            ((ImageView) r0.getValue()).setOnTouchListener(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setRightInnerIconVisible(boolean z) {
        ?? r0 = this.s0;
        if (z) {
            fqi.c(this, (View) r0.getValue(), Integer.valueOf(indexOfChild(this.d) + 1));
            j();
        } else if (r0.e()) {
            removeView((View) r0.getValue());
        }
    }

    public final void setRightOuterIconActionState(ck9 ck9Var) {
        setSendActionState(ck9Var);
    }

    public final void setRightOuterIconEnabled(boolean z) {
        this.v0.setEnabled(z);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightOuterIconTouchListener(View.OnTouchListener onTouchListener) {
        this.v0.setOnTouchListener(onTouchListener);
    }

    public final void setSelection(int i) {
        if (i >= 0) {
            fk9 fk9Var = this.d;
            if (i <= fk9Var.length()) {
                fk9Var.setSelection(i);
            }
        }
    }

    public final void setText(CharSequence charSequence) {
        fk9 fk9Var = this.d;
        if (charSequence == null) {
            Editable text = fk9Var.getText();
            if (text != null) {
                text.clear();
                return;
            }
            return;
        }
        Editable spannableStringBuilder = charSequence instanceof Editable ? (Editable) charSequence : null;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        for (luc lucVar : (luc[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), luc.class)) {
            lucVar.a.c = a93.s0.x(getContext()).k().a().r();
            kuc kucVar = lucVar.a;
            kucVar.getClass();
            kucVar.f = new wsc(1, new WeakReference(fk9Var));
        }
        fk9Var.setText(spannableStringBuilder);
    }

    public final void setTextSelectionListener(dk9 dk9Var) {
        this.c = dk9Var;
    }

    public final void setVideoMessageEnabled(boolean z) {
        this.G0.O(this, Q0[0], Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void setVideoMessageTouchListener(View.OnTouchListener onTouchListener) {
        ?? r0 = this.w0;
        if (onTouchListener != null) {
            ((ImageView) r0.getValue()).setOnTouchListener(onTouchListener);
        } else if (r0.e()) {
            ((ImageView) r0.getValue()).setOnTouchListener(null);
        }
    }

    public final void setInputHint(int i) {
        this.d.setHint(i);
    }
}
