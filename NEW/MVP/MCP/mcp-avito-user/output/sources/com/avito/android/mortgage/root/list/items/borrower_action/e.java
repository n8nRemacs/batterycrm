package com.avito.android.mortgage.root.list.items.borrower_action;

import com.avito.android.mortgage.root.list.payloads.g;
import f10.InterfaceC40199a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BorrowerActionPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f202447l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g.a f202448m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, g.a aVar) {
        super(0);
        this.f202447l = fVar;
        this.f202448m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f202447l;
        g.a aVar = this.f202448m;
        fVar.f202449b.invoke(new InterfaceC40199a.C40213o(aVar.f202903a, aVar.f202904b, aVar.f202905c));
        return G0.f406611a;
    }
}
