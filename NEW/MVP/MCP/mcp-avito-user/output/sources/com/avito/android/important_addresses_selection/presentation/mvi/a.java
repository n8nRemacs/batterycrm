package com.avito.android.important_addresses_selection.presentation.mvi;

import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import com.avito.android.important_addresses_selection.presentation.mvi.entity.ImportantAddressesSelectionInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImportantAddressesSelectionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.important_addresses_selection.presentation.mvi.ImportantAddressesSelectionActor$process$1", f = "ImportantAddressesSelectionActor.kt", i = {1, 2}, l = {34, 40, 41, 51}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ImportantAddressesSelectionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f169863q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f169864r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.important_addresses_selection.presentation.mvi.b f169865s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SM.c f169866t;

    /* compiled from: ImportantAddressesSelectionActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "result", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.important_addresses_selection.presentation.mvi.ImportantAddressesSelectionActor$process$1$internalAction$1", f = "ImportantAddressesSelectionActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.important_addresses_selection.presentation.mvi.a$a, reason: collision with other inner class name */
    public static final class C5025a extends SuspendLambda implements Y41.p<ImportantAddressesData, Continuation<? super ImportantAddressesSelectionInternalAction>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f169867q;

        public C5025a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C5025a c5025a = new C5025a(2, continuation);
            c5025a.f169867q = obj;
            return c5025a;
        }

        @Override // Y41.p
        public final Object invoke(ImportantAddressesData importantAddressesData, Continuation<? super ImportantAddressesSelectionInternalAction> continuation) {
            return ((C5025a) create(importantAddressesData, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return new ImportantAddressesSelectionInternalAction.CloseWithResult((ImportantAddressesData) this.f169867q);
        }
    }

    /* compiled from: ImportantAddressesSelectionActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "message", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.important_addresses_selection.presentation.mvi.ImportantAddressesSelectionActor$process$1$internalAction$2", f = "ImportantAddressesSelectionActor.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"message"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<String, Continuation<? super ImportantAddressesSelectionInternalAction>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f169868q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f169869r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.important_addresses_selection.presentation.mvi.b f169870s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.important_addresses_selection.presentation.mvi.b bVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f169870s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f169870s, continuation);
            bVar.f169869r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super ImportantAddressesSelectionInternalAction> continuation) {
            return ((b) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f169868q;
            if (i12 == 0) {
                C42729a0.b(obj);
                String str2 = (String) this.f169869r;
                this.f169869r = str2;
                this.f169868q = 1;
                if (C43131e0.b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f169869r;
                C42729a0.b(obj);
            }
            com.avito.android.important_addresses_selection.presentation.mvi.b bVar = this.f169870s;
            bVar.f169871a.a(bVar.f169872b.f169766h);
            return new ImportantAddressesSelectionInternalAction.ShowError(com.avito.android.printable_text.b.f(str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.important_addresses_selection.presentation.mvi.b bVar, SM.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f169865s = bVar;
        this.f169866t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f169865s, this.f169866t, continuation);
        aVar.f169864r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ImportantAddressesSelectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01e3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.important_addresses_selection.presentation.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
