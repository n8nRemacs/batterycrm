package com.avito.android.profile_phones.add_phone;

import android.content.Context;
import android.content.Intent;
import com.avito.android.N1;
import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;
import nb0.InterfaceC44372b;

/* compiled from: AddPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/a;", "Li/a;", "Lnb0/b$d;", "Lkotlin/G0;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends AbstractC41201a<InterfaceC44372b.d, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddPhoneFragment f226830b;

    public a(AddPhoneFragment addPhoneFragment) {
        this.f226830b = addPhoneFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, InterfaceC44372b.d dVar) {
        InterfaceC44372b.d dVar2 = dVar;
        N1 n12 = this.f226830b.f226814y0;
        if (n12 == null) {
            n12 = null;
        }
        RequestCodeV2Source requestCodeV2Source = RequestCodeV2Source.f119426c;
        return n12.i(dVar2.f415204b, dVar2.f415203a);
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        AddPhoneFragment.q5(this.f226830b, i12, intent);
        return G0.f406611a;
    }
}
