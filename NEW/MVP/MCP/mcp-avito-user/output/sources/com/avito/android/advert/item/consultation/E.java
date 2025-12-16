package com.avito.android.advert.item.consultation;

import com.avito.android.developments_advice.remote.model.CallInterval;
import kotlin.Metadata;

/* compiled from: ConsultationAfterIceBreakersItemView.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E {
    public static final String a(CallInterval callInterval) {
        if (callInterval.getAsSoonAsPossible()) {
            String asSoonAsPossibleTitle = callInterval.getAsSoonAsPossibleTitle();
            return asSoonAsPossibleTitle == null ? "" : asSoonAsPossibleTitle;
        }
        return callInterval.getDayTitle() + ", " + callInterval.getFrom() + (char) 8211 + callInterval.getTo();
    }
}
