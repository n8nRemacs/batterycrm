package com.google.android.material.internal;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;

/* compiled from: NavigationMenuPresenter.java */
@RestrictTo
/* renamed from: com.google.android.material.internal.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37078t implements androidx.appcompat.view.menu.o {

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.view.menu.h f356839b;

    /* renamed from: c, reason: collision with root package name */
    public final View.OnClickListener f356840c;

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C37078t c37078t = C37078t.this;
            c37078t.getClass();
            androidx.appcompat.view.menu.k itemData = ((NavigationMenuItemView) view).getItemData();
            boolean zQ2 = c37078t.f356839b.q(itemData, c37078t, 0);
            if (itemData != null && itemData.isCheckable() && zQ2) {
                c37078t.getClass();
                throw null;
            }
            c37078t.getClass();
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$b */
    public static class b extends l {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$c */
    public class c extends RecyclerView.Adapter<l> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i12) {
            return i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i12) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@j.N RecyclerView.C c12, int i12) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @j.P
        public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
            if (i12 == 0) {
                throw null;
            }
            if (i12 == 1) {
                throw null;
            }
            if (i12 == 2) {
                throw null;
            }
            if (i12 != 3) {
                return null;
            }
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.C c12) {
            l lVar = (l) c12;
            if (lVar instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f356734A;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f356743z.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$d */
    public static class d implements e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$e */
    public interface e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$f */
    public static class f implements e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$g */
    public static class g implements e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$h */
    public class h extends androidx.recyclerview.widget.M {
        @Override // androidx.recyclerview.widget.M, androidx.core.view.C22808a
        public final void d(View view, @j.N androidx.core.view.accessibility.f fVar) {
            super.d(view, fVar);
            throw null;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$i */
    public static class i extends l {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$j */
    public static class j extends l {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$k */
    public static class k extends l {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.t$l */
    public static abstract class l extends RecyclerView.C {
    }

    public C37078t() {
        new a();
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean e(androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean f(androidx.appcompat.view.menu.t tVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean g(androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void i(@j.N Context context, @j.N androidx.appcompat.view.menu.h hVar) throws Resources.NotFoundException {
        LayoutInflater.from(context);
        this.f356839b = hVar;
        context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.o
    public final void c(boolean z12) {
    }

    @Override // androidx.appcompat.view.menu.o
    public final void b(androidx.appcompat.view.menu.h hVar, boolean z12) {
    }
}
