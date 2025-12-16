package com.avito.android.sx_address.selectaddresslist.view;

import UA0.a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.services_transportation_widget.dialog.h;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import com.avito.android.sx_address.selectaddresslist.e;
import com.avito.konveyor.adapter.j;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SelectAddressListView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/view/d;", "Lcom/avito/android/sx_address/selectaddresslist/view/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.sx_address.selectaddresslist.view.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC22983P f294161a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.sx_address.selectaddresslist.b f294162b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f294163c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f294164d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final d2<AddressListViewItem> f294165e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f294166f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Toolbar f294167g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SpinnerOverlay f294168h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f294169i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinearLayout f294170j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f294171k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final View f294172l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f294173m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Button f294174n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Input f294175o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Button f294176p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final e2 f294177q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final e2 f294178r;

    /* compiled from: SelectAddressListView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.view.SelectAddressListViewImpl$bindTo$4$1", f = "SelectAddressListView.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f294179q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f294180r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d f294181s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ e f294182t;

        /* compiled from: SelectAddressListView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.view.SelectAddressListViewImpl$bindTo$4$1$1", f = "SelectAddressListView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.sx_address.selectaddresslist.view.d$a$a, reason: collision with other inner class name */
        public static final class C8940a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f294183q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f294184r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ e f294185s;

            /* compiled from: SelectAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.view.SelectAddressListViewImpl$bindTo$4$1$1$1", f = "SelectAddressListView.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.selectaddresslist.view.d$a$a$a, reason: collision with other inner class name */
            public static final class C8941a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f294186q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ d f294187r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ e f294188s;

                /* compiled from: SelectAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/domain/AddressListViewItem;", "item", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sx_address/selectaddresslist/domain/AddressListViewItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.selectaddresslist.view.d$a$a$a$a, reason: collision with other inner class name */
                public static final class C8942a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f294189b;

                    public C8942a(e eVar) {
                        this.f294189b = eVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f294189b.accept(new a.f((AddressListViewItem) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8941a(d dVar, e eVar, Continuation<? super C8941a> continuation) {
                    super(2, continuation);
                    this.f294187r = dVar;
                    this.f294188s = eVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C8941a(this.f294187r, this.f294188s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8941a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f294186q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        d2<AddressListViewItem> d2Var = this.f294187r.f294165e;
                        C8942a c8942a = new C8942a(this.f294188s);
                        this.f294186q = 1;
                        if (d2Var.collect(c8942a, this) == coroutine_suspended) {
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

            /* compiled from: SelectAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.view.SelectAddressListViewImpl$bindTo$4$1$1$2", f = "SelectAddressListView.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.selectaddresslist.view.d$a$a$b */
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f294190q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ d f294191r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ e f294192s;

                /* compiled from: SelectAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.selectaddresslist.view.d$a$a$b$a, reason: collision with other inner class name */
                public static final class C8943a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f294193b;

                    public C8943a(e eVar) {
                        this.f294193b = eVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f294193b.accept(new a.e((String) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(d dVar, e eVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f294191r = dVar;
                    this.f294192s = eVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f294191r, this.f294192s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f294190q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f294191r.f294177q;
                        C8943a c8943a = new C8943a(this.f294192s);
                        this.f294190q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8943a, this) == coroutine_suspended) {
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

            /* compiled from: SelectAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.view.SelectAddressListViewImpl$bindTo$4$1$1$3", f = "SelectAddressListView.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.selectaddresslist.view.d$a$a$c */
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f294194q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ d f294195r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ e f294196s;

                /* compiled from: SelectAddressListView.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.selectaddresslist.view.d$a$a$c$a, reason: collision with other inner class name */
                public static final class C8944a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f294197b;

                    public C8944a(e eVar) {
                        this.f294197b = eVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f294197b.accept(a.d.f16246a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(d dVar, e eVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f294195r = dVar;
                    this.f294196s = eVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new c(this.f294195r, this.f294196s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f294194q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f294195r.f294178r;
                        C8944a c8944a = new C8944a(this.f294196s);
                        this.f294194q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8944a, this) == coroutine_suspended) {
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
            public C8940a(d dVar, e eVar, Continuation<? super C8940a> continuation) {
                super(2, continuation);
                this.f294184r = dVar;
                this.f294185s = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C8940a c8940a = new C8940a(this.f294184r, this.f294185s, continuation);
                c8940a.f294183q = obj;
                return c8940a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8940a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f294183q;
                d dVar = this.f294184r;
                e eVar = this.f294185s;
                C43259k.d(t12, null, null, new C8941a(dVar, eVar, null), 3);
                C43259k.d(t12, null, null, new b(dVar, eVar, null), 3);
                C43259k.d(t12, null, null, new c(dVar, eVar, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22983P interfaceC22983P, d dVar, e eVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f294180r = interfaceC22983P;
            this.f294181s = dVar;
            this.f294182t = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f294180r, this.f294181s, this.f294182t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f294179q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                C8940a c8940a = new C8940a(this.f294181s, this.f294182t, null);
                this.f294179q = 1;
                if (C23056p0.b(this.f294180r, state, c8940a, this) == coroutine_suspended) {
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

    public d(@k View view, @k InterfaceC22983P interfaceC22983P, @k com.avito.android.sx_address.selectaddresslist.b bVar, @k com.avito.konveyor.adapter.a aVar, @k j jVar, @k d2<AddressListViewItem> d2Var, @k com.avito.android.util.text.a aVar2) {
        this.f294161a = interfaceC22983P;
        this.f294162b = bVar;
        this.f294163c = aVar;
        this.f294164d = jVar;
        this.f294165e = d2Var;
        this.f294166f = aVar2;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f294167g = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.spinner_overlay);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.overlay.SpinnerOverlay");
        }
        this.f294168h = (SpinnerOverlay) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error_hint);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        View viewFindViewById4 = view.findViewById(R.id.no_address_selected_error);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f294169i = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.retry_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById5).setOnClickListener(new h(this, 19));
        View viewFindViewById6 = view.findViewById(R.id.error_layout);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f294170j = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.toolbar_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f294171k = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.content_layout);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f294172l = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.description);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f294173m = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.add_button);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f294174n = (Button) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.input_search);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById11;
        n.c(input, new c(this));
        this.f294175o = input;
        View viewFindViewById12 = view.findViewById(R.id.select_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f294176p = (Button) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.list);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        ((RecyclerView) viewFindViewById13).setAdapter(jVar);
        BufferOverflow bufferOverflow = BufferOverflow.f410779d;
        this.f294177q = f2.b(0, 1, bufferOverflow, 1);
        this.f294178r = f2.b(0, 1, bufferOverflow, 1);
    }

    public final void a(@k final e eVar) {
        final int i12 = 0;
        this.f294167g.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.selectaddresslist.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        eVar.accept(a.b.f16244a);
                        break;
                    case 1:
                        eVar.accept(a.c.f16245a);
                        break;
                    default:
                        eVar.accept(a.C1104a.f16243a);
                        break;
                }
            }
        });
        final int i13 = 1;
        this.f294176p.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.selectaddresslist.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        eVar.accept(a.b.f16244a);
                        break;
                    case 1:
                        eVar.accept(a.c.f16245a);
                        break;
                    default:
                        eVar.accept(a.C1104a.f16243a);
                        break;
                }
            }
        });
        final int i14 = 2;
        this.f294174n.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.selectaddresslist.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        eVar.accept(a.b.f16244a);
                        break;
                    case 1:
                        eVar.accept(a.c.f16245a);
                        break;
                    default:
                        eVar.accept(a.C1104a.f16243a);
                        break;
                }
            }
        });
        InterfaceC22983P interfaceC22983P = this.f294161a;
        C43259k.d(C22984Q.a(interfaceC22983P), null, null, new a(interfaceC22983P, this, eVar, null), 3);
    }
}
