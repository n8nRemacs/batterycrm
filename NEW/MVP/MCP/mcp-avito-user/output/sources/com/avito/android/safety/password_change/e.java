package com.avito.android.safety.password_change;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.safety.password_change.PasswordChangeFragment;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeState;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import qK0.C47313c;

/* compiled from: PasswordChangeFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class e extends H implements Y41.l<PasswordChangeState, G0> {
    @Override // Y41.l
    public final G0 invoke(PasswordChangeState passwordChangeState) {
        PasswordChangeFragment passwordChangeFragment = (PasswordChangeFragment) this.receiver;
        PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
        passwordChangeFragment.getClass();
        PasswordChangeState.ViewState viewState = passwordChangeState.f257340b;
        if (viewState.f257346b) {
            K2.e(passwordChangeFragment);
        }
        PrintableText printableText = viewState.f257348d;
        if (printableText != null) {
            passwordChangeFragment.r5().d(printableText.k0(passwordChangeFragment.r5().getContext()));
        }
        C47313c c47313c = passwordChangeFragment.f257206B0;
        PrintableText printableText2 = viewState.f257347c;
        if (printableText2 != null) {
            kotlin.reflect.n<Object> nVar = PasswordChangeFragment.f257204I0[5];
            ComponentContainer.n((ComponentContainer) c47313c.a(), printableText2.k0(passwordChangeFragment.s5().getContext()), 2);
        } else {
            kotlin.reflect.n<Object> nVar2 = PasswordChangeFragment.f257204I0[5];
            ((ComponentContainer) c47313c.a()).k();
        }
        C47313c c47313c2 = passwordChangeFragment.f257209E0;
        kotlin.reflect.n<Object>[] nVarArr = PasswordChangeFragment.f257204I0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[8];
        Button button = (Button) c47313c2.a();
        boolean z12 = viewState.f257346b;
        button.setLoading(z12);
        boolean z13 = !z12;
        passwordChangeFragment.r5().setEnabled(z13);
        passwordChangeFragment.s5().setEnabled(z13);
        kotlin.reflect.n<Object> nVar4 = nVarArr[8];
        ((Button) c47313c2.a()).setClickable(z13);
        boolean z14 = viewState.f257349e;
        if (z14) {
            NavBar navBarQ5 = passwordChangeFragment.q5();
            C47313c c47313c3 = passwordChangeFragment.f257210F0;
            kotlin.reflect.n<Object> nVar5 = nVarArr[9];
            navBarQ5.setActions((TextView) c47313c3.a());
        } else if (!z14) {
            passwordChangeFragment.q5().setActions(new View[0]);
        }
        boolean z15 = viewState.f257350f;
        C47313c c47313c4 = passwordChangeFragment.f257205A0;
        if (z15) {
            kotlin.reflect.n<Object> nVar6 = nVarArr[4];
            TextView textView = (TextView) c47313c4.a();
            C47313c c47313c5 = passwordChangeFragment.f257211G0;
            kotlin.reflect.n<Object> nVar7 = nVarArr[10];
            com.avito.android.util.text.j.c(textView, (AttributedText) c47313c5.a(), null);
        } else {
            kotlin.reflect.n<Object> nVar8 = nVarArr[4];
            ((TextView) c47313c4.a()).setText(R.string.password_change_description);
        }
        return G0.f406611a;
    }
}
