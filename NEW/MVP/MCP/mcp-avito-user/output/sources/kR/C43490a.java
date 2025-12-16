package kr;

import HV.a;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.component.toast.g;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: ToastBarErrorUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-messages_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43490a {
    public static void a(Context context, ToastBarState toastBarState, HV.a aVar, int i12) {
        if ((i12 & 4) != 0) {
            aVar = null;
        }
        if (aVar == null) {
            a.C0407a c0407a = HV.a.f7100w;
            int iJ2 = C35835l0.j(R.attr.toastBarError, context);
            c0407a.getClass();
            aVar = a.C0407a.b(iJ2, context);
        }
        IV.a.c(context, toastBarState, aVar);
        String strValueOf = String.valueOf(toastBarState.f181123a);
        g gVar = g.f125258a;
        f.c.f125255c.getClass();
        f.c cVarA = f.c.a.a(null, null);
        gVar.getClass();
        g.b(strValueOf, cVarA);
    }
}
