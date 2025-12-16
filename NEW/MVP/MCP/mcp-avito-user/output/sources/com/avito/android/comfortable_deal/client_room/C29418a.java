package com.avito.android.comfortable_deal.client_room;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.comfortable_deal.client_room.ClientRoomFragment;
import com.avito.android.comfortable_deal.client_room.dialogs.ContractDialog;
import com.avito.android.comfortable_deal.client_room.model.ClientRoomArguments;
import com.avito.android.comfortable_deal.client_room.seller_recall.SellerRecallFragment;
import com.avito.android.comfortable_deal.client_room.seller_recall.model.SellerRecallArguments;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.review.deeplink.ComfortableDealReviewsLink;
import fp.f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: ClientRoomFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.client_room.ClientRoomFragment$HandleEvents$1", f = "ClientRoomFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.comfortable_deal.client_room.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29418a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f119811q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ClientRoomFragment f119812r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f119813s;

    /* compiled from: ClientRoomFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfp/f;", "event", "Lkotlin/G0;", "<anonymous>", "(Lfp/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.client_room.ClientRoomFragment$HandleEvents$1$1", f = "ClientRoomFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.client_room.a$a, reason: collision with other inner class name */
    public static final class C3516a extends SuspendLambda implements Y41.p<fp.f, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f119814q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ClientRoomFragment f119815r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f119816s;

        /* compiled from: ClientRoomFragment.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.client_room.a$a$a, reason: collision with other inner class name */
        public static final class C3517a extends N implements Y41.l<String, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ClientRoomFragment f119817l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3517a(ClientRoomFragment clientRoomFragment) {
                super(1);
                this.f119817l = clientRoomFragment;
            }

            @Override // Y41.l
            public final G0 invoke(String str) {
                String str2 = str;
                com.avito.android.deeplink_handler.handler.composite.a aVar = this.f119817l.f119791r0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, new WebViewLink.OnlyAvitoDomain(Uri.parse(str2), null, null, 6, null), null, null, 6);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3516a(ClientRoomFragment clientRoomFragment, Context context, Continuation<? super C3516a> continuation) {
            super(2, continuation);
            this.f119815r = clientRoomFragment;
            this.f119816s = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C3516a c3516a = new C3516a(this.f119815r, this.f119816s, continuation);
            c3516a.f119814q = obj;
            return c3516a;
        }

        @Override // Y41.p
        public final Object invoke(fp.f fVar, Continuation<? super G0> continuation) {
            return ((C3516a) create(fVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            fp.f fVar = (fp.f) this.f119814q;
            boolean z12 = fVar instanceof f.a;
            ClientRoomFragment clientRoomFragment = this.f119815r;
            if (z12) {
                new ContractDialog().show(clientRoomFragment.getChildFragmentManager(), "ContractDialog");
            } else {
                boolean z13 = fVar instanceof f.C11175f;
                Context context = this.f119816s;
                if (z13) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar = clientRoomFragment.f119791r0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, new WebViewLink.OnlyAvitoDomain(Uri.parse(context.getString(R.string.client_room_sell_estate_link)), null, null, 6, null), null, null, 6);
                } else if (fVar instanceof f.b) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = clientRoomFragment.f119791r0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, new WebViewLink.OnlyAvitoDomain(Uri.parse(context.getString(R.string.client_room_market_price_link)), null, null, 6, null), null, null, 6);
                } else if (fVar instanceof f.c) {
                    SellerRecallFragment.a aVar3 = SellerRecallFragment.f119933t0;
                    ClientRoomFragment.a aVar4 = ClientRoomFragment.f119786t0;
                    InterfaceC42726C interfaceC42726C = clientRoomFragment.f119792s0;
                    SellerRecallArguments sellerRecallArguments = new SellerRecallArguments(((ClientRoomArguments) interfaceC42726C.getValue()).f119868b, ((ClientRoomArguments) interfaceC42726C.getValue()).f119869c, ((ClientRoomArguments) interfaceC42726C.getValue()).f119870d);
                    aVar3.getClass();
                    SellerRecallFragment sellerRecallFragmentA = SellerRecallFragment.a.a(sellerRecallArguments);
                    H hE2 = clientRoomFragment.getParentFragmentManager().e();
                    hE2.n(R.id.fragment_container, sellerRecallFragmentA, null);
                    hE2.c("SellerRecallFragment");
                    hE2.e();
                } else if (L.f(fVar, f.e.f396115a)) {
                    com.avito.android.lib.util.g.a(new com.avito.android.comfortable_deal.client_room.dialogs.k(clientRoomFragment.requireContext(), new C3517a(clientRoomFragment)));
                } else if (L.f(fVar, f.d.f396114a)) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar5 = clientRoomFragment.f119791r0;
                    if (aVar5 == null) {
                        aVar5 = null;
                    }
                    b.a.a(aVar5, new ComfortableDealReviewsLink(), null, null, 6);
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29418a(ClientRoomFragment clientRoomFragment, Context context, Continuation<? super C29418a> continuation) {
        super(2, continuation);
        this.f119812r = clientRoomFragment;
        this.f119813s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29418a c29418a = new C29418a(this.f119812r, this.f119813s, continuation);
        c29418a.f119811q = obj;
        return c29418a;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C29418a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f119811q;
        ClientRoomFragment clientRoomFragment = this.f119812r;
        C43175k.K(new C43197r1(new C3516a(clientRoomFragment, this.f119813s, null), ((F) clientRoomFragment.f119788o0.getValue()).getEvents()), t12);
        return G0.f406611a;
    }
}
