package com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer;

import com.avito.android.blueprints.publish.infomation.item.DisclaimerItem;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.information.TextStyle;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DisclaimerSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/disclaimer/f;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/information/InformationSlot;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends k<InformationSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InformationSlot f148769b;

    public f(@Y61.k InformationSlot informationSlot) {
        this.f148769b = informationSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f148769b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        InformationSlot informationSlot = this.f148769b;
        String id2 = informationSlot.getId();
        AttributedText text = ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getText();
        AttributedText subtitle = ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getSubtitle();
        TextStyle style = ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getStyle();
        if (style == null) {
            style = TextStyle.DEFAULT;
        }
        return Collections.singletonList(new DisclaimerItem(id2, text, subtitle, style, ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getImage(), ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getTopMargin(), null, 64, null));
    }
}
