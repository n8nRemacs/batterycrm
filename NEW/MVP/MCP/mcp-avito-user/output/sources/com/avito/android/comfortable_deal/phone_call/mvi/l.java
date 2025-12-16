package com.avito.android.comfortable_deal.phone_call.mvi;

import Zp.C19585c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneCallReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "LZp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<PhoneCallInternalAction, C19585c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.phone_call.mvi.builder.a f122518b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f122519c;

    @Inject
    public l(@Y61.k com.avito.android.comfortable_deal.phone_call.mvi.builder.a aVar, @Y61.k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f122518b = aVar;
        this.f122519c = interfaceC35945t1;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C19585c a(PhoneCallInternalAction phoneCallInternalAction, C19585c c19585c) {
        PhoneCallInternalAction phoneCallInternalAction2 = phoneCallInternalAction;
        C19585c c19585cA = c19585c;
        if (!(phoneCallInternalAction2 instanceof PhoneCallInternalAction.OpenCallScreen)) {
            if (phoneCallInternalAction2 instanceof PhoneCallInternalAction.ShowContent) {
                PhoneCallInternalAction.ShowContent showContent = (PhoneCallInternalAction.ShowContent) phoneCallInternalAction2;
                c19585cA = C19585c.a(c19585cA, this.f122519c.a(showContent.f122500b), showContent.f122501c, false, false, null, 67);
            } else if (phoneCallInternalAction2 instanceof PhoneCallInternalAction.ShowError) {
                c19585cA = C19585c.a(c19585cA, null, false, false, true, null, 75);
            } else {
                if (!(phoneCallInternalAction2 instanceof PhoneCallInternalAction.ShowLoading)) {
                    throw new NoWhenBranchMatchedException();
                }
                c19585cA = C19585c.a(c19585cA, null, false, true, false, null, 75);
            }
        }
        return this.f122518b.a(c19585cA);
    }
}
