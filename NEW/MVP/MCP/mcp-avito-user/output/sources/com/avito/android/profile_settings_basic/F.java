package com.avito.android.profile_settings_basic;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Ob0.C14669b;
import Qb0.InterfaceC14878a;
import Qb0.InterfaceC14880c;
import Qb0.d;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.Arrays;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BasicProfileSettingsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/F;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f228542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w f228543b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f228544c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A f228545d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_text_field.p f228546e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14878a, G0> f228547f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f228548g;

    /* renamed from: h, reason: collision with root package name */
    public final int f228549h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f228550i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f228551j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.l f228552k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public C14669b f228553l;

    /* compiled from: BasicProfileSettingsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.BasicProfileSettingsView$1$1", f = "BasicProfileSettingsView.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228554q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f228555r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ F f228556s;

        /* compiled from: BasicProfileSettingsView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_settings_basic.BasicProfileSettingsView$1$1$1", f = "BasicProfileSettingsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.profile_settings_basic.F$a$a, reason: collision with other inner class name */
        public static final class C6950a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f228557q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ F f228558r;

            /* compiled from: BasicProfileSettingsView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.profile_settings_basic.BasicProfileSettingsView$1$1$1$1", f = "BasicProfileSettingsView.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.profile_settings_basic.F$a$a$a, reason: collision with other inner class name */
            public static final class C6951a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f228559q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ F f228560r;

                /* compiled from: BasicProfileSettingsView.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.profile_settings_basic.F$a$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C6952a implements InterfaceC43172j, kotlin.jvm.internal.D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ F f228561b;

                    public C6952a(F f12) {
                        this.f228561b = f12;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        com.avito.android.lib.design.bottom_sheet.d dVar;
                        com.avito.android.lib.design.bottom_sheet.d dVar2;
                        Qb0.d dVar3 = (Qb0.d) obj;
                        F f12 = this.f228561b;
                        f12.getClass();
                        f12.f228544c.l(dVar3.f13907a, null);
                        com.avito.android.extended_profile_ui_components.l lVar = f12.f228552k;
                        SwipeRefreshLayout swipeRefreshLayout = f12.f228551j;
                        RecyclerView recyclerView = f12.f228550i;
                        Throwable th2 = dVar3.f13909c;
                        if (th2 != null) {
                            D6.w(recyclerView);
                            swipeRefreshLayout.setRefreshing(false);
                            lVar.c(th2, f12.f228548g);
                        } else if (dVar3.f13908b) {
                            D6.w(recyclerView);
                            swipeRefreshLayout.setRefreshing(false);
                            lVar.d();
                        } else if (dVar3.f13907a != null) {
                            D6.H(recyclerView);
                            lVar.a();
                            swipeRefreshLayout.setRefreshing(false);
                            recyclerView.post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(f12, 23));
                        }
                        d.a aVar = dVar3.f13910d;
                        if (aVar == null) {
                            C14669b c14669b = f12.f228553l;
                            if (c14669b != null && (dVar = c14669b.f12408d) != null && dVar.isShowing() && (dVar2 = c14669b.f12408d) != null) {
                                dVar2.dismiss();
                            }
                        } else {
                            if (f12.f228553l == null) {
                                f12.f228553l = new C14669b(f12.f228542a.getContext(), f12.f228549h, f12.f228547f);
                            }
                            C14669b c14669b2 = f12.f228553l;
                            if (c14669b2 != null) {
                                com.avito.android.lib.design.bottom_sheet.d dVar4 = c14669b2.f12408d;
                                if (dVar4 == null || !dVar4.isShowing()) {
                                    com.avito.android.lib.design.bottom_sheet.d dVar5 = c14669b2.f12408d;
                                    if (dVar5 != null) {
                                        dVar5.dismiss();
                                    }
                                    com.avito.android.lib.design.bottom_sheet.d dVar6 = new com.avito.android.lib.design.bottom_sheet.d(c14669b2.f12405a, 0, 2, null);
                                    dVar6.setContentView(R.layout.basic_profile_settings_avatar_actions_bottom_menu);
                                    dVar6.S(C35835l0.g(dVar6.getContext()).y);
                                    com.avito.android.lib.design.bottom_sheet.d.M(dVar6, null, false, true, 7);
                                    c14669b2.f12409e = (TextView) dVar6.findViewById(R.id.basic_info_avatar_actions_menu_title);
                                    c14669b2.f12410f = (TextView) dVar6.findViewById(R.id.basic_info_avatar_actions_menu_subtitle);
                                    c14669b2.f12411g = (LinearLayout) dVar6.findViewById(R.id.basic_info_avatar_actions_actions_container);
                                    dVar6.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(c14669b2, 1));
                                    com.avito.android.lib.util.g.a(dVar6);
                                    c14669b2.f12408d = dVar6;
                                    c14669b2.a(aVar);
                                } else {
                                    c14669b2.a(aVar);
                                }
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                            return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f228561b, F.class, "render", "render(Lcom/avito/android/profile_settings_basic/mvi/entity/BasicProfileSettingsState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6951a(F f12, Continuation<? super C6951a> continuation) {
                    super(2, continuation);
                    this.f228560r = f12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6951a(this.f228560r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6951a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f228559q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        F f12 = this.f228560r;
                        w wVar = f12.f228543b;
                        C6952a c6952a = new C6952a(f12);
                        this.f228559q = 1;
                        if (wVar.le(c6952a, this) == coroutine_suspended) {
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

            /* compiled from: BasicProfileSettingsView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.profile_settings_basic.BasicProfileSettingsView$1$1$1$2", f = "BasicProfileSettingsView.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.profile_settings_basic.F$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f228562q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ F f228563r;

                /* compiled from: BasicProfileSettingsView.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.profile_settings_basic.F$a$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6953a implements InterfaceC43172j, kotlin.jvm.internal.D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ F f228564b;

                    public C6953a(F f12) {
                        this.f228564b = f12;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC14880c interfaceC14880c = (InterfaceC14880c) obj;
                        F f12 = this.f228564b;
                        f12.getClass();
                        boolean z12 = interfaceC14880c instanceof InterfaceC14880c.e;
                        View view = f12.f228542a;
                        SwipeRefreshLayout swipeRefreshLayout = f12.f228551j;
                        if (z12) {
                            swipeRefreshLayout.setRefreshing(false);
                            com.avito.android.component.toast.c.e(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.f(((InterfaceC14880c.e) interfaceC14880c).f13904a), null, null, null, f.a.f125253a, 0, ToastBarPosition.f181046d, false, false, null, null, f12.f228548g, 4014);
                        } else if (interfaceC14880c instanceof InterfaceC14880c.d) {
                            swipeRefreshLayout.setRefreshing(false);
                            InterfaceC14880c.d dVar = (InterfaceC14880c.d) interfaceC14880c;
                            com.avito.android.extended_profile_ui_components.p pVar = com.avito.android.extended_profile_ui_components.p.f153373a;
                            Throwable th2 = dVar.f13902a;
                            InterfaceC14878a interfaceC14878a = dVar.f13903b;
                            com.avito.android.extended_profile_ui_components.p.c(pVar, view, th2, f12.f228548g, interfaceC14878a != null ? new G(f12, interfaceC14878a) : null);
                        } else if (interfaceC14880c instanceof InterfaceC14880c.a) {
                            f12.f228545d.a(((InterfaceC14880c.a) interfaceC14880c).f13896a);
                        } else {
                            boolean z13 = interfaceC14880c instanceof InterfaceC14880c.C0915c;
                            com.avito.android.edit_text_field.p pVar2 = f12.f228546e;
                            if (z13) {
                                InterfaceC14880c.C0915c c0915c = (InterfaceC14880c.C0915c) interfaceC14880c;
                                pVar2.a(c0915c.f13898a, c0915c.f13899b, c0915c.f13900c, c0915c.f13901d);
                            } else if (interfaceC14880c instanceof InterfaceC14880c.b) {
                                pVar2.b();
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                            return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f228564b, F.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/profile_settings_basic/mvi/entity/BasicProfileSettingsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(F f12, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f228563r = f12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f228563r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f228562q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        F f12 = this.f228563r;
                        w wVar = f12.f228543b;
                        C6953a c6953a = new C6953a(f12);
                        this.f228562q = 1;
                        if (wVar.ke(c6953a, this) == coroutine_suspended) {
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
            public C6950a(F f12, Continuation<? super C6950a> continuation) {
                super(2, continuation);
                this.f228558r = f12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C6950a c6950a = new C6950a(this.f228558r, continuation);
                c6950a.f228557q = obj;
                return c6950a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C6950a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f228557q;
                F f12 = this.f228558r;
                C43259k.d(t12, null, null, new C6951a(f12, null), 3);
                C43259k.d(t12, null, null, new b(f12, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22983P interfaceC22983P, F f12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f228555r = interfaceC22983P;
            this.f228556s = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f228555r, this.f228556s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f228554q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                C6950a c6950a = new C6950a(this.f228556s, null);
                this.f228554q = 1;
                if (C23056p0.b(this.f228555r, state, c6950a, this) == coroutine_suspended) {
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

    /* compiled from: BasicProfileSettingsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            F.this.f228547f.invoke(InterfaceC14878a.d.f13866b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public F(@Y61.k View view, @Y61.k w wVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k A a12, @Y61.k com.avito.android.edit_text_field.p pVar, boolean z12, @Y61.k Y41.l<? super InterfaceC14878a, G0> lVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f228542a = view;
        this.f228543b = wVar;
        this.f228544c = dVar;
        this.f228545d = a12;
        this.f228546e = pVar;
        this.f228547f = lVar;
        this.f228548g = screenPerformanceTracker;
        this.f228549h = com.avito.android.actions_sheet.a.d(view, R.dimen.extended_profile_settings_horizontal_margin);
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f228550i = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById2;
        this.f228551j = swipeRefreshLayout;
        com.avito.android.extended_profile_ui_components.l lVar2 = new com.avito.android.extended_profile_ui_components.l(new b(), view);
        D6.c(lVar2.f153356d, null, null, null, Integer.valueOf(y6.b(46)), 7);
        this.f228552k = lVar2;
        recyclerView.setItemAnimator(null);
        recyclerView.l(new PV.a(0, y6.b(40), 0, 0, 12, null), -1);
        recyclerView.setAdapter(dVar);
        recyclerView.getRootView().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        if (z12) {
            recyclerView.setPadding(0, y6.b(5), 0, 0);
        }
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 8));
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new a(interfaceC22983P, this, null), 3);
    }
}
