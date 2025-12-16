package com.avito.android.profile_phones.confirm_phone;

import android.view.View;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.confirm_phone.l;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.K2;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$c;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/confirm_phone/l$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.l<l.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConfirmPhoneFragment f227004l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConfirmPhoneFragment confirmPhoneFragment) {
        super(1);
        this.f227004l = confirmPhoneFragment;
    }

    @Override // Y41.l
    public final G0 invoke(l.c cVar) {
        f.c cVarB;
        l.c cVar2 = cVar;
        boolean z12 = cVar2 instanceof l.c.d;
        ConfirmPhoneFragment confirmPhoneFragment = this.f227004l;
        if (z12) {
            Input input = confirmPhoneFragment.f226981u0;
            if (input == null) {
                input = null;
            }
            input.setEnabled(true);
            Input input2 = confirmPhoneFragment.f226981u0;
            if (input2 == null) {
                input2 = null;
            }
            input2.setLoading(false);
            Input input3 = confirmPhoneFragment.f226981u0;
            if (input3 == null) {
                input3 = null;
            }
            Input.f179303W.getClass();
            input3.setState(Input.f179304a0);
            ComponentContainer componentContainer = confirmPhoneFragment.f226980t0;
            (componentContainer != null ? componentContainer : null).setSubtitle(confirmPhoneFragment.getResources().getString(R.string.phone_confirm_subtitle_template, ((l.c.d) cVar2).f227059a.replace(' ', (char) 160)));
        } else if (L.f(cVar2, l.c.C6896c.f227058a)) {
            Input input4 = confirmPhoneFragment.f226981u0;
            if (input4 == null) {
                input4 = null;
            }
            input4.setEnabled(false);
            Input input5 = confirmPhoneFragment.f226981u0;
            (input5 != null ? input5 : null).setLoading(true);
        } else if (cVar2 instanceof l.c.b) {
            Input input6 = confirmPhoneFragment.f226981u0;
            if (input6 == null) {
                input6 = null;
            }
            input6.setEnabled(true);
            Input input7 = confirmPhoneFragment.f226981u0;
            if (input7 == null) {
                input7 = null;
            }
            input7.v();
            Input input8 = confirmPhoneFragment.f226981u0;
            if (input8 == null) {
                input8 = null;
            }
            input8.setLoading(false);
            l.c.b bVar = (l.c.b) cVar2;
            if (bVar.f227056a == null) {
                com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                View view = confirmPhoneFragment.f226978r0;
                View view2 = view == null ? null : view;
                PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.confirm_phone_action_error, new Serializable[0]);
                ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                Throwable th2 = bVar.f227057b;
                if (th2 != null) {
                    cVarB = new f.c(th2);
                } else {
                    f.c.f125255c.getClass();
                    cVarB = f.c.a.b();
                }
                com.avito.android.component.toast.c.b(cVar3, view2, printableTextC, null, null, null, cVarB, 0, toastBarPosition, null, false, false, null, null, 4014);
            } else {
                Input input9 = confirmPhoneFragment.f226981u0;
                if (input9 == null) {
                    input9 = null;
                }
                Input.f179303W.getClass();
                input9.setState(Input.f179305b0);
                ComponentContainer componentContainer2 = confirmPhoneFragment.f226980t0;
                if (componentContainer2 == null) {
                    componentContainer2 = null;
                }
                Input input10 = confirmPhoneFragment.f226981u0;
                ComponentContainer.l(componentContainer2, new int[]{(input10 != null ? input10 : null).getId()}, bVar.f227056a, 4);
            }
        } else if (cVar2 instanceof l.c.a) {
            Input input11 = confirmPhoneFragment.f226981u0;
            if (input11 == null) {
                input11 = null;
            }
            input11.setEnabled(true);
            Input input12 = confirmPhoneFragment.f226981u0;
            if (input12 == null) {
                input12 = null;
            }
            K2.d(input12, true);
            Input input13 = confirmPhoneFragment.f226981u0;
            if (input13 == null) {
                input13 = null;
            }
            input13.setLoading(false);
            UserDialog userDialog = ((l.c.a) cVar2).f227055a;
            InterfaceC30274a interfaceC30274a = confirmPhoneFragment.f226970A0;
            confirmPhoneFragment.f226975o0.b((interfaceC30274a != null ? interfaceC30274a : null).g(userDialog).m(new h(confirmPhoneFragment)));
        }
        return G0.f406611a;
    }
}
