package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacCanRecallLink;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacCanRecallLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30924c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f168570l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacCanRecallLink f168571m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30924c(d dVar, IacCanRecallLink iacCanRecallLink) {
        super(0);
        this.f168570l = dVar;
        this.f168571m = iacCanRecallLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f168570l;
        dVar.f168575i.g(null, true);
        IacCanRecallLink iacCanRecallLink = this.f168571m;
        String str = iacCanRecallLink.f168676b;
        XL.a aVar = dVar.f168572f;
        I iB2 = aVar.b(null, str, aVar.a(), iacCanRecallLink.f168677c, false);
        InterfaceC35745a5 interfaceC35745a5 = dVar.f168576j;
        dVar.f168580n.b(A1.e(iB2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()), new C30922a(dVar), new C30923b(dVar)));
        return G0.f406611a;
    }
}
