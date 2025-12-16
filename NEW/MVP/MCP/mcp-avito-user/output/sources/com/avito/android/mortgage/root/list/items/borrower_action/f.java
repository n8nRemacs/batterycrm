package com.avito.android.mortgage.root.list.items.borrower_action;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import f10.InterfaceC40199a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BorrowerActionPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/borrower_action/f;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/borrower_action/h;", "Lcom/avito/android/mortgage/root/list/items/borrower_action/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40199a, G0> f202449b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC40199a, G0> lVar) {
        this.f202449b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (c) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    @Override // TV0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(TV0.e r5, TV0.a r6, int r7, java.util.List r8) {
        /*
            r4 = this;
            com.avito.android.mortgage.root.list.items.borrower_action.h r5 = (com.avito.android.mortgage.root.list.items.borrower_action.h) r5
            com.avito.android.mortgage.root.list.items.borrower_action.c r6 = (com.avito.android.mortgage.root.list.items.borrower_action.c) r6
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
            if (r0 == 0) goto L6f
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
            goto L6b
        L6a:
            r8 = r0
        L6b:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L71
        L6f:
            kotlin.collections.z0 r8 = kotlin.collections.C42784z0.f406748b
        L71:
            if (r1 == 0) goto L78
            boolean r7 = r1.f202915a
            r5.setEnabled(r7)
        L78:
            r7 = r8
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L7f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r7.next()
            com.avito.android.mortgage.root.list.payloads.g r0 = (com.avito.android.mortgage.root.list.payloads.g) r0
            boolean r2 = r0 instanceof com.avito.android.mortgage.root.list.payloads.g.d
            if (r2 == 0) goto L97
            com.avito.android.mortgage.root.list.payloads.g$d r0 = (com.avito.android.mortgage.root.list.payloads.g.d) r0
            com.avito.android.remote.model.text.AttributedText r0 = r0.f202908a
            r5.k(r0)
            goto L7f
        L97:
            boolean r2 = r0 instanceof com.avito.android.mortgage.root.list.payloads.g.a
            if (r2 == 0) goto La6
            com.avito.android.mortgage.root.list.items.borrower_action.e r2 = new com.avito.android.mortgage.root.list.items.borrower_action.e
            com.avito.android.mortgage.root.list.payloads.g$a r0 = (com.avito.android.mortgage.root.list.payloads.g.a) r0
            r2.<init>(r4, r0)
            r5.a(r2)
            goto L7f
        La6:
            boolean r2 = r0 instanceof com.avito.android.mortgage.root.list.payloads.g.c
            if (r2 == 0) goto Lb2
            com.avito.android.mortgage.root.list.payloads.g$c r0 = (com.avito.android.mortgage.root.list.payloads.g.c) r0
            java.lang.String r0 = r0.f202907a
            r5.Z(r0)
            goto L7f
        Lb2:
            boolean r2 = r0 instanceof com.avito.android.mortgage.root.list.payloads.g.b
            if (r2 == 0) goto L7f
            com.avito.android.mortgage.root.list.payloads.g$b r0 = (com.avito.android.mortgage.root.list.payloads.g.b) r0
            java.lang.String r0 = r0.f202906a
            r5.ho(r0)
            goto L7f
        Lbe:
            if (r1 != 0) goto Lc9
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto Lc9
            r4.k(r5, r6)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.list.items.borrower_action.f.g2(TV0.e, TV0.a, int, java.util.List):void");
    }

    public final void k(@k h hVar, @k c cVar) {
        hVar.a(new d(this, cVar));
        hVar.setEnabled(cVar.f202444j);
        hVar.Z(cVar.f202438d);
        hVar.ho(cVar.f202439e);
        hVar.setTitle(cVar.f202440f);
        hVar.k(cVar.f202441g);
    }
}
