package com.avito.android.realty_agency.checkerboard.ui.lots_list;

import Zh0.InterfaceC19559a;
import androidx.compose.runtime.C22066f2;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LotsListLoaded.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class w extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f251490l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f251491m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f251492n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f251493o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ LotSortingType f251494p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251495q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f251496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f251497s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ArrayList arrayList, boolean z12, Y41.a aVar, boolean z13, LotSortingType lotSortingType, Y41.l lVar, int i12, int i13) {
        super(2);
        this.f251490l = arrayList;
        this.f251491m = z12;
        this.f251492n = aVar;
        this.f251493o = z13;
        this.f251494p = lotSortingType;
        this.f251495q = lVar;
        this.f251496r = i12;
        this.f251497s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f251496r | 1);
        ArrayList arrayList = this.f251490l;
        boolean z12 = this.f251493o;
        y.a(arrayList, this.f251491m, this.f251492n, z12, this.f251494p, this.f251495q, a12, iA2, this.f251497s);
        return G0.f406611a;
    }
}
