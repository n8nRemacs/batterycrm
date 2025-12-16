package com.avito.android.sbc.create.mvi;

import Uo0.g;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.mvi.e;
import com.avito.android.sbc.confirm.ConfirmDiscountDispatchTariffSuccessActivity;
import com.avito.android.sbc.create.common.CreateDiscountDispatchAudienceCountDialog;
import com.avito.android.sbc.create.common.CreateDiscountDispatchHardcodedHowItWorksBottomDialog;
import com.avito.android.sbc.create.common.CreateDiscountDispatchHowItWorksBottomDialog;
import com.avito.android.sbc.create.common.DiscountAlternativesBottomDialog;
import com.avito.android.sbc.create.common.SbcConfiguratorFastChipsOnboardingDialog;
import com.avito.android.sbc.create.common.SbcConfiguratorGeneralDialog;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import com.avito.android.sbc.create.mvi.entity.DiscountAlternativesDialogData;
import com.avito.android.sbc.create.mvi.util.FieldsWithValidation;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import w50.InterfaceC49447a;

/* compiled from: CreateDiscountDispatchFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment$bindCreateDiscountDispatchViewModel$2", f = "CreateDiscountDispatchFragment.kt", i = {}, l = {416}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class C0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259226q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CreateDiscountDispatchFragment f259227r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U0 f259228s;

    /* compiled from: CreateDiscountDispatchFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment$bindCreateDiscountDispatchViewModel$2$1", f = "CreateDiscountDispatchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f259229q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ U0 f259230r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CreateDiscountDispatchFragment f259231s;

        /* compiled from: CreateDiscountDispatchFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment$bindCreateDiscountDispatchViewModel$2$1$1", f = "CreateDiscountDispatchFragment.kt", i = {}, l = {418}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.sbc.create.mvi.C0$a$a, reason: collision with other inner class name */
        public static final class C7786a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f259232q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ U0 f259233r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ CreateDiscountDispatchFragment f259234s;

            /* compiled from: CreateDiscountDispatchFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.sbc.create.mvi.C0$a$a$a, reason: collision with other inner class name */
            public static final class C7787a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CreateDiscountDispatchFragment f259235b;

                public C7787a(CreateDiscountDispatchFragment createDiscountDispatchFragment) {
                    this.f259235b = createDiscountDispatchFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) obj;
                    M0 m02 = this.f259235b.f259245B0;
                    if (m02 == null) {
                        m02 = null;
                    }
                    m02.getClass();
                    e.a.a(m02, createDiscountDispatchState);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7786a(CreateDiscountDispatchFragment createDiscountDispatchFragment, U0 u02, Continuation continuation) {
                super(2, continuation);
                this.f259233r = u02;
                this.f259234s = createDiscountDispatchFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7786a(this.f259234s, this.f259233r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C7786a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f259232q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C7787a c7787a = new C7787a(this.f259234s);
                    this.f259232q = 1;
                    if (this.f259233r.le(c7787a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: CreateDiscountDispatchFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment$bindCreateDiscountDispatchViewModel$2$1$2", f = "CreateDiscountDispatchFragment.kt", i = {}, l = {424}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f259236q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ U0 f259237r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ CreateDiscountDispatchFragment f259238s;

            /* compiled from: CreateDiscountDispatchFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUo0/g;", "event", "Lkotlin/G0;", "emit", "(LUo0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.sbc.create.mvi.C0$a$b$a, reason: collision with other inner class name */
            public static final class C7788a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CreateDiscountDispatchFragment f259239b;

                public C7788a(CreateDiscountDispatchFragment createDiscountDispatchFragment) {
                    this.f259239b = createDiscountDispatchFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    kotlin.Q q12;
                    Uo0.g gVar = (Uo0.g) obj;
                    boolean z12 = gVar instanceof g.i;
                    CreateDiscountDispatchFragment createDiscountDispatchFragment = this.f259239b;
                    if (z12) {
                        CreateDiscountDispatchAudienceCountDialog.a aVar = CreateDiscountDispatchAudienceCountDialog.f259168h0;
                        SpannableString spannableString = ((g.i) gVar).f16673a;
                        aVar.getClass();
                        CreateDiscountDispatchAudienceCountDialog createDiscountDispatchAudienceCountDialog = new CreateDiscountDispatchAudienceCountDialog();
                        Bundle bundle = new Bundle(1);
                        bundle.putCharSequence("message_key", spannableString);
                        createDiscountDispatchAudienceCountDialog.setArguments(bundle);
                        createDiscountDispatchAudienceCountDialog.show(createDiscountDispatchFragment.getParentFragmentManager(), (String) null);
                    } else if (gVar instanceof g.p) {
                        String str = ((g.p) gVar).f16680a;
                        CreateDiscountDispatchFragment.a aVar2 = CreateDiscountDispatchFragment.f259243G0;
                        try {
                            Uri uri = Uri.parse(str);
                            InterfaceC35845m2 interfaceC35845m2 = createDiscountDispatchFragment.f259255s0;
                            createDiscountDispatchFragment.startActivity((interfaceC35845m2 != null ? interfaceC35845m2 : null).t(uri));
                        } catch (Exception e12) {
                            e12.printStackTrace();
                            Context context = createDiscountDispatchFragment.getContext();
                            if (context != null) {
                                L5.a(context, R.string.sbc_error_unknown, 0);
                            }
                        }
                    } else if (gVar instanceof g.n) {
                        new CreateDiscountDispatchHardcodedHowItWorksBottomDialog().show(createDiscountDispatchFragment.getParentFragmentManager(), (String) null);
                    } else if (gVar instanceof g.o) {
                        CreateDiscountDispatchHowItWorksBottomDialog.a aVar3 = CreateDiscountDispatchHowItWorksBottomDialog.f259169h0;
                        CharSequence charSequence = ((g.o) gVar).f16679a;
                        aVar3.getClass();
                        CreateDiscountDispatchHowItWorksBottomDialog createDiscountDispatchHowItWorksBottomDialog = new CreateDiscountDispatchHowItWorksBottomDialog();
                        Bundle bundle2 = new Bundle();
                        bundle2.putCharSequence("text_key", charSequence);
                        createDiscountDispatchHowItWorksBottomDialog.setArguments(bundle2);
                        createDiscountDispatchHowItWorksBottomDialog.show(createDiscountDispatchFragment.getParentFragmentManager(), (String) null);
                    } else if (gVar instanceof g.k) {
                        DiscountAlternativesBottomDialog.a aVar4 = DiscountAlternativesBottomDialog.f259170h0;
                        DiscountAlternativesDialogData discountAlternativesDialogData = ((g.k) gVar).f16675a;
                        aVar4.getClass();
                        DiscountAlternativesBottomDialog discountAlternativesBottomDialog = new DiscountAlternativesBottomDialog();
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("discount_alternatives_data_key", discountAlternativesDialogData);
                        discountAlternativesBottomDialog.setArguments(bundle3);
                        com.avito.android.lib.util.g.b(discountAlternativesBottomDialog, createDiscountDispatchFragment.requireContext(), createDiscountDispatchFragment.getParentFragmentManager(), "TAG_DISCOUNT_ALTERNATIVE_BOTTOM_SHEET");
                    } else if (gVar instanceof g.j) {
                        com.avito.android.calendar_select.b bVar = createDiscountDispatchFragment.f259257u0;
                        com.avito.android.calendar_select.b bVar2 = bVar != null ? bVar : null;
                        Context contextRequireContext = createDiscountDispatchFragment.requireContext();
                        com.avito.android.sbc.create.mvi.util.b bVar3 = ((g.j) gVar).f16674a;
                        createDiscountDispatchFragment.f259248E0.b(bVar2.a(contextRequireContext, bVar3.f259897a, bVar3.f259898b, bVar3.f259899c, bVar3.f259900d, bVar3.f259901e, bVar3.f259902f, bVar3.f259903g, bVar3.f259904h, false));
                    } else if (gVar instanceof g.l) {
                        View view = createDiscountDispatchFragment.getView();
                        if (view != null) {
                            String str2 = ((g.l) gVar).f16676a;
                            f.c.f125255c.getClass();
                            com.avito.android.component.toast.b.b(view, str2, 0, null, 0, null, 0, ToastBarPosition.f181046d, f.c.a.b(), null, 130878);
                        }
                    } else if (gVar instanceof g.q) {
                        createDiscountDispatchFragment.startActivity(new Intent(createDiscountDispatchFragment.requireContext(), (Class<?>) ConfirmDiscountDispatchTariffSuccessActivity.class).putExtra("args_key", ((g.q) gVar).f16681a));
                        com.avito.android.sbc.create.h hVar = createDiscountDispatchFragment.f259261y0;
                        if (hVar != null) {
                            hVar.k1(false);
                        }
                    } else if (gVar instanceof g.C1151g) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar5 = createDiscountDispatchFragment.f259254r0;
                        if (aVar5 == null) {
                            aVar5 = null;
                        }
                        b.a.a(aVar5, ((g.C1151g) gVar).f16671a, null, null, 6);
                    } else if (gVar instanceof g.r) {
                        com.avito.android.sbc.create.h hVar2 = createDiscountDispatchFragment.f259261y0;
                        if (hVar2 != null) {
                            hVar2.k1(false);
                        }
                    } else if (gVar instanceof g.a) {
                        com.avito.android.sbc.create.h hVar3 = createDiscountDispatchFragment.f259261y0;
                        if (hVar3 != null) {
                            hVar3.k1(((g.a) gVar).f16665a);
                        }
                    } else if (gVar instanceof g.c) {
                        CreateDiscountDispatchFragment.c cVar = createDiscountDispatchFragment.f259249F0;
                        cVar.d(false);
                        ActivityC22955m activityC22955mL1 = createDiscountDispatchFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                        }
                        cVar.d(true);
                    } else if (gVar instanceof g.b) {
                        InterfaceC49447a interfaceC49447a = createDiscountDispatchFragment.f259262z0;
                        if (interfaceC49447a != null) {
                            interfaceC49447a.r1();
                        }
                    } else if (gVar instanceof g.d) {
                        SbcConfiguratorGeneralDialog.a aVar6 = SbcConfiguratorGeneralDialog.f259176h0;
                        g.d dVar = (g.d) gVar;
                        dVar.getClass();
                        aVar6.getClass();
                        SbcConfiguratorGeneralDialog sbcConfiguratorGeneralDialog = new SbcConfiguratorGeneralDialog();
                        Bundle bundle4 = new Bundle();
                        bundle4.putCharSequence("text_key", dVar.f16668a);
                        bundle4.putCharSequence("title_key", "Как работает авторассылка");
                        sbcConfiguratorGeneralDialog.setArguments(bundle4);
                        sbcConfiguratorGeneralDialog.show(createDiscountDispatchFragment.getParentFragmentManager(), (String) null);
                    } else if (gVar instanceof g.e) {
                        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, createDiscountDispatchFragment, com.avito.android.printable_text.b.e(((g.e) gVar).f16669a), null, null, null, 0, null, 1022);
                    } else if (gVar instanceof g.f) {
                        SbcConfiguratorGeneralDialog.a aVar7 = SbcConfiguratorGeneralDialog.f259176h0;
                        g.f fVar = (g.f) gVar;
                        fVar.getClass();
                        aVar7.getClass();
                        SbcConfiguratorGeneralDialog sbcConfiguratorGeneralDialog2 = new SbcConfiguratorGeneralDialog();
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("text_key", fVar.f16670a);
                        bundle5.putCharSequence("title_key", "Как считается итоговая сумма");
                        sbcConfiguratorGeneralDialog2.setArguments(bundle5);
                        sbcConfiguratorGeneralDialog2.show(createDiscountDispatchFragment.getParentFragmentManager(), (String) null);
                    } else if (gVar instanceof g.m) {
                        SbcConfiguratorFastChipsOnboardingDialog.f259173h0.getClass();
                        new SbcConfiguratorFastChipsOnboardingDialog().show(createDiscountDispatchFragment.getParentFragmentManager(), (String) null);
                    } else if (gVar instanceof g.h) {
                        M0 m02 = createDiscountDispatchFragment.f259245B0;
                        M0 m03 = m02 != null ? m02 : null;
                        FieldsWithValidation fieldsWithValidation = ((g.h) gVar).f16672a;
                        m03.getClass();
                        int iOrdinal = fieldsWithValidation.ordinal();
                        ComponentContainer componentContainer = m03.f259402o;
                        if (iOrdinal == 0) {
                            q12 = new kotlin.Q(m03.f259396l, componentContainer);
                        } else if (iOrdinal == 1) {
                            q12 = new kotlin.Q(m03.f259398m, componentContainer);
                        } else if (iOrdinal == 2) {
                            q12 = new kotlin.Q(m03.f259408r, m03.f259410s);
                        } else if (iOrdinal == 3) {
                            q12 = new kotlin.Q(m03.f259391i0, m03.f259389h0);
                        } else {
                            if (iOrdinal != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q12 = new kotlin.Q(m03.f259370V, m03.f259369U);
                        }
                        m03.f259386g.post(new Me.m(m03, (View) q12.f406620c, (Input) q12.f406619b, 25));
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CreateDiscountDispatchFragment createDiscountDispatchFragment, U0 u02, Continuation continuation) {
                super(2, continuation);
                this.f259237r = u02;
                this.f259238s = createDiscountDispatchFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f259238s, this.f259237r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f259236q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C7788a c7788a = new C7788a(this.f259238s);
                    this.f259236q = 1;
                    if (this.f259237r.ke(c7788a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CreateDiscountDispatchFragment createDiscountDispatchFragment, U0 u02, Continuation continuation) {
            super(2, continuation);
            this.f259230r = u02;
            this.f259231s = createDiscountDispatchFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f259231s, this.f259230r, continuation);
            aVar.f259229q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f259229q;
            U0 u02 = this.f259230r;
            CreateDiscountDispatchFragment createDiscountDispatchFragment = this.f259231s;
            C43259k.d(t12, null, null, new C7786a(createDiscountDispatchFragment, u02, null), 3);
            C43259k.d(t12, null, null, new b(createDiscountDispatchFragment, u02, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(CreateDiscountDispatchFragment createDiscountDispatchFragment, U0 u02, Continuation<? super C0> continuation) {
        super(2, continuation);
        this.f259227r = createDiscountDispatchFragment;
        this.f259228s = u02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C0(this.f259227r, this.f259228s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259226q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            U0 u02 = this.f259228s;
            CreateDiscountDispatchFragment createDiscountDispatchFragment = this.f259227r;
            a aVar = new a(createDiscountDispatchFragment, u02, null);
            this.f259226q = 1;
            if (C23056p0.b(createDiscountDispatchFragment, state, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
