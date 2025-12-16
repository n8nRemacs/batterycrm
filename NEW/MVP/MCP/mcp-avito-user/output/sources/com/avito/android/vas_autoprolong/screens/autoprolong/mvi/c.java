package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction;
import hL0.C40846a;
import jL0.C42282c;
import jL0.InterfaceC42280a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoprolongActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LjL0/a;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "LjL0/c;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC42280a, AutoprolongInternalAction, C42282c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_autoprolong.screens.autoprolong.domain.a f319533a;

    @Inject
    public c(@Y61.k com.avito.android.vas_autoprolong.screens.autoprolong.domain.a aVar) {
        this.f319533a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f319530l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<AutoprolongInternalAction> b(@Y61.k InterfaceC42280a interfaceC42280a, @Y61.k C42282c c42282c) {
        C43210w c43210w;
        if (interfaceC42280a instanceof InterfaceC42280a.b) {
            return new C43210w(AutoprolongInternalAction.CloseScreen.f319536b);
        }
        if (interfaceC42280a instanceof InterfaceC42280a.d) {
            return this.f319533a.b();
        }
        if (interfaceC42280a instanceof InterfaceC42280a.C11559a) {
            C40846a c40846a = c42282c.f405568e;
            if (c40846a == null) {
                return C43175k.w();
            }
            C42282c.d dVar = c42282c.f405572i;
            Boolean boolValueOf = dVar != null ? Boolean.valueOf(dVar.f405582c) : null;
            hL0.g toggleSection = c40846a.getToggleSection();
            boolean zF2 = L.f(toggleSection != null ? Boolean.valueOf(toggleSection.getIsAutoprolongEnabled()) : null, boolValueOf);
            if (boolValueOf != null && !zF2) {
                return this.f319533a.a(c40846a.getExternalId(), c40846a.getPrice(), c40846a.getRegistryId(), boolValueOf.booleanValue());
            }
            c43210w = new C43210w(new AutoprolongInternalAction.HandleDeeplink(c40846a.getActions().getSkip().getUri()));
        } else if (interfaceC42280a instanceof InterfaceC42280a.e) {
            c43210w = new C43210w(new AutoprolongInternalAction.ToggleChanged(((InterfaceC42280a.e) interfaceC42280a).f405559a));
        } else {
            if (!(interfaceC42280a instanceof InterfaceC42280a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new AutoprolongInternalAction.HandleDeeplink(((InterfaceC42280a.c) interfaceC42280a).f405557a));
        }
        return c43210w;
    }
}
