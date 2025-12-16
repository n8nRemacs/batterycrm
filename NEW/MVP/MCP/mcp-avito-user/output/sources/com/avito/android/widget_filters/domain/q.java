package com.avito.android.widget_filters.domain;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: WidgetFiltersOnboardingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/q;", "Lcom/avito/android/widget_filters/domain/o;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f329897a;

    @Inject
    public q(@Y61.k s sVar) {
        this.f329897a = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.widget_filters.domain.o
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l NP0.q r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.widget_filters.domain.p
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.widget_filters.domain.p r0 = (com.avito.android.widget_filters.domain.p) r0
            int r1 = r0.f329896s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f329896s = r1
            goto L18
        L13:
            com.avito.android.widget_filters.domain.p r0 = new com.avito.android.widget_filters.domain.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f329894q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f329896s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            if (r5 != 0) goto L3c
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        L3c:
            NP0.r r6 = r5.getF11514a()
            java.lang.String r6 = r6.getName()
            java.lang.String r5 = r5.getF11518e()
            r0.f329896s = r3
            com.avito.android.widget_filters.domain.s r2 = r4.f329897a
            java.lang.Object r6 = r2.b(r6, r5, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.domain.q.a(NP0.q, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.widget_filters.domain.o
    @Y61.l
    public final Object b(@Y61.k NP0.r rVar, @Y61.k String str, @Y61.k Continuation<? super G0> continuation) {
        Object objA = this.f329897a.a(rVar.getName(), str, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
