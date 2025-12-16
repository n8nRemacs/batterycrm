package com.avito.android.bbl.screens.configure.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.configure.mvi.entity.BblConfigureInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lh.InterfaceC43770a;
import nh.InterfaceC44422a;
import uZ.C49004a;
import yh.C50251c;
import yh.InterfaceC50249a;

/* compiled from: BblConfigureActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lyh/a;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "Lyh/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC50249a, BblConfigureInternalAction, C50251c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bbl.screens.configure.mvi.domain.a f99189a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f99190b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43770a f99191c;

    @Inject
    public c(@Y61.k com.avito.android.bbl.screens.configure.mvi.domain.a aVar, @InterfaceC44422a @Y61.k String str, @Y61.k InterfaceC43770a interfaceC43770a) {
        this.f99189a = aVar;
        this.f99190b = str;
        this.f99191c = interfaceC43770a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f99186l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BblConfigureInternalAction> b(@Y61.k InterfaceC50249a interfaceC50249a, @Y61.k C50251c c50251c) {
        C43210w c43210w;
        C49004a button;
        if (interfaceC50249a instanceof InterfaceC50249a.g) {
            return this.f99189a.a(this.f99190b);
        }
        if (interfaceC50249a instanceof InterfaceC50249a.b) {
            c43210w = new C43210w(BblConfigureInternalAction.Back.f99214b);
        } else {
            if (interfaceC50249a instanceof InterfaceC50249a.e) {
                return new C43210w(new BblConfigureInternalAction.HandleDeeplink(((InterfaceC50249a.e) interfaceC50249a).f443448a, null, c50251c.f443462f, 2, null));
            }
            if (interfaceC50249a instanceof InterfaceC50249a.c) {
                InterfaceC43770a interfaceC43770a = this.f99191c;
                interfaceC43770a.a();
                interfaceC43770a.clear();
                InterfaceC50249a.c cVar = (InterfaceC50249a.c) interfaceC50249a;
                return new C43210w(new BblConfigureInternalAction.HandleDeeplink(cVar.f443445a, cVar.f443446b, c50251c.f443462f));
            }
            if (interfaceC50249a instanceof InterfaceC50249a.d) {
                return new C43210w(new BblConfigureInternalAction.HandleConfig(((InterfaceC50249a.d) interfaceC50249a).f443447a));
            }
            if (!(interfaceC50249a instanceof InterfaceC50249a.C12914a)) {
                if (!(interfaceC50249a instanceof InterfaceC50249a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC50249a.f fVar = (InterfaceC50249a.f) interfaceC50249a;
                return new C43210w(new BblConfigureInternalAction.ChangeOnScreenLoading(fVar.f443449a, fVar.f443450b));
            }
            uZ.d dVar = c50251c.f443458b;
            c43210w = new C43210w(new BblConfigureInternalAction.HandleDeeplink((dVar == null || (button = dVar.getButton()) == null) ? null : button.getDeeplink(), null, null, 6, null));
        }
        return c43210w;
    }
}
