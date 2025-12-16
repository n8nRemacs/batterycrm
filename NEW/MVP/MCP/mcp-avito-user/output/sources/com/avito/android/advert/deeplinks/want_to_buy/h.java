package com.avito.android.advert.deeplinks.want_to_buy;

import Y41.p;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert.deeplinks.AdvertWantToBuyRequestLink;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AdvertWantToBuyRequestLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/deeplinks/want_to_buy/h;", "Lev/a;", "Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends AbstractC40161a<AdvertWantToBuyRequestLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f69047f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f69048g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.deeplinks.want_to_buy.a f69049h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f69050i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Context f69051j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C29640d f69052k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public N0 f69053l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C43238h f69054m;

    /* compiled from: AdvertWantToBuyRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.deeplinks.want_to_buy.AdvertWantToBuyRequestLinkHandler$request$1", f = "AdvertWantToBuyRequestLinkHandler.kt", i = {}, l = {54, 57, 58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f69055q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdvertWantToBuyRequestLink f69057s;

        /* compiled from: AdvertWantToBuyRequestLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.deeplinks.want_to_buy.AdvertWantToBuyRequestLinkHandler$request$1$1", f = "AdvertWantToBuyRequestLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert.deeplinks.want_to_buy.h$a$a, reason: collision with other inner class name */
        public static final class C2164a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ h f69058q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2164a(h hVar, Continuation<? super C2164a> continuation) {
                super(2, continuation);
                this.f69058q = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2164a(this.f69058q, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2164a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                h hVar = this.f69058q;
                hVar.f69048g.g(hVar.d(), true);
                return G0.f406611a;
            }
        }

        /* compiled from: AdvertWantToBuyRequestLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.deeplinks.want_to_buy.AdvertWantToBuyRequestLinkHandler$request$1$2", f = "AdvertWantToBuyRequestLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ m f69059q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f69060r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ AdvertWantToBuyRequestLink f69061s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m mVar, h hVar, AdvertWantToBuyRequestLink advertWantToBuyRequestLink, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f69059q = mVar;
                this.f69060r = hVar;
                this.f69061s = advertWantToBuyRequestLink;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f69059q, this.f69060r, this.f69061s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                boolean success = this.f69059q.getSuccess();
                h hVar = this.f69060r;
                if (success) {
                    hVar.getClass();
                    a.i.C4057a.d(hVar.f69050i, com.avito.android.printable_text.b.c(R.string.advert_details_want_to_buy_request_success_toast, new Serializable[0]), null, null, f.a.f125253a, 0, null, null, "avitoRe23", ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                    hVar.j(AdvertWantToBuyRequestLink.b.C2157b.f68880b);
                } else {
                    h.k(hVar, new ApiError.UnknownError("", null, null, 6, null), this.f69061s);
                }
                hVar.f69048g.g(hVar.d(), false);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertWantToBuyRequestLink advertWantToBuyRequestLink, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f69057s = advertWantToBuyRequestLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new a(this.f69057s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f69055q
                com.avito.android.advert.deeplinks.AdvertWantToBuyRequestLink r2 = r8.f69057s
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                com.avito.android.advert.deeplinks.want_to_buy.h r7 = com.avito.android.advert.deeplinks.want_to_buy.h.this
                if (r1 == 0) goto L2a
                if (r1 == r6) goto L26
                if (r1 == r5) goto L22
                if (r1 != r4) goto L1a
                kotlin.C42729a0.b(r9)
                goto L64
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                kotlin.C42729a0.b(r9)
                goto L4e
            L26:
                kotlin.C42729a0.b(r9)
                goto L41
            L2a:
                kotlin.C42729a0.b(r9)
                com.avito.android.util.R0 r9 = r7.f69047f
                kotlinx.coroutines.d1 r9 = r9.b()
                com.avito.android.advert.deeplinks.want_to_buy.h$a$a r1 = new com.avito.android.advert.deeplinks.want_to_buy.h$a$a
                r1.<init>(r7, r3)
                r8.f69055q = r6
                java.lang.Object r9 = kotlinx.coroutines.C43259k.g(r9, r1, r8)
                if (r9 != r0) goto L41
                return r0
            L41:
                com.avito.android.advert.deeplinks.want_to_buy.a r9 = r7.f69049h
                java.lang.String r1 = r2.f68878b
                r8.f69055q = r5
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L4e
                return r0
            L4e:
                com.avito.android.advert.deeplinks.want_to_buy.m r9 = (com.avito.android.advert.deeplinks.want_to_buy.m) r9
                com.avito.android.util.R0 r1 = r7.f69047f
                kotlinx.coroutines.d1 r1 = r1.b()
                com.avito.android.advert.deeplinks.want_to_buy.h$a$b r5 = new com.avito.android.advert.deeplinks.want_to_buy.h$a$b
                r5.<init>(r9, r7, r2, r3)
                r8.f69055q = r4
                java.lang.Object r9 = kotlinx.coroutines.C43259k.g(r1, r5, r8)
                if (r9 != r0) goto L64
                return r0
            L64:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.deeplinks.want_to_buy.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public h(@Y61.k R0 r02, @Y61.k a.g gVar, @Y61.k com.avito.android.advert.deeplinks.want_to_buy.a aVar, @Y61.k a.i iVar, @Y61.k Context context, @Y61.k C29640d c29640d) {
        this.f69047f = r02;
        this.f69048g = gVar;
        this.f69049h = aVar;
        this.f69050i = iVar;
        this.f69051j = context;
        this.f69052k = c29640d;
        this.f69054m = U.a(r02.a());
    }

    public static final void k(h hVar, ApiError apiError, AdvertWantToBuyRequestLink advertWantToBuyRequestLink) {
        List listSingletonList = Collections.singletonList(new c.a.C3719a(hVar.f69051j.getString(R.string.advert_details_advert_repeat), true, null, new g(hVar, advertWantToBuyRequestLink), 4, null));
        a.i.C4057a.d(hVar.f69050i, com.avito.android.printable_text.b.c(R.string.advert_details_advert_unknown_error_retry, new Serializable[0]), null, listSingletonList, new f.c(apiError), 0, null, null, "avitoRe23", 1002);
        hVar.j(AdvertWantToBuyRequestLink.b.a.f68879b);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AdvertWantToBuyRequestLink advertWantToBuyRequestLink = (AdvertWantToBuyRequestLink) deepLink;
        C29640d c29640d = this.f69052k;
        c29640d.getClass();
        n<Object> nVar = C29640d.f132175X[27];
        if (((Boolean) c29640d.f132176A.a().invoke()).booleanValue()) {
            l(advertWantToBuyRequestLink);
        } else {
            j(AdvertWantToBuyRequestLink.b.c.f68881b);
        }
    }

    public final void l(AdvertWantToBuyRequestLink advertWantToBuyRequestLink) {
        N0 n02 = this.f69053l;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f69053l = C43259k.d(U.f(this.f69054m, new f(N.f410714t2, this, advertWantToBuyRequestLink)), null, null, new a(advertWantToBuyRequestLink, null), 3);
    }
}
