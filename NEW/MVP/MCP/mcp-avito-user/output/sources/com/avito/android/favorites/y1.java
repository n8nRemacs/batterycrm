package com.avito.android.favorites;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.remote.model.CategoriesWidget;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Views.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/G6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class y1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f157627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CategoryChipable f157628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f157629d;

    public y1(x1 x1Var, CategoryChipable categoryChipable, Y41.a aVar) {
        this.f157627b = x1Var;
        this.f157628c = categoryChipable;
        this.f157629d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CategoryChipable categoryChipable;
        x1 x1Var = this.f157627b;
        RecyclerView recyclerView = x1Var.f157612p.f178693s;
        Iterator it = ((com.avito.android.lib.design.chips.t) recyclerView.getAdapter()).f178730i.iterator();
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            categoryChipable = this.f157628c;
            if (!zHasNext) {
                i12 = -1;
                break;
            } else if (categoryChipable.V1(it.next())) {
                break;
            } else {
                i12++;
            }
        }
        RecyclerView.C cP2 = recyclerView.P(i12);
        View view = cP2 != null ? cP2.itemView : null;
        if (view != null) {
            com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(x1Var.f157607k, 0, 0, 6, null);
            r.a aVar = new r.a(new i.c(new b.a()));
            CategoriesWidget.CategoryOnboarding categoryOnboarding = categoryChipable.f156205g;
            kVar.b(new TooltipState(aVar, false, null, categoryOnboarding != null ? categoryOnboarding.getTitle() : null, categoryOnboarding != null ? categoryOnboarding.getBody() : null, null, null, null, null, null, false, null, null, null, 15334, null));
            int i13 = kVar.f181229o;
            kVar.f181228n = -1;
            kVar.f181229o = i13;
            x1Var.f157619w = kVar;
            ((Q0) this.f157629d).invoke();
            com.avito.android.lib.design.tooltip.k kVar2 = x1Var.f157619w;
            if (kVar2 != null) {
                kVar2.f(view);
            }
        }
    }
}
