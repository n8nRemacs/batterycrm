package com.avito.android.profile_phones.landline_verification;

import android.widget.TextView;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import com.avito.android.util.D6;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: LandlinePhoneVerificationFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$b;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.l<LandlinePhoneVerificationViewModel.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LandlinePhoneVerificationFragment f227224l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LandlinePhoneVerificationFragment landlinePhoneVerificationFragment) {
        super(1);
        this.f227224l = landlinePhoneVerificationFragment;
    }

    @Override // Y41.l
    public final G0 invoke(LandlinePhoneVerificationViewModel.b bVar) {
        LandlinePhoneVerificationViewModel.b bVar2 = bVar;
        LandlinePhoneVerificationFragment landlinePhoneVerificationFragment = this.f227224l;
        LandlinePhoneVerificationFragment.q5(landlinePhoneVerificationFragment, false);
        String str = bVar2.f227203a;
        if (str == null) {
            TextView textView = landlinePhoneVerificationFragment.f227164q0;
            if (textView == null) {
                textView = null;
            }
            D6.H(textView);
        } else {
            PrintableText printableTextC = C43066x.K(str) ? com.avito.android.printable_text.b.c(R.string.confirm_phone_action_error, new Serializable[0]) : com.avito.android.printable_text.b.f(bVar2.f227203a);
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.c(cVar, landlinePhoneVerificationFragment, printableTextC, null, null, f.c.a.a(bVar2.f227204b, bVar2.f227205c), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        }
        return G0.f406611a;
    }
}
