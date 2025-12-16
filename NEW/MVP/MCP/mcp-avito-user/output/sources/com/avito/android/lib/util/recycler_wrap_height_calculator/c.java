package com.avito.android.lib.util.recycler_wrap_height_calculator;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.C35835l0;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.k;
import kotlin.ranges.l;
import kotlin.ranges.s;

/* compiled from: RecyclerWrapHeightCalculator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/recycler_wrap_height_calculator/c;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    public static S a(final c cVar, final RecyclerView recyclerView, RecyclerView.Adapter adapter, H h12, Integer num, int i12) {
        final RecyclerView.Adapter adapter2 = (i12 & 2) != 0 ? null : adapter;
        final boolean z12 = (i12 & 4) == 0;
        if ((i12 & 8) != 0) {
            h12 = io.reactivex.rxjava3.schedulers.b.f404943c;
        }
        final Integer num2 = (i12 & 16) != 0 ? null : num;
        cVar.getClass();
        return new C42006d(new M(num2, recyclerView, adapter2, cVar, z12) { // from class: com.avito.android.lib.util.recycler_wrap_height_calculator.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Integer f181422b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecyclerView f181423c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RecyclerView.Adapter f181424d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f181425e;

            {
                this.f181425e = z12;
            }

            @Override // io.reactivex.rxjava3.core.M
            public final void j(K k12) {
                int iIntValue;
                Integer num3 = this.f181422b;
                RecyclerView recyclerView2 = this.f181423c;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    int measuredWidth = recyclerView2.getMeasuredWidth();
                    Integer numValueOf = Integer.valueOf(measuredWidth);
                    if (measuredWidth <= 0) {
                        numValueOf = null;
                    }
                    iIntValue = numValueOf != null ? numValueOf.intValue() : C35835l0.i(recyclerView2.getContext()).widthPixels;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                a aVar = new a(recyclerView2.getContext(), recyclerView2.getLayoutManager());
                RecyclerView recyclerView3 = new RecyclerView(recyclerView2.getContext(), null);
                recyclerView3.setLayoutManager(aVar);
                RecyclerView.Adapter adapter3 = this.f181424d;
                if (adapter3 == null) {
                    adapter3 = recyclerView2.getAdapter();
                }
                recyclerView3.setAdapter(adapter3);
                recyclerView3.setRecycledViewPool(new RecyclerView.t());
                recyclerView3.setLayoutParams(recyclerView2.getLayoutParams());
                if (this.f181425e) {
                    recyclerView3.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
                }
                l lVarR = s.r(0, recyclerView2.getItemDecorationCount());
                ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
                k it = lVarR.iterator();
                while (it.f406910d) {
                    arrayList.add(recyclerView2.a0(it.a()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    recyclerView3.l((RecyclerView.l) it2.next(), -1);
                }
                recyclerView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                int i13 = aVar.f181421I;
                if (i13 == Integer.MIN_VALUE) {
                    k12.g(new IllegalStateException("Illegal value. Something went wrong."));
                }
                k12.onSuccess(Integer.valueOf(recyclerView2.getPaddingBottom() + recyclerView2.getPaddingTop() + i13));
            }
        }).z(h12).s(io.reactivex.rxjava3.android.schedulers.b.b());
    }
}
