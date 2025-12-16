package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import NK.a;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartRecallFromSystemApiLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacStartRecallFromSystemApiLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f168617l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacStartRecallFromSystemApiLink f168618m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, IacStartRecallFromSystemApiLink iacStartRecallFromSystemApiLink) {
        super(0);
        this.f168617l = hVar;
        this.f168618m = iacStartRecallFromSystemApiLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f168617l;
        String strA = hVar.f168616k.a();
        IacStartRecallFromSystemApiLink iacStartRecallFromSystemApiLink = this.f168618m;
        hVar.f168611f.a(new a.b(strA, iacStartRecallFromSystemApiLink.f168707c, iacStartRecallFromSystemApiLink.f168706b, iacStartRecallFromSystemApiLink.f168708d));
        hVar.j(IacStartRecallFromSystemApiLink.b.C4991b.f168710b);
        return G0.f406611a;
    }
}
