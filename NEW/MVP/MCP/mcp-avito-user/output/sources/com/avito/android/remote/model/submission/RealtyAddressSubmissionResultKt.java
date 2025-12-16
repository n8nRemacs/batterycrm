package com.avito.android.remote.model.submission;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResult;
import kotlin.Metadata;

/* compiled from: RealtyAddressSubmissionResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRealtyAddressSubmissionInfo", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionInfo;", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$Ok;", "_avito-discouraged_avito-api_publish"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealtyAddressSubmissionResultKt {
    @l
    public static final RealtyAddressSubmissionInfo toRealtyAddressSubmissionInfo(@k RealtyAddressSubmissionResult.Ok ok2) {
        String title = ok2.getTitle();
        String description = ok2.getDescription();
        RealtyAddressSubmissionResultAdvert advertisement = ok2.getAdvertisement();
        if (title == null || description == null || advertisement == null) {
            return null;
        }
        return new RealtyAddressSubmissionInfo(title, description, advertisement, ok2.getActivateAction(), ok2.getContinueAction());
    }
}
