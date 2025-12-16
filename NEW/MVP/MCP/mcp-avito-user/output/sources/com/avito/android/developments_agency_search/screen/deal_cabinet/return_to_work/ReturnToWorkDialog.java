package com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work;

import Aw.C13093d;
import Aw.InterfaceC13090a;
import Aw.InterfaceC13092c;
import Cd.C13243a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetReturnToWorkScreen;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkArguments;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkResult;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: ReturnToWorkDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/ReturnToWorkDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnToWorkDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f137161l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.g f137162h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f137163i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f137164j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.c f137165k0;

    /* compiled from: ReturnToWorkDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/ReturnToWorkDialog$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ReturnToWorkDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog$a$a, reason: collision with other inner class name */
        public static final class C4134a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ReturnToWorkArguments f137166l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4134a(ReturnToWorkArguments returnToWorkArguments) {
                super(1);
                this.f137166l = returnToWorkArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("RETURN_TO_WORK_ARGUMENTS", this.f137166l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ReturnToWorkDialog a(@k ReturnToWorkArguments returnToWorkArguments) {
            ReturnToWorkDialog returnToWorkDialog = new ReturnToWorkDialog();
            C35966w1.a(returnToWorkDialog, -1, new C4134a(returnToWorkArguments));
            return returnToWorkDialog;
        }

        public a() {
        }
    }

    /* compiled from: ReturnToWorkDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.b) this.receiver).a(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ReturnToWorkDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog$onCreateDialog$1$2", f = "ReturnToWorkDialog.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137167q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f137168r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ReturnToWorkDialog f137169s;

        /* compiled from: ReturnToWorkDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog$onCreateDialog$1$2$1", f = "ReturnToWorkDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f137170q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ReturnToWorkDialog f137171r;

            /* compiled from: ReturnToWorkDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog$onCreateDialog$1$2$1$1", f = "ReturnToWorkDialog.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog$c$a$a, reason: collision with other inner class name */
            public static final class C4135a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f137172q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ReturnToWorkDialog f137173r;

                /* compiled from: ReturnToWorkDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C4136a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.b f137174b;

                    public C4136a(com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.b bVar) {
                        this.f137174b = bVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f137174b.b((C13093d) obj);
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
                        return new C42801a(2, this.f137174b, com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.b.class, "renderState", "renderState(Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/mvi/entity/ReturnToWorkState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4135a(ReturnToWorkDialog returnToWorkDialog, Continuation<? super C4135a> continuation) {
                    super(2, continuation);
                    this.f137173r = returnToWorkDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C4135a(this.f137173r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4135a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f137172q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ReturnToWorkDialog returnToWorkDialog = this.f137173r;
                        n2<C13093d> state = ((com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.f) returnToWorkDialog.f137163i0.getValue()).getState();
                        com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.c cVar = returnToWorkDialog.f137165k0;
                        if (cVar == null) {
                            cVar = null;
                        }
                        C4136a c4136a = new C4136a(cVar);
                        this.f137172q = 1;
                        if (state.collect(c4136a, this) == coroutine_suspended) {
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

            /* compiled from: ReturnToWorkDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog$onCreateDialog$1$2$1$2", f = "ReturnToWorkDialog.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f137175q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ReturnToWorkDialog f137176r;

                /* compiled from: ReturnToWorkDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C4137a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ReturnToWorkDialog f137177b;

                    public C4137a(ReturnToWorkDialog returnToWorkDialog) {
                        this.f137177b = returnToWorkDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC13092c interfaceC13092c = (InterfaceC13092c) obj;
                        a aVar = ReturnToWorkDialog.f137161l0;
                        ReturnToWorkDialog returnToWorkDialog = this.f137177b;
                        returnToWorkDialog.getClass();
                        if (interfaceC13092c instanceof InterfaceC13092c.b) {
                            ReturnToWorkResult returnToWorkResult = new ReturnToWorkResult(returnToWorkDialog.f5().f137204d);
                            FragmentManager parentFragmentManager = returnToWorkDialog.getParentFragmentManager();
                            ReturnToWorkArguments returnToWorkArgumentsF5 = returnToWorkDialog.f5();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("result.key", returnToWorkResult);
                            G0 g02 = G0.f406611a;
                            parentFragmentManager.o0(bundle, returnToWorkArgumentsF5.f137202b);
                            returnToWorkDialog.dismiss();
                        } else if (interfaceC13092c instanceof InterfaceC13092c.a) {
                            returnToWorkDialog.dismiss();
                        }
                        G0 g03 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g03;
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
                        return new C42801a(2, this.f137177b, ReturnToWorkDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/mvi/entity/ReturnToWorkOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ReturnToWorkDialog returnToWorkDialog, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f137176r = returnToWorkDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f137176r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f137175q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ReturnToWorkDialog returnToWorkDialog = this.f137176r;
                        InterfaceC43160i<InterfaceC13092c> events = ((com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.f) returnToWorkDialog.f137163i0.getValue()).getEvents();
                        C4137a c4137a = new C4137a(returnToWorkDialog);
                        this.f137175q = 1;
                        if (events.collect(c4137a, this) == coroutine_suspended) {
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
            public a(ReturnToWorkDialog returnToWorkDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f137171r = returnToWorkDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f137171r, continuation);
                aVar.f137170q = obj;
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
                T t12 = (T) this.f137170q;
                ReturnToWorkDialog returnToWorkDialog = this.f137171r;
                C43259k.d(t12, null, null, new C4135a(returnToWorkDialog, null), 3);
                C43259k.d(t12, null, null, new b(returnToWorkDialog, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.lib.design.bottom_sheet.d dVar, ReturnToWorkDialog returnToWorkDialog, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f137168r = dVar;
            this.f137169s = returnToWorkDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new c(this.f137168r, this.f137169s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137167q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f137169s, null);
                this.f137167q = 1;
                if (C23056p0.b(this.f137168r, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ReturnToWorkDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAw/a;", "it", "Lkotlin/G0;", "invoke", "(LAw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<InterfaceC13090a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13090a interfaceC13090a) {
            ((com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.f) ReturnToWorkDialog.this.f137163i0.getValue()).accept(interfaceC13090a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f137179l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f137179l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f137179l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ReturnToWorkDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f137181l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f137181l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f137181l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f137182l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f137182l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f137182l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f137183l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f137183l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f137183l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ReturnToWorkDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.f> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.f invoke() {
            com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.g gVar = ReturnToWorkDialog.this.f137162h0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.f) gVar.get();
        }
    }

    public ReturnToWorkDialog() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f137163i0 = new O0(m0.f406844a.b(com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.f.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.di.a.a().a((com.avito.android.developments_agency_search.screen.deal_cabinet.di.c) C29972i.a(C29972i.b(this), com.avito.android.developments_agency_search.screen.deal_cabinet.di.c.class), new C28478k(DealCabinetReturnToWorkScreen.f136784d, s.b(this), null, 4, null), f5(), new d()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f137164j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final ReturnToWorkArguments f5() {
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("RETURN_TO_WORK_ARGUMENTS", ReturnToWorkArguments.class) : bundleRequireArguments.getParcelable("RETURN_TO_WORK_ARGUMENTS");
        if (parcelable != null) {
            return (ReturnToWorkArguments) parcelable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f137164j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.j.b(dVar, false, 7);
        com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.c cVar = this.f137165k0;
        dVar.C(R.layout.return_to_work_dialog, new b(1, cVar != null ? cVar : null, com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.b.class, "attachContentView", "attachContentView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        C43259k.d(C22981N.a(dVar.getLifecycle()), null, null, new c(dVar, this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f137164j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.c cVar = this.f137165k0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.f137186b = null;
    }
}
