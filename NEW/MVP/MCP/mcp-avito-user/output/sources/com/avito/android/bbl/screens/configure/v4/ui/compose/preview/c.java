package com.avito.android.bbl.screens.configure.v4.ui.compose.preview;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wZ.l;

/* compiled from: BblConfigureV4ScreenPreviews.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f99589l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i12) {
        super(2);
        this.f99589l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f99589l | 1);
        l lVar = e.f99591a;
        B bE2 = a12.E(121012518);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            g.f99598a.getClass();
            com.akita.compose.theme.re23.c.a(false, g.f99601d, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(iA2);
        }
        return G0.f406611a;
    }
}
