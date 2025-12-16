package com.avito.android.map_core.view.pin_items;

import Y61.l;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: AdvertsSheetClipper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/view/pin_items/a;", "Landroid/view/ViewOutlineProvider;", "<init>", "()V", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    @l
    public FrameLayout f185810a;

    /* renamed from: b, reason: collision with root package name */
    public int f185811b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f185812c = true;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(@Y61.k View view, @Y61.k Outline outline) {
        View view2 = this.f185810a;
        if (view2 == null) {
            view2 = view;
        }
        if (view2.getTop() <= 0) {
            outline.setRect(0, -view2.getPaddingTop(), view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        } else {
            if (!this.f185812c) {
                outline.setRect(0, view.getPaddingTop(), view.getWidth(), view.getHeight());
                return;
            }
            if (this.f185811b == 0) {
                this.f185811b = D6.j(view, 20);
            }
            int paddingTop = view.getPaddingTop();
            int width = view.getWidth();
            int height = view.getHeight();
            int i12 = this.f185811b;
            outline.setRoundRect(0, paddingTop, width, height + i12, i12);
        }
    }
}
