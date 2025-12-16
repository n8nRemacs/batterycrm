package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerticalFilterPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class E extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f273370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f273371m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f273372n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(v vVar, String str, int i12) {
        super(0);
        this.f273370l = vVar;
        this.f273371m = str;
        this.f273372n = i12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.serp.adapter.vertical_main.vertical_filter.J, java.lang.Object] */
    @Override // Y41.a
    public final G0 invoke() {
        v vVar = this.f273370l;
        ?? r12 = vVar.f273577C;
        if (r12 != 0) {
            r12.xO(this.f273372n, new D(vVar), this.f273371m);
        }
        return G0.f406611a;
    }
}
