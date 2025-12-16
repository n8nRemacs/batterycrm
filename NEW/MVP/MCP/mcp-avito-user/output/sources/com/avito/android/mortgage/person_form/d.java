package com.avito.android.mortgage.person_form;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.mortgage.person_form.MortgagePersonFormFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MortgagePersonFormView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/d;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f200500b;

    public d(Y41.a<G0> aVar) {
        this.f200500b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        if (i12 == 1) {
            ((MortgagePersonFormFragment.j) this.f200500b).invoke();
        }
    }
}
