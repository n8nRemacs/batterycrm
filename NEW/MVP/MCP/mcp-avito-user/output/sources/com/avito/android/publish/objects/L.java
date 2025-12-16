package com.avito.android.publish.objects;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43183m1;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ObjectFillFormViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.objects.ObjectFillFormViewModel$observeItemPresenterEvents$1$20", f = "ObjectFillFormViewModel.kt", i = {}, l = {487}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class L extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f237496q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.blueprints.selector_card_group_bottom_sheet.l f237497r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33975x f237498s;

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$F;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/category_parameters/ParameterElement$F;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C33975x f237499b;

        public a(C33975x c33975x) {
            this.f237499b = c33975x;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f237499b.G((ParameterElement.F) obj);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(com.avito.android.blueprints.selector_card_group_bottom_sheet.l lVar, C33975x c33975x, Continuation continuation) {
        super(2, continuation);
        this.f237497r = lVar;
        this.f237498s = c33975x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new L(this.f237497r, this.f237498s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((L) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f237496q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43183m1 c43183m1 = new C43183m1(this.f237497r.getF236837c(), kotlin.jvm.internal.m0.f406844a.b(ParameterElement.F.class));
            a aVar = new a(this.f237498s);
            this.f237496q = 1;
            if (c43183m1.collect(aVar, this) == coroutine_suspended) {
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
