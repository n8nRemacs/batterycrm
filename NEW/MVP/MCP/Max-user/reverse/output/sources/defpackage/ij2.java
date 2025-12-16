package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.Iterator;
import java.util.Map;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ij2 {
    public final hj2 C;
    public final Context a;
    public final b31 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final bwf j;
    public final bwf k;
    public final bwf l;
    public final bwf m;
    public final bwf n;
    public final bwf o;
    public final bwf p;
    public final bwf q;
    public final bwf r;
    public final bwf s;
    public final bwf t;
    public final bwf u;
    public final bwf v;
    public final bwf x;
    public final bwf z;
    public final bwf w = new bwf(new zb2(6));
    public final bwf y = new bwf(new zb2(7));
    public final fj2 A = new fj2(this);
    public final String B = ij2.class.getName();

    public ij2(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, Context context, lzf lzfVar, b31 b31Var) {
        this.a = context;
        this.b = b31Var;
        this.c = k18Var2;
        this.d = k18Var;
        this.e = k18Var4;
        this.f = k18Var3;
        this.g = k18Var5;
        this.h = k18Var6;
        this.i = k18Var7;
        final int i = 0;
        this.j = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i2);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i3 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i3);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i4 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i4);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i5 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i5);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i6 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i6);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i7 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i7);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i8 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i8);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i9 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i9);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i2 = 13;
        this.k = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i3 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i3);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i4 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i4);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i5 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i5);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i6 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i6);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i7 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i7);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i8 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i8);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i9 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i9);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i3 = 14;
        this.l = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i4 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i4);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i5 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i5);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i6 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i6);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i7 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i7);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i8 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i8);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i9 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i9);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i4 = 1;
        this.m = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i5 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i5);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i6 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i6);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i7 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i7);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i8 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i8);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i9 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i9);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i5 = 2;
        this.n = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i6 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i6);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i7 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i7);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i8 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i8);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i9 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i9);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i6 = 3;
        this.o = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i7 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i7);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i8 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i8);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i9 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i9);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i7 = 4;
        this.p = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i8 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i8);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i9 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i9);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i8 = 5;
        this.q = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i82 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i82);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i9 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i9);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i9 = 6;
        this.r = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i82 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i82);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i92 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i92);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i10 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i10);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i10 = 7;
        this.s = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i82 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i82);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i92 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i92);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i102 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i102);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i11 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i11);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i11 = 8;
        this.t = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i82 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i82);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i92 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i92);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i102 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i102);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i112 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i112);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i12 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i12);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i12 = 9;
        this.u = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i82 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i82);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i92 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i92);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i102 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i102);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i112 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i112);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i122 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i122);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i13 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i13);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i13 = 10;
        this.v = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i82 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i82);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i92 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i92);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i102 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i102);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i112 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i112);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i122 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i122);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i132 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i132);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i14 = 11;
        this.x = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i82 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i82);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i92 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i92);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i102 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i102);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i112 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i112);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i122 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i122);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i132 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i132);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        final int i15 = 12;
        this.z = new bwf(new cm6(this) { // from class: bj2
            public final /* synthetic */ ij2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        int i22 = yud.S1;
                        Context context2 = this.b.a;
                        Drawable drawableA = eri.a(context2, i22);
                        if (drawableA == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA, ctd.f(a93.s0, context2).j);
                        return drawableA;
                    case 1:
                        int i32 = yud.l1;
                        Context context3 = this.b.a;
                        Drawable drawableA2 = eri.a(context3, i32);
                        if (drawableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA2, ctd.f(a93.s0, context3).j);
                        return drawableA2;
                    case 2:
                        int i42 = yud.Q;
                        Context context4 = this.b.a;
                        Drawable drawableA3 = eri.a(context4, i42);
                        if (drawableA3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA3, ctd.f(a93.s0, context4).j);
                        return drawableA3;
                    case 3:
                        int i52 = yud.v1;
                        Context context5 = this.b.a;
                        Drawable drawableA4 = eri.a(context5, i52);
                        if (drawableA4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA4, ctd.f(a93.s0, context5).j);
                        return drawableA4;
                    case 4:
                        int i62 = yud.g2;
                        Context context6 = this.b.a;
                        Drawable drawableA5 = eri.a(context6, i62);
                        if (drawableA5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA5, ctd.f(a93.s0, context6).j);
                        return drawableA5;
                    case 5:
                        int i72 = yud.A0;
                        Context context7 = this.b.a;
                        Drawable drawableA6 = eri.a(context7, i72);
                        if (drawableA6 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA6, ctd.f(a93.s0, context7).j);
                        return drawableA6;
                    case 6:
                        int i82 = yud.B0;
                        Context context8 = this.b.a;
                        Drawable drawableA7 = eri.a(context8, i82);
                        if (drawableA7 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA7, ctd.f(a93.s0, context8).j);
                        return drawableA7;
                    case 7:
                        int i92 = yud.u1;
                        Context context9 = this.b.a;
                        Drawable drawableA8 = eri.a(context9, i92);
                        if (drawableA8 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA8, ctd.f(a93.s0, context9).c);
                        return drawableA8;
                    case 8:
                        int i102 = yud.e2;
                        Context context10 = this.b.a;
                        Drawable drawableA9 = eri.a(context10, i102);
                        if (drawableA9 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA9, ctd.f(a93.s0, context10).c);
                        return drawableA9;
                    case 9:
                        int i112 = yud.D1;
                        Context context11 = this.b.a;
                        Drawable drawableA10 = eri.a(context11, i112);
                        if (drawableA10 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA10, ctd.f(a93.s0, context11).b);
                        return drawableA10;
                    case 10:
                        return new FitFontImageSpan(new v5g(this.b.a), a16.a, false, false, 12, null);
                    case 11:
                        return new FitFontImageSpan(new pgf(this.b.a), a16.a, false, false, 12, null);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return new FitFontImageSpan(new ey5(this.b.a), a16.a, false, false, 12, null);
                    case 13:
                        int i122 = yud.q;
                        Context context12 = this.b.a;
                        Drawable drawableA11 = eri.a(context12, i122);
                        if (drawableA11 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA11, ctd.f(a93.s0, context12).j);
                        return drawableA11;
                    default:
                        int i132 = yud.z;
                        Context context13 = this.b.a;
                        Drawable drawableA12 = eri.a(context13, i132);
                        if (drawableA12 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cei.k(drawableA12, ctd.f(a93.s0, context13).j);
                        return drawableA12;
                }
            }
        });
        this.C = new hj2(k18Var2, k18Var, this);
        context.registerComponentCallbacks(new cj2(0, this));
        gw0.w(new g56((hbd) a93.s0.x(context).Y, new gj2(this, null), 1), d7j.a(((q2b) lzfVar).c()));
    }

    public static /* synthetic */ SpannableString f(ij2 ij2Var, pb2 pb2Var, eh9 eh9Var, int i) {
        return ij2Var.e(pb2Var, eh9Var, i, false);
    }

    public final boolean a(int i, pb2 pb2Var, eh9 eh9Var, SpannableStringBuilder spannableStringBuilder, boolean z) {
        v1a v1aVar = a93.s0;
        if (i == 1 || z) {
            return false;
        }
        si9 si9Var = eh9Var.a;
        ku3 ku3Var = eh9Var.b;
        if (si9Var.D()) {
            return false;
        }
        Context context = this.a;
        if (ku3Var != null && ku3Var.p() == ((Number) this.b.invoke()).longValue()) {
            if (!pb2Var.N()) {
                return false;
            }
            gbj.b(spannableStringBuilder, az1.i(context.getString(fvd.K), ":"), new l7g(v1aVar.x(context).k(), new gf1(11)));
            spannableStringBuilder.append((char) 8288);
            gbj.a(spannableStringBuilder, (char) 8203, new h7f(kti.d(6 * vw4.d().getDisplayMetrics().density)));
            spannableStringBuilder.append((char) 8288);
            return true;
        }
        if (!pb2Var.N()) {
            return false;
        }
        gxa gxaVar = new gxa(context);
        gxaVar.b(fui.a(ku3Var.o(), Long.valueOf(ku3Var.p())), ku3Var.r(il0.a));
        gbj.a(spannableStringBuilder, (char) 8203, new FitFontImageSpan(gxaVar, null, false, false, 14, null));
        spannableStringBuilder.append((char) 8288);
        gbj.a(spannableStringBuilder, (char) 8203, new h7f(kti.d(4 * vw4.d().getDisplayMetrics().density)));
        spannableStringBuilder.append((char) 8288);
        gbj.b(spannableStringBuilder, String.valueOf(ku3Var.e()), new l7g(v1aVar.x(context).k(), new gf1(13)));
        spannableStringBuilder.append((char) 8288);
        if (ku3Var.x()) {
            spannableStringBuilder.append(" ");
            spannableStringBuilder.setSpan(new yzg(context, 1, true, u1j.d), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((char) 8288);
        }
        gbj.b(spannableStringBuilder, ":", new l7g(v1aVar.x(context).k(), new gf1(14)));
        spannableStringBuilder.append((char) 8288);
        gbj.a(spannableStringBuilder, (char) 8203, new h7f(kti.d(6 * vw4.d().getDisplayMetrics().density)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.text.SpannableStringBuilder r21, defpackage.eh9 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij2.b(android.text.SpannableStringBuilder, eh9, boolean):void");
    }

    public final void c(int i, pb2 pb2Var, eh9 eh9Var, SpannableStringBuilder spannableStringBuilder, boolean z) {
        Object next;
        s7c s7cVar;
        Object[] spans;
        si9 si9Var = eh9Var.a;
        CharSequence charSequence = null;
        Object[] spans2 = null;
        CharSequence charSequence2 = null;
        strA = null;
        String strA = null;
        charSequence = null;
        if (si9Var == null) {
            wqi.e(this.B, "Empty MessageDb while process message", null);
            return;
        }
        if (si9Var.J()) {
            CharSequence charSequenceF = ((l6g) this.e.getValue()).f(this.a, (f7b) this.d.getValue(), eh9Var.a, false, true, true, false, ((Number) this.b.invoke()).longValue(), false);
            if (charSequenceF != null) {
                spannableStringBuilder.append(charSequenceF);
                return;
            }
            return;
        }
        if (si9Var.C()) {
            spannableStringBuilder.append(l6g.j(this.a, si9Var.j(), (qu3) this.g.getValue(), false, false));
            return;
        }
        if (si9Var.I()) {
            d7c d7cVar = eh9Var.o;
            d7cVar.f = pb2Var;
            f7b f7bVar = d7cVar.a;
            d7cVar.j(pb2Var, f7bVar.g(), f7bVar.f());
            CharSequence charSequence3 = d7cVar.g;
            if (charSequence3 != null) {
                int i2 = m7f.a;
                m7f m7fVarZ = uha.z(charSequence3);
                try {
                    spans = m7fVarZ.getSpans(0, m7fVarZ.length(), ClickableSpan.class);
                } catch (Throwable unused) {
                    spans = null;
                }
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
                if (clickableSpanArr != null) {
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        m7fVarZ.removeSpan(clickableSpan);
                    }
                }
                try {
                    spans2 = m7fVarZ.getSpans(0, m7fVarZ.length(), URLSpan.class);
                } catch (Throwable unused2) {
                }
                URLSpan[] uRLSpanArr = (URLSpan[]) spans2;
                if (uRLSpanArr != null) {
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        m7fVarZ.removeSpan(uRLSpan);
                    }
                }
                charSequence2 = m7fVarZ;
            }
            if (charSequence2 != null) {
                spannableStringBuilder.append(charSequence2);
                return;
            }
            return;
        }
        if (si9Var.D()) {
            d10 d10VarK = si9Var.k();
            if ((d10VarK != null ? d10VarK.a : null) == c10.t0) {
                if (!z) {
                    gbj.a(spannableStringBuilder, (char) 8203, new h7f(kti.d(6 * vw4.d().getDisplayMetrics().density)));
                    spannableStringBuilder.append((char) 8288);
                }
                spannableStringBuilder.append(this.a.getString(avd.x0));
                spannableStringBuilder.append(": ");
                spannableStringBuilder.append(f(this, pb2Var, eh9Var.d, 1));
                return;
            }
        }
        if (si9Var.M()) {
            q2i q2iVarR = si9Var.r();
            CharSequence charSequence4 = q2iVarR != null ? (String) q2iVarR.a().a : null;
            if (q2iVarR != null) {
                Iterator it = q2iVarR.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    l2i l2iVar = (l2i) next;
                    if (l2iVar.a == k2i.o && (s7cVar = l2iVar.b) != null && ((String) s7cVar.a).length() > 0) {
                        break;
                    }
                }
                l2i l2iVar2 = (l2i) next;
                if (l2iVar2 != null) {
                    strA = l2iVar2.a();
                }
            }
            spannableStringBuilder.append(charSequence4);
            if (strA == null || strA.length() == 0) {
                return;
            }
            spannableStringBuilder.append(". ");
            spannableStringBuilder.append((CharSequence) strA);
            return;
        }
        if (si9Var.B()) {
            spannableStringBuilder.append(l6g.h(this.a, si9Var, false, true, ((Number) this.b.invoke()).longValue()));
            return;
        }
        if (si9Var.v() && ((u07) this.i.getValue()).a(si9Var)) {
            spannableStringBuilder.append(this.a.getString(avd.e));
            return;
        }
        if (si9Var.v() && eh9Var.b() != null) {
            eh9 eh9VarB = eh9Var.b();
            while (eh9VarB.b() != null) {
                eh9VarB = eh9VarB.b();
            }
            spannableStringBuilder.append(e(pb2Var, eh9VarB, i, true));
            return;
        }
        if (i == 2) {
            pb2Var.o0();
            CharSequence charSequence5 = pb2Var.u0;
            if (charSequence5 != null && charSequence5.length() != 0) {
                charSequence = charSequence5;
            }
            if (charSequence != null) {
                spannableStringBuilder.append(charSequence);
                return;
            }
            return;
        }
        if (i == 1) {
            int iD = (int) (sw4.d(dpg.i.e(t75.b)) * vw4.d().getDisplayMetrics().density);
            d7c d7cVar2 = eh9Var.o;
            d7cVar2.f = pb2Var;
            f7b f7bVar2 = d7cVar2.a;
            si9 si9Var2 = d7cVar2.d;
            if (!d7cVar2.p) {
                d7cVar2.j = f7bVar2.k(f7bVar2.j.b(iD, d7cVar2.a(pb2Var, si9Var2)), si9Var2.N0, iD);
                d7cVar2.p = true;
            }
            CharSequence charSequence6 = d7cVar2.j;
            if (charSequence6 != null) {
                spannableStringBuilder.append(charSequence6);
            }
        }
    }

    public final CharSequence d(pb2 pb2Var) {
        Object objC = this.A.c(new dj2(pb2Var));
        CharSequence charSequence = (CharSequence) objC;
        if (charSequence == null || vmf.F(charSequence)) {
            objC = null;
        }
        CharSequence charSequence2 = (CharSequence) objC;
        if (charSequence2 == null) {
            if (pb2Var.b.e(((Number) this.b.invoke()).longValue())) {
                return this.a.getString(fvd.y);
            }
        }
        return charSequence2;
    }

    public final SpannableString e(pb2 pb2Var, eh9 eh9Var, int i, boolean z) {
        Object ipdVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            boolean z2 = a(i, pb2Var, eh9Var, spannableStringBuilder, z) || spannableStringBuilder.length() == 0;
            b(spannableStringBuilder, eh9Var, z2);
            c(i, pb2Var, eh9Var, spannableStringBuilder, z2);
            ipdVar = qqg.a;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(this.B, "FAILURE process last message for chatRow", thA);
            ((j94) this.h.getValue()).a("ONEME-16071", new IllegalStateException("FAILURE process last message for chatRow", thA));
        }
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ep8.class)) {
            spannableStringBuilder.removeSpan((ep8) obj);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final CharSequence g(long j) {
        m8a m8aVar;
        Map mapA = ((ij7) this.c.getValue()).a(j);
        if (mapA == null) {
            return null;
        }
        if (mapA.isEmpty()) {
            m8aVar = zj8.a;
        } else {
            m8a m8aVar2 = new m8a(mapA.size());
            for (Map.Entry entry : mapA.entrySet()) {
                m8aVar2.f(((Number) entry.getKey()).longValue(), entry.getValue());
            }
            m8aVar = m8aVar2;
        }
        if (m8aVar == null) {
            return null;
        }
        return (CharSequence) this.C.c(new ej2(j, m8aVar));
    }
}
