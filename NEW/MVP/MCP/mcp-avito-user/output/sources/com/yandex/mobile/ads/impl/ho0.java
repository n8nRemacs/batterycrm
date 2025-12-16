package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.nb0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class ho0 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private un0 f386179a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private nb0 f386180b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final rh1 f386181c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final TextureView f386182d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final gn0 f386183e;

    public ho0(@j.N Context context, @j.N rh1 rh1Var, @j.N TextureView textureView, @j.N gn0 gn0Var) {
        super(context);
        this.f386179a = null;
        this.f386181c = rh1Var;
        this.f386182d = textureView;
        this.f386183e = gn0Var;
        this.f386180b = new a41();
    }

    @j.N
    public final gn0 a() {
        return this.f386183e;
    }

    @j.N
    public final rh1 b() {
        return this.f386181c;
    }

    @j.N
    public final TextureView c() {
        return this.f386182d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        un0 un0Var = this.f386179a;
        if (un0Var != null) {
            ((pn0) un0Var).a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        un0 un0Var = this.f386179a;
        if (un0Var != null) {
            ((pn0) un0Var).b();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        nb0.a aVarA = this.f386180b.a(i12, i13);
        super.onMeasure(aVarA.f388198a, aVarA.f388199b);
    }

    public void setAspectRatio(float f12) {
        this.f386180b = new rv0(f12);
    }

    public void setOnAttachStateChangeListener(@j.P un0 un0Var) {
        this.f386179a = un0Var;
    }
}
