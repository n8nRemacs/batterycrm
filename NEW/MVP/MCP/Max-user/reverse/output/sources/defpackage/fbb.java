package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fbb extends FrameLayout implements u6g {
    public static final /* synthetic */ int H0 = 0;
    public final Object A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public final Object E0;
    public final ValueAnimator F0;
    public final ValueAnimator G0;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public String o;
    public bbb s0;
    public cbb t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public dbb z0;

    public fbb(final Context context) {
        super(context, null);
        this.a = getResources().getDimensionPixelSize(fwc.spacing_size_s);
        this.b = getResources().getDimensionPixelSize(fwc.spacing_size_l);
        this.c = getResources().getDimensionPixelSize(fwc.spacing_size_xl);
        this.o = getResources().getString(b5d.oneme_search_view_default_hint);
        this.s0 = bbb.a;
        this.u0 = true;
        this.v0 = true;
        this.w0 = true;
        this.x0 = true;
        this.y0 = true;
        this.z0 = dbb.a;
        final int i = 0;
        this.A0 = ipi.b(3, new cm6() { // from class: xab
            /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(zud.x0);
                        int iD = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
                        layoutParams.gravity = 8388627;
                        final fbb fbbVar = this;
                        layoutParams.leftMargin = fbbVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iD2 = kti.d(1 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD2, iD2, iD2, iD2);
                        appCompatImageView.setImageResource(yud.f0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView).getIcon().f));
                        final int i2 = 1;
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i2) {
                                    case 0:
                                        fbbVar.d();
                                        break;
                                    case 1:
                                        fbb fbbVar2 = fbbVar;
                                        fbbVar2.b();
                                        cbb cbbVar = fbbVar2.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final w3b w3bVar = new w3b(context, 12);
                        w3bVar.setId(zud.y0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        fbb fbbVar2 = this;
                        int i3 = fbbVar2.c;
                        layoutParams2.leftMargin = utb.j(30, vw4.d().getDisplayMetrics().density, i3, i3);
                        int i4 = fbbVar2.a;
                        layoutParams2.topMargin = i4;
                        layoutParams2.bottomMargin = i4;
                        w3bVar.setLayoutParams(layoutParams2);
                        w3bVar.setClipToOutline(true);
                        w3bVar.setOutlineProvider(new u74(kti.d(10 * vw4.d().getDisplayMetrics().density)));
                        w3bVar.setImeOptions(3);
                        w3bVar.setText(fbbVar2.d);
                        int i5 = fbbVar2.b;
                        w3bVar.setPadding(i3, i5, kti.d(40 * vw4.d().getDisplayMetrics().density), i5);
                        v1a v1aVar = a93.s0;
                        w3bVar.setBackgroundColor(v1aVar.y(w3bVar).b().a.h);
                        dpg.h.b(w3bVar, t75.b);
                        Drawable drawableF = mfh.f(w3bVar);
                        if (drawableF != null) {
                            cei.k(drawableF, v1aVar.y(w3bVar).getText().j);
                        }
                        w3bVar.setHintTextColor(v1aVar.y(w3bVar).getText().g);
                        w3bVar.setTextColor(v1aVar.y(w3bVar).getText().e);
                        w3bVar.setSingleLine();
                        w3bVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: abb
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                api.e(w3bVar);
                                return true;
                            }
                        });
                        mgb.a(w3bVar, new r98(11, w3bVar, w3bVar));
                        w3bVar.addTextChangedListener(new p3(4, fbbVar2));
                        fbbVar2.addView(w3bVar);
                        return w3bVar;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(zud.A0);
                        int iD3 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iD3, iD3);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iD4 = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD4, iD4, iD4, iD4);
                        appCompatImageView2.setImageResource(yud.K0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView2).getIcon().f));
                        final int i6 = 0;
                        final fbb fbbVar3 = this;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        fbbVar3.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar3;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar3.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar3.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, null);
                        imageView.setId(zud.B0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iD5 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD5, iD5, iD5, iD5);
                        imageView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(yud.K0);
                        final int i7 = 2;
                        final fbb fbbVar4 = this;
                        f8j.d(imageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        fbbVar4.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar4;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar4.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar4.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        tqi.c(new er(3, (Continuation) null, 9), imageView);
                        fbbVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, null);
                        appCompatImageView3.setId(zud.z0);
                        int iD6 = kti.d(40 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iD6, iD6);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final fbb fbbVar5 = this;
                        Editable text = ((w3b) fbbVar5.B0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iD7 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iD7, iD7, iD7, iD7);
                        appCompatImageView3.setImageResource(yud.q0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        f8j.d(appCompatImageView3, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        fbbVar5.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar5;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar5.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar5.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        final int i2 = 1;
        this.B0 = ipi.b(3, new cm6() { // from class: xab
            /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(zud.x0);
                        int iD = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
                        layoutParams.gravity = 8388627;
                        final fbb fbbVar = this;
                        layoutParams.leftMargin = fbbVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iD2 = kti.d(1 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD2, iD2, iD2, iD2);
                        appCompatImageView.setImageResource(yud.f0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView).getIcon().f));
                        final int i22 = 1;
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        fbbVar.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final w3b w3bVar = new w3b(context, 12);
                        w3bVar.setId(zud.y0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        fbb fbbVar2 = this;
                        int i3 = fbbVar2.c;
                        layoutParams2.leftMargin = utb.j(30, vw4.d().getDisplayMetrics().density, i3, i3);
                        int i4 = fbbVar2.a;
                        layoutParams2.topMargin = i4;
                        layoutParams2.bottomMargin = i4;
                        w3bVar.setLayoutParams(layoutParams2);
                        w3bVar.setClipToOutline(true);
                        w3bVar.setOutlineProvider(new u74(kti.d(10 * vw4.d().getDisplayMetrics().density)));
                        w3bVar.setImeOptions(3);
                        w3bVar.setText(fbbVar2.d);
                        int i5 = fbbVar2.b;
                        w3bVar.setPadding(i3, i5, kti.d(40 * vw4.d().getDisplayMetrics().density), i5);
                        v1a v1aVar = a93.s0;
                        w3bVar.setBackgroundColor(v1aVar.y(w3bVar).b().a.h);
                        dpg.h.b(w3bVar, t75.b);
                        Drawable drawableF = mfh.f(w3bVar);
                        if (drawableF != null) {
                            cei.k(drawableF, v1aVar.y(w3bVar).getText().j);
                        }
                        w3bVar.setHintTextColor(v1aVar.y(w3bVar).getText().g);
                        w3bVar.setTextColor(v1aVar.y(w3bVar).getText().e);
                        w3bVar.setSingleLine();
                        w3bVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: abb
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                api.e(w3bVar);
                                return true;
                            }
                        });
                        mgb.a(w3bVar, new r98(11, w3bVar, w3bVar));
                        w3bVar.addTextChangedListener(new p3(4, fbbVar2));
                        fbbVar2.addView(w3bVar);
                        return w3bVar;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(zud.A0);
                        int iD3 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iD3, iD3);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iD4 = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD4, iD4, iD4, iD4);
                        appCompatImageView2.setImageResource(yud.K0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView2).getIcon().f));
                        final int i6 = 0;
                        final fbb fbbVar3 = this;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        fbbVar3.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar3;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar3.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar3.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, null);
                        imageView.setId(zud.B0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iD5 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD5, iD5, iD5, iD5);
                        imageView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(yud.K0);
                        final int i7 = 2;
                        final fbb fbbVar4 = this;
                        f8j.d(imageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        fbbVar4.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar4;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar4.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar4.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        tqi.c(new er(3, (Continuation) null, 9), imageView);
                        fbbVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, null);
                        appCompatImageView3.setId(zud.z0);
                        int iD6 = kti.d(40 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iD6, iD6);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final fbb fbbVar5 = this;
                        Editable text = ((w3b) fbbVar5.B0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iD7 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iD7, iD7, iD7, iD7);
                        appCompatImageView3.setImageResource(yud.q0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        f8j.d(appCompatImageView3, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        fbbVar5.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar5;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar5.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar5.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        final int i3 = 2;
        this.C0 = ipi.b(3, new cm6() { // from class: xab
            /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(zud.x0);
                        int iD = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
                        layoutParams.gravity = 8388627;
                        final fbb fbbVar = this;
                        layoutParams.leftMargin = fbbVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iD2 = kti.d(1 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD2, iD2, iD2, iD2);
                        appCompatImageView.setImageResource(yud.f0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView).getIcon().f));
                        final int i22 = 1;
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        fbbVar.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final w3b w3bVar = new w3b(context, 12);
                        w3bVar.setId(zud.y0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        fbb fbbVar2 = this;
                        int i32 = fbbVar2.c;
                        layoutParams2.leftMargin = utb.j(30, vw4.d().getDisplayMetrics().density, i32, i32);
                        int i4 = fbbVar2.a;
                        layoutParams2.topMargin = i4;
                        layoutParams2.bottomMargin = i4;
                        w3bVar.setLayoutParams(layoutParams2);
                        w3bVar.setClipToOutline(true);
                        w3bVar.setOutlineProvider(new u74(kti.d(10 * vw4.d().getDisplayMetrics().density)));
                        w3bVar.setImeOptions(3);
                        w3bVar.setText(fbbVar2.d);
                        int i5 = fbbVar2.b;
                        w3bVar.setPadding(i32, i5, kti.d(40 * vw4.d().getDisplayMetrics().density), i5);
                        v1a v1aVar = a93.s0;
                        w3bVar.setBackgroundColor(v1aVar.y(w3bVar).b().a.h);
                        dpg.h.b(w3bVar, t75.b);
                        Drawable drawableF = mfh.f(w3bVar);
                        if (drawableF != null) {
                            cei.k(drawableF, v1aVar.y(w3bVar).getText().j);
                        }
                        w3bVar.setHintTextColor(v1aVar.y(w3bVar).getText().g);
                        w3bVar.setTextColor(v1aVar.y(w3bVar).getText().e);
                        w3bVar.setSingleLine();
                        w3bVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: abb
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                api.e(w3bVar);
                                return true;
                            }
                        });
                        mgb.a(w3bVar, new r98(11, w3bVar, w3bVar));
                        w3bVar.addTextChangedListener(new p3(4, fbbVar2));
                        fbbVar2.addView(w3bVar);
                        return w3bVar;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(zud.A0);
                        int iD3 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iD3, iD3);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iD4 = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD4, iD4, iD4, iD4);
                        appCompatImageView2.setImageResource(yud.K0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView2).getIcon().f));
                        final int i6 = 0;
                        final fbb fbbVar3 = this;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        fbbVar3.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar3;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar3.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar3.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, null);
                        imageView.setId(zud.B0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iD5 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD5, iD5, iD5, iD5);
                        imageView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(yud.K0);
                        final int i7 = 2;
                        final fbb fbbVar4 = this;
                        f8j.d(imageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        fbbVar4.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar4;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar4.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar4.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        tqi.c(new er(3, (Continuation) null, 9), imageView);
                        fbbVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, null);
                        appCompatImageView3.setId(zud.z0);
                        int iD6 = kti.d(40 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iD6, iD6);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final fbb fbbVar5 = this;
                        Editable text = ((w3b) fbbVar5.B0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iD7 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iD7, iD7, iD7, iD7);
                        appCompatImageView3.setImageResource(yud.q0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        f8j.d(appCompatImageView3, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        fbbVar5.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar5;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar5.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar5.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        final int i4 = 3;
        this.D0 = ipi.b(3, new cm6() { // from class: xab
            /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(zud.x0);
                        int iD = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
                        layoutParams.gravity = 8388627;
                        final fbb fbbVar = this;
                        layoutParams.leftMargin = fbbVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iD2 = kti.d(1 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD2, iD2, iD2, iD2);
                        appCompatImageView.setImageResource(yud.f0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView).getIcon().f));
                        final int i22 = 1;
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        fbbVar.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final w3b w3bVar = new w3b(context, 12);
                        w3bVar.setId(zud.y0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        fbb fbbVar2 = this;
                        int i32 = fbbVar2.c;
                        layoutParams2.leftMargin = utb.j(30, vw4.d().getDisplayMetrics().density, i32, i32);
                        int i42 = fbbVar2.a;
                        layoutParams2.topMargin = i42;
                        layoutParams2.bottomMargin = i42;
                        w3bVar.setLayoutParams(layoutParams2);
                        w3bVar.setClipToOutline(true);
                        w3bVar.setOutlineProvider(new u74(kti.d(10 * vw4.d().getDisplayMetrics().density)));
                        w3bVar.setImeOptions(3);
                        w3bVar.setText(fbbVar2.d);
                        int i5 = fbbVar2.b;
                        w3bVar.setPadding(i32, i5, kti.d(40 * vw4.d().getDisplayMetrics().density), i5);
                        v1a v1aVar = a93.s0;
                        w3bVar.setBackgroundColor(v1aVar.y(w3bVar).b().a.h);
                        dpg.h.b(w3bVar, t75.b);
                        Drawable drawableF = mfh.f(w3bVar);
                        if (drawableF != null) {
                            cei.k(drawableF, v1aVar.y(w3bVar).getText().j);
                        }
                        w3bVar.setHintTextColor(v1aVar.y(w3bVar).getText().g);
                        w3bVar.setTextColor(v1aVar.y(w3bVar).getText().e);
                        w3bVar.setSingleLine();
                        w3bVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: abb
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                api.e(w3bVar);
                                return true;
                            }
                        });
                        mgb.a(w3bVar, new r98(11, w3bVar, w3bVar));
                        w3bVar.addTextChangedListener(new p3(4, fbbVar2));
                        fbbVar2.addView(w3bVar);
                        return w3bVar;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(zud.A0);
                        int iD3 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iD3, iD3);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iD4 = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD4, iD4, iD4, iD4);
                        appCompatImageView2.setImageResource(yud.K0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView2).getIcon().f));
                        final int i6 = 0;
                        final fbb fbbVar3 = this;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        fbbVar3.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar3;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar3.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar3.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, null);
                        imageView.setId(zud.B0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iD5 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD5, iD5, iD5, iD5);
                        imageView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(yud.K0);
                        final int i7 = 2;
                        final fbb fbbVar4 = this;
                        f8j.d(imageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        fbbVar4.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar4;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar4.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar4.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        tqi.c(new er(3, (Continuation) null, 9), imageView);
                        fbbVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, null);
                        appCompatImageView3.setId(zud.z0);
                        int iD6 = kti.d(40 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iD6, iD6);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final fbb fbbVar5 = this;
                        Editable text = ((w3b) fbbVar5.B0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iD7 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iD7, iD7, iD7, iD7);
                        appCompatImageView3.setImageResource(yud.q0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        f8j.d(appCompatImageView3, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        fbbVar5.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar5;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar5.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar5.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        final int i5 = 4;
        this.E0 = ipi.b(3, new cm6() { // from class: xab
            /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                        appCompatImageView.setId(zud.x0);
                        int iD = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
                        layoutParams.gravity = 8388627;
                        final fbb fbbVar = this;
                        layoutParams.leftMargin = fbbVar.c;
                        appCompatImageView.setLayoutParams(layoutParams);
                        int iD2 = kti.d(1 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD2, iD2, iD2, iD2);
                        appCompatImageView.setImageResource(yud.f0);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView).getIcon().f));
                        final int i22 = 1;
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        fbbVar.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar.addView(appCompatImageView);
                        return appCompatImageView;
                    case 1:
                        final w3b w3bVar = new w3b(context, 12);
                        w3bVar.setId(zud.y0);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        fbb fbbVar2 = this;
                        int i32 = fbbVar2.c;
                        layoutParams2.leftMargin = utb.j(30, vw4.d().getDisplayMetrics().density, i32, i32);
                        int i42 = fbbVar2.a;
                        layoutParams2.topMargin = i42;
                        layoutParams2.bottomMargin = i42;
                        w3bVar.setLayoutParams(layoutParams2);
                        w3bVar.setClipToOutline(true);
                        w3bVar.setOutlineProvider(new u74(kti.d(10 * vw4.d().getDisplayMetrics().density)));
                        w3bVar.setImeOptions(3);
                        w3bVar.setText(fbbVar2.d);
                        int i52 = fbbVar2.b;
                        w3bVar.setPadding(i32, i52, kti.d(40 * vw4.d().getDisplayMetrics().density), i52);
                        v1a v1aVar = a93.s0;
                        w3bVar.setBackgroundColor(v1aVar.y(w3bVar).b().a.h);
                        dpg.h.b(w3bVar, t75.b);
                        Drawable drawableF = mfh.f(w3bVar);
                        if (drawableF != null) {
                            cei.k(drawableF, v1aVar.y(w3bVar).getText().j);
                        }
                        w3bVar.setHintTextColor(v1aVar.y(w3bVar).getText().g);
                        w3bVar.setTextColor(v1aVar.y(w3bVar).getText().e);
                        w3bVar.setSingleLine();
                        w3bVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: abb
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                                if (i6 != 3) {
                                    return false;
                                }
                                api.e(w3bVar);
                                return true;
                            }
                        });
                        mgb.a(w3bVar, new r98(11, w3bVar, w3bVar));
                        w3bVar.addTextChangedListener(new p3(4, fbbVar2));
                        fbbVar2.addView(w3bVar);
                        return w3bVar;
                    case 2:
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
                        appCompatImageView2.setId(zud.A0);
                        int iD3 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iD3, iD3);
                        layoutParams3.gravity = 8388629;
                        appCompatImageView2.setLayoutParams(layoutParams3);
                        int iD4 = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD4, iD4, iD4, iD4);
                        appCompatImageView2.setImageResource(yud.K0);
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView2).getIcon().f));
                        final int i6 = 0;
                        final fbb fbbVar3 = this;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        fbbVar3.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar3;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar3.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar3.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar3.addView(appCompatImageView2);
                        return appCompatImageView2;
                    case 3:
                        ImageView imageView = new ImageView(context, null);
                        imageView.setId(zud.B0);
                        float f = 32;
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iD5 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD5, iD5, iD5, iD5);
                        imageView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(yud.K0);
                        final int i7 = 2;
                        final fbb fbbVar4 = this;
                        f8j.d(imageView, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        fbbVar4.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar4;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar4.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar4.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        tqi.c(new er(3, (Continuation) null, 9), imageView);
                        fbbVar4.addView(imageView);
                        return imageView;
                    default:
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context, null);
                        appCompatImageView3.setId(zud.z0);
                        int iD6 = kti.d(40 * vw4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iD6, iD6);
                        layoutParams5.gravity = 8388629;
                        appCompatImageView3.setLayoutParams(layoutParams5);
                        final fbb fbbVar5 = this;
                        Editable text = ((w3b) fbbVar5.B0.getValue()).getText();
                        appCompatImageView3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iD7 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView3.setPadding(iD7, iD7, iD7, iD7);
                        appCompatImageView3.setImageResource(yud.q0);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView3).getIcon().j));
                        final int i8 = 3;
                        f8j.d(appCompatImageView3, 300L, new View.OnClickListener() { // from class: yab
                            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        fbbVar5.d();
                                        break;
                                    case 1:
                                        fbb fbbVar22 = fbbVar5;
                                        fbbVar22.b();
                                        cbb cbbVar = fbbVar22.t0;
                                        if (cbbVar != null) {
                                            cbbVar.o();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        fbbVar5.d();
                                        break;
                                    default:
                                        ((w3b) fbbVar5.B0.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        fbbVar5.addView(appCompatImageView3);
                        return appCompatImageView3;
                }
            }
        });
        ValueAnimator duration = ValueAnimator.ofInt(120).setDuration(120L);
        duration.addListener(new ebb(this, 1));
        final int i6 = 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zab
            public final /* synthetic */ fbb b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, k18] */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        fbb fbbVar = this.b;
                        int width = fbbVar.getWidth();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        ((AppCompatImageView) fbbVar.A0.getValue()).setAlpha(animatedFraction);
                        ((AppCompatImageView) fbbVar.E0.getValue()).setAlpha(animatedFraction);
                        ?? r0 = fbbVar.B0;
                        View view = (View) r0.getValue();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        ViewGroup.LayoutParams layoutParams2 = ((View) r0.getValue()).getLayoutParams();
                        layoutParams.width = (int) ((width - ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r0.leftMargin : 0)) * animatedFraction);
                        view.setLayoutParams(layoutParams);
                        return;
                    default:
                        float animatedFraction2 = 1 - valueAnimator.getAnimatedFraction();
                        fbb fbbVar2 = this.b;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) fbbVar2.A0.getValue();
                        appCompatImageView.setAlpha(appCompatImageView.getAlpha() * animatedFraction2);
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) fbbVar2.E0.getValue();
                        appCompatImageView2.setAlpha(appCompatImageView2.getAlpha() * animatedFraction2);
                        View view2 = (View) fbbVar2.B0.getValue();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams3.width = (int) (((w3b) r6.getValue()).getWidth() * animatedFraction2);
                        view2.setLayoutParams(layoutParams3);
                        return;
                }
            }
        });
        this.F0 = duration;
        ValueAnimator duration2 = ValueAnimator.ofInt(120).setDuration(120L);
        duration2.addListener(new pf(this, 4, context));
        final int i7 = 1;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zab
            public final /* synthetic */ fbb b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, k18] */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i7) {
                    case 0:
                        fbb fbbVar = this.b;
                        int width = fbbVar.getWidth();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        ((AppCompatImageView) fbbVar.A0.getValue()).setAlpha(animatedFraction);
                        ((AppCompatImageView) fbbVar.E0.getValue()).setAlpha(animatedFraction);
                        ?? r0 = fbbVar.B0;
                        View view = (View) r0.getValue();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        ViewGroup.LayoutParams layoutParams2 = ((View) r0.getValue()).getLayoutParams();
                        layoutParams.width = (int) ((width - ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r0.leftMargin : 0)) * animatedFraction);
                        view.setLayoutParams(layoutParams);
                        return;
                    default:
                        float animatedFraction2 = 1 - valueAnimator.getAnimatedFraction();
                        fbb fbbVar2 = this.b;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) fbbVar2.A0.getValue();
                        appCompatImageView.setAlpha(appCompatImageView.getAlpha() * animatedFraction2);
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) fbbVar2.E0.getValue();
                        appCompatImageView2.setAlpha(appCompatImageView2.getAlpha() * animatedFraction2);
                        View view2 = (View) fbbVar2.B0.getValue();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams3.width = (int) (((w3b) r6.getValue()).getWidth() * animatedFraction2);
                        view2.setLayoutParams(layoutParams3);
                        return;
                }
            }
        });
        this.G0 = duration2;
    }

    public static void a(Animator animator) {
        ArrayList arrayList = new ArrayList(animator.getListeners());
        animator.removeAllListeners();
        animator.cancel();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            animator.addListener((Animator.AnimatorListener) it.next());
        }
    }

    public final void b() {
        if (this.w0) {
            a(this.F0);
            float f = this.y0 ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.G0;
            valueAnimator.setCurrentFraction(f);
            valueAnimator.start();
        }
    }

    public final void c(boolean z) {
        if (this.v0) {
            a(this.G0);
            float f = this.x0 ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.F0;
            valueAnimator.setCurrentFraction(f);
            if (z) {
                valueAnimator.addListener(new ebb(this, 0));
            }
            addOnLayoutChangeListener(new es0(10, this));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            setMinimumHeight(kti.d(52 * vw4.d().getDisplayMetrics().density));
            setLayoutParams(layoutParams);
        }
    }

    public final void d() {
        c(true);
        cbb cbbVar = this.t0;
        if (cbbVar != null) {
            cbbVar.e();
        }
    }

    public final boolean getCollapseWithAnimation() {
        return this.y0;
    }

    public final boolean getExpandWithAnimation() {
        return this.x0;
    }

    public final boolean getShouldShowSearchIcon() {
        return this.u0;
    }

    public final dbb getState() {
        return this.z0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.z0 != dbb.c) {
            return;
        }
        ?? r1 = this.B0;
        if (r1.e()) {
            w3b w3bVar = (w3b) r1.getValue();
            w3bVar.post(new yn6(w3bVar, 25, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        ?? r0 = this.C0;
        if (r0.e()) {
            ((AppCompatImageView) r0.getValue()).setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
        }
        ?? r02 = this.A0;
        if (r02.e()) {
            ((AppCompatImageView) r02.getValue()).setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
        }
        ?? r03 = this.E0;
        if (r03.e()) {
            ((AppCompatImageView) r03.getValue()).setImageTintList(ColorStateList.valueOf(yebVar.getIcon().j));
        }
        ?? r04 = this.B0;
        if (r04.e()) {
            w3b w3bVar = (w3b) r04.getValue();
            t2i.c(w3bVar, yebVar);
            w3bVar.setBackgroundColor(yebVar.b().a.h);
            w3bVar.setHintTextColor(yebVar.getText().g);
            w3bVar.setTextColor(yebVar.getText().e);
        }
    }

    public final void setCollapseWithAnimation(boolean z) {
        this.y0 = z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    public final void setCollapsedStyle(bbb bbbVar) {
        this.s0 = bbbVar;
        int iOrdinal = bbbVar.ordinal();
        ?? r1 = this.C0;
        dbb dbbVar = dbb.a;
        ?? r3 = this.D0;
        if (iOrdinal == 0) {
            if (r1.e()) {
                ((AppCompatImageView) r1.getValue()).setVisibility(8);
            }
            if (this.z0 == dbbVar) {
                ((View) r3.getValue()).setVisibility(this.u0 ? 0 : 8);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (r3.e()) {
            ((ImageView) r3.getValue()).setVisibility(8);
        }
        if (this.z0 == dbbVar) {
            ((View) r1.getValue()).setVisibility(this.u0 ? 0 : 8);
        }
    }

    public final void setCollapsible(boolean z) {
        this.w0 = z;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.x0 = z;
    }

    public final void setExpandable(boolean z) {
        this.v0 = z;
    }

    public final void setListener(cbb cbbVar) {
        this.t0 = cbbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setSearchHint(String str) {
        this.o = str;
        ?? r0 = this.B0;
        if (r0.e()) {
            ((w3b) r0.getValue()).setHint(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setSearchText(CharSequence charSequence) {
        this.d = charSequence;
        ?? r0 = this.B0;
        if (r0.e()) {
            w3b w3bVar = (w3b) r0.getValue();
            w3bVar.setText(charSequence);
            w3bVar.setSelection(w3bVar.length());
        }
    }

    public final void setShouldShowSearchIcon(boolean z) {
        this.u0 = z;
    }
}
