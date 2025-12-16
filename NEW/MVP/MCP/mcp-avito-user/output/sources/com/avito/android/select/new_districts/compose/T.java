package com.avito.android.select.new_districts.compose;

import androidx.compose.runtime.C22066f2;
import com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectedDistrictsChips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class T extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<DistrictChip> f265724l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<Boolean> f265725m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DistrictChip, G0> f265726n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f265727o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f265728p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(List list, List list2, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f265724l = list;
        this.f265725m = list2;
        this.f265726n = lVar;
        this.f265727o = vVar;
        this.f265728p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f265728p | 1);
        List<Boolean> list = this.f265725m;
        Y41.l<DistrictChip, G0> lVar = this.f265726n;
        U.a(this.f265724l, list, lVar, a12, iA2);
        return G0.f406611a;
    }
}
