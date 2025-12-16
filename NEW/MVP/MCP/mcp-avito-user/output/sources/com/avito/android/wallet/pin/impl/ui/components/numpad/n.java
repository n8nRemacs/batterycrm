package com.avito.android.wallet.pin.impl.ui.components.numpad;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletPinNumPad.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f328971l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12) {
        super(2);
        this.f328971l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f328971l | 1);
        v vVar = d.f328933a;
        B bE2 = a12.E(-1579486146);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            d.e(j.f328967l, k.f328968l, true, "Не помню\nпароль", l.f328969l, false, m.f328970l, bE2, 1797558);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(iA2);
        }
        return G0.f406611a;
    }
}
