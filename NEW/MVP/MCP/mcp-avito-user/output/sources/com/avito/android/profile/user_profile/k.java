package com.avito.android.profile.user_profile;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.profile.generated.api.ProfileApi;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import nF.C44245a;

/* compiled from: UserProfileInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/k;", "Lcom/avito/android/profile/user_profile/j;", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34401z0> f226156a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<ProfileApi> f226157b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.active_orders.j f226158c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33369d f226159d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.wallet.finance_dynamic.d f226160e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.service_booking.a f226161f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.wallet.d f226162g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final gD.f f226163h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C44245a f226164i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.converter.f f226165j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final R0 f226166k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final N90.p f226167l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Bw0.i f226168m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.silent_update.c f226169n;

    /* compiled from: UserProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/profile/user_profile/k$a;", "", "<init>", "()V", "", "BANNER_PAGE", "Ljava/lang/String;", "BANNER_PLATFORM", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public k(@Y61.k h31.e<InterfaceC34401z0> eVar, @Y61.k h31.e<ProfileApi> eVar2, @Y61.k com.avito.android.profile.user_profile.cards.active_orders.j jVar, @Y61.k InterfaceC33369d interfaceC33369d, @Y61.k com.avito.android.profile.user_profile.cards.wallet.finance_dynamic.d dVar, @Y61.k com.avito.android.profile.user_profile.cards.service_booking.a aVar, @Y61.k com.avito.android.profile.user_profile.cards.wallet.d dVar2, @Y61.k gD.f fVar, @Y61.k C44245a c44245a, @Y61.k com.avito.android.photo_picker.converter.f fVar2, @Y61.k R0 r02, @Y61.k N90.p pVar, @Y61.k Bw0.i iVar, @Y61.k com.avito.android.profile.user_profile.cards.silent_update.c cVar) {
        this.f226156a = eVar;
        this.f226157b = eVar2;
        this.f226158c = jVar;
        this.f226159d = interfaceC33369d;
        this.f226160e = dVar;
        this.f226161f = aVar;
        this.f226162g = dVar2;
        this.f226163h = fVar;
        this.f226164i = c44245a;
        this.f226165j = fVar2;
        this.f226166k = r02;
        this.f226167l = pVar;
        this.f226168m = iVar;
        this.f226169n = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0119 A[PHI: r10
  0x0119: PHI (r10v6 java.lang.String) = (r10v5 java.lang.String), (r10v9 java.lang.String) binds: [B:51:0x0127, B:47:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.profile.user_profile.cards.CardItem.SilentUpdateItem a(com.avito.android.profile.user_profile.k r10, Zk0.f r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.k.a(com.avito.android.profile.user_profile.k, Zk0.f):com.avito.android.profile.user_profile.cards.CardItem$SilentUpdateItem");
    }

    @Override // com.avito.android.profile.user_profile.j
    @Y61.l
    public final Object b(@Y61.k Continuation<? super Avatar> continuation) {
        return this.f226156a.get().b(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile.user_profile.j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.profile.user_profile.l
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.profile.user_profile.l r0 = (com.avito.android.profile.user_profile.l) r0
            int r1 = r0.f226172s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226172s = r1
            goto L18
        L13:
            com.avito.android.profile.user_profile.l r0 = new com.avito.android.profile.user_profile.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f226170q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f226172s
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
            h31.e<com.avito.android.remote.z0> r5 = r4.f226156a
            java.lang.Object r5 = r5.get()
            com.avito.android.remote.z0 r5 = (com.avito.android.remote.InterfaceC34401z0) r5
            r0.f226172s = r3
            java.lang.Object r5 = r5.w(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L58
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            com.avito.android.remote.model.user_profile.PhonesList r5 = (com.avito.android.remote.model.user_profile.PhonesList) r5
            java.util.List r5 = r5.getPhones()
            return r5
        L58:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L6b
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r0, r5)
            throw r5
        L6b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.k.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile.user_profile.j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k android.net.Uri r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.profile.user_profile.o
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.profile.user_profile.o r0 = (com.avito.android.profile.user_profile.o) r0
            int r1 = r0.f226555t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226555t = r1
            goto L18
        L13:
            com.avito.android.profile.user_profile.o r0 = new com.avito.android.profile.user_profile.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f226553r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f226555t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.avito.android.profile.user_profile.k r6 = r0.f226552q
            kotlin.C42729a0.b(r7)
            goto L53
        L3a:
            kotlin.C42729a0.b(r7)
            r0.f226552q = r5
            r0.f226555t = r4
            com.avito.android.photo_picker.converter.f r7 = r5.f226165j
            io.reactivex.rxjava3.core.z r6 = r7.a(r6)
            io.reactivex.rxjava3.internal.operators.observable.T r6 = r6.S()
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.b(r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r6 = r5
        L53:
            java.io.File r7 = (java.io.File) r7
            r2 = 3
            okhttp3.MultipartBody$Part r7 = com.avito.http.b.a(r7, r2)
            h31.e<com.avito.android.remote.z0> r6 = r6.f226156a
            java.lang.Object r6 = r6.get()
            com.avito.android.remote.z0 r6 = (com.avito.android.remote.InterfaceC34401z0) r6
            r2 = 0
            r0.f226552q = r2
            r0.f226555t = r3
            java.lang.Object r7 = r6.l(r7, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.k.d(android.net.Uri, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.profile.user_profile.j
    @Y61.l
    public final Object e(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super G0> continuation) {
        Object objC = this.f226156a.get().c(str, str2, "settings", continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    @Override // com.avito.android.profile.user_profile.j
    @Y61.l
    public final Object f(@Y61.k Continuation continuation) {
        Object objK = this.f226156a.get().k(null, 0, continuation);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : G0.f406611a;
    }

    @Override // com.avito.android.profile.user_profile.j
    @Y61.k
    public final C43152f0 o(boolean z12) {
        return new C43152f0(C43175k.I(this.f226166k.a(), C43175k.G(new m(z12, this, null))), new n(3, null));
    }
}
