package com.avito.android.mortgage.person_form.list.items.verification_banner;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.verification_banner.payloads.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationBannerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/d;", "LC00/b;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/f;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/VerificationBannerItem;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends C00.b<f, VerificationBannerItem, com.avito.android.mortgage.person_form.list.items.verification_banner.payloads.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<E00.b, G0> f200835b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super E00.b, G0> lVar) {
        this.f200835b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        VerificationBannerItem verificationBannerItem = (VerificationBannerItem) aVar;
        fVar.A2(verificationBannerItem.f200825e);
        fVar.setTitle(verificationBannerItem.f200823c);
        fVar.n(verificationBannerItem.f200824d);
        fVar.Th(verificationBannerItem.f200826f, verificationBannerItem.f200827g);
        fVar.EI(verificationBannerItem.f200828h);
        fVar.U(new c(this));
    }

    @Override // C00.b
    public final void k(C00.c cVar, PersonFormItem personFormItem, int i12, List<? extends com.avito.android.mortgage.person_form.list.items.verification_banner.payloads.a> list) {
        f fVar = (f) cVar;
        for (com.avito.android.mortgage.person_form.list.items.verification_banner.payloads.a aVar : list) {
            if (aVar instanceof a.d) {
                fVar.A2(((a.d) aVar).f200847a);
            } else if (aVar instanceof a.e) {
                fVar.setTitle(((a.e) aVar).f200848a);
            } else if (aVar instanceof a.c) {
                fVar.n(((a.c) aVar).f200846a);
            } else if (aVar instanceof a.b) {
                a.b bVar = (a.b) aVar;
                fVar.Th(bVar.f200844a, bVar.f200845b);
            } else if (aVar instanceof a.C5952a) {
                fVar.EI(((a.C5952a) aVar).f200843a);
            }
        }
    }
}
