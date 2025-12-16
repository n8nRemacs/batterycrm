package com.avito.android.gig_apply.ui.common;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ListItemsWithShowMoreWidget.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f159936l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i12) {
        super(2);
        this.f159936l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f159936l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-1791296724);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            d.b(new g("Условия", C42745f0.U("Проведение научных исследований и анализ данных.\nИзучение новых планет, звёздных систем и явлений.\nПоддержка капитана научной информацией для принятия решенийРабота с сенсорами и научным оборудованием.", "Item 2", "Item 3", "Item 4", "Item 5"), false, 4, null), e.f159935l, bE2, 56);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(iA2);
        }
        return G0.f406611a;
    }
}
