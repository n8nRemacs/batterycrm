package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.entity.IacProblemsBottomSheetInternalAction;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import eM.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import pM.InterfaceC46977a;

/* compiled from: IacProblemsBottomSheetReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/mvi/entity/IacProblemsBottomSheetInternalAction;", "LeM/c;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements u<IacProblemsBottomSheetInternalAction, eM.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46977a f168935b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f168936c;

    /* compiled from: IacProblemsBottomSheetReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[IacProblem.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IacProblem iacProblem = IacProblem.f169089b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IacProblem iacProblem2 = IacProblem.f169089b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IacProblem iacProblem3 = IacProblem.f169089b;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IacProblem iacProblem4 = IacProblem.f169089b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IacProblem iacProblem5 = IacProblem.f169089b;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IacProblem iacProblem6 = IacProblem.f169089b;
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Inject
    public l(@Y61.k InterfaceC46977a interfaceC46977a, @Y61.k @Named("iacProblemScenario") String str) {
        this.f168935b = interfaceC46977a;
        this.f168936c = str;
    }

    public static List b(List list, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.getAndSet(true)) {
            return list;
        }
        return C42745f0.h0(list, Collections.singletonList(c.b.g.f395138a));
    }

    @Override // com.avito.android.arch.mvi.u
    public final eM.c a(IacProblemsBottomSheetInternalAction iacProblemsBottomSheetInternalAction, eM.c cVar) {
        List listB;
        IacProblemsBottomSheetInternalAction iacProblemsBottomSheetInternalAction2 = iacProblemsBottomSheetInternalAction;
        eM.c cVar2 = cVar;
        if (!(iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.RefreshProblems)) {
            if (!(iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.SetProgressOnUserIacEnableItem)) {
                if (iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.Close ? true : iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.OpenBackgroundRestrictionSettings ? true : iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.OpenBatteryOptimizationSettings ? true : iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.OpenMiuiLockScreenPermissionLink ? true : iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.OpenNotificationSettings ? true : iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.OpenOnboarding ? true : iacProblemsBottomSheetInternalAction2 instanceof IacProblemsBottomSheetInternalAction.StartRequestMicPermissionFlow) {
                    return cVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            IacProblemsBottomSheetInternalAction.SetProgressOnUserIacEnableItem setProgressOnUserIacEnableItem = (IacProblemsBottomSheetInternalAction.SetProgressOnUserIacEnableItem) iacProblemsBottomSheetInternalAction2;
            List<c.b> list = cVar2.f395131b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (c.b iVar : list) {
                if (iVar instanceof c.b.i) {
                    boolean z12 = ((c.b.i) iVar).f395140a;
                    setProgressOnUserIacEnableItem.getClass();
                    iVar = new c.b.i(z12, true);
                }
                arrayList.add(iVar);
            }
            return new eM.c(arrayList);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        List listB0 = C42745f0.B0(this.f168935b.c(), new m());
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listB0, 10));
        Iterator it = listB0.iterator();
        while (it.hasNext()) {
            switch (((IacProblem) it.next()).ordinal()) {
                case 0:
                    listB = b(Collections.singletonList(new c.b.i(false, false)), atomicBoolean);
                    break;
                case 1:
                    listB = b(Collections.singletonList(c.b.e.f395136a), atomicBoolean);
                    break;
                case 2:
                    listB = b(Collections.singletonList(c.b.f.f395137a), atomicBoolean);
                    break;
                case 3:
                    listB = b(Collections.singletonList(c.b.C11075c.f395134a), atomicBoolean);
                    break;
                case 4:
                    listB = b(Collections.singletonList(c.b.C11074b.f395133a), atomicBoolean);
                    break;
                case 5:
                    listB = b(Collections.singletonList(c.b.a.f395132a), atomicBoolean);
                    break;
                case 6:
                    listB = b(Collections.singletonList(c.b.d.f395135a), atomicBoolean);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(listB);
        }
        ArrayList arrayListH = C42745f0.H(arrayList2);
        boolean zIsEmpty = arrayListH.isEmpty();
        Collection collectionSingletonList = arrayListH;
        if (zIsEmpty) {
            collectionSingletonList = Collections.singletonList(c.b.h.f395139a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionSingletonList) {
            c.b bVar = (c.b) obj;
            String str = this.f168936c;
            if (!L.f(str, "settings") || (L.f(str, "settings") && !(bVar instanceof c.b.i))) {
                arrayList3.add(obj);
            }
        }
        return new eM.c(arrayList3);
    }
}
