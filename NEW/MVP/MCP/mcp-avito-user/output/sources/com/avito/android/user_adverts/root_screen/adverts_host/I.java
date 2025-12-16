package com.avito.android.user_adverts.root_screen.adverts_host;

import BI0.d;
import TI0.a;
import TI0.c;
import YI0.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23492c;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import com.avito.android.user_adverts.tab_actions.attention.UserAdvertsActionAttentionData;
import com.avito.android.user_adverts.tab_actions.attention.UserAdvertsActionAttentionFragment;
import com.avito.android.user_adverts.tab_actions.host.UserAdvertsActionsBottomSheetView;
import com.avito.android.user_adverts.tab_actions.host.f;
import com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.a;
import com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfo;
import com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfoFragment;
import com.avito.android.util.D6;
import com.avito.android.util.R0;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$observeActionsMviViewModel$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {945}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class I extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312238q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312239r;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$observeActionsMviViewModel$1$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f312240q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f312241r;

        /* compiled from: UserAdvertsHostFragment.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$observeActionsMviViewModel$1$1$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {964}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.I$a$a, reason: collision with other inner class name */
        public static final class C9526a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f312242q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsHostFragment f312243r;

            /* compiled from: UserAdvertsHostFragment.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;", "actionsState", "LBI0/d;", "searchState", "LTI0/c$b;", "shortcutsState", "Lcom/avito/android/user_adverts/tab_actions/host/f$d;", "<anonymous>", "(Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;LBI0/d;LTI0/c$b;)Lcom/avito/android/user_adverts/tab_actions/host/f$d;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$observeActionsMviViewModel$1$1$1$2", f = "UserAdvertsHostFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.I$a$a$a, reason: collision with other inner class name */
            public static final class C9527a extends SuspendLambda implements Y41.r<UserAdvertsActionsState, BI0.d, c.b, Continuation<? super f.d>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ UserAdvertsActionsState f312244q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ BI0.d f312245r;

                /* renamed from: s, reason: collision with root package name */
                public /* synthetic */ c.b f312246s;

                public C9527a() {
                    throw null;
                }

                @Override // Y41.r
                public final Object invoke(UserAdvertsActionsState userAdvertsActionsState, BI0.d dVar, c.b bVar, Continuation<? super f.d> continuation) {
                    C9527a c9527a = new C9527a(4, continuation);
                    c9527a.f312244q = userAdvertsActionsState;
                    c9527a.f312245r = dVar;
                    c9527a.f312246s = bVar;
                    return c9527a.invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    UserAdvertsActionsState userAdvertsActionsState = this.f312244q;
                    BI0.d dVar = this.f312245r;
                    f.d dVar2 = new f.d(!(((dVar instanceof d.C0052d) && ((d.C0052d) dVar).f1324a) || !(this.f312246s instanceof c.b.a)), userAdvertsActionsState.f314466e);
                    dVar2.setPerfTrackerParams(userAdvertsActionsState.getPerfTrackerParams());
                    return dVar2;
                }
            }

            /* compiled from: UserAdvertsHostFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.I$a$a$b */
            public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<f.d, G0> {
                /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.C] */
                /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.C] */
                @Override // Y41.l
                public final G0 invoke(f.d dVar) {
                    f.d dVar2 = dVar;
                    com.avito.android.user_adverts.tab_actions.host.f fVar = (com.avito.android.user_adverts.tab_actions.host.f) this.receiver;
                    f.a.C9699a c9699a = fVar.f314287e;
                    c9699a.getClass();
                    boolean z12 = dVar2.f314295b;
                    int i12 = z12 ? 0 : 8;
                    UserAdvertsActionsBottomSheetView userAdvertsActionsBottomSheetView = c9699a.f314294a;
                    userAdvertsActionsBottomSheetView.setVisibility(i12);
                    if (z12) {
                        UserAdvertsActionsState.c cVar = dVar2.f314296c;
                        boolean z13 = cVar instanceof UserAdvertsActionsState.c.C9710c;
                        ViewGroup viewGroup = fVar.f314283a;
                        RecyclerView recyclerView = fVar.f314288f;
                        com.avito.konveyor.adapter.h hVar = fVar.f314284b;
                        Context context = fVar.f314286d;
                        Y41.a<G0> aVar = fVar.f314293k;
                        f.a.C9699a c9699a2 = fVar.f314287e;
                        View view = fVar.f314290h;
                        if (z13) {
                            view.setBackgroundColor(((Number) fVar.f314291i.getValue()).intValue());
                            UserAdvertsActionsState.c.C9710c c9710c = (UserAdvertsActionsState.c.C9710c) cVar;
                            fVar.d(c9710c.f314480c);
                            c9699a2.getClass();
                            c9699a2.f314294a.setOnCloseClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(9, aVar));
                            c9699a2.f314294a.setTitle(c9710c.f314478a.k0(context));
                            List<com.avito.android.user_adverts.tab_actions.host.items.a> list = c9710c.f314479b;
                            int size = list.size();
                            if (fVar.a() || (hVar.f338510e.getCount() == size && D6.y(recyclerView))) {
                                fVar.b(list);
                            } else {
                                androidx.transition.Q.b(viewGroup);
                                C23492c c23492c = new C23492c();
                                c23492c.M(userAdvertsActionsBottomSheetView);
                                c23492c.G(new androidx.interpolator.view.animation.b());
                                c23492c.E(300L);
                                androidx.transition.Q.a(viewGroup, c23492c);
                                fVar.b(list);
                            }
                        } else if (cVar instanceof UserAdvertsActionsState.c.a) {
                            fVar.d(false);
                            userAdvertsActionsBottomSheetView.setOnCloseClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(9, null));
                            com.avito.android.lib.util.b.a(userAdvertsActionsBottomSheetView.f314222f);
                        } else if (cVar instanceof UserAdvertsActionsState.c.b) {
                            fVar.d(false);
                            c9699a2.getClass();
                            c9699a2.f314294a.setOnCloseClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(9, aVar));
                            UserAdvertsActionsState.c.b bVar = (UserAdvertsActionsState.c.b) cVar;
                            c9699a2.f314294a.setTitle(bVar.f314476a.k0(context));
                            boolean zA2 = fVar.a();
                            PrintableText printableText = bVar.f314477b;
                            if (zA2 || D6.y(fVar.f314289g)) {
                                fVar.c(printableText);
                            } else {
                                androidx.transition.Q.b(viewGroup);
                                C23492c c23492c2 = new C23492c();
                                c23492c2.M(userAdvertsActionsBottomSheetView);
                                c23492c2.G(new androidx.interpolator.view.animation.b());
                                c23492c2.E(300L);
                                androidx.transition.Q.a(viewGroup, c23492c2);
                                fVar.c(printableText);
                            }
                        } else if (cVar instanceof UserAdvertsActionsState.c.d) {
                            fVar.d(true);
                            view.setBackgroundColor(((Number) fVar.f314292j.getValue()).intValue());
                            c9699a2.getClass();
                            c9699a2.f314294a.setOnCloseClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(9, aVar));
                            UserAdvertsActionsState.c.d dVar3 = (UserAdvertsActionsState.c.d) cVar;
                            c9699a2.f314294a.setTitle(dVar3.f314482b.k0(context));
                            List<UserAdvertSingleActionItem> list2 = dVar3.f314483c;
                            int size2 = list2.size();
                            if (fVar.a() || (hVar.f338510e.getCount() == size2 && D6.y(recyclerView))) {
                                fVar.b(list2);
                            } else {
                                androidx.transition.Q.b(viewGroup);
                                C23492c c23492c3 = new C23492c();
                                c23492c3.M(userAdvertsActionsBottomSheetView);
                                c23492c3.G(new androidx.interpolator.view.animation.b());
                                c23492c3.E(300L);
                                androidx.transition.Q.a(viewGroup, c23492c3);
                                fVar.b(list2);
                            }
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: SafeCollector.common.kt */
            @s0
            @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.I$a$a$c */
            public static final class c implements InterfaceC43160i<c.b> {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n2 f312247b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.I$a$a$c$a, reason: collision with other inner class name */
                public static final class C9528a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC43172j f312248b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$observeActionsMviViewModel$1$1$1$invokeSuspend$$inlined$map$1$2", f = "UserAdvertsHostFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.I$a$a$c$a$a, reason: collision with other inner class name */
                    public static final class C9529a extends ContinuationImpl {

                        /* renamed from: q, reason: collision with root package name */
                        public /* synthetic */ Object f312249q;

                        /* renamed from: r, reason: collision with root package name */
                        public int f312250r;

                        public C9529a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Y61.l
                        public final Object invokeSuspend(@Y61.k Object obj) {
                            this.f312249q = obj;
                            this.f312250r |= BeduinInputModel.MIN_TEXT_VERSION;
                            return C9528a.this.emit(null, this);
                        }
                    }

                    public C9528a(InterfaceC43172j interfaceC43172j) {
                        this.f312248b = interfaceC43172j;
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
                            boolean r0 = r6 instanceof com.avito.android.user_adverts.root_screen.adverts_host.I.a.C9526a.c.C9528a.C9529a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.avito.android.user_adverts.root_screen.adverts_host.I$a$a$c$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.I.a.C9526a.c.C9528a.C9529a) r0
                            int r1 = r0.f312250r
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f312250r = r1
                            goto L18
                        L13:
                            com.avito.android.user_adverts.root_screen.adverts_host.I$a$a$c$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.I$a$a$c$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f312249q
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.f312250r
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.C42729a0.b(r6)
                            goto L43
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.C42729a0.b(r6)
                            TI0.c r5 = (TI0.c) r5
                            TI0.c$b r5 = r5.f15561j
                            r0.f312250r = r3
                            kotlinx.coroutines.flow.j r6 = r4.f312248b
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L43
                            return r1
                        L43:
                            kotlin.G0 r5 = kotlin.G0.f406611a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.I.a.C9526a.c.C9528a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                public c(n2 n2Var) {
                    this.f312247b = n2Var;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43160i
                @Y61.l
                public final Object collect(@Y61.k InterfaceC43172j<? super c.b> interfaceC43172j, @Y61.k Continuation continuation) {
                    Object objCollect = this.f312247b.collect(new C9528a(interfaceC43172j), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9526a(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super C9526a> continuation) {
                super(2, continuation);
                this.f312243r = userAdvertsHostFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C9526a(this.f312243r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((C9526a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f312242q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    UserAdvertsHostFragment userAdvertsHostFragment = this.f312243r;
                    com.avito.android.user_adverts.tab_actions.host.j jVar = userAdvertsHostFragment.f312292B0;
                    if (jVar == null) {
                        jVar = null;
                    }
                    n2<UserAdvertsActionsState> state = jVar.getState();
                    com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = userAdvertsHostFragment.f312298H0;
                    if (f12 == null) {
                        f12 = null;
                    }
                    n2<BI0.d> state2 = f12.getState();
                    com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
                    if (e0Var == null) {
                        e0Var = null;
                    }
                    InterfaceC43160i interfaceC43160iR = C43175k.r(C43175k.k(state, state2, new c(e0Var.getState()), new C9527a(4, null)));
                    R0 r02 = userAdvertsHostFragment.f312300J0;
                    if (r02 == null) {
                        r02 = null;
                    }
                    InterfaceC43160i interfaceC43160iI = C43175k.I(r02.c(), interfaceC43160iR);
                    ScreenPerformanceTracker screenPerformanceTracker = userAdvertsHostFragment.f312291A0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    com.avito.android.user_adverts.tab_actions.host.f fVar = userAdvertsHostFragment.f312319c1;
                    b bVar = new b(1, fVar == null ? null : fVar, com.avito.android.user_adverts.tab_actions.host.f.class, "render", "render(Lcom/avito/android/user_adverts/tab_actions/host/UserAdvertsActionsView$State;)V", 0);
                    this.f312242q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iI, screenPerformanceTracker, bVar, this) == coroutine_suspended) {
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

        /* compiled from: UserAdvertsHostFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$observeActionsMviViewModel$1$1$2", f = "UserAdvertsHostFragment.kt", i = {}, l = {969}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f312252q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsHostFragment f312253r;

            /* compiled from: UserAdvertsHostFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.I$a$b$a, reason: collision with other inner class name */
            public static final class C9530a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserAdvertsHostFragment f312254b;

                public C9530a(UserAdvertsHostFragment userAdvertsHostFragment) {
                    this.f312254b = userAdvertsHostFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    com.avito.android.user_adverts.tab_actions.host.mvi.entity.a aVar = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.a) obj;
                    boolean z12 = aVar instanceof a.C9711a;
                    UserAdvertsHostFragment userAdvertsHostFragment = this.f312254b;
                    if (z12) {
                        PrintableText printableText = ((a.C9711a) aVar).f314484a;
                        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
                        UserAdvertsHostFragment.H5(userAdvertsHostFragment, printableText, null, 6);
                        com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
                        if (e0Var == null) {
                            e0Var = null;
                        }
                        e0Var.accept(new a.h(false, 1, null));
                    } else if (aVar instanceof a.f) {
                        PrintableText printableText2 = ((a.f) aVar).f314498b;
                        UserAdvertsHostFragment.a aVar2 = UserAdvertsHostFragment.f312290o1;
                        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, userAdvertsHostFragment, printableText2, null, null, null, 0, ToastBarPosition.f181047e, 958);
                        com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var2 = userAdvertsHostFragment.f312302L0;
                        if (e0Var2 == null) {
                            e0Var2 = null;
                        }
                        e0Var2.accept(new a.h(false, 1, null));
                    } else if (aVar instanceof a.b) {
                        UserAdvertsActionResultInfoFragment.a aVar3 = UserAdvertsActionResultInfoFragment.f314612n0;
                        UserAdvertsActionResultInfo userAdvertsActionResultInfo = new UserAdvertsActionResultInfo(((a.b) aVar).f314487a);
                        aVar3.getClass();
                        UserAdvertsActionResultInfoFragment.a.a(userAdvertsActionResultInfo).show(userAdvertsHostFragment.getChildFragmentManager(), "tag_user_advert_action_result_info_dialog");
                        com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var3 = userAdvertsHostFragment.f312302L0;
                        if (e0Var3 == null) {
                            e0Var3 = null;
                        }
                        e0Var3.accept(new a.h(false, 1, null));
                    } else if (aVar instanceof a.d) {
                        UserAdvertsActionAttentionFragment.a aVar4 = UserAdvertsActionAttentionFragment.f314199o0;
                        a.d dVar = (a.d) aVar;
                        UserAdvertsActionAttentionData userAdvertsActionAttentionData = new UserAdvertsActionAttentionData(dVar.f314491b, dVar.f314492c, dVar.f314494e, dVar.f314493d, dVar.f314490a);
                        aVar4.getClass();
                        UserAdvertsActionAttentionFragment.a.a(userAdvertsActionAttentionData).show(userAdvertsHostFragment.getChildFragmentManager(), "tag_user_advert_action_attention_dialog");
                    } else if (aVar instanceof a.e) {
                        a.e eVar = (a.e) aVar;
                        UserAdvertsHostFragment.H5(userAdvertsHostFragment, eVar.f314495a, eVar.f314496b, 8);
                    } else if (aVar instanceof a.g) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar5 = userAdvertsHostFragment.f312334w0;
                        if (aVar5 == null) {
                            aVar5 = null;
                        }
                        a.g gVar = (a.g) aVar;
                        b.a.a(aVar5, gVar.f314499a, gVar.f314500b, null, 4);
                    } else if (aVar instanceof a.h) {
                        a.h hVar = (a.h) aVar;
                        com.avito.android.deeplink_handler.handler.composite.a aVar6 = userAdvertsHostFragment.f312334w0;
                        (aVar6 != null ? aVar6 : null).r6(C22777e.b(new kotlin.Q("user_adverts.single_action_request_advert_id", hVar.f314502b)), hVar.f314501a, "user_adverts.single_action_request_key");
                    } else if (aVar instanceof a.i) {
                        a.i iVar = (a.i) aVar;
                        PrintableText printableText3 = iVar.f314505c;
                        if (printableText3 != null) {
                            UserAdvertsHostFragment.a aVar7 = UserAdvertsHostFragment.f312290o1;
                            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, userAdvertsHostFragment, printableText3, null, null, null, 0, ToastBarPosition.f181047e, 958);
                        }
                        DeepLink deepLink = iVar.f314506d;
                        if (deepLink != null) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar8 = userAdvertsHostFragment.f312334w0;
                            if (aVar8 == null) {
                                aVar8 = null;
                            }
                            b.a.a(aVar8, deepLink, null, null, 6);
                        }
                        com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var4 = userAdvertsHostFragment.f312302L0;
                        if (e0Var4 == null) {
                            e0Var4 = null;
                        }
                        e0Var4.accept(new a.h(false, 1, null));
                    } else {
                        boolean z13 = aVar instanceof a.c;
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f312253r = userAdvertsHostFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f312253r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f312252q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    UserAdvertsHostFragment userAdvertsHostFragment = this.f312253r;
                    com.avito.android.user_adverts.tab_actions.host.j jVar = userAdvertsHostFragment.f312292B0;
                    if (jVar == null) {
                        jVar = null;
                    }
                    InterfaceC43160i<com.avito.android.user_adverts.tab_actions.host.mvi.entity.a> events = jVar.getEvents();
                    C9530a c9530a = new C9530a(userAdvertsHostFragment);
                    this.f312252q = 1;
                    if (events.collect(c9530a, this) == coroutine_suspended) {
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

        /* compiled from: UserAdvertsHostFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$observeActionsMviViewModel$1$1$3", f = "UserAdvertsHostFragment.kt", i = {}, l = {1034}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f312255q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsHostFragment f312256r;

            /* compiled from: UserAdvertsHostFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/items/a;", "item", "Lkotlin/G0;", "emit", "(Lcom/avito/android/user_adverts/tab_actions/host/items/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.I$a$c$a, reason: collision with other inner class name */
            public static final class C9531a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserAdvertsHostFragment f312257b;

                public C9531a(UserAdvertsHostFragment userAdvertsHostFragment) {
                    this.f312257b = userAdvertsHostFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    com.avito.android.user_adverts.tab_actions.host.items.a aVar = (com.avito.android.user_adverts.tab_actions.host.items.a) obj;
                    com.avito.android.user_adverts.tab_actions.host.j jVar = this.f312257b.f312292B0;
                    if (jVar == null) {
                        jVar = null;
                    }
                    jVar.accept(new a.c(aVar));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f312256r = userAdvertsHostFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f312256r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f312255q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    UserAdvertsHostFragment userAdvertsHostFragment = this.f312256r;
                    com.avito.android.user_adverts.tab_actions.host.items.d dVar = userAdvertsHostFragment.f312293C0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(dVar.k());
                    C9531a c9531a = new C9531a(userAdvertsHostFragment);
                    this.f312255q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c9531a, this) == coroutine_suspended) {
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
        public a(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f312241r = userAdvertsHostFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f312241r, continuation);
            aVar.f312240q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f312240q;
            UserAdvertsHostFragment userAdvertsHostFragment = this.f312241r;
            C43259k.d(t12, null, null, new C9526a(userAdvertsHostFragment, null), 3);
            C43259k.d(t12, null, null, new b(userAdvertsHostFragment, null), 3);
            C43259k.d(t12, null, null, new c(userAdvertsHostFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super I> continuation) {
        super(2, continuation);
        this.f312239r = userAdvertsHostFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new I(this.f312239r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((I) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f312238q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            UserAdvertsHostFragment userAdvertsHostFragment = this.f312239r;
            a aVar = new a(userAdvertsHostFragment, null);
            this.f312238q = 1;
            if (C23056p0.b(userAdvertsHostFragment, state, aVar, this) == coroutine_suspended) {
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
