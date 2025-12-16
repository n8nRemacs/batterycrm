package com.yandex.div.core.view2.animations;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/s0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f367975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f367976c;

    public n(View view, ImageView imageView) {
        this.f367975b = imageView;
        this.f367976c = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f367975b.removeOnAttachStateChangeListener(this);
        q.b(null, this.f367976c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
    }
}
