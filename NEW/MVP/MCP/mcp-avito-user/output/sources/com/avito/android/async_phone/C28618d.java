package com.avito.android.async_phone;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AsyncPhonePresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.async_phone.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final /* synthetic */ class C28618d extends H implements Y41.l<PhoneLoadingState, G0> {
    @Override // Y41.l
    public final G0 invoke(PhoneLoadingState phoneLoadingState) {
        PhoneLoadingState phoneLoadingState2 = phoneLoadingState;
        z zVar = ((j) this.receiver).f92218l;
        if (zVar != null) {
            AsyncPhoneItem asyncPhoneItem = zVar.f92299a;
            if (asyncPhoneItem != null) {
                asyncPhoneItem.setPhoneLoadingState(phoneLoadingState2);
            }
            Q81.a aVar = zVar.f92300b;
            if (aVar != null) {
                aVar.setPhoneLoadingState(phoneLoadingState2);
            }
        }
        return G0.f406611a;
    }
}
