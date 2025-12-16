package com.avito.android.cpx_promo_geo.screens.region_sheet.ui;

import Y41.p;
import androidx.compose.foundation.C20839s1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.r;
import com.akita.compose.foundation.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RegionSheetFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RegionSheetFragment f128550l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RegionSheetFragment regionSheetFragment) {
        super(2);
        this.f128550l = regionSheetFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            J3 j32 = C20839s1.f30098a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            S.a(j32.b(n.d(0.0f, 3, com.akita.compose.theme.re23.b.f63984b.f63938l.c(a13), false)), r.c(-411930233, new d(this.f128550l), a13), a13, 56);
        }
        return G0.f406611a;
    }
}
