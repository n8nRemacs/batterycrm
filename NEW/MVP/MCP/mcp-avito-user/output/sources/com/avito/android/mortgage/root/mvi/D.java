package com.avito.android.mortgage.root.mvi;

import KZ.C14285o;
import KZ.InterfaceC14286p;
import Y00.InterfaceC18243d;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType;
import com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import e10.InterfaceC39843a;
import g10.C40513c;
import g10.InterfaceC40512b;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/D;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lg10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class D implements com.avito.android.arch.mvi.u<MortgageRootInternalAction, C40513c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39843a f202938b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18243d f202939c;

    /* compiled from: MortgageRootReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DetailsBlockOption.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DetailsBlockOption.Type type = DetailsBlockOption.Type.f202758b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public D(@Y61.k InterfaceC39843a interfaceC39843a, @Y61.k InterfaceC18243d interfaceC18243d) {
        this.f202938b = interfaceC39843a;
        this.f202939c = interfaceC18243d;
    }

    public static KZ.B b(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C14285o) next).f9529a == ApplicationContentItemType.PROCESS_ACTIONS) {
                break;
            }
        }
        C14285o c14285o = (C14285o) next;
        InterfaceC14286p interfaceC14286p = c14285o != null ? c14285o.f9530b : null;
        if (interfaceC14286p instanceof KZ.B) {
            return (KZ.B) interfaceC14286p;
        }
        return null;
    }

    public static C40513c c(C40513c c40513c) {
        return C40513c.a(c40513c, null, null, null, null, null, null, false, false, InterfaceC40512b.a.f396236a, null, 767);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g10.C40513c d(g10.C40513c r12, java.util.Map r13) {
        /*
            g10.b$a r9 = g10.InterfaceC40512b.a.f396236a
            java.util.List<KZ.o> r0 = r12.f396248d
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
            r3 = 0
        L11:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L27
            java.lang.Object r4 = r1.next()
            KZ.o r4 = (KZ.C14285o) r4
            com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType r4 = r4.f9529a
            com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType r5 = com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType.REALTY_OBJECT_DETAILS
            if (r4 != r5) goto L24
            goto L28
        L24:
            int r3 = r3 + 1
            goto L11
        L27:
            r3 = -1
        L28:
            java.lang.Object r1 = kotlin.collections.C42745f0.K(r3, r2)
            KZ.o r1 = (KZ.C14285o) r1
            if (r1 != 0) goto L31
            goto L3e
        L31:
            KZ.p r4 = r1.f9530b
            boolean r5 = r4 instanceof KZ.D
            r6 = 0
            if (r5 == 0) goto L3b
            KZ.D r4 = (KZ.D) r4
            goto L3c
        L3b:
            r4 = r6
        L3c:
            if (r4 != 0) goto L40
        L3e:
            r3 = r0
            goto L96
        L40:
            KZ.N r0 = r4.getDetails()
            KZ.N r5 = r4.getDetails()
            KZ.Q r5 = r5.getLinkOption()
            java.lang.String r7 = "itemUrl"
            java.lang.Object r7 = r13.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            KZ.Q r5 = r5.e(r7)
            KZ.N r7 = r4.getDetails()
            KZ.O r7 = r7.getAddressOption()
            java.lang.String r8 = "address"
            java.lang.Object r8 = r13.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            KZ.O r7 = r7.e(r8)
            KZ.N r8 = r4.getDetails()
            KZ.P r8 = r8.getCostField()
            java.lang.String r10 = "cost"
            java.lang.Object r13 = r13.get(r10)
            java.lang.String r13 = (java.lang.String) r13
            r8.getClass()
            r10 = 7
            KZ.P r13 = KZ.P.a(r8, r6, r13, r10)
            r8 = 1
            KZ.N r13 = KZ.N.a(r0, r5, r7, r13, r8)
            r0 = 3
            KZ.D r13 = KZ.D.a(r4, r6, r13, r0)
            KZ.o r13 = KZ.C14285o.a(r1, r13)
            r2.set(r3, r13)
            r3 = r2
        L96:
            r8 = 0
            r10 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r11 = 763(0x2fb, float:1.069E-42)
            r0 = r12
            g10.c r12 = g10.C40513c.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.D.d(g10.c, java.util.Map):g10.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Type inference failed for: r2v25, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g10.C40513c e(g10.C40513c r17, JZ.c r18, java.util.List r19, JZ.d r20) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.D.e(g10.c, JZ.c, java.util.List, JZ.d):g10.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05e1  */
    /* JADX WARN: Type inference failed for: r3v101, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v116, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g10.C40513c a(com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction r19, g10.C40513c r20) {
        /*
            Method dump skipped, instructions count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.D.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
