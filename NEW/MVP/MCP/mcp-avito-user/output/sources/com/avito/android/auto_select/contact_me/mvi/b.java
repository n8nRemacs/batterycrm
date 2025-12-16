package com.avito.android.auto_select.contact_me.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.auto_select.contact_me.mvi.entity.AutoSelectContactMeInternalAction;
import gf.C40672c;
import gf.InterfaceC40670a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoSelectContactMeActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lgf/a;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "Lgf/c;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40670a, AutoSelectContactMeInternalAction, C40672c> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutoSelectContactMeInternalAction> b(InterfaceC40670a interfaceC40670a, C40672c c40672c) {
        InterfaceC40670a interfaceC40670a2 = interfaceC40670a;
        C40672c c40672c2 = c40672c;
        if (interfaceC40670a2 instanceof InterfaceC40670a.b) {
            return C43175k.G(new a(interfaceC40670a2, c40672c2, null));
        }
        if (interfaceC40670a2 instanceof InterfaceC40670a.c) {
            return new C43210w(new AutoSelectContactMeInternalAction.DeepLinkClicked(((InterfaceC40670a.c) interfaceC40670a2).f396670a));
        }
        if (!(interfaceC40670a2 instanceof InterfaceC40670a.C11218a) && !(interfaceC40670a2 instanceof InterfaceC40670a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        C43210w c43210w = new C43210w(AutoSelectContactMeInternalAction.CloseScreen.f96005b);
        return c43210w;
    }
}
