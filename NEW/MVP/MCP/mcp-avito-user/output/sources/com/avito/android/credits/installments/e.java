package com.avito.android.credits.installments;

import Y61.k;
import Y61.l;
import com.avito.android.V;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.credits.installments.a;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.credit_broker.InstallmentsV2Product;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;

/* compiled from: InstallmentsStickyBlockManagerImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/installments/e;", "Lcom/avito/android/credits/installments/d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.credits.installments.b f128868a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public V f128869b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<List<ContactBar.InfoStickyBlock>> f128870c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C41981q0 f128871d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.credits.installments.a> f128872e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C41981q0 f128873f;

    /* compiled from: InstallmentsStickyBlockManagerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<com.avito.android.credits.installments.a, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.credits.installments.a aVar) {
            ((e) this.receiver).b(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsStickyBlockManagerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<com.avito.android.credits.installments.a, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.credits.installments.a aVar) {
            ((e) this.receiver).b(aVar);
            return G0.f406611a;
        }
    }

    @Inject
    public e(@k com.avito.android.credits.installments.b bVar) {
        this.f128868a = bVar;
        com.jakewharton.rxrelay3.c<List<ContactBar.InfoStickyBlock>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f128870c = cVar;
        this.f128871d = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<com.avito.android.credits.installments.a> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f128872e = cVar2;
        this.f128873f = new C41981q0(cVar2);
    }

    @Override // com.avito.android.credits.installments.d
    @k
    /* renamed from: a, reason: from getter */
    public final C41981q0 getF128871d() {
        return this.f128871d;
    }

    @Override // com.avito.android.credits.installments.d
    public final void b(@k com.avito.android.credits.installments.a aVar) {
        V v12;
        if (aVar instanceof a.b) {
            V v13 = this.f128869b;
            if (v13 != null) {
                v13.q();
            }
        } else if (aVar instanceof a.c) {
            V v14 = this.f128869b;
            if (v14 != null) {
                v14.e(((a.c) aVar).f128863a);
            }
        } else if ((aVar instanceof a.C3820a) && (v12 = this.f128869b) != null) {
            v12.E();
        }
        this.f128872e.accept(aVar);
    }

    @Override // com.avito.android.credits.installments.d
    @k
    public final List<ContactBar.InfoStickyBlock> c(@k CreditBrokerProduct creditBrokerProduct) {
        List<LoanTerms.Term> terms;
        LoanTerms.Term term;
        Integer num;
        V v12 = this.f128869b;
        if (v12 != null) {
            v12.D();
        }
        b bVar = new b(1, this, e.class, "handleAction", "handleAction(Lcom/avito/android/credits/installments/InstallmentsStickyAction;)V", 0);
        this.f128868a.getClass();
        InstallmentsV2Product installmentsV2Product = creditBrokerProduct instanceof InstallmentsV2Product ? (InstallmentsV2Product) creditBrokerProduct : null;
        if (installmentsV2Product == null) {
            return C42784z0.f406748b;
        }
        LoanTerms loanTerms = installmentsV2Product.getLoanTerms();
        int iIntValue = (loanTerms == null || (num = loanTerms.getDefault()) == null) ? 0 : num.intValue();
        LoanTerms loanTerms2 = installmentsV2Product.getLoanTerms();
        return (loanTerms2 == null || (terms = loanTerms2.getTerms()) == null || (term = (LoanTerms.Term) C42745f0.K(iIntValue, terms)) == null) ? C42784z0.f406748b : com.avito.android.credits.installments.b.a(term, bVar);
    }

    @Override // com.avito.android.credits.installments.d
    public final void d(@k V v12) {
        this.f128869b = v12;
    }

    @Override // com.avito.android.credits.installments.d
    public final void e(@k LoanTerms.Term term) {
        a aVar = new a(1, this, e.class, "handleAction", "handleAction(Lcom/avito/android/credits/installments/InstallmentsStickyAction;)V", 0);
        this.f128868a.getClass();
        this.f128870c.accept(com.avito.android.credits.installments.b.a(term, aVar));
    }

    @Override // com.avito.android.credits.installments.d
    @k
    /* renamed from: f, reason: from getter */
    public final C41981q0 getF128873f() {
        return this.f128873f;
    }
}
