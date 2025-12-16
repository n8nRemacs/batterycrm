package com.avito.android.cart_similar_items.konveyor;

import Y61.k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.cart_similar_items.konveyor.g;
import java.util.List;
import javax.inject.Inject;
import jn.InterfaceC42401a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: GridSpanLookup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/e;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final int f115841e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public List<? extends c> f115842f = C42784z0.f406748b;

    @Inject
    public e(@InterfaceC42401a int i12) {
        this.f115841e = i12;
        this.f53673c = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int size = this.f115842f.size();
        int i13 = this.f115841e;
        if (i12 >= size) {
            return i13;
        }
        g f115822c = this.f115842f.get(i12).getF115822c();
        if (L.f(f115822c, g.a.f115843a)) {
            return i13;
        }
        if (L.f(f115822c, g.b.f115844a)) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
