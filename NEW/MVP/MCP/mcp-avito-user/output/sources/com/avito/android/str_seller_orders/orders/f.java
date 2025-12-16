package com.avito.android.str_seller_orders.orders;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.services_transportation_widget.dialog.h;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kz0.C43520a;
import lz0.C43851a;
import mz0.C44158c;

/* compiled from: StrOrdersView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/f;", "Lcom/avito/android/str_seller_orders/orders/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f288868a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f288869b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f288870c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.design.tab_layout.c f288871d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ViewPager2 f288872e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public C44158c f288873f;

    /* compiled from: StrOrdersView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_seller_orders/orders/f$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewPager2.i {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            f.this.f288869b.invoke(Integer.valueOf(i12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k View view, @k C43520a c43520a, @k Y41.a<G0> aVar, @k l<? super Integer, G0> lVar) {
        this.f288868a = aVar;
        this.f288869b = lVar;
        this.f288870c = view.getContext();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        com.avito.android.lib.design.tab_layout.c cVar = (com.avito.android.lib.design.tab_layout.c) view.findViewById(R.id.tabs);
        this.f288871d = cVar;
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.pager);
        this.f288872e = viewPager2;
        a aVar2 = new a();
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new h(this, 11));
        }
        if (viewPager2 != null) {
            viewPager2.setAdapter(c43520a);
        }
        if (viewPager2 != null) {
            viewPager2.e(aVar2);
        }
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(false);
        }
        if (cVar == null || viewPager2 == null) {
            return;
        }
        com.avito.android.lib.design.tab_layout.util.b.b(viewPager2, cVar);
    }

    @Override // com.avito.android.str_seller_orders.orders.e
    @SuppressLint({"NotifyDataSetChanged"})
    public final void a(@k C44158c c44158c) {
        RecyclerView.Adapter adapter;
        c.i iVarK;
        C44158c c44158c2 = this.f288873f;
        List<C43851a> list = c44158c2 != null ? c44158c2.f414841b : null;
        List<C43851a> list2 = c44158c.f414841b;
        boolean zF2 = L.f(list2, list);
        com.avito.android.lib.design.tab_layout.c cVar = this.f288871d;
        if (!zF2) {
            if (cVar != null) {
                D6.G(cVar, list2.size() >= 2);
            }
            if (cVar != null) {
                cVar.m();
            }
            List<C43851a> list3 = list2;
            ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((C43851a) it.next()).f414254a.k0(this.f288870c));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (cVar != null) {
                    iVarK = cVar.k();
                    iVarK.c(str);
                } else {
                    iVarK = null;
                }
                if (iVarK != null) {
                    arrayList2.add(iVarK);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                c.i iVar = (c.i) it3.next();
                if (cVar != null) {
                    ArrayList<c.i> arrayList3 = cVar.f180847b;
                    cVar.b(iVar, arrayList3.size(), arrayList3.isEmpty());
                }
            }
        }
        C44158c c44158c3 = this.f288873f;
        int i12 = c44158c.f414842c;
        if ((c44158c3 == null || i12 != c44158c3.f414842c) && cVar != null) {
            cVar.q(cVar.j(i12), true);
        }
        ViewPager2 viewPager2 = this.f288872e;
        if (viewPager2 != null && (adapter = viewPager2.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        this.f288873f = c44158c;
    }
}
