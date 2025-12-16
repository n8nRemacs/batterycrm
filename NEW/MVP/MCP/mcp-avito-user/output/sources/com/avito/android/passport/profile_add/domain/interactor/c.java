package com.avito.android.passport.profile_add.domain.interactor;

import Za0.InterfaceC19524a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendProfileInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/domain/interactor/c;", "Lcom/avito/android/passport/profile_add/domain/interactor/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.passport.profile_add.domain.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f212306a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC19524a> f212307b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ProfileCreateExtendedFlow f212308c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r60.d f212309d;

    /* compiled from: ExtendProfileInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.passport.profile_add.domain.interactor.ExtendProfileInteractor", f = "ExtendProfileInteractor.kt", i = {}, l = {49}, m = "getExtendedProfileInfo", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f212310q;

        /* renamed from: s, reason: collision with root package name */
        public int f212312s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f212310q = obj;
            this.f212312s |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.b(this);
        }
    }

    @Inject
    public c(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k h31.e<InterfaceC19524a> eVar, @Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow, @Y61.k r60.d dVar) {
        this.f212306a = interfaceC34401z0;
        this.f212307b = eVar;
        this.f212308c = profileCreateExtendedFlow;
        this.f212309d = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.passport.profile_add.domain.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, @Y61.l java.lang.Integer r9, @Y61.k java.lang.String r10, @Y61.k java.lang.String r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r11 = r12 instanceof com.avito.android.passport.profile_add.domain.interactor.b
            if (r11 == 0) goto L14
            r11 = r12
            com.avito.android.passport.profile_add.domain.interactor.b r11 = (com.avito.android.passport.profile_add.domain.interactor.b) r11
            int r0 = r11.f212305t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r11.f212305t = r0
        L12:
            r6 = r11
            goto L1a
        L14:
            com.avito.android.passport.profile_add.domain.interactor.b r11 = new com.avito.android.passport.profile_add.domain.interactor.b
            r11.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f212303r
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.f212305t
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            com.avito.android.passport.profile_add.domain.interactor.c r8 = r6.f212302q
            kotlin.C42729a0.b(r11)
            goto L4e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r11)
            com.avito.android.passport.profile_add.ProfileCreateExtendedFlow r11 = r7.f212308c
            java.lang.String r5 = r11.f211170b
            r6.f212302q = r7
            r6.f212305t = r1
            com.avito.android.remote.z0 r0 = r7.f212306a
            r4 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r11 = r0.v(r1, r2, r3, r4, r5, r6)
            if (r11 != r12) goto L4d
            return r12
        L4d:
            r8 = r7
        L4e:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r9 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L85
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r9 = r11.getResult()
            com.avito.android.remote.model.CreateExtendedProfileResult r9 = (com.avito.android.remote.model.CreateExtendedProfileResult) r9
            r8.getClass()
            boolean r8 = r9 instanceof com.avito.android.remote.model.CreateExtendedProfileResult.Ok
            if (r8 == 0) goto L66
            X50.a$b r8 = X50.a.b.f18579a
            goto L79
        L66:
            boolean r8 = r9 instanceof com.avito.android.remote.model.CreateExtendedProfileResult.NeedVerification
            if (r8 == 0) goto L7f
            X50.a$c r8 = new X50.a$c
            com.avito.android.remote.model.CreateExtendedProfileResult$NeedVerification r9 = (com.avito.android.remote.model.CreateExtendedProfileResult.NeedVerification) r9
            com.avito.android.deep_linking.links.DeepLink r10 = r9.getVerificationDeeplink()
            com.avito.android.remote.model.VerificationDisclaimer r9 = r9.getVerificationDisclaimer()
            r8.<init>(r10, r9)
        L79:
            com.avito.android.remote.model.TypedResult$Success r11 = new com.avito.android.remote.model.TypedResult$Success
            r11.<init>(r8)
            goto L89
        L7f:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L85:
            boolean r8 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto L8a
        L89:
            return r11
        L8a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.domain.interactor.c.a(int, java.lang.Integer, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.passport.profile_add.domain.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.Continuation<? super hb0.C40908a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.passport.profile_add.domain.interactor.c.a
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.passport.profile_add.domain.interactor.c$a r0 = (com.avito.android.passport.profile_add.domain.interactor.c.a) r0
            int r1 = r0.f212312s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212312s = r1
            goto L1a
        L13:
            com.avito.android.passport.profile_add.domain.interactor.c$a r0 = new com.avito.android.passport.profile_add.domain.interactor.c$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f212310q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f212312s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.C42729a0.b(r6)
            goto L48
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C42729a0.b(r6)
            h31.e<Za0.a> r6 = r5.f212307b
            java.lang.Object r6 = r6.get()
            Za0.a r6 = (Za0.InterfaceC19524a) r6
            r0.f212312s = r4
            java.lang.Object r6 = r6.f(r3, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L58
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            r3 = r6
            hb0.a r3 = (hb0.C40908a) r3
            goto L5c
        L58:
            boolean r6 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r6 == 0) goto L5d
        L5c:
            return r3
        L5d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.domain.interactor.c.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
