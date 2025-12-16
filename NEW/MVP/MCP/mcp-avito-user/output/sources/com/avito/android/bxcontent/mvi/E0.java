package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/bxcontent/mvi/e1;", "videoItem", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Q;", "Lcom/avito/android/util/P2;", "", "Lcom/avito/conveyor_item/a;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/e1;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadShortVideos$4", f = "BxContentInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class E0 extends SuspendLambda implements Y41.p<e1, Continuation<? super InterfaceC43160i<? extends kotlin.Q<? extends e1, ? extends P2<? super List<? extends com.avito.conveyor_item.a>>>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111254q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f111255r;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<kotlin.Q<? extends e1, ? extends P2<? super List<? extends com.avito.conveyor_item.a>>>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f111256b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e1 f111257c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.mvi.E0$a$a, reason: collision with other inner class name */
        public static final class C3284a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f111258b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e1 f111259c;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadShortVideos$4$invokeSuspend$$inlined$map$1$2", f = "BxContentInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.mvi.E0$a$a$a, reason: collision with other inner class name */
            public static final class C3285a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f111260q;

                /* renamed from: r, reason: collision with root package name */
                public int f111261r;

                public C3285a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f111260q = obj;
                    this.f111261r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3284a.this.emit(null, this);
                }
            }

            public C3284a(InterfaceC43172j interfaceC43172j, e1 e1Var) {
                this.f111258b = interfaceC43172j;
                this.f111259c = e1Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.bxcontent.mvi.E0.a.C3284a.C3285a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.bxcontent.mvi.E0$a$a$a r0 = (com.avito.android.bxcontent.mvi.E0.a.C3284a.C3285a) r0
                    int r1 = r0.f111261r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f111261r = r1
                    goto L18
                L13:
                    com.avito.android.bxcontent.mvi.E0$a$a$a r0 = new com.avito.android.bxcontent.mvi.E0$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f111260q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f111261r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.util.P2 r5 = (com.avito.android.util.P2) r5
                    kotlin.Q r6 = new kotlin.Q
                    com.avito.android.bxcontent.mvi.e1 r2 = r4.f111259c
                    r6.<init>(r2, r5)
                    r0.f111261r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f111258b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.E0.a.C3284a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, e1 e1Var) {
            this.f111256b = interfaceC43160i;
            this.f111257c = e1Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super kotlin.Q<? extends e1, ? extends P2<? super List<? extends com.avito.conveyor_item.a>>>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f111256b.collect(new C3284a(interfaceC43172j, this.f111257c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(F f12, Continuation<? super E0> continuation) {
        super(2, continuation);
        this.f111255r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E0 e02 = new E0(this.f111255r, continuation);
        e02.f111254q = obj;
        return e02;
    }

    @Override // Y41.p
    public final Object invoke(e1 e1Var, Continuation<? super InterfaceC43160i<? extends kotlin.Q<? extends e1, ? extends P2<? super List<? extends com.avito.conveyor_item.a>>>>> continuation) {
        return ((E0) create(e1Var, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        e1 e1Var = (e1) this.f111254q;
        return new a(this.f111255r.f111303y.a(e1Var.f111792a, e1Var.f111794c, e1Var.f111795d), e1Var);
    }
}
