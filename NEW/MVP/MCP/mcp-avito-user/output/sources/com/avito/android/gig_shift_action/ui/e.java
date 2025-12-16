package com.avito.android.gig_shift_action.ui;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason;
import com.avito.android.gig_shift_action.mvi.w;
import com.avito.android.gig_shift_action.mvi.z;
import com.avito.android.gig_shift_action.ui.GigShiftActionDialogFragment;
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

/* compiled from: GigShiftActionDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class e extends H implements l<w, G0> {
    public final void f(@k w wVar) {
        boolean z12;
        Reason reason;
        RadioGroup radioGroup;
        String str;
        GigShiftActionDialogFragment gigShiftActionDialogFragment = (GigShiftActionDialogFragment) this.receiver;
        GigShiftActionDialogFragment.a aVar = GigShiftActionDialogFragment.f160550v0;
        gigShiftActionDialogFragment.getClass();
        boolean z13 = wVar.f160524d;
        boolean z14 = wVar.f160527g;
        boolean z15 = wVar.f160522b;
        if (z13 || z15 || z14) {
            TextView textView = gigShiftActionDialogFragment.f160555k0;
            if (textView != null) {
                I5.a(textView, null, false);
            }
        } else {
            TextView textView2 = gigShiftActionDialogFragment.f160555k0;
            if (textView2 != null) {
                I5.a(textView2, wVar.f160530j, false);
            }
        }
        TextView textView3 = gigShiftActionDialogFragment.f160556l0;
        if (textView3 != null) {
            I5.a(textView3, wVar.f160531k, false);
        }
        Button button = gigShiftActionDialogFragment.f160557m0;
        if (button != null) {
            button.setLoading(z15);
        }
        Button button2 = gigShiftActionDialogFragment.f160557m0;
        z zVar = wVar.f160528h;
        if (button2 != null) {
            String str2 = wVar.f160532l;
            if (str2 == null) {
                str2 = zVar != null ? zVar.f160543h : null;
            }
            com.avito.android.lib.design.button.b.a(button2, str2, false);
        }
        Button button3 = gigShiftActionDialogFragment.f160557m0;
        if (button3 != null) {
            D6.G(button3, true);
        }
        Button button4 = gigShiftActionDialogFragment.f160558n0;
        if (button4 != null) {
            com.avito.android.lib.design.button.b.a(button4, wVar.f160533m, false);
        }
        GigSingleSnippetWidget gigSingleSnippetWidget = gigShiftActionDialogFragment.f160565u0;
        boolean z16 = wVar.f160529i;
        if (gigSingleSnippetWidget != null) {
            D6.G(gigSingleSnippetWidget, (zVar == null || z16) ? false : true);
        }
        if (zVar != null) {
            GigSingleSnippetWidget gigSingleSnippetWidget2 = gigShiftActionDialogFragment.f160565u0;
            if (gigSingleSnippetWidget2 != null) {
                gigSingleSnippetWidget2.a(zVar.f160538c, zVar.f160539d, zVar.f160541f, zVar.f160540e, zVar.f160542g, zVar.f160547l, zVar.f160548m, zVar.f160549n);
            }
            GigSingleSnippetWidget gigSingleSnippetWidget3 = gigShiftActionDialogFragment.f160565u0;
            if (gigSingleSnippetWidget3 != null) {
                gigSingleSnippetWidget3.setOnTimerFinishListener(new b(gigShiftActionDialogFragment));
            }
        }
        View view = gigShiftActionDialogFragment.f160559o0;
        if (view != null) {
            D6.G(view, z13 || wVar.f160523c);
        }
        TextView textView4 = gigShiftActionDialogFragment.f160560p0;
        if (textView4 != null) {
            z12 = false;
            I5.a(textView4, wVar.f160525e, false);
        } else {
            z12 = false;
        }
        TextView textView5 = gigShiftActionDialogFragment.f160561q0;
        if (textView5 != null) {
            I5.a(textView5, wVar.f160526f, z12);
        }
        View view2 = gigShiftActionDialogFragment.f160562r0;
        if (view2 != null) {
            D6.G(view2, z14);
        }
        View view3 = gigShiftActionDialogFragment.f160563s0;
        if (view3 != null) {
            D6.G(view3, z16);
        }
        if (zVar != null && (str = zVar.f160542g) != null) {
            Uri.parse(str);
        }
        if ((zVar != null ? zVar.f160545j : null) == null || (reason = zVar.f160546k) == null || (radioGroup = gigShiftActionDialogFragment.f160564t0) == null) {
            return;
        }
        radioGroup.b();
        radioGroup.a(-1);
        List<Reason> list = zVar.f160545j;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Reason reason2 = (Reason) obj;
            ListItemRadio listItemRadio = new ListItemRadio(gigShiftActionDialogFragment.requireContext(), null);
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
        radioGroup.setOnCheckedChangeListener(new a(0, gigShiftActionDialogFragment, list));
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(w wVar) {
        f(wVar);
        return G0.f406611a;
    }
}
