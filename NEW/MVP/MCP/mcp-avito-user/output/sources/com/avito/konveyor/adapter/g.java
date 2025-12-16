package com.avito.konveyor.adapter;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SimpleAdapterPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f338502l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f338503m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TV0.a f338504n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f338505o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List<Object> f338506p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, b bVar, TV0.a aVar, int i12, List list) {
        super(0);
        this.f338502l = hVar;
        this.f338503m = bVar;
        this.f338504n = aVar;
        this.f338505o = i12;
        this.f338506p = list;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TV0.d<TV0.e, TV0.a> dVar = this.f338502l.f338508c;
        boolean z12 = dVar instanceof TV0.f;
        TV0.a aVar = this.f338504n;
        int i12 = this.f338505o;
        b bVar = this.f338503m;
        if (z12) {
            ((TV0.f) dVar).g2(bVar, aVar, i12, this.f338506p);
        } else {
            dVar.O5(bVar, aVar, i12);
        }
        return G0.f406611a;
    }
}
