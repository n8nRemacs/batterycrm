package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.percentlayout.widget.b;

/* compiled from: PercentFrameLayout.java */
@Deprecated
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* compiled from: PercentFrameLayout.java */
    @Deprecated
    /* renamed from: androidx.percentlayout.widget.a$a, reason: collision with other inner class name */
    public static class C1878a extends FrameLayout.LayoutParams implements b.InterfaceC1879b {

        /* renamed from: b, reason: collision with root package name */
        public b.a f53294b;

        @Override // androidx.percentlayout.widget.b.InterfaceC1879b
        public final b.a a() {
            if (this.f53294b == null) {
                this.f53294b = new b.a();
            }
            return this.f53294b;
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i12, int i13) {
            ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i12, 0);
            ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i13, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1878a(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1878a c1878a = new C1878a(context, attributeSet);
        c1878a.f53294b = b.a(context, attributeSet);
        return c1878a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C1878a(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1878a c1878a = new C1878a(context, attributeSet);
        c1878a.f53294b = b.a(context, attributeSet);
        return c1878a;
    }
}
