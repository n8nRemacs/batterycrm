package com.avito.android.sx_address.address_video_verification.domain;

import BA0.b;
import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import okhttp3.MultipartBody;

/* compiled from: SxAddressVideoVerificationInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "LBA0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.domain.SxAddressVideoVerificationInteractorImpl$uploadVideo$uploadingFlow$1", f = "SxAddressVideoVerificationInteractor.kt", i = {0}, l = {121, 145}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class k extends SuspendLambda implements p<I0<? super BA0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292646q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f292647r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f292648s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f292649t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f292650u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f292651v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ File f292652w;

    /* compiled from: SxAddressVideoVerificationInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.domain.SxAddressVideoVerificationInteractorImpl$uploadVideo$uploadingFlow$1$1", f = "SxAddressVideoVerificationInteractor.kt", i = {}, l = {124, 131, 134, 135, 139, 140}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f292653q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ e f292654r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f292655s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f292656t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ MultipartBody.Part f292657u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ I0<BA0.b> f292658v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ File f292659w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, String str, String str2, MultipartBody.Part part, I0<? super BA0.b> i02, File file, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f292654r = eVar;
            this.f292655s = str;
            this.f292656t = str2;
            this.f292657u = part;
            this.f292658v = i02;
            this.f292659w = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f292654r, this.f292655s, this.f292656t, this.f292657u, this.f292658v, this.f292659w, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:8:0x0023, B:11:0x002b, B:28:0x0093, B:12:0x002f, B:24:0x006d, B:13:0x0033, B:19:0x004c, B:21:0x0058, B:25:0x0077, B:16:0x003a), top: B:41:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:8:0x0023, B:11:0x002b, B:28:0x0093, B:12:0x002f, B:24:0x006d, B:13:0x0033, B:19:0x004c, B:21:0x0058, B:25:0x0077, B:16:0x003a), top: B:41:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f292653q
                com.avito.android.sx_address.address_video_verification.domain.e r2 = r9.f292654r
                com.avito.android.sx_address.address_video_verification.domain.File r3 = r9.f292659w
                com.avito.android.sx_address.address_video_verification.view.d r4 = r2.f292615i
                kotlinx.coroutines.channels.I0<BA0.b> r5 = r9.f292658v
                switch(r1) {
                    case 0: goto L37;
                    case 1: goto L33;
                    case 2: goto L2f;
                    case 3: goto L2b;
                    case 4: goto L23;
                    case 5: goto L1e;
                    case 6: goto L19;
                    default: goto L11;
                }
            L11:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L19:
                kotlin.C42729a0.b(r10)
                goto Lcb
            L1e:
                kotlin.C42729a0.b(r10)
                goto Lbf
            L23:
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L28
                goto Lcb
            L28:
                r10 = move-exception
                goto L9f
            L2b:
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L28
                goto L93
            L2f:
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L28
                goto L6d
            L33:
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L28
                goto L4c
            L37:
                kotlin.C42729a0.b(r10)
                com.avito.android.sx_address.address_video_verification.domain.a r10 = r2.f292608b     // Catch: java.lang.Throwable -> L28
                java.lang.String r1 = r9.f292655s     // Catch: java.lang.Throwable -> L28
                java.lang.String r6 = r9.f292656t     // Catch: java.lang.Throwable -> L28
                okhttp3.MultipartBody$Part r7 = r9.f292657u     // Catch: java.lang.Throwable -> L28
                r8 = 1
                r9.f292653q = r8     // Catch: java.lang.Throwable -> L28
                java.lang.Object r10 = r10.a(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L28
                if (r10 != r0) goto L4c
                return r0
            L4c:
                retrofit2.y r10 = (retrofit2.y) r10     // Catch: java.lang.Throwable -> L28
                okhttp3.Response r10 = r10.f430118a     // Catch: java.lang.Throwable -> L28
                int r10 = r10.code()     // Catch: java.lang.Throwable -> L28
                r1 = 200(0xc8, float:2.8E-43)
                if (r10 != r1) goto L77
                BA0.b$j r10 = new BA0.b$j     // Catch: java.lang.Throwable -> L28
                com.avito.android.sx_address.address_video_verification.domain.FileUploadState$Uploaded r1 = com.avito.android.sx_address.address_video_verification.domain.FileUploadState.Uploaded.f292601b     // Catch: java.lang.Throwable -> L28
                com.avito.android.sx_address.address_video_verification.domain.File r1 = com.avito.android.sx_address.address_video_verification.domain.File.a(r3, r1)     // Catch: java.lang.Throwable -> L28
                r10.<init>(r1)     // Catch: java.lang.Throwable -> L28
                r1 = 2
                r9.f292653q = r1     // Catch: java.lang.Throwable -> L28
                java.lang.Object r10 = r5.send(r10, r9)     // Catch: java.lang.Throwable -> L28
                if (r10 != r0) goto L6d
                return r0
            L6d:
                zA0.b r10 = r2.f292609c     // Catch: java.lang.Throwable -> L28
                com.avito.android.sx_address.SxAddressVideoVerificationParams r1 = r2.f292610d     // Catch: java.lang.Throwable -> L28
                long r1 = r1.f292545b     // Catch: java.lang.Throwable -> L28
                r10.a(r1)     // Catch: java.lang.Throwable -> L28
                goto Lcb
            L77:
                BA0.b$j r10 = new BA0.b$j     // Catch: java.lang.Throwable -> L28
                com.avito.android.sx_address.address_video_verification.domain.FileUploadState$Error r1 = new com.avito.android.sx_address.address_video_verification.domain.FileUploadState$Error     // Catch: java.lang.Throwable -> L28
                java.lang.String r2 = r4.getF292734c()     // Catch: java.lang.Throwable -> L28
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
                com.avito.android.sx_address.address_video_verification.domain.File r1 = com.avito.android.sx_address.address_video_verification.domain.File.a(r3, r1)     // Catch: java.lang.Throwable -> L28
                r10.<init>(r1)     // Catch: java.lang.Throwable -> L28
                r1 = 3
                r9.f292653q = r1     // Catch: java.lang.Throwable -> L28
                java.lang.Object r10 = r5.send(r10, r9)     // Catch: java.lang.Throwable -> L28
                if (r10 != r0) goto L93
                return r0
            L93:
                BA0.b$d r10 = BA0.b.d.f1216a     // Catch: java.lang.Throwable -> L28
                r1 = 4
                r9.f292653q = r1     // Catch: java.lang.Throwable -> L28
                java.lang.Object r10 = r5.send(r10, r9)     // Catch: java.lang.Throwable -> L28
                if (r10 != r0) goto Lcb
                return r0
            L9f:
                boolean r10 = r10 instanceof java.util.concurrent.CancellationException
                if (r10 != 0) goto Lcb
                BA0.b$j r10 = new BA0.b$j
                com.avito.android.sx_address.address_video_verification.domain.FileUploadState$Error r1 = new com.avito.android.sx_address.address_video_verification.domain.FileUploadState$Error
                java.lang.String r2 = r4.getF292734c()
                r1.<init>(r2)
                com.avito.android.sx_address.address_video_verification.domain.File r1 = com.avito.android.sx_address.address_video_verification.domain.File.a(r3, r1)
                r10.<init>(r1)
                r1 = 5
                r9.f292653q = r1
                java.lang.Object r10 = r5.send(r10, r9)
                if (r10 != r0) goto Lbf
                return r0
            Lbf:
                BA0.b$d r10 = BA0.b.d.f1216a
                r1 = 6
                r9.f292653q = r1
                java.lang.Object r10 = r5.send(r10, r9)
                if (r10 != r0) goto Lcb
                return r0
            Lcb:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.address_video_verification.domain.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, String str, String str2, MultipartBody.Part part, File file, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f292648s = eVar;
        this.f292649t = str;
        this.f292650u = str2;
        this.f292651v = part;
        this.f292652w = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f292648s, this.f292649t, this.f292650u, this.f292651v, this.f292652w, continuation);
        kVar.f292647r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super BA0.b> i02, Continuation<? super G0> continuation) {
        return ((k) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292646q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i02 = (I0) this.f292647r;
            b.d dVar = b.d.f1216a;
            this.f292647r = i02;
            this.f292646q = 1;
            if (i02.send(dVar, this) == coroutine_suspended) {
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
            i02 = (I0) this.f292647r;
            C42729a0.b(obj);
        }
        e eVar = this.f292648s;
        File file = this.f292652w;
        eVar.f292617k = C43259k.d(eVar.f292616j, null, null, new a(eVar, this.f292649t, this.f292650u, this.f292651v, i02, file, null), 3);
        this.f292647r = null;
        this.f292646q = 2;
        if (F0.a(i02, kotlinx.coroutines.channels.G0.f410795l, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
