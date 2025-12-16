package com.avito.android.mortgage.pre_approval.form.mvi.builders;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.pre_approval.form.model.PreApprovalFormStep;
import java.io.Serializable;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;

/* compiled from: PreApprovalFormViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/j;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/i;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f201863a;

    @Inject
    public j(@Y61.k f fVar) {
        this.f201863a = fVar;
    }

    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.i
    @Y61.k
    public final R00.b a(@Y61.k R00.b bVar) {
        f fVar = this.f201863a;
        Map<String, P00.a> map = bVar.f14056b;
        PreApprovalFormStep preApprovalFormStep = bVar.f14058d;
        return R00.b.a(bVar, null, null, null, null, null, new R00.c(com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_screen_title, Integer.valueOf(preApprovalFormStep.f201851b), Integer.valueOf(((AbstractC42734a) PreApprovalFormStep.f201850i).getF38291e())), fVar.a(map, preApprovalFormStep), preApprovalFormStep.b() != null, preApprovalFormStep.a() == null ? com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_finish_button, new Serializable[0]) : com.avito.android.printable_text.b.c(R.string.next, new Serializable[0]), bVar.f14060f), 31);
    }
}
