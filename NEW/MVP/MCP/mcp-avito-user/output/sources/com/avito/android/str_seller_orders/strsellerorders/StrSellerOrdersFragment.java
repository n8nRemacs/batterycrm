package com.avito.android.str_seller_orders.strsellerorders;

import Cd.C13243a;
import Dz0.InterfaceC13463a;
import Y41.p;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
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
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarLink;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.webview.l;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;
import qK0.C47313c;
import yz0.InterfaceC50328b;
import yz0.InterfaceC50329c;
import yz0.d;
import yz0.e;
import z1.AbstractC50339a;
import zz0.InterfaceC50651a;

/* compiled from: StrSellerOrdersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrSellerOrdersFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f289654A0 = {m0.f406844a.e(new Y(StrSellerOrdersFragment.class, "viewHolder", "getViewHolder()Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersViewHolder;", 0))};

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f289655z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.strsellerorders.l f289656n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f289657o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.e f289658p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.strsellerorders.mvi.items.order.c f289659q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f289660r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f289661s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f289662t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC50651a f289663u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f289664v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.webview.l f289665w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.strsellerordersdialog.shared.a f289666x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f289667y0;

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersFragment$a;", "", "<init>", "()V", "", "ARG_HIDE_TOOLBAR_KEY", "Ljava/lang/String;", "REQUEST_KEY", "", "WEB_VIEW_REQUEST_CODE", "I", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C43501a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f289668b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f289669b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$onCreateView$$inlined$filter$1$2", f = "StrSellerOrdersFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$b$a$a, reason: collision with other inner class name */
            public static final class C8729a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f289670q;

                /* renamed from: r, reason: collision with root package name */
                public int f289671r;

                public C8729a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f289670q = obj;
                    this.f289671r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f289669b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment.b.a.C8729a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$b$a$a r0 = (com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment.b.a.C8729a) r0
                    int r1 = r0.f289671r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f289671r = r1
                    goto L18
                L13:
                    com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$b$a$a r0 = new com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f289670q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f289671r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    kv.a r6 = (kv.C43501a) r6
                    com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.f413260a
                    java.lang.String r2 = "str_serller_orders_request_key"
                    java.lang.String r6 = r6.f134521b
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 == 0) goto L4e
                    r0.f289671r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f289669b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f289668b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f289668b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC50329c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC50329c interfaceC50329c) {
            final int i12 = 1;
            InterfaceC50329c interfaceC50329c2 = interfaceC50329c;
            final StrSellerOrdersFragment strSellerOrdersFragment = (StrSellerOrdersFragment) this.receiver;
            a aVar = StrSellerOrdersFragment.f289655z0;
            strSellerOrdersFragment.getClass();
            if (interfaceC50329c2 instanceof InterfaceC50329c.b) {
                strSellerOrdersFragment.requireActivity().finish();
            } else {
                if (interfaceC50329c2 instanceof InterfaceC50329c.C12936c) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = strSellerOrdersFragment.f289662t0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, ((InterfaceC50329c.C12936c) interfaceC50329c2).f443651a, "str_serller_orders_request_key", null, 4);
                } else if (interfaceC50329c2 instanceof InterfaceC50329c.i) {
                    InterfaceC50651a interfaceC50651a = strSellerOrdersFragment.f289663u0;
                    (interfaceC50651a != null ? interfaceC50651a : null).a(((InterfaceC50329c.i) interfaceC50329c2).f443659a);
                } else if (interfaceC50329c2 instanceof InterfaceC50329c.d) {
                    StrSellerOrdersDialogFragment.f290066n0.getClass();
                    StrSellerOrdersDialogFragment strSellerOrdersDialogFragment = new StrSellerOrdersDialogFragment();
                    StrSellerOrdersDialogData strSellerOrdersDialogData = ((InterfaceC50329c.d) interfaceC50329c2).f443652a;
                    strSellerOrdersDialogFragment.setArguments(C22777e.b(new Q("dialog_data_args", strSellerOrdersDialogData)));
                    strSellerOrdersDialogFragment.show(strSellerOrdersFragment.getChildFragmentManager(), "StrSellerOrdersDialogFragment");
                    com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar3 = strSellerOrdersFragment.f289666x0;
                    (aVar3 != null ? aVar3 : null).accept(new InterfaceC13463a.d(strSellerOrdersDialogData));
                } else if (interfaceC50329c2 instanceof InterfaceC50329c.f) {
                    com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar4 = strSellerOrdersFragment.f289666x0;
                    (aVar4 != null ? aVar4 : null).accept(new InterfaceC13463a.d(((InterfaceC50329c.f) interfaceC50329c2).f443654a));
                } else if (interfaceC50329c2 instanceof InterfaceC50329c.g) {
                    final InterfaceC50329c.g gVar = (InterfaceC50329c.g) interfaceC50329c2;
                    Prompt prompt = gVar.f443655a.getPrompt();
                    if (prompt != null) {
                        final com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(strSellerOrdersFragment.requireContext(), R.style.Re23_BottomSheet_Default);
                        View viewInflate = View.inflate(dVar.getContext(), R.layout.str_orders_confirm_bottom_sheet, null);
                        dVar.G(viewInflate, true);
                        String header = prompt.getHeader();
                        com.avito.android.lib.design.bottom_sheet.j.c(dVar, header == null ? "" : header, true, 0, 0, 0, 120);
                        TextView textView = (TextView) viewInflate.findViewById(R.id.confirmation_dialog_subtitle_tv);
                        Button button = (Button) viewInflate.findViewById(R.id.confirmation_dialog_approve_btn);
                        Button button2 = (Button) viewInflate.findViewById(R.id.confirmation_dialog_cancel_button);
                        AttributedText description = prompt.getDescription();
                        com.avito.android.util.text.a aVar5 = strSellerOrdersFragment.f289664v0;
                        com.avito.android.util.text.j.a(textView, description, aVar5 != null ? aVar5 : null);
                        String approve = prompt.getApprove();
                        if (approve == null) {
                            approve = "";
                        }
                        button.setText(approve);
                        final int i13 = 0;
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.str_seller_orders.strsellerorders.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                com.avito.android.lib.design.bottom_sheet.d dVar2 = dVar;
                                InterfaceC50329c.g gVar2 = gVar;
                                StrSellerOrdersFragment strSellerOrdersFragment2 = strSellerOrdersFragment;
                                switch (i13) {
                                    case 0:
                                        StrSellerOrdersFragment.a aVar6 = StrSellerOrdersFragment.f289655z0;
                                        strSellerOrdersFragment2.r5().accept(new InterfaceC50328b.d(gVar2.f443655a, gVar2.f443656b));
                                        dVar2.r();
                                        break;
                                    default:
                                        StrSellerOrdersFragment.a aVar7 = StrSellerOrdersFragment.f289655z0;
                                        strSellerOrdersFragment2.r5().accept(new InterfaceC50328b.e(gVar2.f443655a));
                                        dVar2.r();
                                        break;
                                }
                            }
                        });
                        String cancel = prompt.getCancel();
                        button2.setText(cancel != null ? cancel : "");
                        button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.str_seller_orders.strsellerorders.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                com.avito.android.lib.design.bottom_sheet.d dVar2 = dVar;
                                InterfaceC50329c.g gVar2 = gVar;
                                StrSellerOrdersFragment strSellerOrdersFragment2 = strSellerOrdersFragment;
                                switch (i12) {
                                    case 0:
                                        StrSellerOrdersFragment.a aVar6 = StrSellerOrdersFragment.f289655z0;
                                        strSellerOrdersFragment2.r5().accept(new InterfaceC50328b.d(gVar2.f443655a, gVar2.f443656b));
                                        dVar2.r();
                                        break;
                                    default:
                                        StrSellerOrdersFragment.a aVar7 = StrSellerOrdersFragment.f289655z0;
                                        strSellerOrdersFragment2.r5().accept(new InterfaceC50328b.e(gVar2.f443655a));
                                        dVar2.r();
                                        break;
                                }
                            }
                        });
                        com.avito.android.lib.util.g.a(dVar);
                    }
                } else if (interfaceC50329c2 instanceof InterfaceC50329c.e) {
                    Uri uri = Uri.parse(((InterfaceC50329c.e) interfaceC50329c2).f443653a);
                    com.avito.android.webview.l lVar = strSellerOrdersFragment.f289665w0;
                    if (lVar == null) {
                        lVar = null;
                    }
                    C35966w1.d(strSellerOrdersFragment, l.a.a(lVar, uri, null, 6), 10);
                } else if (interfaceC50329c2 instanceof InterfaceC50329c.a) {
                    com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar6 = strSellerOrdersFragment.f289666x0;
                    (aVar6 != null ? aVar6 : null).accept(InterfaceC13463a.e.f3596a);
                } else if (interfaceC50329c2 instanceof InterfaceC50329c.h) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    InterfaceC50329c.h hVar = (InterfaceC50329c.h) interfaceC50329c2;
                    Throwable th2 = hVar.f443658b;
                    f.c cVar2 = new f.c(th2);
                    PrintableText printableText = hVar.f443657a;
                    com.avito.android.component.toast.c.c(cVar, strSellerOrdersFragment, printableText, null, null, cVar2, 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                    com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar7 = strSellerOrdersFragment.f289666x0;
                    (aVar7 != null ? aVar7 : null).accept(new InterfaceC13463a.f(printableText, th2));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<StrSellerOrdersState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(StrSellerOrdersState strSellerOrdersState) {
            a aVar = StrSellerOrdersFragment.f289655z0;
            StrSellerOrdersFragment strSellerOrdersFragment = StrSellerOrdersFragment.this;
            com.avito.android.str_seller_orders.strsellerorders.e eVar = new com.avito.android.str_seller_orders.strsellerorders.e(1, strSellerOrdersFragment.r5(), com.avito.android.str_seller_orders.strsellerorders.k.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            yz0.e eVar2 = strSellerOrdersState.f289892l;
            if (eVar2 != null) {
                com.avito.android.str_seller_orders.strsellerorders.j jVarQ5 = strSellerOrdersFragment.q5();
                SwipeRefreshLayout swipeRefreshLayout = jVarQ5.f289819e;
                swipeRefreshLayout.setRefreshing(false);
                swipeRefreshLayout.setOnRefreshListener(new AJ.b(15, eVar));
                yz0.d f443662a = eVar2.getF443662a();
                boolean z12 = f443662a instanceof d.b;
                ShimmerFrameLayout shimmerFrameLayout = jVarQ5.f289817c;
                TextView textView = jVarQ5.f289816b;
                if (z12) {
                    D6.H(shimmerFrameLayout);
                    D6.w(textView);
                } else if (f443662a instanceof d.a) {
                    D6.w(shimmerFrameLayout);
                    com.avito.android.printable_text.a.c(textView, ((d.a) f443662a).f443660a);
                    D6.H(textView);
                }
                boolean z13 = eVar2 instanceof e.b;
                Button button = jVarQ5.f289824j;
                TextView textView2 = jVarQ5.f289823i;
                TextView textView3 = jVarQ5.f289822h;
                ImageView imageView = jVarQ5.f289821g;
                View view = jVarQ5.f289820f;
                RecyclerView recyclerView = jVarQ5.f289818d;
                if (z13) {
                    D6.w(recyclerView);
                    com.avito.android.image_loader.glide.utils.b.a(imageView, R.drawable.str_seller_orders_no_content_img);
                    textView3.setText(R.string.str_seller_orders_empty_state_header);
                    textView2.setText(R.string.str_seller_orders_empty_state_description);
                    D6.w(button);
                    D6.H(view);
                } else if (eVar2 instanceof e.c) {
                    D6.w(recyclerView);
                    e.c cVar = (e.c) eVar2;
                    imageView.setImageDrawable(C35835l0.h(cVar.f443667c, strSellerOrdersFragment.requireContext()));
                    textView3.setText(cVar.f443668d);
                    textView2.setText(cVar.f443669e);
                    D6.H(button);
                    D6.H(view);
                } else if (eVar2 instanceof e.a) {
                    D6.H(recyclerView);
                    D6.w(view);
                    com.avito.konveyor.adapter.d dVar = strSellerOrdersFragment.f289661s0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(((e.a) eVar2).f443664c, null);
                }
                if (strSellerOrdersFragment.requireArguments().getBoolean("arg_hide_toolbar_key")) {
                    D6.w(jVarQ5.f289815a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$onCreateView$3", f = "StrSellerOrdersFragment.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289674q;

        /* compiled from: StrSellerOrdersFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$onCreateView$3$1", f = "StrSellerOrdersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f289676q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrSellerOrdersFragment f289677r;

            /* compiled from: StrSellerOrdersFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$onCreateView$3$1$1", f = "StrSellerOrdersFragment.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$e$a$a, reason: collision with other inner class name */
            public static final class C8730a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f289678q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrSellerOrdersFragment f289679r;

                /* compiled from: StrSellerOrdersFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyz0/b;", "it", "Lkotlin/G0;", "emit", "(Lyz0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$e$a$a$a, reason: collision with other inner class name */
                public static final class C8731a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrSellerOrdersFragment f289680b;

                    public C8731a(StrSellerOrdersFragment strSellerOrdersFragment) {
                        this.f289680b = strSellerOrdersFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        a aVar = StrSellerOrdersFragment.f289655z0;
                        this.f289680b.r5().accept((InterfaceC50328b) obj);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8730a(StrSellerOrdersFragment strSellerOrdersFragment, Continuation<? super C8730a> continuation) {
                    super(2, continuation);
                    this.f289679r = strSellerOrdersFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8730a(this.f289679r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8730a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f289678q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        StrSellerOrdersFragment strSellerOrdersFragment = this.f289679r;
                        com.avito.android.str_seller_orders.strsellerordersdialog.shared.a aVar = strSellerOrdersFragment.f289666x0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        e2 e2Var = aVar.f290176R;
                        C8731a c8731a = new C8731a(strSellerOrdersFragment);
                        this.f289678q = 1;
                        e2Var.getClass();
                        if (e2.g(e2Var, c8731a, this) == coroutine_suspended) {
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
            public a(StrSellerOrdersFragment strSellerOrdersFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f289677r = strSellerOrdersFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f289677r, continuation);
                aVar.f289676q = obj;
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
                C43259k.d((T) this.f289676q, null, null, new C8730a(this.f289677r, null), 3);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrSellerOrdersFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f289674q;
            if (i12 == 0) {
                C42729a0.b(obj);
                StrSellerOrdersFragment strSellerOrdersFragment = StrSellerOrdersFragment.this;
                InterfaceC22983P viewLifecycleOwner = strSellerOrdersFragment.getViewLifecycleOwner();
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(strSellerOrdersFragment, null);
                this.f289674q = 1;
                if (C23056p0.b(viewLifecycleOwner, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$onCreateView$5", f = "StrSellerOrdersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {
        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrSellerOrdersFragment.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((f) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = StrSellerOrdersFragment.f289655z0;
            StrSellerOrdersFragment.this.r5().accept(InterfaceC50328b.f.f443636a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment$onCreateView$6", f = "StrSellerOrdersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f289682q;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = StrSellerOrdersFragment.this.new g(continuation);
            gVar.f289682q = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((g) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (((C43501a) this.f289682q).f413261b instanceof StrOrdersCalendarLink.b.C8772b) {
                a aVar = StrSellerOrdersFragment.f289655z0;
                StrSellerOrdersFragment.this.r5().accept(InterfaceC50328b.m.f443645a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersFragment$h", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayoutManager f289684b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ StrSellerOrdersFragment f289685c;

        public h(LinearLayoutManager linearLayoutManager, StrSellerOrdersFragment strSellerOrdersFragment) {
            this.f289684b = linearLayoutManager;
            this.f289685c = strSellerOrdersFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            int iM1 = this.f289684b.M1();
            if (iM1 != -1 && (recyclerView.P(iM1) instanceof com.avito.android.str_seller_orders.common.items.order_stub.g)) {
                a aVar = StrSellerOrdersFragment.f289655z0;
                this.f289685c.r5().accept(InterfaceC50328b.n.f443646a);
            }
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyz0/b;", "it", "Lkotlin/G0;", "invoke", "(Lyz0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<InterfaceC50328b, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC50328b interfaceC50328b) {
            a aVar = StrSellerOrdersFragment.f289655z0;
            StrSellerOrdersFragment.this.r5().accept(interfaceC50328b);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f289687l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f289687l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f289687l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrSellerOrdersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f289689l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f289689l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f289689l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f289690l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f289690l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f289690l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f289691l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f289691l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f289691l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders/strsellerorders/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.str_seller_orders.strsellerorders.k> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_seller_orders.strsellerorders.k invoke() {
            com.avito.android.str_seller_orders.strsellerorders.l lVar = StrSellerOrdersFragment.this.f289656n0;
            if (lVar == null) {
                lVar = null;
            }
            return (com.avito.android.str_seller_orders.strsellerorders.k) lVar.get();
        }
    }

    public StrSellerOrdersFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f289657o0 = new O0(m0.f406844a.b(com.avito.android.str_seller_orders.strsellerorders.k.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f289667y0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        if (i12 == 10) {
            r5().accept(InterfaceC50328b.p.f443648a);
        } else {
            super.onActivityResult(i12, i13, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f289660r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f289660r0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, r5(), new c(1, this, StrSellerOrdersFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersOneTimeEvent;)V", 0), new d());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new e(null), 3);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f289662t0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new g(null), new C43197r1(new f(null), new b(C40482a.b(aVar)))), C22981N.a(getLifecycle()));
        return layoutInflater.inflate(R.layout.str_seller_orders_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f289660r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        com.avito.android.str_seller_orders.strsellerorders.j jVar = new com.avito.android.str_seller_orders.strsellerorders.j(view);
        C47313c c47313c = this.f289667y0;
        kotlin.reflect.n<Object> nVar = f289654A0[0];
        c47313c.b(this, jVar);
        com.avito.android.str_seller_orders.strsellerorders.j jVarQ5 = q5();
        com.avito.konveyor.adapter.d dVar = this.f289661s0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        RecyclerView recyclerView = jVarQ5.f289818d;
        recyclerView.setAdapter(dVar2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.s();
        recyclerView.o(new h(linearLayoutManager, this));
        final int i12 = 0;
        q5().f289815a.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders.strsellerorders.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrSellerOrdersFragment f289709c;

            {
                this.f289709c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrSellerOrdersFragment strSellerOrdersFragment = this.f289709c;
                switch (i12) {
                    case 0:
                        StrSellerOrdersFragment.a aVar = StrSellerOrdersFragment.f289655z0;
                        strSellerOrdersFragment.r5().accept(InterfaceC50328b.a.f443630a);
                        break;
                    default:
                        StrSellerOrdersFragment.a aVar2 = StrSellerOrdersFragment.f289655z0;
                        strSellerOrdersFragment.r5().accept(InterfaceC50328b.l.f443644a);
                        break;
                }
            }
        });
        final int i13 = 1;
        q5().f289824j.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders.strsellerorders.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrSellerOrdersFragment f289709c;

            {
                this.f289709c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrSellerOrdersFragment strSellerOrdersFragment = this.f289709c;
                switch (i13) {
                    case 0:
                        StrSellerOrdersFragment.a aVar = StrSellerOrdersFragment.f289655z0;
                        strSellerOrdersFragment.r5().accept(InterfaceC50328b.a.f443630a);
                        break;
                    default:
                        StrSellerOrdersFragment.a aVar2 = StrSellerOrdersFragment.f289655z0;
                        strSellerOrdersFragment.r5().accept(InterfaceC50328b.l.f443644a);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.str_seller_orders.strsellerorders.di.b.a().a((cz0.e) C29972i.a(C29972i.b(this), cz0.e.class), cv.c.b(this), s.c(this), new i(), bundle != null, requireActivity()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f289660r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.str_seller_orders.strsellerorders.j q5() {
        C47313c c47313c = this.f289667y0;
        kotlin.reflect.n<Object> nVar = f289654A0[0];
        return (com.avito.android.str_seller_orders.strsellerorders.j) c47313c.a();
    }

    public final com.avito.android.str_seller_orders.strsellerorders.k r5() {
        return (com.avito.android.str_seller_orders.strsellerorders.k) this.f289657o0.getValue();
    }
}
