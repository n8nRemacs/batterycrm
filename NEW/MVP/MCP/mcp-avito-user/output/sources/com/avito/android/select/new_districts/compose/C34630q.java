package com.avito.android.select.new_districts.compose;

import com.avito.android.select.new_districts.mvi.entity.ui.RegionState;
import com.avito.android.select.new_districts.mvi.entity.ui.UiItem;
import eq0.InterfaceC40146a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectDistrictScreenContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.new_districts.compose.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34630q extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40146a, G0> f265764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UiItem.RegionItem f265765m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ RegionState f265766n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34630q(Y41.l lVar, UiItem.RegionItem regionItem, RegionState regionState) {
        super(0);
        this.f265764l = lVar;
        this.f265765m = regionItem;
        this.f265766n = regionState;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = this.f265765m.f265849g;
        this.f265764l.invoke(new InterfaceC40146a.g(i12, i12, this.f265766n.f265837d));
        return G0.f406611a;
    }
}
