package com.avito.android.code_check.code_confirm;

import Jo.C14227d;
import Jo.InterfaceC14228e;
import Jo.InterfaceC14229f;
import com.avito.android.code_check.code_confirm.CodeConfirmFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import qK0.C47313c;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class i extends H implements Y41.l<C14227d, G0> {
    @Override // Y41.l
    public final G0 invoke(C14227d c14227d) {
        G0 g02;
        C14227d c14227d2 = c14227d;
        CodeConfirmFragment codeConfirmFragment = (CodeConfirmFragment) this.receiver;
        CodeConfirmFragment.a aVar = CodeConfirmFragment.f118629G0;
        codeConfirmFragment.getClass();
        PrintableText printableText = c14227d2.f9150b;
        C47313c c47313c = codeConfirmFragment.f118644z0;
        if (printableText != null) {
            kotlin.reflect.n<Object>[] nVarArr = CodeConfirmFragment.f118630H0;
            kotlin.reflect.n<Object> nVar = nVarArr[1];
            ComponentContainer componentContainer = (ComponentContainer) c47313c.a();
            kotlin.reflect.n<Object> nVar2 = nVarArr[1];
            ComponentContainer.n(componentContainer, printableText.k0(((ComponentContainer) c47313c.a()).getContext()), 2);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            kotlin.reflect.n<Object> nVar3 = CodeConfirmFragment.f118630H0[1];
            ComponentContainer componentContainer2 = (ComponentContainer) c47313c.a();
            componentContainer2.q(componentContainer2.f178848i);
        }
        InterfaceC14229f.a aVar2 = InterfaceC14229f.a.f9156a;
        InterfaceC14229f interfaceC14229f = c14227d2.f9153e;
        boolean zF2 = L.f(interfaceC14229f, aVar2);
        boolean z12 = c14227d2.f9151c;
        if (zF2) {
            Button buttonA5 = codeConfirmFragment.A5();
            com.avito.android.code_check_public.screen.c cVar = codeConfirmFragment.f118638t0;
            buttonA5.setText((cVar != null ? cVar : null).f119336d.f119346f.k0(codeConfirmFragment.A5().getContext()));
            codeConfirmFragment.A5().setEnabled(z12);
            codeConfirmFragment.A5().setClickable(z12);
            codeConfirmFragment.A5().setLoading(false);
        } else if (interfaceC14229f instanceof InterfaceC14229f.c) {
            com.avito.android.code_check_public.screen.c cVar2 = codeConfirmFragment.f118638t0;
            codeConfirmFragment.A5().setText(C43066x.a0((cVar2 != null ? cVar2 : null).f119336d.f119347g.k0(codeConfirmFragment.A5().getContext()), "{{time_placeholder}}", ((InterfaceC14229f.c) interfaceC14229f).f9158a, false));
            codeConfirmFragment.A5().setEnabled(false);
            codeConfirmFragment.A5().setClickable(false);
            codeConfirmFragment.A5().setLoading(false);
        } else if (L.f(interfaceC14229f, InterfaceC14229f.b.f9157a)) {
            codeConfirmFragment.A5().setEnabled(true);
            codeConfirmFragment.A5().setClickable(false);
            codeConfirmFragment.A5().setLoading(true);
        }
        InterfaceC14228e.a aVar3 = InterfaceC14228e.a.f9154a;
        InterfaceC14228e interfaceC14228e = c14227d2.f9152d;
        if (L.f(interfaceC14228e, aVar3)) {
            codeConfirmFragment.z5().setEnabled(z12);
            codeConfirmFragment.z5().setClickable(true);
            codeConfirmFragment.z5().setLoading(false);
        } else if (L.f(interfaceC14228e, InterfaceC14228e.b.f9155a)) {
            codeConfirmFragment.z5().setEnabled(true);
            codeConfirmFragment.z5().setClickable(false);
            codeConfirmFragment.z5().setLoading(true);
        }
        codeConfirmFragment.y5().setEnabled(z12);
        return G0.f406611a;
    }
}
