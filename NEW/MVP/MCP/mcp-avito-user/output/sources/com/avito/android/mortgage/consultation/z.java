package com.avito.android.mortgage.consultation;

import XZ.c;
import com.avito.android.printable_text.PrintableText;
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

/* compiled from: MortgageConsultationScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.consultation.MortgageConsultationScreenKt$MortgageConsultationScreen$1", f = "MortgageConsultationScreen.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class z extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f198668q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<XZ.c> f198669r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PrintableText, G0> f198670s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PrintableText, G0> f198671t;

    /* compiled from: MortgageConsultationScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXZ/c;", "it", "Lkotlin/G0;", "emit", "(LXZ/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<PrintableText, G0> f198672b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<PrintableText, G0> f198673c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super PrintableText, G0> lVar, Y41.l<? super PrintableText, G0> lVar2) {
            this.f198672b = lVar;
            this.f198673c = lVar2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            XZ.c cVar = (XZ.c) obj;
            if (cVar instanceof c.a) {
                this.f198672b.invoke(((c.a) cVar).f18910a);
            } else if (cVar instanceof c.b) {
                this.f198673c.invoke(((c.b) cVar).f18911a);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(InterfaceC43160i<? extends XZ.c> interfaceC43160i, Y41.l<? super PrintableText, G0> lVar, Y41.l<? super PrintableText, G0> lVar2, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f198669r = interfaceC43160i;
        this.f198670s = lVar;
        this.f198671t = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new z(this.f198669r, this.f198670s, this.f198671t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f198668q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f198670s, this.f198671t);
            this.f198668q = 1;
            if (this.f198669r.collect(aVar, this) == coroutine_suspended) {
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
