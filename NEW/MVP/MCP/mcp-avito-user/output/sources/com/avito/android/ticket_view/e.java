package com.avito.android.ticket_view;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sE0.InterfaceC48038a;

/* compiled from: TicketMenuIconRepository.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ticket_view/e;", "", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC48038a> f301401a;

    @Inject
    public e(@k h31.e<InterfaceC48038a> eVar) {
        this.f301401a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.ticket_view.d
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.ticket_view.d r0 = (com.avito.android.ticket_view.d) r0
            int r1 = r0.f301400s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f301400s = r1
            goto L18
        L13:
            com.avito.android.ticket_view.d r0 = new com.avito.android.ticket_view.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f301398q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f301400s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            h31.e<sE0.a> r5 = r4.f301401a
            java.lang.Object r5 = r5.get()
            sE0.a r5 = (sE0.InterfaceC48038a) r5
            r0.f301400s = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L62
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            tE0.a r5 = (tE0.C48543a) r5
            long r0 = r5.getBalance()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r5)
            r5 = r0
            goto L66
        L62:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L67
        L66:
            return r5
        L67:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ticket_view.e.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
