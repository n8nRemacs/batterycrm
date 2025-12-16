package com.avito.android.design.widget;

import Ca1.ViewOnTouchListenerC13234a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import hw.InterfaceC41177b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: ClickableGalleryPager.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/android/design/widget/ClickableGalleryPager;", "Lcom/avito/android/design/widget/GalleryPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "value", "Lkotlin/G0;", "setSkipTouchEventToParent", "(Z)V", "Landroid/view/View$OnClickListener;", "listener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/GestureDetector;", "k0", "Lkotlin/C;", "getTapGestureDetector", "()Landroid/view/GestureDetector;", "tapGestureDetector", "a", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClickableGalleryPager extends GalleryPager {

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C tapGestureDetector;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public View.OnClickListener f135887l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f135888m0;

    /* compiled from: ClickableGalleryPager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/design/widget/ClickableGalleryPager$a;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(@k MotionEvent motionEvent) {
            ClickableGalleryPager clickableGalleryPager = ClickableGalleryPager.this;
            View.OnClickListener onClickListener = clickableGalleryPager.f135887l0;
            if (onClickListener == null) {
                return true;
            }
            onClickListener.onClick(clickableGalleryPager);
            return true;
        }
    }

    public ClickableGalleryPager(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tapGestureDetector = C42727D.c(new com.avito.android.design.widget.a(this));
        setOnTouchListener(new ViewOnTouchListenerC13234a(this, 6));
    }

    public static boolean B(ClickableGalleryPager clickableGalleryPager, MotionEvent motionEvent) {
        return clickableGalleryPager.getTapGestureDetector().onTouchEvent(motionEvent);
    }

    private final GestureDetector getTapGestureDetector() {
        return (GestureDetector) this.tapGestureDetector.getValue();
    }

    @Override // com.avito.android.ui.SafeViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(@l MotionEvent motionEvent) {
        if (this.f135888m0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(@l View.OnClickListener listener) {
        this.f135887l0 = listener;
    }

    public final void setSkipTouchEventToParent(boolean value) {
        this.f135888m0 = value;
    }
}
