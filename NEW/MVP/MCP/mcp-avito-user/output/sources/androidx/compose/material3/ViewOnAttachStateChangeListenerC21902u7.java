package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/u7;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC21902u7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public boolean f37412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f37413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f37414d;

    public ViewOnAttachStateChangeListenerC21902u7(Y41.a aVar, View view) {
        this.f37413c = view;
        this.f37414d = aVar;
        view.addOnAttachStateChangeListener(this);
        if (this.f37412b || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f37412b = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f37414d.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        if (this.f37412b) {
            return;
        }
        View view2 = this.f37413c;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f37412b = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        if (this.f37412b) {
            this.f37413c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f37412b = false;
        }
    }
}
