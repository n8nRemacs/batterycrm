package com.avito.android.str_seller_orders.strsellerordersdialog;

import Bz0.C13210c;
import Bz0.C13211d;
import Bz0.InterfaceC13208a;
import Bz0.InterfaceC13209b;
import Cd.C13243a;
import Dz0.InterfaceC13463a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.yandex.metrica.YandexMetricaDefaultValues;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: StrSellerOrdersDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/StrSellerOrdersDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrSellerOrdersDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public static final a f290066n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.strsellerordersdialog.c f290067h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f290068i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f290069j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f290070k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f290071l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.strsellerordersdialog.shared.a f290072m0;

    /* compiled from: StrSellerOrdersDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/StrSellerOrdersDialogFragment$a;", "", "<init>", "()V", "", "DIALOG_DATA_ARGS", "Ljava/lang/String;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrSellerOrdersDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$onCreateDialog$1", f = "StrSellerOrdersDialogFragment.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290073q;

        /* compiled from: StrSellerOrdersDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$onCreateDialog$1$1", f = "StrSellerOrdersDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f290075q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSellerOrdersDialogFragment f290076r;

            /* compiled from: StrSellerOrdersDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$onCreateDialog$1$1$1", f = "StrSellerOrdersDialogFragment.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$b$a$a, reason: collision with other inner class name */
            public static final class C8743a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290077q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerOrdersDialogFragment f290078r;

                /* compiled from: StrSellerOrdersDialogFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBz0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LBz0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C8744a extends N implements l<C13210c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ StrSellerOrdersDialogFragment f290079l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8744a(StrSellerOrdersDialogFragment strSellerOrdersDialogFragment) {
                        super(1);
                        this.f290079l = strSellerOrdersDialogFragment;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
                    @Override // Y41.l
                    public final G0 invoke(C13210c c13210c) {
                        C13210c c13210c2 = c13210c;
                        StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = this.f290079l;
                        com.avito.konveyor.adapter.d dVar = strSellerOrdersDialogFragment.f290070k0;
                        B b12 = dVar;
                        if (dVar == null) {
                            b12 = 0;
                        }
                        C13211d c13211d = c13210c2.f1841e;
                        b12.l(c13211d.f1844a, null);
                        Dialog dialog = strSellerOrdersDialogFragment.getDialog();
                        if (dialog != null) {
                            TextView textView = (TextView) dialog.findViewById(R.id.title_tv);
                            com.avito.android.util.text.a aVar = strSellerOrdersDialogFragment.f290071l0;
                            com.avito.android.util.text.j.a(textView, c13211d.f1845b, aVar != null ? aVar : null);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8743a(StrSellerOrdersDialogFragment strSellerOrdersDialogFragment, Continuation<? super C8743a> continuation) {
                    super(2, continuation);
                    this.f290078r = strSellerOrdersDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C8743a(this.f290078r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8743a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290077q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = this.f290078r;
                        n2<C13210c> state = ((com.avito.android.str_seller_orders.strsellerordersdialog.b) strSellerOrdersDialogFragment.f290068i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = strSellerOrdersDialogFragment.f290069j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8744a c8744a = new C8744a(strSellerOrdersDialogFragment);
                        this.f290077q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c8744a, this) == coroutine_suspended) {
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

            /* compiled from: StrSellerOrdersDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$onCreateDialog$1$1$2", f = "StrSellerOrdersDialogFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$b$a$b, reason: collision with other inner class name */
            public static final class C8745b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290080q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerOrdersDialogFragment f290081r;

                /* compiled from: StrSellerOrdersDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8746a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrSellerOrdersDialogFragment f290082b;

                    public C8746a(StrSellerOrdersDialogFragment strSellerOrdersDialogFragment) {
                        this.f290082b = strSellerOrdersDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC13209b interfaceC13209b = (InterfaceC13209b) obj;
                        a aVar = StrSellerOrdersDialogFragment.f290066n0;
                        StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = this.f290082b;
                        if (interfaceC13209b instanceof InterfaceC13209b.c) {
                            com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar2 = strSellerOrdersDialogFragment.f290072m0;
                            (aVar2 != null ? aVar2 : null).accept(new InterfaceC13463a.c(((InterfaceC13209b.c) interfaceC13209b).f1833a));
                        } else if (interfaceC13209b instanceof InterfaceC13209b.C0083b) {
                            com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar3 = strSellerOrdersDialogFragment.f290072m0;
                            InterfaceC13209b.C0083b c0083b = (InterfaceC13209b.C0083b) interfaceC13209b;
                            (aVar3 != null ? aVar3 : null).accept(new InterfaceC13463a.b(c0083b.f1831b, c0083b.f1830a, c0083b.f1832c));
                        } else if (interfaceC13209b instanceof InterfaceC13209b.a) {
                            strSellerOrdersDialogFragment.dismiss();
                        } else if (interfaceC13209b instanceof InterfaceC13209b.d) {
                            Dialog dialog = strSellerOrdersDialogFragment.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                            if (dVar != null) {
                                InterfaceC13209b.d dVar2 = (InterfaceC13209b.d) interfaceC13209b;
                                com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, dVar, dVar2.f1834a, null, new f.c(dVar2.f1835b), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f290082b, StrSellerOrdersDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8745b(StrSellerOrdersDialogFragment strSellerOrdersDialogFragment, Continuation<? super C8745b> continuation) {
                    super(2, continuation);
                    this.f290081r = strSellerOrdersDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C8745b(this.f290081r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8745b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290080q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = this.f290081r;
                        InterfaceC43160i<InterfaceC13209b> events = ((com.avito.android.str_seller_orders.strsellerordersdialog.b) strSellerOrdersDialogFragment.f290068i0.getValue()).getEvents();
                        C8746a c8746a = new C8746a(strSellerOrdersDialogFragment);
                        this.f290080q = 1;
                        if (events.collect(c8746a, this) == coroutine_suspended) {
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

            /* compiled from: StrSellerOrdersDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$onCreateDialog$1$1$3", f = "StrSellerOrdersDialogFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290083q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerOrdersDialogFragment f290084r;

                /* compiled from: StrSellerOrdersDialogFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/shared/StrSellerOrdersDialogData;", "dialogData", "Lkotlin/G0;", "emit", "(Lcom/avito/android/str_seller_orders/strsellerordersdialog/shared/StrSellerOrdersDialogData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$b$a$c$a, reason: collision with other inner class name */
                public static final class C8747a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ l0.a f290085b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ StrSellerOrdersDialogFragment f290086c;

                    public C8747a(l0.a aVar, StrSellerOrdersDialogFragment strSellerOrdersDialogFragment) {
                        this.f290085b = aVar;
                        this.f290086c = strSellerOrdersDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        StrSellerOrdersDialogData strSellerOrdersDialogData = (StrSellerOrdersDialogData) obj;
                        l0.a aVar = this.f290085b;
                        if (aVar.f406838b) {
                            aVar.f406838b = false;
                        } else {
                            ((com.avito.android.str_seller_orders.strsellerordersdialog.b) this.f290086c.f290068i0.getValue()).accept(new InterfaceC13208a.d(strSellerOrdersDialogData));
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(StrSellerOrdersDialogFragment strSellerOrdersDialogFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f290084r = strSellerOrdersDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new c(this.f290084r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290083q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        l0.a aVar = new l0.a();
                        aVar.f406838b = true;
                        StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = this.f290084r;
                        com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar2 = strSellerOrdersDialogFragment.f290072m0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        n2<StrSellerOrdersDialogData> n2Var = aVar2.f290174P;
                        C8747a c8747a = new C8747a(aVar, strSellerOrdersDialogFragment);
                        this.f290083q = 1;
                        if (n2Var.collect(c8747a, this) == coroutine_suspended) {
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

            /* compiled from: StrSellerOrdersDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$onCreateDialog$1$1$4", f = "StrSellerOrdersDialogFragment.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
            public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290087q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerOrdersDialogFragment f290088r;

                /* compiled from: StrSellerOrdersDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment$b$a$d$a, reason: collision with other inner class name */
                public /* synthetic */ class C8748a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.str_seller_orders.strsellerordersdialog.b f290089b;

                    public C8748a(com.avito.android.str_seller_orders.strsellerordersdialog.b bVar) {
                        this.f290089b = bVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f290089b.accept((InterfaceC13208a) obj);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f290089b, com.avito.android.str_seller_orders.strsellerordersdialog.b.class, "accept", "accept(Ljava/lang/Object;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(StrSellerOrdersDialogFragment strSellerOrdersDialogFragment, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f290088r = strSellerOrdersDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new d(this.f290088r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290087q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = this.f290088r;
                        com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar = strSellerOrdersDialogFragment.f290072m0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        e2 e2Var = aVar.f290178T;
                        C8748a c8748a = new C8748a((com.avito.android.str_seller_orders.strsellerordersdialog.b) strSellerOrdersDialogFragment.f290068i0.getValue());
                        this.f290087q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8748a, this) == coroutine_suspended) {
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
            public a(StrSellerOrdersDialogFragment strSellerOrdersDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f290076r = strSellerOrdersDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f290076r, continuation);
                aVar.f290075q = obj;
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
                T t12 = (T) this.f290075q;
                StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = this.f290076r;
                C43259k.d(t12, null, null, new C8743a(strSellerOrdersDialogFragment, null), 3);
                C43259k.d(t12, null, null, new C8745b(strSellerOrdersDialogFragment, null), 3);
                C43259k.d(t12, null, null, new c(strSellerOrdersDialogFragment, null), 3);
                C43259k.d(t12, null, null, new d(strSellerOrdersDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return StrSellerOrdersDialogFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f290073q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = StrSellerOrdersDialogFragment.this;
                a aVar = new a(strSellerOrdersDialogFragment, null);
                this.f290073q = 1;
                if (C23056p0.b(strSellerOrdersDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StrSellerOrdersDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = (StrSellerOrdersDialogFragment) this.receiver;
            a aVar = StrSellerOrdersDialogFragment.f290066n0;
            strSellerOrdersDialogFragment.getClass();
            com.avito.android.lib.util.i.j(com.avito.android.lib.util.i.f181373a, view2);
            View viewFindViewById = view2.findViewById(R.id.orders_dialog_list);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            strSellerOrdersDialogFragment.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            com.avito.konveyor.adapter.d dVar = strSellerOrdersDialogFragment.f290070k0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBz0/a;", "it", "Lkotlin/G0;", "invoke", "(LBz0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<InterfaceC13208a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13208a interfaceC13208a) {
            ((com.avito.android.str_seller_orders.strsellerordersdialog.b) StrSellerOrdersDialogFragment.this.f290068i0.getValue()).accept(interfaceC13208a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f290091l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f290091l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f290091l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrSellerOrdersDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f290093l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f290093l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f290093l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f290094l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f290094l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f290094l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f290095l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f290095l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f290095l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrSellerOrdersDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders/strsellerordersdialog/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.str_seller_orders.strsellerordersdialog.b> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_seller_orders.strsellerordersdialog.b invoke() {
            com.avito.android.str_seller_orders.strsellerordersdialog.c cVar = StrSellerOrdersDialogFragment.this.f290067h0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.str_seller_orders.strsellerordersdialog.b) cVar.get();
        }
    }

    public StrSellerOrdersDialogFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f290068i0 = new O0(m0.f406844a.b(com.avito.android.str_seller_orders.strsellerordersdialog.b.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        StrSellerOrdersDialogData strSellerOrdersDialogData;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            strSellerOrdersDialogData = (StrSellerOrdersDialogData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("dialog_data_args", StrSellerOrdersDialogData.class) : arguments.getParcelable("dialog_data_args"));
        } else {
            strSellerOrdersDialogData = null;
        }
        setArguments(C22777e.a());
        com.avito.android.str_seller_orders.strsellerordersdialog.di.a.a().a((cz0.e) C29972i.a(C29972i.b(this), cz0.e.class), cv.c.b(this), s.b(this), new d(), strSellerOrdersDialogData, requireActivity()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f290069j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f290069j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.E(R.layout.str_seller_orders_dialog, false, new c(1, this, StrSellerOrdersDialogFragment.class, "onContentInflated", "onContentInflated(Landroid/view/View;)V", 0));
        dVar.K(true);
        dVar.J(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f290069j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar = this.f290072m0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.accept(InterfaceC13463a.C0205a.f3590a);
        super.onDismiss(dialogInterface);
    }
}
