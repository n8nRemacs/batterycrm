package com.avito.android.profile_phones.confirm_phone;

import com.avito.android.code_confirmation.code_confirmation.phone_confirm.a;
import com.avito.android.profile_phones.confirm_phone.l;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ConfirmPhoneViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f227098b;

    public p(o oVar) {
        this.f227098b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.code_confirmation.code_confirmation.phone_confirm.a aVar = (com.avito.android.code_confirmation.code_confirmation.phone_confirm.a) obj;
        boolean z12 = aVar instanceof a.b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        o oVar = this.f227098b;
        if (z12) {
            oVar.f227082S.postValue(new l.b.d(oVar.f227072E.f227036a, ((a.b) aVar).f119590a ? new UxFeedbackStartCampaignLink("avitoid_reverification", true, P0.c(), null) : null));
        } else if (aVar instanceof a.C3510a) {
            oVar.f227080Q.postValue(new l.c.b(((a.C3510a) aVar).f119589a, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        }
    }
}
