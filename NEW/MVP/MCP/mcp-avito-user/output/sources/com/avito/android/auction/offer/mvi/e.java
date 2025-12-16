package com.avito.android.auction.offer.mvi;

import com.avito.android.auction.offer.AuctionOfferParams;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lD.C43617a;

/* compiled from: AuctionOfferBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/offer/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "LNd/c;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.arch.mvi.b<Nd.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auction.offer.domain.d f92577a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AuctionOfferParams f92578b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auction.offer.domain.j f92579c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auction.offer.domain.a f92580d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43617a f92581e;

    /* compiled from: AuctionOfferBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LNd/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auction.offer.mvi.AuctionOfferBootstrap$produce$1", f = "AuctionOfferBootstrap.kt", i = {0, 1, 2, 4, 5}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 32, 35, 37, 41}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "response", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Nd.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f92582q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f92583r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f92583r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Nd.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auction.offer.mvi.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.auction.offer.domain.d dVar, @Y61.k AuctionOfferParams auctionOfferParams, @Y61.k com.avito.android.auction.offer.domain.j jVar, @Y61.k com.avito.android.auction.offer.domain.a aVar, @Y61.k C43617a c43617a) {
        this.f92577a = dVar;
        this.f92578b = auctionOfferParams;
        this.f92579c = jVar;
        this.f92580d = aVar;
        this.f92581e = c43617a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Nd.c> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
