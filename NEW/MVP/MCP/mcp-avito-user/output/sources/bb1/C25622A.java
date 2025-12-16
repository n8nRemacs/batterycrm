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

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.VkpnsTopicSourceApi$subscribeToTopic$2", f = "VkpnsTopicSourceApi.kt", i = {1}, l = {64, 65}, m = "invokeSuspend", n = {"response$iv"}, s = {"L$0"})
/* renamed from: bb1.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C25622A extends SuspendLambda implements Y41.p<T, Continuation<? super Z<? extends G0>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Response f57196q;

    /* renamed from: r, reason: collision with root package name */
    public int f57197r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f57198s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f57199t;

    @DebugMetadata(c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", f = "CallHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: bb1.A$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super String>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Response f57200q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Response response, Continuation continuation) {
            super(2, continuation);
            this.f57200q = response;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f57200q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super String> continuation) {
            return new a(this.f57200q, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strString;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ResponseBody responseBodyBody = this.f57200q.body();
            return (responseBodyBody == null || (strString = responseBodyBody.string()) == null) ? "" : strString;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25622A(String str, D d12, Continuation continuation) {
        super(2, continuation);
        this.f57198s = str;
        this.f57199t = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new C25622A(this.f57198s, this.f57199t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Z<? extends G0>> continuation) {
        return ((C25622A) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0011, B:23:0x0093, B:25:0x009b, B:26:0x00b0, B:28:0x00b6, B:29:0x00bb, B:13:0x0021, B:19:0x007d, B:16:0x0074), top: B:35:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0011, B:23:0x0093, B:25:0x009b, B:26:0x00b0, B:28:0x00b6, B:29:0x00bb, B:13:0x0021, B:19:0x007d, B:16:0x0074), top: B:35:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f57197r
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            okhttp3.Response r0 = r7.f57196q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Exception -> L16
            goto L93
        L16:
            r8 = move-exception
            goto Ld0
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Exception -> L16
            goto L7d
        L25:
            kotlin.C42729a0.b(r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r1 = "push_token"
            java.lang.String r5 = r7.f57198s
            org.json.JSONObject r8 = r8.put(r1, r5)
            java.lang.String r8 = r8.toString()
            okhttp3.RequestBody r8 = com.vk.push.core.network.utils.k.a(r8)
            kotlin.jvm.internal.u0 r1 = kotlin.jvm.internal.u0.f406856a
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r5 = "v1/topics/%s/subscribe"
            java.lang.String r1 = java.lang.String.format(r5, r1)
            bb1.D r5 = r7.f57199t
            T11.e r6 = r5.f57211b
            okhttp3.HttpUrl$Builder r6 = com.vk.push.core.network.utils.f.a(r6)
            okhttp3.HttpUrl$Builder r1 = r6.addPathSegments(r1)
            okhttp3.HttpUrl r1 = r1.build()
            okhttp3.Request$Builder r6 = new okhttp3.Request$Builder
            r6.<init>()
            okhttp3.Request$Builder r1 = r6.url(r1)
            okhttp3.Request$Builder r8 = r1.post(r8)
            okhttp3.Request r8 = r8.build()
            okhttp3.OkHttpClient r1 = r5.f57210a
            okhttp3.Call r8 = r1.newCall(r8)
            r7.f57197r = r4     // Catch: java.lang.Exception -> L16
            java.lang.Object r8 = com.vk.push.core.network.utils.d.a(r8, r7)     // Catch: java.lang.Exception -> L16
            if (r8 != r0) goto L7d
            return r0
        L7d:
            okhttp3.Response r8 = (okhttp3.Response) r8     // Catch: java.lang.Exception -> L16
            kotlinx.coroutines.scheduling.b r1 = kotlinx.coroutines.C43262l0.f411947c     // Catch: java.lang.Exception -> L16
            bb1.A$a r4 = new bb1.A$a     // Catch: java.lang.Exception -> L16
            r4.<init>(r8, r2)     // Catch: java.lang.Exception -> L16
            r7.f57196q = r8     // Catch: java.lang.Exception -> L16
            r7.f57197r = r3     // Catch: java.lang.Exception -> L16
            java.lang.Object r1 = kotlinx.coroutines.C43259k.g(r1, r4, r7)     // Catch: java.lang.Exception -> L16
            if (r1 != r0) goto L91
            return r0
        L91:
            r0 = r8
            r8 = r1
        L93:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L16
            boolean r1 = com.vk.push.core.network.utils.l.a(r8)     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto Lb0
            m21.a r8 = com.vk.push.core.network.utils.l.b(r8)     // Catch: java.lang.Exception -> L16
            com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException r0 = new com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException     // Catch: java.lang.Exception -> L16
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L16
            r0.<init>(r8)     // Catch: java.lang.Exception -> L16
            int r8 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L16
            kotlin.Z$b r8 = new kotlin.Z$b     // Catch: java.lang.Exception -> L16
            r8.<init>(r0)     // Catch: java.lang.Exception -> L16
            goto Ld8
        Lb0:
            boolean r8 = r0.isSuccessful()     // Catch: java.lang.Exception -> L16
            if (r8 == 0) goto Lbb
            kotlin.G0 r8 = kotlin.G0.f406611a     // Catch: java.lang.Exception -> L16
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L16
            goto Ld8
        Lbb:
            com.vk.push.core.network.exception.VkpnsRequestException r8 = new com.vk.push.core.network.exception.VkpnsRequestException     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = r0.message()     // Catch: java.lang.Exception -> L16
            int r0 = r0.code()     // Catch: java.lang.Exception -> L16
            r8.<init>(r1, r0)     // Catch: java.lang.Exception -> L16
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L16
            kotlin.Z$b r0 = new kotlin.Z$b     // Catch: java.lang.Exception -> L16
            r0.<init>(r8)     // Catch: java.lang.Exception -> L16
            goto Ld7
        Ld0:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r8)
        Ld7:
            r8 = r0
        Ld8:
            kotlin.Z r8 = kotlin.Z.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.C25622A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
