package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import j.InterfaceC42153i;
import j.N;
import java.util.List;
import java.util.WeakHashMap;
import tY0.InterfaceC48618b;

@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f357716a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f357717b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f357718c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48618b f357719d;

        public a(View view, int i12, InterfaceC48618b interfaceC48618b) {
            this.f357717b = view;
            this.f357718c = i12;
            this.f357719d = interfaceC48618b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f357717b;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f357716a == this.f357718c) {
                InterfaceC48618b interfaceC48618b = this.f357719d;
                expandableBehavior.v((View) interfaceC48618b, view, interfaceC48618b.o0(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f357716a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean d(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC42153i
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC48618b interfaceC48618b = (InterfaceC48618b) view2;
        if (interfaceC48618b.o0()) {
            int i12 = this.f357716a;
            if (i12 != 0 && i12 != 2) {
                return false;
            }
        } else if (this.f357716a != 1) {
            return false;
        }
        this.f357716a = interfaceC48618b.o0() ? 1 : 2;
        v((View) interfaceC48618b, view, interfaceC48618b.o0(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC42153i
    public final boolean j(@N CoordinatorLayout coordinatorLayout, @N View view, int i12) {
        InterfaceC48618b interfaceC48618b;
        int i13;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!view.isLaidOut()) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    interfaceC48618b = null;
                    break;
                }
                View view2 = dependencies.get(i14);
                if (d(view, view2)) {
                    interfaceC48618b = (InterfaceC48618b) view2;
                    break;
                }
                i14++;
            }
            if (interfaceC48618b != null && (!interfaceC48618b.o0() ? this.f357716a == 1 : !((i13 = this.f357716a) != 0 && i13 != 2))) {
                int i15 = interfaceC48618b.o0() ? 1 : 2;
                this.f357716a = i15;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i15, interfaceC48618b));
            }
        }
        return false;
    }

    public abstract void v(View view, View view2, boolean z12, boolean z13);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f357716a = 0;
    }
}
