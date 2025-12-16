package com.avito.android.shift_list.domain;

import DG.e;
import Vv0.b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.di.B;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ShiftListInteractor.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shift_list/domain/a;", "", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.shift_list.mvi.a f281033a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CG.a f281034b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f281035c;

    /* compiled from: ShiftListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVv0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.shift_list.domain.ShiftListInteractor$getInfo$1", f = "ShiftListInteractor.kt", i = {0}, l = {20, 32}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.shift_list.domain.a$a, reason: collision with other inner class name */
    public static final class C8367a extends SuspendLambda implements p<InterfaceC43172j<? super Vv0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f281036q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f281037r;

        public C8367a(Continuation<? super C8367a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8367a c8367a = a.this.new C8367a(continuation);
            c8367a.f281037r = obj;
            return c8367a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vv0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8367a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Vv0.b c1213b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f281036q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f281037r;
                CG.a aVar2 = aVar.f281034b;
                this.f281037r = interfaceC43172j;
                this.f281036q = 1;
                obj = aVar2.a(null, null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f281037r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                aVar.f281035c = ((e) success.getResult()).getCursor();
                DG.l past = ((e) success.getResult()).getPast();
                c1213b = new b.C1213b(past != null ? past.getTitle() : null, aVar.f281033a.d((e) success.getResult(), true), aVar.f281035c != null);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                c1213b = b.c.f17486a;
            }
            this.f281037r = null;
            this.f281036q = 2;
            if (interfaceC43172j.emit(c1213b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ShiftListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVv0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.shift_list.domain.ShiftListInteractor$loadMore$1", f = "ShiftListInteractor.kt", i = {0}, l = {36, 47}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super Vv0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f281039q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f281040r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f281042t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f281042t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(this.f281042t, continuation);
            bVar.f281040r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vv0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Vv0.b eVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f281039q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f281040r;
                CG.a aVar2 = aVar.f281034b;
                String str = aVar.f281035c;
                this.f281040r = interfaceC43172j;
                this.f281039q = 1;
                obj = aVar2.a(str, null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f281040r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                aVar.f281035c = ((e) success.getResult()).getCursor();
                eVar = new b.e(aVar.f281033a.d((e) success.getResult(), !this.f281042t), aVar.f281035c != null);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = b.d.f17487a;
            }
            this.f281040r = null;
            this.f281039q = 2;
            if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k com.avito.android.shift_list.mvi.a aVar, @k CG.a aVar2) {
        this.f281033a = aVar;
        this.f281034b = aVar2;
    }

    @k
    public final InterfaceC43160i<Vv0.b> a() {
        return C43175k.G(new C8367a(null));
    }

    @k
    public final InterfaceC43160i<Vv0.b> b(boolean z12) {
        return C43175k.G(new b(z12, null));
    }
}
