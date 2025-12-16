package bb1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import okhttp3.Response;
import okhttp3.ResponseBody;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.VkpnsTopicSourceApi$unsubscribeFromTopic$2", f = "VkpnsTopicSourceApi.kt", i = {1}, l = {64, 65}, m = "invokeSuspend", n = {"response$iv"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class C extends SuspendLambda implements Y41.p<T, Continuation<? super Z<? extends G0>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Response f57204q;

    /* renamed from: r, reason: collision with root package name */
    public int f57205r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f57206s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f57207t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D f57208u;

    @DebugMetadata(c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", f = "CallHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super String>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Response f57209q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Response response, Continuation continuation) {
            super(2, continuation);
            this.f57209q = response;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f57209q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super String> continuation) {
            return new a(this.f57209q, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strString;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ResponseBody responseBodyBody = this.f57209q.body();
            return (responseBodyBody == null || (strString = responseBodyBody.string()) == null) ? "" : strString;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str, String str2, D d12, Continuation<? super C> continuation) {
        super(2, continuation);
        this.f57206s = str;
        this.f57207t = str2;
        this.f57208u = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new C(this.f57206s, this.f57207t, this.f57208u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Z<? extends G0>> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:7:0x0010, B:23:0x0095, B:25:0x009d, B:26:0x00b2, B:28:0x00b8, B:29:0x00bd, B:13:0x0020, B:19:0x007e, B:16:0x0075), top: B:35:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:7:0x0010, B:23:0x0095, B:25:0x009d, B:26:0x00b2, B:28:0x00b8, B:29:0x00bd, B:13:0x0020, B:19:0x007e, B:16:0x0075), top: B:35:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f57205r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            okhttp3.Response r0 = r6.f57204q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Exception -> L15
            goto L95
        L15:
            r7 = move-exception
            goto Ld2
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Exception -> L15
            goto L7e
        L24:
            kotlin.C42729a0.b(r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r1 = "push_token"
            java.lang.String r4 = r6.f57206s
            org.json.JSONObject r7 = r7.put(r1, r4)
            java.lang.String r7 = r7.toString()
            okhttp3.RequestBody r7 = com.vk.push.core.network.utils.k.a(r7)
            kotlin.jvm.internal.u0 r1 = kotlin.jvm.internal.u0.f406856a
            java.lang.String r1 = r6.f57207t
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r4 = "v1/topics/%s/unsubscribe"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            bb1.D r4 = r6.f57208u
            T11.e r5 = r4.f57211b
            okhttp3.HttpUrl$Builder r5 = com.vk.push.core.network.utils.f.a(r5)
            okhttp3.HttpUrl$Builder r1 = r5.addPathSegments(r1)
            okhttp3.HttpUrl r1 = r1.build()
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder
            r5.<init>()
            okhttp3.Request$Builder r1 = r5.url(r1)
            okhttp3.Request$Builder r7 = r1.post(r7)
            okhttp3.Request r7 = r7.build()
            okhttp3.OkHttpClient r1 = r4.f57210a
            okhttp3.Call r7 = r1.newCall(r7)
            r6.f57205r = r3     // Catch: java.lang.Exception -> L15
            java.lang.Object r7 = com.vk.push.core.network.utils.d.a(r7, r6)     // Catch: java.lang.Exception -> L15
            if (r7 != r0) goto L7e
            return r0
        L7e:
            okhttp3.Response r7 = (okhttp3.Response) r7     // Catch: java.lang.Exception -> L15
            kotlinx.coroutines.scheduling.b r1 = kotlinx.coroutines.C43262l0.f411947c     // Catch: java.lang.Exception -> L15
            bb1.C$a r3 = new bb1.C$a     // Catch: java.lang.Exception -> L15
            r4 = 0
            r3.<init>(r7, r4)     // Catch: java.lang.Exception -> L15
            r6.f57204q = r7     // Catch: java.lang.Exception -> L15
            r6.f57205r = r2     // Catch: java.lang.Exception -> L15
            java.lang.Object r1 = kotlinx.coroutines.C43259k.g(r1, r3, r6)     // Catch: java.lang.Exception -> L15
            if (r1 != r0) goto L93
            return r0
        L93:
            r0 = r7
            r7 = r1
        L95:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L15
            boolean r1 = com.vk.push.core.network.utils.l.a(r7)     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto Lb2
            m21.a r7 = com.vk.push.core.network.utils.l.b(r7)     // Catch: java.lang.Exception -> L15
            com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException r0 = new com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException     // Catch: java.lang.Exception -> L15
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L15
            r0.<init>(r7)     // Catch: java.lang.Exception -> L15
            int r7 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L15
            kotlin.Z$b r7 = new kotlin.Z$b     // Catch: java.lang.Exception -> L15
            r7.<init>(r0)     // Catch: java.lang.Exception -> L15
            goto Lda
        Lb2:
            boolean r7 = r0.isSuccessful()     // Catch: java.lang.Exception -> L15
            if (r7 == 0) goto Lbd
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Exception -> L15
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L15
            goto Lda
        Lbd:
            com.vk.push.core.network.exception.VkpnsRequestException r7 = new com.vk.push.core.network.exception.VkpnsRequestException     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = r0.message()     // Catch: java.lang.Exception -> L15
            int r0 = r0.code()     // Catch: java.lang.Exception -> L15
            r7.<init>(r1, r0)     // Catch: java.lang.Exception -> L15
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L15
            kotlin.Z$b r0 = new kotlin.Z$b     // Catch: java.lang.Exception -> L15
            r0.<init>(r7)     // Catch: java.lang.Exception -> L15
            goto Ld9
        Ld2:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r7)
        Ld9:
            r7 = r0
        Lda:
            kotlin.Z r7 = kotlin.Z.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
