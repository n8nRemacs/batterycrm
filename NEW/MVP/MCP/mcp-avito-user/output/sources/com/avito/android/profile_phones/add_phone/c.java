package com.avito.android.profile_phones.add_phone;

import android.content.Context;
import android.content.Intent;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;
import nb0.InterfaceC44372b;

/* compiled from: AddPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/c;", "Li/a;", "Lnb0/b$f;", "Lkotlin/G0;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends AbstractC41201a<InterfaceC44372b.f, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddPhoneFragment f226832b;

    public c(AddPhoneFragment addPhoneFragment) {
        this.f226832b = addPhoneFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, InterfaceC44372b.f fVar) {
        InterfaceC44372b.f fVar2 = fVar;
        com.avito.android.phone_reverification_info.d dVar = this.f226832b.f226813x0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.c(fVar2.f415206a, fVar2.f415207b, fVar2.f415208c, "phones_settings/add_phone/this_phone_in_another_account");
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        AddPhoneFragment.r5(this.f226832b, i12, intent);
        return G0.f406611a;
    }
}
