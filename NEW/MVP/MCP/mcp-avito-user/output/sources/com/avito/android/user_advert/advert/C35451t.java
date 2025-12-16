package com.avito.android.user_advert.advert;

import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.util.InterfaceC35863o4;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: MyAdvertBannerContextInfoProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/t;", "Lcom/avito/android/user_advert/advert/s;", "Landroidx/lifecycle/M0;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35451t extends androidx.view.M0 implements InterfaceC35449s {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f310629E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Z1<BannerContext> f310630J = p2.a(BannerContext.None.f215597b);

    /* compiled from: MyAdvertBannerContextInfoProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.MyAdvertBannerContextInfoViewModel$accept$1", f = "MyAdvertBannerContextInfoProvider.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_advert.advert.t$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f310631q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ BannerContext f310633s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BannerContext bannerContext, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f310633s = bannerContext;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C35451t.this.new a(this.f310633s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f310631q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Z1<BannerContext> z12 = C35451t.this.f310630J;
                this.f310631q = 1;
                if (z12.emit(this.f310633s, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    public C35451t(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f310629E = interfaceC35863o4;
    }

    @Override // com.avito.android.personal_banner.feature.domain.a
    @Y61.k
    public final InterfaceC43160i<BannerContext> A7() {
        return this.f310630J;
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35449s
    public final void M8(@Y61.l MyAdvertDetails.BannerFromSxBanners bannerFromSxBanners) {
        C43259k.d(androidx.view.N0.a(this), null, null, new a(bannerFromSxBanners == null ? BannerContext.None.f215597b : new BannerContext.Info(null, bannerFromSxBanners.getContext(), this.f310629E.a()), null), 3);
    }
}
