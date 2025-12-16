package com.avito.android.publish.edit_advert_request;

import Ju.InterfaceC14249c;
import androidx.view.C23038g0;
import com.avito.android.deep_linking.links.AuctionOfferLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.error.z;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.publish.edit_advert_request.j;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: EditAdvertRequestViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f235528b;

    public k(j jVar) {
        this.f235528b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C43501a c43501a = (C43501a) obj;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        boolean z12 = interfaceC14249c instanceof PaidServicesLink.a;
        j jVar = this.f235528b;
        if (z12) {
            jVar.le();
            return;
        }
        boolean z13 = interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.a;
        C23038g0<j.a> c23038g0 = jVar.f235516T;
        if (z13) {
            String strI = z.i(((MyAdvertLink.ActivateV2.b.a) interfaceC14249c).f133470c);
            if (strI == null) {
                strI = jVar.f235515S;
            }
            c23038g0.setValue(new j.a.b(strI, jVar.me()));
            return;
        }
        if (interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.c) {
            String str = ((MyAdvertLink.ActivateV2.b.c) interfaceC14249c).f133472b;
            if (str == null) {
                str = jVar.f235515S;
            }
            c23038g0.setValue(new j.a.b(str, jVar.me()));
            return;
        }
        if (interfaceC14249c instanceof AuctionOfferLink.a.C3986a) {
            jVar.le();
            return;
        }
        if (interfaceC14249c instanceof AuctionOfferLink.a.c) {
            AuctionOfferLink.a.c cVar = (AuctionOfferLink.a.c) interfaceC14249c;
            jVar.ne(cVar.f133027b, cVar.f133028c);
        } else if (L.f(c43501a.f413260a.f134521b, "req_fees")) {
            jVar.le();
        }
    }
}
