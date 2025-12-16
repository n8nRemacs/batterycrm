package com.avito.android.item_price_history.presentation;

import EO.b;
import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Build;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.item_price_history.presentation.ItemPriceHistoryDialogFragment;
import com.avito.android.item_price_history.presentation.mvi.entity.IsFavoriteState;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: ItemPriceHistoryDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.item_price_history.presentation.ItemPriceHistoryDialogFragment$onInflated$2$1", f = "ItemPriceHistoryDialogFragment.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f173723q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ItemPriceHistoryDialogFragment f173724r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f173725s;

    /* compiled from: ItemPriceHistoryDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.item_price_history.presentation.ItemPriceHistoryDialogFragment$onInflated$2$1$1", f = "ItemPriceHistoryDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f173726q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ItemPriceHistoryDialogFragment f173727r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ h f173728s;

        /* compiled from: ItemPriceHistoryDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.item_price_history.presentation.ItemPriceHistoryDialogFragment$onInflated$2$1$1$1", f = "ItemPriceHistoryDialogFragment.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.item_price_history.presentation.d$a$a, reason: collision with other inner class name */
        public static final class C5115a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f173729q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ItemPriceHistoryDialogFragment f173730r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ h f173731s;

            /* compiled from: ItemPriceHistoryDialogFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEO/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LEO/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.item_price_history.presentation.d$a$a$a, reason: collision with other inner class name */
            public static final class C5116a extends N implements l<EO.c, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ h f173732l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ ItemPriceHistoryDialogFragment f173733m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5116a(h hVar, ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment) {
                    super(1);
                    this.f173732l = hVar;
                    this.f173733m = itemPriceHistoryDialogFragment;
                }

                @Override // Y41.l
                public final G0 invoke(EO.c cVar) {
                    EO.c cVar2 = cVar;
                    this.f173732l.f173738a.c(new UV0.c(cVar2.f4004c.f4007a));
                    ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = this.f173733m;
                    FloatingContainer floatingContainer = itemPriceHistoryDialogFragment.f173695p0;
                    if (floatingContainer != null) {
                        itemPriceHistoryDialogFragment.g5(floatingContainer, cVar2.f4006e ? IsFavoriteState.f173797c : IsFavoriteState.f173798d);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5115a(ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment, h hVar, Continuation<? super C5115a> continuation) {
                super(2, continuation);
                this.f173730r = itemPriceHistoryDialogFragment;
                this.f173731s = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C5115a(this.f173730r, this.f173731s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5115a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f173729q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ItemPriceHistoryDialogFragment.a aVar = ItemPriceHistoryDialogFragment.f173686u0;
                    ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = this.f173730r;
                    n2<EO.c> state = itemPriceHistoryDialogFragment.f5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = itemPriceHistoryDialogFragment.f173689j0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C5116a c5116a = new C5116a(this.f173731s, itemPriceHistoryDialogFragment);
                    this.f173729q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5116a, this) == coroutine_suspended) {
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

        /* compiled from: ItemPriceHistoryDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.item_price_history.presentation.ItemPriceHistoryDialogFragment$onInflated$2$1$1$2", f = "ItemPriceHistoryDialogFragment.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f173734q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ItemPriceHistoryDialogFragment f173735r;

            /* compiled from: ItemPriceHistoryDialogFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.item_price_history.presentation.d$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C5117a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ItemPriceHistoryDialogFragment f173736b;

                public C5117a(ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment) {
                    this.f173736b = itemPriceHistoryDialogFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    FloatingContainer floatingContainer;
                    EO.b bVar = (EO.b) obj;
                    ItemPriceHistoryDialogFragment.a aVar = ItemPriceHistoryDialogFragment.f173686u0;
                    ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = this.f173736b;
                    itemPriceHistoryDialogFragment.getClass();
                    if (bVar instanceof b.c) {
                        ItemPriceHistoryDialogFragment.c cVar = itemPriceHistoryDialogFragment.f173693n0;
                        if (cVar != null) {
                            b.c cVar2 = (b.c) bVar;
                            com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, cVar, cVar2.f3998a, null, new f.c(cVar2.f3999b), 0, ToastBarPosition.f181046d, 942);
                        }
                    } else if (bVar instanceof b.a) {
                        FloatingContainer floatingContainer2 = itemPriceHistoryDialogFragment.f173695p0;
                        if (floatingContainer2 != null) {
                            itemPriceHistoryDialogFragment.g5(floatingContainer2, ((b.a) bVar).f3996a);
                        }
                    } else if (bVar instanceof b.d) {
                        FloatingContainer floatingContainer3 = itemPriceHistoryDialogFragment.f173695p0;
                        itemPriceHistoryDialogFragment.f173694o0 = floatingContainer3 != null ? com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, floatingContainer3, com.avito.android.printable_text.b.f(itemPriceHistoryDialogFragment.getString(R.string.item_price_history_item_added_to_favorites)), null, Collections.singletonList(new c.a.C3719a(itemPriceHistoryDialogFragment.getString(R.string.item_price_history_to_the_profile), true, null, new com.avito.android.item_price_history.presentation.b(itemPriceHistoryDialogFragment), 4, null)), null, null, 5000, ToastBarPosition.f181044b, null, false, false, null, null, 3994) : null;
                    } else if ((bVar instanceof b.C0232b) && Build.VERSION.SDK_INT >= 30 && (floatingContainer = itemPriceHistoryDialogFragment.f173695p0) != null) {
                        floatingContainer.performHapticFeedback(16);
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f173736b, ItemPriceHistoryDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f173735r = itemPriceHistoryDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new b(this.f173735r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f173734q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ItemPriceHistoryDialogFragment.a aVar = ItemPriceHistoryDialogFragment.f173686u0;
                    ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = this.f173735r;
                    InterfaceC43160i<EO.b> events = itemPriceHistoryDialogFragment.f5().getEvents();
                    C5117a c5117a = new C5117a(itemPriceHistoryDialogFragment);
                    this.f173734q = 1;
                    if (events.collect(c5117a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment, h hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f173727r = itemPriceHistoryDialogFragment;
            this.f173728s = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f173727r, this.f173728s, continuation);
            aVar.f173726q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f173726q;
            h hVar = this.f173728s;
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = this.f173727r;
            C43259k.d(t12, null, null, new C5115a(itemPriceHistoryDialogFragment, hVar, null), 3);
            C43259k.d(t12, null, null, new b(itemPriceHistoryDialogFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment, h hVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f173724r = itemPriceHistoryDialogFragment;
        this.f173725s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new d(this.f173724r, this.f173725s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f173723q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            h hVar = this.f173725s;
            ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment = this.f173724r;
            a aVar = new a(itemPriceHistoryDialogFragment, hVar, null);
            this.f173723q = 1;
            if (C23056p0.b(itemPriceHistoryDialogFragment, state, aVar, this) == coroutine_suspended) {
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
