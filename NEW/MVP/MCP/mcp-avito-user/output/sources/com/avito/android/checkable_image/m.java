package com.avito.android.checkable_image;

import android.content.Context;
import android.view.View;
import com.airbnb.lottie.C27296p;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/r0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f118097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f118098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f118099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.h f118100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118101f;

    public m(CheckableImageButton checkableImageButton, CheckableImageButton checkableImageButton2, c cVar, l0.h hVar, int i12) {
        this.f118097b = checkableImageButton;
        this.f118098c = checkableImageButton2;
        this.f118099d = cVar;
        this.f118100e = hVar;
        this.f118101f = i12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f118097b.removeOnAttachStateChangeListener(this);
        l0.h hVar = this.f118100e;
        T t12 = hVar.f406842b;
        CheckableImageButton checkableImageButton = this.f118098c;
        if (t12 == 0) {
            Context context = checkableImageButton.getContext();
            int i12 = this.f118101f;
            C27296p.f(context, i12, C27296p.l(i12, context)).b(new b(hVar, 1));
        }
        checkableImageButton.setOnTouchListener(this.f118099d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
