package com.avito.android.safety.password_setting;

import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.safety.password_setting.PasswordSettingFragment;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingState;
import com.avito.android.util.K2;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import qK0.C47313c;

/* compiled from: PasswordSettingFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class c extends H implements Y41.l<PasswordSettingState, G0> {
    @Override // Y41.l
    public final G0 invoke(PasswordSettingState passwordSettingState) {
        PasswordSettingFragment passwordSettingFragment = (PasswordSettingFragment) this.receiver;
        PasswordSettingFragment.a aVar = PasswordSettingFragment.f257418v0;
        passwordSettingFragment.getClass();
        PasswordSettingState.ViewState viewState = passwordSettingState.f257503b;
        if (viewState.f257506b) {
            K2.e(passwordSettingFragment);
        }
        PrintableText printableText = viewState.f257507c;
        if (printableText != null) {
            passwordSettingFragment.q5().d(printableText.k0(passwordSettingFragment.q5().getContext()));
        } else {
            PasswordTipInput passwordTipInputQ5 = passwordSettingFragment.q5();
            Input input = passwordTipInputQ5.f213951b;
            int[] f179312e = input.getF179312E();
            Input.f179303W.getClass();
            int[] iArr = Input.f179304a0;
            if (!Arrays.equals(f179312e, iArr)) {
                input.setState(iArr);
            }
            passwordTipInputQ5.c(passwordTipInputQ5.getText(), true);
        }
        C47313c c47313c = passwordSettingFragment.f257424r0;
        kotlin.reflect.n<Object>[] nVarArr = PasswordSettingFragment.f257419w0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        Button button = (Button) c47313c.a();
        boolean z12 = viewState.f257506b;
        button.setLoading(z12);
        boolean z13 = !z12;
        passwordSettingFragment.q5().setEnabled(z13);
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        ((Button) c47313c.a()).setClickable(z13);
        return G0.f406611a;
    }
}
