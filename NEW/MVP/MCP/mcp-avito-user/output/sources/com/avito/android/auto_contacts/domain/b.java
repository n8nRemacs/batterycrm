package com.avito.android.auto_contacts.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import we.InterfaceC49611a;

/* compiled from: AutoContactsPackagesInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_contacts/domain/b;", "", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49611a f94872a;

    @Inject
    public b(@k InterfaceC49611a interfaceC49611a) {
        this.f94872a = interfaceC49611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.auto_contacts.domain.a
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.auto_contacts.domain.a r0 = (com.avito.android.auto_contacts.domain.a) r0
            int r1 = r0.f94871s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94871s = r1
            goto L18
        L13:
            com.avito.android.auto_contacts.domain.a r0 = new com.avito.android.auto_contacts.domain.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f94869q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f94871s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.C42729a0.b(r8)
            r0.f94871s = r3
            we.a r8 = r7.f94872a
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto La8
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            xe.e r8 = (xe.e) r8
            java.lang.String r0 = r8.getTitle()
            java.lang.String r1 = r8.getDescription()
            java.util.List r2 = r8.c()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C42745f0.q(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r2.next()
            xe.c r4 = (xe.c) r4
            com.avito.android.auto_contacts.domain.models.AutoContactsPackage r5 = new com.avito.android.auto_contacts.domain.models.AutoContactsPackage
            java.lang.String r6 = r4.getTitle()
            java.lang.String r4 = r4.getDescription()
            r5.<init>(r6, r4)
            r3.add(r5)
            goto L6a
        L87:
            xe.a r8 = r8.getButton()
            com.avito.android.auto_contacts.domain.models.AutoButton r2 = new com.avito.android.auto_contacts.domain.models.AutoButton
            java.lang.String r4 = r8.getTitle()
            java.lang.String r5 = r8.getStyle()
            com.avito.android.deep_linking.links.DeepLink r8 = r8.getUri()
            r2.<init>(r4, r5, r8)
            com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState r8 = new com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState
            r8.<init>(r0, r1, r3, r2)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r8)
            r8 = r0
            goto Lac
        La8:
            boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lad
        Lac:
            return r8
        Lad:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_contacts.domain.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
