package com.avito.android.gig_shift_cancel.ui;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.ActionV2;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason;
import com.avito.android.gig_shift_cancel.mvi.r;
import com.avito.android.gig_shift_cancel.mvi.x;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelDialogFragment;
import com.avito.android.gig_snippet.GigSingleSnippetWidget;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;

/* compiled from: GigShiftCancelDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class d extends H implements l<x, G0> {
    public final void f(@k x xVar) {
        Reason reason;
        RadioGroup radioGroup;
        GigShiftCancelDialogFragment gigShiftCancelDialogFragment = (GigShiftCancelDialogFragment) this.receiver;
        GigShiftCancelDialogFragment.a aVar = GigShiftCancelDialogFragment.f160706u0;
        gigShiftCancelDialogFragment.getClass();
        boolean z12 = xVar.f160695c;
        boolean z13 = xVar.f160697e;
        boolean z14 = xVar.f160694b;
        if (z12 || z14 || z13) {
            TextView textView = gigShiftCancelDialogFragment.f160711k0;
            if (textView != null) {
                I5.a(textView, null, false);
            }
        } else {
            TextView textView2 = gigShiftCancelDialogFragment.f160711k0;
            if (textView2 != null) {
                I5.a(textView2, xVar.f160700h, false);
            }
        }
        TextView textView3 = gigShiftCancelDialogFragment.f160712l0;
        if (textView3 != null) {
            I5.a(textView3, xVar.f160701i, false);
        }
        Button button = gigShiftCancelDialogFragment.f160714n0;
        if (button != null) {
            button.setLoading(z14);
        }
        Button button2 = gigShiftCancelDialogFragment.f160714n0;
        r rVar = xVar.f160698f;
        if (button2 != null) {
            String str = xVar.f160702j;
            if (str == null) {
                str = rVar != null ? rVar.f160684h : null;
            }
            com.avito.android.lib.design.button.b.a(button2, str, false);
        }
        Button button3 = gigShiftCancelDialogFragment.f160714n0;
        if (button3 != null) {
            D6.G(button3, true);
        }
        Button button4 = gigShiftCancelDialogFragment.f160715o0;
        if (button4 != null) {
            com.avito.android.lib.design.button.b.a(button4, xVar.f160703k, false);
        }
        GigSingleSnippetWidget gigSingleSnippetWidget = gigShiftCancelDialogFragment.f160713m0;
        boolean z15 = xVar.f160699g;
        D6.G(gigSingleSnippetWidget, (rVar == null || z15 || z12) ? false : true);
        if (rVar != null) {
            GigSingleSnippetWidget gigSingleSnippetWidget2 = gigShiftCancelDialogFragment.f160713m0;
            if (gigSingleSnippetWidget2 != null) {
                gigSingleSnippetWidget2.a(rVar.f160679c, rVar.f160680d, rVar.f160682f, rVar.f160681e, rVar.f160683g, rVar.f160688l, rVar.f160689m, rVar.f160677a == ActionV2.ActionName.CheckOut);
            }
            GigSingleSnippetWidget gigSingleSnippetWidget3 = gigShiftCancelDialogFragment.f160713m0;
            if (gigSingleSnippetWidget3 != null) {
                gigSingleSnippetWidget3.setOnTimerFinishListener(new a(gigShiftCancelDialogFragment));
            }
        }
        View view = gigShiftCancelDialogFragment.f160716p0;
        if (view != null) {
            D6.G(view, z13);
        }
        View view2 = gigShiftCancelDialogFragment.f160717q0;
        if (view2 != null) {
            D6.G(view2, z15 && !z12);
        }
        ViewGroup viewGroup = gigShiftCancelDialogFragment.f160718r0;
        if (viewGroup != null) {
            D6.G(viewGroup, z12);
        }
        TextView textView4 = gigShiftCancelDialogFragment.f160719s0;
        if (textView4 != null) {
            I5.a(textView4, xVar.f160696d, false);
        }
        if ((rVar != null ? rVar.f160686j : null) == null || (reason = rVar.f160687k) == null || (radioGroup = gigShiftCancelDialogFragment.f160720t0) == null) {
            return;
        }
        radioGroup.b();
        radioGroup.a(-1);
        List<Reason> list = rVar.f160686j;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Reason reason2 = (Reason) obj;
            ListItemRadio listItemRadio = new ListItemRadio(gigShiftCancelDialogFragment.requireContext(), null);
            listItemRadio.setId(i12);
            listItemRadio.setTitle(reason2.getLabel());
            listItemRadio.setClickable(true);
            listItemRadio.setFocusable(true);
            listItemRadio.setEnabled(true);
            listItemRadio.setChecked(reason2.getReasonName().ordinal() == reason.getReasonName().ordinal());
            listItemRadio.setRadioAppearance(R.style.Design_Widget_RadioButton_Re23);
            radioGroup.addView(listItemRadio);
            i12 = i13;
        }
        radioGroup.setOnCheckedChangeListener(new com.avito.android.gig_shift_action.ui.a(1, gigShiftCancelDialogFragment, list));
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(x xVar) {
        f(xVar);
        return G0.f406611a;
    }
}
