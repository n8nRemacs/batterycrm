package com.avito.android.favorites.link;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.favorites.link.GetSimilarPushLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: GetSimilarPushLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorites.link.GetSimilarPushLinkHandler$doHandle$1", f = "GetSimilarPushLinkHandler.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f157390q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.favorites.link.b f157391r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Long f157392s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ GetSimilarPushLink f157393t;

    /* compiled from: GetSimilarPushLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.link.a$a, reason: collision with other inner class name */
    public static final class C4604a extends N implements l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.favorites.link.b f157394l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4604a(com.avito.android.favorites.link.b bVar) {
            super(1);
            this.f157394l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            com.avito.android.favorites.link.b bVar = this.f157394l;
            b.a.a(bVar.f157397g, deepLink, null, null, 6);
            bVar.j(GetSimilarPushLink.b.C4603b.f157389b);
            return G0.f406611a;
        }
    }

    /* compiled from: GetSimilarPushLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.favorites.link.b f157395l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.favorites.link.b bVar) {
            super(1);
            this.f157395l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            V2.f318762a.e("GetSimilarPushLinkHandler error response: ".concat(str2), null);
            com.avito.android.favorites.link.b bVar = this.f157395l;
            a.i.C4057a.d(bVar.f157398h, com.avito.android.printable_text.b.f(str2), null, null, null, 0, null, null, null, 2046);
            bVar.j(GetSimilarPushLink.b.a.f157388b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.favorites.link.b bVar, Long l12, GetSimilarPushLink getSimilarPushLink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f157391r = bVar;
        this.f157392s = l12;
        this.f157393t = getSimilarPushLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f157391r, this.f157392s, this.f157393t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f157390q;
        com.avito.android.favorites.link.b bVar = this.f157391r;
        if (i12 == 0) {
            C42729a0.b(obj);
            long jLongValue = this.f157392s.longValue();
            GetSimilarPushLink getSimilarPushLink = this.f157393t;
            Long l12 = getSimilarPushLink.f157385c;
            this.f157390q = 1;
            obj = bVar.f157396f.a(jLongValue, l12, getSimilarPushLink.f157386d, getSimilarPushLink.f157387e, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new C4604a(bVar), new b(bVar), null, 60);
        return G0.f406611a;
    }
}
