package com.akita.compose.component.bottom_sheet;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.component.bottom_sheet.BottomSheetKt$BottomSheet$9", f = "BottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.akita.compose.component.bottom_sheet.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27325n extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f60673q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f60674r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I f60675s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60676t;

    /* compiled from: BottomSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.bottom_sheet.BottomSheetKt$BottomSheet$9$1", f = "BottomSheet.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.akita.compose.component.bottom_sheet.n$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f60677q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ I f60678r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f60678r = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f60678r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f60677q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f60677q = 1;
                if (this.f60678r.c(this) == coroutine_suspended) {
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

    /* compiled from: BottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/akita/compose/component/bottom_sheet/SheetValue;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.component.bottom_sheet.n$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<SheetValue> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I f60679l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I i12) {
            super(0);
            this.f60679l = i12;
        }

        @Override // Y41.a
        public final SheetValue invoke() {
            return (SheetValue) ((C22082i3) this.f60679l.f60524d.f27968g).getF42167b();
        }
    }

    /* compiled from: BottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/SheetValue;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/akita/compose/component/bottom_sheet/SheetValue;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.bottom_sheet.BottomSheetKt$BottomSheet$9$3", f = "BottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.akita.compose.component.bottom_sheet.n$c */
    public static final class c extends SuspendLambda implements Y41.p<SheetValue, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ I f60680q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f60681r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar, I i12, Continuation continuation) {
            super(2, continuation);
            this.f60680q = i12;
            this.f60681r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f60681r, this.f60680q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(SheetValue sheetValue, Continuation<? super G0> continuation) {
            return ((c) create(sheetValue, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (!this.f60680q.b()) {
                this.f60681r.invoke();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27325n(kotlinx.coroutines.T t12, I i12, Y41.a<G0> aVar, Continuation<? super C27325n> continuation) {
        super(2, continuation);
        this.f60674r = t12;
        this.f60675s = i12;
        this.f60676t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C27325n c27325n = new C27325n(this.f60674r, this.f60675s, this.f60676t, continuation);
        c27325n.f60673q = obj;
        return c27325n;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C27325n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f60673q;
        I i12 = this.f60675s;
        C43259k.d(this.f60674r, null, null, new a(i12, null), 3);
        C43175k.K(new C43197r1(new c(this.f60676t, i12, null), C43175k.t(C22126m3.n(new b(i12)), 1)), t12);
        return G0.f406611a;
    }
}
