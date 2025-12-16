package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item;

import WM.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImvCarsDetailsPollPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f170145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ImvCarsDetailsPollItem f170146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f170147n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ImvCarsDetailsPollItem imvCarsDetailsPollItem, int i12) {
        super(0);
        this.f170145l = eVar;
        this.f170146m = imvCarsDetailsPollItem;
        this.f170147n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f170145l.f170151b.accept(new a.c(this.f170146m.f170140c, this.f170147n));
        return G0.f406611a;
    }
}
