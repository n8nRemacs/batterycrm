package com.avito.android.mandatory_verification.data;

import RX.i;
import Y61.k;
import com.avito.android.mandatory_verification.data.model.MandatoryVerificationData;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: MandatoryVerificationConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/data/b;", "Lcom/avito/android/mandatory_verification/data/a;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static MandatoryVerificationData.Button c(RX.f fVar) {
        return new MandatoryVerificationData.Button(fVar.getText(), fVar.getDeeplink(), fVar.getStyle(), fVar.getIcon());
    }

    @Override // com.avito.android.mandatory_verification.data.a
    @k
    public final MandatoryVerificationData a(@k RX.b bVar) {
        long itemId = bVar.getItemId();
        RX.g header = bVar.getHeader();
        MandatoryVerificationData.Header header2 = new MandatoryVerificationData.Header(header.getTitle(), header.getDescription());
        RX.e benefits = bVar.getBenefits();
        String title = benefits.getTitle();
        List<RX.c> listA = benefits.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (RX.c cVar : listA) {
            arrayList.add(new MandatoryVerificationData.Benefits.Benefit(cVar.getTitle(), cVar.getDescription(), new UniversalImage(cVar.getImage().getValue(), cVar.getImage().getValueDark())));
        }
        MandatoryVerificationData.Benefits benefits2 = new MandatoryVerificationData.Benefits(title, arrayList);
        RX.a accountVerification = bVar.getAccountVerification();
        String title2 = accountVerification.getTitle();
        String description = accountVerification.getDescription();
        RX.f button = accountVerification.getButton();
        MandatoryVerificationData.AccountVerification accountVerification2 = new MandatoryVerificationData.AccountVerification(title2, description, button != null ? c(button) : null, accountVerification.getIsComplete(), accountVerification.getVerificationFailedMessage(), accountVerification.getVerificationRequiredMessage(), null, 64, null);
        i objectVerification = bVar.getObjectVerification();
        String title3 = objectVerification.getTitle();
        AttributedText description2 = objectVerification.getDescription();
        String actionTitle = objectVerification.getActionTitle();
        String actionDescription = objectVerification.getActionDescription();
        RX.f button2 = objectVerification.getButton();
        MandatoryVerificationData.Button buttonC = button2 != null ? c(button2) : null;
        List<String> listJ = objectVerification.j();
        if (listJ == null) {
            listJ = C42784z0.f406748b;
        }
        return new MandatoryVerificationData(header2, benefits2, accountVerification2, new MandatoryVerificationData.ObjectVerification(title3, description2, actionTitle, actionDescription, buttonC, false, listJ, objectVerification.getFileErrorMessage(), objectVerification.getFileRequiredMessage(), objectVerification.getTitleFileUploaded(), objectVerification.getUploadPath(), objectVerification.getDeletePath(), objectVerification.getMaxFileSize(), objectVerification.getFileSizeExceedMessage(), null, null, 49184, null), c(bVar.getProceedButton()), bVar.getBottomText(), itemId);
    }

    @Override // com.avito.android.mandatory_verification.data.a
    @k
    public final OX.a b(@k SX.a aVar) {
        return new OX.a(aVar.getResult().getSuccess());
    }
}
