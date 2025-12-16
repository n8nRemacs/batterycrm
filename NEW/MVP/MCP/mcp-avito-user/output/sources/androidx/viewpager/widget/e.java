package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PagerTitleStrip.java */
@ViewPager.d
/* loaded from: classes10.dex */
public class e extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public ViewPager f55058b;

    /* renamed from: c, reason: collision with root package name */
    public int f55059c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference<androidx.viewpager.widget.a> f55060d;

    /* compiled from: PagerTitleStrip.java */
    public class a extends DataSetObserver implements ViewPager.i, ViewPager.h {

        /* renamed from: b, reason: collision with root package name */
        public int f55061b;

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(ViewPager viewPager, androidx.viewpager.widget.a aVar) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            if (this.f55061b == 0) {
                throw null;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i12) {
            this.f55061b = i12;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void h(int i12, float f12, int i13) {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }
    }

    /* compiled from: PagerTitleStrip.java */
    public static class b extends SingleLineTransformationMethod {

        /* renamed from: a, reason: collision with root package name */
        public Locale f55062a;

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f55062a);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        b bVar = new b();
        bVar.f55062a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(bVar);
    }

    public final void a(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        if (aVar != null) {
            aVar.n(null);
            this.f55060d = null;
        }
        if (aVar2 != null) {
            aVar2.i(null);
            this.f55060d = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f55058b;
        if (viewPager == null) {
            return;
        }
        int currentItem = viewPager.getCurrentItem();
        if (aVar2 != null) {
            aVar2.c();
        }
        if (currentItem < 1 || aVar2 == null) {
            throw null;
        }
        aVar2.e(currentItem - 1);
        throw null;
    }

    public void b(float f12) {
        throw null;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f55059c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        viewPager.b(null);
        this.f55058b = viewPager;
        WeakReference<androidx.viewpager.widget.a> weakReference = this.f55060d;
        a(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f55058b;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f55058b;
            viewPager2.getClass();
            ArrayList arrayList = viewPager2.f55002U;
            if (arrayList != null) {
                arrayList.remove((Object) null);
            }
            this.f55058b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        if (this.f55058b != null) {
            b(0.0f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        if (View.MeasureSpec.getMode(i12) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop(), -2);
        ViewGroup.getChildMeasureSpec(i12, (int) (View.MeasureSpec.getSize(i12) * 0.2f), -2);
        throw null;
    }

    public void setNonPrimaryAlpha(@InterfaceC42167x float f12) {
        throw null;
    }

    public void setTextColor(@InterfaceC42156l int i12) {
        throw null;
    }

    public void setTextSpacing(int i12) {
        this.f55059c = i12;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public void setGravity(int i12) {
    }
}
