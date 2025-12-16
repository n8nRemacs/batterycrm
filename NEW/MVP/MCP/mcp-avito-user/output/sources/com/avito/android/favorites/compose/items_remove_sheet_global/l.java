package com.avito.android.favorites.compose.items_remove_sheet_global;

import Y41.p;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemsRemoveBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class l extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f156846l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f156847m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f156848n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Y41.a aVar, Y41.a aVar2, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(2);
        this.f156846l = aVar;
        this.f156847m = dVar;
        this.f156848n = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            Y41.a<G0> aVar = this.f156846l;
            com.avito.android.lib.design.bottom_sheet.d dVar = this.f156847m;
            m.c(new i(aVar, dVar), new j(this.f156848n, dVar), new k(dVar), null, a13, 0);
        }
        return G0.f406611a;
    }
}
