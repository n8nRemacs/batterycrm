package sberid.sdk.ui.utils.extensions;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.J3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import w2.AbstractC49426b;

@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"SberIdSDK_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {
    @InterfaceC22132o
    @X41.i
    @Y61.k
    public static final C20585k.f a(@Y61.k C20585k c20585k, @Y61.l A a12) {
        C20585k.f fVarH;
        a12.I(1852813673);
        if (b(a12)) {
            fVarH = C20585k.f28665g;
        } else {
            float f12 = AbstractC49426b.f441194f;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar = InterfaceC22215f.a.f39089o;
            c20585k.getClass();
            fVarH = C20585k.h(f12, aVar);
        }
        a12.O();
        return fVarH;
    }

    @InterfaceC22132o
    @X41.i
    public static final boolean b(@Y61.l A a12) {
        a12.I(-120730409);
        DisplayMetrics displayMetrics = ((Context) a12.o(AndroidCompositionLocals_androidKt.f41069b)).getResources().getDisplayMetrics();
        J3 j32 = Q0.f41199h;
        float f42847c = ((androidx.compose.ui.unit.d) a12.o(j32)).getF40390d();
        float f42846b = ((androidx.compose.ui.unit.d) a12.o(j32)).getF40389c();
        float f12 = displayMetrics.widthPixels / displayMetrics.heightPixels;
        boolean z12 = false;
        boolean z13 = f12 <= 0.44f;
        boolean z14 = f12 >= 0.85f;
        boolean z15 = f42847c > 1.0f || f42846b > 3.5f;
        boolean z16 = f42847c >= 2.0f && f42846b >= 3.3f;
        if ((!z14 || z16) && (z15 || z13)) {
            z12 = true;
        }
        a12.O();
        return z12;
    }
}
