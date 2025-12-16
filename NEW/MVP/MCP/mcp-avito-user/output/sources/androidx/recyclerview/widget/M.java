package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C22808a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes10.dex */
public class M extends C22808a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f53723d;

    /* renamed from: e, reason: collision with root package name */
    public final a f53724e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends C22808a {

        /* renamed from: d, reason: collision with root package name */
        public final M f53725d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakHashMap f53726e = new WeakHashMap();

        public a(@j.N M m12) {
            this.f53725d = m12;
        }

        @Override // androidx.core.view.C22808a
        public final boolean a(@j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
            C22808a c22808a = (C22808a) this.f53726e.get(view);
            return c22808a != null ? c22808a.a(view, accessibilityEvent) : this.f44991a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C22808a
        @j.P
        public final androidx.core.view.accessibility.g b(@j.N View view) {
            C22808a c22808a = (C22808a) this.f53726e.get(view);
            return c22808a != null ? c22808a.b(view) : super.b(view);
        }

        @Override // androidx.core.view.C22808a
        public final void c(@j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
            C22808a c22808a = (C22808a) this.f53726e.get(view);
            if (c22808a != null) {
                c22808a.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C22808a
        public void d(View view, androidx.core.view.accessibility.f fVar) {
            M m12 = this.f53725d;
            boolean zB02 = m12.f53723d.b0();
            View.AccessibilityDelegate accessibilityDelegate = this.f44991a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            if (!zB02) {
                RecyclerView recyclerView = m12.f53723d;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().M0(view, fVar);
                    C22808a c22808a = (C22808a) this.f53726e.get(view);
                    if (c22808a != null) {
                        c22808a.d(view, fVar);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // androidx.core.view.C22808a
        public final void e(@j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
            C22808a c22808a = (C22808a) this.f53726e.get(view);
            if (c22808a != null) {
                c22808a.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C22808a
        public final boolean f(@j.N ViewGroup viewGroup, @j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
            C22808a c22808a = (C22808a) this.f53726e.get(viewGroup);
            return c22808a != null ? c22808a.f(viewGroup, view, accessibilityEvent) : this.f44991a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C22808a
        public final boolean g(View view, int i12, Bundle bundle) {
            M m12 = this.f53725d;
            if (!m12.f53723d.b0()) {
                RecyclerView recyclerView = m12.f53723d;
                if (recyclerView.getLayoutManager() != null) {
                    C22808a c22808a = (C22808a) this.f53726e.get(view);
                    if (c22808a != null) {
                        if (c22808a.g(view, i12, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i12, bundle)) {
                        return true;
                    }
                    RecyclerView.u uVar = recyclerView.getLayoutManager().f53837c.f53765c;
                    return false;
                }
            }
            return super.g(view, i12, bundle);
        }

        @Override // androidx.core.view.C22808a
        public final void h(@j.N View view, int i12) {
            C22808a c22808a = (C22808a) this.f53726e.get(view);
            if (c22808a != null) {
                c22808a.h(view, i12);
            } else {
                super.h(view, i12);
            }
        }

        @Override // androidx.core.view.C22808a
        public final void i(@j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
            C22808a c22808a = (C22808a) this.f53726e.get(view);
            if (c22808a != null) {
                c22808a.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public M(@j.N RecyclerView recyclerView) {
        this.f53723d = recyclerView;
        C22808a c22808aJ = j();
        if (c22808aJ == null || !(c22808aJ instanceof a)) {
            this.f53724e = new a(this);
        } else {
            this.f53724e = (a) c22808aJ;
        }
    }

    @Override // androidx.core.view.C22808a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f53723d.b0()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C22808a
    public void d(View view, androidx.core.view.accessibility.f fVar) {
        this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
        RecyclerView recyclerView = this.f53723d;
        if (recyclerView.b0() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f53837c;
        layoutManager.L0(recyclerView2.f53765c, recyclerView2.f53778i0, fVar);
    }

    @Override // androidx.core.view.C22808a
    public boolean g(View view, int i12, Bundle bundle) {
        if (super.g(view, i12, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f53723d;
        if (recyclerView.b0() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f53837c;
        return layoutManager.a1(recyclerView2.f53765c, recyclerView2.f53778i0, i12, bundle);
    }

    @j.N
    public C22808a j() {
        return this.f53724e;
    }
}
