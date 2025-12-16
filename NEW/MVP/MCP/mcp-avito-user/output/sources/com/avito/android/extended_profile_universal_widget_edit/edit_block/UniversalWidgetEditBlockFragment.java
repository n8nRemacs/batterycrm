package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import Cd.C13243a;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
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
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetImageUploader;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.di.b;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kB.InterfaceC42561a;
import kB.InterfaceC42563c;
import kB.d;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: UniversalWidgetEditBlockFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UniversalWidgetEditBlockFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f153966s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_universal_widget_edit.edit_block.l f153967n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f153968o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f153969p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public m f153970q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f153971r0;

    /* compiled from: UniversalWidgetEditBlockFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockFragment$a;", "", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: UniversalWidgetEditBlockFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment$a$a, reason: collision with other inner class name */
        public static final class C4494a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UniversalWidgetEditBlockArguments f153972l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4494a(UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments) {
                super(1);
                this.f153972l = universalWidgetEditBlockArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("universal_widget_edit_block_arguments", this.f153972l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static UniversalWidgetEditBlockFragment a(@Y61.k UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments) {
            UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment = new UniversalWidgetEditBlockFragment();
            C35966w1.a(universalWidgetEditBlockFragment, -1, new C4494a(universalWidgetEditBlockArguments));
            return universalWidgetEditBlockFragment;
        }

        public a() {
        }
    }

    /* compiled from: UniversalWidgetEditBlockFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<UniversalWidgetEditBlockArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalWidgetEditBlockArguments invoke() {
            return (UniversalWidgetEditBlockArguments) UniversalWidgetEditBlockFragment.this.requireArguments().getParcelable("universal_widget_edit_block_arguments");
        }
    }

    /* compiled from: UniversalWidgetEditBlockFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment$onCreate$1", f = "UniversalWidgetEditBlockFragment.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153974q;

        /* compiled from: UniversalWidgetEditBlockFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LkB/c;", "event", "Lkotlin/G0;", "emit", "(LkB/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UniversalWidgetEditBlockFragment f153976b;

            public a(UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment) {
                this.f153976b = universalWidgetEditBlockFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC42563c interfaceC42563c = (InterfaceC42563c) obj;
                a aVar = UniversalWidgetEditBlockFragment.f153966s0;
                UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment = this.f153976b;
                if (interfaceC42563c instanceof InterfaceC42563c.C11609c) {
                    m mVar = universalWidgetEditBlockFragment.f153970q0;
                    (mVar != null ? mVar : null).b(((InterfaceC42563c.C11609c) interfaceC42563c).f406174a);
                } else if (interfaceC42563c instanceof InterfaceC42563c.b) {
                    m mVar2 = universalWidgetEditBlockFragment.f153970q0;
                    (mVar2 != null ? mVar2 : null).a(((InterfaceC42563c.b) interfaceC42563c).f406173a);
                } else if (interfaceC42563c instanceof InterfaceC42563c.a) {
                    universalWidgetEditBlockFragment.getParentFragmentManager().o0(C22777e.b(new Q("edit_universal_widget_block_result", ((InterfaceC42563c.a) interfaceC42563c).f406172a)), "edit_universal_widget_block_result_key");
                    universalWidgetEditBlockFragment.getParentFragmentManager().Y();
                }
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return UniversalWidgetEditBlockFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153974q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = UniversalWidgetEditBlockFragment.f153966s0;
                UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment = UniversalWidgetEditBlockFragment.this;
                com.avito.android.extended_profile_universal_widget_edit.edit_block.k kVar = (com.avito.android.extended_profile_universal_widget_edit.edit_block.k) universalWidgetEditBlockFragment.f153968o0.getValue();
                a aVar2 = new a(universalWidgetEditBlockFragment);
                this.f153974q = 1;
                if (kVar.ke(aVar2, this) == coroutine_suspended) {
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

    /* compiled from: UniversalWidgetEditBlockFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment$onCreateView$1", f = "UniversalWidgetEditBlockFragment.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153977q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.extended_profile_universal_widget_edit.edit_block.i f153979s;

        /* compiled from: UniversalWidgetEditBlockFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment$onCreateView$1$1", f = "UniversalWidgetEditBlockFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f153980q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ UniversalWidgetEditBlockFragment f153981r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.extended_profile_universal_widget_edit.edit_block.i f153982s;

            /* compiled from: UniversalWidgetEditBlockFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment$onCreateView$1$1$1", f = "UniversalWidgetEditBlockFragment.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment$d$a$a, reason: collision with other inner class name */
            public static final class C4495a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f153983q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ UniversalWidgetEditBlockFragment f153984r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.extended_profile_universal_widget_edit.edit_block.i f153985s;

                /* compiled from: UniversalWidgetEditBlockFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LkB/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LkB/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment$d$a$a$a, reason: collision with other inner class name */
                public static final class C4496a extends N implements Y41.l<kB.d, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.extended_profile_universal_widget_edit.edit_block.i f153986l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C4496a(com.avito.android.extended_profile_universal_widget_edit.edit_block.i iVar) {
                        super(1);
                        this.f153986l = iVar;
                    }

                    @Override // Y41.l
                    public final G0 invoke(kB.d dVar) throws Resources.NotFoundException {
                        G0 g02;
                        G0 g03;
                        kB.d dVar2 = dVar;
                        com.avito.android.extended_profile_universal_widget_edit.edit_block.i iVar = this.f153986l;
                        I5.a(iVar.f154058d, dVar2.f406176c, false);
                        I5.a(iVar.f154059e, dVar2.f406177d, false);
                        UniversalWidgetImageUploader universalWidgetImageUploader = iVar.f154060f;
                        Boolean bool = dVar2.f406180g;
                        UniversalWidgetImageUploader.a aVar = dVar2.f406178e;
                        if (aVar != null) {
                            D6.H(universalWidgetImageUploader);
                            universalWidgetImageUploader.g(aVar, bool != null ? bool.booleanValue() : false);
                            g02 = G0.f406611a;
                        } else {
                            g02 = null;
                        }
                        if (g02 == null) {
                            D6.w(universalWidgetImageUploader);
                        }
                        UniversalWidgetImageUploader universalWidgetImageUploader2 = iVar.f154061g;
                        UniversalWidgetImageUploader.a aVar2 = dVar2.f406179f;
                        if (aVar2 != null) {
                            D6.H(universalWidgetImageUploader2);
                            universalWidgetImageUploader2.g(aVar2, bool != null ? bool.booleanValue() : false);
                            g03 = G0.f406611a;
                        } else {
                            g03 = null;
                        }
                        if (g03 == null) {
                            D6.w(universalWidgetImageUploader2);
                        }
                        d.a aVar3 = dVar2.f406182i;
                        I5.a(iVar.f154064j, aVar3 != null ? aVar3.f406185a : null, false);
                        iVar.a(aVar3, iVar.f154065k);
                        d.a aVar4 = dVar2.f406183j;
                        I5.a(iVar.f154066l, aVar4 != null ? aVar4.f406185a : null, false);
                        iVar.a(aVar4, iVar.f154067m);
                        d.a aVar5 = dVar2.f406184k;
                        I5.a(iVar.f154068n, aVar5 != null ? aVar5.f406185a : null, false);
                        iVar.a(aVar5, iVar.f154069o);
                        TextView textView = iVar.f154063i;
                        Switcher switcher = iVar.f154062h;
                        if (bool != null) {
                            D6.H(switcher);
                            switcher.setChecked(bool.booleanValue());
                            I5.a(textView, dVar2.f406181h, false);
                        } else {
                            D6.w(switcher);
                            D6.w(textView);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4495a(UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment, com.avito.android.extended_profile_universal_widget_edit.edit_block.i iVar, Continuation<? super C4495a> continuation) {
                    super(2, continuation);
                    this.f153984r = universalWidgetEditBlockFragment;
                    this.f153985s = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4495a(this.f153984r, this.f153985s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C4495a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f153983q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = UniversalWidgetEditBlockFragment.f153966s0;
                        UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment = this.f153984r;
                        n2<kB.d> state = ((com.avito.android.extended_profile_universal_widget_edit.edit_block.k) universalWidgetEditBlockFragment.f153968o0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = universalWidgetEditBlockFragment.f153969p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C4496a c4496a = new C4496a(this.f153985s);
                        this.f153983q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c4496a, this) == coroutine_suspended) {
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
            public a(UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment, com.avito.android.extended_profile_universal_widget_edit.edit_block.i iVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f153981r = universalWidgetEditBlockFragment;
                this.f153982s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f153981r, this.f153982s, continuation);
                aVar.f153980q = obj;
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
                C43259k.d((T) this.f153980q, null, null, new C4495a(this.f153981r, this.f153982s, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.extended_profile_universal_widget_edit.edit_block.i iVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f153979s = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return UniversalWidgetEditBlockFragment.this.new d(this.f153979s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153977q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                com.avito.android.extended_profile_universal_widget_edit.edit_block.i iVar = this.f153979s;
                UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment = UniversalWidgetEditBlockFragment.this;
                a aVar = new a(universalWidgetEditBlockFragment, iVar, null);
                this.f153977q = 1;
                if (C23056p0.b(universalWidgetEditBlockFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: UniversalWidgetEditBlockFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC42561a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC42561a interfaceC42561a) {
            ((com.avito.android.extended_profile_universal_widget_edit.edit_block.k) this.receiver).accept(interfaceC42561a);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditBlockFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LkB/a;", "it", "Lkotlin/G0;", "invoke", "(LkB/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC42561a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC42561a interfaceC42561a) {
            a aVar = UniversalWidgetEditBlockFragment.f153966s0;
            ((com.avito.android.extended_profile_universal_widget_edit.edit_block.k) UniversalWidgetEditBlockFragment.this.f153968o0.getValue()).accept(interfaceC42561a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f153988l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f153988l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f153988l);
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
            return UniversalWidgetEditBlockFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f153990l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f153990l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f153990l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f153991l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f153991l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f153991l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f153992l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f153992l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f153992l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UniversalWidgetEditBlockFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.extended_profile_universal_widget_edit.edit_block.k> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.extended_profile_universal_widget_edit.edit_block.k invoke() {
            com.avito.android.extended_profile_universal_widget_edit.edit_block.l lVar = UniversalWidgetEditBlockFragment.this.f153967n0;
            if (lVar == null) {
                lVar = null;
            }
            return (com.avito.android.extended_profile_universal_widget_edit.edit_block.k) lVar.get();
        }
    }

    public UniversalWidgetEditBlockFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f153968o0 = new O0(m0.f406844a.b(com.avito.android.extended_profile_universal_widget_edit.edit_block.k.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f153971r0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f153969p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.universal_widget_edit_block_fragment, viewGroup, false);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new d(new com.avito.android.extended_profile_universal_widget_edit.edit_block.i(viewInflate, (UniversalWidgetEditBlockArguments) this.f153971r0.getValue(), new e(1, (com.avito.android.extended_profile_universal_widget_edit.edit_block.k) this.f153968o0.getValue(), com.avito.android.extended_profile_universal_widget_edit.edit_block.k.class, "accept", "accept(Ljava/lang/Object;)V", 0)), null), 3);
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f153969p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.extended_profile_universal_widget_edit.edit_block.di.a.a();
        UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments = (UniversalWidgetEditBlockArguments) this.f153971r0.getValue();
        Resources resources = getResources();
        aVarA.a(universalWidgetEditBlockArguments, new C28478k(ProfileManagementUniversalWidgetEditBlockScreen.f153961d, s.c(this), null, 4, null), this, resources, new f(), (com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f153969p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
