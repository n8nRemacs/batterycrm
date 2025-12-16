package com.avito.android.user_advert.advert.items.realty.verification;

import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyVerificationItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f309961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f309962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, h hVar) {
        super(0);
        this.f309961l = aVar;
        this.f309962m = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() {
        DetailsSheetLinkBody aboutCadastral;
        MyAdvertDetailsActivity myAdvertDetailsActivity;
        a aVar = this.f309961l;
        MyAdvertDetails.CadastralField cadastralField = aVar.f309951d.getCadastralField();
        if (cadastralField != null && (aboutCadastral = cadastralField.getAboutCadastral()) != null && (myAdvertDetailsActivity = this.f309962m.f309966b) != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            ParametrizedEvent parametrizedEvent = null;
            Object[] objArr = 0;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.F9(aVar);
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = myAdvertDetailsActivity.f308324p;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, new DetailsSheetLink(aboutCadastral, parametrizedEvent, 2, objArr == true ? 1 : 0), null, null, 6);
        }
        return G0.f406611a;
    }
}
