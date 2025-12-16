package com.avito.android.imv_goods_poll;

import Y41.p;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.imv_goods_poll.ImvGoodsPollDialog;
import com.avito.android.imv_goods_poll.ImvGoodsPollDialogSuccess;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import fN.InterfaceC40320b;
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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;

/* compiled from: ImvGoodsPollDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.imv_goods_poll.ImvGoodsPollDialog$observeViewModel$1", f = "ImvGoodsPollDialog.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f170619q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ImvGoodsPollDialog f170620r;

    /* compiled from: ImvGoodsPollDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.imv_goods_poll.ImvGoodsPollDialog$observeViewModel$1$1", f = "ImvGoodsPollDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f170621q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ImvGoodsPollDialog f170622r;

        /* compiled from: ImvGoodsPollDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.imv_goods_poll.ImvGoodsPollDialog$observeViewModel$1$1$1", f = "ImvGoodsPollDialog.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.imv_goods_poll.d$a$a, reason: collision with other inner class name */
        public static final class C5047a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f170623q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ImvGoodsPollDialog f170624r;

            /* compiled from: ImvGoodsPollDialog.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LfN/c;", "it", "Lkotlin/G0;", "invoke", "(LfN/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.imv_goods_poll.d$a$a$a, reason: collision with other inner class name */
            public static final class C5048a extends N implements Y41.l<fN.c, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ ImvGoodsPollDialog f170625l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5048a(ImvGoodsPollDialog imvGoodsPollDialog) {
                    super(1);
                    this.f170625l = imvGoodsPollDialog;
                }

                @Override // Y41.l
                public final G0 invoke(fN.c cVar) {
                    fN.c cVar2 = cVar;
                    ImvGoodsPollDialog imvGoodsPollDialog = this.f170625l;
                    com.avito.konveyor.adapter.a aVar = imvGoodsPollDialog.f170588k0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    aVar.c(new UV0.c(cVar2.f395864b));
                    com.avito.konveyor.adapter.j jVar = imvGoodsPollDialog.f170587j0;
                    (jVar != null ? jVar : null).notifyDataSetChanged();
                    C47313c c47313c = imvGoodsPollDialog.f170593p0;
                    kotlin.reflect.n<Object> nVar = ImvGoodsPollDialog.f170584t0[3];
                    ((Button) c47313c.a()).setLoading(cVar2.f395865c);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5047a(ImvGoodsPollDialog imvGoodsPollDialog, Continuation<? super C5047a> continuation) {
                super(2, continuation);
                this.f170624r = imvGoodsPollDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C5047a(this.f170624r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5047a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f170623q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ImvGoodsPollDialog.a aVar = ImvGoodsPollDialog.f170583s0;
                    ImvGoodsPollDialog imvGoodsPollDialog = this.f170624r;
                    n2<fN.c> state = ((m) imvGoodsPollDialog.f170586i0.getValue()).getState();
                    ScreenPerformanceTracker screenPerformanceTracker = imvGoodsPollDialog.f170589l0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C5048a c5048a = new C5048a(imvGoodsPollDialog);
                    this.f170623q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5048a, this) == coroutine_suspended) {
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

        /* compiled from: ImvGoodsPollDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.imv_goods_poll.ImvGoodsPollDialog$observeViewModel$1$1$2", f = "ImvGoodsPollDialog.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f170626q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ImvGoodsPollDialog f170627r;

            /* compiled from: ImvGoodsPollDialog.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.imv_goods_poll.d$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C5049a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ImvGoodsPollDialog f170628b;

                public C5049a(ImvGoodsPollDialog imvGoodsPollDialog) {
                    this.f170628b = imvGoodsPollDialog;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC40320b interfaceC40320b = (InterfaceC40320b) obj;
                    ImvGoodsPollDialog.a aVar = ImvGoodsPollDialog.f170583s0;
                    ImvGoodsPollDialog imvGoodsPollDialog = this.f170628b;
                    if (L.f(interfaceC40320b, InterfaceC40320b.C11147b.f395861a)) {
                        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) imvGoodsPollDialog.getDialog();
                        PrintableText printableTextF = com.avito.android.printable_text.b.f(imvGoodsPollDialog.getString(R.string.imv_goods_poll_general_error));
                        f.c.f125255c.getClass();
                        com.avito.android.component.toast.c.d(cVar, dVar, printableTextF, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
                    } else if (L.f(interfaceC40320b, InterfaceC40320b.a.f395860a)) {
                        imvGoodsPollDialog.f170595r0 = true;
                        imvGoodsPollDialog.dismiss();
                        ImvGoodsPollDialogSuccess.a aVar2 = ImvGoodsPollDialogSuccess.f170603l0;
                        ImvGoodsPollParams imvGoodsPollParamsF5 = imvGoodsPollDialog.f5();
                        aVar2.getClass();
                        ImvGoodsPollDialogSuccess imvGoodsPollDialogSuccess = new ImvGoodsPollDialogSuccess();
                        imvGoodsPollDialogSuccess.f170605h0.setValue(imvGoodsPollDialogSuccess, ImvGoodsPollDialogSuccess.f170604m0[0], imvGoodsPollParamsF5);
                        imvGoodsPollDialogSuccess.show(imvGoodsPollDialog.getParentFragmentManager(), "imv_goods_poll_dialog_done");
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
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f170628b, ImvGoodsPollDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ImvGoodsPollDialog imvGoodsPollDialog, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f170627r = imvGoodsPollDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f170627r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f170626q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ImvGoodsPollDialog.a aVar = ImvGoodsPollDialog.f170583s0;
                    ImvGoodsPollDialog imvGoodsPollDialog = this.f170627r;
                    InterfaceC43160i<InterfaceC40320b> events = ((m) imvGoodsPollDialog.f170586i0.getValue()).getEvents();
                    C5049a c5049a = new C5049a(imvGoodsPollDialog);
                    this.f170626q = 1;
                    if (events.collect(c5049a, this) == coroutine_suspended) {
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
        public a(ImvGoodsPollDialog imvGoodsPollDialog, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f170622r = imvGoodsPollDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f170622r, continuation);
            aVar.f170621q = obj;
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
            T t12 = (T) this.f170621q;
            ImvGoodsPollDialog imvGoodsPollDialog = this.f170622r;
            C43259k.d(t12, null, null, new C5047a(imvGoodsPollDialog, null), 3);
            C43259k.d(t12, null, null, new b(imvGoodsPollDialog, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ImvGoodsPollDialog imvGoodsPollDialog, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f170620r = imvGoodsPollDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f170620r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f170619q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ImvGoodsPollDialog imvGoodsPollDialog = this.f170620r;
            a aVar = new a(imvGoodsPollDialog, null);
            this.f170619q = 1;
            if (C23056p0.b(imvGoodsPollDialog, state, aVar, this) == coroutine_suspended) {
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
