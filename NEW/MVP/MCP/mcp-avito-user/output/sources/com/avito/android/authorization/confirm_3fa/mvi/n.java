package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.remote.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfirmEmailListInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/n;", "Lcom/avito/android/authorization/confirm_3fa/mvi/j;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f93623a;

    @Inject
    public n(@Y61.k r rVar) {
        this.f93623a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.authorization.confirm_3fa.mvi.j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.authorization.confirm_3fa.adapter.email.EmailItem r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.authorization.confirm_3fa.mvi.k
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.authorization.confirm_3fa.mvi.k r0 = (com.avito.android.authorization.confirm_3fa.mvi.k) r0
            int r1 = r0.f93620s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93620s = r1
            goto L18
        L13:
            com.avito.android.authorization.confirm_3fa.mvi.k r0 = new com.avito.android.authorization.confirm_3fa.mvi.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f93618q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f93620s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r8)
            java.lang.String r7 = r7.f93561c
            r0.f93620s = r3
            com.avito.android.remote.r r8 = r6.f93623a
            java.lang.Object r8 = r8.m(r7, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            r0 = r8
            com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
            com.avito.android.authorization.confirm_3fa.mvi.l r1 = com.avito.android.authorization.confirm_3fa.mvi.l.f93621l
            com.avito.android.authorization.confirm_3fa.mvi.m r2 = com.avito.android.authorization.confirm_3fa.mvi.m.f93622l
            r7 = 0
            java.io.Serializable[] r7 = new java.io.Serializable[r7]
            r8 = 2131952221(0x7f13025d, float:1.9540879E38)
            com.avito.android.printable_text.PrintableText r4 = com.avito.android.printable_text.b.c(r8, r7)
            r5 = 28
            r3 = 0
            java.lang.Object r7 = com.avito.android.error.z.r(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.confirm_3fa.mvi.n.a(com.avito.android.authorization.confirm_3fa.adapter.email.EmailItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
