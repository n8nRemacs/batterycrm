package com.avito.android.mortgage.pre_approval.form.mvi.builders;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.model.PreApprovalFormStep;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* compiled from: PreApprovalStepListBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/m;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/l;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements l {

    /* compiled from: PreApprovalStepListBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PreApprovalFormStep.values().length];
            try {
                iArr[PreApprovalFormStep.f201845d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreApprovalFormStep.f201846e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreApprovalFormStep.f201847f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreApprovalFormStep.f201848g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public m() {
    }

    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.l
    @Y61.k
    public final List<String> a(@Y61.k PreApprovalFormStep preApprovalFormStep) {
        int iOrdinal = preApprovalFormStep.ordinal();
        if (iOrdinal == 0) {
            return C42745f0.U("purposeId", "regionId");
        }
        if (iOrdinal == 1) {
            return C42756l.B(new String[]{"landCost", "propertyCost", "downPayment", "creditTerm"});
        }
        if (iOrdinal == 2) {
            return C42745f0.U("age", "occupation", "currentExperience");
        }
        if (iOrdinal == 3) {
            return C42745f0.U("income", "proofOfIncome");
        }
        throw new NoWhenBranchMatchedException();
    }
}
