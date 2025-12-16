package com.avito.android.publish.edit_advert_request_mvi;

import Cd.C13243a;
import Y41.p;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.publish.InterfaceC33875j0;
import com.avito.android.publish.edit_advert_request.di.c;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import ee0.C40097d;
import ee0.InterfaceC40094a;
import ee0.InterfaceC40096c;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: EditRequestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/EditRequestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/f;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EditRequestFragment extends BaseFragment implements com.avito.android.ui.fragments.c, Id0.f, InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f235540n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f235541o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f235542p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f235543q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f235544r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public InterfaceC33875j0 f235545s0;

    /* compiled from: EditRequestFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/EditRequestFragment$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.progress_overlay.l f235546a;

        public a(@Y61.k com.avito.android.progress_overlay.l lVar) {
            this.f235546a = lVar;
        }
    }

    /* compiled from: EditRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            EditRequestFragment.this.q5().accept(InterfaceC40094a.d.f395290a);
            return G0.f406611a;
        }
    }

    /* compiled from: EditRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.EditRequestFragment$onViewCreated$2", f = "EditRequestFragment.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f235548q;

        /* compiled from: EditRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.EditRequestFragment$onViewCreated$2$1", f = "EditRequestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f235550q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ EditRequestFragment f235551r;

            /* compiled from: EditRequestFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.EditRequestFragment$onViewCreated$2$1$1", f = "EditRequestFragment.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.publish.edit_advert_request_mvi.EditRequestFragment$c$a$a, reason: collision with other inner class name */
            public static final class C7103a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f235552q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ EditRequestFragment f235553r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7103a(EditRequestFragment editRequestFragment, Continuation<? super C7103a> continuation) {
                    super(2, continuation);
                    this.f235553r = editRequestFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7103a(this.f235553r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7103a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f235552q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f235552q = 1;
                        EditRequestFragment editRequestFragment = this.f235553r;
                        com.avito.android.deeplink_handler.handler.composite.a aVar = editRequestFragment.f235544r0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        Object objCollect = ((AbstractC43168f) y.a(aVar.d9())).collect(new com.avito.android.publish.edit_advert_request_mvi.c(editRequestFragment), this);
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
            public a(EditRequestFragment editRequestFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f235551r = editRequestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f235551r, continuation);
                aVar.f235550q = obj;
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
                C43259k.d((T) this.f235550q, null, null, new C7103a(this.f235551r, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return EditRequestFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f235548q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                EditRequestFragment editRequestFragment = EditRequestFragment.this;
                a aVar = new a(editRequestFragment, null);
                this.f235548q = 1;
                if (C23056p0.b(editRequestFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: EditRequestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends C42801a implements Y41.l<InterfaceC40096c, G0> {
        public final void a(@Y61.k InterfaceC40096c interfaceC40096c) {
            EditRequestFragment editRequestFragment = (EditRequestFragment) this.receiver;
            editRequestFragment.getClass();
            if (interfaceC40096c instanceof InterfaceC40096c.C11098c) {
                InterfaceC40096c.C11098c c11098c = (InterfaceC40096c.C11098c) interfaceC40096c;
                com.avito.android.lib.deprecated_design.dialog.a aVar = editRequestFragment.f235543q0;
                com.avito.android.lib.deprecated_design.dialog.a aVar2 = aVar != null ? aVar : null;
                Action.Confirmation confirmation = c11098c.f395300a;
                aVar2.b(null, confirmation.getDescription(), confirmation.getCancel(), new com.avito.android.publish.edit_advert_request_mvi.a(editRequestFragment), confirmation.getOk(), new com.avito.android.publish.edit_advert_request_mvi.b(editRequestFragment, c11098c.f395301b));
                G0 g02 = G0.f406611a;
                return;
            }
            if (interfaceC40096c instanceof InterfaceC40096c.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = editRequestFragment.f235544r0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, ((InterfaceC40096c.b) interfaceC40096c).f395299a, null, null, 6);
                G0 g03 = G0.f406611a;
                return;
            }
            if (!(interfaceC40096c instanceof InterfaceC40096c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC33875j0 interfaceC33875j0 = editRequestFragment.f235545s0;
            if (interfaceC33875j0 != null) {
                interfaceC33875j0.t(((InterfaceC40096c.a) interfaceC40096c).f395298a);
                G0 g04 = G0.f406611a;
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC40096c interfaceC40096c) {
            a(interfaceC40096c);
            return G0.f406611a;
        }
    }

    /* compiled from: EditRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lee0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lee0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<C40097d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f235554l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EditRequestFragment editRequestFragment, a aVar) {
            super(1);
            this.f235554l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(C40097d c40097d) {
            C40097d c40097d2 = c40097d;
            boolean z12 = c40097d2.f395304a;
            com.avito.android.progress_overlay.l lVar = this.f235554l.f235546a;
            if (z12) {
                lVar.k(null);
            } else {
                String str = c40097d2.f395305b;
                if (str != null) {
                    lVar.a(str);
                } else {
                    lVar.j();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f235555l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f235555l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f235555l);
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
            return EditRequestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f235557l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f235557l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f235557l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f235558l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f235558l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f235558l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f235559l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f235559l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f235559l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EditRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/edit_advert_request_mvi/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<n> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            o oVar = EditRequestFragment.this.f235540n0;
            if (oVar == null) {
                oVar = null;
            }
            return (n) oVar.get();
        }
    }

    public EditRequestFragment() {
        super(R.layout.edit_advert_request_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f235541o0 = new O0(m0.f406844a.b(n.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f235545s0 = context instanceof InterfaceC33875j0 ? (InterfaceC33875j0) context : null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f235542p0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.content, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_confirm_progress_overlay, 0, 16, null);
        a aVar = new a(lVar);
        lVar.f231600j = new b();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
        com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new d(1, this, EditRequestFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/edit_advert_request_mvi/mvi/entity/EditRequestOneTimeEvent;)Lkotlin/Unit;", 8), new e(this, aVar));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        c.a aVarA = com.avito.android.publish.edit_advert_request.di.a.a();
        aVarA.c((com.avito.android.publish.edit_advert_request.di.b) C29972i.a(C29972i.b(this), com.avito.android.publish.edit_advert_request.di.b.class));
        aVarA.b(getResources());
        aVarA.a(cv.c.b(this));
        aVarA.build().b(this);
    }

    public final n q5() {
        return (n) this.f235541o0.getValue();
    }
}
