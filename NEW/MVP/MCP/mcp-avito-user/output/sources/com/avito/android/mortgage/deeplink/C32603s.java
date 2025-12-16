package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage.consultation.MortgageConsultationDialog;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MortgageConsultationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.deeplink.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32603s extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32604t f198887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MortgageConsultationLink f198888m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32603s(C32604t c32604t, MortgageConsultationLink mortgageConsultationLink) {
        super(0);
        this.f198887l = c32604t;
        this.f198888m = mortgageConsultationLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        final C32604t c32604t = this.f198887l;
        c32604t.f198889f.D0("mortgage_consultation", new C32602q(c32604t, this.f198888m));
        c32604t.f198890g.A1("MORTGAGE_CONSULTATION_RESULT_BUNDLE", new androidx.fragment.app.C() { // from class: com.avito.android.mortgage.deeplink.p
            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle, String str) {
                MortgageConsultationDialog.f198515l0.getClass();
                PrintableText printableText = (PrintableText) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("MORTGAGE_CONSULTATION_RESULT_TOAST_MESSAGE_KEY", PrintableText.class) : bundle.getParcelable("MORTGAGE_CONSULTATION_RESULT_TOAST_MESSAGE_KEY"));
                if (printableText != null) {
                    C32604t c32604t2 = c32604t;
                    a.i.C4057a.d(c32604t2.f198891h, printableText, null, C42745f0.U(new c.a.C3720c(12), new c.a.C3719a(c32604t2.f198893j.getString(R.string.mortgage_consultation_message_action), true, null, r.f198886l, 4, null)), null, 0, null, null, null, 2042);
                }
            }
        });
        c32604t.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
