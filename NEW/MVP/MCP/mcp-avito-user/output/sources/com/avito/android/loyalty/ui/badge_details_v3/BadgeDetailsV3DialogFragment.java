package com.avito.android.loyalty.ui.badge_details_v3;

import Cd.C13243a;
import Y41.p;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
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
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.loyalty.di.badge_details_v3.a;
import com.avito.android.loyalty.ui.BadgeDetailsV3Screen;
import com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35966w1;
import com.avito.android.util.R0;
import com.avito.android.util.y6;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import fX.C40354b;
import fX.InterfaceC40353a;
import java.util.ArrayList;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: BadgeDetailsV3DialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/BadgeDetailsV3DialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BadgeDetailsV3DialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f183265n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.loyalty.ui.badge_details_v3.k f183266h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f183267i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f183268j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f183269k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public R0 f183270l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public SimpleDraweeView f183271m0;

    /* compiled from: BadgeDetailsV3DialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/BadgeDetailsV3DialogFragment$a;", "", "<init>", "()V", "", "QUERY_KEY", "Ljava/lang/String;", "TAG", "USER_KEY", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BadgeDetailsV3DialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment$a$a, reason: collision with other inner class name */
        public static final class C5379a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f183272l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f183273m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5379a(String str, String str2) {
                super(1);
                this.f183272l = str;
                this.f183273m = str2;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("query", this.f183272l);
                bundle2.putString("user_key", this.f183273m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BadgeDetailsV3DialogFragment a(@Y61.k String str, @l String str2) {
            BadgeDetailsV3DialogFragment badgeDetailsV3DialogFragment = new BadgeDetailsV3DialogFragment();
            C35966w1.a(badgeDetailsV3DialogFragment, 2, new C5379a(str, str2));
            return badgeDetailsV3DialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: BadgeDetailsV3DialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/BadgeDetailsV3DialogFragment$b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Paint f183274b;

        public b(@Y61.k Context context) {
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, y6.b(20), C35835l0.d(R.attr.bg_elevation1, context), C35835l0.d(R.attr.transparentWhite, context), Shader.TileMode.CLAMP));
            this.f183274b = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void onDrawOver(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
            canvas.drawRect(0.0f, 0.0f, recyclerView.getWidth(), y6.b(20), this.f183274b);
        }
    }

    /* compiled from: BadgeDetailsV3DialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment$onCreateDialog$1", f = "BadgeDetailsV3DialogFragment.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f183275q;

        /* compiled from: BadgeDetailsV3DialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment$onCreateDialog$1$1", f = "BadgeDetailsV3DialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f183277q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BadgeDetailsV3DialogFragment f183278r;

            /* compiled from: BadgeDetailsV3DialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment$onCreateDialog$1$1$1", f = "BadgeDetailsV3DialogFragment.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment$c$a$a, reason: collision with other inner class name */
            public static final class C5380a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f183279q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ BadgeDetailsV3DialogFragment f183280r;

                /* compiled from: BadgeDetailsV3DialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C5381a extends H implements Y41.l<C40354b, G0> {
                    @Override // Y41.l
                    public final G0 invoke(C40354b c40354b) {
                        C40354b c40354b2 = c40354b;
                        BadgeDetailsV3DialogFragment badgeDetailsV3DialogFragment = (BadgeDetailsV3DialogFragment) this.receiver;
                        a aVar = BadgeDetailsV3DialogFragment.f183265n0;
                        badgeDetailsV3DialogFragment.getClass();
                        C40354b.C11156b c11156b = c40354b2.f395901b;
                        if (c11156b != null) {
                            UniversalImage universalImage = c11156b.f395903a;
                            Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(badgeDetailsV3DialogFragment.requireContext())) : null;
                            Drawable drawable = androidx.core.content.d.getDrawable(badgeDetailsV3DialogFragment.requireContext(), c11156b.f395904b);
                            SimpleDraweeView simpleDraweeView = badgeDetailsV3DialogFragment.f183271m0;
                            if (simpleDraweeView != null) {
                                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), drawable, null, null, 12);
                            }
                        }
                        SimpleDraweeView simpleDraweeView2 = badgeDetailsV3DialogFragment.f183271m0;
                        if (simpleDraweeView2 != null) {
                            simpleDraweeView2.setVisibility(c11156b != null ? 0 : 8);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (com.avito.conveyor_item.a aVar2 : c40354b2.f395902c) {
                            arrayList.add(aVar2);
                            if (aVar2 instanceof com.avito.android.loyalty.ui.items.collapse.a) {
                                com.avito.android.loyalty.ui.items.collapse.a aVar3 = (com.avito.android.loyalty.ui.items.collapse.a) aVar2;
                                if (aVar3.f183667d) {
                                    arrayList.addAll(aVar3.f183668e);
                                }
                            }
                        }
                        com.avito.konveyor.adapter.d dVar = badgeDetailsV3DialogFragment.f183269k0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        dVar.l(arrayList, null);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5380a(BadgeDetailsV3DialogFragment badgeDetailsV3DialogFragment, Continuation<? super C5380a> continuation) {
                    super(2, continuation);
                    this.f183280r = badgeDetailsV3DialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5380a(this.f183280r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5380a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f183279q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = BadgeDetailsV3DialogFragment.f183265n0;
                        BadgeDetailsV3DialogFragment badgeDetailsV3DialogFragment = this.f183280r;
                        n2<C40354b> state = ((com.avito.android.loyalty.ui.badge_details_v3.j) badgeDetailsV3DialogFragment.f183267i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = badgeDetailsV3DialogFragment.f183268j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C5381a c5381a = new C5381a(1, badgeDetailsV3DialogFragment, BadgeDetailsV3DialogFragment.class, "render", "render(Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3State;)V", 0);
                        this.f183279q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5381a, this) == coroutine_suspended) {
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
            public a(BadgeDetailsV3DialogFragment badgeDetailsV3DialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f183278r = badgeDetailsV3DialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f183278r, continuation);
                aVar.f183277q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C43259k.d((T) this.f183277q, null, null, new C5380a(this.f183278r, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return BadgeDetailsV3DialogFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f183275q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                BadgeDetailsV3DialogFragment badgeDetailsV3DialogFragment = BadgeDetailsV3DialogFragment.this;
                a aVar = new a(badgeDetailsV3DialogFragment, null);
                this.f183275q = 1;
                if (C23056p0.b(badgeDetailsV3DialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: BadgeDetailsV3DialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        public final void f(@Y61.k View view) {
            BadgeDetailsV3DialogFragment badgeDetailsV3DialogFragment = (BadgeDetailsV3DialogFragment) this.receiver;
            a aVar = BadgeDetailsV3DialogFragment.f183265n0;
            badgeDetailsV3DialogFragment.getClass();
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.badgeDetailsRecycler);
            recyclerView.l(new PV.a(y6.b(20), y6.b(20), y6.b(24), y6.b(24)), -1);
            recyclerView.l(new b(badgeDetailsV3DialogFragment.requireContext()), -1);
            com.avito.konveyor.adapter.d dVar = badgeDetailsV3DialogFragment.f183269k0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            ScreenPerformanceTracker screenPerformanceTracker = badgeDetailsV3DialogFragment.f183268j0;
            (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: BadgeDetailsV3DialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = BadgeDetailsV3DialogFragment.f183265n0;
            ((com.avito.android.loyalty.ui.badge_details_v3.j) BadgeDetailsV3DialogFragment.this.f183267i0.getValue()).accept(InterfaceC40353a.c.f395898a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f183282l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f183282l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f183282l);
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
            return BadgeDetailsV3DialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f183284l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f183284l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f183284l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f183285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f183285l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f183285l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f183286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f183286l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f183286l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BadgeDetailsV3DialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/loyalty/ui/badge_details_v3/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.loyalty.ui.badge_details_v3.j> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.loyalty.ui.badge_details_v3.j invoke() {
            com.avito.android.loyalty.ui.badge_details_v3.k kVar = BadgeDetailsV3DialogFragment.this.f183266h0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.loyalty.ui.badge_details_v3.j) kVar.get();
        }
    }

    public BadgeDetailsV3DialogFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f183267i0 = new O0(m0.f406844a.b(com.avito.android.loyalty.ui.badge_details_v3.j.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.avito.android.loyalty.ui.badge_details_v3.c] */
    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        String string;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("query")) == null) {
            throw new IllegalArgumentException("Query not set");
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("user_key") : null;
        a.InterfaceC5362a interfaceC5362aA = com.avito.android.loyalty.di.badge_details_v3.e.a();
        ?? r32 = new com.avito.android.loyalty.ui.items.collapse.d() { // from class: com.avito.android.loyalty.ui.badge_details_v3.c
            @Override // com.avito.android.loyalty.ui.items.collapse.d
            public final void a(com.avito.android.loyalty.ui.items.collapse.a aVar) {
                BadgeDetailsV3DialogFragment.a aVar2 = BadgeDetailsV3DialogFragment.f183265n0;
                ((j) this.f183289b.f183267i0.getValue()).accept(new InterfaceC40353a.C11155a(aVar));
            }
        };
        com.avito.android.cpt.pre_activation.ui.c cVar = new com.avito.android.cpt.pre_activation.ui.c(this, 16);
        e eVar = new e();
        BadgeDetailsV3Screen badgeDetailsV3Screen = BadgeDetailsV3Screen.f183245d;
        r rVarB = s.b(this);
        badgeDetailsV3Screen.getClass();
        interfaceC5362aA.a(r32, cVar, eVar, new C28478k(badgeDetailsV3Screen, rVarB, BadgeDetailsV3Screen.f183246e), string, string2, (com.avito.android.loyalty.di.badge_details_v3.b) C29972i.a(C29972i.b(this), com.avito.android.loyalty.di.badge_details_v3.b.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183268j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f183268j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(requireContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        View viewInflate = View.inflate(dVar.getContext(), R.layout.dialog_badge_details_v3_header, null);
        this.f183271m0 = (SimpleDraweeView) viewInflate.findViewById(R.id.badgeDetailsHeaderImage);
        dVar.H(viewInflate);
        dVar.C(R.layout.dialog_badge_details_v3, new d(1, this, BadgeDetailsV3DialogFragment.class, "onViewInflated", "onViewInflated(Landroid/view/View;)V", 0));
        return dVar;
    }
}
