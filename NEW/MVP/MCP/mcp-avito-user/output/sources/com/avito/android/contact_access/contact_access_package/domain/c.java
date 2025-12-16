package com.avito.android.contact_access.contact_access_package.domain;

import Y61.k;
import Y61.l;
import cP.InterfaceC27082a;
import com.avito.android.remote.model.TypedResult;
import fP.C40326a;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: ContactAccessPackageInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/domain/c;", "Lcom/avito/android/contact_access/contact_access_package/domain/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC27082a f125878a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f125879b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125880c;

    @Inject
    public c(@k InterfaceC27082a interfaceC27082a, @k String str, @Named("CHECK_EMPLOYEE_TAG") boolean z12) {
        this.f125878a = interfaceC27082a;
        this.f125879b = str;
        this.f125880c = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.contact_access.contact_access_package.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.NumberFormatException {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.avito.android.contact_access.contact_access_package.domain.b
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.contact_access.contact_access_package.domain.b r0 = (com.avito.android.contact_access.contact_access_package.domain.b) r0
            int r1 = r0.f125877s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125877s = r1
            goto L18
        L13:
            com.avito.android.contact_access.contact_access_package.domain.b r0 = new com.avito.android.contact_access.contact_access_package.domain.b
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f125875q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f125877s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r13)
            goto L4b
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L31:
            kotlin.C42729a0.b(r13)
            java.lang.String r13 = r12.f125879b
            long r4 = java.lang.Long.parseLong(r13)
            boolean r13 = r12.f125880c
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r13)
            r0.f125877s = r3
            cP.a r2 = r12.f125878a
            java.lang.Object r13 = r2.a(r4, r13, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            boolean r0 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto Lc2
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            java.lang.Object r13 = r13.getResult()
            dP.a r13 = (dP.C39610a) r13
            dP.b r0 = r13.getBalance()
            r1 = 0
            if (r0 == 0) goto L77
            com.avito.android.contact_access.contact_access_package.domain.CurrentPackageBalance r2 = new com.avito.android.contact_access.contact_access_package.domain.CurrentPackageBalance
            long r3 = r0.getCountPercentage()
            java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            java.lang.String r4 = r0.getSubtitle()
            java.lang.String r0 = r0.getTitle()
            r2.<init>(r3, r4, r0)
            r6 = r2
            goto L78
        L77:
            r6 = r1
        L78:
            com.avito.android.contact_access.contact_access_package.domain.CurrentPackageBuyAction r7 = new com.avito.android.contact_access.contact_access_package.domain.CurrentPackageBuyAction
            dP.c r0 = r13.getBuyAction()
            boolean r0 = r0.getIsEmployee()
            dP.c r2 = r13.getBuyAction()
            boolean r2 = r2.getIsEnabled()
            dP.c r3 = r13.getBuyAction()
            java.lang.String r3 = r3.getTitle()
            r7.<init>(r0, r2, r3)
            java.lang.Long r8 = r13.getId()
            java.lang.String r9 = r13.getSubtitle()
            dP.d r0 = r13.getSwitchPaymentAction()
            if (r0 == 0) goto Lb0
            com.avito.android.contact_access.contact_access_package.domain.CurrentPackageSwitchPaymentAction r1 = new com.avito.android.contact_access.contact_access_package.domain.CurrentPackageSwitchPaymentAction
            com.avito.android.deep_linking.links.DeepLink r2 = r0.getDeeplink()
            java.lang.String r0 = r0.getTitle()
            r1.<init>(r2, r0)
        Lb0:
            r10 = r1
            java.lang.String r11 = r13.getTitle()
            com.avito.android.contact_access.contact_access_package.domain.ContactAccessPackage r13 = new com.avito.android.contact_access.contact_access_package.domain.ContactAccessPackage
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r13)
            r13 = r0
            goto Lc6
        Lc2:
            boolean r0 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lc7
        Lc6:
            return r13
        Lc7:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.contact_access.contact_access_package.domain.c.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.contact_access.contact_access_package.domain.a
    @l
    public final Object b(boolean z12, @k Continuation<? super TypedResult<Object>> continuation) throws NumberFormatException {
        return this.f125878a.b(Long.parseLong(this.f125879b), new C40326a(z12), continuation);
    }
}
