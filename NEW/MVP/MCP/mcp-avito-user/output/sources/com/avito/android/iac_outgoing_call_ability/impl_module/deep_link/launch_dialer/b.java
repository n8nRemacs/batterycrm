package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import NK.a;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartNewCallLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacStartNewCallLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f168601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacStartNewCallLink f168602m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, IacStartNewCallLink iacStartNewCallLink) {
        super(0);
        this.f168601l = aVar;
        this.f168602m = iacStartNewCallLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f168601l;
        IacStartNewCallLink iacStartNewCallLink = this.f168602m;
        String strA = iacStartNewCallLink.f168696b;
        if (strA == null) {
            strA = aVar.f168600k.a();
        }
        aVar.f168595f.b(new a.C0728a(strA, iacStartNewCallLink.f168697c, iacStartNewCallLink.f168700f, iacStartNewCallLink.f168698d, iacStartNewCallLink.f168699e, iacStartNewCallLink.f168701g, iacStartNewCallLink.f168702h, iacStartNewCallLink.f168703i));
        Long l12 = iacStartNewCallLink.f168701g;
        aVar.j(new IacStartNewCallLink.b.C4990b(l12 != null ? l12.toString() : null));
        return G0.f406611a;
    }
}
