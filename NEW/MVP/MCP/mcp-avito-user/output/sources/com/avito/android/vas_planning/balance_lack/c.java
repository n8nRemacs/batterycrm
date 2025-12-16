package com.avito.android.vas_planning.balance_lack;

import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.vas_planning.balance_lack.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: VasPlanBalanceLackDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/j$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_planning/balance_lack/j$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.l<j.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VasPlanBalanceLackDialogFragment f322214l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VasPlanBalanceLackDialogFragment vasPlanBalanceLackDialogFragment) {
        super(1);
        this.f322214l = vasPlanBalanceLackDialogFragment;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final G0 invoke(j.a aVar) {
        j.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof j.a.C9960a;
        VasPlanBalanceLackDialogFragment vasPlanBalanceLackDialogFragment = this.f322214l;
        if (z12) {
            j.a.C9960a c9960a = (j.a.C9960a) aVar2;
            ViewGroup viewGroup = vasPlanBalanceLackDialogFragment.f322206n0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            D6.w(viewGroup);
            com.avito.android.progress_overlay.l lVar = vasPlanBalanceLackDialogFragment.f322207o0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.j();
            Button button = vasPlanBalanceLackDialogFragment.f322208p0;
            if (button == null) {
                button = null;
            }
            D6.G(button, c9960a.f322231c != null);
            Button button2 = vasPlanBalanceLackDialogFragment.f322208p0;
            if (button2 == null) {
                button2 = null;
            }
            j.a.C9960a.C9961a c9961a = c9960a.f322231c;
            String str = c9961a != null ? c9961a.f322232a : null;
            if (str == null) {
                str = "";
            }
            button2.setText(str);
            com.avito.android.lib.design.bottom_sheet.d dVarF5 = vasPlanBalanceLackDialogFragment.getDialog();
            if (dVarF5 != null) {
                com.avito.android.lib.design.bottom_sheet.j.c(dVarF5, (String) vasPlanBalanceLackDialogFragment.f322209q0.getValue(), false, 0, 0, 0, WebSocketProtocol.PAYLOAD_SHORT);
            }
            TextView textView = vasPlanBalanceLackDialogFragment.f322205m0;
            if (textView == null) {
                textView = null;
            }
            com.avito.android.util.text.a aVar3 = vasPlanBalanceLackDialogFragment.f322201i0;
            I5.a(textView, (aVar3 != null ? aVar3 : null).c(vasPlanBalanceLackDialogFragment.requireContext(), c9960a.f322230b), false);
        } else if (aVar2 instanceof j.a.b) {
            j.a.b bVar = (j.a.b) aVar2;
            ViewGroup viewGroup2 = vasPlanBalanceLackDialogFragment.f322206n0;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            D6.H(viewGroup2);
            com.avito.android.progress_overlay.l lVar2 = vasPlanBalanceLackDialogFragment.f322207o0;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.a(bVar.f322234a);
            Button button3 = vasPlanBalanceLackDialogFragment.f322208p0;
            D6.w(button3 != null ? button3 : null);
        } else if (aVar2 instanceof j.a.c) {
            ViewGroup viewGroup3 = vasPlanBalanceLackDialogFragment.f322206n0;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            D6.H(viewGroup3);
            com.avito.android.progress_overlay.l lVar3 = vasPlanBalanceLackDialogFragment.f322207o0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.k(null);
            Button button4 = vasPlanBalanceLackDialogFragment.f322208p0;
            D6.w(button4 != null ? button4 : null);
        }
        return G0.f406611a;
    }
}
