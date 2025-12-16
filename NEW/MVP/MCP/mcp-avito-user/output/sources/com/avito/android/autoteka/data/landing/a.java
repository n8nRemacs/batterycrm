package com.avito.android.autoteka.data.landing;

import Mf.C14480a;
import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.autoteka.data.i;
import com.avito.android.autoteka.deeplinks.LandingDetails;
import com.avito.android.autoteka.domain.model.landing.LandingBeduinItem;
import com.avito.android.autoteka.presentation.landing.mvi.entity.AutotekaLandingInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaLandingLoadContentInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/data/landing/a;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f96130a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C14480a f96131b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LandingDetails f96132c;

    /* compiled from: AutotekaLandingLoadContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.data.landing.AutotekaLandingLoadContentInteractor$invoke$1", f = "AutotekaLandingLoadContentInteractor.kt", i = {0, 1, 3}, l = {20, 22, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.autoteka.data.landing.a$a, reason: collision with other inner class name */
    public static final class C2841a extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaLandingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f96133q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f96134r;

        /* compiled from: AutotekaLandingLoadContentInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/autoteka/domain/model/landing/LandingBeduinItem;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.autoteka.data.landing.AutotekaLandingLoadContentInteractor$invoke$1$response$1", f = "AutotekaLandingLoadContentInteractor.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.autoteka.data.landing.a$a$a, reason: collision with other inner class name */
        public static final class C2842a extends SuspendLambda implements l<Continuation<? super TypedResult<LandingBeduinItem>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f96136q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ a f96137r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2842a(a aVar, Continuation<? super C2842a> continuation) {
                super(1, continuation);
                this.f96137r = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@k Continuation<?> continuation) {
                return new C2842a(this.f96137r, continuation);
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super TypedResult<LandingBeduinItem>> continuation) {
                return ((C2842a) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f96136q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = this.f96137r;
                    i iVar = aVar.f96130a;
                    LandingDetails landingDetails = aVar.f96132c;
                    Integer num = landingDetails.f96242b;
                    this.f96136q = 1;
                    obj = iVar.c(num, landingDetails.f96243c, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        public C2841a(Continuation<? super C2841a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            C2841a c2841a = a.this.new C2841a(continuation);
            c2841a.f96134r = obj;
            return c2841a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaLandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C2841a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.data.landing.a.C2841a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k i iVar, @k C14480a c14480a, @k LandingDetails landingDetails) {
        this.f96130a = iVar;
        this.f96131b = c14480a;
        this.f96132c = landingDetails;
    }

    @k
    public final InterfaceC43160i<AutotekaLandingInternalAction> a() {
        return C43175k.G(new C2841a(null));
    }
}
