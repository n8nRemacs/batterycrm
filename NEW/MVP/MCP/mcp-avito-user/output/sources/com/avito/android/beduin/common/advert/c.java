package com.avito.android.beduin.common.advert;

import cj.InterfaceC27204b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAdvertSaturatorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/advert/c;", "Lcj/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC27204b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.x f100536a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.d f100537b;

    @Inject
    public c(@Y61.k com.avito.android.favorite.x xVar, @Y61.k com.avito.android.advert.viewed.d dVar) {
        this.f100536a = xVar;
        this.f100537b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r6
  0x0092: PHI (r6v5 java.lang.Object) = (r6v3 java.lang.Object), (r6v7 java.lang.Object) binds: [B:31:0x00a8, B:22:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // cj.InterfaceC27204b
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k java.util.List r13) {
        /*
            r12 = this;
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = kotlin.collections.C42745f0.q(r13, r1)
            r0.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L11:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r13.next()
            com.avito.android.beduin_models.BeduinAction r2 = (com.avito.android.beduin_models.BeduinAction) r2
            boolean r3 = r2 instanceof com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction
            if (r3 == 0) goto Lca
            r4 = r2
            com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction r4 = (com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction) r4
            java.util.List r3 = r4.getTransforms()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r7 = new java.util.ArrayList
            int r5 = kotlin.collections.C42745f0.q(r3, r1)
            r7.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto Lb2
            java.lang.Object r5 = r3.next()
            com.avito.android.beduin_models.BeduinModelTransform r5 = (com.avito.android.beduin_models.BeduinModelTransform) r5
            boolean r8 = r5 instanceof Ri.InterfaceC15043a
            if (r8 == 0) goto Lae
            r8 = r5
            Ri.a r8 = (Ri.InterfaceC15043a) r8
            java.util.List r8 = r8.getChildren()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L5a:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L77
            java.lang.Object r10 = r8.next()
            com.avito.android.beduin_models.BeduinModel r10 = (com.avito.android.beduin_models.BeduinModel) r10
            java.util.List r10 = java.util.Collections.singletonList(r10)
            com.avito.android.beduin.common.advert.b r11 = new com.avito.android.beduin.common.advert.b
            r11.<init>(r12)
            java.util.ArrayList r10 = com.avito.android.beduin.common.utils.C28809e.c(r11, r10)
            kotlin.collections.C42745f0.h(r10, r9)
            goto L5a
        L77:
            boolean r8 = r5 instanceof com.avito.android.beduin.common.form.transforms.ComponentsGroupAppendTransform
            if (r8 == 0) goto L94
            r8 = r5
            com.avito.android.beduin.common.form.transforms.ComponentsGroupAppendTransform r8 = (com.avito.android.beduin.common.form.transforms.ComponentsGroupAppendTransform) r8
            java.util.List r10 = r8.getChildren()
            boolean r10 = kotlin.jvm.internal.L.f(r10, r9)
            if (r10 == 0) goto L89
            r6 = r5
        L89:
            com.avito.android.beduin.common.form.transforms.ComponentsGroupAppendTransform r6 = (com.avito.android.beduin.common.form.transforms.ComponentsGroupAppendTransform) r6
            if (r6 != 0) goto L92
            com.avito.android.beduin.common.form.transforms.ComponentsGroupAppendTransform r5 = r8.copy(r9)
            goto Lae
        L92:
            r5 = r6
            goto Lae
        L94:
            boolean r8 = r5 instanceof com.avito.android.beduin.common.form.transforms.ComponentsGroupUpdateTransform
            if (r8 == 0) goto Lae
            r8 = r5
            com.avito.android.beduin.common.form.transforms.ComponentsGroupUpdateTransform r8 = (com.avito.android.beduin.common.form.transforms.ComponentsGroupUpdateTransform) r8
            java.util.List r10 = r8.getChildren()
            boolean r10 = kotlin.jvm.internal.L.f(r10, r9)
            if (r10 == 0) goto La6
            r6 = r5
        La6:
            com.avito.android.beduin.common.form.transforms.ComponentsGroupUpdateTransform r6 = (com.avito.android.beduin.common.form.transforms.ComponentsGroupUpdateTransform) r6
            if (r6 != 0) goto L92
            com.avito.android.beduin.common.form.transforms.ComponentsGroupUpdateTransform r5 = r8.copy(r9)
        Lae:
            r7.add(r5)
            goto L37
        Lb2:
            java.util.List r3 = r4.getTransforms()
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto Lbd
            goto Lbe
        Lbd:
            r2 = r6
        Lbe:
            com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction r2 = (com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction) r2
            if (r2 != 0) goto Lca
            r5 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction r2 = com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction.copy$default(r4, r5, r6, r7, r8, r9)
        Lca:
            r0.add(r2)
            goto L11
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.advert.c.a(java.util.List):java.util.ArrayList");
    }
}
