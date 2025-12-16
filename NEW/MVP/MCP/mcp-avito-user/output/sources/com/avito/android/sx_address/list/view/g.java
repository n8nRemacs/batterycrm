package com.avito.android.sx_address.list.view;

import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.ActionModalDialogContent;
import com.avito.android.R;
import com.avito.android.SxAddressListRefreshLink;
import com.avito.android.SxAddressVideoVerificationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.sx_address.SxAddressCancel;
import com.avito.android.sx_address.SxAddressDeleteResult;
import com.avito.android.sx_address.SxAddressEditResult;
import com.avito.android.sx_address.SxAddressLinkResult;
import com.avito.android.sx_address.SxAddressRevalidateResult;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.domain.Filter;
import com.avito.android.sx_address.list.domain.InfoBannerButtonData;
import com.avito.android.sx_address.list.domain.InfoBannerData;
import com.avito.android.sx_address.list.mvi.entity.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import fv.C40482a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;

/* compiled from: SxAddressListView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/view/g;", "Lcom/avito/android/sx_address/list/view/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.sx_address.list.view.b {

    /* renamed from: A, reason: collision with root package name */
    @l
    public final TextView f293421A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final Button f293422B;

    /* renamed from: C, reason: collision with root package name */
    @k
    public final e2 f293423C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final e2 f293424D;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final e2 f293425E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final e2 f293426F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final e2 f293427G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final e2 f293428H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final e2 f293429I;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final com.avito.android.sx_address.list.view.a f293430J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final e2 f293431K;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f293432a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f293433b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f293434c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f293435d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f293436e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d2<AddressItem> f293437f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC22983P f293438g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f293439h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.sx_address.list.e f293440i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SharedPreferences f293441j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.a f293442k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f293443l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.sx_address.list.analytics.i f293444m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Toolbar f293445n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final TextView f293446o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final TextView f293447p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final RecyclerView f293448q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final SpinnerOverlay f293449r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final Banner f293450s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final Input f293451t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final Button f293452u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final Button f293453v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final FrameLayout f293454w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public LinearLayout f293455x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final ImageView f293456y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final TextView f293457z;

    /* compiled from: SxAddressListView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1", f = "SxAddressListView.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f293458q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f293459r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f293460s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.list.h f293461t;

        /* compiled from: SxAddressListView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1", f = "SxAddressListView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.sx_address.list.view.g$a$a, reason: collision with other inner class name */
        public static final class C8906a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f293462q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ g f293463r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.sx_address.list.h f293464s;

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$1", f = "SxAddressListView.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$a, reason: collision with other inner class name */
            public static final class C8907a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293465q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293466r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293467s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/domain/AddressItem;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sx_address/list/domain/AddressItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$a$a, reason: collision with other inner class name */
                public static final class C8908a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293468b;

                    public C8908a(com.avito.android.sx_address.list.h hVar) {
                        this.f293468b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293468b.accept(new a.d((AddressItem) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8907a(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super C8907a> continuation) {
                    super(2, continuation);
                    this.f293466r = gVar;
                    this.f293467s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8907a(this.f293466r, this.f293467s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8907a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293465q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        d2<AddressItem> d2Var = this.f293466r.f293437f;
                        C8908a c8908a = new C8908a(this.f293467s);
                        this.f293465q = 1;
                        if (d2Var.collect(c8908a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$10", f = "SxAddressListView.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$b */
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293469q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293470r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293471s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$b$a, reason: collision with other inner class name */
                public static final class C8909a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293472b;

                    public C8909a(com.avito.android.sx_address.list.h hVar) {
                        this.f293472b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293472b.accept(new a.g((String) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f293470r = gVar;
                    this.f293471s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f293470r, this.f293471s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293469q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293470r.f293431K;
                        C8909a c8909a = new C8909a(this.f293471s);
                        this.f293469q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8909a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$11", f = "SxAddressListView.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$c */
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293473q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293474r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293475s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/deep_linking/links/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$c$a, reason: collision with other inner class name */
                public static final class C8910a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293476b;

                    public C8910a(com.avito.android.sx_address.list.h hVar) {
                        this.f293476b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293476b.accept(new a.k((DeepLink) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f293474r = gVar;
                    this.f293475s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f293474r, this.f293475s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293473q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293474r.f293425E;
                        C8910a c8910a = new C8910a(this.f293475s);
                        this.f293473q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8910a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$2", f = "SxAddressListView.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$d */
            public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293477q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293478r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293479s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$d$a, reason: collision with other inner class name */
                public static final class C8911a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f293480b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293481c;

                    public C8911a(g gVar, com.avito.android.sx_address.list.h hVar) {
                        this.f293480b = gVar;
                        this.f293481c = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C43501a c43501a = (C43501a) obj;
                        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
                        SxAddressLinkResult sxAddressLinkResult = interfaceC14249c instanceof SxAddressLinkResult ? (SxAddressLinkResult) interfaceC14249c : null;
                        com.avito.android.sx_address.list.h hVar = this.f293481c;
                        if (sxAddressLinkResult != null) {
                            if (sxAddressLinkResult instanceof SxAddressAddResult) {
                                hVar.accept(new a.l((SxAddressAddResult) sxAddressLinkResult));
                            } else if (sxAddressLinkResult instanceof SxAddressDeleteResult) {
                                hVar.accept(new a.n((SxAddressDeleteResult) sxAddressLinkResult));
                            } else if (sxAddressLinkResult instanceof SxAddressEditResult) {
                                hVar.accept(new a.o((SxAddressEditResult) sxAddressLinkResult));
                            } else if (sxAddressLinkResult instanceof SxAddressRevalidateResult) {
                                hVar.accept(new a.p((SxAddressRevalidateResult) sxAddressLinkResult));
                            } else if (sxAddressLinkResult instanceof SxAddressCancel) {
                                hVar.accept(a.m.f293269a);
                            }
                        }
                        InterfaceC14249c interfaceC14249c2 = c43501a.f413261b;
                        if (interfaceC14249c2 instanceof SxAddressListRefreshLink.b.a) {
                            this.f293480b.f293432a.requestFocus();
                            hVar.accept(new a.t(((SxAddressListRefreshLink.b.a) interfaceC14249c2).f67562b));
                        } else if (interfaceC14249c2 instanceof SxAddressVideoVerificationLink.c) {
                            hVar.accept(a.q.f293273a);
                        } else if (interfaceC14249c2 instanceof WebViewLink.a) {
                            hVar.accept(a.r.f293274a);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f293478r = gVar;
                    this.f293479s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new d(this.f293478r, this.f293479s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293477q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        g gVar = this.f293478r;
                        InterfaceC43160i<C43501a> interfaceC43160iB = C40482a.b(gVar.f293439h);
                        C8911a c8911a = new C8911a(gVar, this.f293479s);
                        this.f293477q = 1;
                        if (((AbstractC43168f) interfaceC43160iB).collect(c8911a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$3", f = "SxAddressListView.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$e */
            public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293482q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293483r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293484s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$e$a, reason: collision with other inner class name */
                public static final class C8912a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293485b;

                    public C8912a(com.avito.android.sx_address.list.h hVar) {
                        this.f293485b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293485b.accept(a.c.f293259a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f293483r = gVar;
                    this.f293484s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new e(this.f293483r, this.f293484s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293482q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293483r.f293424D;
                        C8912a c8912a = new C8912a(this.f293484s);
                        this.f293482q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8912a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$4", f = "SxAddressListView.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$f */
            public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293486q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293487r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293488s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$f$a, reason: collision with other inner class name */
                public static final class C8913a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293489b;

                    public C8913a(com.avito.android.sx_address.list.h hVar) {
                        this.f293489b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293489b.accept(a.j.f293266a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super f> continuation) {
                    super(2, continuation);
                    this.f293487r = gVar;
                    this.f293488s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new f(this.f293487r, this.f293488s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293486q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293487r.f293423C;
                        C8913a c8913a = new C8913a(this.f293488s);
                        this.f293486q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8913a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$5", f = "SxAddressListView.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$g, reason: collision with other inner class name */
            public static final class C8914g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293490q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293491r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293492s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/deep_linking/links/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$g$a, reason: collision with other inner class name */
                public static final class C8915a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293493b;

                    public C8915a(com.avito.android.sx_address.list.h hVar) {
                        this.f293493b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293493b.accept(new a.f((DeepLink) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8914g(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super C8914g> continuation) {
                    super(2, continuation);
                    this.f293491r = gVar;
                    this.f293492s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8914g(this.f293491r, this.f293492s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8914g) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293490q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293491r.f293426F;
                        C8915a c8915a = new C8915a(this.f293492s);
                        this.f293490q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8915a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$6", f = "SxAddressListView.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$h */
            public static final class h extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293494q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293495r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293496s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$h$a, reason: collision with other inner class name */
                public static final class C8916a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293497b;

                    public C8916a(com.avito.android.sx_address.list.h hVar) {
                        this.f293497b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293497b.accept(new a.s((String) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super h> continuation) {
                    super(2, continuation);
                    this.f293495r = gVar;
                    this.f293496s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new h(this.f293495r, this.f293496s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293494q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293495r.f293427G;
                        C8916a c8916a = new C8916a(this.f293496s);
                        this.f293494q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8916a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$7", f = "SxAddressListView.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$i */
            public static final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293498q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293499r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293500s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$i$a, reason: collision with other inner class name */
                public static final class C8917a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293501b;

                    public C8917a(com.avito.android.sx_address.list.h hVar) {
                        this.f293501b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293501b.accept(a.i.f293265a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super i> continuation) {
                    super(2, continuation);
                    this.f293499r = gVar;
                    this.f293500s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new i(this.f293499r, this.f293500s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293498q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293499r.f293428H;
                        C8917a c8917a = new C8917a(this.f293500s);
                        this.f293498q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8917a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$8", f = "SxAddressListView.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$j */
            public static final class j extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293502q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293503r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293504s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$j$a, reason: collision with other inner class name */
                public static final class C8918a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293505b;

                    public C8918a(com.avito.android.sx_address.list.h hVar) {
                        this.f293505b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293505b.accept(a.b.f293258a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public j(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super j> continuation) {
                    super(2, continuation);
                    this.f293503r = gVar;
                    this.f293504s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new j(this.f293503r, this.f293504s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293502q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293503r.f293429I;
                        C8918a c8918a = new C8918a(this.f293504s);
                        this.f293502q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8918a, this) == coroutine_suspended) {
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

            /* compiled from: SxAddressListView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.sx_address.list.view.SxAddressListViewImpl$bindTo$3$1$1$9", f = "SxAddressListView.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.list.view.g$a$a$k */
            public static final class k extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f293506q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f293507r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ com.avito.android.sx_address.list.h f293508s;

                /* compiled from: SxAddressListView.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/domain/Filter;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/sx_address/list/domain/Filter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.sx_address.list.view.g$a$a$k$a, reason: collision with other inner class name */
                public static final class C8919a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.sx_address.list.h f293509b;

                    public C8919a(com.avito.android.sx_address.list.h hVar) {
                        this.f293509b = hVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f293509b.accept(new a.C8903a((Filter) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public k(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super k> continuation) {
                    super(2, continuation);
                    this.f293507r = gVar;
                    this.f293508s = hVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new k(this.f293507r, this.f293508s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f293506q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        e2 e2Var = this.f293507r.f293430J.f293412K;
                        C8919a c8919a = new C8919a(this.f293508s);
                        this.f293506q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8919a, this) == coroutine_suspended) {
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
            public C8906a(g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super C8906a> continuation) {
                super(2, continuation);
                this.f293463r = gVar;
                this.f293464s = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                C8906a c8906a = new C8906a(this.f293463r, this.f293464s, continuation);
                c8906a.f293462q = obj;
                return c8906a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8906a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f293462q;
                g gVar = this.f293463r;
                com.avito.android.sx_address.list.h hVar = this.f293464s;
                C43259k.d(t12, null, null, new C8907a(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new d(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new e(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new f(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new C8914g(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new h(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new i(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new j(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new k(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new b(gVar, hVar, null), 3);
                C43259k.d(t12, null, null, new c(gVar, hVar, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22983P interfaceC22983P, g gVar, com.avito.android.sx_address.list.h hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f293459r = interfaceC22983P;
            this.f293460s = gVar;
            this.f293461t = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f293459r, this.f293460s, this.f293461t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f293458q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                C8906a c8906a = new C8906a(this.f293460s, this.f293461t, null);
                this.f293458q = 1;
                if (C23056p0.b(this.f293459r, state, c8906a, this) == coroutine_suspended) {
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

    /* compiled from: SxAddressListView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            e2 e2Var = g.this.f293423C;
            G0 g02 = G0.f406611a;
            e2Var.K5(g02);
            return g02;
        }
    }

    /* compiled from: SxAddressListView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            e2 e2Var = g.this.f293423C;
            G0 g02 = G0.f406611a;
            e2Var.K5(g02);
            return g02;
        }
    }

    /* compiled from: SxAddressListView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ActionModalDialogContent f293512l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f293513m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ DeepLink f293514n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ActionModalDialogContent actionModalDialogContent, g gVar, DeepLink deepLink) {
            super(2);
            this.f293512l = actionModalDialogContent;
            this.f293513m = gVar;
            this.f293514n = deepLink;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            ActionModalDialogContent actionModalDialogContent = this.f293512l;
            bVar2.setTitle(actionModalDialogContent.getTitle());
            bVar2.setButtonsOrientation(1);
            g gVar = this.f293513m;
            bVar2.setSubtitle(gVar.f293443l.c(gVar.f293432a.getContext(), actionModalDialogContent.getDescription()));
            bVar2.L3(actionModalDialogContent.getConfirmButtonTitle(), new h(gVar, this.f293514n, dialogInterface2));
            bVar2.M3(actionModalDialogContent.getCancelButtonTitle(), new i(dialogInterface2));
            return G0.f406611a;
        }
    }

    public g(@k View view, @k com.avito.konveyor.adapter.j jVar, @k com.avito.konveyor.adapter.a aVar, @k com.avito.konveyor.adapter.j jVar2, @k com.avito.android.sx_address.list.view.recycler.promo_banner.a aVar2, @k com.avito.konveyor.adapter.a aVar3, @k d2<AddressItem> d2Var, @k InterfaceC22983P interfaceC22983P, @k com.avito.android.deeplink_handler.handler.composite.a aVar4, @k com.avito.android.sx_address.list.e eVar, @k SharedPreferences sharedPreferences, @k com.avito.android.analytics.provider.a aVar5, @k com.avito.android.util.text.a aVar6, @k com.avito.android.sx_address.list.analytics.i iVar) {
        TextView textView;
        TextView textView2;
        Button button;
        this.f293432a = view;
        this.f293433b = jVar;
        this.f293434c = aVar;
        this.f293435d = jVar2;
        this.f293436e = aVar3;
        this.f293437f = d2Var;
        this.f293438g = interfaceC22983P;
        this.f293439h = aVar4;
        this.f293440i = eVar;
        this.f293441j = sharedPreferences;
        this.f293442k = aVar5;
        this.f293443l = aVar6;
        this.f293444m = iVar;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f293445n = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.header_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = linearLayout.findViewById(R.id.list_address_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293446o = (TextView) viewFindViewById3;
        View viewFindViewById4 = linearLayout.findViewById(R.id.list_address_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293447p = (TextView) viewFindViewById4;
        RecyclerView.t tVar = new RecyclerView.t();
        View viewFindViewById5 = view.findViewById(R.id.recycle_list);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        recyclerView.setAdapter(jVar);
        recyclerView.setRecycledViewPool(tVar);
        View viewFindViewById6 = view.findViewById(R.id.banners_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById6;
        recyclerView2.l(aVar2, -1);
        new A().b(recyclerView2);
        recyclerView2.setAdapter(jVar2);
        this.f293448q = recyclerView2;
        View viewFindViewById7 = view.findViewById(R.id.spinner_overlay);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.overlay.SpinnerOverlay");
        }
        this.f293449r = (SpinnerOverlay) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.inform_banner);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f293450s = (Banner) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.input_search);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById9;
        n.c(input, new f(this));
        this.f293451t = input;
        View viewFindViewById10 = view.findViewById(R.id.filter_button);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById10;
        button2.setImageDrawable(C35835l0.h(R.attr.ic_filter24, button2.getRootView().getContext()));
        final int i12 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.sx_address.list.view.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f293417c;

            {
                this.f293417c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f293417c.f293429I.K5(G0.f406611a);
                        break;
                    default:
                        this.f293417c.f293428H.K5(G0.f406611a);
                        break;
                }
            }
        });
        this.f293452u = button2;
        View viewFindViewById11 = view.findViewById(R.id.add_button);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button3 = (Button) viewFindViewById11;
        this.f293453v = button3;
        View viewFindViewById12 = view.findViewById(R.id.error_frame);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById12;
        this.f293454w = frameLayout;
        View viewFindViewById13 = frameLayout.findViewById(R.id.error_layout);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById13;
        this.f293455x = linearLayout2;
        View viewFindViewById14 = linearLayout2.findViewById(R.id.error_icon);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f293456y = (ImageView) viewFindViewById14;
        LinearLayout linearLayout3 = this.f293455x;
        if (linearLayout3 != null) {
            View viewFindViewById15 = linearLayout3.findViewById(R.id.error_title);
            if (viewFindViewById15 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            textView = (TextView) viewFindViewById15;
        } else {
            textView = null;
        }
        this.f293457z = textView;
        LinearLayout linearLayout4 = this.f293455x;
        if (linearLayout4 != null) {
            View viewFindViewById16 = linearLayout4.findViewById(R.id.error_subtitle);
            if (viewFindViewById16 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            textView2 = (TextView) viewFindViewById16;
        } else {
            textView2 = null;
        }
        this.f293421A = textView2;
        LinearLayout linearLayout5 = this.f293455x;
        if (linearLayout5 != null) {
            View viewFindViewById17 = linearLayout5.findViewById(R.id.retry_button);
            if (viewFindViewById17 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            button = (Button) viewFindViewById17;
        } else {
            button = null;
        }
        this.f293422B = button;
        final int i13 = 0;
        this.f293423C = f2.b(0, 1, null, 5);
        this.f293424D = f2.b(0, 1, null, 5);
        this.f293425E = f2.b(0, 1, null, 5);
        this.f293426F = f2.b(0, 1, null, 5);
        BufferOverflow bufferOverflow = BufferOverflow.f410779d;
        this.f293427G = f2.b(0, 1, bufferOverflow, 1);
        this.f293428H = f2.b(0, 1, bufferOverflow, 1);
        this.f293429I = f2.b(0, 1, null, 5);
        this.f293430J = new com.avito.android.sx_address.list.view.a(view, eVar);
        this.f293431K = f2.b(0, 1, null, 5);
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.sx_address.list.view.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f293417c;

            {
                this.f293417c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f293417c.f293429I.K5(G0.f406611a);
                        break;
                    default:
                        this.f293417c.f293428H.K5(G0.f406611a);
                        break;
                }
            }
        });
    }

    public final void a(@k final com.avito.android.sx_address.list.h hVar) {
        final int i12 = 0;
        this.f293445n.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.list.view.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        hVar.accept(a.e.f293261a);
                        break;
                    default:
                        hVar.accept(a.h.f293264a);
                        break;
                }
            }
        });
        Button button = this.f293422B;
        if (button != null) {
            final int i13 = 1;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.list.view.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            hVar.accept(a.e.f293261a);
                            break;
                        default:
                            hVar.accept(a.h.f293264a);
                            break;
                    }
                }
            });
        }
        InterfaceC22983P interfaceC22983P = this.f293438g;
        C43259k.d(C22984Q.a(interfaceC22983P), null, null, new a(interfaceC22983P, this, hVar, null), 3);
    }

    public final void b(@k InfoBannerData infoBannerData) {
        View view = this.f293432a;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(view.getContext(), 0, 2, null);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        if (infoBannerData.f293157d) {
            dVar.y(R.drawable.ic_close_24_bottom_sheet);
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.inn_addresses_added_hint_layout, (ViewGroup) null);
        dVar.setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.hint_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        I5.a((TextView) viewFindViewById, infoBannerData.f293158e, false);
        View viewFindViewById2 = viewInflate.findViewById(R.id.hint_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        com.avito.android.util.text.j.a((TextView) viewFindViewById2, infoBannerData.f293156c, null);
        View viewFindViewById3 = viewInflate.findViewById(R.id.action_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        InfoBannerButtonData infoBannerButtonData = infoBannerData.f293155b;
        com.avito.android.lib.design.button.b.a(button, infoBannerButtonData != null ? infoBannerButtonData.f293153b : null, false);
        dVar.f178527u = true;
        dVar.R(new b());
        button.setOnClickListener(new S7.a(dVar, 17));
        dVar.R(new c());
        com.avito.android.lib.util.g.a(dVar);
    }

    public final void c(@k ActionModalDialogContent actionModalDialogContent, @k DeepLink deepLink) {
        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this.f293432a.getContext(), new d(actionModalDialogContent, this, deepLink)));
    }
}
