package com.avito.android.travel_payment_methods.items.loan_terms;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LoanTermsViewHolderFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/loan_terms/w;", "Lcom/avito/android/travel_payment_methods/items/loan_terms/v;", "<init>", "()V", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class w implements v {

    /* compiled from: LoanTermsViewHolderFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/travel_payment_methods/items/loan_terms/A;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/travel_payment_methods/items/loan_terms/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, A> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f302513l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final A invoke(ViewGroup viewGroup, View view) {
            return new A(view);
        }
    }

    @Inject
    public w() {
    }

    @Override // com.avito.android.travel_payment_methods.items.loan_terms.v
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> create() {
        return new g.a<>(R.layout.item_loan_terms, a.f302513l);
    }
}
