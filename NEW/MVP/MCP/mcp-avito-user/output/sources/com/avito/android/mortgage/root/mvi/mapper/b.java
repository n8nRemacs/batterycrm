package com.avito.android.mortgage.root.mvi.mapper;

import KZ.C14272b;
import KZ.C14278h;
import KZ.C14279i;
import KZ.C14281k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfo;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfoFloatField;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfoIntField;
import com.avito.android.mortgage.api.model.items.application.ApplicationLegacyStatusType;
import com.avito.android.mortgage.root.list.items.bank.e;
import com.avito.android.mortgage.root.list.items.bank.f;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootDomainToUiItemsMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/mapper/b;", "Lcom/avito/android/mortgage/root/mvi/mapper/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage.root.mvi.mapper.a {

    /* compiled from: MortgageRootDomainToUiItemsMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203293a;

        static {
            int[] iArr = new int[ApplicationLegacyStatusType.values().length];
            try {
                iArr[ApplicationLegacyStatusType.VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplicationLegacyStatusType.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApplicationLegacyStatusType.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f203293a = iArr;
        }
    }

    @Inject
    public b() {
    }

    public static com.avito.android.mortgage.root.list.items.bank.c b(C14272b c14272b) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        ApplicationAppealCreditInfoIntField loanTerm;
        ApplicationAppealCreditInfoFloatField rate;
        ApplicationAppealCreditInfoIntField monthlyPayment;
        ApplicationAppealCreditInfoIntField initialPayment;
        ApplicationAppealCreditInfoIntField loanAmount;
        ApplicationAppealCreditInfo creditInfo = c14272b.getCreditInfo();
        if (creditInfo == null || (loanAmount = creditInfo.getLoanAmount()) == null) {
            eVar = null;
        } else {
            e.f202352c.getClass();
            eVar = new e(loanAmount.getTitle(), loanAmount.getValue());
        }
        ApplicationAppealCreditInfo creditInfo2 = c14272b.getCreditInfo();
        if (creditInfo2 == null || (initialPayment = creditInfo2.getInitialPayment()) == null) {
            eVar2 = null;
        } else {
            e.f202352c.getClass();
            eVar2 = new e(initialPayment.getTitle(), initialPayment.getValue());
        }
        ApplicationAppealCreditInfo creditInfo3 = c14272b.getCreditInfo();
        if (creditInfo3 == null || (monthlyPayment = creditInfo3.getMonthlyPayment()) == null) {
            eVar3 = null;
        } else {
            e.f202352c.getClass();
            eVar3 = new e(monthlyPayment.getTitle(), monthlyPayment.getValue());
        }
        ApplicationAppealCreditInfo creditInfo4 = c14272b.getCreditInfo();
        if (creditInfo4 == null || (rate = creditInfo4.getRate()) == null) {
            eVar4 = null;
        } else {
            e.f202352c.getClass();
            eVar4 = new e(rate.getTitle(), rate.getValue());
        }
        ApplicationAppealCreditInfo creditInfo5 = c14272b.getCreditInfo();
        if (creditInfo5 == null || (loanTerm = creditInfo5.getLoanTerm()) == null) {
            eVar5 = null;
        } else {
            e.f202352c.getClass();
            eVar5 = new e(loanTerm.getTitle(), loanTerm.getValue());
        }
        String id2 = c14272b.getId();
        String iconUrl = c14272b.getIconUrl();
        String title = c14272b.getTitle();
        AttributedText status = c14272b.getStatus();
        ArrayList arrayListB = C42756l.B(new e[]{eVar, eVar2, eVar3, eVar4, eVar5});
        ApplicationAppealComment comment = c14272b.getComment();
        C14279i selectBankButton = c14272b.getSelectBankButton();
        f fVar = selectBankButton != null ? new f(selectBankButton.getTitle(), !selectBankButton.getIsDisabled(), false, 4, null) : null;
        C14281k textToManagerButton = c14272b.getTextToManagerButton();
        com.avito.android.mortgage.root.list.items.bank.d dVar = textToManagerButton != null ? new com.avito.android.mortgage.root.list.items.bank.d(textToManagerButton.getTitle(), false, 2, null) : null;
        C14278h goToApplicationButton = c14272b.getGoToApplicationButton();
        return new com.avito.android.mortgage.root.list.items.bank.c(id2, iconUrl, title, status, arrayListB, comment, fVar, dVar, goToApplicationButton != null ? new com.avito.android.mortgage.root.list.items.bank.d(goToApplicationButton.getTitle(), false, 2, null) : null, c14272b.getAppealBankInfo() != null, false, 1024, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04d3  */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v36, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v39 */
    @Override // com.avito.android.mortgage.root.mvi.mapper.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.l java.lang.String r24, @Y61.k java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.mapper.b.a(java.lang.String, java.util.List):java.util.ArrayList");
    }
}
