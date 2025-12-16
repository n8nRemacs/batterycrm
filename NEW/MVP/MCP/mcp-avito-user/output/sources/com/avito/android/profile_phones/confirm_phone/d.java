package com.avito.android.profile_phones.confirm_phone;

import android.content.Context;
import android.content.Intent;
import com.avito.android.profile_phones.confirm_phone.l;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConfirmPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/d;", "Li/a;", "Lcom/avito/android/profile_phones/confirm_phone/l$b$c;", "Lkotlin/G0;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends AbstractC41201a<l.b.c, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfirmPhoneFragment f227006b;

    public d(ConfirmPhoneFragment confirmPhoneFragment) {
        this.f227006b = confirmPhoneFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, l.b.c cVar) {
        l.b.c cVar2 = cVar;
        com.avito.android.phone_reverification_info.d dVar = this.f227006b.f226986z0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.c(cVar2.f227050a, cVar2.f227051b, cVar2.f227052c, "phones_settings/add_phone/this_phone_in_another_account");
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        ConfirmPhoneFragment confirmPhoneFragment = this.f227006b;
        if (i12 == -1) {
            l lVar = confirmPhoneFragment.f226985y0;
            (lVar != null ? lVar : null).l0();
        } else {
            l lVar2 = confirmPhoneFragment.f226985y0;
            (lVar2 != null ? lVar2 : null).V4();
        }
        return G0.f406611a;
    }
}
