package com.avito.android.developments_agency_search.screen.deal_room.adapter.document;

import Cw.InterfaceC13362a;
import Y41.l;
import com.avito.android.developments_agency_search.screen.deal_room.adapter.document.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DocumentItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f137362l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f137363m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, a aVar) {
        super(0);
        this.f137362l = fVar;
        this.f137363m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f137362l;
        fVar.getClass();
        a aVar = this.f137363m;
        a.InterfaceC4144a interfaceC4144a = aVar.f137348g;
        boolean z12 = interfaceC4144a instanceof a.InterfaceC4144a.c;
        l<InterfaceC13362a, G0> lVar = fVar.f137366b;
        if (z12) {
            String str = aVar.f137347f;
            if (str != null) {
                lVar.invoke(new InterfaceC13362a.b.c(str));
            }
        } else if (interfaceC4144a instanceof a.InterfaceC4144a.b) {
            lVar.invoke(new InterfaceC13362a.b.C0129a(((a.InterfaceC4144a.b) interfaceC4144a).f137352a));
        } else {
            boolean z13 = interfaceC4144a instanceof a.InterfaceC4144a.C4145a;
        }
        return G0.f406611a;
    }
}
