package com.avito.android.rating.details.answer.photo;

import Cd.r;
import L91.o;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
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
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.photo_list_view.C33210d;
import com.avito.android.photo_list_view.I;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view.x;
import com.avito.android.photo_list_view.z;
import com.avito.android.rating.RatingAddAnswerImagesScreen;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment;
import com.avito.android.rating.details.answer.photo.di.b;
import com.avito.android.rating.details.answer.photo.g;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoState;
import com.avito.android.rating.details.answer.photo.picker.b;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.P5;
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
import wg0.InterfaceC49619a;
import wg0.InterfaceC49620b;
import z1.AbstractC50339a;

/* compiled from: RatingAddAnswerPhotoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/RatingAddAnswerPhotoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/photo_list_view/x;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingAddAnswerPhotoFragment extends BaseFragment implements InterfaceC28477j.b, x {

    /* renamed from: A0, reason: collision with root package name */
    @k
    public static final a f246623A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public g.a f246624n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f246625o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public s f246626p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public C33210d.a f246627q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating.details.answer.photo.picker.b f246628r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f246629s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f246630t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f246631u0;

    /* renamed from: v0, reason: collision with root package name */
    public androidx.view.result.h<b.a> f246632v0;

    /* renamed from: w0, reason: collision with root package name */
    public String f246633w0;

    /* renamed from: x0, reason: collision with root package name */
    public Toolbar f246634x0;

    /* renamed from: y0, reason: collision with root package name */
    public Button f246635y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.toast_bar.k f246636z0;

    /* compiled from: RatingAddAnswerPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/RatingAddAnswerPhotoFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "KEY_RESULT", "", "MAX_PHOTOS_COUNT", "I", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: RatingAddAnswerPhotoFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$a$a, reason: collision with other inner class name */
        public static final class C7398a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerPhotoArguments f246637l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7398a(RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments) {
                super(1);
                this.f246637l = ratingAddAnswerPhotoArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f246637l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static RatingAddAnswerPhotoFragment a(@k RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments) {
            RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = new RatingAddAnswerPhotoFragment();
            C35966w1.a(ratingAddAnswerPhotoFragment, -1, new C7398a(ratingAddAnswerPhotoArguments));
            return ratingAddAnswerPhotoFragment;
        }

        public a() {
        }
    }

    /* compiled from: RatingAddAnswerPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$onCreateView$1", f = "RatingAddAnswerPhotoFragment.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f246638q;

        /* compiled from: RatingAddAnswerPhotoFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$onCreateView$1$1", f = "RatingAddAnswerPhotoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f246640q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerPhotoFragment f246641r;

            /* compiled from: RatingAddAnswerPhotoFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$onCreateView$1$1$1", f = "RatingAddAnswerPhotoFragment.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$b$a$a, reason: collision with other inner class name */
            public static final class C7399a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f246642q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ RatingAddAnswerPhotoFragment f246643r;

                /* compiled from: RatingAddAnswerPhotoFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C7400a extends H implements Y41.l<RatingAddAnswerPhotoState, G0> {
                    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
                    @Override // Y41.l
                    public final G0 invoke(RatingAddAnswerPhotoState ratingAddAnswerPhotoState) {
                        RatingAddAnswerPhotoState ratingAddAnswerPhotoState2 = ratingAddAnswerPhotoState;
                        RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = (RatingAddAnswerPhotoFragment) this.receiver;
                        Button button = ratingAddAnswerPhotoFragment.f246635y0;
                        if (button == null) {
                            button = null;
                        }
                        button.setLoading(ratingAddAnswerPhotoState2.f246739c);
                        button.setClickable(ratingAddAnswerPhotoState2.f246740d);
                        button.setText(ratingAddAnswerPhotoState2.f246738b.isEmpty() ? ratingAddAnswerPhotoFragment.getString(R.string.send_no_photos_button_title) : ratingAddAnswerPhotoFragment.getString(R.string.send_button_title));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7399a(RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment, Continuation<? super C7399a> continuation) {
                    super(2, continuation);
                    this.f246643r = ratingAddAnswerPhotoFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C7399a(this.f246643r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7399a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f246642q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = RatingAddAnswerPhotoFragment.f246623A0;
                        RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = this.f246643r;
                        n2<RatingAddAnswerPhotoState> state = ((com.avito.android.rating.details.answer.photo.g) ratingAddAnswerPhotoFragment.f246625o0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = ratingAddAnswerPhotoFragment.f246631u0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C7400a c7400a = new C7400a(1, ratingAddAnswerPhotoFragment, RatingAddAnswerPhotoFragment.class, "render", "render(Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoState;)V", 0);
                        this.f246642q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c7400a, this) == coroutine_suspended) {
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

            /* compiled from: RatingAddAnswerPhotoFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$onCreateView$1$1$2", f = "RatingAddAnswerPhotoFragment.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$b$a$b, reason: collision with other inner class name */
            public static final class C7401b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f246644q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ RatingAddAnswerPhotoFragment f246645r;

                /* compiled from: RatingAddAnswerPhotoFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7402a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ RatingAddAnswerPhotoFragment f246646b;

                    public C7402a(RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment) {
                        this.f246646b = ratingAddAnswerPhotoFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC49620b interfaceC49620b = (InterfaceC49620b) obj;
                        a aVar = RatingAddAnswerPhotoFragment.f246623A0;
                        RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = this.f246646b;
                        if (interfaceC49620b instanceof InterfaceC49620b.c) {
                            com.avito.android.lib.design.toast_bar.k kVar = ratingAddAnswerPhotoFragment.f246636z0;
                            if (kVar != null) {
                                kVar.f();
                            }
                            ratingAddAnswerPhotoFragment.f246636z0 = null;
                            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                            Toolbar toolbar = ratingAddAnswerPhotoFragment.f246634x0;
                            InterfaceC49620b.c cVar2 = (InterfaceC49620b.c) interfaceC49620b;
                            ratingAddAnswerPhotoFragment.f246636z0 = com.avito.android.component.toast.c.b(cVar, toolbar == null ? null : toolbar, com.avito.android.printable_text.b.f(cVar2.f441740a), null, null, null, new f.c(cVar2.f441741b), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
                        } else if (L.f(interfaceC49620b, InterfaceC49620b.C12825b.f441739a)) {
                            com.avito.android.lib.design.toast_bar.k kVar2 = ratingAddAnswerPhotoFragment.f246636z0;
                            if (kVar2 != null) {
                                kVar2.f();
                            }
                            ratingAddAnswerPhotoFragment.f246636z0 = null;
                        } else if (interfaceC49620b instanceof InterfaceC49620b.d) {
                            UserDialog userDialog = ((InterfaceC49620b.d) interfaceC49620b).f441742a;
                            InterfaceC30274a interfaceC30274a = ratingAddAnswerPhotoFragment.f246629s0;
                            if (interfaceC30274a == null) {
                                interfaceC30274a = null;
                            }
                            C43175k.K(new C43197r1(new com.avito.android.rating.details.answer.photo.e(ratingAddAnswerPhotoFragment, null), y.a(interfaceC30274a.g(userDialog).q())), C22981N.a(ratingAddAnswerPhotoFragment.getLifecycle()));
                        } else if (interfaceC49620b instanceof InterfaceC49620b.a) {
                            ratingAddAnswerPhotoFragment.requireActivity().setResult(-1, new Intent().putExtra("key_result", ((InterfaceC49620b.a) interfaceC49620b).f441738a));
                            ratingAddAnswerPhotoFragment.requireActivity().finish();
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f246646b, RatingAddAnswerPhotoFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7401b(RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment, Continuation<? super C7401b> continuation) {
                    super(2, continuation);
                    this.f246645r = ratingAddAnswerPhotoFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C7401b(this.f246645r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7401b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f246644q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = RatingAddAnswerPhotoFragment.f246623A0;
                        RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = this.f246645r;
                        InterfaceC43160i<InterfaceC49620b> events = ((com.avito.android.rating.details.answer.photo.g) ratingAddAnswerPhotoFragment.f246625o0.getValue()).getEvents();
                        C7402a c7402a = new C7402a(ratingAddAnswerPhotoFragment);
                        this.f246644q = 1;
                        if (events.collect(c7402a, this) == coroutine_suspended) {
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
            public a(RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f246641r = ratingAddAnswerPhotoFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f246641r, continuation);
                aVar.f246640q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f246640q;
                RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = this.f246641r;
                C43259k.d(t12, null, null, new C7399a(ratingAddAnswerPhotoFragment, null), 3);
                C43259k.d(t12, null, null, new C7401b(ratingAddAnswerPhotoFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return RatingAddAnswerPhotoFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f246638q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = RatingAddAnswerPhotoFragment.this;
                a aVar = new a(ratingAddAnswerPhotoFragment, null);
                this.f246638q = 1;
                if (C23056p0.b(ratingAddAnswerPhotoFragment, state, aVar, this) == coroutine_suspended) {
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
        public final /* synthetic */ Y41.l f246648m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar) {
            super(0);
            this.f246648m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(RatingAddAnswerPhotoFragment.this, this.f246648m);
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
            return RatingAddAnswerPhotoFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f246650l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f246650l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f246650l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f246651l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f246651l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f246651l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f246652l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f246652l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f246652l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RatingAddAnswerPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/rating/details/answer/photo/g;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/rating/details/answer/photo/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<C23060r0, com.avito.android.rating.details.answer.photo.g> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.rating.details.answer.photo.g invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            g.a aVar = RatingAddAnswerPhotoFragment.this.f246624n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public RatingAddAnswerPhotoFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f246625o0 = new O0(m0.f406844a.b(com.avito.android.rating.details.answer.photo.g.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.photo_list_view.x
    public final void A2(int i12, @l String str, @l String str2) {
        String str3 = this.f246633w0;
        if (str3 == null) {
            str3 = null;
        }
        b.a aVar = new b.a(str3, str);
        androidx.view.result.h<b.a> hVar = this.f246632v0;
        (hVar != null ? hVar : null).b(aVar);
        ((com.avito.android.rating.details.answer.photo.g) this.f246625o0.getValue()).accept(InterfaceC49619a.C12824a.f441736a);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_rating_add_answer_photo, viewGroup, false);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        s sVar = this.f246626p0;
        if (sVar == null) {
            sVar = null;
        }
        sVar.e0();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.rating_add_answer_photo_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f246634x0 = toolbar;
        P5.b(toolbar);
        Toolbar toolbar2 = this.f246634x0;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        final int i12 = 0;
        toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.rating.details.answer.photo.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerPhotoFragment f246657c;

            {
                this.f246657c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = this.f246657c;
                switch (i12) {
                    case 0:
                        RatingAddAnswerPhotoFragment.a aVar = RatingAddAnswerPhotoFragment.f246623A0;
                        ratingAddAnswerPhotoFragment.requireActivity().getF21241d().c();
                        break;
                    default:
                        RatingAddAnswerPhotoFragment.a aVar2 = RatingAddAnswerPhotoFragment.f246623A0;
                        ((g) ratingAddAnswerPhotoFragment.f246625o0.getValue()).accept(InterfaceC49619a.b.f441737a);
                        break;
                }
            }
        });
        View viewFindViewById2 = view.findViewById(R.id.rating_add_answer_photo_list_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        recyclerView.l(new I(requireContext(), 0, 0, 6, null), -1);
        s sVar = this.f246626p0;
        if (sVar == null) {
            sVar = null;
        }
        sVar.c(5);
        s sVar2 = this.f246626p0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        C33210d.a aVar = this.f246627q0;
        if (aVar == null) {
            aVar = null;
        }
        z zVar = new z(recyclerView, sVar2, aVar);
        s sVar3 = this.f246626p0;
        if (sVar3 == null) {
            sVar3 = null;
        }
        sVar3.A(zVar);
        Button button = (Button) view.findViewById(R.id.rating_add_answer_photo_send_button);
        this.f246635y0 = button;
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.rating.details.answer.photo.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerPhotoFragment f246657c;

            {
                this.f246657c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment = this.f246657c;
                switch (i13) {
                    case 0:
                        RatingAddAnswerPhotoFragment.a aVar2 = RatingAddAnswerPhotoFragment.f246623A0;
                        ratingAddAnswerPhotoFragment.requireActivity().getF21241d().c();
                        break;
                    default:
                        RatingAddAnswerPhotoFragment.a aVar22 = RatingAddAnswerPhotoFragment.f246623A0;
                        ((g) ratingAddAnswerPhotoFragment.f246625o0.getValue()).accept(InterfaceC49619a.b.f441737a);
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker = this.f246631u0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments = (RatingAddAnswerPhotoArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_arguments", RatingAddAnswerPhotoArguments.class) : arguments.getParcelable("key_arguments"));
            if (ratingAddAnswerPhotoArguments != null) {
                this.f246633w0 = ratingAddAnswerPhotoArguments.f246622d;
                b.a aVarA = com.avito.android.rating.details.answer.photo.di.a.a();
                ActivityC22955m activityC22955mRequireActivity = requireActivity();
                Resources resources = getResources();
                RatingAddAnswerImagesScreen ratingAddAnswerImagesScreen = RatingAddAnswerImagesScreen.f246396d;
                com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
                ratingAddAnswerImagesScreen.getClass();
                aVarA.a(activityC22955mRequireActivity, resources, this, this, ratingAddAnswerPhotoArguments, ratingAddAnswerPhotoArguments.f246620b, new C28478k(ratingAddAnswerImagesScreen, rVarC, RatingAddAnswerImagesScreen.f246397e), (com.avito.android.rating.details.answer.di.c) C29972i.a(C29972i.b(this), com.avito.android.rating.details.answer.di.c.class), cv.c.b(this), bundle != null).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f246631u0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                ScreenPerformanceTracker screenPerformanceTracker2 = this.f246631u0;
                if (screenPerformanceTracker2 == null) {
                    screenPerformanceTracker2 = null;
                }
                screenPerformanceTracker2.e();
                com.avito.android.rating.details.answer.photo.picker.b bVar = this.f246628r0;
                this.f246632v0 = registerForActivityResult(bVar != null ? bVar : null, new o(this, 25));
                return;
            }
        }
        throw new IllegalArgumentException("Arguments must be specified");
    }
}
