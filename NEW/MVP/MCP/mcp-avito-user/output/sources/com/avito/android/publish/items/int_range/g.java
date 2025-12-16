package com.avito.android.publish.items.int_range;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IntRangeItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f236976l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f236977m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, i iVar) {
        super(1);
        this.f236976l = bVar;
        this.f236977m = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        b bVar = this.f236976l;
        a aVar = bVar.f236965c;
        i iVar = this.f236977m;
        aVar.f236959a = i.k(iVar, str);
        iVar.f236980b.accept(bVar);
        return G0.f406611a;
    }
}
