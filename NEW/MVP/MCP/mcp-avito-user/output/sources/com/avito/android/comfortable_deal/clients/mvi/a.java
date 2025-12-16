package com.avito.android.comfortable_deal.clients.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kp.C43481g;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.clients.mvi.ClientsActor$process$$inlined$transform$1", f = "ClientsActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
public final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f120274q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120275r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f120276s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43481g f120277t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f120278u;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.clients.mvi.a$a, reason: collision with other inner class name */
    public static final class C3533a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<ClientsInternalAction> f120279b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C43481g f120280c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f120281d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.mvi.ClientsActor$process$$inlined$transform$1$1", f = "ClientsActor.kt", i = {0, 0, 0, 1, 1, 1}, l = {221, JfifUtil.MARKER_APP1, 226, 230}, m = "emit", n = {"this", "internalAction", "$this$process_u24lambda_u240", "this", "$this$process_u24lambda_u240", "query"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
        /* renamed from: com.avito.android.comfortable_deal.clients.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C3534a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f120282q;

            /* renamed from: r, reason: collision with root package name */
            public int f120283r;

            /* renamed from: t, reason: collision with root package name */
            public C3533a f120285t;

            /* renamed from: u, reason: collision with root package name */
            public Object f120286u;

            /* renamed from: v, reason: collision with root package name */
            public Object f120287v;

            public C3534a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f120282q = obj;
                this.f120283r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C3533a.this.emit(null, this);
            }
        }

        public C3533a(InterfaceC43172j interfaceC43172j, C43481g c43481g, g gVar) {
            this.f120280c = c43481g;
            this.f120281d = gVar;
            this.f120279b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
            /*
                Method dump skipped, instructions count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.mvi.a.C3533a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC43160i interfaceC43160i, Continuation continuation, C43481g c43481g, g gVar) {
        super(2, continuation);
        this.f120276s = interfaceC43160i;
        this.f120277t = c43481g;
        this.f120278u = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f120276s, continuation, this.f120277t, this.f120278u);
        aVar.f120275r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f120274q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C3533a c3533a = new C3533a((InterfaceC43172j) this.f120275r, this.f120277t, this.f120278u);
            this.f120274q = 1;
            if (this.f120276s.collect(c3533a, this) == coroutine_suspended) {
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
