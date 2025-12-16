package com.avito.android.multi_message_send.domain;

import F20.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetMessengerBannerDataUseCaseImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/domain/h;", "Lcom/avito/android/multi_message_send/domain/g;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A20.a f206693a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f206694b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f206695c;

    /* compiled from: GetMessengerBannerDataUseCaseImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LF20/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multi_message_send.domain.GetMessengerBannerDataUseCaseImpl$invoke$1", f = "GetMessengerBannerDataUseCaseImpl.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 33}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super F20.a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f206696q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f206697r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f206699t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f206699t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(this.f206699t, continuation);
            aVar.f206697r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super F20.a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f206696q;
            h hVar = h.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f206697r;
                A20.a aVar = hVar.f206693a;
                C20.b bVar = new C20.b(this.f206699t);
                this.f206697r = interfaceC43172j;
                this.f206696q = 1;
                obj = aVar.c(bVar, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f206697r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                C20.a aVar2 = (C20.a) ((TypedResult.Success) typedResult).getResult();
                if (!aVar2.getOk()) {
                    return G0.f406611a;
                }
                C20.c banner = aVar2.getBanner();
                String title = banner.getTitle();
                AttributedText description = banner.getDescription();
                Image img = banner.getImg();
                C20.e defaultImage = banner.getDefaultImage();
                Image value = defaultImage != null ? defaultImage.getValue() : null;
                C20.e defaultImage2 = banner.getDefaultImage();
                F20.a aVar3 = new F20.a(title, description, img, new UniversalImage(value, defaultImage2 != null ? defaultImage2.getValueDark() : null), new a.C0272a(banner.getButton().getTitle(), banner.getButton().getDeepLink(), banner.getButton().getStyle()), banner.getOnCloseDeeplink());
                this.f206697r = null;
                this.f206696q = 2;
                if (interfaceC43172j.emit(aVar3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
                hVar.f206695c.c(new y.a("getMessengerBannerDataUseCaseImpl.error", 0L, 2, null));
                V2.f318762a.d("GetMessengerBannerDataUseCaseImpl", "apiBulkMessagingBannerGet get error: " + apiExceptionA);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k A20.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f206693a = aVar;
        this.f206694b = r02;
        this.f206695c = interfaceC28373a;
    }

    @Override // com.avito.android.multi_message_send.domain.g
    @Y61.k
    public final InterfaceC43160i<F20.a> a(long j12) {
        return C43175k.I(this.f206694b.a(), C43175k.G(new a(j12, null)));
    }
}
