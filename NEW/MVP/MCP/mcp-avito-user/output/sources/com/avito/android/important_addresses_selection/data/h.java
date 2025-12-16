package com.avito.android.important_addresses_selection.data;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImportantAddressesSelectionRepositoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/h;", "LRM/c;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements RM.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<a> f169709a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f169710b;

    @Inject
    public h(@k h31.e<a> eVar, @k d dVar) {
        this.f169709a = eVar;
        this.f169710b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // RM.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.LinkedHashMap r5, @Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.important_addresses_selection.data.g
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.important_addresses_selection.data.g r0 = (com.avito.android.important_addresses_selection.data.g) r0
            int r1 = r0.f169708s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169708s = r1
            goto L18
        L13:
            com.avito.android.important_addresses_selection.data.g r0 = new com.avito.android.important_addresses_selection.data.g
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f169706q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f169708s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            h31.e<com.avito.android.important_addresses_selection.data.a> r7 = r4.f169709a
            java.lang.Object r7 = r7.get()
            com.avito.android.important_addresses_selection.data.a r7 = (com.avito.android.important_addresses_selection.data.a) r7
            r0.f169708s = r3
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L57
            com.avito.android.remote.model.TypedResult$Success r5 = new com.avito.android.remote.model.TypedResult$Success
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            r5.<init>(r6)
            goto L6a
        L57:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L6b
            com.avito.android.remote.model.TypedResult$Error r5 = new com.avito.android.remote.model.TypedResult$Error
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r6 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            r5.<init>(r6, r7)
        L6a:
            return r5
        L6b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.important_addresses_selection.data.h.a(java.util.LinkedHashMap, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // RM.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r22, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.important_addresses_selection.data.h.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
