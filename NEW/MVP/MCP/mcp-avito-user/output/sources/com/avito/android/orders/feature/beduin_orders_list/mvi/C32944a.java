package com.avito.android.orders.feature.beduin_orders_list.mvi;

import Z40.a;
import Z40.c;
import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import n50.InterfaceC44196b;

/* compiled from: BeduinOrdersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LZ40/a;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "LZ40/c;", "a", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.orders.feature.beduin_orders_list.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32944a implements com.avito.android.arch.mvi.a<Z40.a, BeduinOrdersInternalAction, Z40.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f210074a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final z f210075b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44196b f210076c;

    /* compiled from: BeduinOrdersActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/a$a;", "", "<init>", "()V", "", "parametersModelId", "Ljava/lang/String;", "queryParameter", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.orders.feature.beduin_orders_list.mvi.a$a, reason: collision with other inner class name */
    public static final class C6274a {
        public /* synthetic */ C6274a(C42822w c42822w) {
            this();
        }

        public C6274a() {
        }
    }

    /* compiled from: BeduinOrdersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.mvi.BeduinOrdersActor$process$1", f = "BeduinOrdersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.orders.feature.beduin_orders_list.mvi.a$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BeduinOrdersInternalAction>, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C32944a.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BeduinOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C32944a.this.f210076c.Y9();
            return G0.f406611a;
        }
    }

    static {
        new C6274a(null);
    }

    @Inject
    public C32944a(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k z zVar, @Y61.k InterfaceC44196b interfaceC44196b) {
        this.f210074a = interfaceC40691b;
        this.f210075b = zVar;
        this.f210076c = interfaceC44196b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        InterfaceC43160i interfaceC43160iC = C43175k.C(new C32947d(aVar, this, null), c43197r1);
        InterfaceC43160i<String> interfaceC43160iS9 = this.f210076c.s9();
        e.a aVar2 = kotlin.time.e.f410651c;
        return C43175k.N(interfaceC43160iC, C43175k.G(new C32945b(new C43197r1(new C32946c(aVar, this, null), C43175k.p(interfaceC43160iS9, kotlin.time.g.g(800, DurationUnit.f410633e))), null)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BeduinOrdersInternalAction> b(@Y61.k Z40.a aVar, @Y61.k Z40.c cVar) {
        if (aVar instanceof a.d) {
            z zVar = this.f210075b;
            zVar.getClass();
            return C43175k.G(new y(zVar, null));
        }
        if (aVar instanceof a.c) {
            if (cVar instanceof c.a) {
                com.avito.android.beduin_shared.model.utils.a.a(this.f210074a, ((c.a) cVar).f19868i);
            }
            return C43175k.w();
        }
        if (aVar instanceof a.C1416a) {
            return new C43210w(new BeduinOrdersInternalAction.ApplyNewContentPlaceholderState(((a.C1416a) aVar).f19856a));
        }
        if (aVar.equals(a.b.f19857a)) {
            return C43175k.G(new b(null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
