package com.avito.android.virtual_deal_room.client_room.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C22823h0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryBottomSheetBehavior.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/view/CategoryBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CategoryBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: g0, reason: collision with root package name */
    @l
    public WeakReference<View> f326418g0;

    /* renamed from: h0, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f326419h0;

    public CategoryBottomSheetBehavior(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static View W(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (C22823h0.t(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View viewW = W(viewGroup.getChildAt(i12));
                if (viewW != null) {
                    return viewW;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(@k CoordinatorLayout coordinatorLayout, @k V v12, @k MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(@k CoordinatorLayout coordinatorLayout, @k V v12, int i12) throws Resources.NotFoundException {
        this.f326418g0 = new WeakReference<>(W(v12));
        super.j(coordinatorLayout, v12, i12);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(float f12) {
        Y41.l<? super Boolean, G0> lVar = this.f326419h0;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(f12 < 0.0f));
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(@k CoordinatorLayout coordinatorLayout, @k V v12, @k View view, int i12, int i13, @k int[] iArr, int i14) throws Resources.NotFoundException {
        super.n(coordinatorLayout, v12, view, i12, i13, iArr, i14);
        if (i13 >= 0 || view.canScrollVertically(-1)) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            Y41.l<? super Boolean, G0> lVar = this.f326419h0;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(false);
        Y41.l<? super Boolean, G0> lVar2 = this.f326419h0;
        if (lVar2 != null) {
            lVar2.invoke(Boolean.TRUE);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void o(@k CoordinatorLayout coordinatorLayout, @k V v12, @k View view, int i12, int i13, int i14, int i15, int i16, @k int[] iArr) {
        if (i15 > 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean u(@k CoordinatorLayout coordinatorLayout, @k V v12, @k MotionEvent motionEvent) {
        return false;
    }
}
