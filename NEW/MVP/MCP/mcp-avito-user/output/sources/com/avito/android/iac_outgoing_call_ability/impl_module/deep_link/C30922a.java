package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacCanRecallLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacCanRecallLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30922a extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f168568l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30922a(d dVar) {
        super(1);
        this.f168568l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        DeepLink deepLink;
        d dVar = this.f168568l;
        AW.e eVar = dVar.f168579m;
        eVar.f433b.a(eVar.f432a, "handlerError:", th2);
        dVar.f168575i.g(null, false);
        IacCanRecallLink iacCanRecallLinkC = dVar.c();
        if (iacCanRecallLinkC != null && (deepLink = iacCanRecallLinkC.f168678d) != null) {
            dVar.i(IacCanRecallLink.b.a.f168680b, dVar.f168574h, deepLink);
        }
        return G0.f406611a;
    }
}
