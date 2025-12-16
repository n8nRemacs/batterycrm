package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class zgh extends RecyclerView {
    public final /* synthetic */ ViewPager2 U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgh(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.U1 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.U1.G0.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.U1;
        accessibilityEvent.setFromIndex(viewPager2.d);
        accessibilityEvent.setToIndex(viewPager2.d);
        accessibilityEvent.setSource((ViewPager2) viewPager2.G0.o);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.U1.E0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.U1.E0 && super.onTouchEvent(motionEvent);
    }
}
