package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain;

import Wl0.InterfaceC15774a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import h31.e;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/domain/b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/domain/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC15774a> f313855a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f313856b;

    /* compiled from: UserAdvertsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/domain/UserAdvertsShortcuts;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsInteractorImpl$shortcuts$1", f = "UserAdvertsInteractor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<UserAdvertsShortcuts>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313857q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f313858r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f313858r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<UserAdvertsShortcuts>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313857q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f313858r;
                this.f313858r = interfaceC43172j;
                this.f313857q = 1;
                obj = b.b(b.this, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f313858r;
                C42729a0.b(obj);
            }
            this.f313858r = null;
            this.f313857q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k R0 r02, @k e eVar) {
        this.f313855a = eVar;
        this.f313856b = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.b r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.c
            if (r0 == 0) goto L16
            r0 = r5
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.c r0 = (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.c) r0
            int r1 = r0.f313862s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f313862s = r1
            goto L1b
        L16:
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.c r0 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.c
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f313860q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f313862s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r5)
            goto L48
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.C42729a0.b(r5)
            h31.e<Wl0.a> r4 = r4.f313855a
            java.lang.Object r4 = r4.get()
            Wl0.a r4 = (Wl0.InterfaceC15774a) r4
            r0.f313862s = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L48
            goto L9e
        L48:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r4 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r4 == 0) goto L99
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r4 = r5.getResult()
            am0.a r4 = (am0.C19910a) r4
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C42745f0.q(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L6b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r4.next()
            am0.b r0 = (am0.C19911b) r0
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts$Shortcut r1 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts$Shortcut
            long r2 = r0.getCount()
            int r2 = (int) r2
            java.lang.String r3 = r0.getShortcut()
            java.lang.String r0 = r0.getTitle()
            r1.<init>(r2, r3, r0)
            r5.add(r1)
            goto L6b
        L8d:
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts r4 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts
            r4.<init>(r5)
            com.avito.android.remote.model.TypedResult$Success r5 = new com.avito.android.remote.model.TypedResult$Success
            r5.<init>(r4)
        L97:
            r1 = r5
            goto L9e
        L99:
            boolean r4 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto L9f
            goto L97
        L9e:
            return r1
        L9f:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.b.b(com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.a
    @k
    public final InterfaceC43160i<TypedResult<UserAdvertsShortcuts>> a() {
        return C43175k.I(this.f313856b.a(), C43175k.G(new a(null)));
    }
}
