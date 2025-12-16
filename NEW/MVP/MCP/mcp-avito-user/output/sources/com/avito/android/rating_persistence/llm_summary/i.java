package com.avito.android.rating_persistence.llm_summary;

import com.avito.android.account.E;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingLLMSummaryInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/i;", "Lcom/avito/android/rating_persistence/llm_summary/h;", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f249813a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f249814b;

    /* compiled from: RatingLLMSummaryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/i$a;", "", "<init>", "()V", "", "ONE_DAY_IN_MILLIS", "J", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i(@Y61.k o oVar, @Y61.k E e12) {
        this.f249813a = oVar;
        this.f249814b = e12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.rating_persistence.llm_summary.h
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.avito.android.rating_persistence.llm_summary.l
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.rating_persistence.llm_summary.l r0 = (com.avito.android.rating_persistence.llm_summary.l) r0
            int r1 = r0.f249831v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249831v = r1
            goto L18
        L13:
            com.avito.android.rating_persistence.llm_summary.l r0 = new com.avito.android.rating_persistence.llm_summary.l
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f249829t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f249831v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r9 = r0.f249828s
            java.lang.String r1 = r0.f249827r
            com.avito.android.rating_persistence.llm_summary.i r0 = r0.f249826q
            kotlin.C42729a0.b(r11)
            goto L68
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.C42729a0.b(r11)
            com.avito.android.account.E r11 = r8.f249814b
            java.lang.String r11 = r11.a()
            if (r11 != 0) goto L4d
            r9 = 0
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            kotlinx.coroutines.flow.w r10 = new kotlinx.coroutines.flow.w
            r10.<init>(r9)
            return r10
        L4d:
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 - r6
            r0.f249826q = r8
            r0.f249827r = r11
            r0.f249828s = r9
            r0.f249831v = r3
            com.avito.android.rating_persistence.llm_summary.o r2 = r8.f249813a
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            r0 = r8
            r1 = r11
        L68:
            com.avito.android.rating_persistence.llm_summary.o r11 = r0.f249813a
            kotlinx.coroutines.flow.i r9 = r11.c(r9, r1)
            com.avito.android.rating_persistence.llm_summary.k r10 = new com.avito.android.rating_persistence.llm_summary.k
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_persistence.llm_summary.i.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.rating_persistence.llm_summary.h
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.avito.android.rating_persistence.llm_summary.j
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.rating_persistence.llm_summary.j r0 = (com.avito.android.rating_persistence.llm_summary.j) r0
            int r1 = r0.f249820v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249820v = r1
            goto L18
        L13:
            com.avito.android.rating_persistence.llm_summary.j r0 = new com.avito.android.rating_persistence.llm_summary.j
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f249818t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f249820v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r12)
            goto L79
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            long r10 = r0.f249817s
            java.lang.String r2 = r0.f249816r
            com.avito.android.rating_persistence.llm_summary.i r5 = r0.f249815q
            kotlin.C42729a0.b(r12)
            goto L69
        L3e:
            kotlin.C42729a0.b(r12)
            com.avito.android.account.E r12 = r9.f249814b
            java.lang.String r2 = r12.a()
            if (r2 != 0) goto L4f
            r10 = 0
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            return r10
        L4f:
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 - r7
            r0.f249815q = r9
            r0.f249816r = r2
            r0.f249817s = r10
            r0.f249820v = r4
            com.avito.android.rating_persistence.llm_summary.o r12 = r9.f249813a
            java.lang.Object r12 = r12.a(r5, r0)
            if (r12 != r1) goto L68
            return r1
        L68:
            r5 = r9
        L69:
            com.avito.android.rating_persistence.llm_summary.o r12 = r5.f249813a
            r5 = 0
            r0.f249815q = r5
            r0.f249816r = r5
            r0.f249820v = r3
            java.lang.Object r12 = r12.d(r10, r2, r0)
            if (r12 != r1) goto L79
            return r1
        L79:
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r10 = r12.isEmpty()
            r10 = r10 ^ r4
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_persistence.llm_summary.i.b(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.rating_persistence.llm_summary.h
    @Y61.l
    public final Object c(long j12, @Y61.k SuspendLambda suspendLambda) {
        String strA = this.f249814b.a();
        if (strA == null) {
            return G0.f406611a;
        }
        Object objB = this.f249813a.b(strA, j12, System.currentTimeMillis(), suspendLambda);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
    }
}
