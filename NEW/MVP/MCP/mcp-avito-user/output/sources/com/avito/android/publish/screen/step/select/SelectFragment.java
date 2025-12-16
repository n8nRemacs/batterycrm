package com.avito.android.publish.screen.step.select;

import Cd.C13243a;
import Ne0.InterfaceC14566a;
import Ne0.c;
import Y41.p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
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
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.InterfaceC33875j0;
import com.avito.android.recycler.layout_manager.UnpredictiveLinearLayoutManager;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: SelectFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/screen/step/select/SelectFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectFragment extends BaseFragment implements com.avito.android.ui.fragments.c, Id0.c, InterfaceC28477j.a {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final b f242071A0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f242072n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f242073o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public C0 f242074p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f242075q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f242076r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f242077s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f242078t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public Q1 f242079u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f242080v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public Hf0.b f242081w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public C33862g0 f242082x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public View f242083y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public InterfaceC33875j0 f242084z0;

    /* compiled from: SelectFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/select/SelectFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RecyclerView f242085a;

        public a(@Y61.k FrameLayout frameLayout, @Y61.k RecyclerView recyclerView) {
            this.f242085a = recyclerView;
        }
    }

    /* compiled from: SelectFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/screen/step/select/SelectFragment$b;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = SelectFragment.f242071A0;
            SelectFragment.this.q5().accept(InterfaceC14566a.j.f11668a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.select.SelectFragment$onViewCreated$1", f = "SelectFragment.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f242087q;

        /* compiled from: SelectFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.screen.step.select.SelectFragment$onViewCreated$1$1", f = "SelectFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f242089q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SelectFragment f242090r;

            /* compiled from: SelectFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.select.SelectFragment$onViewCreated$1$1$1", f = "SelectFragment.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.screen.step.select.SelectFragment$d$a$a, reason: collision with other inner class name */
            public static final class C7252a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242091q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectFragment f242092r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7252a(SelectFragment selectFragment, Continuation<? super C7252a> continuation) {
                    super(2, continuation);
                    this.f242092r = selectFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7252a(this.f242092r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7252a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object next;
                    Object objCollect;
                    z<String> zVarD;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242091q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f242091q = 1;
                        SelectFragment selectFragment = this.f242092r;
                        Set<TV0.d<?, ?>> set = selectFragment.f242078t0;
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
                            if (next instanceof com.avito.android.blueprints.publish.checkable.d) {
                                break;
                            }
                        }
                        com.avito.android.blueprints.publish.checkable.d dVar = (com.avito.android.blueprints.publish.checkable.d) (next instanceof com.avito.android.blueprints.publish.checkable.d ? next : null);
                        if (dVar == null || (zVarD = dVar.d()) == null) {
                            objCollect = G0.f406611a;
                        } else {
                            objCollect = ((AbstractC43168f) y.a(zVarD)).collect(new com.avito.android.publish.screen.step.select.e(selectFragment), this);
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

            /* compiled from: SelectFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.select.SelectFragment$onViewCreated$1$1$2", f = "SelectFragment.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242093q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectFragment f242094r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SelectFragment selectFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f242094r = selectFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f242094r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242093q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f242093q = 1;
                        SelectFragment selectFragment = this.f242094r;
                        com.avito.android.deeplink_handler.handler.composite.a aVar = selectFragment.f242080v0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        Object objCollect = new com.avito.android.publish.screen.step.select.f(y.a(aVar.d9())).collect(new com.avito.android.publish.screen.step.select.g(selectFragment), this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = G0.f406611a;
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

            /* compiled from: SelectFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.select.SelectFragment$onViewCreated$1$1$3", f = "SelectFragment.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242095q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectFragment f242096r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(SelectFragment selectFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f242096r = selectFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f242096r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object next;
                    Object objCollect;
                    com.jakewharton.rxrelay3.c f106098e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242095q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f242095q = 1;
                        SelectFragment selectFragment = this.f242096r;
                        Set<TV0.d<?, ?>> set = selectFragment.f242078t0;
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
                            if (next instanceof com.avito.android.blueprints.publish.checkable.d) {
                                break;
                            }
                        }
                        com.avito.android.blueprints.publish.checkable.d dVar = (com.avito.android.blueprints.publish.checkable.d) (next instanceof com.avito.android.blueprints.publish.checkable.d ? next : null);
                        if (dVar == null || (f106098e = dVar.getF106098e()) == null) {
                            objCollect = G0.f406611a;
                        } else {
                            objCollect = ((AbstractC43168f) y.a(f106098e)).collect(new com.avito.android.publish.screen.step.select.d(selectFragment), this);
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

            /* compiled from: SelectFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.select.SelectFragment$onViewCreated$1$1$4", f = "SelectFragment.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.screen.step.select.SelectFragment$d$a$d, reason: collision with other inner class name */
            public static final class C7253d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242097q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectFragment f242098r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7253d(SelectFragment selectFragment, Continuation<? super C7253d> continuation) {
                    super(2, continuation);
                    this.f242098r = selectFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7253d(this.f242098r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7253d) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object next;
                    Object objCollect;
                    z<DeepLink> zVarB;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242097q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f242097q = 1;
                        SelectFragment selectFragment = this.f242098r;
                        Set<TV0.d<?, ?>> set = selectFragment.f242078t0;
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
                            if (next instanceof com.avito.android.blueprints.publish.header.e) {
                                break;
                            }
                        }
                        com.avito.android.blueprints.publish.header.e eVar = (com.avito.android.blueprints.publish.header.e) (next instanceof com.avito.android.blueprints.publish.header.e ? next : null);
                        if (eVar == null || (zVarB = eVar.B()) == null) {
                            objCollect = G0.f406611a;
                        } else {
                            objCollect = ((AbstractC43168f) y.a(zVarB)).collect(new com.avito.android.publish.screen.step.select.h(selectFragment), this);
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

            /* compiled from: SelectFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.select.SelectFragment$onViewCreated$1$1$5", f = "SelectFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
            public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242099q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectFragment f242100r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(SelectFragment selectFragment, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f242100r = selectFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new e(this.f242100r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242099q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f242099q = 1;
                        b bVar = SelectFragment.f242071A0;
                        SelectFragment selectFragment = this.f242100r;
                        Bundle arguments = selectFragment.getArguments();
                        if (arguments == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        int i13 = arguments.getInt("step_index");
                        C0 c02 = selectFragment.f242074p0;
                        if (c02 == null) {
                            c02 = null;
                        }
                        Object objCollect = ((AbstractC43168f) y.a(c02.Pe(i13).q())).collect(new com.avito.android.publish.screen.step.select.i(selectFragment), this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = G0.f406611a;
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

            /* compiled from: SelectFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.screen.step.select.SelectFragment$onViewCreated$1$1$6", f = "SelectFragment.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
            public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f242101q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectFragment f242102r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(SelectFragment selectFragment, Continuation<? super f> continuation) {
                    super(2, continuation);
                    this.f242102r = selectFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new f(this.f242102r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f242101q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f242101q = 1;
                        SelectFragment selectFragment = this.f242102r;
                        C0 c02 = selectFragment.f242074p0;
                        if (c02 == null) {
                            c02 = null;
                        }
                        Object objCollect = ((AbstractC43168f) y.a(c02.f231882t0)).collect(new com.avito.android.publish.screen.step.select.j(selectFragment), this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = G0.f406611a;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SelectFragment selectFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f242090r = selectFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f242090r, continuation);
                aVar.f242089q = obj;
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
                T t12 = (T) this.f242089q;
                SelectFragment selectFragment = this.f242090r;
                C43259k.d(t12, null, null, new C7252a(selectFragment, null), 3);
                C43259k.d(t12, null, null, new b(selectFragment, null), 3);
                C43259k.d(t12, null, null, new c(selectFragment, null), 3);
                C43259k.d(t12, null, null, new C7253d(selectFragment, null), 3);
                C43259k.d(t12, null, null, new e(selectFragment, null), 3);
                C43259k.d(t12, null, null, new f(selectFragment, null), 3);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return SelectFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f242087q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                SelectFragment selectFragment = SelectFragment.this;
                a aVar = new a(selectFragment, null);
                this.f242087q = 1;
                if (C23056p0.b(selectFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SelectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends C42801a implements Y41.l<Ne0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Ne0.c cVar) {
            Ne0.c cVar2 = cVar;
            SelectFragment selectFragment = (SelectFragment) this.receiver;
            b bVar = SelectFragment.f242071A0;
            selectFragment.getClass();
            if (L.f(cVar2, c.a.f11676a)) {
                InterfaceC33875j0 interfaceC33875j0 = selectFragment.f242084z0;
                if (interfaceC33875j0 != null) {
                    interfaceC33875j0.h();
                    G0 g02 = G0.f406611a;
                }
            } else if (cVar2 instanceof c.C0752c) {
                C33862g0 c33862g0 = selectFragment.f242082x0;
                if (c33862g0 != null) {
                    c33862g0.d(((c.C0752c) cVar2).f11678a);
                    G0 g03 = G0.f406611a;
                }
            } else {
                if (!(cVar2 instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar = selectFragment.f242080v0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, ((c.b) cVar2).f11677a, null, null, 6);
                G0 g04 = G0.f406611a;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNe0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LNe0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Ne0.d, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f242104m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a aVar) {
            super(1);
            this.f242104m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Ne0.d dVar) {
            View view;
            Ne0.d dVar2 = dVar;
            SelectFragment selectFragment = SelectFragment.this;
            com.avito.konveyor.adapter.a aVar = selectFragment.f242076r0;
            if (aVar == null) {
                aVar = null;
            }
            com.avito.konveyor.util.a.a(aVar, dVar2.f11681a);
            RecyclerView.Adapter<?> adapter = selectFragment.f242075q0;
            if (adapter == null) {
                adapter = null;
            }
            adapter.notifyDataSetChanged();
            Hf0.b bVar = selectFragment.f242081w0;
            boolean z12 = dVar2.f11683c;
            if (bVar != null) {
                Button button = bVar.f7601a;
                if (z12) {
                    if (button != null) {
                        D6.H(button);
                    }
                } else if (button != null) {
                    D6.w(button);
                }
            }
            Q1 q12 = selectFragment.f242079u0;
            if ((q12 != null ? q12 : null).B().invoke().booleanValue() && (view = selectFragment.f242083y0) != null) {
                D6.G(view, z12);
            }
            D6.f(this.f242104m.f242085a, 0, 0, 0, dVar2.f11682b, 7);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f242105l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f242105l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f242105l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f242107l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f242107l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f242107l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f242108l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f242108l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f242108l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f242109l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f242109l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f242109l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/select/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/screen/step/select/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.publish.screen.step.select.l> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.screen.step.select.l invoke() {
            m mVar = SelectFragment.this.f242072n0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.publish.screen.step.select.l) mVar.get();
        }
    }

    public SelectFragment() {
        super(R.layout.select_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f242073o0 = new O0(m0.f406844a.b(com.avito.android.publish.screen.step.select.l.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
    }

    @Override // Id0.c
    public final int K1() {
        Q1 q12 = this.f242079u0;
        if (q12 == null) {
            q12 = null;
        }
        return q12.B().invoke().booleanValue() ? R.layout.publish_button_re23 : R.layout.publish_button;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().accept(InterfaceC14566a.g.f11665a);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        com.avito.android.deeplink_handler.view.d dVar = this.f242077s0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(i12, i13, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f242084z0 = context instanceof InterfaceC33875j0 ? (InterfaceC33875j0) context : null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.deeplink_handler.view.d dVar = this.f242077s0;
        if (dVar == null) {
            dVar = null;
        }
        d.a.b(dVar, this, (com.avito.android.deeplink_handler.view.impl.i) e5(), 28);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.select_screen_root);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        a aVar = new a(frameLayout, recyclerView);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new UnpredictiveLinearLayoutManager());
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 500L;
        }
        recyclerView.l(new com.avito.android.blueprints.publish.header.a(getResources()), -1);
        RecyclerView.Adapter<?> adapter = this.f242075q0;
        if (adapter == null) {
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        View rootView = frameLayout.getRootView();
        C0 c02 = this.f242074p0;
        if (c02 == null) {
            c02 = null;
        }
        C33862g0 c33862g0 = new C33862g0(rootView, c02.qe());
        c33862g0.b(new com.avito.android.publish.screen.step.select.b(this), new com.avito.android.publish.screen.step.select.c(this));
        this.f242082x0 = c33862g0;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new d(null), 3);
        com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new e(1, this, SelectFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/screen/step/select/mvi/entity/SelectOneTimeEvent;)Lkotlin/Unit;", 8), new f(aVar));
        q5().accept(InterfaceC14566a.k.f11669a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.publish.screen.step.select.di.a.a().a((com.avito.android.publish.screen.step.select.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.screen.step.select.di.c.class), cv.c.b(this), arguments.getInt("step_index")).a(this);
    }

    public final com.avito.android.publish.screen.step.select.l q5() {
        return (com.avito.android.publish.screen.step.select.l) this.f242073o0.getValue();
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        Hf0.b bVar = new Hf0.b(view);
        bVar.d(getString(R.string.continue_string));
        bVar.b(new c());
        boolean z12 = q5().getState().getValue().f11683c;
        Button button = bVar.f7601a;
        if (z12) {
            if (button != null) {
                D6.H(button);
            }
        } else if (button != null) {
            D6.w(button);
        }
        Q1 q12 = this.f242079u0;
        if (q12 == null) {
            q12 = null;
        }
        if (q12.B().invoke().booleanValue()) {
            D6.G(view, z12);
        }
        this.f242081w0 = bVar;
        view.addOnLayoutChangeListener(new com.avito.android.publish.screen.step.select.a(this, getResources().getDimensionPixelSize(R.dimen.publish_container_vertical_padding), 0));
        this.f242083y0 = view;
    }

    @Override // Id0.c
    public final void g2() {
    }
}
