package com.avito.android.bbl.screens.contact_history.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblContactHistoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class t extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f99727l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i12) {
        super(2);
        this.f99727l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f99727l | 1);
        B bE2 = a12.E(694794287);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            x.f99730a.getClass();
            com.akita.compose.theme.re23.c.a(false, x.f99731b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new t(iA2);
        }
        return G0.f406611a;
    }
}
