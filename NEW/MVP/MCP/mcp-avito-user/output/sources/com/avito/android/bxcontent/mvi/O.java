package com.avito.android.bxcontent.mvi;

import com.avito.android.remote.model.BxContentResult;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/D1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class O implements InterfaceC43160i<TypedResult<BxContentResult>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i[] f111415b;

    /* compiled from: Zip.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/G1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<TypedResult<BxContentResult>[]> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i[] f111416l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i[] interfaceC43160iArr) {
            super(0);
            this.f111416l = interfaceC43160iArr;
        }

        @Override // Y41.a
        public final TypedResult<BxContentResult>[] invoke() {
            return new TypedResult[this.f111416l.length];
        }
    }

    /* compiled from: Zip.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/H1"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getItemListForPushContent$$inlined$combine$1$3", f = "BxContentInteractor.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super TypedResult<BxContentResult>>, TypedResult<BxContentResult>[], Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111417q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111418r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object[] f111419s;

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super TypedResult<BxContentResult>> interfaceC43172j, TypedResult<BxContentResult>[] typedResultArr, Continuation<? super kotlin.G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f111418r = interfaceC43172j;
            bVar.f111419s = typedResultArr;
            return bVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111417q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111418r;
                TypedResult[] typedResultArr = (TypedResult[]) this.f111419s;
                if (typedResultArr.length == 0) {
                    throw new UnsupportedOperationException("Empty array can't be reduced.");
                }
                TypedResult success = typedResultArr[0];
                int length = typedResultArr.length - 1;
                if (1 <= length) {
                    int i13 = 1;
                    while (true) {
                        TypedResult typedResult = typedResultArr[i13];
                        if (!(typedResult instanceof TypedResult.Error)) {
                            if (!(typedResult instanceof TypedResult.Success)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (success instanceof TypedResult.Success) {
                                TypedResult.Success success2 = (TypedResult.Success) success;
                                success = new TypedResult.Success(BxContentResult.copy$default((BxContentResult) success2.getResult(), C42745f0.h0(((BxContentResult) ((TypedResult.Success) typedResult).getResult()).getItems(), ((BxContentResult) success2.getResult()).getItems()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, -2, 7, null));
                            }
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                    }
                }
                this.f111417q = 1;
                if (interfaceC43172j.emit(success, this) == coroutine_suspended) {
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

    public O(InterfaceC43160i[] interfaceC43160iArr) {
        this.f111415b = interfaceC43160iArr;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super TypedResult<BxContentResult>> interfaceC43172j, @Y61.k Continuation continuation) {
        InterfaceC43160i[] interfaceC43160iArr = this.f111415b;
        Object objA = kotlinx.coroutines.flow.internal.n.a(new a(interfaceC43160iArr), new b(3, null), continuation, interfaceC43172j, interfaceC43160iArr);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }
}
