package com.avito.android.short_term_rent.promo_codes.ui;

import Y41.l;
import Y41.p;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.service_booking_calendar.flexible.header.toolbar.g;
import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import nw0.InterfaceC44485b;

/* compiled from: StrSoftBookingPromoCodesDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogFragment$initView$1", f = "StrSoftBookingPromoCodesDialogFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282512q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StrSoftBookingPromoCodesDialogFragment f282513r;

    /* compiled from: StrSoftBookingPromoCodesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogFragment$initView$1$1", f = "StrSoftBookingPromoCodesDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.short_term_rent.promo_codes.ui.a$a, reason: collision with other inner class name */
    public static final class C8433a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f282514q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ StrSoftBookingPromoCodesDialogFragment f282515r;

        /* compiled from: StrSoftBookingPromoCodesDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogFragment$initView$1$1$1", f = "StrSoftBookingPromoCodesDialogFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.short_term_rent.promo_codes.ui.a$a$a, reason: collision with other inner class name */
        public static final class C8434a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f282516q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSoftBookingPromoCodesDialogFragment f282517r;

            /* compiled from: StrSoftBookingPromoCodesDialogFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnw0/c;", "it", "Lkotlin/G0;", "invoke", "(Lnw0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.short_term_rent.promo_codes.ui.a$a$a$a, reason: collision with other inner class name */
            public static final class C8435a extends N implements l<nw0.c, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ StrSoftBookingPromoCodesDialogFragment f282518l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8435a(StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment) {
                    super(1);
                    this.f282518l = strSoftBookingPromoCodesDialogFragment;
                }

                @Override // Y41.l
                public final G0 invoke(nw0.c cVar) {
                    nw0.c cVar2 = cVar;
                    e eVar = this.f282518l.f282490l0;
                    if (eVar != null) {
                        String str = cVar2.f419241d;
                        Input input = eVar.f282527f;
                        input.setHint(str);
                        String deformattedText = input.getDeformattedText();
                        String str2 = cVar2.f419242e;
                        if (!L.f(deformattedText, str2)) {
                            Input.t(input, str2, false, 4);
                        }
                        boolean z12 = cVar2.f419245h;
                        boolean z13 = !z12;
                        input.setEnabled(z13);
                        input.setClearButton(z13);
                        input.setClearButtonListener(new f(eVar));
                        Button button = eVar.f282529h;
                        com.avito.android.lib.design.button.b.a(button, cVar2.f419240c, false);
                        button.setOnClickListener(new g(15, cVar2, eVar));
                        button.setEnabled(cVar2.f419244g);
                        button.setLoading(z12);
                        button.setClickable(z13);
                        if (cVar2.f419246i) {
                            ComponentContainer.l(eVar.f282528g, new int[]{input.getId()}, cVar2.f419247j, 4);
                            Input.f179303W.getClass();
                            input.setState(Input.f179305b0);
                        } else {
                            int[] iArr = {input.getId()};
                            ComponentContainer componentContainer = eVar.f282528g;
                            componentContainer.o(componentContainer.f178848i, iArr);
                            Input.f179303W.getClass();
                            input.setState(Input.f179304a0);
                        }
                        RadioGroup radioGroup = eVar.f282526e;
                        radioGroup.removeAllViews();
                        List<PromoCode> list = cVar2.f419243f;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                        for (PromoCode promoCode : list) {
                            Image imageDependsOnTheme = null;
                            View viewInflate = LayoutInflater.from(eVar.f282522a.getContext()).inflate(R.layout.promo_code_item_layout, (ViewGroup) null);
                            I5.a((TextView) viewInflate.findViewById(R.id.promo_code_title_tv), promoCode.f282217b, false);
                            I5.a((TextView) viewInflate.findViewById(R.id.promo_code_subtitle_tv), promoCode.f282218c, false);
                            ((RadioButton) viewInflate.findViewById(R.id.promo_code_selected_rb)).setChecked(promoCode.equals(cVar2.f419248k));
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(R.id.promo_code_iv);
                            UniversalImage universalImage = promoCode.f282219d;
                            if (universalImage != null) {
                                imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
                            }
                            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnTheme), null, null, null, 14);
                            viewInflate.setOnClickListener(new g(16, eVar, promoCode));
                            arrayList.add(viewInflate);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            radioGroup.addView((View) it.next());
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8434a(StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment, Continuation<? super C8434a> continuation) {
                super(2, continuation);
                this.f282517r = strSoftBookingPromoCodesDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new C8434a(this.f282517r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8434a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f282516q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    StrSoftBookingPromoCodesDialogFragment.a aVar = StrSoftBookingPromoCodesDialogFragment.f282484m0;
                    StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment = this.f282517r;
                    n2<nw0.c> state = strSoftBookingPromoCodesDialogFragment.f5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = strSoftBookingPromoCodesDialogFragment.f282488j0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C8435a c8435a = new C8435a(strSoftBookingPromoCodesDialogFragment);
                    this.f282516q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8435a, this) == coroutine_suspended) {
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

        /* compiled from: StrSoftBookingPromoCodesDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogFragment$initView$1$1$2", f = "StrSoftBookingPromoCodesDialogFragment.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.short_term_rent.promo_codes.ui.a$a$b */
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f282519q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSoftBookingPromoCodesDialogFragment f282520r;

            /* compiled from: StrSoftBookingPromoCodesDialogFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnw0/b;", "it", "Lkotlin/G0;", "emit", "(Lnw0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.short_term_rent.promo_codes.ui.a$a$b$a, reason: collision with other inner class name */
            public static final class C8436a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StrSoftBookingPromoCodesDialogFragment f282521b;

                public C8436a(StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment) {
                    this.f282521b = strSoftBookingPromoCodesDialogFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC44485b interfaceC44485b = (InterfaceC44485b) obj;
                    e eVar = this.f282521b.f282490l0;
                    if (eVar != null) {
                        boolean z12 = interfaceC44485b instanceof InterfaceC44485b.a;
                        com.avito.android.lib.design.bottom_sheet.d dVar = eVar.f282523b;
                        if (z12) {
                            dVar.dismiss();
                        } else if (interfaceC44485b instanceof InterfaceC44485b.C12153b) {
                            if (((InterfaceC44485b.C12153b) interfaceC44485b).f419233a) {
                                eVar.f282527f.requestFocus();
                            }
                        } else if (interfaceC44485b instanceof InterfaceC44485b.d) {
                            InterfaceC44485b.d dVar2 = (InterfaceC44485b.d) interfaceC44485b;
                            com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, dVar, dVar2.f419235a, null, dVar2.f419236b, 0, ToastBarPosition.f181046d, 942);
                        } else if (interfaceC44485b instanceof InterfaceC44485b.c) {
                            eVar.f282525d.o0(C22777e.b(new Q("STR_SOFT_BOOKING_PROMO_CODES_DIALOG_RESULT_KEY", ((InterfaceC44485b.c) interfaceC44485b).f419234a)), "STR_SOFT_BOOKING_PROMO_CODES_DIALOG_REQUEST_KEY");
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f282520r = strSoftBookingPromoCodesDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                return new b(this.f282520r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f282519q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    StrSoftBookingPromoCodesDialogFragment.a aVar = StrSoftBookingPromoCodesDialogFragment.f282484m0;
                    StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment = this.f282520r;
                    InterfaceC43160i<InterfaceC44485b> events = strSoftBookingPromoCodesDialogFragment.f5().getEvents();
                    C8436a c8436a = new C8436a(strSoftBookingPromoCodesDialogFragment);
                    this.f282519q = 1;
                    if (events.collect(c8436a, this) == coroutine_suspended) {
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
        public C8433a(StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment, Continuation<? super C8433a> continuation) {
            super(2, continuation);
            this.f282515r = strSoftBookingPromoCodesDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            C8433a c8433a = new C8433a(this.f282515r, continuation);
            c8433a.f282514q = obj;
            return c8433a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C8433a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f282514q;
            StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment = this.f282515r;
            C43259k.d(t12, null, null, new C8434a(strSoftBookingPromoCodesDialogFragment, null), 3);
            C43259k.d(t12, null, null, new b(strSoftBookingPromoCodesDialogFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f282513r = strSoftBookingPromoCodesDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f282513r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282512q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            StrSoftBookingPromoCodesDialogFragment strSoftBookingPromoCodesDialogFragment = this.f282513r;
            C8433a c8433a = new C8433a(strSoftBookingPromoCodesDialogFragment, null);
            this.f282512q = 1;
            if (C23056p0.b(strSoftBookingPromoCodesDialogFragment, state, c8433a, this) == coroutine_suspended) {
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
