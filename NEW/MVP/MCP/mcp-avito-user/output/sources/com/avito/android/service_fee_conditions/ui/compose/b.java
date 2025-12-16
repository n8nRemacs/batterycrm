package com.avito.android.service_fee_conditions.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qu0.InterfaceC47450b;

/* compiled from: ServiceFeeConditionsScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_fee_conditions.ui.compose.ServiceFeeConditionsScreenKt$ServiceFeeConditionsScreen$1", f = "ServiceFeeConditionsScreen.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f278490q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC47450b> f278491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f278492s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f278493t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f278494u;

    /* compiled from: ServiceFeeConditionsScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqu0/b;", "event", "Lkotlin/G0;", "emit", "(Lqu0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f278495b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f278496c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f278497d;

        public a(androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
            this.f278495b = mVar;
            this.f278496c = interfaceC22204y1;
            this.f278497d = interfaceC22204y12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC47450b interfaceC47450b = (InterfaceC47450b) obj;
            if (interfaceC47450b instanceof InterfaceC47450b.a) {
                androidx.appcompat.app.m mVar = this.f278495b;
                if (mVar != null) {
                    mVar.onBackPressed();
                }
            } else if (interfaceC47450b instanceof InterfaceC47450b.c) {
                Y41.l lVar = (Y41.l) this.f278496c.getF42167b();
                ((InterfaceC47450b.c) interfaceC47450b).getClass();
                lVar.invoke(null);
            } else if (interfaceC47450b instanceof InterfaceC47450b.C12343b) {
                ((Y41.a) this.f278497d.getF42167b()).invoke();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC43160i interfaceC43160i, androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
        super(2, continuation);
        this.f278491r = interfaceC43160i;
        this.f278492s = mVar;
        this.f278493t = interfaceC22204y1;
        this.f278494u = interfaceC22204y12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f278491r, this.f278492s, this.f278493t, this.f278494u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f278490q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f278492s, this.f278493t, this.f278494u);
            this.f278490q = 1;
            if (this.f278491r.collect(aVar, this) == coroutine_suspended) {
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
