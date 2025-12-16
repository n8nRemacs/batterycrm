package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuccessItemView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class W extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f168994l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(int i12) {
        super(2);
        this.f168994l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f168994l | 1);
        UniversalImage universalImage = a0.f169002a;
        androidx.compose.runtime.B bE2 = a12.E(-524735110);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C30947x.f169075a.getClass();
            com.akita.compose.theme.re23.c.a(false, C30947x.f169076b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new W(iA2);
        }
        return G0.f406611a;
    }
}
