package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BackgroundRestrictionItemView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30927c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f169008l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30927c(int i12) {
        super(2);
        this.f169008l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f169008l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-419596193);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C30933i.f169022a.getClass();
            com.akita.compose.theme.re23.c.a(false, C30933i.f169025d, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C30927c(iA2);
        }
        return G0.f406611a;
    }
}
