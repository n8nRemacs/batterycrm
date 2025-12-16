package com.avito.android.rating.details.answer;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.C19918B;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.rating.RatingAddAnswerScreen;
import com.avito.android.rating.details.answer.di.b;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextArguments;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.n2;
import vg0.InterfaceC49327b;
import z1.AbstractC50339a;

/* compiled from: RatingAddAnswerActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/answer/RatingAddAnswerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingAddAnswerActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f246573p = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.rating.details.answer.e f246574m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f246575n = new O0(m0.f406844a.b(com.avito.android.rating.details.answer.d.class), new e(), new d(new g()), new f());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f246576o;

    /* compiled from: RatingAddAnswerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/details/answer/RatingAddAnswerActivity$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "KEY_RESULT", "TAG_REVIEW_ADD_ANSWER_TEXT", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingAddAnswerActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.answer.RatingAddAnswerActivity$onCreate$1", f = "RatingAddAnswerActivity.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f246577q;

        /* compiled from: RatingAddAnswerActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.rating.details.answer.RatingAddAnswerActivity$onCreate$1$1", f = "RatingAddAnswerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f246579q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ RatingAddAnswerActivity f246580r;

            /* compiled from: RatingAddAnswerActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.rating.details.answer.RatingAddAnswerActivity$onCreate$1$1$1", f = "RatingAddAnswerActivity.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.rating.details.answer.RatingAddAnswerActivity$b$a$a, reason: collision with other inner class name */
            public static final class C7390a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f246581q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ RatingAddAnswerActivity f246582r;

                /* compiled from: RatingAddAnswerActivity.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00002\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "Lcom/avito/android/rating/details/answer/mvi/RatingAddAnswerState;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.rating.details.answer.RatingAddAnswerActivity$b$a$a$a, reason: collision with other inner class name */
                public static final class C7391a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public static final C7391a<T> f246583b = new C7391a<>();

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7390a(RatingAddAnswerActivity ratingAddAnswerActivity, Continuation<? super C7390a> continuation) {
                    super(2, continuation);
                    this.f246582r = ratingAddAnswerActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C7390a(this.f246582r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7390a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f246581q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        n2<G0> state = ((com.avito.android.rating.details.answer.d) this.f246582r.f246575n.getValue()).getState();
                        InterfaceC43172j<? super G0> interfaceC43172j = C7391a.f246583b;
                        this.f246581q = 1;
                        if (state.collect(interfaceC43172j, this) == coroutine_suspended) {
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

            /* compiled from: RatingAddAnswerActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.rating.details.answer.RatingAddAnswerActivity$onCreate$1$1$2", f = "RatingAddAnswerActivity.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.rating.details.answer.RatingAddAnswerActivity$b$a$b, reason: collision with other inner class name */
            public static final class C7392b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f246584q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ RatingAddAnswerActivity f246585r;

                /* compiled from: RatingAddAnswerActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.rating.details.answer.RatingAddAnswerActivity$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7393a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ RatingAddAnswerActivity f246586b;

                    public C7393a(RatingAddAnswerActivity ratingAddAnswerActivity) {
                        this.f246586b = ratingAddAnswerActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC49327b interfaceC49327b = (InterfaceC49327b) obj;
                        a aVar = RatingAddAnswerActivity.f246573p;
                        RatingAddAnswerActivity ratingAddAnswerActivity = this.f246586b;
                        if (interfaceC49327b instanceof InterfaceC49327b.a) {
                            RatingAddAnswerTextFragment.a aVar2 = RatingAddAnswerTextFragment.f246802s0;
                            RatingAddAnswerTextArguments ratingAddAnswerTextArguments = ((InterfaceC49327b.a) interfaceC49327b).f440930a;
                            aVar2.getClass();
                            RatingAddAnswerTextFragment ratingAddAnswerTextFragmentA = RatingAddAnswerTextFragment.a.a(ratingAddAnswerTextArguments);
                            H hE2 = ratingAddAnswerActivity.getSupportFragmentManager().e();
                            hE2.n(R.id.rating_add_answer_fragment_container, ratingAddAnswerTextFragmentA, "tag.review.add.answer.text");
                            hE2.c("tag.review.add.answer.text");
                            hE2.e();
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
                        return new C42801a(2, this.f246586b, RatingAddAnswerActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/rating/details/answer/mvi/entity/RatingAddAnswerOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7392b(RatingAddAnswerActivity ratingAddAnswerActivity, Continuation<? super C7392b> continuation) {
                    super(2, continuation);
                    this.f246585r = ratingAddAnswerActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C7392b(this.f246585r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7392b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f246584q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        RatingAddAnswerActivity ratingAddAnswerActivity = this.f246585r;
                        InterfaceC43160i<InterfaceC49327b> events = ((com.avito.android.rating.details.answer.d) ratingAddAnswerActivity.f246575n.getValue()).getEvents();
                        C7393a c7393a = new C7393a(ratingAddAnswerActivity);
                        this.f246584q = 1;
                        if (events.collect(c7393a, this) == coroutine_suspended) {
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
            public a(RatingAddAnswerActivity ratingAddAnswerActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f246580r = ratingAddAnswerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f246580r, continuation);
                aVar.f246579q = obj;
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
                T t12 = (T) this.f246579q;
                RatingAddAnswerActivity ratingAddAnswerActivity = this.f246580r;
                C43259k.d(t12, null, null, new C7390a(ratingAddAnswerActivity, null), 3);
                C43259k.d(t12, null, null, new C7392b(ratingAddAnswerActivity, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return RatingAddAnswerActivity.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f246577q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                RatingAddAnswerActivity ratingAddAnswerActivity = RatingAddAnswerActivity.this;
                a aVar = new a(ratingAddAnswerActivity, null);
                this.f246577q = 1;
                if (C23056p0.b(ratingAddAnswerActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: RatingAddAnswerActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<x, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            RatingAddAnswerActivity ratingAddAnswerActivity = RatingAddAnswerActivity.this;
            FragmentManager supportFragmentManager = ratingAddAnswerActivity.getSupportFragmentManager();
            if (supportFragmentManager.L() > 1) {
                supportFragmentManager.Y();
            } else {
                ratingAddAnswerActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f246588l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f246588l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f246588l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return RatingAddAnswerActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return RatingAddAnswerActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: RatingAddAnswerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating/details/answer/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.rating.details.answer.d> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.rating.details.answer.d invoke() {
            com.avito.android.rating.details.answer.e eVar = RatingAddAnswerActivity.this.f246574m;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.rating.details.answer.d) eVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_rating_add_answer;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        RatingAddAnswerArguments ratingAddAnswerArguments = (RatingAddAnswerArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_arguments", RatingAddAnswerArguments.class) : intent.getParcelableExtra("key_arguments"));
        if (ratingAddAnswerArguments == null) {
            throw new IllegalArgumentException("ReviewData must be specified");
        }
        b.a aVarA = com.avito.android.rating.details.answer.di.a.a();
        boolean z12 = bundle != null;
        RatingAddAnswerScreen ratingAddAnswerScreen = RatingAddAnswerScreen.f246398d;
        r rVarA = s.a(this);
        ratingAddAnswerScreen.getClass();
        aVarA.a(this, ratingAddAnswerArguments, z12, new C28478k(ratingAddAnswerScreen, rVarA, RatingAddAnswerScreen.f246399e), (com.avito.android.rating.details.answer.di.c) C29972i.a(C29972i.b(this), com.avito.android.rating.details.answer.di.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f246576o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f246576o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        C19918B.a(getF21241d(), this, new c(), 2);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f246576o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
