package com.avito.android.profile.edit.adapter;

import com.avito.android.profile.edit.refactoring.adapter.item.LocationItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f222037l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LocationItem f222038m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, LocationItem locationItem) {
        super(0);
        this.f222037l = jVar;
        this.f222038m = locationItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f222037l.f222039b.accept(this.f222038m);
        return G0.f406611a;
    }
}
