package com.vk.id.internal.user;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.vk.id.VKIDUser;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.id.internal.util.TimeKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.d;

/* compiled from: UserDataFetcher.kt */
@P
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vk/id/internal/user/UserDataFetcher;", "", "dispatchers", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "serviceCredentials", "Lcom/vk/id/internal/auth/ServiceCredentials;", "vkSilentAuthInfoProvider", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "<init>", "(Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;)V", "fetchUserData", "Lcom/vk/id/VKIDUser;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "CachedUserWithTimeFetched", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserDataFetcher {

    @l
    private static CachedUserWithTimeFetched cachedUserData;

    @k
    private final VKIDCoroutinesDispatchers dispatchers;

    @k
    private final ServiceCredentials serviceCredentials;

    @k
    private final SilentAuthInfoProvider vkSilentAuthInfoProvider;

    @k
    private static final a fetchUserMutex = new d();

    /* compiled from: UserDataFetcher.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/vk/id/internal/user/UserDataFetcher$CachedUserWithTimeFetched;", "", "Lcom/vk/id/VKIDUser;", "data", "", "timeFetched", "<init>", "(Lcom/vk/id/VKIDUser;J)V", "Lcom/vk/id/VKIDUser;", "getData", "()Lcom/vk/id/VKIDUser;", "J", "getTimeFetched", "()J", "", "isValid", "()Z", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CachedUserWithTimeFetched {

        @l
        private final VKIDUser data;
        private final long timeFetched;

        public CachedUserWithTimeFetched(@l VKIDUser vKIDUser, long j12) {
            this.data = vKIDUser;
            this.timeFetched = j12;
        }

        @l
        public final VKIDUser getData() {
            return this.data;
        }

        public final boolean isValid() {
            return TimeKt.currentTime() - this.timeFetched <= 500;
        }

        public /* synthetic */ CachedUserWithTimeFetched(VKIDUser vKIDUser, long j12, int i12, C42822w c42822w) {
            this(vKIDUser, (i12 & 2) != 0 ? TimeKt.currentTime() : j12);
        }
    }

    /* compiled from: UserDataFetcher.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.internal.user.UserDataFetcher", f = "UserDataFetcher.kt", i = {0, 0, 1}, l = {55, 35}, m = "fetchUserData", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: com.vk.id.internal.user.UserDataFetcher$fetchUserData$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
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
            return UserDataFetcher.this.fetchUserData(this);
        }
    }

    public UserDataFetcher(@k VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers, @k ServiceCredentials serviceCredentials, @k SilentAuthInfoProvider silentAuthInfoProvider) {
        this.dispatchers = vKIDCoroutinesDispatchers;
        this.serviceCredentials = serviceCredentials;
        this.vkSilentAuthInfoProvider = silentAuthInfoProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:37:0x008e, B:39:0x0092, B:41:0x0098), top: B:46:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUserData(@Y61.k kotlin.coroutines.Continuation<? super com.vk.id.VKIDUser> r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.vk.id.internal.user.UserDataFetcher.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            com.vk.id.internal.user.UserDataFetcher$fetchUserData$1 r0 = (com.vk.id.internal.user.UserDataFetcher.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vk.id.internal.user.UserDataFetcher$fetchUserData$1 r0 = new com.vk.id.internal.user.UserDataFetcher$fetchUserData$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.sync.a r0 = (kotlinx.coroutines.sync.a) r0
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Throwable -> L31
            goto L8e
        L31:
            r14 = move-exception
            goto La9
        L34:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3c:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.a) r2
            java.lang.Object r4 = r0.L$0
            com.vk.id.internal.user.UserDataFetcher r4 = (com.vk.id.internal.user.UserDataFetcher) r4
            kotlin.C42729a0.b(r14)
            r14 = r2
            goto L5c
        L49:
            kotlin.C42729a0.b(r14)
            kotlinx.coroutines.sync.a r14 = com.vk.id.internal.user.UserDataFetcher.fetchUserMutex
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r2 = r14.b(r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r13
        L5c:
            com.vk.id.internal.user.UserDataFetcher$CachedUserWithTimeFetched r2 = com.vk.id.internal.user.UserDataFetcher.cachedUserData     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L73
            boolean r6 = r2.isValid()     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L73
            com.vk.id.VKIDUser r0 = r2.getData()     // Catch: java.lang.Throwable -> L6e
            r14.d(r5)
            return r0
        L6e:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto La9
        L73:
            com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers r2 = r4.dispatchers     // Catch: java.lang.Throwable -> L6e
            kotlinx.coroutines.M r2 = r2.getIo()     // Catch: java.lang.Throwable -> L6e
            com.vk.id.internal.user.UserDataFetcher$fetchUserData$2$info$1 r6 = new com.vk.id.internal.user.UserDataFetcher$fetchUserData$2$info$1     // Catch: java.lang.Throwable -> L6e
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6e
            r0.L$0 = r14     // Catch: java.lang.Throwable -> L6e
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L6e
            r0.label = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = kotlinx.coroutines.C43259k.g(r2, r6, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != r1) goto L8b
            return r1
        L8b:
            r12 = r0
            r0 = r14
            r14 = r12
        L8e:
            com.vk.silentauth.SilentAuthInfo r14 = (com.vk.silentauth.SilentAuthInfo) r14     // Catch: java.lang.Throwable -> L31
            if (r14 == 0) goto L97
            com.vk.id.VKIDUser r14 = com.vk.id.VKIDUserKt.toVKIDUser(r14)     // Catch: java.lang.Throwable -> L31
            goto L98
        L97:
            r14 = r5
        L98:
            com.vk.id.internal.user.UserDataFetcher$CachedUserWithTimeFetched r1 = new com.vk.id.internal.user.UserDataFetcher$CachedUserWithTimeFetched     // Catch: java.lang.Throwable -> L31
            r11 = 0
            r8 = 0
            r10 = 2
            r6 = r1
            r7 = r14
            r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L31
            com.vk.id.internal.user.UserDataFetcher.cachedUserData = r1     // Catch: java.lang.Throwable -> L31
            r0.d(r5)
            return r14
        La9:
            r0.d(r5)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.internal.user.UserDataFetcher.fetchUserData(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
