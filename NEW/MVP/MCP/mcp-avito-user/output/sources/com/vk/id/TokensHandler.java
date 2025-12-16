package com.vk.id;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.id.fetchuser.VKIDUserInfoFetcher;
import com.vk.id.internal.auth.VKIDTokenPayload;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: TokensHandler.kt */
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJZ\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/TokensHandler;", "", "Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;", "userInfoFetcher", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "<init>", "(Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;Lcom/vk/id/storage/InternalVKIDTokenStorage;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;)V", "Lcom/vk/id/internal/auth/VKIDTokenPayload;", "payload", "Lkotlin/Function2;", "Lcom/vk/id/AccessToken;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "onSuccess", "Lkotlin/Function1;", "", "onFailedApiCall", "", "refreshAccessToken", "handle", "(Lcom/vk/id/internal/auth/VKIDTokenPayload;LY41/p;LY41/l;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TokensHandler {

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final InternalVKIDTokenStorage tokenStorage;

    @k
    private final VKIDUserInfoFetcher userInfoFetcher;

    /* compiled from: TokensHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/VKIDUser;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/vk/id/VKIDUser;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.TokensHandler$handle$2", f = "TokensHandler.kt", i = {0, 1}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 42, 46}, m = "invokeSuspend", n = {"scopes", "accessToken"}, s = {"L$0", "L$0"})
    /* renamed from: com.vk.id.TokensHandler$handle$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<VKIDUser, Continuation<? super G0>, Object> {
        final /* synthetic */ p<AccessToken, Continuation<? super G0>, Object> $onSuccess;
        final /* synthetic */ VKIDTokenPayload $payload;
        final /* synthetic */ boolean $refreshAccessToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TokensHandler this$0;

        /* compiled from: TokensHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.vk.id.TokensHandler$handle$2$1", f = "TokensHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.vk.id.TokensHandler$handle$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            final /* synthetic */ AccessToken $accessToken;
            final /* synthetic */ boolean $refreshAccessToken;
            final /* synthetic */ RefreshToken $refreshToken;
            int label;
            final /* synthetic */ TokensHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z12, TokensHandler tokensHandler, AccessToken accessToken, RefreshToken refreshToken, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$refreshAccessToken = z12;
                this.this$0 = tokensHandler;
                this.$accessToken = accessToken;
                this.$refreshToken = refreshToken;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$refreshAccessToken, this.this$0, this.$accessToken, this.$refreshToken, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                if (this.$refreshAccessToken) {
                    this.this$0.tokenStorage.setAccessToken$vkid_release(this.$accessToken);
                }
                this.this$0.tokenStorage.setRefreshToken$vkid_release(this.$refreshToken);
                return G0.f406611a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((AnonymousClass1) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(VKIDTokenPayload vKIDTokenPayload, TokensHandler tokensHandler, p<? super AccessToken, ? super Continuation<? super G0>, ? extends Object> pVar, boolean z12, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$payload = vKIDTokenPayload;
            this.this$0 = tokensHandler;
            this.$onSuccess = pVar;
            this.$refreshAccessToken = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$payload, this.this$0, this.$onSuccess, this.$refreshAccessToken, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Y41.p
        public final Object invoke(VKIDUser vKIDUser, Continuation<? super G0> continuation) {
            return ((AnonymousClass2) create(vKIDUser, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                r0 = 1
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r13.label
                r3 = 3
                r4 = 2
                if (r2 == 0) goto L2f
                if (r2 == r0) goto L27
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                kotlin.C42729a0.b(r14)
                goto Laf
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                java.lang.Object r0 = r13.L$0
                com.vk.id.AccessToken r0 = (com.vk.id.AccessToken) r0
                kotlin.C42729a0.b(r14)
                goto La1
            L27:
                java.lang.Object r0 = r13.L$0
                java.util.Set r0 = (java.util.Set) r0
                kotlin.C42729a0.b(r14)
                goto L72
            L2f:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.L$0
                r8 = r14
                com.vk.id.VKIDUser r8 = (com.vk.id.VKIDUser) r8
                com.vk.id.internal.auth.VKIDTokenPayload r14 = r13.$payload
                java.lang.String r14 = r14.getScope()
                char[] r2 = new char[r0]
                r5 = 32
                r6 = 0
                r2[r6] = r5
                java.util.List r14 = kotlin.text.C43066x.e0(r14, r2)
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.Set r14 = kotlin.collections.C42745f0.P0(r14)
                com.vk.id.TokensHandler r2 = r13.this$0
                com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers r2 = com.vk.id.TokensHandler.access$getDispatchers$p(r2)
                kotlinx.coroutines.M r2 = r2.getIo()
                com.vk.id.TokensHandler$handle$2$accessToken$1 r11 = new com.vk.id.TokensHandler$handle$2$accessToken$1
                com.vk.id.internal.auth.VKIDTokenPayload r6 = r13.$payload
                com.vk.id.TokensHandler r7 = r13.this$0
                r10 = 0
                r5 = r11
                r9 = r14
                r5.<init>(r6, r7, r8, r9, r10)
                r13.L$0 = r14
                r13.label = r0
                java.lang.Object r0 = kotlinx.coroutines.C43259k.g(r2, r11, r13)
                if (r0 != r1) goto L6f
                return r1
            L6f:
                r12 = r0
                r0 = r14
                r14 = r12
            L72:
                com.vk.id.AccessToken r14 = (com.vk.id.AccessToken) r14
                com.vk.id.RefreshToken r9 = new com.vk.id.RefreshToken
                com.vk.id.internal.auth.VKIDTokenPayload r2 = r13.$payload
                java.lang.String r2 = r2.getRefreshToken()
                r9.<init>(r2, r0)
                com.vk.id.TokensHandler r0 = r13.this$0
                com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers r0 = com.vk.id.TokensHandler.access$getDispatchers$p(r0)
                kotlinx.coroutines.M r0 = r0.getIo()
                com.vk.id.TokensHandler$handle$2$1 r2 = new com.vk.id.TokensHandler$handle$2$1
                boolean r6 = r13.$refreshAccessToken
                com.vk.id.TokensHandler r7 = r13.this$0
                r10 = 0
                r5 = r2
                r8 = r14
                r5.<init>(r6, r7, r8, r9, r10)
                r13.L$0 = r14
                r13.label = r4
                java.lang.Object r0 = kotlinx.coroutines.C43259k.g(r0, r2, r13)
                if (r0 != r1) goto La0
                return r1
            La0:
                r0 = r14
            La1:
                Y41.p<com.vk.id.AccessToken, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r14 = r13.$onSuccess
                r2 = 0
                r13.L$0 = r2
                r13.label = r3
                java.lang.Object r14 = r14.invoke(r0, r13)
                if (r14 != r1) goto Laf
                return r1
            Laf:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.id.TokensHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TokensHandler(@k VKIDUserInfoFetcher vKIDUserInfoFetcher, @k InternalVKIDTokenStorage internalVKIDTokenStorage, @k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers) {
        this.userInfoFetcher = vKIDUserInfoFetcher;
        this.tokenStorage = internalVKIDTokenStorage;
        this.dispatchers = vKIDCoroutinesDispatchers;
    }

    public static /* synthetic */ Object handle$default(TokensHandler tokensHandler, VKIDTokenPayload vKIDTokenPayload, p pVar, l lVar, boolean z12, Continuation continuation, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z12 = true;
        }
        return tokensHandler.handle(vKIDTokenPayload, pVar, lVar, z12, continuation);
    }

    @Y61.l
    public final Object handle(@k VKIDTokenPayload vKIDTokenPayload, @k p<? super AccessToken, ? super Continuation<? super G0>, ? extends Object> pVar, @k l<? super Throwable, G0> lVar, boolean z12, @k Continuation<? super G0> continuation) {
        Object objFetch = this.userInfoFetcher.fetch(vKIDTokenPayload.getAccessToken(), new AnonymousClass2(vKIDTokenPayload, this, pVar, z12, null), lVar, continuation);
        return objFetch == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFetch : G0.f406611a;
    }
}
