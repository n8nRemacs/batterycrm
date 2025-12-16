package com.avito.android.lib.design.tab_layout;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.util.y;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.tab_layout.c;
import j.InterfaceC42165v;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoTabLayout.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fR\"\u0010\u0012\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/avito/android/lib/design/tab_layout/AvitoTabLayout;", "Lcom/avito/android/lib/design/tab_layout/c;", "", "getTabMinWidthMargin", "()F", "", "drawableRes", "Lkotlin/G0;", "setTabIndicatorPathDrawable", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)V", "T", "I", "getAvitoTabViewStyleRes$_design_modules_components", "()I", "setAvitoTabViewStyleRes$_design_modules_components", "avitoTabViewStyleRes", "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AvitoTabLayout extends com.avito.android.lib.design.tab_layout.c {

    /* renamed from: R, reason: collision with root package name */
    public final int f180819R;

    /* renamed from: S, reason: collision with root package name */
    @l
    public Drawable f180820S;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    @f0
    public int avitoTabViewStyleRes;

    /* compiled from: AvitoTabLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tab_layout/AvitoTabLayout$a;", "Lcom/avito/android/lib/design/tab_layout/c$i;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends c.i {

        /* renamed from: h, reason: collision with root package name */
        @l
        public View f180822h;

        @Override // com.avito.android.lib.design.tab_layout.c.i
        public final void a() {
            super.a();
            this.f180822h = null;
        }
    }

    /* compiled from: AvitoTabLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tab_layout/AvitoTabLayout$b;", "Lcom/avito/android/lib/design/tab_layout/c$h;", "Lcom/avito/android/lib/design/tab_layout/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends c.h {
        public b(@k Context context) {
            super(context);
        }

        @Override // com.avito.android.lib.design.tab_layout.c.h
        public final void a(@k c.m mVar, @k RectF rectF) {
            View view;
            c cVar = mVar instanceof c ? (c) mVar : null;
            if (cVar == null || (view = cVar.f180824n) == null) {
                super.a(mVar, rectF);
                return;
            }
            if (view.getVisibility() != 0) {
                super.a(mVar, rectF);
                return;
            }
            if (view.getParent() instanceof c.m) {
                float left = view.getLeft() + ((c) mVar).getLeft();
                rectF.set(left, 0.0f, view.getWidth() + left, 0.0f);
            } else {
                c cVar2 = (c) mVar;
                float left2 = view.getLeft() + cVar2.getPaddingStart() + cVar2.getLeft();
                rectF.set(left2, 0.0f, view.getWidth() + left2, 0.0f);
            }
        }

        @Override // com.avito.android.lib.design.tab_layout.c.h, android.view.View
        public final void draw(@k Canvas canvas) {
            Drawable drawable;
            AvitoTabLayout avitoTabLayout = AvitoTabLayout.this;
            if (avitoTabLayout.getTabCount() != 0 && (drawable = avitoTabLayout.f180820S) != null) {
                drawable.setBounds(avitoTabLayout.f180868w, getHeight() - drawable.getIntrinsicHeight(), getWidth() - avitoTabLayout.f180819R, getHeight());
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }
    }

    /* compiled from: AvitoTabLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tab_layout/AvitoTabLayout$c;", "Lcom/avito/android/lib/design/tab_layout/c$m;", "Lcom/avito/android/lib/design/tab_layout/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends c.m {

        /* renamed from: n, reason: collision with root package name */
        @l
        public View f180824n;

        public c() {
            throw null;
        }

        @Override // com.avito.android.lib.design.tab_layout.c.m
        public final void e() {
            View view;
            super.e();
            c.i tab = getTab();
            a aVar = tab instanceof a ? (a) tab : null;
            if ((aVar == null || (view = aVar.f180822h) == null) && (view = this.f180908g) == null && (view = this.f180904c) == null) {
                view = this.f180905d;
            }
            this.f180824n = view;
        }
    }

    @j
    public AvitoTabLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.avito.android.lib.design.tab_layout.c
    public final void e() {
        int iMax;
        int iMax2;
        super.e();
        int i12 = this.f180832A;
        if (i12 == 0 || i12 == 2) {
            iMax = Math.max(0, this.f180868w - this.f180852g);
            iMax2 = Math.max(0, this.f180819R - this.f180854i);
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        this.f180850e.setPaddingRelative(iMax, 0, iMax2, 0);
        u(true);
    }

    @Override // com.avito.android.lib.design.tab_layout.c
    @k
    public final c.h g() {
        return new b(getContext());
    }

    /* renamed from: getAvitoTabViewStyleRes$_design_modules_components, reason: from getter */
    public final int getAvitoTabViewStyleRes() {
        return this.avitoTabViewStyleRes;
    }

    @Override // com.avito.android.lib.design.tab_layout.c
    public float getTabMinWidthMargin() {
        return 0.0f;
    }

    @Override // com.avito.android.lib.design.tab_layout.c
    public final c.i h() {
        Object objB = com.avito.android.lib.design.tab_layout.c.f180831Q.b();
        a aVar = objB instanceof a ? (a) objB : null;
        return aVar == null ? new a() : aVar;
    }

    public final void setAvitoTabViewStyleRes$_design_modules_components(int i12) {
        this.avitoTabViewStyleRes = i12;
    }

    public final void setTabIndicatorPathDrawable(@InterfaceC42165v int drawableRes) {
        if (drawableRes != 0) {
            setTabIndicatorPathDrawable(androidx.core.content.d.getDrawable(getContext(), drawableRes));
        } else {
            setTabIndicatorPathDrawable((Drawable) null);
        }
    }

    @Override // com.avito.android.lib.design.tab_layout.c
    @k
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final a k() {
        Object objB = com.avito.android.lib.design.tab_layout.c.f180831Q.b();
        a aVar = objB instanceof a ? (a) objB : null;
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f180897f = this;
        y.b bVar = this.f180846O;
        c.m mVar = bVar != null ? (c.m) bVar.b() : null;
        c cVar = mVar instanceof c ? (c) mVar : null;
        if (cVar == null) {
            cVar = new c(getContext());
        }
        cVar.setTab(aVar);
        cVar.setFocusable(true);
        cVar.setMinimumWidth(getTabMinWidth());
        CharSequence charSequence = aVar.f180894c;
        cVar.setContentDescription((charSequence == null || charSequence.length() == 0) ? aVar.f180893b : aVar.f180894c);
        cVar.f180824n = aVar.f180822h;
        aVar.f180898g = cVar;
        return aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AvitoTabLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.tabLayoutLarge : i12;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178963d0, i12, 0);
        this.f180819R = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        setTabIndicatorPathDrawable(typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.avitoTabViewStyleRes = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        typedArrayObtainStyledAttributes.recycle();
        e();
    }

    public final void setTabIndicatorPathDrawable(@l Drawable drawable) {
        if (L.f(drawable, this.f180820S)) {
            return;
        }
        this.f180820S = drawable;
        this.f180850e.postInvalidateOnAnimation();
    }
}
