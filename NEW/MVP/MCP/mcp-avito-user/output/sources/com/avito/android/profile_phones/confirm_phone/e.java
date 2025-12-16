package com.avito.android.profile_phones.confirm_phone;

import android.content.Context;
import android.content.Intent;
import com.avito.android.profile_phones.confirm_phone.l;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConfirmPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/e;", "Li/a;", "Lcom/avito/android/profile_phones/confirm_phone/l$b$b;", "Lkotlin/G0;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends AbstractC41201a<l.b.C6895b, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfirmPhoneFragment f227031b;

    public e(ConfirmPhoneFragment confirmPhoneFragment) {
        this.f227031b = confirmPhoneFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, l.b.C6895b c6895b) {
        l.b.C6895b c6895b2 = c6895b;
        com.avito.android.phone_reverification_info.d dVar = this.f227031b.f226986z0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.b(c6895b2.f227047a, c6895b2.f227048b, c6895b2.f227049c);
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        ConfirmPhoneFragment confirmPhoneFragment = this.f227031b;
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
