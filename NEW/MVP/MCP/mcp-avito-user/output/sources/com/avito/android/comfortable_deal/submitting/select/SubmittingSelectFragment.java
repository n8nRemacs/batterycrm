package com.avito.android.comfortable_deal.submitting.select;

import Cd.C13243a;
import Ju.InterfaceC14249c;
import Rh.C15041a;
import Yo.u;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
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
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.SubmittingSelectScreen;
import com.avito.android.comfortable_deal.deeplink.OrderCallDeeplink;
import com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.DescriptionItem;
import com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.SelectorItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
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
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;
import pq.C47129c;
import pq.InterfaceC47127a;
import pq.InterfaceC47128b;
import qq.C47429c;
import qq.ViewOnClickListenerC47428b;
import z1.AbstractC50339a;

/* compiled from: SubmittingSelectFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/SubmittingSelectFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SubmittingSelectFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f123264w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f123265n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.submitting.select.d f123266o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f123267p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f123268q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f123269r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public u f123270s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final O0 f123271t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public C47429c f123272u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f123273v0;

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/SubmittingSelectFragment$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SubmittingSelectFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment$a$a, reason: collision with other inner class name */
        public static final class C3673a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f123274l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3673a(String str) {
                super(1);
                this.f123274l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("attrIdValue", this.f123274l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SubmittingSelectFragment a(@Y61.k String str) {
            SubmittingSelectFragment submittingSelectFragment = new SubmittingSelectFragment();
            C35966w1.a(submittingSelectFragment, -1, new C3673a(str));
            return submittingSelectFragment;
        }

        public a() {
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = SubmittingSelectFragment.this.requireArguments().getString("attrIdValue");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SubmittingSelectFragment.f123264w0;
            SubmittingSelectFragment.this.q5().accept(InterfaceC47127a.C12291a.f428783a);
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SubmittingSelectFragment.f123264w0;
            SubmittingSelectFragment.this.q5().accept(InterfaceC47127a.c.f428785a);
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC47128b, G0> {
        public final void f(@Y61.k InterfaceC47128b interfaceC47128b) {
            DeepLink deepLink;
            SubmittingSelectFragment submittingSelectFragment = (SubmittingSelectFragment) this.receiver;
            a aVar = SubmittingSelectFragment.f123264w0;
            submittingSelectFragment.getClass();
            if (interfaceC47128b instanceof InterfaceC47128b.d) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = submittingSelectFragment.f123267p0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, null, null, null, 6);
                return;
            }
            if (interfaceC47128b instanceof InterfaceC47128b.a) {
                ActivityC22955m activityC22955mRequireActivity = submittingSelectFragment.requireActivity();
                Intent intent = new Intent();
                if (((InterfaceC47128b.a) interfaceC47128b).f428787a) {
                    u uVar = submittingSelectFragment.f123270s0;
                    u uVar2 = uVar != null ? uVar : null;
                    uVar2.getClass();
                    uVar2.f19685a.c(new Yo.n());
                    intent.putExtra("bundle_key_attr.select", (String) submittingSelectFragment.f123273v0.getValue());
                }
                G0 g02 = G0.f406611a;
                activityC22955mRequireActivity.setResult(-1, intent);
                submittingSelectFragment.requireActivity().finish();
                return;
            }
            if (!(interfaceC47128b instanceof InterfaceC47128b.c)) {
                if (!(interfaceC47128b instanceof InterfaceC47128b.C12292b) || (deepLink = ((InterfaceC47128b.C12292b) interfaceC47128b).f428788a) == null) {
                    return;
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = submittingSelectFragment.f123267p0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, deepLink, null, null, 6);
                return;
            }
            InterfaceC47128b.c cVar = (InterfaceC47128b.c) interfaceC47128b;
            u uVar3 = submittingSelectFragment.f123270s0;
            if (uVar3 == null) {
                uVar3 = null;
            }
            uVar3.getClass();
            uVar3.f19685a.c(new Yo.h());
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(submittingSelectFragment.requireContext(), 0, 2, null);
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, submittingSelectFragment.getResources().getString(R.string.submitting_select_dialog_title), true, true, 2);
            dVar.setCancelable(true);
            dVar.setCanceledOnTouchOutside(true);
            dVar.S(C35835l0.g(dVar.getContext()).y);
            dVar.C(R.layout.submitting_select_bottom_sheet_layout, new com.avito.android.comfortable_deal.submitting.select.a(cVar.f428789a, submittingSelectFragment, dVar));
            com.avito.android.lib.util.g.a(dVar);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC47128b interfaceC47128b) {
            f(interfaceC47128b);
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<C47129c, G0> {
        @Override // Y41.l
        public final G0 invoke(C47129c c47129c) {
            C47129c c47129c2 = c47129c;
            SubmittingSelectFragment submittingSelectFragment = (SubmittingSelectFragment) this.receiver;
            C47429c c47429c = submittingSelectFragment.f123272u0;
            if (c47429c != null) {
                c47429c.f429378f.setText(c47129c2.f428791b);
                List<SelectorItem> list = c47129c2.f428792c;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Iterator<T> it2 = ((SelectorItem) it.next()).f123234e.iterator();
                    while (it2.hasNext()) {
                        ((DescriptionItem) it2.next()).f123230c.setOnDeepLinkClickListener(new C15041a(submittingSelectFragment, 26));
                    }
                }
                com.avito.konveyor.util.a.a(c47429c.f429376d, list);
                c47429c.f429377e.notifyDataSetChanged();
                Button button = c47429c.f429379g;
                button.setText(c47129c2.f428795f);
                D6.G(button, c47129c2.f428794e);
                button.setOnClickListener(new ViewOnClickListenerC47428b(c47429c, 1));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements InterfaceC43160i<C43501a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f123278b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f123279b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment$onViewCreated$$inlined$filter$1$2", f = "SubmittingSelectFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment$g$a$a, reason: collision with other inner class name */
            public static final class C3674a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f123280q;

                /* renamed from: r, reason: collision with root package name */
                public int f123281r;

                public C3674a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f123280q = obj;
                    this.f123281r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f123279b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment.g.a.C3674a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment$g$a$a r0 = (com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment.g.a.C3674a) r0
                    int r1 = r0.f123281r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f123281r = r1
                    goto L18
                L13:
                    com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment$g$a$a r0 = new com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f123280q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f123281r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
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
                    com.avito.android.deep_linking.links.DeepLink r6 = r6.f134520a
                    boolean r6 = r6 instanceof com.avito.android.comfortable_deal.deeplink.OrderCallDeeplink
                    if (r6 == 0) goto L4a
                    r0.f123281r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f123279b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(InterfaceC43160i interfaceC43160i) {
            this.f123278b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f123278b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends C42801a implements Y41.p<C43501a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            C43501a c43501a2 = c43501a;
            SubmittingSelectFragment submittingSelectFragment = (SubmittingSelectFragment) this.receiver;
            a aVar = SubmittingSelectFragment.f123264w0;
            submittingSelectFragment.getClass();
            if (c43501a2.f413260a.f134520a instanceof OrderCallDeeplink) {
                InterfaceC14249c interfaceC14249c = c43501a2.f413261b;
                if (interfaceC14249c instanceof OrderCallDeeplink.b.c) {
                    ActivityC22955m activityC22955mRequireActivity = submittingSelectFragment.requireActivity();
                    Intent intent = new Intent();
                    intent.putExtra("bundle_key_deeplink.select", ((OrderCallDeeplink.b.c) interfaceC14249c).f121880b);
                    G0 g02 = G0.f406611a;
                    activityC22955mRequireActivity.setResult(-1, intent);
                    submittingSelectFragment.requireActivity().finish();
                } else if (interfaceC14249c instanceof OrderCallDeeplink.b.C3602b) {
                    submittingSelectFragment.requireActivity().setResult(0);
                    submittingSelectFragment.requireActivity().finish();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<Integer, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = SubmittingSelectFragment.f123264w0;
            SubmittingSelectFragment.this.q5().accept(new InterfaceC47127a.d(iIntValue));
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SubmittingSelectFragment.f123264w0;
            SubmittingSelectFragment.this.q5().accept(InterfaceC47127a.b.f428784a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f123285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f123285l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f123285l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<Fragment> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SubmittingSelectFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f123287l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f123287l = lVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f123287l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123288l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123288l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f123288l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123289l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f123289l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SubmittingSelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/comfortable_deal/submitting/select/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<com.avito.android.comfortable_deal.submitting.select.c> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.comfortable_deal.submitting.select.c invoke() {
            com.avito.android.comfortable_deal.submitting.select.d dVar = SubmittingSelectFragment.this.f123266o0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.comfortable_deal.submitting.select.c) dVar.get();
        }
    }

    public SubmittingSelectFragment() {
        super(0, 1, null);
        k kVar = new k(new p());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new m(new l()));
        this.f123271t0 = new O0(m0.f406844a.b(com.avito.android.comfortable_deal.submitting.select.c.class), new n(interfaceC42726CB), kVar, new o(interfaceC42726CB));
        this.f123273v0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.submitting_select_fragment, viewGroup, false);
        com.avito.konveyor.adapter.a aVar = this.f123268q0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.j jVar = this.f123269r0;
        this.f123272u0 = new C47429c(viewInflate, new c(), new d(), aVar2, jVar != null ? jVar : null);
        ScreenPerformanceTracker screenPerformanceTracker = this.f123265n0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, q5(), new e(1, this, SubmittingSelectFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectOneTimeEvent;)V", 0), new f(1, this, SubmittingSelectFragment.class, "render", "render(Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectState;)V", 0));
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f123265n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f123267p0;
        C43175k.K(new C43197r1(new h(2, this, SubmittingSelectFragment.class, "processDeeplinkResult", "processDeeplinkResult(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4), new g(y.a((aVar != null ? aVar : null).d9()))), C22984Q.a(getViewLifecycleOwner()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.submitting.select.di.a.a().a((com.avito.android.comfortable_deal.submitting.select.di.h) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.submitting.select.di.h.class), cv.c.b(this), new i(), new j(), new C28478k(SubmittingSelectScreen.f119750d, s.c(this), null, 4, null), (String) this.f123273v0.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f123265n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.comfortable_deal.submitting.select.c q5() {
        return (com.avito.android.comfortable_deal.submitting.select.c) this.f123271t0.getValue();
    }
}
