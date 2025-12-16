package com.avito.android.authorization.complete_registration;

import com.avito.android.authorization.complete_registration.CompleteRegistrationFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.K2;
import ee.c;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import qK0.C47313c;

/* compiled from: CompleteRegistrationFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class e extends H implements Y41.l<ee.c, G0> {
    @Override // Y41.l
    public final G0 invoke(ee.c cVar) {
        CompleteRegistrationFragment completeRegistrationFragment = (CompleteRegistrationFragment) this.receiver;
        CompleteRegistrationFragment.a aVar = CompleteRegistrationFragment.f93381E0;
        completeRegistrationFragment.getClass();
        c.b bVar = cVar.f395279b;
        if (bVar.f395284a) {
            K2.e(completeRegistrationFragment);
        }
        PrintableText printableText = bVar.f395286c;
        if (printableText != null) {
            completeRegistrationFragment.r5().d(printableText.k0(completeRegistrationFragment.r5().getContext()));
        } else {
            PasswordTipInput passwordTipInputR5 = completeRegistrationFragment.r5();
            Input input = passwordTipInputR5.f213951b;
            int[] f179312e = input.getF179312E();
            Input.f179303W.getClass();
            int[] iArr = Input.f179304a0;
            if (!Arrays.equals(f179312e, iArr)) {
                input.setState(iArr);
            }
            passwordTipInputR5.c(passwordTipInputR5.getText(), true);
        }
        C47313c c47313c = completeRegistrationFragment.f93398y0;
        PrintableText printableText2 = bVar.f395285b;
        if (printableText2 != null) {
            kotlin.reflect.n<Object> nVar = CompleteRegistrationFragment.f93382F0[3];
            ComponentContainer.n((ComponentContainer) c47313c.a(), printableText2.k0(completeRegistrationFragment.q5().getContext()), 2);
        } else {
            kotlin.reflect.n<Object> nVar2 = CompleteRegistrationFragment.f93382F0[3];
            ((ComponentContainer) c47313c.a()).k();
        }
        C47313c c47313c2 = completeRegistrationFragment.f93384B0;
        kotlin.reflect.n<Object>[] nVarArr = CompleteRegistrationFragment.f93382F0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[6];
        Button button = (Button) c47313c2.a();
        boolean z12 = bVar.f395284a;
        button.setLoading(z12);
        boolean z13 = !z12;
        completeRegistrationFragment.r5().setEnabled(z13);
        completeRegistrationFragment.q5().setEnabled(z13);
        kotlin.reflect.n<Object> nVar4 = nVarArr[6];
        ((Button) c47313c2.a()).setClickable(z13);
        return G0.f406611a;
    }
}
