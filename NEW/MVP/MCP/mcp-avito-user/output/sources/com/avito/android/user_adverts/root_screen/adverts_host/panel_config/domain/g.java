package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.ProfileItemsConfig;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nE.C44240b;
import sI0.InterfaceC48055a;

/* compiled from: ItemsConfigInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/g;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48055a> f313266a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f313267b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_persistence.f f313268c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C44240b f313269d;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<TypedResult<GI0.a>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f313270b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f313271c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.g$a$a, reason: collision with other inner class name */
        public static final class C9615a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f313272b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f313273c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.ItemsConfigRemoteInteractor$itemsConfig$$inlined$map$1$2", f = "ItemsConfigInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.g$a$a$a, reason: collision with other inner class name */
            public static final class C9616a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f313274q;

                /* renamed from: r, reason: collision with root package name */
                public int f313275r;

                public C9616a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f313274q = obj;
                    this.f313275r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9615a.this.emit(null, this);
                }
            }

            public C9615a(InterfaceC43172j interfaceC43172j, g gVar) {
                this.f313272b = interfaceC43172j;
                this.f313273c = gVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r28, @Y61.k kotlin.coroutines.Continuation r29) {
                /*
                    Method dump skipped, instructions count: 510
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.g.a.C9615a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, g gVar) {
            this.f313270b = interfaceC43160i;
            this.f313271c = gVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super TypedResult<GI0.a>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f313270b.collect(new C9615a(interfaceC43172j, this.f313271c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ItemsConfigInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/ProfileItemsConfig;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.ItemsConfigRemoteInteractor$itemsConfig$1", f = "ItemsConfigInteractor.kt", i = {}, l = {36, 36}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<ProfileItemsConfig>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313277q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f313278r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = g.this.new b(continuation);
            bVar.f313278r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<ProfileItemsConfig>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313277q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f313278r;
                InterfaceC48055a interfaceC48055a = g.this.f313266a.get();
                this.f313278r = interfaceC43172j;
                this.f313277q = 1;
                obj = interfaceC48055a.b(this);
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
                interfaceC43172j = (InterfaceC43172j) this.f313278r;
                C42729a0.b(obj);
            }
            this.f313278r = null;
            this.f313277q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k h31.e<InterfaceC48055a> eVar, @Y61.k R0 r02, @Y61.k com.avito.android.service_booking_persistence.f fVar, @Y61.k C44240b c44240b) {
        this.f313266a = eVar;
        this.f313267b = r02;
        this.f313268c = fVar;
        this.f313269d = c44240b;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.a
    @Y61.k
    public final InterfaceC43160i<TypedResult<GI0.a>> a() {
        return C43175k.I(this.f313267b.a(), new a(C43175k.G(new b(null)), this));
    }
}
