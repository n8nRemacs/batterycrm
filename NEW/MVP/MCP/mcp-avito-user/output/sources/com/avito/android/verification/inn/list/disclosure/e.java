package com.avito.android.verification.inn.list.disclosure;

import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DisclosureItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f323968l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f323969m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f323970n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, h hVar, f fVar) {
        super(0);
        this.f323968l = aVar;
        this.f323969m = hVar;
        this.f323970n = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f323968l;
        boolean z12 = aVar.f323959e;
        aVar.f323959e = !z12;
        h hVar = this.f323969m;
        hVar.getClass();
        I5.d(hVar.f323974b, null, C35835l0.h(!z12 ? R.attr.ic_arrowExpandMore16 : R.attr.ic_arrowExpandLess16, hVar.itemView.getContext()), 11);
        this.f323970n.f323971b.a(aVar);
        return G0.f406611a;
    }
}
