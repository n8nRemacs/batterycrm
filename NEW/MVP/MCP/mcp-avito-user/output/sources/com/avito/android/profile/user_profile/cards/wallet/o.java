package com.avito.android.profile.user_profile.cards.wallet;

import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.account.E;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.user_profile.items.WalletItem;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.internal.operators.observable.U;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;

/* compiled from: WalletItemDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/o;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/profile/user_profile/cards/wallet/m;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o extends M0 implements m {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34401z0> f225784E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Z1<String> f225785J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C43189o1 f225786K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C43189o1 f225787L;

    /* compiled from: WalletItemDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "updateUrl", "", "isAuthorized"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.wallet.WalletItemViewModel$shouldListenUpdateEvents$1", f = "WalletItemDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<String, Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ String f225788q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ boolean f225789r;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(String str, Boolean bool, Continuation<? super Boolean> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, continuation);
            aVar.f225788q = str;
            aVar.f225789r = zBooleanValue;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return Boxing.boxBoolean(this.f225788q.length() > 0 && this.f225789r);
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.wallet.WalletItemViewModel$special$$inlined$flatMapLatest$1", f = "WalletItemDelegate.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super WalletItem>, Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f225790q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f225791r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f225792s;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super WalletItem> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
            b bVar = o.this.new b(continuation);
            bVar.f225791r = interfaceC43172j;
            bVar.f225792s = bool;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f225790q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f225791r;
                InterfaceC43160i c43210w = ((Boolean) this.f225792s).booleanValue() ? o.this.f225786K : new C43210w(null);
                this.f225790q = 1;
                if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEventBuses.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx0/a;", "EventT", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/clientEventBus/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.clientEventBus.a f225794b;

        public c(com.avito.android.clientEventBus.a aVar) {
            this.f225794b = aVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return p.f225798a[((ConnectionState) obj).ordinal()] == 1 ? this.f225794b.c(Sa0.b.class).l0(q.f225799b) : U.f403867b;
        }
    }

    /* compiled from: WalletItemDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LSa0/b;", "<anonymous parameter 0>", "", "updateUrl", "Lcom/avito/android/remote/model/user_profile/items/WalletItem;", "<anonymous>", "(LSa0/b;Ljava/lang/String;)Lcom/avito/android/remote/model/user_profile/items/WalletItem;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.wallet.WalletItemViewModel$updateEvents$1", f = "WalletItemDelegate.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.q<Sa0.b, String, Continuation<? super WalletItem>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f225795q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ String f225796r;

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(Sa0.b bVar, String str, Continuation<? super WalletItem> continuation) {
            d dVar = o.this.new d(continuation);
            dVar.f225796r = str;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f225795q;
            if (i12 == 0) {
                C42729a0.b(obj);
                String str = this.f225796r;
                this.f225795q = 1;
                obj = o.ke(o.this, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    @Inject
    public o(@Y61.k com.avito.android.clientEventBus.a aVar, @Y61.k h31.e<InterfaceC34401z0> eVar, @Y61.k R0 r02, @Y61.k E e12) {
        this.f225784E = eVar;
        Z1<String> z1A = p2.a("");
        this.f225785J = z1A;
        C1 c12 = new C1(z1A, y.a(e12.g()), new a(3, null));
        this.f225786K = new C43189o1(new C1(y.a(aVar.a().y0(new c(aVar))), z1A, new d(null)));
        kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(C43175k.r(c12), new b(null));
        C43238h c43238hF = kotlinx.coroutines.U.f(N0.a(this), r02.a());
        i2.f411430a.getClass();
        this.f225787L = new C43189o1(C43175k.S(lVarY, c43238hF, i2.a.f411433c, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ke(com.avito.android.profile.user_profile.cards.wallet.o r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.avito.android.profile.user_profile.cards.wallet.n
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.profile.user_profile.cards.wallet.n r0 = (com.avito.android.profile.user_profile.cards.wallet.n) r0
            int r1 = r0.f225783t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f225783t = r1
            goto L1b
        L16:
            com.avito.android.profile.user_profile.cards.wallet.n r0 = new com.avito.android.profile.user_profile.cards.wallet.n
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f225781r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f225783t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.profile.user_profile.cards.wallet.o r4 = r0.f225780q
            kotlin.C42729a0.b(r6)
            goto L4c
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C42729a0.b(r6)
            h31.e<com.avito.android.remote.z0> r6 = r4.f225784E
            java.lang.Object r6 = r6.get()
            com.avito.android.remote.z0 r6 = (com.avito.android.remote.InterfaceC34401z0) r6
            r0.f225780q = r4
            r0.f225783t = r3
            java.lang.Object r6 = r6.u(r5, r0)
            if (r6 != r1) goto L4c
            goto L88
        L4c:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L6c
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            r1 = r5
            com.avito.android.remote.model.user_profile.items.WalletItem r1 = (com.avito.android.remote.model.user_profile.items.WalletItem) r1
            java.lang.String r5 = r1.getUpdateUri()
            if (r5 == 0) goto L88
            int r6 = r5.length()
            if (r6 != 0) goto L68
            goto L88
        L68:
            r4.C2(r5)
            goto L88
        L6c:
            boolean r4 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto L89
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r4 = r6.getError()
            java.lang.Throwable r5 = r6.getCause()
            com.avito.android.util.ApiException r4 = com.avito.android.util.C35936s.a(r4, r5)
            com.avito.android.util.V2 r5 = com.avito.android.util.V2.f318762a
            java.lang.String r6 = "DEFAULT_TAG"
            java.lang.String r0 = "Update wallet error"
            r5.a(r6, r0, r4)
            r1 = 0
        L88:
            return r1
        L89:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.wallet.o.ke(com.avito.android.profile.user_profile.cards.wallet.o, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.m
    public final void C2(@Y61.k String str) {
        this.f225785J.setValue(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.m
    @Y61.k
    /* renamed from: k7, reason: from getter */
    public final C43189o1 getF225787L() {
        return this.f225787L;
    }
}
