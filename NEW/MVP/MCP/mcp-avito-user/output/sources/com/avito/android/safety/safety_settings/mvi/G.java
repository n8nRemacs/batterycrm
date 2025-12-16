package com.avito.android.safety.safety_settings.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PasswordChangeLink;
import com.avito.android.deep_linking.links.auth.SessionDeleteLink;
import com.avito.android.deep_linking.links.auth.SessionsSocialLogoutLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import com.avito.android.safety.safety_settings.mvi.entity.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jo0.C42408d;
import jo0.InterfaceC42407c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: SafetySettingsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/G;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/safety/safety_settings/mvi/entity/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class G implements com.avito.android.arch.mvi.u<SafetySettingsInternalAction, com.avito.android.safety.safety_settings.mvi.entity.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f257653b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f257654c;

    @Inject
    public G(@Y61.k x xVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f257653b = xVar;
        this.f257654c = interfaceC28373a;
    }

    public static com.avito.android.safety.safety_settings.mvi.entity.b b(com.avito.android.safety.safety_settings.mvi.entity.b bVar, Boolean bool, Boolean bool2) {
        b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
        if (cVar == null) {
            return bVar;
        }
        List<SafetySettingsElement> list = cVar.f257742b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (SafetySettingsElement fVar : list) {
            if (fVar instanceof SafetySettingsElement.f) {
                SafetySettingsElement.f fVar2 = (SafetySettingsElement.f) fVar;
                fVar = new SafetySettingsElement.f(fVar2.f257695a, fVar2.f257696b, bool != null ? bool.booleanValue() : fVar2.f257697c, fVar2.f257698d, fVar2.f257699e, bool2.booleanValue(), fVar2.f257701g);
            }
            arrayList.add(fVar);
        }
        return b.c.a(cVar, arrayList, false, null, false, false, false, false, null, false, null, null, 4094);
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.safety.safety_settings.mvi.entity.b a(SafetySettingsInternalAction safetySettingsInternalAction, com.avito.android.safety.safety_settings.mvi.entity.b bVar) {
        SessionDeleteLink sessionDeleteLink;
        Object next;
        DeepLink deepLink;
        Object next2;
        SafetySettingsElement.SessionItem.a aVar;
        Object next3;
        Iterable iterableA;
        SafetySettingsElement dVar;
        SafetySettingsInternalAction safetySettingsInternalAction2 = safetySettingsInternalAction;
        com.avito.android.safety.safety_settings.mvi.entity.b bVar2 = bVar;
        boolean z12 = safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ContentSuccess;
        x xVar = this.f257653b;
        if (z12) {
            xVar.getClass();
            C42408d c42408d = ((SafetySettingsInternalAction.ContentSuccess) safetySettingsInternalAction2).f257710b;
            ArrayList arrayListE0 = C42745f0.e0(new SafetySettingsElement.b(c42408d.getHeader(), null, 2, null));
            List<InterfaceC42407c> listA = c42408d.a();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC42407c interfaceC42407c : listA) {
                if (interfaceC42407c instanceof InterfaceC42407c.C11580c) {
                    InterfaceC42407c.C11580c c11580c = (InterfaceC42407c.C11580c) interfaceC42407c;
                    dVar = new SafetySettingsElement.f(c11580c.getTitle(), c11580c.getDescription(), c11580c.getIsEnabled(), c11580c.getHasPhone(), c11580c.getIsAvailable(), false, null, 64, null);
                } else if (interfaceC42407c instanceof InterfaceC42407c.a) {
                    InterfaceC42407c.a aVar2 = (InterfaceC42407c.a) interfaceC42407c;
                    dVar = new SafetySettingsElement.c(aVar2.getTitle(), aVar2.getDescription(), aVar2.getDeeplink(), null, 8, null);
                } else {
                    if (!(interfaceC42407c instanceof InterfaceC42407c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC42407c.b bVar3 = (InterfaceC42407c.b) interfaceC42407c;
                    String title = bVar3.getTitle();
                    AttributedText info = bVar3.getInfo();
                    dVar = (title == null || info == null) ? null : new SafetySettingsElement.d(title, info, null, 4, null);
                }
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
            arrayListE0.addAll(arrayList);
            List<InterfaceC42407c> listA2 = c42408d.a();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listA2) {
                if (obj instanceof InterfaceC42407c.b) {
                    arrayList2.add(obj);
                }
            }
            InterfaceC42407c.b bVar4 = (InterfaceC42407c.b) C42745f0.G(arrayList2);
            if (bVar4 != null) {
                arrayListE0.addAll(x.a(bVar4));
            }
            return new b.c(arrayListE0, false, x.b(c42408d), false, false, false, false, null, false, null, null, false, 4080, null);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ContentError) {
            return new b.a(((SafetySettingsInternalAction.ContentError) safetySettingsInternalAction2).f257708b);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ContentLoading) {
            return b.C7737b.f257741b;
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.SwitchTfa) {
            return b(bVar2, Boolean.valueOf(((SafetySettingsInternalAction.SwitchTfa) safetySettingsInternalAction2).f257723b), Boolean.FALSE);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.SwitchTfaLoading) {
            return b(bVar2, null, Boolean.TRUE);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.AdditionalContentLoading) {
            b.c cVar = (b.c) bVar2;
            return b.c.a(cVar, C42745f0.i0(SafetySettingsElement.e.a(), cVar.f257742b), false, null, true, false, false, false, null, false, null, null, 4086);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.AdditionalContentSuccess) {
            b.c cVar2 = (b.c) bVar2;
            List<SafetySettingsElement> list = cVar2.f257742b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!L.f(((SafetySettingsElement) obj2).getF257701g(), "LOADING_ID")) {
                    arrayList3.add(obj2);
                }
            }
            xVar.getClass();
            C42408d c42408d2 = ((SafetySettingsInternalAction.AdditionalContentSuccess) safetySettingsInternalAction2).f257704b;
            List<InterfaceC42407c> listA3 = c42408d2.a();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : listA3) {
                if (obj3 instanceof InterfaceC42407c.b) {
                    arrayList4.add(obj3);
                }
            }
            InterfaceC42407c.b bVar5 = (InterfaceC42407c.b) C42745f0.G(arrayList4);
            if (bVar5 == null || (iterableA = x.a(bVar5)) == null) {
                iterableA = C42784z0.f406748b;
            }
            return b.c.a(cVar2, C42745f0.h0(iterableA, arrayList3), false, x.b(c42408d2), false, false, false, false, null, false, null, null, 4066);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.AdditionalContentError) {
            b.c cVar3 = (b.c) bVar2;
            List<SafetySettingsElement> list2 = cVar3.f257742b;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list2) {
                if (!L.f(((SafetySettingsElement) obj4).getF257701g(), "LOADING_ID")) {
                    arrayList5.add(obj4);
                }
            }
            return b.c.a(cVar3, arrayList5, false, null, false, true, false, false, null, false, null, null, 4070);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ShowUnavailableTfaBottomSheet) {
            return b.c.a((b.c) bVar2, null, false, null, false, false, true, false, null, false, null, null, 4063);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.CloseUnavailableTfaBottomSheet) {
            return b.c.a((b.c) bVar2, null, false, null, false, false, false, false, null, false, null, null, 4063);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ShowSessionBottomSheet) {
            return b.c.a((b.c) bVar2, null, false, null, false, false, false, true, ((SafetySettingsInternalAction.ShowSessionBottomSheet) safetySettingsInternalAction2).f257715b, false, null, null, 3903);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.CloseSessionBottomSheet) {
            b.c cVar4 = (b.c) bVar2;
            return b.c.a(cVar4, null, ((SafetySettingsInternalAction.CloseSessionBottomSheet) safetySettingsInternalAction2).f257706b ? false : cVar4.f257743c, null, false, false, false, false, null, false, null, null, 4029);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ShowSessionBottomSheetLoading) {
            return b.c.a((b.c) bVar2, null, true, null, false, false, false, false, null, false, null, null, 4093);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.CloseAfterLogoutSessionBottomSheet) {
            return b.c.a((b.c) bVar2, null, false, null, false, false, false, false, null, false, null, null, 2303);
        }
        if (!(safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.DeleteSessionLocally)) {
            return ((safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.SuccessEnableTfa) && (bVar2 instanceof b.c)) ? b.c.a((b.c) bVar2, null, false, null, false, false, false, false, null, false, null, null, 2047) : bVar2;
        }
        SafetySettingsInternalAction.DeleteSessionLocally deleteSessionLocally = (SafetySettingsInternalAction.DeleteSessionLocally) safetySettingsInternalAction2;
        if (!(bVar2 instanceof b.c)) {
            return bVar2;
        }
        b.c cVar5 = (b.c) bVar2;
        List<SafetySettingsElement> list3 = cVar5.f257742b;
        C43025h.a aVar3 = new C43025h.a(C43033p.i(new C42770s0(list3), E.f257651l));
        while (true) {
            boolean zHasNext = aVar3.hasNext();
            sessionDeleteLink = deleteSessionLocally.f257711b;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = aVar3.next();
            List<SafetySettingsElement.SessionItem.a> list4 = ((SafetySettingsElement.SessionItem) next).f257677g;
            if (list4 != null) {
                Iterator<T> it = list4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                    if (((SafetySettingsElement.SessionItem.a) next3).f257684b.equals(sessionDeleteLink)) {
                        break;
                    }
                }
                aVar = (SafetySettingsElement.SessionItem.a) next3;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                break;
            }
        }
        SafetySettingsElement.SessionItem sessionItem = (SafetySettingsElement.SessionItem) next;
        if (sessionItem == null) {
            return bVar2;
        }
        List<SafetySettingsElement.SessionItem.a> list5 = sessionItem.f257677g;
        if (list5 != null) {
            o0.a aVar4 = new o0.a(new o0(new C42770s0(list5), F.f257652l));
            while (true) {
                if (!aVar4.f410559b.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = aVar4.next();
                DeepLink deepLink2 = (DeepLink) next2;
                if ((deepLink2 instanceof PasswordChangeLink) || (deepLink2 instanceof SessionsSocialLogoutLink)) {
                    if (L.f(sessionDeleteLink.f133962e, Boolean.TRUE)) {
                        break;
                    }
                }
            }
            deepLink = (DeepLink) next2;
        } else {
            deepLink = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sessionItem.f257671a);
        String str = sessionItem.f257672b;
        String strConcat = str != null ? ", ".concat(str) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        sb2.append(strConcat);
        String string = sb2.toString();
        boolean z13 = deepLink != null;
        if (z13) {
            this.f257654c.c(ho0.d.f397414c);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : list3) {
            if (!L.f((SafetySettingsElement) obj5, sessionItem)) {
                arrayList6.add(obj5);
            }
        }
        return b.c.a(cVar5, arrayList6, false, null, false, false, false, false, null, z13, deepLink != null ? string : null, deepLink, 2236);
    }
}
