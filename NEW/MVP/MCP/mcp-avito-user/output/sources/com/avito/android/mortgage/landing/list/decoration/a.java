package com.avito.android.mortgage.landing.list.decoration;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.mortgage.landing.list.items.input.j;
import com.avito.android.mortgage.landing.list.items.steps.f;
import com.avito.android.mortgage.landing.list.items.title.e;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FullscreenItemsDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/decoration/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f199641b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199642c;

    @Inject
    public a(@k com.avito.konveyor.a aVar) {
        this.f199641b = aVar.Y(com.avito.android.mortgage.landing.list.items.subtitle.a.class);
        this.f199642c = aVar.Y(f.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Integer numValueOf;
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        Integer numValueOf2 = Integer.valueOf(iU2);
        if (iU2 == -1) {
            numValueOf2 = null;
        }
        if (numValueOf2 == null) {
            Rect rect2 = new Rect();
            RecyclerView.Y(view, rect2);
            rect.set(rect2);
            return;
        }
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof e) {
            int iB2 = numValueOf2.intValue() == 0 ? y6.b(42) : 0;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            numValueOf = adapter != null ? Integer.valueOf(adapter.getItemViewType(numValueOf2.intValue() + 1)) : null;
            int iB3 = (numValueOf != null && numValueOf.intValue() == this.f199641b) ? y6.b(4) : y6.b(20);
            rect.top = iB2;
            rect.bottom = iB3;
            return;
        }
        if (cW2 instanceof com.avito.android.mortgage.landing.list.items.subtitle.e) {
            rect.bottom = y6.b(20);
            return;
        }
        if (cW2 instanceof j) {
            rect.bottom = y6.b(28);
            return;
        }
        if (cW2 instanceof com.avito.android.mortgage.landing.list.items.select.f) {
            rect.left = y6.b(16);
            rect.right = y6.b(16);
            rect.bottom = y6.b(20);
            return;
        }
        if (cW2 instanceof com.avito.android.mortgage.landing.list.items.chips.f) {
            rect.left = y6.b(16);
            rect.right = y6.b(16);
            rect.bottom = y6.b(20);
            return;
        }
        if (cW2 instanceof com.avito.android.mortgage.landing.list.items.programs.j) {
            rect.top = y6.b(4);
            rect.bottom = y6.b(32);
            return;
        }
        if (cW2 instanceof com.avito.android.mortgage.landing.list.items.offers.k) {
            rect.top = y6.b(12);
            rect.bottom = y6.b(40);
            return;
        }
        if (cW2 instanceof com.avito.android.mortgage.landing.list.items.usp_manager_banner.k) {
            rect.top = y6.b(12);
            return;
        }
        if (cW2 instanceof com.avito.android.mortgage.landing.list.items.action_banner.f) {
            rect.top = y6.b(10);
            rect.bottom = y6.b(52);
            return;
        }
        if (cW2 instanceof com.avito.android.mortgage.landing.list.items.steps.e) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemViewType(numValueOf2.intValue() + 1)) : null;
            rect.bottom = (numValueOf != null && numValueOf.intValue() == this.f199642c) ? y6.b(50) : y6.b(54);
        } else {
            if (cW2 instanceof com.avito.android.mortgage.landing.list.items.steps.with_background.a) {
                rect.bottom = y6.b(54);
                return;
            }
            if (cW2 instanceof com.avito.android.mortgage.landing.list.items.steps_title.e) {
                rect.bottom = y6.b(24);
            } else if (cW2 instanceof com.avito.android.mortgage.landing.list.items.faq_title.e) {
                rect.bottom = y6.b(16);
            } else if (cW2 instanceof com.avito.android.mortgage.landing.list.items.expandable_block.f) {
                rect.bottom = y6.b(24);
            }
        }
    }
}
