package com.avito.android.passport.auth_suggest;

import Cd.C13243a;
import F50.a;
import F50.c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.N0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import cU.v;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.ownership.Owners;
import com.avito.android.passport.auth_suggest.di.b;
import com.avito.android.passport.perf_const.PassportAuthSuggestBeduinV2Screen;
import com.avito.android.progress_overlay.l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35968w3;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Collection;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: PassportAuthSuggestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/auth_suggest/PassportAuthSuggestFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportAuthSuggestFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.auth_suggest.d f210916o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f210917p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f210918q0;

    /* renamed from: r0, reason: collision with root package name */
    public ScreenPerformanceTracker f210919r0;

    /* renamed from: s0, reason: collision with root package name */
    public BeduinView f210920s0;

    /* renamed from: t0, reason: collision with root package name */
    public l f210921t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f210922u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f210923v0;

    /* renamed from: w0, reason: collision with root package name */
    public s f210924w0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f210915y0 = {m0.f406844a.e(new Y(PassportAuthSuggestFragment.class, "openParams", "getOpenParams()Lcom/avito/android/passport/auth_suggest/PassportAuthSuggestOpenParams;", 0))};

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f210914x0 = new a(null);

    /* compiled from: PassportAuthSuggestFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/auth_suggest/PassportAuthSuggestFragment$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f210925b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PassportAuthSuggestFragment f210926c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f210927b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PassportAuthSuggestFragment f210928c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment$onViewCreated$$inlined$mapNotNull$1$2", f = "PassportAuthSuggestFragment.kt", i = {}, l = {230}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment$b$a$a, reason: collision with other inner class name */
            public static final class C6299a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f210929q;

                /* renamed from: r, reason: collision with root package name */
                public int f210930r;

                public C6299a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f210929q = obj;
                    this.f210930r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, PassportAuthSuggestFragment passportAuthSuggestFragment) {
                this.f210927b = interfaceC43172j;
                this.f210928c = passportAuthSuggestFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment.b.a.C6299a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment$b$a$a r0 = (com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment.b.a.C6299a) r0
                    int r1 = r0.f210930r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f210930r = r1
                    goto L18
                L13:
                    com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment$b$a$a r0 = new com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f210929q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f210930r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L6a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    kv.a r5 = (kv.C43501a) r5
                    Ju.c r5 = r5.f413261b
                    boolean r6 = r5 instanceof com.avito.android.deep_linking.links.PassportMergeAccountsLink.b.C4011b
                    if (r6 == 0) goto L3e
                    r6 = r3
                    goto L40
                L3e:
                    boolean r6 = r5 instanceof com.avito.android.deep_linking.links.O
                L40:
                    com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment r2 = r4.f210928c
                    if (r6 == 0) goto L4c
                    androidx.fragment.app.m r5 = r2.requireActivity()
                    r5.finish()
                    goto L5d
                L4c:
                    boolean r6 = r5 instanceof com.avito.android.deep_linking.links.PassportMergeAccountsLink.b.a
                    if (r6 == 0) goto L5d
                    com.avito.android.deep_linking.links.PassportMergeAccountsLink$b$a r5 = (com.avito.android.deep_linking.links.PassportMergeAccountsLink.b.a) r5
                    boolean r5 = r5.f133539b
                    if (r5 == 0) goto L5d
                    androidx.fragment.app.m r5 = r2.requireActivity()
                    r5.finish()
                L5d:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    r0.f210930r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f210927b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L6a
                    return r1
                L6a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, PassportAuthSuggestFragment passportAuthSuggestFragment) {
            this.f210925b = interfaceC43160i;
            this.f210926c = passportAuthSuggestFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super G0> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f210925b).collect(new a(interfaceC43172j, this.f210926c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: PassportAuthSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PassportAuthSuggestFragment.f210914x0;
            PassportAuthSuggestFragment passportAuthSuggestFragment = PassportAuthSuggestFragment.this;
            com.avito.android.passport.auth_suggest.c cVarS5 = passportAuthSuggestFragment.s5();
            C43259k.d(N0.a(cVarS5), cVarS5.f210950L.b(), null, new com.avito.android.passport.auth_suggest.b(cVarS5, new a.b((PassportAuthSuggestOpenParams) passportAuthSuggestFragment.f210922u0.getValue(passportAuthSuggestFragment, PassportAuthSuggestFragment.f210915y0[0])), null), 2);
            return G0.f406611a;
        }
    }

    /* compiled from: PassportAuthSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF50/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LF50/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<F50.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(F50.c cVar) {
            a aVar = PassportAuthSuggestFragment.f210914x0;
            PassportAuthSuggestFragment passportAuthSuggestFragment = PassportAuthSuggestFragment.this;
            c.b bVar = cVar.f4542b;
            if (bVar instanceof c.b.C0276c) {
                l lVar = passportAuthSuggestFragment.f210921t0;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.k(null);
            } else if (bVar instanceof c.b.a) {
                l lVar2 = passportAuthSuggestFragment.f210921t0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.j();
                BeduinView beduinView = passportAuthSuggestFragment.f210920s0;
                (beduinView != null ? beduinView : null).b(((c.b.a) bVar).f4543a);
            } else if (bVar instanceof c.b.C0275b) {
                l lVar3 = passportAuthSuggestFragment.f210921t0;
                (lVar3 != null ? lVar3 : null).a("");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PassportAuthSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Set<FV0.h>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = PassportAuthSuggestFragment.f210914x0;
            return PassportAuthSuggestFragment.this.s5().f210948J;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f210935l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f210935l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f210935l);
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
            return PassportAuthSuggestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f210937l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f210937l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f210937l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f210938l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f210938l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f210938l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f210939l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f210939l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f210939l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PassportAuthSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/auth_suggest/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/auth_suggest/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.passport.auth_suggest.c> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.passport.auth_suggest.c invoke() {
            com.avito.android.passport.auth_suggest.d dVar = PassportAuthSuggestFragment.this.f210916o0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.passport.auth_suggest.c) dVar.get();
        }
    }

    public PassportAuthSuggestFragment() {
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f210918q0 = new O0(m0.f406844a.b(com.avito.android.passport.auth_suggest.c.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f210922u0 = new C35968w3(this);
        this.f210923v0 = C42727D.c(new e());
    }

    @Override // FV0.d
    public final void close() {
        requireActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f210919r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.passport_auth_suggest_beduin_v2_page_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        BeduinView beduinView = (BeduinView) view.findViewById(R.id.beduin);
        s sVar = this.f210924w0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f210924w0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f210920s0 = beduinView;
        BeduinView beduinView2 = this.f210920s0;
        l lVar = new l(beduinView2 == null ? null : beduinView2, 0, null, 0, 0, 30, null);
        lVar.f231600j = new c();
        this.f210921t0 = lVar;
        ScreenPerformanceTracker screenPerformanceTracker = this.f210919r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker, s5(), com.avito.android.analytics.screens.mvi.g.f90655l, new d());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f210917p0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new b(y.a(aVar.d9()), this), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f210919r0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        PassportAuthSuggestBeduinV2Screen passportAuthSuggestBeduinV2Screen = PassportAuthSuggestBeduinV2Screen.f211155d;
        this.f210919r0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(passportAuthSuggestBeduinV2Screen, com.avito.android.analytics.screens.s.c(this), "passportAuthSuggestBeduinV2"));
        ZS.b bVar = new ZS.b(passportAuthSuggestBeduinV2Screen, Owners.f210532r, (String) null, 4, (C42822w) null);
        b.a aVarA = com.avito.android.passport.auth_suggest.di.a.a();
        PassportAuthSuggestOpenParams passportAuthSuggestOpenParams = (PassportAuthSuggestOpenParams) this.f210922u0.getValue(this, f210915y0[0]);
        ScreenPerformanceTracker screenPerformanceTracker = this.f210919r0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker == null ? null : screenPerformanceTracker;
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f210919r0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        aVarA.a(passportAuthSuggestOpenParams, screenPerformanceTracker2, new C31138n0(K.a(aVarEd, screenPerformanceTracker3, bVar, cv.c.d(this), null, null, null, 56)), (com.avito.android.passport.auth_suggest.di.c) C29972i.a(C29972i.b(this), com.avito.android.passport.auth_suggest.di.c.class), cv.c.b(this)).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f210919r0;
        this.f210924w0 = aVarFd.a(contextRequireContext, screenPerformanceTracker4 == null ? null : screenPerformanceTracker4, s5().f210949K, v.f57891a, s5().f210947E);
        ScreenPerformanceTracker screenPerformanceTracker5 = this.f210919r0;
        if (screenPerformanceTracker5 == null) {
            screenPerformanceTracker5 = null;
        }
        screenPerformanceTracker5.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker6 = this.f210919r0;
        (screenPerformanceTracker6 != null ? screenPerformanceTracker6 : null).c(this, g5());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final s q5() {
        s sVar = this.f210924w0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f210923v0.getValue();
    }

    public final com.avito.android.passport.auth_suggest.c s5() {
        return (com.avito.android.passport.auth_suggest.c) this.f210918q0.getValue();
    }
}
