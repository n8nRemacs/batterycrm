package com.avito.android.messenger_icebreakers_dialog.view;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment;
import iZ.C41367c;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment$observeViewModel$1", f = "MessengerIcebreakerBottomSheetFragment.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f197702q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197703r;

    /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment$observeViewModel$1$1", f = "MessengerIcebreakerBottomSheetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f197704q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197705r;

        /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment$observeViewModel$1$1$1", f = "MessengerIcebreakerBottomSheetFragment.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger_icebreakers_dialog.view.b$a$a, reason: collision with other inner class name */
        public static final class C5823a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f197706q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197707r;

            /* compiled from: MessengerIcebreakerBottomSheetFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LiZ/c;", "it", "Lkotlin/G0;", "emit", "(LiZ/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger_icebreakers_dialog.view.b$a$a$a, reason: collision with other inner class name */
            public static final class C5824a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MessengerIcebreakerBottomSheetFragment f197708b;

                public C5824a(MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment) {
                    this.f197708b = messengerIcebreakerBottomSheetFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Chips chips;
                    MessengerIcebreakerBottomSheetFragment.a aVar = MessengerIcebreakerBottomSheetFragment.f197675q0;
                    MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197708b;
                    ArrayList arrayList = ((C41367c) obj).f398561b;
                    if (arrayList != null && (chips = messengerIcebreakerBottomSheetFragment.f197685o0) != null) {
                        chips.setChipsSelectedListener(null);
                        chips.j();
                        chips.setData(arrayList);
                        chips.setChipsSelectedListener(new c(messengerIcebreakerBottomSheetFragment));
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5823a(MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment, Continuation<? super C5823a> continuation) {
                super(2, continuation);
                this.f197707r = messengerIcebreakerBottomSheetFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C5823a(this.f197707r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5823a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f197706q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197707r;
                    n2<C41367c> state = ((com.avito.android.messenger_icebreakers_dialog.e) messengerIcebreakerBottomSheetFragment.f197677g0.getValue()).getState();
                    C5824a c5824a = new C5824a(messengerIcebreakerBottomSheetFragment);
                    this.f197706q = 1;
                    if (state.collect(c5824a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f197705r = messengerIcebreakerBottomSheetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f197705r, continuation);
            aVar.f197704q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43259k.d((T) this.f197704q, null, null, new C5823a(this.f197705r, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f197703r = messengerIcebreakerBottomSheetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f197703r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f197702q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = this.f197703r;
            a aVar = new a(messengerIcebreakerBottomSheetFragment, null);
            this.f197702q = 1;
            if (C23056p0.b(messengerIcebreakerBottomSheetFragment, state, aVar, this) == coroutine_suspended) {
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
