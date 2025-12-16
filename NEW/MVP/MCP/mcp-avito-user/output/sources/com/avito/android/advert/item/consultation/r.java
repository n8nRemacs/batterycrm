package com.avito.android.advert.item.consultation;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.developments_advice.remote.model.Phone;
import com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker;
import com.avito.android.util.P2;
import com.avito.android.util.T2;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/developments_advice/remote/model/ContactInfoResponse;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<P2<? super ContactInfoResponse>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28118y f74792l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ConsultationAfterIceBreakersItem f74793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, C28118y c28118y) {
        super(1);
        this.f74792l = c28118y;
        this.f74793m = consultationAfterIceBreakersItem;
    }

    @Override // Y41.l
    public final G0 invoke(P2<? super ContactInfoResponse> p22) {
        List<Phone> listD;
        P2<? super ContactInfoResponse> p23 = p22;
        InterfaceC28130g0 interfaceC28130g0 = this.f74792l.f74854f;
        if (interfaceC28130g0 != null) {
            ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem = this.f74793m;
            ConsultationAfterIceBreaker consultationAfterIceBreaker = consultationAfterIceBreakersItem.f74646e;
            String phone = null;
            String requestType = consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getRequestType() : null;
            ConsultationAfterIceBreaker consultationAfterIceBreaker2 = consultationAfterIceBreakersItem.f74646e;
            String formPage = consultationAfterIceBreaker2 != null ? consultationAfterIceBreaker2.getFormPage() : null;
            ContactInfoResponse contactInfoResponse = (ContactInfoResponse) T2.a(p23);
            if (contactInfoResponse != null && (listD = contactInfoResponse.d()) != null) {
                for (Phone phone2 : listD) {
                    if (phone2.getIsConfirmed()) {
                        phone = phone2.getPhone();
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            interfaceC28130g0.B0(requestType, formPage, phone);
        }
        return G0.f406611a;
    }
}
