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
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f137364l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f137365m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar) {
        super(0);
        this.f137364l = fVar;
        this.f137365m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f137364l;
        fVar.getClass();
        a aVar = this.f137365m;
        a.b bVar = aVar.f137349h;
        boolean z12 = bVar instanceof a.b.d;
        l<InterfaceC13362a, G0> lVar = fVar.f137366b;
        String str = aVar.f137347f;
        if (z12) {
            if (str != null) {
                lVar.invoke(new InterfaceC13362a.b.c(str));
            }
        } else if (!(bVar instanceof a.b.C4147b)) {
            if (bVar instanceof a.b.c) {
                String str2 = aVar.f137344c;
                if (str2 != null && str != null) {
                    lVar.invoke(new InterfaceC13362a.b.C0130b(((a.b.c) bVar).f137356a, str2, str));
                }
            } else if (bVar instanceof a.b.C4146a) {
                lVar.invoke(new InterfaceC13362a.b.C0129a(((a.b.C4146a) bVar).f137354a));
            }
        }
        return G0.f406611a;
    }
}
