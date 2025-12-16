package com.avito.android.crm_paid_cvs.view.base;

import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CrmPaidCvsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CrmPaidCvsFragment f130766l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.toggle_comparison_state.a f130767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CrmPaidCvsFragment crmPaidCvsFragment, com.avito.android.toggle_comparison_state.a aVar) {
        super(0);
        this.f130766l = crmPaidCvsFragment;
        this.f130767m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f130766l.f130725w0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, this.f130767m.f301570c, null, null, 6);
        return G0.f406611a;
    }
}
