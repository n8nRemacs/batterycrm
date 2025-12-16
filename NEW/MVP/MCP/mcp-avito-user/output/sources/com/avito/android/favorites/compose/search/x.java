package com.avito.android.favorites.compose.search;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoritesSearch.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class x extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f156923l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i12) {
        super(2);
        this.f156923l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f156923l | 1);
        B bE2 = a12.E(-1578510172);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            m.b("qwerty", "Поиск в избранном", false, u.f156920l, v.f156921l, w.f156922l, null, bE2, 224694, 64);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new x(iA2);
        }
        return G0.f406611a;
    }
}
