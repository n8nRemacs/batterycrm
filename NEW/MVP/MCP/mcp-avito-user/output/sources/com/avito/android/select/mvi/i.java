package com.avito.android.select.mvi;

import Zp0.InterfaceC19587b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.select.mvi.entity.SelectInternalAction;
import com.avito.android.util.R0;
import dq0.C39783e;
import dq0.InterfaceC39781c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: SelectActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select/mvi/i;", "Lcom/avito/android/arch/mvi/a;", "Ldq0/c;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Ldq0/e;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements com.avito.android.arch.mvi.a<InterfaceC39781c, SelectInternalAction, C39783e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.g f265608a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f265609b;

    @Inject
    public i(@Y61.k com.avito.android.select.g gVar, @Y61.k R0 r02) {
        this.f265608a = gVar;
        this.f265609b = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectInternalAction> b(InterfaceC39781c interfaceC39781c, C39783e c39783e) {
        InterfaceC39781c interfaceC39781c2 = interfaceC39781c;
        C39783e c39783e2 = c39783e;
        if (interfaceC39781c2 instanceof InterfaceC39781c.e) {
            return new C43210w(new SelectInternalAction.QueryChanged(((InterfaceC39781c.e) interfaceC39781c2).f394123a));
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.b) {
            return c(((InterfaceC39781c.b) interfaceC39781c2).f394120a);
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.h) {
            return c(c39783e2.f394137d);
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.g) {
            InterfaceC19587b interfaceC19587b = c39783e2.f394144k;
            return interfaceC19587b != null ? new C43152f0(new C43137a0(new e(interfaceC39781c2, null), new d(C43175k.I(this.f265609b.a(), y.a(this.f265608a.a(interfaceC19587b))), c39783e2)), new f(3, null)) : C43175k.w();
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.j) {
            return C43175k.G(new g(c39783e2, interfaceC39781c2, null));
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.i) {
            return new C43207v(new SelectInternalAction[]{SelectInternalAction.HideKeyboard.f265585b, new SelectInternalAction.Submit(C42745f0.M0(c39783e2.f394139f), null)});
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.C11039c) {
            return new C43210w(new SelectInternalAction.GroupExpanded(((InterfaceC39781c.C11039c) interfaceC39781c2).f394121a));
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.d) {
            return new C43210w(new SelectInternalAction.GroupItemClicked(((InterfaceC39781c.d) interfaceC39781c2).f394122a));
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.a) {
            return C43175k.G(new h(this, c39783e2, null));
        }
        if (interfaceC39781c2 instanceof InterfaceC39781c.f) {
            return new C43210w(new SelectInternalAction.RemoveChip(((InterfaceC39781c.f) interfaceC39781c2).f394124a));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C43152f0 c(String str) {
        return new C43152f0(new C43137a0(new b(2, null), new a(C43175k.I(this.f265609b.a(), y.a(this.f265608a.b(str))))), new c(3, null));
    }
}
