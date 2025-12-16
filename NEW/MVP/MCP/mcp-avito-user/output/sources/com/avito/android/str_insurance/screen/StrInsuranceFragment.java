package com.avito.android.str_insurance.screen;

import Cd.C13243a;
import Xy0.AbstractC17061a;
import Y41.l;
import Y41.p;
import Y61.k;
import Zy0.InterfaceC19622a;
import Zy0.InterfaceC19623b;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
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
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_insurance.screen.di.f;
import com.avito.android.str_insurance.screen.mvi.A;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import cv.InterfaceC39417a;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: StrInsuranceFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_insurance/screen/StrInsuranceFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrInsuranceFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: p0, reason: collision with root package name */
    @k
    public static final a f288620p0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_insurance.screen.h f288621h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f288622i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public A f288623j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f288624k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f288625l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public AbstractC17061a f288626m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public Xy0.h f288627n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public Y1<InterfaceC19622a> f288628o0;

    /* compiled from: StrInsuranceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/screen/StrInsuranceFragment$a;", "", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrInsuranceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_insurance.screen.StrInsuranceFragment$onCreateDialog$1", f = "StrInsuranceFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f288629q;

        /* compiled from: StrInsuranceFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_insurance.screen.StrInsuranceFragment$onCreateDialog$1$1", f = "StrInsuranceFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f288631q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrInsuranceFragment f288632r;

            /* compiled from: StrInsuranceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_insurance.screen.StrInsuranceFragment$onCreateDialog$1$1$1", f = "StrInsuranceFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_insurance.screen.StrInsuranceFragment$b$a$a, reason: collision with other inner class name */
            public static final class C8681a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f288633q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrInsuranceFragment f288634r;

                /* compiled from: StrInsuranceFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZy0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LZy0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_insurance.screen.StrInsuranceFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C8682a extends N implements l<Zy0.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ StrInsuranceFragment f288635l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8682a(StrInsuranceFragment strInsuranceFragment) {
                        super(1);
                        this.f288635l = strInsuranceFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(Zy0.c cVar) {
                        Button button;
                        Button button2;
                        Button button3;
                        StrInsuranceFragment strInsuranceFragment = this.f288635l;
                        com.avito.android.str_insurance.screen.e eVar = new com.avito.android.str_insurance.screen.e(1, (com.avito.android.str_insurance.screen.g) strInsuranceFragment.f288622i0.getValue(), com.avito.android.str_insurance.screen.g.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        Zy0.d dVar = cVar.f20612f;
                        if (dVar != null) {
                            Dialog dialog = strInsuranceFragment.getDialog();
                            if (dialog != null && (button3 = (Button) dialog.findViewById(R.id.btn_connect)) != null) {
                                button3.setOnClickListener(new com.avito.android.seller_promotions.b(14, eVar));
                            }
                            Dialog dialog2 = strInsuranceFragment.getDialog();
                            if (dialog2 != null && (button2 = (Button) dialog2.findViewById(R.id.btn_details)) != null) {
                                button2.setOnClickListener(new com.avito.android.seller_promotions.b(15, eVar));
                            }
                            Dialog dialog3 = strInsuranceFragment.getDialog();
                            if (dialog3 != null && (button = (Button) dialog3.findViewById(R.id.btn_insure)) != null) {
                                button.setOnClickListener(new com.avito.android.seller_promotions.b(16, eVar));
                                button.setLoading(dVar.f20614b);
                            }
                            com.avito.konveyor.adapter.d dVar2 = strInsuranceFragment.f288624k0;
                            if (dVar2 == null) {
                                dVar2 = null;
                            }
                            dVar2.l(dVar.f20613a, null);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8681a(StrInsuranceFragment strInsuranceFragment, Continuation<? super C8681a> continuation) {
                    super(2, continuation);
                    this.f288634r = strInsuranceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C8681a(this.f288634r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8681a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f288633q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrInsuranceFragment strInsuranceFragment = this.f288634r;
                        n2<Zy0.c> state = ((com.avito.android.str_insurance.screen.g) strInsuranceFragment.f288622i0.getValue()).getState();
                        A a12 = strInsuranceFragment.f288623j0;
                        if (a12 == null) {
                            a12 = null;
                        }
                        ScreenPerformanceTracker screenPerformanceTracker = a12.f288726a;
                        C8682a c8682a = new C8682a(strInsuranceFragment);
                        this.f288633q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8682a, this) == coroutine_suspended) {
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

            /* compiled from: StrInsuranceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_insurance.screen.StrInsuranceFragment$onCreateDialog$1$1$2", f = "StrInsuranceFragment.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_insurance.screen.StrInsuranceFragment$b$a$b, reason: collision with other inner class name */
            public static final class C8683b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f288636q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrInsuranceFragment f288637r;

                /* compiled from: StrInsuranceFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_insurance.screen.StrInsuranceFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8684a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrInsuranceFragment f288638b;

                    public C8684a(StrInsuranceFragment strInsuranceFragment) {
                        this.f288638b = strInsuranceFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC19623b interfaceC19623b = (InterfaceC19623b) obj;
                        a aVar = StrInsuranceFragment.f288620p0;
                        StrInsuranceFragment strInsuranceFragment = this.f288638b;
                        if (interfaceC19623b instanceof InterfaceC19623b.a) {
                            strInsuranceFragment.requireActivity().setResult(((InterfaceC19623b.a) interfaceC19623b).f20600a);
                            strInsuranceFragment.requireActivity().finish();
                        } else {
                            if (interfaceC19623b instanceof InterfaceC19623b.d) {
                                strInsuranceFragment.dismiss();
                                Xy0.h hVar = strInsuranceFragment.f288627n0;
                                (hVar != null ? hVar : null).a();
                            } else if (interfaceC19623b instanceof InterfaceC19623b.C1474b) {
                                strInsuranceFragment.dismiss();
                                Xy0.h hVar2 = strInsuranceFragment.f288627n0;
                                (hVar2 != null ? hVar2 : null).c();
                            } else if (interfaceC19623b instanceof InterfaceC19623b.c) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar2 = strInsuranceFragment.f288625l0;
                                if (aVar2 == null) {
                                    aVar2 = null;
                                }
                                b.a.a(aVar2, ((InterfaceC19623b.c) interfaceC19623b).f20602a, null, null, 6);
                            } else if (interfaceC19623b instanceof InterfaceC19623b.e) {
                                Dialog dialog = strInsuranceFragment.getDialog();
                                com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                                if (dVar != null) {
                                    InterfaceC19623b.e eVar = (InterfaceC19623b.e) interfaceC19623b;
                                    com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, dVar, com.avito.android.printable_text.b.f(eVar.f20604a), null, new f.c(eVar.f20605b), 2750, ToastBarPosition.f181046d, 910);
                                }
                            }
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
                        return new C42801a(2, this.f288638b, StrInsuranceFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8683b(StrInsuranceFragment strInsuranceFragment, Continuation<? super C8683b> continuation) {
                    super(2, continuation);
                    this.f288637r = strInsuranceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C8683b(this.f288637r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8683b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f288636q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrInsuranceFragment strInsuranceFragment = this.f288637r;
                        InterfaceC43160i<InterfaceC19623b> events = ((com.avito.android.str_insurance.screen.g) strInsuranceFragment.f288622i0.getValue()).getEvents();
                        C8684a c8684a = new C8684a(strInsuranceFragment);
                        this.f288636q = 1;
                        if (events.collect(c8684a, this) == coroutine_suspended) {
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

            /* compiled from: StrInsuranceFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_insurance.screen.StrInsuranceFragment$onCreateDialog$1$1$3", f = "StrInsuranceFragment.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f288639q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrInsuranceFragment f288640r;

                /* compiled from: StrInsuranceFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_insurance.screen.StrInsuranceFragment$b$a$c$a, reason: collision with other inner class name */
                public /* synthetic */ class C8685a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.str_insurance.screen.g f288641b;

                    public C8685a(com.avito.android.str_insurance.screen.g gVar) {
                        this.f288641b = gVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f288641b.accept((InterfaceC19622a) obj);
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
                        return new C42801a(2, this.f288641b, com.avito.android.str_insurance.screen.g.class, "accept", "accept(Ljava/lang/Object;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(StrInsuranceFragment strInsuranceFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f288640r = strInsuranceFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new c(this.f288640r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f288639q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrInsuranceFragment strInsuranceFragment = this.f288640r;
                        Y1<InterfaceC19622a> y12 = strInsuranceFragment.f288628o0;
                        if (y12 == null) {
                            y12 = null;
                        }
                        C8685a c8685a = new C8685a((com.avito.android.str_insurance.screen.g) strInsuranceFragment.f288622i0.getValue());
                        this.f288639q = 1;
                        if (y12.collect(c8685a, this) == coroutine_suspended) {
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
            public a(StrInsuranceFragment strInsuranceFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f288632r = strInsuranceFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f288632r, continuation);
                aVar.f288631q = obj;
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
                T t12 = (T) this.f288631q;
                StrInsuranceFragment strInsuranceFragment = this.f288632r;
                C43259k.d(t12, null, null, new C8681a(strInsuranceFragment, null), 3);
                C43259k.d(t12, null, null, new C8683b(strInsuranceFragment, null), 3);
                C43259k.d(t12, null, null, new c(strInsuranceFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return StrInsuranceFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f288629q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                StrInsuranceFragment strInsuranceFragment = StrInsuranceFragment.this;
                a aVar = new a(strInsuranceFragment, null);
                this.f288629q = 1;
                if (C23056p0.b(strInsuranceFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f288642l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f288642l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f288642l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrInsuranceFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f288644l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f288644l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f288644l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f288645l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f288645l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f288645l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f288646l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f288646l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f288646l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrInsuranceFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_insurance/screen/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_insurance/screen/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.str_insurance.screen.g> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_insurance.screen.g invoke() {
            com.avito.android.str_insurance.screen.h hVar = StrInsuranceFragment.this.f288621h0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.str_insurance.screen.g) hVar.get();
        }
    }

    public StrInsuranceFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f288622i0 = new O0(m0.f406844a.b(com.avito.android.str_insurance.screen.g.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    public static final com.avito.android.str_insurance.screen.g f5(StrInsuranceFragment strInsuranceFragment) {
        return (com.avito.android.str_insurance.screen.g) strInsuranceFragment.f288622i0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        f.a aVarA = com.avito.android.str_insurance.screen.di.a.a();
        com.avito.android.str_insurance.screen.di.g gVar = (com.avito.android.str_insurance.screen.di.g) C29972i.a(C29972i.b(this), com.avito.android.str_insurance.screen.di.g.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Resources resources = requireContext().getResources();
        r rVarB = s.b(this);
        AbstractC17061a.C1357a c1357a = AbstractC17061a.f19170d;
        String tag = getTag();
        if (tag == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c1357a.getClass();
        AbstractC17061a abstractC17061a = AbstractC17061a.d.f19176e;
        if (!tag.equals(abstractC17061a.f19173c)) {
            abstractC17061a = AbstractC17061a.c.f19175e;
            if (!tag.equals(abstractC17061a.f19173c)) {
                abstractC17061a = AbstractC17061a.b.f19174e;
                if (!tag.equals(abstractC17061a.f19173c)) {
                    throw new IllegalStateException(AK.c.k("tag ", tag, " is not supported"));
                }
            }
        }
        aVarA.a(gVar, interfaceC39417aB, this, resources, rVarB, abstractC17061a).a(this);
        A a12 = this.f288623j0;
        if (a12 == null) {
            a12 = null;
        }
        a12.f288726a.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        A a12 = this.f288623j0;
        if (a12 == null) {
            a12 = null;
        }
        a12.f288726a.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        A a13 = this.f288623j0;
        if (a13 == null) {
            a13 = null;
        }
        a13.a();
        com.avito.android.str_insurance.screen.a aVar = new com.avito.android.str_insurance.screen.a(this, requireContext());
        AbstractC17061a abstractC17061a = this.f288626m0;
        if (abstractC17061a == null) {
            abstractC17061a = null;
        }
        aVar.B(R.layout.str_insurance_content, abstractC17061a.f19171a, new com.avito.android.str_insurance.screen.b(1, this, StrInsuranceFragment.class, "onContentInflated", "onContentInflated(Landroid/view/View;)V", 0), com.avito.android.str_insurance.screen.c.f288649l, false);
        com.avito.android.lib.design.bottom_sheet.d.I(aVar, true);
        j.b(aVar, true, 4);
        aVar.R(new com.avito.android.str_insurance.screen.d(this));
        A a14 = this.f288623j0;
        if (a14 == null) {
            a14 = null;
        }
        a14.f288726a.d();
        A a15 = this.f288623j0;
        (a15 != null ? a15 : null).b();
        return aVar;
    }
}
