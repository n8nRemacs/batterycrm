package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/C6;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class C6 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f32488b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f32489c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32490d;

    public C6(@Y61.k Y41.a aVar, @Y61.k View view) {
        this.f32488b = view;
        this.f32489c = aVar;
        view.addOnAttachStateChangeListener(this);
        if (this.f32490d || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f32490d = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f32489c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        if (this.f32490d) {
            return;
        }
        View view2 = this.f32488b;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f32490d = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        if (this.f32490d) {
            this.f32488b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f32490d = false;
        }
    }
}
