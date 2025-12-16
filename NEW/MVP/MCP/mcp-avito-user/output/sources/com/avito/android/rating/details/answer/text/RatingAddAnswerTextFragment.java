package com.avito.android.rating.details.answer.text;

import Cd.r;
import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C22984Q;
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
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.rating.RatingAddAnswerTextScreen;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import com.avito.android.rating.details.answer.text.di.b;
import com.avito.android.rating.details.answer.text.f;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextState;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import com.avito.android.util.P5;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import xg0.InterfaceC49941a;
import xg0.InterfaceC49942b;
import z1.AbstractC50339a;

/* compiled from: RatingAddAnswerTextFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingAddAnswerTextFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f246802s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public f.a f246803n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f246804o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f246805p0;

    /* renamed from: q0, reason: collision with root package name */
    public ComponentContainer f246806q0;

    /* renamed from: r0, reason: collision with root package name */
    public Input f246807r0;

    /* compiled from: RatingAddAnswerTextFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "TAG_REVIEW_ADD_ANSWER_PHOTO", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: RatingAddAnswerTextFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$a$a, reason: collision with other inner class name */
        public static final class C7409a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerTextArguments f246808l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7409a(RatingAddAnswerTextArguments ratingAddAnswerTextArguments) {
                super(1);
                this.f246808l = ratingAddAnswerTextArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f246808l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static RatingAddAnswerTextFragment a(@k RatingAddAnswerTextArguments ratingAddAnswerTextArguments) {
            RatingAddAnswerTextFragment ratingAddAnswerTextFragment = new RatingAddAnswerTextFragment();
            C35966w1.a(ratingAddAnswerTextFragment, -1, new C7409a(ratingAddAnswerTextArguments));
            return ratingAddAnswerTextFragment;
        }

        public a() {
        }
    }

    /* compiled from: RatingAddAnswerTextFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$onCreateView$1", f = "RatingAddAnswerTextFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f246809q;

        /* compiled from: RatingAddAnswerTextFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$onCreateView$1$1", f = "RatingAddAnswerTextFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f246811q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerTextFragment f246812r;

            /* compiled from: RatingAddAnswerTextFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$onCreateView$1$1$1", f = "RatingAddAnswerTextFragment.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$b$a$a, reason: collision with other inner class name */
            public static final class C7410a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f246813q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ RatingAddAnswerTextFragment f246814r;

                /* compiled from: RatingAddAnswerTextFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C7411a extends H implements l<RatingAddAnswerTextState, G0> {
                    @Override // Y41.l
                    public final G0 invoke(RatingAddAnswerTextState ratingAddAnswerTextState) {
                        SpannableString spannableString;
                        SpannableString spannableString2;
                        RatingAddAnswerTextFragment ratingAddAnswerTextFragment = (RatingAddAnswerTextFragment) this.receiver;
                        a aVar = RatingAddAnswerTextFragment.f246802s0;
                        ratingAddAnswerTextFragment.getClass();
                        RatingAddAnswerTextValidationInteractor.ValidationTextResult validationTextResult = ratingAddAnswerTextState.f246884c;
                        RatingAddAnswerTextValidationInteractor.ValidationTextMessage f246832b = validationTextResult.getF246832b();
                        if (f246832b instanceof RatingAddAnswerTextValidationInteractor.ValidationTextMessage.EmptyMessage) {
                            spannableString2 = new SpannableString("");
                        } else {
                            if (f246832b instanceof RatingAddAnswerTextValidationInteractor.ValidationTextMessage.DefaultMessage) {
                                spannableString = new SpannableString(ratingAddAnswerTextFragment.getResources().getString(R.string.review_add_answer_text_input_default_message, ((RatingAddAnswerTextValidationInteractor.ValidationTextMessage.DefaultMessage) f246832b).f246825b));
                            } else if (f246832b instanceof RatingAddAnswerTextValidationInteractor.ValidationTextMessage.Message) {
                                RatingAddAnswerTextValidationInteractor.ValidationTextMessage.Message message = (RatingAddAnswerTextValidationInteractor.ValidationTextMessage.Message) f246832b;
                                SpannableString spannableString3 = new SpannableString(ratingAddAnswerTextFragment.getResources().getString(R.string.review_add_answer_text_input_message, message.f246829b, message.f246830c));
                                if (message.f246831d) {
                                    spannableString3.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.gray54, ratingAddAnswerTextFragment.requireContext())), message.f246829b.length(), spannableString3.length(), 33);
                                }
                                spannableString2 = spannableString3;
                            } else {
                                if (!(f246832b instanceof RatingAddAnswerTextValidationInteractor.ValidationTextMessage.ErrorMessage)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                RatingAddAnswerTextValidationInteractor.ValidationTextMessage.ErrorMessage errorMessage = (RatingAddAnswerTextValidationInteractor.ValidationTextMessage.ErrorMessage) f246832b;
                                spannableString = new SpannableString(ratingAddAnswerTextFragment.getResources().getString(R.string.review_add_answer_text_input_error_message, errorMessage.f246827b, errorMessage.f246828c));
                            }
                            spannableString2 = spannableString;
                        }
                        if (validationTextResult instanceof RatingAddAnswerTextValidationInteractor.ValidationTextResult.Ok) {
                            ComponentContainer componentContainer = ratingAddAnswerTextFragment.f246806q0;
                            (componentContainer != null ? componentContainer : null).q(spannableString2);
                        } else if (validationTextResult instanceof RatingAddAnswerTextValidationInteractor.ValidationTextResult.Failure) {
                            ComponentContainer componentContainer2 = ratingAddAnswerTextFragment.f246806q0;
                            ComponentContainer componentContainer3 = componentContainer2 != null ? componentContainer2 : null;
                            if (((RatingAddAnswerTextValidationInteractor.ValidationTextResult.Failure) validationTextResult).f246834d) {
                                ComponentContainer.n(componentContainer3, spannableString2, 2);
                            } else {
                                componentContainer3.k();
                                ComponentContainer.l(componentContainer3, new int[]{R.id.design_container_message}, spannableString2, 4);
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7410a(RatingAddAnswerTextFragment ratingAddAnswerTextFragment, Continuation<? super C7410a> continuation) {
                    super(2, continuation);
                    this.f246814r = ratingAddAnswerTextFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C7410a(this.f246814r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7410a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f246813q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = RatingAddAnswerTextFragment.f246802s0;
                        RatingAddAnswerTextFragment ratingAddAnswerTextFragment = this.f246814r;
                        n2<RatingAddAnswerTextState> state = ((com.avito.android.rating.details.answer.text.f) ratingAddAnswerTextFragment.f246804o0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = ratingAddAnswerTextFragment.f246805p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C7411a c7411a = new C7411a(1, ratingAddAnswerTextFragment, RatingAddAnswerTextFragment.class, "render", "render(Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextState;)V", 0);
                        this.f246813q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c7411a, this) == coroutine_suspended) {
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

            /* compiled from: RatingAddAnswerTextFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$onCreateView$1$1$2", f = "RatingAddAnswerTextFragment.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$b$a$b, reason: collision with other inner class name */
            public static final class C7412b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f246815q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ RatingAddAnswerTextFragment f246816r;

                /* compiled from: RatingAddAnswerTextFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7413a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ RatingAddAnswerTextFragment f246817b;

                    public C7413a(RatingAddAnswerTextFragment ratingAddAnswerTextFragment) {
                        this.f246817b = ratingAddAnswerTextFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC49942b interfaceC49942b = (InterfaceC49942b) obj;
                        a aVar = RatingAddAnswerTextFragment.f246802s0;
                        RatingAddAnswerTextFragment ratingAddAnswerTextFragment = this.f246817b;
                        if (interfaceC49942b instanceof InterfaceC49942b.c) {
                            Input input = ratingAddAnswerTextFragment.f246807r0;
                            (input != null ? input : null).v();
                        } else if (interfaceC49942b instanceof InterfaceC49942b.a) {
                            Input input2 = ratingAddAnswerTextFragment.f246807r0;
                            K2.d(input2 != null ? input2 : null, true);
                        } else if (interfaceC49942b instanceof InterfaceC49942b.C12876b) {
                            RatingAddAnswerPhotoFragment.a aVar2 = RatingAddAnswerPhotoFragment.f246623A0;
                            RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments = ((InterfaceC49942b.C12876b) interfaceC49942b).f442601a;
                            aVar2.getClass();
                            RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragmentA = RatingAddAnswerPhotoFragment.a.a(ratingAddAnswerPhotoArguments);
                            androidx.fragment.app.H hE2 = ratingAddAnswerTextFragment.requireActivity().getSupportFragmentManager().e();
                            hE2.n(R.id.rating_add_answer_fragment_container, ratingAddAnswerPhotoFragmentA, "tag.review.add.answer.photo");
                            hE2.c("tag.review.add.answer.photo");
                            hE2.e();
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
                        return new C42801a(2, this.f246817b, RatingAddAnswerTextFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7412b(RatingAddAnswerTextFragment ratingAddAnswerTextFragment, Continuation<? super C7412b> continuation) {
                    super(2, continuation);
                    this.f246816r = ratingAddAnswerTextFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C7412b(this.f246816r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7412b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f246815q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = RatingAddAnswerTextFragment.f246802s0;
                        RatingAddAnswerTextFragment ratingAddAnswerTextFragment = this.f246816r;
                        InterfaceC43160i<InterfaceC49942b> events = ((com.avito.android.rating.details.answer.text.f) ratingAddAnswerTextFragment.f246804o0.getValue()).getEvents();
                        C7413a c7413a = new C7413a(ratingAddAnswerTextFragment);
                        this.f246815q = 1;
                        if (events.collect(c7413a, this) == coroutine_suspended) {
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
            public a(RatingAddAnswerTextFragment ratingAddAnswerTextFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f246812r = ratingAddAnswerTextFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f246812r, continuation);
                aVar.f246811q = obj;
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
                T t12 = (T) this.f246811q;
                RatingAddAnswerTextFragment ratingAddAnswerTextFragment = this.f246812r;
                C43259k.d(t12, null, null, new C7410a(ratingAddAnswerTextFragment, null), 3);
                C43259k.d(t12, null, null, new C7412b(ratingAddAnswerTextFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return RatingAddAnswerTextFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f246809q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                RatingAddAnswerTextFragment ratingAddAnswerTextFragment = RatingAddAnswerTextFragment.this;
                a aVar = new a(ratingAddAnswerTextFragment, null);
                this.f246809q = 1;
                if (C23056p0.b(ratingAddAnswerTextFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f246819m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar) {
            super(0);
            this.f246819m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(RatingAddAnswerTextFragment.this, this.f246819m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return RatingAddAnswerTextFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f246821l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f246821l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f246821l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f246822l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f246822l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f246822l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f246823l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f246823l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f246823l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RatingAddAnswerTextFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/rating/details/answer/text/f;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/rating/details/answer/text/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements l<C23060r0, com.avito.android.rating.details.answer.text.f> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.rating.details.answer.text.f invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            f.a aVar = RatingAddAnswerTextFragment.this.f246803n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public RatingAddAnswerTextFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f246804o0 = new O0(m0.f406844a.b(com.avito.android.rating.details.answer.text.f.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f246805p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_rating_add_answer_text, viewGroup, false);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Input input = this.f246807r0;
        if (input == null) {
            input = null;
        }
        K2.d(input, true);
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.rating_add_answer_text_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        P5.d(toolbar);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.rating.details.answer.text.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerTextFragment f246837c;

            {
                this.f246837c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RatingAddAnswerTextFragment ratingAddAnswerTextFragment = this.f246837c;
                switch (i12) {
                    case 0:
                        RatingAddAnswerTextFragment.a aVar = RatingAddAnswerTextFragment.f246802s0;
                        ratingAddAnswerTextFragment.requireActivity().getF21241d().c();
                        break;
                    default:
                        RatingAddAnswerTextFragment.a aVar2 = RatingAddAnswerTextFragment.f246802s0;
                        ((f) ratingAddAnswerTextFragment.f246804o0.getValue()).accept(InterfaceC49941a.C12875a.f442598a);
                        break;
                }
            }
        });
        View viewFindViewById2 = view.findViewById(R.id.rating_add_answer_text_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f246806q0 = (ComponentContainer) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.rating_add_answer_text_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById3;
        input.setInputType(147457);
        this.f246807r0 = input;
        C43175k.K(new C43197r1(new com.avito.android.rating.details.answer.text.b(this, null), C23069w.a(y.a(n.e(input)), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e)), C22981N.a(getLifecycle()));
        View viewFindViewById4 = view.findViewById(R.id.rating_add_answer_text_continue_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i13 = 1;
        ((Button) viewFindViewById4).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.rating.details.answer.text.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerTextFragment f246837c;

            {
                this.f246837c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RatingAddAnswerTextFragment ratingAddAnswerTextFragment = this.f246837c;
                switch (i13) {
                    case 0:
                        RatingAddAnswerTextFragment.a aVar = RatingAddAnswerTextFragment.f246802s0;
                        ratingAddAnswerTextFragment.requireActivity().getF21241d().c();
                        break;
                    default:
                        RatingAddAnswerTextFragment.a aVar2 = RatingAddAnswerTextFragment.f246802s0;
                        ((f) ratingAddAnswerTextFragment.f246804o0.getValue()).accept(InterfaceC49941a.C12875a.f442598a);
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker = this.f246805p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            RatingAddAnswerTextArguments ratingAddAnswerTextArguments = (RatingAddAnswerTextArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_arguments", RatingAddAnswerTextArguments.class) : arguments.getParcelable("key_arguments"));
            if (ratingAddAnswerTextArguments != null) {
                b.a aVarA = com.avito.android.rating.details.answer.text.di.a.a();
                RatingAddAnswerTextScreen ratingAddAnswerTextScreen = RatingAddAnswerTextScreen.f246400d;
                com.avito.android.analytics.screens.r rVarC = s.c(this);
                ratingAddAnswerTextScreen.getClass();
                aVarA.a(ratingAddAnswerTextArguments.f246799b, ratingAddAnswerTextArguments.f246800c, ratingAddAnswerTextArguments.f246801d, new C28478k(ratingAddAnswerTextScreen, rVarC, RatingAddAnswerTextScreen.f246401e), (com.avito.android.rating.details.answer.di.c) C29972i.a(C29972i.b(this), com.avito.android.rating.details.answer.di.c.class), bundle != null).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f246805p0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                return;
            }
        }
        throw new IllegalArgumentException("Arguments must be specified");
    }
}
