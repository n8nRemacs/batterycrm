package com.avito.android.mortgage.root.list.items.issue;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.ActionButton;
import f10.InterfaceC40199a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IssuePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/issue/f;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/issue/h;", "Lcom/avito/android/mortgage/root/list/items/issue/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40199a, G0> f202649b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC40199a, G0> lVar) {
        this.f202649b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (c) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    @Override // TV0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(TV0.e r5, TV0.a r6, int r7, java.util.List r8) {
        /*
            r4 = this;
            com.avito.android.mortgage.root.list.items.issue.h r5 = (com.avito.android.mortgage.root.list.items.issue.h) r5
            com.avito.android.mortgage.root.list.items.issue.c r6 = (com.avito.android.mortgage.root.list.items.issue.c) r6
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r7 = r8.iterator()
            r8 = 0
            r0 = r8
        Le:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto Le
            r0 = r1
            goto Le
        L1e:
            boolean r7 = r0 instanceof java.util.List
            if (r7 != 0) goto L23
            r0 = r8
        L23:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L49
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r1 = r8
        L31:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r7.next()
            boolean r3 = r2 instanceof com.avito.android.mortgage.root.list.payloads.m
            if (r3 == 0) goto L31
            r1 = r2
            goto L31
        L41:
            boolean r7 = r1 instanceof com.avito.android.mortgage.root.list.payloads.m
            if (r7 != 0) goto L46
            r1 = r8
        L46:
            com.avito.android.mortgage.root.list.payloads.m r1 = (com.avito.android.mortgage.root.list.payloads.m) r1
            goto L4a
        L49:
            r1 = r8
        L4a:
            if (r0 == 0) goto L6e
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r7 = r0.iterator()
            r0 = r8
        L55:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r7.next()
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L55
            r0 = r2
            goto L55
        L65:
            boolean r7 = r0 instanceof java.util.List
            if (r7 != 0) goto L6a
            r0 = r8
        L6a:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L70
        L6e:
            kotlin.collections.z0 r0 = kotlin.collections.C42784z0.f406748b
        L70:
            if (r1 == 0) goto L77
            boolean r7 = r1.f202915a
            r5.setEnabled(r7)
        L77:
            r7 = r0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L7e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r7.next()
            com.avito.android.mortgage.root.list.payloads.p r2 = (com.avito.android.mortgage.root.list.payloads.p) r2
            boolean r3 = r2 instanceof com.avito.android.mortgage.root.list.payloads.p.b
            if (r3 == 0) goto L96
            com.avito.android.mortgage.root.list.payloads.p$b r2 = (com.avito.android.mortgage.root.list.payloads.p.b) r2
            java.lang.String r2 = r2.f202918a
            r5.n(r2)
            goto L7e
        L96:
            boolean r3 = r2 instanceof com.avito.android.mortgage.root.list.payloads.p.a
            if (r3 == 0) goto L7e
            r3 = r2
            com.avito.android.mortgage.root.list.payloads.p$a r3 = (com.avito.android.mortgage.root.list.payloads.p.a) r3
            com.avito.android.mortgage.api.model.ActionButton r3 = r3.f202917a
            if (r3 == 0) goto La6
            java.lang.String r3 = r3.getTitle()
            goto La7
        La6:
            r3 = r8
        La7:
            r5.Fb(r3)
            com.avito.android.mortgage.root.list.items.issue.e r3 = new com.avito.android.mortgage.root.list.items.issue.e
            com.avito.android.mortgage.root.list.payloads.p$a r2 = (com.avito.android.mortgage.root.list.payloads.p.a) r2
            r3.<init>(r2, r4)
            r5.U(r3)
            goto L7e
        Lb5:
            if (r1 != 0) goto Lc0
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto Lc0
            r4.k(r5, r6)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.list.items.issue.f.g2(TV0.e, TV0.a, int, java.util.List):void");
    }

    public final void k(@k h hVar, @k c cVar) {
        hVar.U(new d(cVar, this));
        hVar.setEnabled(cVar.f202644f);
        ActionButton actionButton = cVar.f202643e;
        hVar.Fb(actionButton != null ? actionButton.getTitle() : null);
        hVar.setTitle(cVar.f202641c);
        hVar.n(cVar.f202642d);
    }
}
