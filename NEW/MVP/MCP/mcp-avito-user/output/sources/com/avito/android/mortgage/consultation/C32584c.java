package com.avito.android.mortgage.consultation;

import androidx.core.os.C22777e;
import com.avito.android.mortgage.consultation.MortgageConsultationDialog;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MortgageConsultationDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/printable_text/PrintableText;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/printable_text/PrintableText;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.consultation.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32584c extends N implements Y41.l<PrintableText, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageConsultationDialog f198534l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32584c(MortgageConsultationDialog mortgageConsultationDialog) {
        super(1);
        this.f198534l = mortgageConsultationDialog;
    }

    @Override // Y41.l
    public final G0 invoke(PrintableText printableText) {
        MortgageConsultationDialog.a aVar = MortgageConsultationDialog.f198515l0;
        MortgageConsultationDialog mortgageConsultationDialog = this.f198534l;
        mortgageConsultationDialog.getParentFragmentManager().o0(C22777e.b(new Q("MORTGAGE_CONSULTATION_RESULT_TOAST_MESSAGE_KEY", printableText)), "MORTGAGE_CONSULTATION_RESULT_BUNDLE");
        mortgageConsultationDialog.dismiss();
        return G0.f406611a;
    }
}
