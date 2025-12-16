package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.remote.InterfaceC34401z0;
import hb0.C40908a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: PassportAddProfileInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/domain/interactor/f;", "Lcom/avito/android/passport/profile_add/domain/interactor/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<I50.a> f212322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34401z0> f212323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport_lib.h f212324c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r60.d f212325d;

    @Inject
    public f(@Y61.k h31.e eVar, @Y61.k h31.e eVar2, @Y61.k com.avito.android.passport_lib.h hVar, @Y61.k r60.d dVar) {
        this.f212322a = eVar;
        this.f212323b = eVar2;
        this.f212324c = hVar;
        this.f212325d = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.passport.profile_add.domain.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r10, @Y61.l java.lang.Integer r11, @Y61.k java.lang.String r12, @Y61.k java.lang.String r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.avito.android.passport.profile_add.domain.interactor.e
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.passport.profile_add.domain.interactor.e r0 = (com.avito.android.passport.profile_add.domain.interactor.e) r0
            int r1 = r0.f212321u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212321u = r1
            goto L18
        L13:
            com.avito.android.passport.profile_add.domain.interactor.e r0 = new com.avito.android.passport.profile_add.domain.interactor.e
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.f212319s
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f212321u
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L38
            if (r1 != r8) goto L30
            com.avito.android.remote.model.TypedResult$Success r10 = r0.f212318r
            com.avito.android.passport.profile_add.domain.interactor.f r11 = r0.f212317q
            kotlin.C42729a0.b(r14)
            goto L75
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            com.avito.android.passport.profile_add.domain.interactor.f r10 = r0.f212317q
            kotlin.C42729a0.b(r14)
            r11 = r10
            goto L5c
        L3f:
            kotlin.C42729a0.b(r14)
            h31.e<I50.a> r14 = r9.f212322a
            java.lang.Object r14 = r14.get()
            r1 = r14
            I50.a r1 = (I50.a) r1
            r0.f212317q = r9
            r0.f212321u = r2
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r0
            java.lang.Object r14 = r1.m(r2, r3, r4, r5, r6)
            if (r14 != r7) goto L5b
            return r7
        L5b:
            r11 = r9
        L5c:
            r10 = r14
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r12 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r12 == 0) goto L75
            com.avito.android.passport_lib.h r12 = r11.f212324c
            r0.f212317q = r11
            r13 = r10
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            r0.f212318r = r13
            r0.f212321u = r8
            java.lang.Object r12 = r12.a(r0)
            if (r12 != r7) goto L75
            return r7
        L75:
            boolean r12 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r12 == 0) goto Lac
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            K50.e r10 = (K50.e) r10
            r11.getClass()
            K50.m r11 = r10.getStatus()
            if (r11 == 0) goto L96
            com.avito.android.deep_linking.links.DeepLink r11 = r11.getNextStepLink()
            if (r11 == 0) goto L96
            X50.a$d r10 = new X50.a$d
            r10.<init>(r11)
            goto La5
        L96:
            com.avito.android.deep_linking.links.DeepLink r10 = r10.getUserDialog()
            if (r10 == 0) goto La3
            X50.a$d r11 = new X50.a$d
            r11.<init>(r10)
            r10 = r11
            goto La5
        La3:
            X50.a$e r10 = X50.a.e.f18583a
        La5:
            com.avito.android.remote.model.TypedResult$Success r11 = new com.avito.android.remote.model.TypedResult$Success
            r11.<init>(r10)
            r10 = r11
            goto Lb0
        Lac:
            boolean r11 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r11 == 0) goto Lb1
        Lb0:
            return r10
        Lb1:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.domain.interactor.f.a(int, java.lang.Integer, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.passport.profile_add.domain.interactor.a
    @Y61.l
    public final Object b(@Y61.k Continuation<? super C40908a> continuation) {
        return null;
    }
}
