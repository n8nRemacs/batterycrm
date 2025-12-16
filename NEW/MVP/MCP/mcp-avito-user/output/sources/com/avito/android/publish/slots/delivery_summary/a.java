package com.avito.android.publish.slots.delivery_summary;

import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DetailsBottomSheetAction;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DetailsBottomSheetDescription;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DetailsHelpContent;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DetailsItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import ml0.q;
import ml0.r;
import ml0.s;
import ml0.t;

/* compiled from: CptEstimateMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {
    public static final DetailsItem a(q qVar) {
        String text = qVar.getText();
        if (text == null) {
            text = "";
        }
        AttributedText attributedText = new AttributedText("", C42784z0.f406748b, 0, 4, null);
        Boolean withHelpIcon = qVar.getWithHelpIcon();
        boolean zBooleanValue = withHelpIcon != null ? withHelpIcon.booleanValue() : false;
        r helpContent = qVar.getHelpContent();
        return new DetailsItem(text, attributedText, zBooleanValue, helpContent != null ? b(helpContent) : null);
    }

    public static final DetailsHelpContent b(r rVar) {
        String label;
        String text;
        s action = rVar.getAction();
        String str = "";
        if (action == null || (label = action.getLabel()) == null) {
            label = "";
        }
        s action2 = rVar.getAction();
        DetailsBottomSheetAction detailsBottomSheetAction = new DetailsBottomSheetAction(label, action2 != null ? action2.getUrl() : null);
        t description = rVar.getDescription();
        if (description != null && (text = description.getText()) != null) {
            str = text;
        }
        return new DetailsHelpContent(detailsBottomSheetAction, new DetailsBottomSheetDescription(str));
    }
}
