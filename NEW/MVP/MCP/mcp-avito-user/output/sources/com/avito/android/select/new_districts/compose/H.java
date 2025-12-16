package com.avito.android.select.new_districts.compose;

import androidx.compose.runtime.C22066f2;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictState;
import eq0.InterfaceC40146a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectDistrictScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class H extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectDistrictState f265703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40146a, G0> f265704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f265705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(SelectDistrictState selectDistrictState, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f265703l = selectDistrictState;
        this.f265704m = lVar;
        this.f265705n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        Y41.l<InterfaceC40146a, G0> lVar = this.f265704m;
        I.a(this.f265703l, lVar, a12, iA2);
        return G0.f406611a;
    }
}
