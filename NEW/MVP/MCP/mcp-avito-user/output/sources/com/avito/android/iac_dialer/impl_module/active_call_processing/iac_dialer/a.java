package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer;

import Y41.p;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: IacDialer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class a extends H implements p<IacAction, String, G0> {
    @Override // Y41.p
    public final G0 invoke(IacAction iacAction, String str) {
        ((IacDialerImpl) this.receiver).accept(iacAction, str);
        return G0.f406611a;
    }
}
