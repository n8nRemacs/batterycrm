package com.avito.android.mortgage.root.list.items.mortgage_progress;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import f10.InterfaceC40199a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageProgressPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/e;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/g;", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.f<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40199a, G0> f202689b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC40199a, G0> lVar) {
        this.f202689b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        gVar.setTitle(cVar.f202685c);
        gVar.t4(cVar.f202686d);
        gVar.YB(cVar.f202687e);
        gVar.O2(new d(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    @Override // TV0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(TV0.e r3, TV0.a r4, int r5, java.util.List r6) {
        /*
            r2 = this;
            com.avito.android.mortgage.root.list.items.mortgage_progress.g r3 = (com.avito.android.mortgage.root.list.items.mortgage_progress.g) r3
            com.avito.android.mortgage.root.list.items.mortgage_progress.c r4 = (com.avito.android.mortgage.root.list.items.mortgage_progress.c) r4
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r4 = r6.iterator()
            r5 = 0
            r6 = r5
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r4.next()
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto Le
            r6 = r0
            goto Le
        L1e:
            boolean r4 = r6 instanceof java.util.List
            if (r4 != 0) goto L23
            r6 = r5
        L23:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L4a
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r4 = r6.iterator()
            r6 = r5
        L30:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L30
            r6 = r0
            goto L30
        L40:
            boolean r4 = r6 instanceof java.util.List
            if (r4 != 0) goto L45
            goto L46
        L45:
            r5 = r6
        L46:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L4c
        L4a:
            kotlin.collections.z0 r5 = kotlin.collections.C42784z0.f406748b
        L4c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r4 = r5.iterator()
        L52:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r4.next()
            com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a r5 = (com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a) r5
            boolean r6 = r5 instanceof com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a.c
            if (r6 == 0) goto L6a
            com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a$c r5 = (com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a.c) r5
            java.lang.String r5 = r5.f202697a
            r3.setTitle(r5)
            goto L52
        L6a:
            boolean r6 = r5 instanceof com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a.b
            if (r6 == 0) goto L76
            com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a$b r5 = (com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a.b) r5
            java.util.ArrayList r5 = r5.f202696a
            r3.t4(r5)
            goto L52
        L76:
            boolean r6 = r5 instanceof com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a.C6032a
            if (r6 == 0) goto L52
            com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a$a r5 = (com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a.C6032a) r5
            int r5 = r5.f202695a
            r3.YB(r5)
            goto L52
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.list.items.mortgage_progress.e.g2(TV0.e, TV0.a, int, java.util.List):void");
    }
}
