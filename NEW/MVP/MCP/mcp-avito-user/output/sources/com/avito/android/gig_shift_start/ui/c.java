package com.avito.android.gig_shift_start.ui;

import Y41.l;
import android.widget.TextView;
import com.avito.android.gig_shift_start.mvi.o;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: GigShiftStartDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class c extends H implements l<o, G0> {
    @Override // Y41.l
    public final G0 invoke(o oVar) {
        o oVar2 = oVar;
        GigShiftStartDialogFragment gigShiftStartDialogFragment = (GigShiftStartDialogFragment) this.receiver;
        TextView textView = gigShiftStartDialogFragment.f160828m0;
        if (textView != null) {
            I5.a(textView, oVar2.f160815b, false);
        }
        TextView textView2 = gigShiftStartDialogFragment.f160829n0;
        if (textView2 != null) {
            I5.a(textView2, oVar2.f160816c, false);
        }
        Button button = gigShiftStartDialogFragment.f160826k0;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, oVar2.f160817d, false);
        }
        Button button2 = gigShiftStartDialogFragment.f160827l0;
        if (button2 != null) {
            com.avito.android.lib.design.button.b.a(button2, oVar2.f160818e, false);
        }
        return G0.f406611a;
    }
}
