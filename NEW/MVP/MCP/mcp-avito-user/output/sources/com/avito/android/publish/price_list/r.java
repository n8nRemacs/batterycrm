package com.avito.android.publish.price_list;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* compiled from: SelectPriceListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.price_list.SelectPriceListFragment$observeUiState$1", f = "SelectPriceListFragment.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f238924q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SelectPriceListFragment f238925r;

    /* compiled from: SelectPriceListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.price_list.SelectPriceListFragment$observeUiState$1$1", f = "SelectPriceListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f238926q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SelectPriceListFragment f238927r;

        /* compiled from: SelectPriceListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.price_list.SelectPriceListFragment$observeUiState$1$1$1", f = "SelectPriceListFragment.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.price_list.r$a$a, reason: collision with other inner class name */
        public static final class C7177a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f238928q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SelectPriceListFragment f238929r;

            /* compiled from: SelectPriceListFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/f;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/price_list/mvi/entity/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.publish.price_list.r$a$a$a, reason: collision with other inner class name */
            public static final class C7178a extends N implements Y41.l<com.avito.android.publish.price_list.mvi.entity.f, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ SelectPriceListFragment f238930l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7178a(SelectPriceListFragment selectPriceListFragment) {
                    super(1);
                    this.f238930l = selectPriceListFragment;
                }

                @Override // Y41.l
                public final G0 invoke(com.avito.android.publish.price_list.mvi.entity.f fVar) {
                    com.avito.android.publish.price_list.mvi.entity.f fVar2 = fVar;
                    z zVar = this.f238930l.f238399z0;
                    if (zVar != null) {
                        com.avito.android.progress_overlay.l lVar = zVar.f238954p;
                        if (fVar2.f238857h) {
                            lVar.k(null);
                        } else {
                            lVar.j();
                            zVar.f238953o.f236022a.setActionEnabled(fVar2.f238855f);
                            I5.a(zVar.f238947i, fVar2.f238851b, false);
                            I5.a(zVar.f238948j, fVar2.f238852c, false);
                            zVar.f238949k.setVisibility((!fVar2.f238856g || zVar.f238946h.f439745a.f439749b.b()) ? 8 : 0);
                            zVar.f238950l.setHint(fVar2.f238853d);
                            PrintableText printableText = fVar2.f238854e;
                            String strK0 = printableText != null ? printableText.k0(zVar.f238939a.getContext()) : null;
                            Button button = zVar.f238952n;
                            com.avito.android.lib.design.button.b.a(button, strK0, false);
                            int iB2 = button.getVisibility() == 0 ? y6.b(76) : 0;
                            RecyclerView recyclerView = zVar.f238951m;
                            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), iB2);
                            zVar.f238940b.c(new UV0.c(fVar2.f238858i));
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7177a(SelectPriceListFragment selectPriceListFragment, Continuation<? super C7177a> continuation) {
                super(2, continuation);
                this.f238929r = selectPriceListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7177a(this.f238929r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7177a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f238928q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    SelectPriceListFragment selectPriceListFragment = this.f238929r;
                    n2<com.avito.android.publish.price_list.mvi.entity.f> state = ((com.avito.android.publish.price_list.mvi.entity.c) selectPriceListFragment.f238389p0.getValue()).getState();
                    ScreenPerformanceTracker screenPerformanceTracker = selectPriceListFragment.f238396w0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C7178a c7178a = new C7178a(selectPriceListFragment);
                    this.f238928q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c7178a, this) == coroutine_suspended) {
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
        public a(SelectPriceListFragment selectPriceListFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f238927r = selectPriceListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f238927r, continuation);
            aVar.f238926q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43259k.d((T) this.f238926q, null, null, new C7177a(this.f238927r, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SelectPriceListFragment selectPriceListFragment, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f238925r = selectPriceListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f238925r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f238924q;
        if (i12 == 0) {
            C42729a0.b(obj);
            SelectPriceListFragment selectPriceListFragment = this.f238925r;
            InterfaceC22983P viewLifecycleOwner = selectPriceListFragment.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(selectPriceListFragment, null);
            this.f238924q = 1;
            if (C23056p0.b(viewLifecycleOwner, state, aVar, this) == coroutine_suspended) {
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
