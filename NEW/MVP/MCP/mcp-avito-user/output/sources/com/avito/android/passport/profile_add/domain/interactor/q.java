package com.avito.android.passport.profile_add.domain.interactor;

import Za0.InterfaceC19524a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.remote.A1;
import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/domain/interactor/q;", "Lcom/avito/android/passport/profile_add/domain/interactor/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements com.avito.android.passport.profile_add.domain.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f212356a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A1 f212357b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC19524a> f212358c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ProfileCreateExtendedFlow f212359d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f212360e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final r60.d f212361f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f212362g;

    /* compiled from: VerificationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.passport.profile_add.domain.interactor.VerificationInteractor", f = "VerificationInteractor.kt", i = {}, l = {93}, m = "getExtendedProfileInfo", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f212363q;

        /* renamed from: s, reason: collision with root package name */
        public int f212365s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f212363q = obj;
            this.f212365s |= BeduinInputModel.MIN_TEXT_VERSION;
            return q.this.b(this);
        }
    }

    @Inject
    public q(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k A1 a12, @Y61.k h31.e<InterfaceC19524a> eVar, @Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k r60.d dVar) {
        this.f212356a = interfaceC34401z0;
        this.f212357b = a12;
        this.f212358c = eVar;
        this.f212359d = profileCreateExtendedFlow;
        this.f212360e = interfaceC28373a;
        this.f212361f = dVar;
        this.f212362g = profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.INN ? ((ProfileCreateExtendedFlow.Verification.INN) profileCreateExtendedFlow).f211179e : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.TinkoffID ? ((ProfileCreateExtendedFlow.Verification.TinkoffID) profileCreateExtendedFlow).f211183e : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.SberID ? ((ProfileCreateExtendedFlow.Verification.SberID) profileCreateExtendedFlow).f211181e : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.passport.profile_add.domain.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r11, @Y61.l java.lang.Integer r12, @Y61.k java.lang.String r13, @Y61.k java.lang.String r14, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.domain.interactor.q.a(int, java.lang.Integer, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.passport.profile_add.domain.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.Continuation<? super hb0.C40908a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.passport.profile_add.domain.interactor.q.a
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.passport.profile_add.domain.interactor.q$a r0 = (com.avito.android.passport.profile_add.domain.interactor.q.a) r0
            int r1 = r0.f212365s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212365s = r1
            goto L1a
        L13:
            com.avito.android.passport.profile_add.domain.interactor.q$a r0 = new com.avito.android.passport.profile_add.domain.interactor.q$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r5 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r5
            r0.<init>(r5)
        L1a:
            java.lang.Object r5 = r0.f212363q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f212365s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            h31.e<Za0.a> r5 = r4.f212358c
            java.lang.Object r5 = r5.get()
            Za0.a r5 = (Za0.InterfaceC19524a) r5
            r0.f212365s = r3
            java.lang.String r2 = r4.f212362g
            java.lang.Object r5 = r5.f(r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L58
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            hb0.a r5 = (hb0.C40908a) r5
            goto L5d
        L58:
            boolean r5 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L5e
            r5 = 0
        L5d:
            return r5
        L5e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.domain.interactor.q.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
