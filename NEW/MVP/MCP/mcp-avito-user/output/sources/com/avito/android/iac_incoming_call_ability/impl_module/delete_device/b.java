package com.avito.android.iac_incoming_call_ability.impl_module.delete_device;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeleteDeviceInteractorImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/delete_device/b;", "LML/a;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements ML.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_incoming_call_ability.impl_module.api.a f168291a;

    @Inject
    public b(@k com.avito.android.iac_incoming_call_ability.impl_module.api.a aVar) {
        this.f168291a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ML.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.l java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.iac_incoming_call_ability.impl_module.delete_device.a
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.iac_incoming_call_ability.impl_module.delete_device.a r0 = (com.avito.android.iac_incoming_call_ability.impl_module.delete_device.a) r0
            int r1 = r0.f168290s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168290s = r1
            goto L18
        L13:
            com.avito.android.iac_incoming_call_ability.impl_module.delete_device.a r0 = new com.avito.android.iac_incoming_call_ability.impl_module.delete_device.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f168288q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f168290s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            r0.f168290s = r3
            com.avito.android.iac_incoming_call_ability.impl_module.api.a r7 = r4.f168291a
            java.lang.Object r7 = r7.f(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L4d
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            r7.getResult()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L4d:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L60
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            java.lang.Throwable r6 = r7.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L60:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_incoming_call_ability.impl_module.delete_device.b.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
