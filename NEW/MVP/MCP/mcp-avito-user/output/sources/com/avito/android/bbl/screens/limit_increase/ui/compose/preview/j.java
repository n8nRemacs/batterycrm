package com.avito.android.bbl.screens.limit_increase.ui.compose.preview;

import Eh.InterfaceC13486b;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LimitIncreaseScreenPreviews.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f99932l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12) {
        super(2);
        this.f99932l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f99932l | 1);
        InterfaceC43160i<InterfaceC13486b> interfaceC43160i = k.f99933a;
        B bE2 = a12.E(-926557211);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            c.f99919a.getClass();
            com.akita.compose.theme.re23.c.a(false, c.f99921c, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(iA2);
        }
        return G0.f406611a;
    }
}
