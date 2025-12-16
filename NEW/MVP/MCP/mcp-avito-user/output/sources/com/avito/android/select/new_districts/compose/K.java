package com.avito.android.select.new_districts.compose;

import androidx.compose.runtime.C22066f2;
import com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectedDistrictsChips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class K extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DistrictChip f265707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f265708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f265709n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(DistrictChip districtChip, Y41.a<G0> aVar, int i12) {
        super(2);
        this.f265707l = districtChip;
        this.f265708m = aVar;
        this.f265709n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f265709n | 1);
        U.b(this.f265707l, this.f265708m, a12, iA2);
        return G0.f406611a;
    }
}
