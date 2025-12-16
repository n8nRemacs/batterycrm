package androidx.view.compose;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.saveable.j;
import androidx.compose.runtime.saveable.v;
import androidx.compose.runtime.saveable.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.AbstractC23301M0;
import androidx.view.C23303N0;
import androidx.view.C23404y0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavHostController.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23358x {
    public static final C23404y0 a(Context context) {
        C23404y0 c23404y0 = new C23404y0(context);
        C23303N0 c23303n0 = c23404y0.f53227w;
        c23303n0.a(new C23338d(c23303n0));
        c23404y0.f53227w.a(new C23339e());
        c23404y0.f53227w.a(new C23348n());
        return c23404y0;
    }

    @InterfaceC22132o
    @k
    public static final C23404y0 b(@k AbstractC23301M0[] abstractC23301M0Arr, @l A a12) {
        a12.I(-312215566);
        Context context = (Context) a12.o(AndroidCompositionLocals_androidKt.f41069b);
        Object[] objArrCopyOf = Arrays.copyOf(abstractC23301M0Arr, abstractC23301M0Arr.length);
        C23355u c23355u = C23355u.f52985l;
        C23356v c23356v = new C23356v(context);
        w wVar = v.f38606a;
        C23404y0 c23404y0 = (C23404y0) j.c(objArrCopyOf, new w(c23356v, c23355u), new C23357w(context), a12, 72, 4);
        for (AbstractC23301M0 abstractC23301M0 : abstractC23301M0Arr) {
            c23404y0.f53227w.a(abstractC23301M0);
        }
        a12.O();
        return c23404y0;
    }
}
