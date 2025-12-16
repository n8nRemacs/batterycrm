package com.avito.android.favorites.link;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GetSimilarPushLinkUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/link/h;", "Lcom/avito/android/favorites/link/f;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WC.a f157411a;

    @Inject
    public h(@k WC.a aVar) {
        this.f157411a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.favorites.link.f
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, @Y61.l java.lang.Long r12, @Y61.l java.lang.Long r13, @Y61.l java.lang.String r14, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof com.avito.android.favorites.link.g
            if (r0 == 0) goto L14
            r0 = r15
            com.avito.android.favorites.link.g r0 = (com.avito.android.favorites.link.g) r0
            int r1 = r0.f157410s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f157410s = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.avito.android.favorites.link.g r0 = new com.avito.android.favorites.link.g
            r0.<init>(r9, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r8.f157408q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f157410s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r15)
            goto L46
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.C42729a0.b(r15)
            r8.f157410s = r2
            WC.a r1 = r9.f157411a
            r7 = 0
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r15 = r1.a(r2, r4, r5, r6, r7, r8)
            if (r15 != r0) goto L46
            return r0
        L46:
            com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
            boolean r10 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto L5e
            com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
            java.lang.Object r10 = r15.getResult()
            XC.a r10 = (XC.a) r10
            com.avito.android.deep_linking.links.DeepLink r10 = r10.getDeeplink()
            com.avito.android.remote.model.TypedResult$Success r15 = new com.avito.android.remote.model.TypedResult$Success
            r15.<init>(r10)
            goto L62
        L5e:
            boolean r10 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto L63
        L62:
            return r15
        L63:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.link.h.a(long, java.lang.Long, java.lang.Long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
