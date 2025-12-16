package com.vk.id.internal.auth.app;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: TrustedProvidersCache.kt */
@P
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/app/TrustedProvidersCache;", "", "Lkotlin/C;", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "", "clientId", "clientSecret", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "<init>", "(Lkotlin/C;Ljava/lang/String;Ljava/lang/String;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;)V", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "fetchSilentAuthProvidersSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSilentAuthProviders", "Lkotlin/C;", "Ljava/lang/String;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "cachedTrustedProviders", "Ljava/util/List;", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrustedProvidersCache {
    public static final int $stable;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    @k
    private static final List<VkAuthSilentAuthProvider> DEFAULT_TRUSTED_PROVIDERS;

    @k
    private final InterfaceC42726C<VKIDApiService> api;

    @l
    private List<VkAuthSilentAuthProvider> cachedTrustedProviders;

    @k
    private final String clientId;

    @k
    private final String clientSecret;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    /* compiled from: TrustedProvidersCache.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/vk/id/internal/auth/app/TrustedProvidersCache$Companion;", "", "<init>", "()V", "RELEASE_APP_SHA", "", "DEBUG_APP_SHA", "DEFAULT_TRUSTED_PROVIDERS", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "createBaseProviders", "appPackage", "weight", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<VkAuthSilentAuthProvider> createBaseProviders(String appPackage, int weight) {
            return C42745f0.U(new VkAuthSilentAuthProvider(appPackage, "48761eef50ee53afc4cc9c5f10e6bde7f8f5b82f", weight), new VkAuthSilentAuthProvider(appPackage, "86259288a43f6c409a922bc3ce40ba08085bbadb", weight));
        }

        private Companion() {
        }
    }

    /* compiled from: TrustedProvidersCache.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.internal.auth.app.TrustedProvidersCache", f = "TrustedProvidersCache.kt", i = {0}, l = {54}, m = "fetchSilentAuthProvidersSync", n = {"this"}, s = {"L$0"})
    /* renamed from: com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return TrustedProvidersCache.this.fetchSilentAuthProvidersSync(this);
        }
    }

    /* compiled from: TrustedProvidersCache.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Z;", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Z;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$2", f = "TrustedProvidersCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super Z<? extends List<? extends VkAuthSilentAuthProvider>>>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return TrustedProvidersCache.this.new AnonymousClass2(continuation);
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ Object invoke(T t12, Continuation<? super Z<? extends List<? extends VkAuthSilentAuthProvider>>> continuation) {
            return invoke2(t12, (Continuation<? super Z<? extends List<VkAuthSilentAuthProvider>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return Z.a(((VKIDApiService) TrustedProvidersCache.this.api.getValue()).getSilentAuthProviders(TrustedProvidersCache.this.clientId, TrustedProvidersCache.this.clientSecret).mo119executed1pmJ48());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t12, Continuation<? super Z<? extends List<VkAuthSilentAuthProvider>>> continuation) {
            return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        $stable = 8;
        DEFAULT_TRUSTED_PROVIDERS = C42745f0.H(C42745f0.U(companion.createBaseProviders("com.vkontakte.android", 3), companion.createBaseProviders("com.vk.im", 2), companion.createBaseProviders("com.vk.calls", 1)));
    }

    public TrustedProvidersCache(@k InterfaceC42726C<VKIDApiService> interfaceC42726C, @k String str, @k String str2, @k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers) {
        this.api = interfaceC42726C;
        this.clientId = str;
        this.clientSecret = str2;
        this.dispatchers = vKIDCoroutinesDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSilentAuthProvidersSync(kotlin.coroutines.Continuation<? super java.util.List<com.vk.id.internal.auth.app.VkAuthSilentAuthProvider>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.vk.id.internal.auth.app.TrustedProvidersCache.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$1 r0 = (com.vk.id.internal.auth.app.TrustedProvidersCache.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$1 r0 = new com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            com.vk.id.internal.auth.app.TrustedProvidersCache r0 = (com.vk.id.internal.auth.app.TrustedProvidersCache) r0
            kotlin.C42729a0.b(r6)
            goto L50
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.C42729a0.b(r6)
            com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers r6 = r5.dispatchers
            kotlinx.coroutines.M r6 = r6.getIo()
            com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$2 r2 = new com.vk.id.internal.auth.app.TrustedProvidersCache$fetchSilentAuthProvidersSync$2
            r2.<init>(r3)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r6, r2, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r5
        L50:
            kotlin.Z r6 = (kotlin.Z) r6
            java.lang.Object r6 = r6.f406625b
            boolean r1 = r6 instanceof kotlin.Z.b
            if (r1 == 0) goto L59
            goto L5a
        L59:
            r3 = r6
        L5a:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L60
            kotlin.collections.z0 r3 = kotlin.collections.C42784z0.f406748b
        L60:
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List<com.vk.id.internal.auth.app.VkAuthSilentAuthProvider> r6 = com.vk.id.internal.auth.app.TrustedProvidersCache.DEFAULT_TRUSTED_PROVIDERS
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r6 = kotlin.collections.C42745f0.h0(r6, r3)
            r0.cachedTrustedProviders = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.internal.auth.app.TrustedProvidersCache.fetchSilentAuthProvidersSync(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @l
    public final Object getSilentAuthProviders(@k Continuation<? super List<VkAuthSilentAuthProvider>> continuation) {
        List<VkAuthSilentAuthProvider> list = this.cachedTrustedProviders;
        return list == null ? fetchSilentAuthProvidersSync(continuation) : list;
    }
}
