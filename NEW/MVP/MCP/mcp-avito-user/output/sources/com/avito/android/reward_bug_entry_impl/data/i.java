package com.avito.android.reward_bug_entry_impl.data;

import com.avito.android.account.E;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import r91.InterfaceC47515a;

/* compiled from: RewardBugEntryRepositoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/data/i;", "Lcom/avito/android/reward_bug_entry_impl/domain/i;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements com.avito.android.reward_bug_entry_impl.domain.i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f255588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47515a> f255589b;

    @Inject
    public i(@Y61.k E e12, @Y61.k h31.e<InterfaceC47515a> eVar) {
        this.f255588a = e12;
        this.f255589b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.reward_bug_entry_impl.domain.i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.reward_bug_entry_impl.data.g
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.reward_bug_entry_impl.data.g r0 = (com.avito.android.reward_bug_entry_impl.data.g) r0
            int r1 = r0.f255584s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255584s = r1
            goto L18
        L13:
            com.avito.android.reward_bug_entry_impl.data.g r0 = new com.avito.android.reward_bug_entry_impl.data.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f255582q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f255584s
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
            h31.e<r91.a> r5 = r4.f255589b
            java.lang.Object r5 = r5.get()
            r91.a r5 = (r91.InterfaceC47515a) r5
            r0.f255584s = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L62
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            t91.a r5 = (t91.C48525a) r5
            boolean r5 = r5.getOk()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reward_bug_entry_impl.data.i.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.reward_bug_entry_impl.domain.i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reward_bug_entry_impl.data.i.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
