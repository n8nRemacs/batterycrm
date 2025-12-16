package com.avito.android.advert.icebreakerseditor;

import b4.C25408d;
import b4.InterfaceC25405a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IcebreakersEditorScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C25408d f71233m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Y41.l<? super InterfaceC25405a, G0> lVar, C25408d c25408d) {
        super(0);
        this.f71232l = lVar;
        this.f71233m = c25408d;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C25408d c25408d = this.f71233m;
        InterfaceC25405a.e eVar = new InterfaceC25405a.e(c25408d.f56892b.f56898b.longValue(), c25408d.f56892b.f56899c);
        Y41.l<InterfaceC25405a, G0> lVar = this.f71232l;
        lVar.invoke(eVar);
        lVar.invoke(InterfaceC25405a.C1989a.f56858a);
        return G0.f406611a;
    }
}
