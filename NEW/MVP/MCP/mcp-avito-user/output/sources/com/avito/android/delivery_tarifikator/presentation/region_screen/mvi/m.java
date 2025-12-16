package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.delivery_tarifikator.domain.x0;
import com.avito.android.delivery_tarifikator.presentation.region_screen.RegionScreenParams;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
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

/* compiled from: TarifikatorRegionBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/m;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements com.avito.android.arch.mvi.b<TarifikatorRegionInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RegionScreenParams f135850a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x0 f135851b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.TarifikatorRegionBootstrap$produce$$inlined$transform$1", f = "TarifikatorRegionBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TarifikatorRegionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135852q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f135853r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f135854s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m f135855t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m$a$a, reason: collision with other inner class name */
        public static final class C4108a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<TarifikatorRegionInternalAction> f135856b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f135857c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.TarifikatorRegionBootstrap$produce$$inlined$transform$1$1", f = "TarifikatorRegionBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m$a$a$a, reason: collision with other inner class name */
            public static final class C4109a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f135858q;

                /* renamed from: r, reason: collision with root package name */
                public int f135859r;

                public C4109a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f135858q = obj;
                    this.f135859r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C4108a.this.emit(null, this);
                }
            }

            public C4108a(InterfaceC43172j interfaceC43172j, m mVar) {
                this.f135857c = mVar;
                this.f135856b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m.a.C4108a.C4109a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m$a$a$a r0 = (com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m.a.C4108a.C4109a) r0
                    int r1 = r0.f135859r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135859r = r1
                    goto L18
                L13:
                    com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m$a$a$a r0 = new com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f135858q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f135859r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    Ov.p r5 = (Ov.p) r5
                    com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction$InitScreen r6 = new com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction$InitScreen
                    com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m r2 = r4.f135857c
                    com.avito.android.delivery_tarifikator.presentation.region_screen.RegionScreenParams r2 = r2.f135850a
                    java.lang.String r2 = r2.f135742b
                    com.avito.android.remote.model.text.AttributedText r5 = r5.f12705b
                    r6.<init>(r2, r5)
                    r0.f135859r = r3
                    kotlinx.coroutines.flow.j<com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction> r5 = r4.f135856b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.m.a.C4108a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, Continuation continuation, m mVar) {
            super(2, continuation);
            this.f135854s = interfaceC43160i;
            this.f135855t = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f135854s, continuation, this.f135855t);
            aVar.f135853r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TarifikatorRegionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f135852q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C4108a c4108a = new C4108a((InterfaceC43172j) this.f135853r, this.f135855t);
                this.f135852q = 1;
                if (this.f135854s.collect(c4108a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public m(@Y61.k RegionScreenParams regionScreenParams, @Y61.k x0 x0Var) {
        this.f135850a = regionScreenParams;
        this.f135851b = x0Var;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TarifikatorRegionInternalAction> a() {
        return C43175k.G(new a(this.f135851b.getData(), null, this));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
