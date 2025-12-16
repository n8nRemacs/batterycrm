package com.avito.android.profile_settings_basic;

import android.net.Uri;
import com.avito.android.profile_settings_basic.InterfaceC33465j;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.basic.AvatarUploadResult;
import java.io.File;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.t1;
import okhttp3.MultipartBody;

/* compiled from: AvatarInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_basic/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.AvatarInteractorImpl$uploadAvatar$1", f = "AvatarInteractor.kt", i = {0}, l = {51, 52}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.profile_settings_basic.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33462g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC33465j>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228831q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228832r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33461f f228833s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Uri f228834t;

    /* compiled from: AvatarInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.AvatarInteractorImpl$uploadAvatar$1$1", f = "AvatarInteractor.kt", i = {0, 3}, l = {54, 60, 62, 75, 78}, m = "invokeSuspend", n = {"$this$supervisorScope", "error"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.profile_settings_basic.g$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228835q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f228836r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C33461f f228837s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Uri f228838t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InterfaceC33465j> f228839u;

        /* compiled from: AvatarInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/basic/AvatarUploadResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_settings_basic.AvatarInteractorImpl$uploadAvatar$1$1$deferred$1", f = "AvatarInteractor.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.profile_settings_basic.g$a$a, reason: collision with other inner class name */
        public static final class C6964a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<AvatarUploadResult>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f228840q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C33461f f228841r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ File f228842s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6964a(C33461f c33461f, File file, Continuation<? super C6964a> continuation) {
                super(2, continuation);
                this.f228841r = c33461f;
                this.f228842s = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C6964a(this.f228841r, this.f228842s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<AvatarUploadResult>> continuation) {
                return ((C6964a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f228840q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    D0 d02 = this.f228841r.f228811a.get();
                    MultipartBody.Part partA = com.avito.http.b.a(this.f228842s, 3);
                    this.f228840q = 1;
                    obj = d02.d(partA, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C33461f c33461f, Uri uri, InterfaceC43172j<? super InterfaceC33465j> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f228837s = c33461f;
            this.f228838t = uri;
            this.f228839u = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f228837s, this.f228838t, this.f228839u, continuation);
            aVar.f228836r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:16:0x0036, B:28:0x0083, B:30:0x0089, B:32:0x009c, B:34:0x00a2, B:36:0x00b5, B:37:0x00b7, B:39:0x00c9, B:41:0x00cf, B:44:0x00db, B:47:0x00e0, B:48:0x00eb, B:19:0x003e, B:25:0x005f, B:22:0x004a), top: B:61:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:16:0x0036, B:28:0x0083, B:30:0x0089, B:32:0x009c, B:34:0x00a2, B:36:0x00b5, B:37:0x00b7, B:39:0x00c9, B:41:0x00cf, B:44:0x00db, B:47:0x00e0, B:48:0x00eb, B:19:0x003e, B:25:0x005f, B:22:0x004a), top: B:61:0x000c }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_basic.C33462g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33462g(C33461f c33461f, Uri uri, Continuation<? super C33462g> continuation) {
        super(2, continuation);
        this.f228833s = c33461f;
        this.f228834t = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33462g c33462g = new C33462g(this.f228833s, this.f228834t, continuation);
        c33462g.f228832r = obj;
        return c33462g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC33465j> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33462g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228831q;
        Uri uri = this.f228834t;
        C33461f c33461f = this.f228833s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f228832r;
            N0 n02 = c33461f.f228816f;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            c33461f.f228816f = null;
            InterfaceC33465j.c cVar = new InterfaceC33465j.c(uri);
            this.f228832r = interfaceC43172j;
            this.f228831q = 1;
            if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f228832r;
            C42729a0.b(obj);
        }
        a aVar = new a(c33461f, uri, interfaceC43172j, null);
        this.f228832r = null;
        this.f228831q = 2;
        if (t1.c(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
