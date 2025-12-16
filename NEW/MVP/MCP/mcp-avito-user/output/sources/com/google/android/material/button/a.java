package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.ripple.b;
import com.google.android.material.shape.k;
import com.google.android.material.shape.q;
import com.google.android.material.shape.v;
import j.N;
import j.P;
import j.r;
import java.util.WeakHashMap;

/* compiled from: MaterialButtonHelper.java */
@RestrictTo
/* loaded from: classes6.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f356088a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public q f356089b;

    /* renamed from: c, reason: collision with root package name */
    public int f356090c;

    /* renamed from: d, reason: collision with root package name */
    public int f356091d;

    /* renamed from: e, reason: collision with root package name */
    public int f356092e;

    /* renamed from: f, reason: collision with root package name */
    public int f356093f;

    /* renamed from: g, reason: collision with root package name */
    public int f356094g;

    /* renamed from: h, reason: collision with root package name */
    public int f356095h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public PorterDuff.Mode f356096i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public ColorStateList f356097j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public ColorStateList f356098k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public ColorStateList f356099l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public k f356100m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f356104q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f356106s;

    /* renamed from: t, reason: collision with root package name */
    public int f356107t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f356101n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f356102o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f356103p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f356105r = true;

    public a(MaterialButton materialButton, @N q qVar) {
        this.f356088a = materialButton;
        this.f356089b = qVar;
    }

    @P
    public final v a() {
        RippleDrawable rippleDrawable = this.f356106s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f356106s.getNumberOfLayers() > 2 ? (v) this.f356106s.getDrawable(2) : (v) this.f356106s.getDrawable(1);
    }

    @P
    public final k b(boolean z12) {
        RippleDrawable rippleDrawable = this.f356106s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (k) ((LayerDrawable) ((InsetDrawable) this.f356106s.getDrawable(0)).getDrawable()).getDrawable(!z12 ? 1 : 0);
    }

    public final void c(@N q qVar) {
        this.f356089b = qVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(qVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(qVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(qVar);
        }
    }

    public final void d(@r int i12, @r int i13) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        MaterialButton materialButton = this.f356088a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i14 = this.f356092e;
        int i15 = this.f356093f;
        this.f356093f = i13;
        this.f356092e = i12;
        if (!this.f356102o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i12) - i14, paddingEnd, (paddingBottom + i13) - i15);
    }

    public final void e() {
        k kVar = new k(this.f356089b);
        MaterialButton materialButton = this.f356088a;
        kVar.j(materialButton.getContext());
        kVar.setTintList(this.f356097j);
        PorterDuff.Mode mode = this.f356096i;
        if (mode != null) {
            kVar.setTintMode(mode);
        }
        float f12 = this.f356095h;
        ColorStateList colorStateList = this.f356098k;
        kVar.v(f12);
        kVar.u(colorStateList);
        k kVar2 = new k(this.f356089b);
        kVar2.setTint(0);
        float f13 = this.f356095h;
        int iD2 = this.f356101n ? com.google.android.material.color.k.d(materialButton, R.attr.colorSurface) : 0;
        kVar2.v(f13);
        kVar2.u(ColorStateList.valueOf(iD2));
        k kVar3 = new k(this.f356089b);
        this.f356100m = kVar3;
        kVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(b.c(this.f356099l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{kVar2, kVar}), this.f356090c, this.f356092e, this.f356091d, this.f356093f), this.f356100m);
        this.f356106s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        k kVarB = b(false);
        if (kVarB != null) {
            kVarB.m(this.f356107t);
            kVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        k kVarB = b(false);
        k kVarB2 = b(true);
        if (kVarB != null) {
            float f12 = this.f356095h;
            ColorStateList colorStateList = this.f356098k;
            kVarB.v(f12);
            kVarB.u(colorStateList);
            if (kVarB2 != null) {
                float f13 = this.f356095h;
                int iD2 = this.f356101n ? com.google.android.material.color.k.d(this.f356088a, R.attr.colorSurface) : 0;
                kVarB2.v(f13);
                kVarB2.u(ColorStateList.valueOf(iD2));
            }
        }
    }
}
