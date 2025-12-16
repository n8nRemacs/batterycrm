package com.avito.android.seller_promotions.konveyor;

import Lq0.InterfaceC14430a;
import Y61.k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.seller_promotions.konveyor.g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: GridSpanLookup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/e;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final int f267802e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public List<? extends c> f267803f = C42784z0.f406748b;

    @Inject
    public e(@InterfaceC14430a int i12) {
        this.f267802e = i12;
        this.f53673c = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int size = this.f267803f.size();
        int i13 = this.f267802e;
        if (i12 >= size) {
            return i13;
        }
        g f267766c = this.f267803f.get(i12).getF267766c();
        if (L.f(f267766c, g.a.f267804a)) {
            return i13;
        }
        if (L.f(f267766c, g.b.f267805a)) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
