package com.avito.android.safety.tfa_disable_password;

import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.safety.tfa_disable_password.TfaDisablePasswordFragment;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import qK0.C47313c;
import wo0.C49661c;

/* compiled from: TfaDisablePasswordFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class h extends H implements Y41.l<C49661c, G0> {
    @Override // Y41.l
    public final G0 invoke(C49661c c49661c) {
        C49661c c49661c2 = c49661c;
        TfaDisablePasswordFragment tfaDisablePasswordFragment = (TfaDisablePasswordFragment) this.receiver;
        TfaDisablePasswordFragment.a aVar = TfaDisablePasswordFragment.f258071x0;
        tfaDisablePasswordFragment.getClass();
        boolean z12 = c49661c2.f441795e;
        if (z12) {
            K2.e(tfaDisablePasswordFragment);
        }
        C47313c c47313c = tfaDisablePasswordFragment.f258079t0;
        PrintableText printableText = c49661c2.f441794d;
        if (printableText != null) {
            kotlin.reflect.n<Object>[] nVarArr = TfaDisablePasswordFragment.f258072y0;
            kotlin.reflect.n<Object> nVar = nVarArr[2];
            ComponentContainer componentContainer = (ComponentContainer) c47313c.a();
            kotlin.reflect.n<Object> nVar2 = nVarArr[2];
            ComponentContainer.n(componentContainer, printableText.k0(((ComponentContainer) c47313c.a()).getContext()), 2);
        } else {
            kotlin.reflect.n<Object> nVar3 = TfaDisablePasswordFragment.f258072y0[2];
            ((ComponentContainer) c47313c.a()).k();
        }
        C47313c c47313c2 = tfaDisablePasswordFragment.f258077r0;
        kotlin.reflect.n<Object>[] nVarArr2 = TfaDisablePasswordFragment.f258072y0;
        kotlin.reflect.n<Object> nVar4 = nVarArr2[0];
        ((Button) c47313c2.a()).setLoading(z12);
        boolean z13 = !z12;
        tfaDisablePasswordFragment.q5().setEnabled(z13);
        kotlin.reflect.n<Object> nVar5 = nVarArr2[0];
        ((Button) c47313c2.a()).setClickable(z13);
        return G0.f406611a;
    }
}
