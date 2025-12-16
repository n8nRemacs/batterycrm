package com.avito.android.short_term_rent.bookingform.promocode;

import Cd.C13243a;
import HV.a;
import Y41.p;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
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
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.N0;
import ew0.AbstractC40168b;
import ew0.C40171e;
import ew0.C40172f;
import ew0.InterfaceC40167a;
import ew0.InterfaceC40169c;
import ew0.InterfaceC40170d;
import ew0.InterfaceC40173g;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: BookingFormPromoCodeDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/BookingFormPromoCodeDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingFormPromoCodeDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f282047h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.short_term_rent.bookingform.promocode.d f282048i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final O0 f282049j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f282050k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f282051l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public com.avito.android.short_term_rent.bookingform.promocode.b f282052m0;

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f282046o0 = {m0.f406844a.e(new Y(BookingFormPromoCodeDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/short_term_rent/bookingform/promocode/BookingFormPromoCodeDialogFragmentOpenParams;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f282045n0 = new a(null);

    /* compiled from: BookingFormPromoCodeDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/BookingFormPromoCodeDialogFragment$a;", "", "<init>", "()V", "", "CODE_RESULT_KEY", "Ljava/lang/String;", "REQUEST_KEY", "TOAST_MESSAGE_RESULT_KEY", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BookingFormPromoCodeDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = BookingFormPromoCodeDialogFragment.f282045n0;
            BookingFormPromoCodeDialogFragment.this.f5().accept(new InterfaceC40169c.C11116c(str));
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormPromoCodeDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = BookingFormPromoCodeDialogFragment.f282045n0;
            BookingFormPromoCodeDialogFragment.this.f5().accept(InterfaceC40169c.a.f395459a);
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormPromoCodeDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment$onCreateDialog$3", f = "BookingFormPromoCodeDialogFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282055q;

        /* compiled from: BookingFormPromoCodeDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment$onCreateDialog$3$1", f = "BookingFormPromoCodeDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f282057q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BookingFormPromoCodeDialogFragment f282058r;

            /* compiled from: BookingFormPromoCodeDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment$onCreateDialog$3$1$1", f = "BookingFormPromoCodeDialogFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment$d$a$a, reason: collision with other inner class name */
            public static final class C8411a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f282059q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BookingFormPromoCodeDialogFragment f282060r;

                /* compiled from: BookingFormPromoCodeDialogFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lew0/e;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Lew0/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment$d$a$a$a, reason: collision with other inner class name */
                public static final class C8412a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BookingFormPromoCodeDialogFragment f282061b;

                    public C8412a(BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment) {
                        this.f282061b = bookingFormPromoCodeDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C40171e c40171e = (C40171e) obj;
                        com.avito.android.short_term_rent.bookingform.promocode.b bVar = this.f282061b.f282052m0;
                        if (bVar != null) {
                            C40172f c40172f = c40171e.f395472f;
                            TextView textView = bVar.f282081d;
                            I5.a(textView, c40172f.f395483a.k0(textView.getContext()), false);
                            AbstractC40168b abstractC40168b = c40172f.f395484b;
                            String f395453a = abstractC40168b.getF395453a();
                            Input input = bVar.f282082e;
                            Input.t(input, f395453a, true, 2);
                            input.setHint(abstractC40168b.getF395454b());
                            if (abstractC40168b instanceof AbstractC40168b.a) {
                                Input.f179303W.getClass();
                                input.setState(Input.f179305b0);
                            } else if (abstractC40168b instanceof AbstractC40168b.C11115b) {
                                Input.f179303W.getClass();
                                input.setState(Input.f179304a0);
                            }
                            InterfaceC40167a interfaceC40167a = c40172f.f395485c;
                            boolean z12 = interfaceC40167a instanceof InterfaceC40167a.b;
                            TextView textView2 = bVar.f282083f;
                            if (z12) {
                                D6.w(textView2);
                            } else if (interfaceC40167a instanceof InterfaceC40167a.c) {
                                D6.H(textView2);
                                ((InterfaceC40167a.c) interfaceC40167a).getClass();
                                textView2.setText((CharSequence) null);
                                textView2.setTextColor(C35835l0.d(R.attr.gray54, textView2.getContext()));
                            } else if (interfaceC40167a instanceof InterfaceC40167a.C11114a) {
                                D6.H(textView2);
                                textView2.setText(((InterfaceC40167a.C11114a) interfaceC40167a).f395451a);
                                textView2.setTextColor(C35835l0.d(R.attr.red600, textView2.getContext()));
                            }
                            InterfaceC40173g interfaceC40173g = c40172f.f395486d;
                            boolean z13 = interfaceC40173g instanceof InterfaceC40173g.b;
                            RecyclerView recyclerView = bVar.f282084g;
                            if (z13) {
                                D6.w(recyclerView);
                            } else if (interfaceC40173g instanceof InterfaceC40173g.a) {
                                D6.H(recyclerView);
                                bVar.f282078a.l(((InterfaceC40173g.a) interfaceC40173g).f395489a, null);
                            }
                            boolean z14 = c40172f.f395488f;
                            Button button = bVar.f282085h;
                            button.setLoading(z14);
                            com.avito.android.lib.design.button.b.a(button, c40172f.f395487e.k0(button.getContext()), false);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8411a(BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment, Continuation<? super C8411a> continuation) {
                    super(2, continuation);
                    this.f282060r = bookingFormPromoCodeDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8411a(this.f282060r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8411a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f282059q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BookingFormPromoCodeDialogFragment.f282045n0;
                        BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment = this.f282060r;
                        n2<C40171e> state = bookingFormPromoCodeDialogFragment.f5().getState();
                        C8412a c8412a = new C8412a(bookingFormPromoCodeDialogFragment);
                        this.f282059q = 1;
                        if (state.collect(c8412a, this) == coroutine_suspended) {
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

            /* compiled from: BookingFormPromoCodeDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment$onCreateDialog$3$1$2", f = "BookingFormPromoCodeDialogFragment.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f282062q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BookingFormPromoCodeDialogFragment f282063r;

                /* compiled from: BookingFormPromoCodeDialogFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lew0/d;", "event", "Lkotlin/G0;", "emit", "(Lew0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment$d$a$b$a, reason: collision with other inner class name */
                public static final class C8413a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BookingFormPromoCodeDialogFragment f282064b;

                    public C8413a(BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment) {
                        this.f282064b = bookingFormPromoCodeDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC40170d interfaceC40170d = (InterfaceC40170d) obj;
                        a aVar = BookingFormPromoCodeDialogFragment.f282045n0;
                        BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment = this.f282064b;
                        if (interfaceC40170d instanceof InterfaceC40170d.a) {
                            InterfaceC40170d.a aVar2 = (InterfaceC40170d.a) interfaceC40170d;
                            bookingFormPromoCodeDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("BOOKING_FORM_PROMO_DIALOG_CODE_RESULT_KEY", aVar2.f395463a), new Q("BOOKING_FORM_PROMO_DIALOG_TOAST_RESULT_KEY", aVar2.f395464b)), "BOOKING_FORM_PROMO_CODE_DIALOG_REQUEST_KEY");
                            N0.a(bookingFormPromoCodeDialogFragment.getDialog());
                        } else if (interfaceC40170d instanceof InterfaceC40170d.b) {
                            Dialog dialog = bookingFormPromoCodeDialogFragment.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                            if (dVar != null) {
                                ToastBarState toastBarState = new ToastBarState(com.avito.android.printable_text.b.f(((InterfaceC40170d.b) interfaceC40170d).f395465a), null, null, null, null, null, null, 0, false, false, null, null, 4094, null);
                                a.C0407a c0407a = HV.a.f7100w;
                                Context contextRequireContext = bookingFormPromoCodeDialogFragment.requireContext();
                                int iJ2 = C35835l0.j(R.attr.toastBarDefault, bookingFormPromoCodeDialogFragment.requireContext());
                                c0407a.getClass();
                                IV.a.e(dVar, toastBarState, a.C0407a.b(iJ2, contextRequireContext));
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f282063r = bookingFormPromoCodeDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f282063r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f282062q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BookingFormPromoCodeDialogFragment.f282045n0;
                        BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment = this.f282063r;
                        InterfaceC43160i<InterfaceC40170d> events = bookingFormPromoCodeDialogFragment.f5().getEvents();
                        C8413a c8413a = new C8413a(bookingFormPromoCodeDialogFragment);
                        this.f282062q = 1;
                        if (events.collect(c8413a, this) == coroutine_suspended) {
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
            public a(BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f282058r = bookingFormPromoCodeDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f282058r, continuation);
                aVar.f282057q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f282057q;
                BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment = this.f282058r;
                C43259k.d(t12, null, null, new C8411a(bookingFormPromoCodeDialogFragment, null), 3);
                C43259k.d(t12, null, null, new b(bookingFormPromoCodeDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return BookingFormPromoCodeDialogFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282055q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment = BookingFormPromoCodeDialogFragment.this;
                a aVar = new a(bookingFormPromoCodeDialogFragment, null);
                this.f282055q = 1;
                if (C23056p0.b(bookingFormPromoCodeDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: BookingFormPromoCodeDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lew0/c;", "action", "Lkotlin/G0;", "invoke", "(Lew0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC40169c, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40169c interfaceC40169c) {
            a aVar = BookingFormPromoCodeDialogFragment.f282045n0;
            BookingFormPromoCodeDialogFragment.this.f5().accept(interfaceC40169c);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f282066l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f282066l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f282066l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BookingFormPromoCodeDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f282068l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f282068l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f282068l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f282069l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f282069l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f282069l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f282070l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f282070l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f282070l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BookingFormPromoCodeDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/short_term_rent/bookingform/promocode/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.short_term_rent.bookingform.promocode.c> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.short_term_rent.bookingform.promocode.c invoke() {
            com.avito.android.short_term_rent.bookingform.promocode.d dVar = BookingFormPromoCodeDialogFragment.this.f282048i0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.short_term_rent.bookingform.promocode.c) dVar.get();
        }
    }

    public BookingFormPromoCodeDialogFragment() {
        super(0, 1, null);
        this.f282047h0 = new C35968w3(this);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f282049j0 = new O0(m0.f406844a.b(com.avito.android.short_term_rent.bookingform.promocode.c.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.short_term_rent.bookingform.promocode.di.k.a().a((BookingFormPromoCodeDialogFragmentOpenParams) this.f282047h0.getValue(this, f282046o0[0]), s.b(this), new e(), (com.avito.android.short_term_rent.bookingform.promocode.di.b) C29972i.a(C29972i.b(this), com.avito.android.short_term_rent.bookingform.promocode.di.b.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f282050k0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.short_term_rent.bookingform.promocode.c f5() {
        return (com.avito.android.short_term_rent.bookingform.promocode.c) this.f282049j0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f282050k0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        Context contextRequireContext = requireContext();
        View viewInflate = View.inflate(contextRequireContext, R.layout.booking_form_promo_code_dialog, null);
        com.avito.konveyor.adapter.d dVar = this.f282051l0;
        if (dVar == null) {
            dVar = null;
        }
        this.f282052m0 = new com.avito.android.short_term_rent.bookingform.promocode.b(viewInflate, dVar, new b(), new c());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(contextRequireContext, 0, 2, null);
        dVar2.setContentView(viewInflate);
        dVar2.T();
        com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f282050k0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.short_term_rent.bookingform.promocode.b bVar = this.f282052m0;
        if (bVar != null) {
            bVar.f282084g.setAdapter(null);
        }
        this.f282052m0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f5().accept(InterfaceC40169c.b.f395460a);
    }
}
