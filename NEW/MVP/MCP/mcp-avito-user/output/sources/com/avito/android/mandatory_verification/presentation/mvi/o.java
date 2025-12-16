package com.avito.android.mandatory_verification.presentation.mvi;

import android.content.Context;
import com.avito.android.mandatory_verification.data.model.MandatoryVerificationData;
import com.avito.android.mandatory_verification.items.accountVerification.MandatoryVerificationAccountVerificationItem;
import com.avito.android.mandatory_verification.items.benefits.MandatoryVerificationBenefitsItem;
import com.avito.android.mandatory_verification.items.header.MandatoryVerificationHeaderItem;
import com.avito.android.mandatory_verification.items.uploader.MandatoryVerificationUploaderItem;
import com.avito.android.printable_text.PrintableText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MandatoryVerificationViewStateBuilder.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/o;", "Lcom/avito/android/mandatory_verification/presentation/mvi/n;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f184807a;

    @Inject
    public o(@Y61.k Context context) {
        this.f184807a = context;
    }

    @Override // com.avito.android.mandatory_verification.presentation.mvi.n
    @Y61.k
    public final UX.d a(@Y61.k MandatoryVerificationData mandatoryVerificationData) {
        ArrayList arrayList = new ArrayList();
        MandatoryVerificationData.Header header = mandatoryVerificationData.f184428b;
        arrayList.add(new MandatoryVerificationHeaderItem(null, header.f184451b, header.f184452c, 1, null));
        MandatoryVerificationData.Benefits benefits = mandatoryVerificationData.f184429c;
        if (benefits != null) {
            Iterable<MandatoryVerificationData.Benefits.Benefit> iterable = (Iterable) benefits.f184443c;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
            for (MandatoryVerificationData.Benefits.Benefit benefit : iterable) {
                arrayList2.add(new MandatoryVerificationBenefitsItem.Benefit(benefit.f184444b, benefit.f184445c, benefit.f184446d));
            }
            arrayList.add(new MandatoryVerificationBenefitsItem(null, benefits.f184442b, arrayList2, null, 9, null));
        }
        MandatoryVerificationData.AccountVerification accountVerification = mandatoryVerificationData.f184430d;
        String str = accountVerification.f184435b;
        MandatoryVerificationData.Button button = accountVerification.f184437d;
        arrayList.add(new MandatoryVerificationAccountVerificationItem(null, str, accountVerification.f184436c, button != null ? new MandatoryVerificationAccountVerificationItem.Button(button.f184447b, button.f184448c, button.f184449d) : null, accountVerification.f184438e, accountVerification.f184441h, null, 65, null));
        MandatoryVerificationData.ObjectVerification objectVerification = mandatoryVerificationData.f184431e;
        String str2 = objectVerification.f184458g ? objectVerification.f184462k : objectVerification.f184453b;
        MandatoryVerificationData.Button button2 = objectVerification.f184457f;
        MandatoryVerificationUploaderItem.Button button3 = button2 != null ? new MandatoryVerificationUploaderItem.Button(button2.f184447b, button2.f184449d, button2.f184450e) : null;
        com.avito.android.mandatory_verification.domain.file_uploader.a aVar = objectVerification.f184467p;
        MandatoryVerificationUploaderItem.FileItem fileItem = aVar != null ? new MandatoryVerificationUploaderItem.FileItem(aVar.f184504a, aVar.f184505b, aVar.f184506c, true, null) : null;
        PrintableText printableText = objectVerification.f184468q;
        arrayList.add(new MandatoryVerificationUploaderItem(null, str2, objectVerification.f184454c, objectVerification.f184455d, objectVerification.f184456e, button3, objectVerification.f184458g, fileItem, printableText != null ? printableText.k0(this.f184807a) : null, objectVerification.f184459h, null, 1025, null));
        return new UX.d(arrayList);
    }
}
