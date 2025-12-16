package com.avito.android.edit_text_field.mvi;

import Ay.InterfaceC13103a;
import Ay.InterfaceC13104b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.edit_text_field.InterfaceC30331g;
import com.avito.android.edit_text_field.analytics.NotSavedAlertActionEvent;
import com.avito.android.profile_management_core.edit_text_field.NotSavedAlertSettings;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zy.C50642a;

/* compiled from: EditTextFieldActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/edit_text_field/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LAy/a;", "LAy/b;", "LAy/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13103a, InterfaceC13104b, Ay.d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final EditTextFieldFragment.Mode f147011a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC30331g f147012b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final E f147013c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f147014d;

    @Inject
    public a(@k EditTextFieldFragment.Mode mode, @k InterfaceC30331g interfaceC30331g, @k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f147011a = mode;
        this.f147012b = interfaceC30331g;
        this.f147013c = e12;
        this.f147014d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC13104b> b(InterfaceC13103a interfaceC13103a, Ay.d dVar) {
        C43210w c43210w;
        Object aVar;
        String str;
        String strA;
        InterfaceC13103a interfaceC13103a2 = interfaceC13103a;
        Ay.d dVar2 = dVar;
        if (interfaceC13103a2 instanceof InterfaceC13103a.f) {
            return new C43210w(new InterfaceC13104b.d(((InterfaceC13103a.f) interfaceC13103a2).f740a));
        }
        if (interfaceC13103a2 instanceof InterfaceC13103a.g) {
            return this.f147012b.a(((InterfaceC13103a.g) interfaceC13103a2).f741a, dVar2.f761d);
        }
        if (interfaceC13103a2 instanceof InterfaceC13103a.C0031a) {
            EditTextFieldFragment.Mode mode = this.f147011a;
            boolean z12 = mode instanceof EditTextFieldFragment.Mode.Extended;
            EditTextFieldFragment.Mode.Extended extended = z12 ? (EditTextFieldFragment.Mode.Extended) mode : null;
            NotSavedAlertSettings notSavedAlertSettings = (extended == null || L.f(extended.f146901e, dVar2.f758a)) ? null : extended.f146906j;
            if (notSavedAlertSettings != null) {
                EditTextFieldFragment.Mode.Extended extended2 = z12 ? (EditTextFieldFragment.Mode.Extended) mode : null;
                if (extended2 != null && (str = extended2.f146898b) != null && (strA = this.f147013c.a()) != null) {
                    this.f147014d.c(new C50642a(strA, str));
                }
                aVar = new InterfaceC13104b.i(notSavedAlertSettings);
            } else {
                aVar = new InterfaceC13104b.a(false);
            }
            c43210w = new C43210w(aVar);
        } else if (interfaceC13103a2 instanceof InterfaceC13103a.b) {
            c43210w = new C43210w(InterfaceC13104b.C0032b.f743a);
        } else {
            if (interfaceC13103a2 instanceof InterfaceC13103a.d) {
                c(NotSavedAlertActionEvent.ActionType.f146936d);
                return C43175k.w();
            }
            if (!(interfaceC13103a2 instanceof InterfaceC13103a.e)) {
                if (!(interfaceC13103a2 instanceof InterfaceC13103a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c(NotSavedAlertActionEvent.ActionType.f146935c);
                return C43175k.w();
            }
            c43210w = new C43210w(InterfaceC13104b.c.f744a);
        }
        return c43210w;
    }

    public final void c(NotSavedAlertActionEvent.ActionType actionType) {
        String str;
        String strA;
        EditTextFieldFragment.Mode mode = this.f147011a;
        EditTextFieldFragment.Mode.Extended extended = mode instanceof EditTextFieldFragment.Mode.Extended ? (EditTextFieldFragment.Mode.Extended) mode : null;
        if (extended == null || (str = extended.f146898b) == null || (strA = this.f147013c.a()) == null) {
            return;
        }
        this.f147014d.c(new NotSavedAlertActionEvent(strA, str, actionType));
    }
}
