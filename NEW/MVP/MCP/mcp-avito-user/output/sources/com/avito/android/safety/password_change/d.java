package com.avito.android.safety.password_change;

import Zd.InterfaceC19542a;
import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C22977J;
import androidx.view.C22981N;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.authorization.AuthSource;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.safety.password_change.PasswordChangeFragment;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import ro0.InterfaceC47697b;
import xn0.C49971a;

/* compiled from: PasswordChangeFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class d extends H implements Y41.l<InterfaceC47697b, G0> {
    public final void f(@Y61.k InterfaceC47697b interfaceC47697b) {
        PasswordChangeFragment passwordChangeFragment = (PasswordChangeFragment) this.receiver;
        PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
        passwordChangeFragment.getClass();
        if (interfaceC47697b instanceof InterfaceC47697b.a) {
            String str = ((InterfaceC47697b.a) interfaceC47697b).f430178b;
            if (str != null) {
                ActivityC22955m activityC22955mL1 = passwordChangeFragment.l1();
                if (activityC22955mL1 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("password_change_result", str);
                    activityC22955mL1.setResult(-1, intent);
                    activityC22955mL1.finish();
                    return;
                }
                return;
            }
            Intent intent2 = passwordChangeFragment.f257220v0;
            if (intent2 != null) {
                passwordChangeFragment.startActivity(intent2);
            }
            ActivityC22955m activityC22955mL12 = passwordChangeFragment.l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.finish();
                return;
            }
            return;
        }
        if (interfaceC47697b instanceof InterfaceC47697b.c) {
            passwordChangeFragment.u5(((InterfaceC47697b.c) interfaceC47697b).f430180a);
            return;
        }
        if (L.f(interfaceC47697b, InterfaceC47697b.e.f430182a)) {
            InterfaceC19542a interfaceC19542a = passwordChangeFragment.f257212n0;
            passwordChangeFragment.startActivityForResult((interfaceC19542a != null ? interfaceC19542a : null).a(AuthSource.f92720p), 1604);
            return;
        }
        if (interfaceC47697b instanceof InterfaceC47697b.f) {
            InterfaceC47697b.f fVar = (InterfaceC47697b.f) interfaceC47697b;
            InterfaceC19542a interfaceC19542a2 = passwordChangeFragment.f257212n0;
            passwordChangeFragment.startActivity(InterfaceC19542a.C1444a.a(interfaceC19542a2 != null ? interfaceC19542a2 : null, fVar.f430183a, 6));
            return;
        }
        if (interfaceC47697b instanceof InterfaceC47697b.h) {
            C22977J c22977jA = C22981N.a(passwordChangeFragment.getLifecycle());
            ((InterfaceC47697b.h) interfaceC47697b).getClass();
            C43259k.d(c22977jA, null, null, new n(passwordChangeFragment, null), 3);
            return;
        }
        if (interfaceC47697b instanceof InterfaceC47697b.i) {
            InterfaceC47697b.i iVar = (InterfaceC47697b.i) interfaceC47697b;
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            C47313c c47313c = passwordChangeFragment.f257224z0;
            kotlin.reflect.n<Object> nVar = PasswordChangeFragment.f257204I0[3];
            TextView textView = (TextView) c47313c.a();
            PrintableText printableTextC = iVar.f430185a;
            if (printableTextC == null) {
                printableTextC = com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]);
            }
            com.avito.android.component.toast.c.b(cVar, textView, printableTextC, null, null, null, iVar.f430186b, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
            return;
        }
        if (L.f(interfaceC47697b, InterfaceC47697b.d.f430181a)) {
            com.avito.android.L l12 = passwordChangeFragment.f257213o0;
            if (l12 == null) {
                l12 = null;
            }
            passwordChangeFragment.startActivity(L.a.a(l12, null, 3));
            ActivityC22955m activityC22955mL13 = passwordChangeFragment.l1();
            if (activityC22955mL13 != null) {
                activityC22955mL13.finish();
                return;
            }
            return;
        }
        if (interfaceC47697b instanceof InterfaceC47697b.j) {
            CE0.a.a(passwordChangeFragment.s5(), ((InterfaceC47697b.j) interfaceC47697b).f430187a, null, null);
            return;
        }
        if (interfaceC47697b instanceof InterfaceC47697b.g) {
            Input.t(passwordChangeFragment.s5(), ((InterfaceC47697b.g) interfaceC47697b).f430184a, false, 6);
            passwordChangeFragment.u5(InputType.f257312c);
        } else if (kotlin.jvm.internal.L.f(interfaceC47697b, InterfaceC47697b.C12394b.f430179a)) {
            C49971a.a(passwordChangeFragment.requireActivity());
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC47697b interfaceC47697b) {
        f(interfaceC47697b);
        return G0.f406611a;
    }
}
