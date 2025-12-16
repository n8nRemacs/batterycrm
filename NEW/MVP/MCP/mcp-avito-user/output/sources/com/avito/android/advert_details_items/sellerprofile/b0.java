package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.advert.item.I1;
import com.avito.android.remote.model.service_seller_type.Onboarding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerTypeOnboardingPresenter.kt */
@androidx.compose.runtime.internal.P
@j.K
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/b0;", "Lcom/avito/android/advert_details_items/sellerprofile/a0;", "a", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final X f85605a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public a f85606b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public I1 f85607c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f85608d = true;

    /* compiled from: SellerTypeOnboardingPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/b0$a;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f85609a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Onboarding f85610b;

        public a(int i12, @Y61.k Onboarding onboarding) {
            this.f85609a = i12;
            this.f85610b = onboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f85609a == aVar.f85609a && kotlin.jvm.internal.L.f(this.f85610b, aVar.f85610b);
        }

        public final int hashCode() {
            return this.f85610b.hashCode() + (Integer.hashCode(this.f85609a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "PendingOnboarding(targetViewId=" + this.f85609a + ", onboarding=" + this.f85610b + ')';
        }
    }

    @Inject
    public b0(@Y61.k X x12) {
        this.f85605a = x12;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.a0
    public final void a(int i12) {
        a aVar;
        I1 i13;
        boolean z12 = i12 == 0;
        this.f85608d = z12;
        if (!z12 || (aVar = this.f85606b) == null || (i13 = this.f85607c) == null) {
            return;
        }
        Onboarding onboarding = aVar.f85610b;
        if (i13.g0(aVar.f85609a, onboarding)) {
            this.f85606b = null;
            this.f85605a.b(onboarding.getOnceShowId());
        }
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.a0
    public final void b(int i12, @Y61.k Onboarding onboarding) {
        String onceShowId = onboarding.getOnceShowId();
        X x12 = this.f85605a;
        if (x12.a(onceShowId)) {
            a aVar = this.f85606b;
            if (onboarding.equals(aVar != null ? aVar.f85610b : null)) {
                return;
            }
            if (!this.f85608d) {
                this.f85606b = new a(i12, onboarding);
                return;
            }
            I1 i13 = this.f85607c;
            if (i13 == null) {
                return;
            }
            if (i13.g0(i12, onboarding)) {
                x12.b(onboarding.getOnceShowId());
            } else {
                this.f85606b = new a(i12, onboarding);
            }
        }
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.a0
    public final void e0() {
        this.f85607c = null;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.a0
    public final void k(@Y61.k I1 i12) {
        this.f85607c = i12;
    }
}
