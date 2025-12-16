package com.avito.android.personal_banner.feature.domain;

import Y41.p;
import Y60.b;
import Y61.k;
import Y61.l;
import b70.InterfaceC25423a;
import c70.C26952a;
import c70.C26953b;
import com.avito.android.lib.beduin_v2.feature.di.InterfaceC31136m0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: BannerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_banner/feature/domain/d;", "Lcom/avito/android/personal_banner/feature/domain/b;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC25423a> f215588a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC31136m0> f215589b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f215590c;

    /* compiled from: BannerInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LY60/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)LY60/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.personal_banner.feature.domain.BannerRemoteInteractor$banner$2", f = "BannerInteractor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Y60.b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f215591q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y60.a f215593s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y60.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f215593s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return d.this.new a(this.f215593s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Y60.b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f215591q;
            if (i12 == 0) {
                C42729a0.b(obj);
                d dVar = d.this;
                InterfaceC25423a interfaceC25423a = dVar.f215588a.get();
                String strO = C42745f0.O(dVar.f215589b.get().f(), null, null, null, null, 63);
                Y60.a aVar = this.f215593s;
                this.f215591q = 1;
                obj = interfaceC25423a.a(strO, "contract=Avito; platform=Android; version=26.0", aVar.f19305a, aVar.f19307c, aVar.f19306b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                return new b.c(error.getError(), error.getCause());
            }
            if (!(typedResult instanceof TypedResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            C26953b banner = ((C26952a) ((TypedResult.Success) typedResult).getResult()).getBanner();
            if (banner == null) {
                return b.C1365b.f19311a;
            }
            return new b.a(banner.getBannerId(), banner.getContent(), banner.getOnShowDeeplink());
        }
    }

    @Inject
    public d(@k R0 r02, @k h31.e eVar, @k h31.e eVar2) {
        this.f215588a = eVar;
        this.f215589b = eVar2;
        this.f215590c = r02;
    }

    @l
    public final Object a(@k Y60.a aVar, @k Continuation<? super Y60.b> continuation) {
        return C43259k.g(this.f215590c.a(), new a(aVar, null), continuation);
    }
}
