package com.avito.android.mortgage.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.mortgage.consultation.MortgageConsultationDialog;
import com.avito.android.mortgage.consultation.model.ConsultationArguments;
import kotlin.Metadata;

/* compiled from: MortgageConsultationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.deeplink.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32602q extends kotlin.jvm.internal.N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageConsultationLink f198885l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32602q(C32604t c32604t, MortgageConsultationLink mortgageConsultationLink) {
        super(0);
        this.f198885l = mortgageConsultationLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        MortgageConsultationDialog.a aVar = MortgageConsultationDialog.f198515l0;
        MortgageConsultationLink mortgageConsultationLink = this.f198885l;
        ConsultationArguments consultationArguments = new ConsultationArguments(mortgageConsultationLink.f198695b, mortgageConsultationLink.f198696c, mortgageConsultationLink.f198697d, mortgageConsultationLink.f198698e);
        aVar.getClass();
        return MortgageConsultationDialog.a.a(consultationArguments);
    }
}
