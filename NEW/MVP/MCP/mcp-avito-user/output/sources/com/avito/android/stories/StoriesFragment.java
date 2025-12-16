package com.avito.android.stories;

import Cd.C13243a;
import Fx0.InterfaceC13851a;
import Fx0.InterfaceC13852b;
import ak.C19902a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.stories.D;
import com.avito.android.stories.mvi.entity.StoriesState;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qK0.C47311a;
import z1.AbstractC50339a;

/* compiled from: StoriesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/stories/StoriesFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/ui/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoriesFragment extends TabBaseFragment implements com.avito.android.ui.fragments.c, com.avito.android.ui.a, InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f284995t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public D.a f284996u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f284997v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47311a f284998w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f284999x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f285000y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public Intent f285001z0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f284994B0 = {m0.f406844a.e(new Y(StoriesFragment.class, "storiesView", "getStoriesView()Lcom/avito/android/stories/StoriesView;", 0))};

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f284993A0 = new a(null);

    /* compiled from: StoriesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/stories/StoriesFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: StoriesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.stories.StoriesFragment$a$a, reason: collision with other inner class name */
        public static final class C8525a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ StoriesArguments f285002l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8525a(StoriesArguments storiesArguments) {
                super(1);
                this.f285002l = storiesArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f285002l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static StoriesFragment a(@Y61.k StoriesArguments storiesArguments) {
            StoriesFragment storiesFragment = new StoriesFragment();
            C35966w1.a(storiesFragment, -1, new C8525a(storiesArguments));
            return storiesFragment;
        }

        public a() {
        }
    }

    /* compiled from: StoriesFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/stories/StoriesFragment$b", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a.InterfaceC4053a {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d.a f285004c;

        public b(d.a aVar) {
            this.f285004c = aVar;
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void J(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, G0> lVar) {
            a aVar = StoriesFragment.f284993A0;
            StoriesFragment storiesFragment = StoriesFragment.this;
            storiesFragment.getClass();
            if (C19902a.a(intent) == null) {
                C35966w1.e(storiesFragment, intent, i12, lVar);
            } else {
                storiesFragment.C5(i12, intent);
            }
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void R(@Y61.k Intent intent, @Y61.k Y41.l<? super Exception, G0> lVar) {
            a aVar = StoriesFragment.f284993A0;
            StoriesFragment.this.getClass();
            this.f285004c.R(intent, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void X(int i12, @Y61.k Intent intent) {
            this.f285004c.X(i12, intent);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void g1(@Y61.k Y41.l<? super Context, G0> lVar) {
            this.f285004c.g1(lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void s1() {
            this.f285004c.s1();
        }
    }

    /* compiled from: StoriesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.l<InterfaceC13852b, G0> {
        public final void f(@Y61.k InterfaceC13852b interfaceC13852b) {
            ActivityC22955m activityC22955mL1;
            StoriesFragment storiesFragment = (StoriesFragment) this.receiver;
            a aVar = StoriesFragment.f284993A0;
            storiesFragment.getClass();
            if (L.f(interfaceC13852b, InterfaceC13852b.e.f6089a)) {
                storiesFragment.D5().onResume();
                return;
            }
            if (L.f(interfaceC13852b, InterfaceC13852b.d.f6088a)) {
                storiesFragment.D5().onPause();
                return;
            }
            if (!(interfaceC13852b instanceof InterfaceC13852b.a)) {
                if (interfaceC13852b instanceof InterfaceC13852b.c) {
                    InterfaceC35845m2 interfaceC35845m2 = storiesFragment.f285000y0;
                    if (interfaceC35845m2 == null) {
                        interfaceC35845m2 = null;
                    }
                    Intent intentQ = interfaceC35845m2.q(((InterfaceC13852b.c) interfaceC13852b).f6087a, null);
                    if (intentQ != null) {
                        C35966w1.g(storiesFragment, intentQ, C35057f.f285141l);
                        return;
                    }
                    return;
                }
                if (interfaceC13852b instanceof InterfaceC13852b.h) {
                    InterfaceC13852b.h hVar = (InterfaceC13852b.h) interfaceC13852b;
                    Context context = storiesFragment.getContext();
                    if (context != null) {
                        L5.b(context, hVar.f6092a, 0);
                        return;
                    }
                    return;
                }
                if (L.f(interfaceC13852b, InterfaceC13852b.f.f6090a)) {
                    storiesFragment.D5().c7(androidx.core.content.d.getColor(storiesFragment.requireContext(), R.color.constantWarmGray1));
                    return;
                }
                if (L.f(interfaceC13852b, InterfaceC13852b.g.f6091a)) {
                    storiesFragment.D5().c7(C35835l0.d(R.attr.constantBlack, storiesFragment.requireContext()));
                    return;
                } else {
                    if (interfaceC13852b instanceof InterfaceC13852b.C0313b) {
                        InterfaceC13852b.C0313b c0313b = (InterfaceC13852b.C0313b) interfaceC13852b;
                        storiesFragment.D5().m(c0313b.f6085a, c0313b.f6086b);
                        return;
                    }
                    return;
                }
            }
            if (storiesFragment.f285001z0 != null) {
                ActivityC22955m activityC22955mL12 = storiesFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.startActivity(storiesFragment.f285001z0);
                }
                if (storiesFragment.l1() instanceof StoriesActivity) {
                    ActivityC22955m activityC22955mL13 = storiesFragment.l1();
                    if (activityC22955mL13 != null) {
                        activityC22955mL13.finish();
                    }
                    storiesFragment.F5();
                }
            } else {
                InterfaceC13852b.a aVar2 = (InterfaceC13852b.a) interfaceC13852b;
                Intent intent = new Intent();
                intent.putExtra("last_viewed_story_id", aVar2.f6082c);
                intent.putExtra("viewed_stories_ids", (String[]) aVar2.f6083d.toArray(new String[0]));
                intent.putExtra("need_ux_feedback", aVar2.f6084e);
                boolean z12 = storiesFragment.l1() instanceof StoriesActivity;
                boolean z13 = aVar2.f6081b;
                if (z12) {
                    ActivityC22955m activityC22955mL14 = storiesFragment.l1();
                    if (activityC22955mL14 != null) {
                        activityC22955mL14.setResult(-1, intent);
                    }
                    if (z13 && (activityC22955mL1 = storiesFragment.l1()) != null) {
                        activityC22955mL1.finish();
                    }
                } else {
                    storiesFragment.B5(-1, intent);
                    if (z13) {
                        storiesFragment.r5();
                    }
                }
            }
            if (((InterfaceC13852b.a) interfaceC13852b).f6080a) {
                storiesFragment.F5();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC13852b interfaceC13852b) {
            f(interfaceC13852b);
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/stories/mvi/entity/StoriesState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<StoriesState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(StoriesState storiesState) {
            a aVar = StoriesFragment.f284993A0;
            StoriesFragment.this.D5().g(storiesState);
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends C42801a implements Y41.p<InterfaceC13851a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(InterfaceC13851a interfaceC13851a, Continuation<? super G0> continuation) {
            D d12 = (D) this.receiver;
            a aVar = StoriesFragment.f284993A0;
            d12.accept(interfaceC13851a);
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "<anonymous>", "(Lcom/avito/android/util/P2;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.StoriesFragment$onViewCreated$2", f = "StoriesFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<P2<? super G0>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f285006q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = StoriesFragment.this.new f(continuation);
            fVar.f285006q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(P2<? super G0> p22, Continuation<? super G0> continuation) {
            return ((f) create(p22, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            P2 p22 = (P2) this.f285006q;
            a aVar = StoriesFragment.f284993A0;
            StoriesFragment.this.E5().accept(new InterfaceC13851a.c(p22));
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "", "it", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.StoriesFragment$onViewCreated$3", f = "StoriesFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super P2<? super G0>>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f285008q;

        public g() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super P2<? super G0>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            g gVar = new g(3, continuation);
            gVar.f285008q = th2;
            return gVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("Stories", "LoadStatesError", this.f285008q);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f285009l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f285009l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f285009l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StoriesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f285011l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f285011l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f285011l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f285012l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f285012l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f285012l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f285013l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f285013l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f285013l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StoriesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/stories/D;", "invoke", "()Lcom/avito/android/stories/D;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<D> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final D invoke() {
            D.a aVar = StoriesFragment.this.f284996u0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.create();
        }
    }

    public StoriesFragment() {
        super(0, 1, null);
        this.f284995t0 = new NavigationState(false, null, 2, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f284997v0 = new O0(m0.f406844a.b(D.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f284998w0 = new C47311a(null, 1, null);
    }

    public final x D5() {
        kotlin.reflect.n<Object> nVar = f284994B0[0];
        return (x) this.f284998w0.a();
    }

    public final D E5() {
        return (D) this.f284997v0.getValue();
    }

    public final void F5() {
        if (l1() instanceof StoriesActivity) {
            if (Build.VERSION.SDK_INT >= 34) {
                ActivityC22955m activityC22955mL1 = l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.overrideActivityTransition(1, 0, R.anim.fade_out_stories);
                    return;
                }
                return;
            }
            ActivityC22955m activityC22955mL12 = l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.overridePendingTransition(0, R.anim.fade_out_stories);
            }
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new b(new d.a(this));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        E5().accept(InterfaceC13851a.f.f6072a);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        requireActivity().setRequestedOrientation(1);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f284999x0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        requireActivity().setRequestedOrientation(1);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f284999x0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, E5(), new c(1, this, StoriesFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/stories/mvi/entity/StoriesOneTimeEvent;)V", 0), new d());
        return layoutInflater.inflate(R.layout.stories_screen, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        requireActivity().setRequestedOrientation(-1);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        b5(null, null);
        c5(null, null);
        E5().accept(InterfaceC13851a.g.f6073a);
        com.avito.android.lib.util.i.f181373a.getClass();
        if (com.avito.android.lib.util.i.f181377e) {
            com.avito.android.lib.util.z zVar = com.avito.android.lib.util.z.f181429a;
            Window window = requireActivity().getWindow();
            Context contextRequireContext = requireContext();
            zVar.getClass();
            com.avito.android.lib.util.z.a(window, contextRequireContext, null);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Integer numValueOf = Integer.valueOf(R.attr.constantBlack);
        Boolean bool = Boolean.FALSE;
        b5(numValueOf, bool);
        c5(numValueOf, bool);
        E5().accept(InterfaceC13851a.h.f6074a);
        com.avito.android.lib.util.i.f181373a.getClass();
        if (com.avito.android.lib.util.i.f181377e) {
            com.avito.android.lib.util.z zVar = com.avito.android.lib.util.z.f181429a;
            Window window = requireActivity().getWindow();
            Context contextRequireContext = requireContext();
            zVar.getClass();
            com.avito.android.lib.util.z.a(window, contextRequireContext, numValueOf);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f284999x0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        z zVar = new z(view);
        kotlin.reflect.n<Object> nVar = f284994B0[0];
        this.f284998w0.b(this, zVar);
        if (bundle == null) {
            D5().p();
        }
        C43175k.K(new C43197r1(new e(2, E5(), D.class, "accept", "accept(Ljava/lang/Object;)V", 4), D5().U5()), C22984Q.a(getViewLifecycleOwner()));
        C43175k.K(new C43152f0(new C43197r1(new f(null), D5().getF285371m()), new g(3, null)), C22984Q.a(getViewLifecycleOwner()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        C28478k c28478k = new C28478k(StoriesPerfScreen.f285027d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            StoriesArguments storiesArguments = (StoriesArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arguments", StoriesArguments.class) : arguments.getParcelable("arguments"));
            if (storiesArguments != null) {
                this.f285001z0 = storiesArguments.f284990d;
                com.avito.android.stories.di.component.a.a().a(getResources(), (com.avito.android.stories.di.component.c) C29972i.a(C29972i.b(this), com.avito.android.stories.di.component.c.class), storiesArguments, cv.c.b(this), c28478k).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f284999x0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                return;
            }
        }
        throw new RuntimeException("arguments was not passed to " + this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF261842N0() {
        return this.f284995t0;
    }
}
