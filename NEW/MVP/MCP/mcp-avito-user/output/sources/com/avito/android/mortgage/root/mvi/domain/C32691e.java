package com.avito.android.mortgage.root.mvi.domain;

import KZ.C14285o;
import KZ.InterfaceC14286p;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.api.model.ApplicationHeaderStyle;
import com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.util.R0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ApplicationPollingInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/e;", "Lcom/avito/android/mortgage/root/mvi/domain/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.root.mvi.domain.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32691e implements InterfaceC32687a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f203068a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SK0.b f203069b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f203070c;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public A1.a f203072e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N0 f203073f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public String f203074g;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f203071d = f2.b(0, 0, null, 7);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a f203075h = new a();

    @Inject
    public C32691e(@Y61.k z zVar, @Y61.k SK0.b bVar, @Y61.k R0 r02) {
        this.f203068a = zVar;
        this.f203069b = bVar;
        this.f203070c = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.mortgage.root.mvi.domain.C32691e r5, JZ.d r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.avito.android.mortgage.root.mvi.domain.C32688b
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.mortgage.root.mvi.domain.b r0 = (com.avito.android.mortgage.root.mvi.domain.C32688b) r0
            int r1 = r0.f203054t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f203054t = r1
            goto L1b
        L16:
            com.avito.android.mortgage.root.mvi.domain.b r0 = new com.avito.android.mortgage.root.mvi.domain.b
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f203052r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f203054t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r7)
            goto L81
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            com.avito.android.mortgage.root.mvi.domain.e r5 = r0.f203051q
            kotlin.C42729a0.b(r7)
            goto L60
        L3d:
            kotlin.C42729a0.b(r7)
            JZ.a r6 = r6.getAnalytics()
            java.lang.String r6 = r6.getCurrentMortgageStage()
            java.lang.String r7 = "applied"
            boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
            if (r6 != 0) goto L53
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto L83
        L53:
            r0.f203051q = r5
            r0.f203054t = r4
            r6 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = kotlinx.coroutines.C43131e0.b(r6, r0)
            if (r6 != r1) goto L60
            goto L83
        L60:
            java.lang.String r6 = r5.f203074g
            java.lang.String r7 = "MortgageCesOnApplicationSentAndroid"
            boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
            if (r6 != 0) goto L81
            com.avito.android.util.R0 r6 = r5.f203070c
            kotlinx.coroutines.d1 r6 = r6.b()
            com.avito.android.mortgage.root.mvi.domain.c r7 = new com.avito.android.mortgage.root.mvi.domain.c
            r2 = 0
            r7.<init>(r5, r2)
            r0.f203051q = r2
            r0.f203054t = r3
            java.lang.Object r5 = kotlinx.coroutines.C43259k.g(r6, r7, r0)
            if (r5 != r1) goto L81
            goto L83
        L81:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.C32691e.d(com.avito.android.mortgage.root.mvi.domain.e, JZ.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final e2 getF203071d() {
        return this.f203071d;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a
    public final void b(@Y61.k A1.a aVar) {
        this.f203072e = aVar;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a
    public final void c(@Y61.k String str, @Y61.k MortgageRootInternalAction mortgageRootInternalAction) {
        N0 n02;
        if (mortgageRootInternalAction instanceof MortgageRootInternalAction.ApplicationLoadingCompleted) {
            MortgageRootInternalAction.ApplicationLoadingCompleted applicationLoadingCompleted = (MortgageRootInternalAction.ApplicationLoadingCompleted) mortgageRootInternalAction;
            e(str, applicationLoadingCompleted.f203162c, applicationLoadingCompleted.f203161b);
            return;
        }
        if (mortgageRootInternalAction instanceof MortgageRootInternalAction.ApplicationReloadingCompleted) {
            MortgageRootInternalAction.ApplicationReloadingCompleted applicationReloadingCompleted = (MortgageRootInternalAction.ApplicationReloadingCompleted) mortgageRootInternalAction;
            e(str, applicationReloadingCompleted.f203176c, applicationReloadingCompleted.f203175b);
            return;
        }
        if (mortgageRootInternalAction instanceof MortgageRootInternalAction.StepLoadingCompleted) {
            MortgageRootInternalAction.StepLoadingCompleted stepLoadingCompleted = (MortgageRootInternalAction.StepLoadingCompleted) mortgageRootInternalAction;
            e(str, stepLoadingCompleted.f203243c, stepLoadingCompleted.f203242b);
        } else if (mortgageRootInternalAction instanceof MortgageRootInternalAction.ApplicationPollingCompleted) {
            MortgageRootInternalAction.ApplicationPollingCompleted applicationPollingCompleted = (MortgageRootInternalAction.ApplicationPollingCompleted) mortgageRootInternalAction;
            e(str, applicationPollingCompleted.f203169c, applicationPollingCompleted.f203168b);
        } else {
            if (!(mortgageRootInternalAction instanceof MortgageRootInternalAction.ApplicationPollingFailed) || (n02 = this.f203073f) == null) {
                return;
            }
            ((V0) n02).c(null);
        }
    }

    public final void e(String str, List<C14285o> list, JZ.c cVar) {
        boolean z12;
        boolean z13;
        ActionButton action;
        List<C14285o> list2 = list;
        boolean z14 = list2 instanceof Collection;
        boolean z15 = false;
        if (z14 && list2.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((C14285o) it.next()).f9529a == ApplicationContentItemType.PROCESS_ACTIONS) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        if (z14 && list2.isEmpty()) {
            z13 = false;
        } else {
            for (C14285o c14285o : list2) {
                if (c14285o.f9529a == ApplicationContentItemType.ISSUE) {
                    InterfaceC14286p interfaceC14286p = c14285o.f9530b;
                    KZ.u uVar = interfaceC14286p instanceof KZ.u ? (KZ.u) interfaceC14286p : null;
                    String title = (uVar == null || (action = uVar.getAction()) == null) ? null : action.getTitle();
                    if (title != null && title.length() != 0) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
        }
        if (!z14 || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C14285o) it2.next()).f9529a == ApplicationContentItemType.REALTY_OBJECT_DETAILS) {
                        z15 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z12 && !z13 && !z15) {
            if ((cVar != null ? cVar.getStyle() : null) != ApplicationHeaderStyle.SUCCESS) {
                N0 n02 = this.f203073f;
                if (n02 == null || !((AbstractC43075a) n02).isActive()) {
                    N0 n03 = this.f203073f;
                    if (n03 != null) {
                        ((V0) n03).c(null);
                    }
                    A1.a aVar = this.f203072e;
                    this.f203073f = aVar != null ? C43259k.d(aVar, this.f203070c.a(), null, new C32690d(this, str, null), 2) : null;
                    return;
                }
                return;
            }
        }
        N0 n04 = this.f203073f;
        if (n04 != null) {
            ((V0) n04).c(null);
        }
    }

    /* compiled from: ApplicationPollingInteractor.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/root/mvi/domain/e$a", "LSK0/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.mvi.domain.e$a */
    public static final class a implements SK0.d {
        public a() {
        }

        @Override // SK0.d
        public final void Od(@Y61.k String str) {
            C32691e c32691e = C32691e.this;
            if (kotlin.jvm.internal.L.f(c32691e.f203074g, str)) {
                c32691e.f203074g = null;
            }
        }

        @Override // SK0.d
        public final void ha(@Y61.k String str) {
            C32691e c32691e = C32691e.this;
            if (kotlin.jvm.internal.L.f(c32691e.f203074g, str)) {
                c32691e.f203074g = null;
            }
        }

        @Override // SK0.d
        public final void v5(@Y61.k String str) {
            C32691e.this.f203074g = str;
        }

        @Override // SK0.d
        public final void W2(@Y61.k String str) {
        }
    }
}
