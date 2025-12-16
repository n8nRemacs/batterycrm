package com.avito.android.shift_list.ui.list.shift_item;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShiftItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f281136l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ShiftItem f281137m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ShiftItem shiftItem) {
        super(0);
        this.f281136l = gVar;
        this.f281137m = shiftItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f281136l;
        gVar.f281147j.e();
        gVar.f281147j.setTitle(this.f281137m.f281119f.f161047f);
        return G0.f406611a;
    }
}
