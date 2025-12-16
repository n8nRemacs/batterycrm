package com.avito.android.advert.item.consultation.secondary;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.advert_core.advert.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.remote.model.advert_details.realty.ConsultationButton;
import com.avito.android.remote.model.advert_details.realty.NonNdForm;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SecondaryConsultationItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/secondary/e;", "Lcom/avito/android/advert/item/consultation/secondary/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.consultation.view_model.a f74806b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l f74807c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public g f74808d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public InterfaceC28130g0 f74809e;

    /* compiled from: SecondaryConsultationItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/developments_advice/remote/model/ContactInfoResponse;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<P2<? super ContactInfoResponse>, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(P2<? super ContactInfoResponse> p22) {
            P2<? super ContactInfoResponse> p23 = p22;
            g gVar = e.this.f74808d;
            if (gVar != null) {
                gVar.p5(p23);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SecondaryConsultationItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f74811b;

        public b(Y41.l lVar) {
            this.f74811b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f74811b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f74811b;
        }

        public final int hashCode() {
            return this.f74811b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f74811b.invoke(obj);
        }
    }

    @Inject
    public e(@k com.avito.android.advert.item.consultation.view_model.a aVar, @k l lVar) {
        this.f74806b = aVar;
        this.f74807c = lVar;
    }

    @Override // com.avito.android.advert.item.consultation.secondary.c
    public final void M() {
        this.f74806b.j5().observe(this.f74807c.e(), new b(new a()));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ConsultationButton button;
        DeepLink entryPointShowEvent;
        InterfaceC28130g0 interfaceC28130g0;
        g gVar = (g) eVar;
        SecondaryConsultationItem secondaryConsultationItem = (SecondaryConsultationItem) aVar;
        this.f74808d = gVar;
        NonNdForm nonNdForm = secondaryConsultationItem.f74799e;
        if (nonNdForm != null && (entryPointShowEvent = nonNdForm.getEntryPointShowEvent()) != null && (interfaceC28130g0 = this.f74809e) != null) {
            interfaceC28130g0.t(entryPointShowEvent);
        }
        if (nonNdForm != null) {
            gVar.W20(nonNdForm);
        }
        String title = null;
        gVar.b(nonNdForm != null ? nonNdForm.getFormTitle() : null);
        gVar.C4(nonNdForm != null ? nonNdForm.getDisclaimer() : null);
        if (nonNdForm != null && (button = nonNdForm.getButton()) != null) {
            title = button.getTitle();
        }
        gVar.Ov(new d(secondaryConsultationItem, this), title);
        this.f74806b.o(false);
    }

    @Override // com.avito.android.advert.item.consultation.secondary.c
    public final void s(@k InterfaceC28130g0 interfaceC28130g0) {
        this.f74809e = interfaceC28130g0;
    }
}
