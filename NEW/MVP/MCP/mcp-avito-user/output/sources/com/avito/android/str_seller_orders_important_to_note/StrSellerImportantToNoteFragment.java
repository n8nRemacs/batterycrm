package com.avito.android.str_seller_orders_important_to_note;

import Cd.C13243a;
import Y41.p;
import aA0.InterfaceC19747a;
import aA0.b;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35968w3;
import com.avito.android.webview.l;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: StrSellerImportantToNoteFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/StrSellerImportantToNoteFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrSellerImportantToNoteFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public k f291218h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f291219i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f291220j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f291221k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f291222l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public l f291223m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public TextView f291224n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f291225o0;

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f291217q0 = {m0.f406844a.e(new Y(StrSellerImportantToNoteFragment.class, "openParams", "getOpenParams()Lcom/avito/android/str_seller_orders_important_to_note/ImportantToNoteOpenParams;", 0))};

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final a f291216p0 = new a(null);

    /* compiled from: StrSellerImportantToNoteFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/StrSellerImportantToNoteFragment$a;", "", "<init>", "()V", "", "FRAGMENT_TAG", "Ljava/lang/String;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrSellerImportantToNoteFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$onCreateDialog$1", f = "StrSellerImportantToNoteFragment.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f291226q;

        /* compiled from: StrSellerImportantToNoteFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$onCreateDialog$1$1", f = "StrSellerImportantToNoteFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f291228q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSellerImportantToNoteFragment f291229r;

            /* compiled from: StrSellerImportantToNoteFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$onCreateDialog$1$1$1", f = "StrSellerImportantToNoteFragment.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$b$a$a, reason: collision with other inner class name */
            public static final class C8808a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f291230q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerImportantToNoteFragment f291231r;

                /* compiled from: StrSellerImportantToNoteFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LaA0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LaA0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C8809a extends N implements Y41.l<aA0.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ StrSellerImportantToNoteFragment f291232l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8809a(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment) {
                        super(1);
                        this.f291232l = strSellerImportantToNoteFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(aA0.c cVar) {
                        aA0.c cVar2 = cVar;
                        StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = this.f291232l;
                        com.avito.konveyor.adapter.d dVar = strSellerImportantToNoteFragment.f291221k0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        aA0.d dVar2 = cVar2.f20802e;
                        dVar.l(dVar2.f20805a, null);
                        TextView textView = strSellerImportantToNoteFragment.f291224n0;
                        if (textView != null) {
                            com.avito.android.util.text.j.a(textView, dVar2.f20806b, null);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8808a(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment, Continuation<? super C8808a> continuation) {
                    super(2, continuation);
                    this.f291231r = strSellerImportantToNoteFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8808a(this.f291231r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8808a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f291230q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StrSellerImportantToNoteFragment.f291216p0;
                        StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = this.f291231r;
                        n2<aA0.c> state = strSellerImportantToNoteFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = strSellerImportantToNoteFragment.f291220j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8809a c8809a = new C8809a(strSellerImportantToNoteFragment);
                        this.f291230q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8809a, this) == coroutine_suspended) {
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

            /* compiled from: StrSellerImportantToNoteFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$onCreateDialog$1$1$2", f = "StrSellerImportantToNoteFragment.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$b$a$b, reason: collision with other inner class name */
            public static final class C8810b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f291233q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerImportantToNoteFragment f291234r;

                /* compiled from: StrSellerImportantToNoteFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8811a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrSellerImportantToNoteFragment f291235b;

                    public C8811a(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment) {
                        this.f291235b = strSellerImportantToNoteFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        aA0.b bVar = (aA0.b) obj;
                        a aVar = StrSellerImportantToNoteFragment.f291216p0;
                        StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = this.f291235b;
                        if (bVar instanceof b.f) {
                            Dialog dialog = strSellerImportantToNoteFragment.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                            if (dVar != null) {
                                b.f fVar = (b.f) bVar;
                                com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, dVar, fVar.f20795a, null, new f.c(fVar.f20796b), 0, ToastBarPosition.f181046d, 942);
                            }
                        } else if (bVar instanceof b.C1486b) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = strSellerImportantToNoteFragment.f291222l0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((b.C1486b) bVar).f20790a, null, null, 6);
                        } else if (bVar instanceof b.e) {
                            b.e eVar = (b.e) bVar;
                            com.avito.android.str_seller_orders_important_to_note.domain.b bVar2 = eVar.f20793a;
                            com.avito.android.str_seller_orders_important_to_note.domain.d dVar2 = bVar2.f291308b;
                            if (dVar2 != null) {
                                com.avito.android.lib.design.bottom_sheet.d dVar3 = new com.avito.android.lib.design.bottom_sheet.d(strSellerImportantToNoteFragment.requireContext(), R.style.Re23_BottomSheet_Default);
                                ComposeView composeView = new ComposeView(strSellerImportantToNoteFragment.requireContext(), null, 0, 6, null);
                                composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                                composeView.setContent(new C22096n(1285751667, new com.avito.android.str_seller_orders_important_to_note.g(dVar2, strSellerImportantToNoteFragment, bVar2, eVar.f20794b, dVar3), true));
                                dVar3.setContentView(composeView);
                                com.avito.android.lib.util.g.a(dVar3);
                            }
                        } else if (bVar instanceof b.c) {
                            Uri uri = Uri.parse(((b.c) bVar).f20791a);
                            l lVar = strSellerImportantToNoteFragment.f291223m0;
                            if (lVar == null) {
                                lVar = null;
                            }
                            C35966w1.g(strSellerImportantToNoteFragment, l.a.a(lVar, uri, null, 6), new com.avito.android.str_seller_orders_important_to_note.b(uri));
                        } else if (L.f(bVar, b.d.f20792a)) {
                            strSellerImportantToNoteFragment.getParentFragmentManager().o0(C22777e.a(), "StrSellerImportantToNoteFragment");
                        } else if (L.f(bVar, b.a.f20789a)) {
                            strSellerImportantToNoteFragment.dismiss();
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
                        return new C42801a(2, this.f291235b, StrSellerImportantToNoteFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8810b(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment, Continuation<? super C8810b> continuation) {
                    super(2, continuation);
                    this.f291234r = strSellerImportantToNoteFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8810b(this.f291234r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8810b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f291233q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StrSellerImportantToNoteFragment.f291216p0;
                        StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = this.f291234r;
                        InterfaceC43160i<aA0.b> events = strSellerImportantToNoteFragment.f5().getEvents();
                        C8811a c8811a = new C8811a(strSellerImportantToNoteFragment);
                        this.f291233q = 1;
                        if (events.collect(c8811a, this) == coroutine_suspended) {
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

            /* compiled from: StrSellerImportantToNoteFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$onCreateDialog$1$1$3", f = "StrSellerImportantToNoteFragment.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f291236q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerImportantToNoteFragment f291237r;

                /* compiled from: StrSellerImportantToNoteFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "<anonymous parameter 0>", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment$b$a$c$a, reason: collision with other inner class name */
                public static final class C8812a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrSellerImportantToNoteFragment f291238b;

                    public C8812a(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment) {
                        this.f291238b = strSellerImportantToNoteFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        a aVar = StrSellerImportantToNoteFragment.f291216p0;
                        this.f291238b.f5().accept(InterfaceC19747a.f.f20788a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f291237r = strSellerImportantToNoteFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f291237r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f291236q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = this.f291237r;
                        com.avito.android.deeplink_handler.handler.composite.a aVar = strSellerImportantToNoteFragment.f291222l0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        InterfaceC43160i<C43501a> interfaceC43160iB = C40482a.b(aVar);
                        C8812a c8812a = new C8812a(strSellerImportantToNoteFragment);
                        this.f291236q = 1;
                        if (((AbstractC43168f) interfaceC43160iB).collect(c8812a, this) == coroutine_suspended) {
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
            public a(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f291229r = strSellerImportantToNoteFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f291229r, continuation);
                aVar.f291228q = obj;
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
                T t12 = (T) this.f291228q;
                StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = this.f291229r;
                C43259k.d(t12, null, null, new C8808a(strSellerImportantToNoteFragment, null), 3);
                C43259k.d(t12, null, null, new C8810b(strSellerImportantToNoteFragment, null), 3);
                C43259k.d(t12, null, null, new c(strSellerImportantToNoteFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrSellerImportantToNoteFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f291226q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = StrSellerImportantToNoteFragment.this;
                a aVar = new a(strSellerImportantToNoteFragment, null);
                this.f291226q = 1;
                if (C23056p0.b(strSellerImportantToNoteFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StrSellerImportantToNoteFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = (StrSellerImportantToNoteFragment) this.receiver;
            a aVar = StrSellerImportantToNoteFragment.f291216p0;
            strSellerImportantToNoteFragment.getClass();
            com.avito.android.lib.util.i.j(com.avito.android.lib.util.i.f181373a, view2);
            View viewFindViewById = view2.findViewById(R.id.orders_dialog_list);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            strSellerImportantToNoteFragment.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            com.avito.konveyor.adapter.d dVar = strSellerImportantToNoteFragment.f291221k0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerImportantToNoteFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LaA0/a;", "it", "Lkotlin/G0;", "invoke", "(LaA0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC19747a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC19747a interfaceC19747a) {
            a aVar = StrSellerImportantToNoteFragment.f291216p0;
            StrSellerImportantToNoteFragment.this.f5().accept(interfaceC19747a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f291240l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f291240l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f291240l);
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
            return StrSellerImportantToNoteFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f291242l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f291242l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f291242l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f291243l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f291243l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f291243l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f291244l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f291244l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f291244l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrSellerImportantToNoteFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders_important_to_note/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.str_seller_orders_important_to_note.j> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_seller_orders_important_to_note.j invoke() {
            k kVar = StrSellerImportantToNoteFragment.this.f291218h0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.str_seller_orders_important_to_note.j) kVar.get();
        }
    }

    public StrSellerImportantToNoteFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f291219i0 = new O0(m0.f406844a.b(com.avito.android.str_seller_orders_important_to_note.j.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f291225o0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(StrSellerImportantToNoteScreen.f291246d, s.b(this), null, 4, null);
        com.avito.android.str_seller_orders_important_to_note.di.a.a().a((ImportantToNoteOpenParams) this.f291225o0.getValue(this, f291217q0[0]), (com.avito.android.str_seller_orders_important_to_note.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_seller_orders_important_to_note.di.c.class), cv.c.b(this), c28478k, new d()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f291220j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.str_seller_orders_important_to_note.j f5() {
        return (com.avito.android.str_seller_orders_important_to_note.j) this.f291219i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f291220j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.E(R.layout.str_seller_orders_important_to_note_fragment, false, new c(1, this, StrSellerImportantToNoteFragment.class, "onContentInflated", "onContentInflated(Landroid/view/View;)V", 0));
        dVar.K(true);
        dVar.J(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 3);
        this.f291224n0 = (TextView) dVar.findViewById(R.id.title_tv);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f291220j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f291224n0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        f5().accept(InterfaceC19747a.e.f20787a);
        super.onDismiss(dialogInterface);
    }
}
