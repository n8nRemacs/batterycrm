package com.avito.android.lib.deprecated_design.input;

import Y61.k;
import android.content.Context;
import android.graphics.Paint;
import com.avito.android.R;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.TypefaceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: TextPainter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/input/j;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f178036u;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextInputView f178037a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f178038b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f178039c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f178040d;

    /* renamed from: e, reason: collision with root package name */
    public int f178041e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final i f178042f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Paint f178043g;

    /* renamed from: h, reason: collision with root package name */
    public final float f178044h;

    /* renamed from: i, reason: collision with root package name */
    public final float f178045i;

    /* renamed from: j, reason: collision with root package name */
    public final float f178046j;

    /* renamed from: k, reason: collision with root package name */
    public final int f178047k;

    /* renamed from: l, reason: collision with root package name */
    public final int f178048l;

    /* renamed from: m, reason: collision with root package name */
    public final int f178049m;

    /* renamed from: n, reason: collision with root package name */
    public float f178050n;

    /* renamed from: o, reason: collision with root package name */
    public int f178051o;

    /* renamed from: p, reason: collision with root package name */
    public float f178052p;

    /* renamed from: q, reason: collision with root package name */
    public float f178053q;

    /* renamed from: r, reason: collision with root package name */
    public float f178054r;

    /* renamed from: s, reason: collision with root package name */
    public float f178055s;

    /* renamed from: t, reason: collision with root package name */
    public float f178056t;

    static {
        Y y12 = new Y(j.class, "hasFocus", "getHasFocus()Z", 0);
        n0 n0Var = m0.f406844a;
        f178036u = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(j.class, "hasError", "getHasError()Z", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(j.class, "fraction", "getFraction()F", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(j.class, "text", "getText()Ljava/lang/CharSequence;", 0, n0Var)};
    }

    public j(@k TextInputView textInputView) {
        this.f178037a = textInputView;
        kotlin.properties.c cVar = kotlin.properties.c.f406879a;
        this.f178038b = new f(this);
        this.f178039c = new g(this);
        this.f178040d = new h(this);
        this.f178042f = new i(this);
        Context context = textInputView.getContext();
        Paint paint = new Paint();
        this.f178043g = paint;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_input_hint_expanded_size);
        this.f178044h = dimensionPixelSize;
        this.f178045i = context.getResources().getDimensionPixelSize(R.dimen.text_input_hint_collapsed_size);
        this.f178046j = context.getResources().getDimensionPixelSize(R.dimen.text_input_small_padding);
        this.f178047k = C35835l0.d(R.attr.blue, context);
        this.f178048l = C35835l0.d(R.attr.red, context);
        int iD2 = C35835l0.d(R.attr.gray28, context);
        this.f178049m = iD2;
        this.f178050n = dimensionPixelSize;
        this.f178051o = iD2;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.LEFT);
        TypefaceType typefaceType = TypefaceType.f318743c;
        int i12 = C35777d6.f318863a;
        paint.setTypeface(androidx.core.content.res.i.c(C35835l0.j(R.attr.fontRegular, context), context));
    }

    public final float a() {
        return this.f178040d.getValue(this, f178036u[2]).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r8 = this;
            float r0 = r8.a()
            float r1 = r8.f178044h
            float r2 = r8.f178045i
            float r0 = androidx.appcompat.app.r.c(r1, r2, r0, r2)
            r8.f178050n = r0
            r0 = 1
            kotlin.reflect.n<java.lang.Object>[] r1 = com.avito.android.lib.deprecated_design.input.j.f178036u
            r0 = r1[r0]
            com.avito.android.lib.deprecated_design.input.g r2 = r8.f178039c
            java.lang.Object r0 = r2.getValue(r8, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            int r0 = r8.f178048l
            goto L90
        L24:
            float r0 = r8.a()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            int r2 = r8.f178049m
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L32
            goto L3a
        L32:
            float r0 = r8.a()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4d
        L3a:
            r0 = 0
            r0 = r1[r0]
            com.avito.android.lib.deprecated_design.input.f r1 = r8.f178038b
            java.lang.Object r0 = r1.getValue(r8, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4d
            r0 = r2
            goto L90
        L4d:
            float r0 = r8.a()
            float r3 = r3 - r0
            int r1 = r8.f178047k
            int r4 = android.graphics.Color.alpha(r1)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r5 = android.graphics.Color.alpha(r2)
            float r5 = (float) r5
            float r5 = r5 * r0
            float r5 = r5 + r4
            int r4 = android.graphics.Color.red(r1)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r6 = android.graphics.Color.red(r2)
            float r6 = (float) r6
            float r6 = r6 * r0
            float r6 = r6 + r4
            int r4 = android.graphics.Color.green(r1)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r7 = android.graphics.Color.green(r2)
            float r7 = (float) r7
            float r7 = r7 * r0
            float r7 = r7 + r4
            int r1 = android.graphics.Color.blue(r1)
            float r1 = (float) r1
            float r1 = r1 * r3
            int r2 = android.graphics.Color.blue(r2)
            float r2 = (float) r2
            float r2 = r2 * r0
            float r2 = r2 + r1
            int r0 = (int) r5
            int r1 = (int) r6
            int r3 = (int) r7
            int r2 = (int) r2
            int r0 = android.graphics.Color.argb(r0, r1, r3, r2)
        L90:
            r8.f178051o = r0
            float r0 = r8.f178056t
            float r1 = r8.f178055s
            float r2 = r8.a()
            float r0 = androidx.appcompat.app.r.c(r1, r0, r2, r0)
            r8.f178053q = r0
            android.graphics.Paint r0 = r8.f178043g
            float r1 = r8.f178050n
            r0.setTextSize(r1)
            int r1 = r8.f178051o
            r0.setColor(r1)
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r0 = androidx.core.view.C22823h0.f45055a
            com.avito.android.lib.deprecated_design.input.TextInputView r0 = r8.f178037a
            r0.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.deprecated_design.input.j.b():void");
    }
}
