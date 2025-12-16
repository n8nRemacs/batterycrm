package com.avito.android.advert_collection_adding;

import L7.a;
import L7.b;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert_collection_adding.A;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: AdvertCollectionAddingDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_collection_adding/AdvertCollectionAddingDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertCollectionAddingDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f81724n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public A.a f81725h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public w f81726i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_core.c f81727j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f81728k0;

    /* renamed from: l0, reason: collision with root package name */
    public z f81729l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final O0 f81730m0;

    /* compiled from: AdvertCollectionAddingDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_collection_adding/AdvertCollectionAddingDialog$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertCollectionAddingDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog$onCreateDialog$1", f = "AdvertCollectionAddingDialog.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81731q;

        /* compiled from: AdvertCollectionAddingDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog$onCreateDialog$1$1", f = "AdvertCollectionAddingDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f81733q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AdvertCollectionAddingDialog f81734r;

            /* compiled from: AdvertCollectionAddingDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog$onCreateDialog$1$1$1", f = "AdvertCollectionAddingDialog.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog$b$a$a, reason: collision with other inner class name */
            public static final class C2419a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f81735q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AdvertCollectionAddingDialog f81736r;

                /* compiled from: AdvertCollectionAddingDialog.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog$b$a$a$a, reason: collision with other inner class name */
                public static final class C2420a extends N implements Y41.l<AdvertCollectionAddingState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ AdvertCollectionAddingDialog f81737l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2420a(AdvertCollectionAddingDialog advertCollectionAddingDialog) {
                        super(1);
                        this.f81737l = advertCollectionAddingDialog;
                    }

                    @Override // Y41.l
                    public final G0 invoke(AdvertCollectionAddingState advertCollectionAddingState) {
                        final AdvertCollectionAddingState advertCollectionAddingState2 = advertCollectionAddingState;
                        AdvertCollectionAddingDialog advertCollectionAddingDialog = this.f81737l;
                        w wVar = advertCollectionAddingDialog.f81726i0;
                        if (wVar == null) {
                            wVar = null;
                        }
                        z zVar = advertCollectionAddingDialog.f81729l0;
                        final z zVar2 = zVar != null ? zVar : null;
                        final com.avito.android.advert_collection_adding.g gVar = new com.avito.android.advert_collection_adding.g(1, (A) advertCollectionAddingDialog.f81730m0.getValue(), A.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        wVar.getClass();
                        boolean z12 = advertCollectionAddingState2 instanceof AdvertCollectionAddingState.Create;
                        Button button = zVar2.f81960g;
                        TextView textView = zVar2.f81955b;
                        Group group = zVar2.f81964k;
                        Group group2 = zVar2.f81963j;
                        Button button2 = zVar2.f81961h;
                        if (z12) {
                            D6.w(group2);
                            D6.G(group, true);
                            textView.setText(R.string.create_collection);
                            String str = ((AdvertCollectionAddingState.Create) advertCollectionAddingState2).f81895g;
                            button2.setEnabled(str.length() >= 3);
                            button2.setLoading(((AdvertCollectionAddingState.Create) advertCollectionAddingState2).f81893e);
                            TextView textView2 = zVar2.f81956c;
                            textView2.setText(textView2.getResources().getQuantityString(R.plurals.collection_description, wVar.f81953d.size()));
                            int length = 128 - str.length();
                            boolean z13 = 10 >= length;
                            TextView textView3 = zVar2.f81957d;
                            D6.G(textView3, z13);
                            textView3.setText(textView2.getResources().getQuantityString(R.plurals.name_size_limit, length, Integer.valueOf(length)));
                        } else if (advertCollectionAddingState2 instanceof AdvertCollectionAddingState.Select) {
                            D6.G(group2, true);
                            D6.w(group);
                            textView.setText(R.string.select_collection);
                            button.setLoading(((AdvertCollectionAddingState.Select) advertCollectionAddingState2).f81897e);
                            wVar.f81950a.c(new UV0.c(((AdvertCollectionAddingState.Select) advertCollectionAddingState2).f81898f));
                            wVar.f81951b.notifyDataSetChanged();
                        }
                        button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert_collection_adding.r
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                K2.d(zVar2.f81958e, true);
                                if (advertCollectionAddingState2.getF81897e()) {
                                    return;
                                }
                                ((g) gVar).invoke(a.d.f9801a);
                            }
                        });
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert_collection_adding.s
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (advertCollectionAddingState2.getF81897e()) {
                                    return;
                                }
                                ((g) gVar).invoke(a.e.f9802a);
                            }
                        });
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2419a(AdvertCollectionAddingDialog advertCollectionAddingDialog, Continuation<? super C2419a> continuation) {
                    super(2, continuation);
                    this.f81736r = advertCollectionAddingDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2419a(this.f81736r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2419a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f81735q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = AdvertCollectionAddingDialog.f81724n0;
                        AdvertCollectionAddingDialog advertCollectionAddingDialog = this.f81736r;
                        n2<AdvertCollectionAddingState> state = ((A) advertCollectionAddingDialog.f81730m0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = advertCollectionAddingDialog.f81728k0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C2420a c2420a = new C2420a(advertCollectionAddingDialog);
                        this.f81735q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c2420a, this) == coroutine_suspended) {
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

            /* compiled from: AdvertCollectionAddingDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog$onCreateDialog$1$1$2", f = "AdvertCollectionAddingDialog.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog$b$a$b, reason: collision with other inner class name */
            public static final class C2421b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f81738q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AdvertCollectionAddingDialog f81739r;

                /* compiled from: AdvertCollectionAddingDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C2422a implements InterfaceC43172j, kotlin.jvm.internal.D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AdvertCollectionAddingDialog f81740b;

                    public C2422a(AdvertCollectionAddingDialog advertCollectionAddingDialog) {
                        this.f81740b = advertCollectionAddingDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        L7.b bVar = (L7.b) obj;
                        a aVar = AdvertCollectionAddingDialog.f81724n0;
                        AdvertCollectionAddingDialog advertCollectionAddingDialog = this.f81740b;
                        if (bVar instanceof b.InterfaceC0605b.a) {
                            Bundle bundleB = C22777e.b(new Q("collection_id", ((b.InterfaceC0605b.a) bVar).f9804a));
                            FragmentManager parentFragmentManager = advertCollectionAddingDialog.getParentFragmentManager();
                            String tag = advertCollectionAddingDialog.getTag();
                            parentFragmentManager.o0(bundleB, tag != null ? tag : "");
                            com.avito.android.advert_collection_core.c cVar = advertCollectionAddingDialog.f81727j0;
                            (cVar != null ? cVar : null).a();
                            advertCollectionAddingDialog.dismiss();
                        } else if (bVar instanceof b.InterfaceC0605b.C0606b) {
                            Bundle bundleB2 = C22777e.b(new Q("advert_collection", ((b.InterfaceC0605b.C0606b) bVar).f9805a));
                            FragmentManager parentFragmentManager2 = advertCollectionAddingDialog.getParentFragmentManager();
                            String tag2 = advertCollectionAddingDialog.getTag();
                            parentFragmentManager2.o0(bundleB2, tag2 != null ? tag2 : "");
                            advertCollectionAddingDialog.dismiss();
                        } else if (L.f(bVar, b.a.f9803a)) {
                            z zVar = advertCollectionAddingDialog.f81729l0;
                            K2.d((zVar != null ? zVar : null).f81958e, true);
                            advertCollectionAddingDialog.dismiss();
                        } else if (bVar instanceof b.c) {
                            com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                            z zVar2 = advertCollectionAddingDialog.f81729l0;
                            com.avito.android.lib.design.bottom_sheet.d dVar = (zVar2 != null ? zVar2 : null).f81954a;
                            PrintableText printableTextF = com.avito.android.printable_text.b.f(((b.c) bVar).f9806a);
                            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                            f.c.f125255c.getClass();
                            com.avito.android.component.toast.c.d(cVar2, dVar, printableTextF, null, f.c.a.b(), 0, toastBarPosition, 942);
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                            return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f81740b, AdvertCollectionAddingDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2421b(AdvertCollectionAddingDialog advertCollectionAddingDialog, Continuation<? super C2421b> continuation) {
                    super(2, continuation);
                    this.f81739r = advertCollectionAddingDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2421b(this.f81739r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2421b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f81738q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = AdvertCollectionAddingDialog.f81724n0;
                        AdvertCollectionAddingDialog advertCollectionAddingDialog = this.f81739r;
                        InterfaceC43160i<L7.b> events = ((A) advertCollectionAddingDialog.f81730m0.getValue()).getEvents();
                        C2422a c2422a = new C2422a(advertCollectionAddingDialog);
                        this.f81738q = 1;
                        if (events.collect(c2422a, this) == coroutine_suspended) {
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
            public a(AdvertCollectionAddingDialog advertCollectionAddingDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f81734r = advertCollectionAddingDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f81734r, continuation);
                aVar.f81733q = obj;
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
                T t12 = (T) this.f81733q;
                AdvertCollectionAddingDialog advertCollectionAddingDialog = this.f81734r;
                C43259k.d(t12, null, null, new C2419a(advertCollectionAddingDialog, null), 3);
                C43259k.d(t12, null, null, new C2421b(advertCollectionAddingDialog, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return AdvertCollectionAddingDialog.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81731q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                AdvertCollectionAddingDialog advertCollectionAddingDialog = AdvertCollectionAddingDialog.this;
                a aVar = new a(advertCollectionAddingDialog, null);
                this.f81731q = 1;
                if (C23056p0.b(advertCollectionAddingDialog, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: AdvertCollectionAddingDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<L7.a, G0> {
        @Override // Y41.l
        public final G0 invoke(L7.a aVar) {
            ((A) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f81742m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f81742m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(AdvertCollectionAddingDialog.this, this.f81742m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AdvertCollectionAddingDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f81744l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f81744l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f81744l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f81745l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f81745l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f81745l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f81746l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f81746l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f81746l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AdvertCollectionAddingDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/advert_collection_adding/A;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/advert_collection_adding/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<C23060r0, A> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final A invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            A.a aVar = AdvertCollectionAddingDialog.this.f81725h0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public AdvertCollectionAddingDialog() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f81730m0 = new O0(m0.f406844a.b(A.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        AdvertCollectionAddingArgument advertCollectionAddingArgument = arguments != null ? (AdvertCollectionAddingArgument) arguments.getParcelable("arguments") : null;
        if (advertCollectionAddingArgument == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.advert_collection_adding.di.i.a().a((com.avito.android.advert_collection_adding.di.e) C29972i.a(C29972i.b(this), com.avito.android.advert_collection_adding.di.e.class), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), com.avito.android.analytics.screens.s.b(this), advertCollectionAddingArgument.f81722b, bundle != null, advertCollectionAddingArgument.f81723c).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f81728k0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f81728k0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Dialog_Re23));
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextThemeWrapperB, R.style.AdvertCollectionAddingDialog);
        dVar.setContentView(R.layout.advert_collection_adding_dialog);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.g(contextThemeWrapperB).y);
        dVar.setCanceledOnTouchOutside(true);
        z zVar = new z(dVar);
        this.f81729l0 = zVar;
        w wVar = this.f81726i0;
        if (wVar == null) {
            wVar = null;
        }
        c cVar = new c(1, (A) this.f81730m0.getValue(), A.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        zVar.f81962i.setAdapter(wVar.f81951b);
        C43175k.K(new C43152f0(new C43197r1(new t(cVar, null), C23069w.a(wVar.f81952c.g(), getLifecycle(), Lifecycle.State.f46682e)), new u(3, null)), C22981N.a(getLifecycle()));
        com.avito.android.lib.design.input.n.c(zVar.f81958e, new v(cVar));
        zVar.f81959f.setOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(2, cVar));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f81728k0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Bundle bundle = Bundle.EMPTY;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        String tag = getTag();
        if (tag == null) {
            tag = "";
        }
        parentFragmentManager.o0(bundle, tag);
    }
}
