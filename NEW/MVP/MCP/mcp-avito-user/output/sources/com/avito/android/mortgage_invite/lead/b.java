package com.avito.android.mortgage_invite.lead;

import com.avito.android.mortgage_invite.model.ApplicationCreateResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import q20.InterfaceC47188b;

/* compiled from: ApplicationLeadFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class b extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        ApplicationLeadFragment applicationLeadFragment = (ApplicationLeadFragment) this.receiver;
        InterfaceC47188b interfaceC47188b = applicationLeadFragment.f205843o0;
        if (interfaceC47188b == null) {
            interfaceC47188b = null;
        }
        interfaceC47188b.b(ApplicationCreateResult.Dismissed.f205964b);
        applicationLeadFragment.requireActivity().finish();
        return G0.f406611a;
    }
}
