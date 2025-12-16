package com.avito.android.select.mvi;

import Wp0.InterfaceC15789a;
import Yp0.AbstractC18314a;
import Zp0.InterfaceC19587b;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.GroupSection;
import com.avito.android.select.Arguments;
import com.avito.android.select.D;
import com.avito.android.select.mvi.entity.ClearActionState;
import com.avito.android.select.mvi.entity.SelectInternalAction;
import dq0.C39779a;
import dq0.C39783e;
import dq0.InterfaceC39780b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Ldq0/e;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements com.avito.android.arch.mvi.u<SelectInternalAction, C39783e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.variant.b f265643b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.bottom_sheet.blueprints.group.e f265644c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15789a f265645d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f265646e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.glow_animation.d f265647f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final u3.g<AutoGlowFiltersTestGroup> f265648g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Map<String, UniversalImage> f265649h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f265650i;

    /* compiled from: SelectReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state = State.f181147b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public r(@Y61.k Arguments arguments, @Y61.k com.avito.android.select.i iVar, @Y61.k com.avito.android.select.variant.b bVar, @Y61.k com.avito.android.select.bottom_sheet.blueprints.group.e eVar, @Y61.k InterfaceC15789a interfaceC15789a, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k com.avito.android.select.glow_animation.d dVar, @oD.i @Y61.k u3.g<AutoGlowFiltersTestGroup> gVar) {
        this.f265643b = bVar;
        this.f265644c = eVar;
        this.f265645d = interfaceC15789a;
        this.f265646e = fVar;
        this.f265647f = dVar;
        this.f265648g = gVar;
        this.f265649h = iVar.d(arguments.getRequestId());
        this.f265650i = arguments.getSubmitButtonEnabled() || arguments.getMultiSelect() || (arguments.isFromFilters() && !arguments.getHideClear());
    }

    public static ParcelableEntity c(String str, List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParcelableEntity parcelableEntity = (ParcelableEntity) it.next();
            C42745f0.h(parcelableEntity instanceof GroupSection ? ((GroupSection) parcelableEntity).getValues() : Collections.singletonList(parcelableEntity), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (L.f(((ParcelableEntity) next).getId(), str)) {
                break;
            }
        }
        return (ParcelableEntity) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.select.mvi.entity.ClearActionState d(java.util.Set r2, dq0.C39783e r3) {
        /*
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            dq0.a r0 = r3.f394146m
            boolean r1 = r0.f394102h
            if (r1 != 0) goto L23
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.C42745f0.D(r2)
            com.avito.android.remote.model.ParcelableEntity r2 = (com.avito.android.remote.model.ParcelableEntity) r2
            java.lang.Object r2 = r2.getId()
            java.lang.String r0 = r0.f394107m
            boolean r2 = kotlin.jvm.internal.L.f(r0, r2)
            if (r2 != 0) goto L25
        L23:
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            com.avito.android.select.mvi.entity.ClearActionState r3 = r3.f394136c
            com.avito.android.select.mvi.entity.ClearActionState r0 = com.avito.android.select.mvi.entity.ClearActionState.f265576c
            if (r3 != r0) goto L2d
            goto L34
        L2d:
            if (r2 == 0) goto L32
            com.avito.android.select.mvi.entity.ClearActionState r0 = com.avito.android.select.mvi.entity.ClearActionState.f265575b
            goto L34
        L32:
            com.avito.android.select.mvi.entity.ClearActionState r0 = com.avito.android.select.mvi.entity.ClearActionState.f265577d
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.mvi.r.d(java.util.Set, dq0.e):com.avito.android.select.mvi.entity.ClearActionState");
    }

    @Override // com.avito.android.arch.mvi.u
    public final C39783e a(SelectInternalAction selectInternalAction, C39783e c39783e) {
        com.avito.android.select.variant.a aVar;
        AbstractC18314a.b bVar;
        List<ParcelableEntity<String>> list;
        com.avito.android.select.bottom_sheet.blueprints.group.e eVar;
        ArrayList arrayList;
        ParcelableEntity<String> parcelableEntity;
        List<ParcelableEntity<String>> list2;
        SelectInternalAction selectInternalAction2 = selectInternalAction;
        C39783e c39783e2 = c39783e;
        boolean z12 = selectInternalAction2 instanceof SelectInternalAction.UpdateSelected;
        Set<ParcelableEntity<String>> set = c39783e2.f394139f;
        if (z12) {
            Set<ParcelableEntity<String>> set2 = ((SelectInternalAction.UpdateSelected) selectInternalAction2).f265593b;
            ClearActionState clearActionStateD = d(set2, c39783e2);
            set.clear();
            set.addAll(set2);
            return C39783e.a(c39783e2, clearActionStateD, null, false, set, null, null, null, null, null, null, 8173);
        }
        if (selectInternalAction2 instanceof SelectInternalAction.QueryChanged) {
            return C39783e.a(c39783e2, null, ((SelectInternalAction.QueryChanged) selectInternalAction2).f265586b, false, null, null, null, null, null, null, null, 8187);
        }
        if (selectInternalAction2 instanceof SelectInternalAction.Loading) {
            return C39783e.a(c39783e2, null, null, false, null, null, null, null, InterfaceC39780b.d.f394118a, null, null, 7927);
        }
        if (selectInternalAction2 instanceof SelectInternalAction.Error) {
            return C39783e.a(c39783e2, null, null, false, null, null, null, null, new InterfaceC39780b.c(D.a(this.f265646e.a(((SelectInternalAction.Error) selectInternalAction2).f265581b))), null, null, 7927);
        }
        boolean z13 = selectInternalAction2 instanceof SelectInternalAction.ClearSelection;
        InterfaceC19587b interfaceC19587b = c39783e2.f394144k;
        C39779a c39779a = c39783e2.f394146m;
        List<ParcelableEntity<String>> list3 = c39783e2.f394140g;
        if (z13) {
            ArrayList arrayList2 = new ArrayList();
            if (c39779a.f394099e) {
                List<ParcelableEntity<String>> list4 = list3;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(b((ParcelableEntity) it.next(), null, c39779a.f394108n, false, c39783e2.f394139f, c39779a.f394109o, c39779a.f394102h, c39779a.f394111q, c39779a.f394112r));
                    arrayList3 = arrayList4;
                    list3 = list3;
                }
                list2 = list3;
                arrayList2 = new ArrayList(arrayList3);
            } else {
                list2 = list3;
            }
            ArrayList arrayList5 = arrayList2;
            AbstractC18314a.b bVar2 = AbstractC18314a.b.f19694b;
            if (interfaceC19587b == null) {
                bVar2 = null;
            }
            set.clear();
            return e(C39783e.a(c39783e2, d(set, c39783e2), null, false, set, null, null, null, null, null, arrayList5, 7149), list2, bVar2);
        }
        List<ParcelableEntity<String>> list5 = list3;
        if (selectInternalAction2 instanceof SelectInternalAction.UpdatePaginationItem) {
            com.avito.conveyor_item.a c1404a = ((SelectInternalAction.UpdatePaginationItem) selectInternalAction2).f265592b ? new AbstractC18314a.C1404a("Обновить") : AbstractC18314a.b.f19694b;
            ArrayList arrayList6 = new ArrayList(c39783e2.f394141h);
            if (C42745f0.S(arrayList6) instanceof AbstractC18314a) {
                C22026a.e(1, arrayList6);
            }
            arrayList6.add(c1404a);
            return C39783e.a(c39783e2, null, null, false, null, null, arrayList6, null, null, null, null, 8127);
        }
        boolean z14 = selectInternalAction2 instanceof SelectInternalAction.VariantItemClicked;
        com.avito.android.select.bottom_sheet.blueprints.group.e eVar2 = this.f265644c;
        if (!z14) {
            if (selectInternalAction2 instanceof SelectInternalAction.RemoveChip) {
                AbstractC18314a.b bVar3 = AbstractC18314a.b.f19694b;
                if (interfaceC19587b == null) {
                    bVar3 = null;
                }
                set.remove(((SelectInternalAction.RemoveChip) selectInternalAction2).f265587b);
                return e(C39783e.a(c39783e2, d(set, c39783e2), null, false, set, null, null, null, null, null, null, 8173), list5, bVar3);
            }
            if (selectInternalAction2 instanceof SelectInternalAction.VariantsLoaded) {
                AbstractC18314a.b bVar4 = AbstractC18314a.b.f19694b;
                Zp0.e eVar3 = ((SelectInternalAction.VariantsLoaded) selectInternalAction2).f265595b;
                return C39783e.a(e(c39783e2, eVar3.f20507a, eVar3.f20508b != null ? bVar4 : null), null, null, false, null, null, null, null, null, eVar3.f20508b, null, 7679);
            }
            boolean z15 = selectInternalAction2 instanceof SelectInternalAction.GroupItemClicked;
            InterfaceC15789a interfaceC15789a = this.f265645d;
            if (!z15) {
                if (!(selectInternalAction2 instanceof SelectInternalAction.GroupExpanded)) {
                    return c39783e2;
                }
                List listM0 = C42745f0.M0(eVar2.getF265105a());
                ArrayList arrayListA = interfaceC15789a.a(eVar2.e(((SelectInternalAction.GroupExpanded) selectInternalAction2).f265583b));
                eVar2.c(arrayListA);
                return C39783e.a(c39783e2, null, null, false, null, null, arrayListA, listM0, null, null, null, 7999);
            }
            List listM02 = C42745f0.M0(eVar2.getF265105a());
            SelectInternalAction.GroupItemClicked groupItemClicked = (SelectInternalAction.GroupItemClicked) selectInternalAction2;
            u uVar = new u(this, c39783e2);
            String str = c39783e2.f394137d;
            ArrayList arrayListA2 = interfaceC15789a.a(eVar2.b(groupItemClicked.f265584b, uVar, true ^ (str == null || str.length() == 0)));
            eVar2.c(arrayListA2);
            return C39783e.a(c39783e2, d(set, c39783e2), null, false, null, null, arrayListA2, listM02, null, null, null, 7997);
        }
        AbstractC18314a.b bVar5 = null;
        com.avito.android.select.variant.a aVarA = com.avito.android.select.variant.a.a(((SelectInternalAction.VariantItemClicked) selectInternalAction2).f265594b, null, !r0.f266842j, 524031);
        ParcelableEntity<String> parcelableEntityC = c(aVarA.f266834b, list5);
        if (parcelableEntityC == null) {
            return c39783e2;
        }
        ArrayList arrayList7 = new ArrayList();
        if (c39779a.f394099e) {
            List<ParcelableEntity<String>> list6 = list5;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list6, 10));
            Iterator<T> it2 = list6.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList9 = arrayList8;
                arrayList9.add(b((ParcelableEntity) it2.next(), null, c39779a.f394108n, false, c39783e2.f394139f, c39779a.f394109o, c39779a.f394102h, c39779a.f394111q, c39779a.f394112r));
                arrayList8 = arrayList9;
                eVar2 = eVar2;
                bVar5 = null;
                list5 = list5;
                aVarA = aVarA;
                parcelableEntityC = parcelableEntityC;
            }
            aVar = aVarA;
            bVar = bVar5;
            list = list5;
            eVar = eVar2;
            arrayList = new ArrayList(arrayList8);
            parcelableEntity = parcelableEntityC;
        } else {
            aVar = aVarA;
            bVar = null;
            list = list5;
            eVar = eVar2;
            arrayList = arrayList7;
            parcelableEntity = parcelableEntityC;
        }
        if (set.contains(parcelableEntity)) {
            set.remove(parcelableEntity);
        } else {
            set.add(parcelableEntity);
        }
        if (c39779a.f394106l) {
            eVar.f(aVar);
        }
        ClearActionState clearActionStateD2 = d(set, c39783e2);
        AbstractC18314a.b bVar6 = AbstractC18314a.b.f19694b;
        if (interfaceC19587b == null) {
            bVar6 = bVar;
        }
        return e(C39783e.a(c39783e2, clearActionStateD2, null, false, set, null, null, null, null, null, arrayList, 7149), list, bVar6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0334 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0376 A[PHI: r8
  0x0376: PHI (r8v23 java.lang.String) = (r8v22 java.lang.String), (r8v22 java.lang.String), (r8v26 java.lang.String), (r8v22 java.lang.String) binds: [B:247:0x0332, B:262:0x035e, B:269:0x0373, B:254:0x0343] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[PHI: r8
  0x0080: PHI (r8v32 java.lang.String) = (r8v30 java.lang.String), (r8v30 java.lang.String), (r8v38 java.lang.String) binds: [B:42:0x00a1, B:44:0x00a7, B:30:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.select.variant.a b(com.avito.android.remote.model.ParcelableEntity<java.lang.String> r39, java.lang.String r40, java.lang.String r41, boolean r42, java.util.Set<com.avito.android.remote.model.ParcelableEntity<java.lang.String>> r43, boolean r44, boolean r45, com.avito.android.remote.model.category_parameters.DisplayingImageParams r46, com.avito.android.remote.model.Size r47) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.mvi.r.b(com.avito.android.remote.model.ParcelableEntity, java.lang.String, java.lang.String, boolean, java.util.Set, boolean, boolean, com.avito.android.remote.model.category_parameters.DisplayingImageParams, com.avito.android.remote.model.Size):com.avito.android.select.variant.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0323  */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dq0.C39783e e(dq0.C39783e r65, java.util.List r66, Yp0.AbstractC18314a.b r67) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.mvi.r.e(dq0.e, java.util.List, Yp0.a$b):dq0.e");
    }
}
