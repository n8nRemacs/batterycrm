package com.avito.android.early_access.adapter.parameter.list;

import Y41.p;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.early_access.adapter.parameter.element.EarlyAccessParameterItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessParameters.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f145153l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i12) {
        super(2);
        this.f145153l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145153l | 1);
        B bE2 = a12.E(-9646265);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            EarlyAccessParametersItem earlyAccessParametersItem = new EarlyAccessParametersItem(null, C42745f0.U(new EarlyAccessParameterItem(null, "fireFilled", "Только разместили, опередите других", null, 9, null), new EarlyAccessParameterItem(null, "history", "Первые 3 часа после публикации новых объявлений звонки и чаты по ним платные", null, 9, null), new EarlyAccessParameterItem(null, "operations", "Аренда без комиссии риелтору", "У*нас ещё сотни квартир без*комиссии У*нас ещё сотни квартир без*комиссии У*нас ещё сотни квартир без*комиссии У*нас ещё сотни квартир без*комиссии", 1, null)), 1, null);
            v.a aVar = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            h.a aVar2 = h.f42849c;
            c.a(earlyAccessParametersItem, R1.i(androidx.compose.foundation.A.b(aVar, X2.b.f18125d.c(bE2), Y0.f39346a), 16), bE2, 8);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(iA2);
        }
        return G0.f406611a;
    }
}
