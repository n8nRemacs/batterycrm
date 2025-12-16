package com.yandex.div.core.view2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import androidx.core.view.C22808a;
import androidx.core.view.C22816e;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import x21.C49755a;
import x21.c;

/* compiled from: AccessibilityListDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/b;", "Landroidx/recyclerview/widget/M;", "c", "d", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37928b extends androidx.recyclerview.widget.M {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C49755a f367985f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList<d> f367986g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final N91.l f367987h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public c f367988i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f367989j;

    /* compiled from: AccessibilityListDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/view2/b$a", "Landroid/view/View$OnAttachStateChangeListener;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.b$a */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            C37928b c37928b = C37928b.this;
            c37928b.f367985f.getViewTreeObserver().addOnGlobalLayoutListener(c37928b.f367987h);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            C37928b c37928b = C37928b.this;
            c37928b.f367985f.getViewTreeObserver().removeOnGlobalLayoutListener(c37928b.f367987h);
            c37928b.k();
        }
    }

    /* compiled from: AccessibilityListDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/view2/b$b", "Lx21/c$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.b$b, reason: collision with other inner class name */
    public static final class C10871b implements c.a {
        public C10871b() {
        }

        @Override // x21.c.a
        public final boolean a() {
            C37928b c37928b = C37928b.this;
            if (!c37928b.f367989j) {
                return false;
            }
            C49755a c49755a = c37928b.f367985f;
            c49755a.performAccessibilityAction(64, null);
            c49755a.sendAccessibilityEvent(1);
            c37928b.k();
            return true;
        }
    }

    /* compiled from: AccessibilityListDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/b$c;", "Landroidx/recyclerview/widget/M$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.b$c */
    public final class c extends M.a {
        public c() {
            super(C37928b.this);
        }

        @Override // androidx.recyclerview.widget.M.a, androidx.core.view.C22808a
        public final void d(@Y61.k View view, @Y61.k androidx.core.view.accessibility.f fVar) {
            super.d(view, fVar);
            fVar.k(m0.f406844a.b(Button.class).p0());
            view.setImportantForAccessibility(C37928b.this.f367989j ? 1 : 4);
        }
    }

    /* compiled from: AccessibilityListDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/b$d;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.b$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final WeakReference<View> f367993a;

        /* renamed from: b, reason: collision with root package name */
        public final int f367994b;

        public d(@Y61.k WeakReference<View> weakReference, int i12) {
            this.f367993a = weakReference;
            this.f367994b = i12;
        }
    }

    public C37928b(@Y61.k C49755a c49755a) {
        super(c49755a);
        this.f367985f = c49755a;
        this.f367986g = new ArrayList<>();
        N91.l lVar = new N91.l(this, 3);
        this.f367987h = lVar;
        if (c49755a.f53799t) {
            c49755a.getViewTreeObserver().addOnGlobalLayoutListener(lVar);
        }
        c49755a.addOnAttachStateChangeListener(new a());
        int childCount = c49755a.getChildCount();
        if (childCount > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                c49755a.getChildAt(i12).setImportantForAccessibility(this.f367989j ? 1 : 4);
                if (i13 >= childCount) {
                    break;
                } else {
                    i12 = i13;
                }
            }
        }
        this.f367985f.setOnBackClickListener(new C10871b());
    }

    @Override // androidx.recyclerview.widget.M, androidx.core.view.C22808a
    public final void d(@Y61.k View view, @Y61.k androidx.core.view.accessibility.f fVar) {
        super.d(view, fVar);
        fVar.k(this.f367989j ? m0.f406844a.b(RecyclerView.class).p0() : m0.f406844a.b(Button.class).p0());
        fVar.a(16);
        fVar.l(true);
        fVar.f44999a.setImportantForAccessibility(true);
        fVar.s(true);
        C49755a c49755a = this.f367985f;
        int childCount = c49755a.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            c49755a.getChildAt(i12).setImportantForAccessibility(this.f367989j ? 1 : 4);
            if (i13 >= childCount) {
                return;
            } else {
                i12 = i13;
            }
        }
    }

    @Override // androidx.recyclerview.widget.M, androidx.core.view.C22808a
    public final boolean g(@Y61.k View view, int i12, @Y61.l Bundle bundle) {
        boolean z12;
        Object next;
        View child;
        if (i12 == 16) {
            m(true);
            C49755a c49755a = this.f367985f;
            l(c49755a);
            C22829k0 c22829k0 = new C22829k0(c49755a);
            androidx.camera.core.internal.compat.workaround.e eVarA = kotlin.comparisons.a.a(C37929c.f367995b, C37930d.f367996b);
            C22833m0 c22833m0 = (C22833m0) c22829k0.iterator();
            if (c22833m0.hasNext()) {
                next = c22833m0.next();
                while (c22833m0.hasNext()) {
                    Object next2 = c22833m0.next();
                    if (eVarA.compare(next, next2) > 0) {
                        next = next2;
                    }
                }
            } else {
                next = null;
            }
            View view2 = (View) next;
            if (view2 != null) {
                if ((view2 instanceof com.yandex.div.core.widget.j) && (child = ((com.yandex.div.core.widget.j) view2).getChild()) != null) {
                    view2 = child;
                }
                view2.performAccessibilityAction(64, null);
                view2.sendAccessibilityEvent(1);
            }
            z12 = true;
        } else {
            z12 = false;
        }
        return super.g(view, i12, bundle) || z12;
    }

    @Override // androidx.recyclerview.widget.M
    @Y61.k
    public final C22808a j() {
        c cVar = this.f367988i;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f367988i = cVar2;
        return cVar2;
    }

    public final void k() {
        m(false);
        ArrayList<d> arrayList = this.f367986g;
        Iterator<d> it = arrayList.iterator();
        while (it.hasNext()) {
            d next = it.next();
            View view = next.f367993a.get();
            if (view != null) {
                view.setImportantForAccessibility(next.f367994b);
            }
        }
        arrayList.clear();
    }

    public final void l(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || viewGroup.equals(viewGroup2.getRootView())) {
            return;
        }
        Iterator itA = C22816e.a(viewGroup2);
        while (true) {
            C22833m0 c22833m0 = (C22833m0) itA;
            if (!c22833m0.hasNext()) {
                l(viewGroup2);
                return;
            }
            View view = (View) c22833m0.next();
            if (!kotlin.jvm.internal.L.f(view, viewGroup) && view.getImportantForAccessibility() != 4) {
                this.f367986g.add(new d(new WeakReference(view), view.getImportantForAccessibility()));
                view.setImportantForAccessibility(4);
            }
        }
    }

    public final void m(boolean z12) {
        if (this.f367989j == z12) {
            return;
        }
        this.f367989j = z12;
        C49755a c49755a = this.f367985f;
        int childCount = c49755a.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            c49755a.getChildAt(i12).setImportantForAccessibility(this.f367989j ? 1 : 4);
            if (i13 >= childCount) {
                return;
            } else {
                i12 = i13;
            }
        }
    }
}
