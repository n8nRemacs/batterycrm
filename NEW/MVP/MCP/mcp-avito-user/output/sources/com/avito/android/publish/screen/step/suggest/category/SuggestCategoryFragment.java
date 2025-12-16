package com.avito.android.publish.screen.step.suggest.category;

import Cd.C13243a;
import Oe0.InterfaceC14678a;
import Oe0.c;
import Y41.p;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.blueprints.publish.wizard.WizardItem;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.InterfaceC33875j0;
import com.avito.android.publish.premoderation.r;
import com.avito.android.publish.screen.step.suggest.category.di.b;
import com.avito.android.publish.screen.step.suggest.category.mvi.entity.SuggestCategoryState;
import com.avito.android.publish.screen.step.wizard.WizardFragment;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: SuggestCategoryFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/SuggestCategoryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/publish/screen/step/wizard/b;", "Lcom/avito/android/ui/fragments/c;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SuggestCategoryFragment extends BaseFragment implements com.avito.android.publish.screen.step.wizard.b, com.avito.android.ui.fragments.c, Id0.c, InterfaceC28477j.a {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final b f242221A0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.screen.step.suggest.category.e f242222n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f242223o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public C0 f242224p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f242225q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f242226r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f242227s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f242228t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public Q1 f242229u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public InterfaceC33875j0 f242230v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public r f242231w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public Hf0.b f242232x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public View f242233y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public C33862g0 f242234z0;

    /* compiled from: SuggestCategoryFragment.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/SuggestCategoryFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FrameLayout f242235a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final FrameLayout f242236b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.progress_overlay.l f242237c;

        public a(@Y61.k FrameLayout frameLayout, @Y61.k FrameLayout frameLayout2, @Y61.k RecyclerView recyclerView, @Y61.k com.avito.android.progress_overlay.l lVar) {
            this.f242235a = frameLayout;
            this.f242236b = frameLayout2;
            this.f242237c = lVar;
        }
    }

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/SuggestCategoryFragment$b;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = SuggestCategoryFragment.f242221A0;
            SuggestCategoryFragment.this.r5().accept(InterfaceC14678a.i.f12452a);
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = SuggestCategoryFragment.f242221A0;
            SuggestCategoryFragment.this.r5().accept(InterfaceC14678a.j.f12453a);
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment$onViewCreated$2", f = "SuggestCategoryFragment.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f242240q;

        /* compiled from: SuggestCategoryFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment$onViewCreated$2$1", f = "SuggestCategoryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f242242q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SuggestCategoryFragment f242243r;

            /* compiled from: SuggestCategoryFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment$onViewCreated$2$1$1", f = "SuggestCategoryFragment.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment$e$a$a, reason: collision with other inner class name */
            public static final class C7258a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242244q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SuggestCategoryFragment f242245r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7258a(SuggestCategoryFragment suggestCategoryFragment, Continuation<? super C7258a> continuation) {
                    super(2, continuation);
                    this.f242245r = suggestCategoryFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7258a(this.f242245r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7258a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object next;
                    Object objCollect;
                    z<WizardItem> zVarD;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242244q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f242244q = 1;
                        SuggestCategoryFragment suggestCategoryFragment = this.f242245r;
                        Set<TV0.d<?, ?>> set = suggestCategoryFragment.f242228t0;
                        if (set == null) {
                            set = null;
                        }
                        Iterator<T> it = set.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (next instanceof com.avito.android.blueprints.publish.wizard.d) {
                                break;
                            }
                        }
                        com.avito.android.blueprints.publish.wizard.d dVar = (com.avito.android.blueprints.publish.wizard.d) (next instanceof com.avito.android.blueprints.publish.wizard.d ? next : null);
                        if (dVar == null || (zVarD = dVar.d()) == null) {
                            objCollect = G0.f406611a;
                        } else {
                            objCollect = ((AbstractC43168f) y.a(zVarD)).collect(new com.avito.android.publish.screen.step.suggest.category.b(suggestCategoryFragment), this);
                            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objCollect = G0.f406611a;
                            }
                        }
                        if (objCollect == coroutine_suspended) {
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

            /* compiled from: SuggestCategoryFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment$onViewCreated$2$1$2", f = "SuggestCategoryFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242246q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SuggestCategoryFragment f242247r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SuggestCategoryFragment suggestCategoryFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f242247r = suggestCategoryFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f242247r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242246q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f242246q = 1;
                        if (SuggestCategoryFragment.q5(this.f242247r, this) == coroutine_suspended) {
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
            public a(SuggestCategoryFragment suggestCategoryFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f242243r = suggestCategoryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f242243r, continuation);
                aVar.f242242q = obj;
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
                T t12 = (T) this.f242242q;
                SuggestCategoryFragment suggestCategoryFragment = this.f242243r;
                C43259k.d(t12, null, null, new C7258a(suggestCategoryFragment, null), 3);
                C43259k.d(t12, null, null, new b(suggestCategoryFragment, null), 3);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return SuggestCategoryFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f242240q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                SuggestCategoryFragment suggestCategoryFragment = SuggestCategoryFragment.this;
                a aVar = new a(suggestCategoryFragment, null);
                this.f242240q = 1;
                if (C23056p0.b(suggestCategoryFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<Oe0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Oe0.c cVar) {
            Oe0.c cVar2 = cVar;
            SuggestCategoryFragment suggestCategoryFragment = (SuggestCategoryFragment) this.receiver;
            b bVar = SuggestCategoryFragment.f242221A0;
            suggestCategoryFragment.getClass();
            if (L.f(cVar2, c.e.f12469a)) {
                InterfaceC33875j0 interfaceC33875j0 = suggestCategoryFragment.f242230v0;
                if (interfaceC33875j0 != null) {
                    interfaceC33875j0.h();
                }
            } else if (cVar2 instanceof c.a) {
                r rVar = suggestCategoryFragment.f242231w0;
                if (rVar != null) {
                    rVar.U0(((c.a) cVar2).f12465a);
                }
            } else if (cVar2 instanceof c.d) {
                suggestCategoryFragment.s5(((c.d) cVar2).f12468a);
            } else if (cVar2 instanceof c.b) {
                suggestCategoryFragment.getChildFragmentManager().Y();
            } else if (cVar2 instanceof c.f) {
                C33862g0 c33862g0 = suggestCategoryFragment.f242234z0;
                if (c33862g0 != null) {
                    c33862g0.d(((c.f) cVar2).f12470a);
                }
            } else if (L.f(cVar2, c.C0799c.f12467a)) {
                C0 c02 = suggestCategoryFragment.f242224p0;
                if (c02 == null) {
                    c02 = null;
                }
                c02.ye();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/mvi/entity/SuggestCategoryState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/screen/step/suggest/category/mvi/entity/SuggestCategoryState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<SuggestCategoryState, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f242249m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar) {
            super(1);
            this.f242249m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(SuggestCategoryState suggestCategoryState) {
            View view;
            SuggestCategoryState suggestCategoryState2 = suggestCategoryState;
            b bVar = SuggestCategoryFragment.f242221A0;
            SuggestCategoryFragment suggestCategoryFragment = SuggestCategoryFragment.this;
            boolean z12 = suggestCategoryState2.f242363b;
            a aVar = this.f242249m;
            com.avito.android.progress_overlay.l lVar = aVar.f242237c;
            if (z12) {
                lVar.k(null);
            } else if (suggestCategoryState2.f242364c) {
                C0 c02 = suggestCategoryFragment.f242224p0;
                suggestCategoryFragment.s5((c02 != null ? c02 : null).f231861Y.getNavigation());
            } else {
                suggestCategoryFragment.t5(aVar);
                lVar.j();
                Hf0.b bVar2 = suggestCategoryFragment.f242232x0;
                boolean z13 = suggestCategoryState2.f242365d;
                if (bVar2 != null) {
                    Button button = bVar2.f7601a;
                    if (z13) {
                        if (button != null) {
                            D6.H(button);
                        }
                    } else if (button != null) {
                        D6.w(button);
                    }
                }
                Q1 q12 = suggestCategoryFragment.f242229u0;
                if (q12 == null) {
                    q12 = null;
                }
                if (q12.B().invoke().booleanValue() && (view = suggestCategoryFragment.f242233y0) != null) {
                    D6.G(view, z13);
                }
                D6.G(aVar.f242236b, suggestCategoryState2.f242367f);
                com.avito.konveyor.adapter.a aVar2 = suggestCategoryFragment.f242226r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                com.avito.konveyor.util.a.a(aVar2, suggestCategoryState2.f242366e);
                RecyclerView.Adapter<?> adapter = suggestCategoryFragment.f242225q0;
                (adapter != null ? adapter : null).notifyDataSetChanged();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = SuggestCategoryFragment.f242221A0;
            SuggestCategoryFragment.this.r5().accept(InterfaceC14678a.C0797a.f12444a);
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = SuggestCategoryFragment.f242221A0;
            SuggestCategoryFragment.this.r5().accept(InterfaceC14678a.b.f12445a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f242252l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f242252l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f242252l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SuggestCategoryFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f242254l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f242254l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f242254l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f242255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f242255l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f242255l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f242256l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f242256l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f242256l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SuggestCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/screen/step/suggest/category/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.publish.screen.step.suggest.category.d> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.screen.step.suggest.category.d invoke() {
            com.avito.android.publish.screen.step.suggest.category.e eVar = SuggestCategoryFragment.this.f242222n0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.publish.screen.step.suggest.category.d) eVar.get();
        }
    }

    public SuggestCategoryFragment() {
        super(R.layout.fragment_category_suggest);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f242223o0 = new O0(m0.f406844a.b(com.avito.android.publish.screen.step.suggest.category.d.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q5(com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof com.avito.android.publish.screen.step.suggest.category.a
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.publish.screen.step.suggest.category.a r0 = (com.avito.android.publish.screen.step.suggest.category.a) r0
            int r1 = r0.f242261t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242261t = r1
            goto L18
        L13:
            com.avito.android.publish.screen.step.suggest.category.a r0 = new com.avito.android.publish.screen.step.suggest.category.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f242259r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f242261t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment r4 = r0.f242258q
            kotlin.C42729a0.b(r5)
            goto L59
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C42729a0.b(r5)
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L43
            java.lang.String r2 = "step_index"
            int r5 = r5.getInt(r2)
            goto L44
        L43:
            r5 = 0
        L44:
            com.avito.android.publish.C0 r2 = r4.f242224p0
            if (r2 == 0) goto L49
            goto L4a
        L49:
            r2 = 0
        L4a:
            io.reactivex.rxjava3.internal.operators.maybe.I r5 = r2.Pe(r5)
            r0.f242258q = r4
            r0.f242261t = r3
            java.lang.Object r5 = kotlinx.coroutines.rx3.C43292o.g(r5, r0)
            if (r5 != r1) goto L59
            goto L6b
        L59:
            ru.avito.component.toolbar.d r5 = (ru.avito.component.toolbar.d) r5
            if (r5 == 0) goto L69
            com.avito.android.publish.screen.step.suggest.category.d r4 = r4.r5()
            Oe0.a$h r0 = new Oe0.a$h
            r0.<init>(r5)
            r4.accept(r0)
        L69:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment.q5(com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.publish.screen.step.wizard.b
    public final void J3(@Y61.k WizardParameter wizardParameter, boolean z12) {
        r5().accept(new InterfaceC14678a.e(wizardParameter));
    }

    @Override // Id0.c
    public final int K1() {
        Q1 q12 = this.f242229u0;
        if (q12 == null) {
            q12 = null;
        }
        return q12.B().invoke().booleanValue() ? R.layout.publish_button_re23 : R.layout.publish_button;
    }

    @Override // com.avito.android.publish.screen.step.wizard.b
    public final void Q0() {
        r5().accept(InterfaceC14678a.f.f12449a);
    }

    @Override // com.avito.android.publish.screen.step.wizard.b
    public final void Z2() {
        r5().accept(InterfaceC14678a.g.f12450a);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        Object objS = C42745f0.S(getChildFragmentManager().P());
        com.avito.android.ui.fragments.c cVar = objS instanceof com.avito.android.ui.fragments.c ? (com.avito.android.ui.fragments.c) objS : null;
        if (cVar != null) {
            cVar.i0();
            return true;
        }
        r5().accept(InterfaceC14678a.c.f12446a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f242230v0 = context instanceof InterfaceC33875j0 ? (InterfaceC33875j0) context : null;
        this.f242231w0 = context instanceof r ? (r) context : null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.container);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.publish_suggestions_root);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.suggest_recycler_view);
        InterfaceC28373a interfaceC28373a = this.f242227s0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(frameLayout, R.id.recycler_view, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_progress_overlay, 0, 16, null);
        a aVar = new a(frameLayout, frameLayout2, recyclerView, lVar);
        lVar.f231600j = new d();
        t5(aVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 500L;
        }
        C35976x4.a(recyclerView);
        recyclerView.l(new com.avito.android.blueprints.publish.header.a(recyclerView.getResources()), -1);
        recyclerView.o(new com.avito.android.publish.view.p(frameLayout2));
        RecyclerView.Adapter<?> adapter = this.f242225q0;
        if (adapter == null) {
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new e(null), 3);
        com.avito.android.arch.mvi.android.f.a(r5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new f(1, this, SuggestCategoryFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/screen/step/suggest/category/mvi/entity/SuggestCategoryOneTimeEvent;)V", 0), new g(aVar));
        r5().accept(InterfaceC14678a.k.f12454a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.publish.screen.step.suggest.category.di.a.a();
        com.avito.android.publish.screen.step.suggest.category.di.c cVar = (com.avito.android.publish.screen.step.suggest.category.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.screen.step.suggest.category.di.c.class);
        Bundle arguments = getArguments();
        aVarA.a(cVar, arguments != null ? arguments.getInt("step_index") : 0).a(this);
    }

    public final com.avito.android.publish.screen.step.suggest.category.d r5() {
        return (com.avito.android.publish.screen.step.suggest.category.d) this.f242223o0.getValue();
    }

    public final void s5(Navigation navigation2) {
        Bundle arguments = getArguments();
        int i12 = arguments != null ? arguments.getInt("step_index") : 0;
        WizardFragment.f242389y0.getClass();
        WizardFragment wizardFragmentA = WizardFragment.b.a(navigation2, null);
        Bundle arguments2 = wizardFragmentA.getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        arguments2.putInt("step_index", i12);
        wizardFragmentA.setArguments(arguments2);
        androidx.fragment.app.H hE2 = getChildFragmentManager().e();
        hE2.n(R.id.container, wizardFragmentA, null);
        hE2.c(null);
        hE2.e();
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        Hf0.b bVar = new Hf0.b(view);
        bVar.d(getString(R.string.continue_string));
        bVar.b(new c());
        boolean z12 = r5().getState().getValue().f242365d;
        Button button = bVar.f7601a;
        if (z12) {
            if (button != null) {
                D6.H(button);
            }
        } else if (button != null) {
            D6.w(button);
        }
        Q1 q12 = this.f242229u0;
        if (q12 == null) {
            q12 = null;
        }
        if (q12.B().invoke().booleanValue()) {
            D6.G(view, z12);
        }
        this.f242232x0 = bVar;
        this.f242233y0 = view;
    }

    public final void t5(a aVar) {
        C33862g0 c33862g0 = this.f242234z0;
        if (c33862g0 == null) {
            View rootView = aVar.f242235a.getRootView();
            C0 c02 = this.f242224p0;
            if (c02 == null) {
                c02 = null;
            }
            c33862g0 = new C33862g0(rootView, c02.qe());
        }
        c33862g0.b(new h(), new i());
        this.f242234z0 = c33862g0;
    }

    @Override // Id0.c
    public final void g2() {
    }
}
