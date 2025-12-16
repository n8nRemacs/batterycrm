package com.avito.android.realty_agency.checkerboard.ui.lots_list;

import Zh0.InterfaceC19559a;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LotCell.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Yh0.d f251441l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251442m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Yh0.d dVar, Y41.l lVar, int i12) {
        super(2);
        this.f251441l = dVar;
        this.f251442m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        i.a(this.f251441l, this.f251442m, a12, iA2);
        return G0.f406611a;
    }
}
