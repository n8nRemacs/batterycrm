package com.avito.android.beduin.common.utils.result;

import Wh.AbstractC15764a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinContainerWithRecyclerHeightManager.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<e> f103540l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC15764a f103541m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f103542n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f103543o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(WeakReference weakReference, b bVar, ArrayList arrayList, int i12) {
        super(0);
        this.f103540l = weakReference;
        this.f103541m = (AbstractC15764a) bVar;
        this.f103542n = arrayList;
        this.f103543o = i12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Wh.a, com.avito.android.beduin.common.utils.result.b] */
    @Override // Y41.a
    public final G0 invoke() {
        WeakReference<e> weakReference = this.f103540l;
        e eVar = weakReference.get();
        if (eVar != null) {
            ?? r22 = this.f103541m;
            r22.getF103104k().a(r22.S(), eVar.getRecycler(), new c(weakReference, this.f103542n, this.f103543o));
        }
        return G0.f406611a;
    }
}
