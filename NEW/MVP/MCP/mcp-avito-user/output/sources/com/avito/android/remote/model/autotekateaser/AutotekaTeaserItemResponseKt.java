package com.avito.android.remote.model.autotekateaser;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.teaser.ReportLink;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: AutotekaTeaserItemResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"appendText", "Lcom/avito/android/remote/model/teaser/ReportLink;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "text", "", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class AutotekaTeaserItemResponseKt {
    @l
    public static final ReportLink appendText(@l AutotekaReportLink autotekaReportLink, @k String str) {
        if (autotekaReportLink == null) {
            return null;
        }
        return AutotekaReportLink.copy$default(autotekaReportLink, autotekaReportLink.getTitle() + str, null, 2, null);
    }
}
