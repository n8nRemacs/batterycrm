package com.avito.android.checkable_image;

import android.content.Context;
import android.view.View;
import com.airbnb.lottie.C27296p;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/r0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f118078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.h f118079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f118080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118081e;

    public e(View view, l0.h hVar, View view2, int i12) {
        this.f118078b = view;
        this.f118079c = hVar;
        this.f118080d = view2;
        this.f118081e = i12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f118078b.removeOnAttachStateChangeListener(this);
        l0.h hVar = this.f118079c;
        if (hVar.f406842b == 0) {
            Context context = this.f118080d.getContext();
            int i12 = this.f118081e;
            C27296p.f(context, i12, C27296p.l(i12, context)).b(new b(hVar, 0));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
