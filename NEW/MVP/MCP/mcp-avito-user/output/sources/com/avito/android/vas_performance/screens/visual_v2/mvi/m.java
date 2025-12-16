package com.avito.android.vas_performance.screens.visual_v2.mvi;

import RL0.c;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.button.t;
import com.avito.android.arch.mvi.u;
import com.avito.android.mnz_common.ui.compose.model.c;
import com.avito.android.mnz_common.ui.compose.model.e;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_performance.generated.api.api_vas_visual_v_1.BblContacts;
import com.avito.android.vas_performance.generated.api.api_vas_visual_v_1.Button;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xL0.C49858a;
import xL0.C49859b;

/* compiled from: VisualVasV2Reducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "LRL0/c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements u<VisualVasV2InternalAction, RL0.c> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f321303b;

    /* compiled from: VisualVasV2Reducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f321304a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f321305b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f321306c;

        static {
            int[] iArr = new int[Button.Style.values().length];
            try {
                iArr[Button.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f321304a = iArr;
            int[] iArr2 = new int[BblContacts.ProgressColor.values().length];
            try {
                iArr2[BblContacts.ProgressColor.Orange.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[BblContacts.ProgressColor.Green.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f321305b = iArr2;
            int[] iArr3 = new int[BblContacts.Icon.values().length];
            try {
                iArr3[BblContacts.Icon.Infinity20.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f321306c = iArr3;
        }
    }

    /* compiled from: VisualVasV2Reducer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/button/t;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/button/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, t> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f321307l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final t invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-1749026931);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            t tVarF2 = com.akita.compose.theme.re23.b.c(a13).f2();
            a13.h();
            return tVarF2;
        }
    }

    /* compiled from: VisualVasV2Reducer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/button/t;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/button/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, t> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f321308l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final t invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-1185004842);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            t tVarM = com.akita.compose.theme.re23.b.c(a13).M();
            a13.h();
            return tVarM;
        }
    }

    @Inject
    public m(@com.avito.android.vas_performance.screens.visual_v2.di.b boolean z12) {
        this.f321303b = z12;
    }

    public static com.avito.android.mnz_common.ui.compose.model.e b(BblContacts bblContacts) {
        com.akita.compose.foundation.p pVar;
        BblContacts.ProgressColor progressColor = bblContacts.getProgressColor();
        int i12 = progressColor == null ? -1 : a.f321305b[progressColor.ordinal()];
        if (i12 == 1) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            pVar = com.akita.compose.theme.re23.b.f63984b.f63844F0;
        } else if (i12 != 2) {
            pVar = null;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            pVar = com.akita.compose.theme.re23.b.f63984b.f63972w0;
        }
        com.akita.compose.foundation.p pVar2 = pVar;
        BblContacts.Icon icon = bblContacts.getIcon();
        if ((icon != null ? a.f321306c[icon.ordinal()] : -1) != 1) {
            return new e.a(bblContacts.getCount(), (float) bblContacts.getProgress(), null, pVar2, 4, null);
        }
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.b.f63985c.getClass();
        return new e.b(com.akita.compose.theme.re23.e.f64482c8, null, pVar2, 2, null);
    }

    public static RL0.c c(RL0.c cVar) {
        com.avito.android.mnz_common.ui.compose.model.c cVar2;
        ArrayList arrayList;
        c.C0960c c0960cA;
        Object obj;
        c.C0960c.a aVar;
        Object next;
        List<c.e> list = cVar.f14357e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((c.e) obj2).f14396d) {
                arrayList2.add(obj2);
            }
        }
        boolean z12 = true;
        c.C0960c c0960c = cVar.f14360h;
        if (c0960c == null || (aVar = c0960c.f14380a) == null || (cVar2 = aVar.f14384a) == null) {
            cVar2 = null;
        } else {
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((c.e) it.next()).f14404l);
            }
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((com.avito.android.mnz_common.ui.compose.model.e) next) instanceof e.b) {
                    break;
                }
            }
            com.avito.android.mnz_common.ui.compose.model.e aVar2 = (com.avito.android.mnz_common.ui.compose.model.e) next;
            c.a aVar3 = cVar2.f198008b;
            if (aVar2 == null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (next2 != null ? next2 instanceof e.a : true) {
                        arrayList4.add(next2);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                long j12 = 0;
                while (it4.hasNext()) {
                    e.a aVar4 = (e.a) it4.next();
                    j12 += aVar4 != null ? aVar4.f198016d : 0L;
                }
                ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    e.a aVar5 = (e.a) it5.next();
                    arrayList5.add(Float.valueOf(aVar5 != null ? aVar5.f198017e : 0.0f));
                }
                float fC02 = C42745f0.C0(arrayList5);
                if (aVar3 == null || (aVar2 = aVar3.f198011a) == null) {
                    aVar2 = null;
                } else if (!(aVar2 instanceof e.b)) {
                    if (!(aVar2 instanceof e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e.a aVar6 = (e.a) aVar2;
                    aVar2 = new e.a(aVar6.f198016d + j12, aVar6.f198017e + fC02, null, aVar2.f198015c, 4, null);
                }
            }
            if (aVar2 != null) {
                cVar2 = new com.avito.android.mnz_common.ui.compose.model.c(cVar2.f198007a, aVar3 != null ? new c.a(aVar2, aVar3.f198012b) : null, cVar2.f198009c, cVar2.f198010d);
            }
        }
        c.a aVar7 = cVar.f14358f;
        if (aVar7 == null || (obj = aVar7.f14365c) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : (Iterable) obj) {
                c.a.C0957a.C0958a c0958a = ((c.a.C0957a) obj3).f14371e;
                if (c0958a != null && c0958a.f14374c) {
                    arrayList6.add(obj3);
                }
            }
            arrayList = new ArrayList(C42745f0.q(arrayList6, 10));
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                arrayList.add(((c.a.C0957a) it6.next()).f14367a);
            }
        }
        boolean zF2 = L.f(aVar7 != null ? aVar7.f14366d : null, arrayList);
        if (arrayList2.isEmpty() && zF2) {
            z12 = false;
        }
        if (c0960c != null) {
            c.C0960c.a aVar8 = c0960c.f14380a;
            c.C0960c.a aVar9 = aVar8 != null ? new c.C0960c.a(aVar8.f14384a, cVar2) : null;
            Y41.p pVar = z12 ? b.f321307l : c.f321308l;
            c.C0960c.b bVar = c0960c.f14381b;
            c0960cA = c.C0960c.a(c0960c, aVar9, new c.C0960c.b(pVar, bVar.f14387b, z12 ? bVar.f14387b.f14389a : bVar.f14387b.f14390b), false, 12);
        } else {
            c0960cA = null;
        }
        return RL0.c.a(cVar, false, null, null, null, c0960cA, false, 447);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final RL0.c a(VisualVasV2InternalAction visualVasV2InternalAction, RL0.c cVar) {
        ?? arrayList;
        Object obj;
        ?? arrayList2;
        Object obj2;
        Iterator it;
        c.a aVar;
        c.C0960c.a aVar2;
        c.a aVar3;
        VisualVasV2InternalAction visualVasV2InternalAction2 = visualVasV2InternalAction;
        RL0.c cVar2 = cVar;
        if (visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.Loading) {
            return RL0.c.a(cVar2, true, null, null, null, null, false, 508);
        }
        if (visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.Error) {
            return RL0.c.a(cVar2, false, ((VisualVasV2InternalAction.Error) visualVasV2InternalAction2).f321271b, null, null, null, false, 508);
        }
        if (!(visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.Content)) {
            if (visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.ServiceSwitched) {
                List<c.e> list = cVar2.f14357e;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c.e eVar = (c.e) it2.next();
                    if (L.f(eVar.f14393a, ((VisualVasV2InternalAction.ServiceSwitched) visualVasV2InternalAction2).f321276b)) {
                        it = it2;
                        eVar = new c.e(eVar.f14393a, eVar.f14394b, eVar.f14395c, !eVar.f14396d, eVar.f14397e, eVar.f14398f, eVar.f14399g, eVar.f14400h, eVar.f14401i, eVar.f14402j, eVar.f14403k, eVar.f14404l);
                    } else {
                        it = it2;
                    }
                    arrayList3.add(eVar);
                    it2 = it;
                }
                return c(RL0.c.a(cVar2, false, null, arrayList3, null, null, false, 503));
            }
            if (visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.ChangeButtonState) {
                c.C0960c c0960c = cVar2.f14360h;
                return RL0.c.a(cVar2, false, null, null, null, c0960c != null ? c.C0960c.a(c0960c, null, null, ((VisualVasV2InternalAction.ChangeButtonState) visualVasV2InternalAction2).f321268b, 7) : null, false, 447);
            }
            boolean z12 = visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.SetAutoprolongLoading;
            c.a aVar4 = cVar2.f14358f;
            if (z12) {
                if (aVar4 == null || (obj2 = aVar4.f14365c) == null) {
                    arrayList2 = 0;
                } else {
                    Iterable<c.a.C0957a> iterable = (Iterable) obj2;
                    arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
                    for (c.a.C0957a c0957aA : iterable) {
                        VisualVasV2InternalAction.SetAutoprolongLoading setAutoprolongLoading = (VisualVasV2InternalAction.SetAutoprolongLoading) visualVasV2InternalAction2;
                        if (L.f(c0957aA.f14367a, setAutoprolongLoading.f321277b)) {
                            c.a.C0957a.C0958a c0958a = c0957aA.f14371e;
                            c0957aA = c.a.C0957a.a(c0957aA, c0958a != null ? c.a.C0957a.C0958a.a(c0958a, false, setAutoprolongLoading.f321278c, 15) : null);
                        }
                        arrayList2.add(c0957aA);
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = C42784z0.f406748b;
                }
                return RL0.c.a(cVar2, false, null, null, aVar4 != null ? c.a.a(aVar4, arrayList2) : null, null, false, 495);
            }
            if (!(visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.SetAutoprolongState)) {
                return cVar2;
            }
            if (aVar4 == null || (obj = aVar4.f14365c) == null) {
                arrayList = 0;
            } else {
                Iterable<c.a.C0957a> iterable2 = (Iterable) obj;
                arrayList = new ArrayList(C42745f0.q(iterable2, 10));
                for (c.a.C0957a c0957aA2 : iterable2) {
                    VisualVasV2InternalAction.SetAutoprolongState setAutoprolongState = (VisualVasV2InternalAction.SetAutoprolongState) visualVasV2InternalAction2;
                    if (L.f(c0957aA2.f14367a, setAutoprolongState.f321279b)) {
                        c.a.C0957a.C0958a c0958a2 = c0957aA2.f14371e;
                        c0957aA2 = c.a.C0957a.a(c0957aA2, c0958a2 != null ? c.a.C0957a.C0958a.a(c0958a2, setAutoprolongState.f321280c, false, 27) : null);
                    }
                    arrayList.add(c0957aA2);
                }
            }
            if (arrayList == 0) {
                arrayList = C42784z0.f406748b;
            }
            return c(RL0.c.a(cVar2, false, null, null, aVar4 != null ? c.a.a(aVar4, arrayList) : null, null, false, 495));
        }
        C49858a c49858a = ((VisualVasV2InternalAction.Content) visualVasV2InternalAction2).f321269b;
        List<xL0.h> listF = c49858a.f();
        ArrayList arrayList4 = new ArrayList(C42745f0.q(listF, 10));
        for (xL0.h hVar : listF) {
            String id2 = hVar.getId();
            String title = hVar.getTitle();
            String description = hVar.getDescription();
            boolean selected = hVar.getSelected();
            xL0.k icon = hVar.getIcon();
            wZ.l lVar = icon.getValue() != null ? new wZ.l(icon.getValue(), icon.getValueDark()) : null;
            String price = hVar.getColumns().getPrice();
            AttributedText price2 = hVar.getPrice();
            AttributedText oldPrice = hVar.getOldPrice();
            String period = hVar.getColumns().getPeriod();
            String duration = hVar.getDuration();
            xL0.j extraOption = hVar.getExtraOption();
            c.e.a aVar5 = extraOption != null ? new c.e.a(extraOption.getDescription(), extraOption.getIconText()) : null;
            BblContacts bblDelta = hVar.getBblDelta();
            arrayList4.add(new c.e(id2, title, description, selected, lVar, price, price2, oldPrice, period, duration, aVar5, bblDelta != null ? b(bblDelta) : null));
        }
        xL0.e appliedServices = c49858a.getAppliedServices();
        if (appliedServices != null) {
            List<C49859b> listB = appliedServices.b();
            ArrayList arrayList5 = new ArrayList(C42745f0.q(listB, 10));
            int i12 = 0;
            for (Object obj3 : listB) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C49859b c49859b = (C49859b) obj3;
                String strValueOf = String.valueOf(i12);
                String title2 = c49859b.getTitle();
                String description2 = c49859b.getDescription();
                xL0.k icon2 = c49859b.getIcon();
                wZ.l lVar2 = icon2.getValue() != null ? new wZ.l(icon2.getValue(), icon2.getValueDark()) : null;
                xL0.c autoprolong = c49859b.getAutoprolong();
                arrayList5.add(new c.a.C0957a(strValueOf, title2, description2, lVar2, c49859b.getAutoprolong().getAllowed() ? new c.a.C0957a.C0958a(autoprolong.getTitle(), autoprolong.getDescription(), autoprolong.getEnabled(), new c.a.C0957a.C0958a.C0959a(autoprolong.getExternalId(), autoprolong.getPrice(), autoprolong.getRegistryId()), false) : null));
                i12 = i13;
            }
            String title3 = appliedServices.getTitle();
            String description3 = appliedServices.getDescription();
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                c.a.C0957a.C0958a c0958a3 = ((c.a.C0957a) next).f14371e;
                if (c0958a3 != null && c0958a3.f14374c) {
                    arrayList6.add(next);
                }
            }
            ArrayList arrayList7 = new ArrayList(C42745f0.q(arrayList6, 10));
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                arrayList7.add(((c.a.C0957a) it4.next()).f14367a);
            }
            aVar = new c.a(title3, description3, arrayList5, arrayList7);
        } else {
            aVar = null;
        }
        xL0.f bblFooter = c49858a.getBblFooter();
        if (bblFooter != null) {
            xL0.g contacts = bblFooter.getContacts();
            if (contacts != null) {
                BblContacts current = contacts.getCurrent();
                aVar3 = new c.a(current != null ? b(current) : null, contacts.getText());
            } else {
                aVar3 = null;
            }
            String title4 = bblFooter.getButton().getTitle();
            if (a.f321304a[bblFooter.getButton().getStyle().ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = new c.C0960c.a(new com.avito.android.mnz_common.ui.compose.model.c(new com.avito.android.mnz_common.ui.compose.model.a(title4, null, n.f321309l, null, 10, null), aVar3, null, null, 12, null), null);
        } else {
            aVar2 = null;
        }
        return c(new RL0.c(false, null, c49858a.getTitle(), arrayList4, aVar, c49858a.getHelpAction().getUri() != null ? new c.d(c49858a.getHelpAction().getUri(), c49858a.getHelpAction().getTitle()) : null, new c.C0960c(aVar2, new c.C0960c.b(o.f321310l, new c.C0960c.b.a(c49858a.getSelectedActionTitle(), c49858a.getSkipAction().getTitle()), c49858a.getSelectedActionTitle()), c49858a.getSkipAction().getUri(), false), c49858a.getCheckoutContext(), this.f321303b));
    }
}
