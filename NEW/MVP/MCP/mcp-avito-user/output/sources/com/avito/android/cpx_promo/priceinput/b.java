package com.avito.android.cpx_promo.priceinput;

import android.widget.TextView;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.P;
import com.avito.android.cpx_promo.v2.compose.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.I5;
import is.C42098c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CpxPromoPriceInputFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class b extends H implements Y41.l<C42098c, G0> {
    public final void f(@Y61.k C42098c c42098c) {
        ComposeView composeView;
        int[] iArr;
        CpxPromoPriceInputFragment cpxPromoPriceInputFragment = (CpxPromoPriceInputFragment) this.receiver;
        Input input = cpxPromoPriceInputFragment.f127277m0;
        C42098c.b bVar = c42098c.f405322d;
        if (input != null) {
            if (bVar == null || !bVar.f405329e) {
                Input.f179303W.getClass();
                iArr = Input.f179304a0;
            } else {
                Input.f179303W.getClass();
                iArr = Input.f179305b0;
            }
            input.setState(iArr);
        }
        TextView textView = cpxPromoPriceInputFragment.f127278n0;
        if (textView != null) {
            I5.a(textView, bVar != null ? bVar.f405326b : null, false);
            Integer num = (bVar == null || !bVar.f405329e) ? cpxPromoPriceInputFragment.f127281q0 : cpxPromoPriceInputFragment.f127282r0;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
        }
        TextView textView2 = cpxPromoPriceInputFragment.f127275k0;
        if (textView2 != null) {
            I5.a(textView2, c42098c.f405320b, false);
        }
        TextView textView3 = cpxPromoPriceInputFragment.f127276l0;
        if (textView3 != null) {
            I5.a(textView3, c42098c.f405321c, false);
        }
        Input input2 = cpxPromoPriceInputFragment.f127277m0;
        if (input2 != null) {
            Input.t(input2, bVar != null ? bVar.f405325a : null, false, 4);
            input2.setHint(bVar != null ? bVar.f405327c : null);
            input2.b(new e(input2, cpxPromoPriceInputFragment));
            P.b(input2, new f(input2, input2));
        }
        Button button = cpxPromoPriceInputFragment.f127279o0;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, c42098c.f405323e, false);
        }
        ComposeView composeView2 = cpxPromoPriceInputFragment.f127280p0;
        a.C3789a c3789a = c42098c.f405324f;
        if (composeView2 != null) {
            composeView2.setVisibility(c3789a == null ? 8 : 0);
        }
        if (c3789a == null || (composeView = cpxPromoPriceInputFragment.f127280p0) == null) {
            return;
        }
        composeView.setContent(new C22096n(1189500172, new d(c3789a), true));
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(C42098c c42098c) {
        f(c42098c);
        return G0.f406611a;
    }
}
