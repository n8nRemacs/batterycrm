package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item;

import Y61.k;
import com.avito.android.remote.model.PollButtonVariant;
import com.avito.android.remote.model.PricePoll;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: ImvCarsDetailsPollPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_poll_item/e;", "LTV0/d;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_poll_item/g;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_poll_item/ImvCarsDetailsPollItem;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<g, ImvCarsDetailsPollItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<WM.a> f170151b;

    @Inject
    public e(@k l41.g<WM.a> gVar) {
        this.f170151b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String id2;
        Integer numY0;
        String id3;
        Integer numY02;
        g gVar = (g) eVar;
        ImvCarsDetailsPollItem imvCarsDetailsPollItem = (ImvCarsDetailsPollItem) aVar;
        PricePoll pricePoll = imvCarsDetailsPollItem.f170140c;
        gVar.b(pricePoll.getText());
        if (pricePoll.isAnswered()) {
            gVar.Dr();
            gVar.nf();
            gVar.iR(pricePoll.getAnsweredText());
            return;
        }
        List<PollButtonVariant> answers = pricePoll.getAnswers();
        PollButtonVariant pollButtonVariant = answers != null ? (PollButtonVariant) C42745f0.G(answers) : null;
        if (pollButtonVariant == null || (id3 = pollButtonVariant.getId()) == null || (numY02 = C43066x.y0(id3)) == null) {
            gVar.Dr();
        } else {
            gVar.Rj(pollButtonVariant.getText(), new d(this, imvCarsDetailsPollItem, numY02.intValue()));
        }
        List<PollButtonVariant> answers2 = pricePoll.getAnswers();
        PollButtonVariant pollButtonVariant2 = answers2 != null ? (PollButtonVariant) C42745f0.K(1, answers2) : null;
        if (pollButtonVariant2 == null || (id2 = pollButtonVariant2.getId()) == null || (numY0 = C43066x.y0(id2)) == null) {
            gVar.nf();
        } else {
            gVar.JT(pollButtonVariant2.getText(), new c(this, imvCarsDetailsPollItem, numY0.intValue()));
        }
        gVar.iR(null);
    }
}
