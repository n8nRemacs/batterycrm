package com.avito.android.select.new_districts.compose;

import androidx.compose.runtime.C22066f2;
import com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectedDistrictsChips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class N extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<DistrictChip> f265712l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<Boolean> f265713m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DistrictChip, G0> f265714n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f265715o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f265716p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(List list, List list2, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f265712l = list;
        this.f265713m = list2;
        this.f265714n = lVar;
        this.f265715o = vVar;
        this.f265716p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f265716p | 1);
        List<Boolean> list = this.f265713m;
        Y41.l<DistrictChip, G0> lVar = this.f265714n;
        U.a(this.f265712l, list, lVar, a12, iA2);
        return G0.f406611a;
    }
}
