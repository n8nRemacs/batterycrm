package com.avito.android.bbl.screens.configure.v4.mvi;

import Bh.C13148c;
import Bh.InterfaceC13146a;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.configure.v4.mvi.entity.BblConfigureV4InternalAction;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lh.InterfaceC43770a;

/* compiled from: BblConfigureV4Actor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LBh/a;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "LBh/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC13146a, BblConfigureV4InternalAction, C13148c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bbl.screens.configure.v4.mvi.domain.a f99478a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43770a f99479b;

    @Inject
    public c(@Y61.k com.avito.android.bbl.screens.configure.v4.mvi.domain.a aVar, @Y61.k InterfaceC43770a interfaceC43770a) {
        this.f99478a = aVar;
        this.f99479b = interfaceC43770a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f99475l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BblConfigureV4InternalAction> b(@Y61.k InterfaceC13146a interfaceC13146a, @Y61.k C13148c c13148c) {
        Object next;
        if (!(interfaceC13146a instanceof InterfaceC13146a.C0066a)) {
            if (interfaceC13146a instanceof InterfaceC13146a.d) {
                return this.f99478a.a();
            }
            if (interfaceC13146a instanceof InterfaceC13146a.b) {
                return new C43210w(new BblConfigureV4InternalAction.PostSaveLoading(((InterfaceC13146a.b) interfaceC13146a).f1591a));
            }
            if (interfaceC13146a instanceof InterfaceC13146a.c) {
                return new C43210w(BblConfigureV4InternalAction.Back.f99492b);
            }
            if (interfaceC13146a instanceof InterfaceC13146a.e) {
                return new C43210w(new BblConfigureV4InternalAction.OnSelectorCardClicked(((InterfaceC13146a.e) interfaceC13146a).f1594a));
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC43770a interfaceC43770a = this.f99479b;
        interfaceC43770a.a();
        interfaceC43770a.clear();
        List<C13148c.a> list = c13148c.f1606h;
        Long lValueOf = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C13148c.a) next).f1612e) {
                    break;
                }
            }
            C13148c.a aVar = (C13148c.a) next;
            if (aVar != null) {
                lValueOf = Long.valueOf(aVar.f1611d);
            }
        }
        return new C43210w(new BblConfigureV4InternalAction.HandleDeeplink(lValueOf, ((InterfaceC13146a.C0066a) interfaceC13146a).f1590a));
    }
}
