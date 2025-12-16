package com.avito.android.code_check;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.code_check.code_confirm.CodeConfirmFragment;
import com.avito.android.code_check.phone_list.PhoneListFragment;
import com.avito.android.code_check.phone_request.PhoneRequestFragment;
import com.avito.android.code_check.pre_request.PreRequestFragment;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CodeCheckRouter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_code-check_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p {
    public static final void a(@Y61.k Fragment fragment, @Y61.k com.avito.android.code_check_public.a aVar) {
        b(fragment.requireActivity(), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@Y61.k ActivityC22955m activityC22955m, @Y61.k com.avito.android.code_check_public.a aVar) {
        PrintableText printableText;
        Y41.a<com.avito.android.code_check_public.a> aVarA = aVar.a();
        com.avito.android.code_check_public.a aVarInvoke = aVarA != null ? aVarA.invoke() : null;
        if (aVar instanceof a.InterfaceC3494a.C3495a) {
            FragmentManager supportFragmentManager = activityC22955m.getSupportFragmentManager();
            if (supportFragmentManager.L() > 1) {
                supportFragmentManager.Y();
            } else {
                K2.c(activityC22955m);
                activityC22955m.finish();
            }
        } else if (aVar instanceof a.b.C3496a) {
            K2.c(activityC22955m);
            activityC22955m.finish();
        } else if (aVar instanceof a.b.C3497b) {
            Intent intent = new Intent();
            a.b.C3497b c3497b = (a.b.C3497b) aVar;
            a.b.C3497b.C3498a c3498a = c3497b.f119279b;
            Intent intentPutExtra = intent.putExtra("CodeCheckActivity.Result.Toast", (c3498a == null || (printableText = c3498a.f119283a) == null) ? null : printableText.k0(activityC22955m)).putExtra("CodeCheckActivity.Result.Toast.IsError", c3498a != null ? Boolean.valueOf(c3498a.f119284b) : null).putExtra("CodeCheckActivity.Result.Dialog", c3497b.f119280c).putExtra("CodeCheckActivity.Result.DeepLink", c3497b.f119281d);
            To.b bVar = c3497b.f119278a;
            activityC22955m.setResult(-1, intentPutExtra.putExtra("CodeCheckActivity.Result", bVar != null ? bVar.f15854a : null));
            K2.c(activityC22955m);
            activityC22955m.finish();
        } else if (aVar instanceof a.InterfaceC3494a.b) {
            o oVar = activityC22955m instanceof o ? (o) activityC22955m : null;
            if (oVar == null) {
                throw new IllegalArgumentException("Cannot navigate if host does not implement CodeCheckNavigator");
            }
            oVar.g(((a.InterfaceC3494a.b) aVar).f119270a);
        } else if (aVar instanceof a.InterfaceC3494a.c) {
            o oVar2 = activityC22955m instanceof o ? (o) activityC22955m : null;
            if (oVar2 == null) {
                throw new IllegalArgumentException("Cannot navigate if host does not implement CodeCheckNavigator");
            }
            oVar2.b1(((a.InterfaceC3494a.c) aVar).f119272a);
        } else if (aVar instanceof a.InterfaceC3494a.d) {
            a.InterfaceC3494a.d dVar = (a.InterfaceC3494a.d) aVar;
            com.avito.android.code_check_public.screen.h hVar = dVar.f119274a;
            boolean z12 = hVar instanceof com.avito.android.code_check_public.screen.d;
            boolean z13 = dVar.f119275b;
            if (z12) {
                String str = ((com.avito.android.code_check_public.screen.d) hVar).f119360a;
                H hE2 = activityC22955m.getSupportFragmentManager().e();
                if (z13) {
                    hE2.c(PhoneRequestFragment.class.getName());
                }
                PhoneRequestFragment.f119032H0.getClass();
                hE2.n(R.id.fragment_container, PhoneRequestFragment.a.a(str), null);
                hE2.e();
            } else if (hVar instanceof com.avito.android.code_check_public.screen.c) {
                String str2 = ((com.avito.android.code_check_public.screen.c) hVar).f119333a;
                H hE3 = activityC22955m.getSupportFragmentManager().e();
                if (z13) {
                    hE3.c(CodeConfirmFragment.class.getName());
                }
                CodeConfirmFragment.f118629G0.getClass();
                hE3.n(R.id.fragment_container, CodeConfirmFragment.a.a(str2), null);
                hE3.e();
            } else if (hVar instanceof PhoneList) {
                String str3 = ((PhoneList) hVar).f119301a;
                H hE4 = activityC22955m.getSupportFragmentManager().e();
                if (z13) {
                    hE4.c(PhoneListFragment.class.getName());
                }
                PhoneListFragment.f118860F0.getClass();
                hE4.n(R.id.fragment_container, PhoneListFragment.a.a(str3), null);
                hE4.e();
            } else if (hVar instanceof com.avito.android.code_check_public.screen.g) {
                String str4 = ((com.avito.android.code_check_public.screen.g) hVar).f119380a;
                H hE5 = activityC22955m.getSupportFragmentManager().e();
                PreRequestFragment.f119144s0.getClass();
                hE5.n(R.id.fragment_container, PreRequestFragment.a.a(str4), null);
                hE5.e();
            }
        }
        if (aVarInvoke == null) {
            return;
        }
        b(activityC22955m, aVarInvoke);
    }
}
