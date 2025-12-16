package com.avito.android.saved_searches_core;

import Io0.InterfaceC14138a;
import Y61.k;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchesInteractorImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches_core/g;", "Lcom/avito/android/saved_searches_core/b;", "_avito_saved-searches-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14138a f258805a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TV.c f258806b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f258807c;

    @Inject
    public g(@k InterfaceC14138a interfaceC14138a, @k TV.c cVar, @k R0 r02) {
        this.f258805a = interfaceC14138a;
        this.f258806b = cVar;
        this.f258807c = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.avito.android.saved_searches_core.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r18, @Y61.l Lo0.C14424b r19, @Y61.l java.lang.Boolean r20, boolean r21, boolean r22, @Y61.l Lo0.C14424b r23, @Y61.l java.lang.String r24, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            r17 = this;
            r10 = r17
            r0 = r25
            boolean r1 = r0 instanceof com.avito.android.saved_searches_core.e
            if (r1 == 0) goto L18
            r1 = r0
            com.avito.android.saved_searches_core.e r1 = (com.avito.android.saved_searches_core.e) r1
            int r2 = r1.f258795u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f258795u = r2
        L16:
            r11 = r1
            goto L1e
        L18:
            com.avito.android.saved_searches_core.e r1 = new com.avito.android.saved_searches_core.e
            r1.<init>(r10, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r11.f258793s
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f258795u
            r13 = 1
            if (r1 == 0) goto L40
            if (r1 != r13) goto L38
            java.lang.String r1 = r11.f258792r
            com.avito.android.saved_searches_core.g r2 = r11.f258791q
            kotlin.C42729a0.b(r0)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L70
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            kotlin.C42729a0.b(r0)
            com.avito.android.util.R0 r0 = r10.f258807c
            kotlinx.coroutines.scheduling.b r14 = r0.a()
            com.avito.android.saved_searches_core.f r15 = new com.avito.android.saved_searches_core.f
            r9 = 0
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r23
            r5 = r22
            r6 = r20
            r7 = r21
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.f258791q = r10
            r0 = r18
            r11.f258792r = r0
            r11.f258795u = r13
            java.lang.Object r1 = kotlinx.coroutines.C43259k.g(r14, r15, r11)
            if (r1 != r12) goto L6f
            return r12
        L6f:
            r2 = r10
        L70:
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            boolean r3 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r3 == 0) goto La7
            com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
            java.lang.Object r1 = r1.getResult()
            Jo0.c r1 = (Jo0.C14232c) r1
            TV.c r2 = r2.f258806b
            TV.e$a r3 = new TV.e$a
            r3.<init>(r0)
            r2.i(r3)
            Lo0.c r0 = new Lo0.c
            java.lang.Long r2 = r1.getId()
            if (r2 == 0) goto L95
            java.lang.String r2 = r2.toString()
            goto L96
        L95:
            r2 = 0
        L96:
            if (r2 != 0) goto L9a
            java.lang.String r2 = ""
        L9a:
            com.avito.android.deep_linking.links.DeepLink r1 = r1.getSearchSubscriptionAction()
            r0.<init>(r2, r1)
            com.avito.android.remote.model.TypedResult$Success r1 = new com.avito.android.remote.model.TypedResult$Success
            r1.<init>(r0)
            goto Lab
        La7:
            boolean r0 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lac
        Lab:
            return r1
        Lac:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.saved_searches_core.g.a(java.lang.String, Lo0.b, java.lang.Boolean, boolean, boolean, Lo0.b, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
