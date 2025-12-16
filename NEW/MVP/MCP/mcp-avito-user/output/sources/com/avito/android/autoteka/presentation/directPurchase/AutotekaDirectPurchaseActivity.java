package com.avito.android.autoteka.presentation.directPurchase;

import Cd.C13243a;
import Kf.InterfaceC14310a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.autoteka.deeplinks.DirectPurchaseDetails;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P5;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: AutotekaDirectPurchaseActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/directPurchase/AutotekaDirectPurchaseActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaDirectPurchaseActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f97272r = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.autoteka.presentation.directPurchase.d f97273m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f97275o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97276p;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f97274n = new O0(m0.f406844a.b(com.avito.android.autoteka.presentation.directPurchase.c.class), new h(), new g(new j()), new i());

    /* renamed from: q, reason: collision with root package name */
    @k
    public final InterfaceC42726C f97277q = C42727D.c(new e());

    /* compiled from: AutotekaDirectPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/directPurchase/AutotekaDirectPurchaseActivity$a;", "", "<init>", "()V", "", "KEY_DIRECT_PURCHASE_DETAILS", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaDirectPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKf/c;", "it", "Lkotlin/G0;", "invoke", "(LKf/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Kf.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f97278l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Kf.c cVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaDirectPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKf/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LKf/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Kf.d, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Kf.d dVar) {
            Kf.d dVar2 = dVar;
            AutotekaDirectPurchaseActivity autotekaDirectPurchaseActivity = AutotekaDirectPurchaseActivity.this;
            com.avito.konveyor.adapter.a aVar = autotekaDirectPurchaseActivity.f97276p;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(Collections.singletonList(dVar2.f9593a)));
            com.avito.konveyor.adapter.j jVar = autotekaDirectPurchaseActivity.f97275o;
            (jVar != null ? jVar : null).notifyDataSetChanged();
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaDirectPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.directPurchase.AutotekaDirectPurchaseActivity$onCreate$3", f = "AutotekaDirectPurchaseActivity.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97280q;

        /* compiled from: AutotekaDirectPurchaseActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.presentation.directPurchase.AutotekaDirectPurchaseActivity$onCreate$3$1", f = "AutotekaDirectPurchaseActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f97282q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AutotekaDirectPurchaseActivity f97283r;

            /* compiled from: AutotekaDirectPurchaseActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.autoteka.presentation.directPurchase.AutotekaDirectPurchaseActivity$onCreate$3$1$1", f = "AutotekaDirectPurchaseActivity.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.autoteka.presentation.directPurchase.AutotekaDirectPurchaseActivity$d$a$a, reason: collision with other inner class name */
            public static final class C2908a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f97284q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutotekaDirectPurchaseActivity f97285r;

                /* compiled from: AutotekaDirectPurchaseActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKf/d;", "it", "Lkotlin/G0;", "emit", "(LKf/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.autoteka.presentation.directPurchase.AutotekaDirectPurchaseActivity$d$a$a$a, reason: collision with other inner class name */
                public static final class C2909a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AutotekaDirectPurchaseActivity f97286b;

                    public C2909a(AutotekaDirectPurchaseActivity autotekaDirectPurchaseActivity) {
                        this.f97286b = autotekaDirectPurchaseActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Kf.d dVar = (Kf.d) obj;
                        AutotekaDirectPurchaseActivity autotekaDirectPurchaseActivity = this.f97286b;
                        com.avito.konveyor.adapter.a aVar = autotekaDirectPurchaseActivity.f97276p;
                        if (aVar == null) {
                            aVar = null;
                        }
                        aVar.c(new UV0.c(Collections.singletonList(dVar.f9593a)));
                        com.avito.konveyor.adapter.j jVar = autotekaDirectPurchaseActivity.f97275o;
                        (jVar != null ? jVar : null).notifyDataSetChanged();
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2908a(AutotekaDirectPurchaseActivity autotekaDirectPurchaseActivity, Continuation<? super C2908a> continuation) {
                    super(2, continuation);
                    this.f97285r = autotekaDirectPurchaseActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C2908a(this.f97285r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2908a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f97284q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        int i13 = AutotekaDirectPurchaseActivity.f97272r;
                        AutotekaDirectPurchaseActivity autotekaDirectPurchaseActivity = this.f97285r;
                        n2<Kf.d> state = ((com.avito.android.autoteka.presentation.directPurchase.c) autotekaDirectPurchaseActivity.f97274n.getValue()).getState();
                        C2909a c2909a = new C2909a(autotekaDirectPurchaseActivity);
                        this.f97284q = 1;
                        if (state.collect(c2909a, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AutotekaDirectPurchaseActivity autotekaDirectPurchaseActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f97283r = autotekaDirectPurchaseActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f97283r, continuation);
                aVar.f97282q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C43259k.d((T) this.f97282q, null, null, new C2908a(this.f97283r, null), 3);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return AutotekaDirectPurchaseActivity.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97280q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                AutotekaDirectPurchaseActivity autotekaDirectPurchaseActivity = AutotekaDirectPurchaseActivity.this;
                a aVar = new a(autotekaDirectPurchaseActivity, null);
                this.f97280q = 1;
                if (C23056p0.b(autotekaDirectPurchaseActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: AutotekaDirectPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<RecyclerView> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final RecyclerView invoke() {
            return (RecyclerView) AutotekaDirectPurchaseActivity.this.findViewById(R.id.autoteka_recycler);
        }
    }

    /* compiled from: AutotekaDirectPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKf/a;", "it", "Lkotlin/G0;", "invoke", "(LKf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<InterfaceC14310a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14310a interfaceC14310a) {
            int i12 = AutotekaDirectPurchaseActivity.f97272r;
            ((com.avito.android.autoteka.presentation.directPurchase.c) AutotekaDirectPurchaseActivity.this.f97274n.getValue()).accept(interfaceC14310a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f97289l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f97289l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AutotekaDirectPurchaseActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AutotekaDirectPurchaseActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaDirectPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/directPurchase/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/autoteka/presentation/directPurchase/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.autoteka.presentation.directPurchase.c> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.autoteka.presentation.directPurchase.c invoke() {
            com.avito.android.autoteka.presentation.directPurchase.d dVar = AutotekaDirectPurchaseActivity.this.f97273m;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.autoteka.presentation.directPurchase.c) dVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.autoteka_direct_purchase_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("DirectPurchaseDetails", DirectPurchaseDetails.class) : intent.getParcelableExtra("DirectPurchaseDetails");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("directPurchaseDetails cannot be null");
        }
        com.avito.android.autoteka.di.directPurchase.f.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.a(this), (DirectPurchaseDetails) parcelableExtra, new f()).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            P5.d(toolbar);
            toolbar.setNavigationOnClickListener(new B(this, 26));
        }
        com.avito.konveyor.adapter.j jVar = this.f97275o;
        if (jVar == null) {
            jVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) this.f97277q.getValue();
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        com.avito.android.arch.mvi.android.f.b(this, (com.avito.android.autoteka.presentation.directPurchase.c) this.f97274n.getValue(), b.f97278l, new c());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
    }
}
