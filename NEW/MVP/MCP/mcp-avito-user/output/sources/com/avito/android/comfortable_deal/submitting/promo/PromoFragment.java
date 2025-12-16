package com.avito.android.comfortable_deal.submitting.promo;

import Cd.r;
import Ju.InterfaceC14249c;
import Y41.p;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23060r0;
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
import com.avito.android.comfortable_deal.ComfortableDealPromoScreen;
import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import com.avito.android.comfortable_deal.submitting.promo.b;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.ButtonState;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.HeaderState;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.InputState;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.PromoState;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;
import mq.InterfaceC44119a;
import mq.InterfaceC44120b;
import z1.AbstractC50339a;

/* compiled from: PromoFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/PromoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f123100u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public b.a f123101n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f123102o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f123103p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f123104q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f123105r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f123106s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public nq.c f123107t0;

    /* compiled from: PromoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/PromoFragment$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PromoFragment.f123100u0;
            PromoFragment.this.q5().accept(InterfaceC44119a.C11844a.f414765a);
            return G0.f406611a;
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PromoFragment.f123100u0;
            PromoFragment.this.q5().accept(InterfaceC44119a.d.f414768a);
            return G0.f406611a;
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PromoFragment.f123100u0;
            PromoFragment.this.q5().accept(InterfaceC44119a.b.f414766a);
            return G0.f406611a;
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<String, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = PromoFragment.f123100u0;
            PromoFragment.this.q5().accept(new InterfaceC44119a.c(str));
            return G0.f406611a;
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            com.avito.android.deeplink_handler.handler.composite.a aVar = PromoFragment.this.f123105r0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink2, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<InterfaceC44120b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC44120b interfaceC44120b) {
            InterfaceC44120b interfaceC44120b2 = interfaceC44120b;
            PromoFragment promoFragment = (PromoFragment) this.receiver;
            a aVar = PromoFragment.f123100u0;
            promoFragment.getClass();
            if (L.f(interfaceC44120b2, InterfaceC44120b.c.f414771a)) {
                nq.c cVar = promoFragment.f123107t0;
                if (cVar != null) {
                    cVar.f419178p.p(0);
                }
            } else if (L.f(interfaceC44120b2, InterfaceC44120b.a.f414769a)) {
                promoFragment.requireActivity().finish();
            } else if (interfaceC44120b2 instanceof InterfaceC44120b.C11845b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = promoFragment.f123105r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, new SubmittingSuccessLink(), null, null, 6);
            } else if (interfaceC44120b2 instanceof InterfaceC44120b.d) {
                com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar2, promoFragment, com.avito.android.printable_text.b.f(((InterfaceC44120b.d) interfaceC44120b2).f414772a), null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<PromoState, G0> {
        @Override // Y41.l
        public final G0 invoke(PromoState promoState) {
            PromoState promoState2 = promoState;
            nq.c cVar = ((PromoFragment) this.receiver).f123107t0;
            if (cVar != null) {
                cVar.f419170h.setTitle(promoState2.f123187b);
                HeaderState headerState = promoState2.f123188c;
                UniversalImage universalImage = headerState.f123171b;
                com.avito.android.image_loader.glide.utils.b.d(cVar.f419171i, com.avito.android.image_loader.n.a(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(cVar.f419169g)) : null));
                cVar.f419172j.setText(headerState.f123172c);
                cVar.f419173k.setText(headerState.f123173d);
                ButtonState buttonState = promoState2.f123190e;
                boolean z12 = buttonState.f123168b;
                Button button = cVar.f419181s;
                button.setEnabled(z12);
                boolean z13 = buttonState.f123169c;
                button.setLoading(z13);
                Button button2 = cVar.f419182t;
                button2.setLoading(z13);
                String str = buttonState.f123170d;
                if (str != null) {
                    button.setText(str);
                    button2.setText(str);
                }
                InputState inputState = promoState2.f123189d;
                cVar.f419174l.setText(inputState.f123174b);
                cVar.f419175m.setText(inputState.f123175c);
                Input input = cVar.f419176n;
                Input.t(input, inputState.f123176d, false, 6);
                input.setHint(inputState.f123178f);
                TextView textView = cVar.f419177o;
                AttributedText attributedText = inputState.f123177e;
                com.avito.android.util.text.j.a(textView, attributedText, null);
                if (attributedText != null) {
                    attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(cVar, 22));
                }
                if (inputState.f123179g) {
                    Input.f179303W.getClass();
                    input.setState(Input.f179305b0);
                } else {
                    Input.f179303W.getClass();
                    input.setState(Input.f179304a0);
                }
                cVar.f419168f.c(new UV0.c(promoState2.f123191f));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends C42801a implements p<C43501a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            C43501a c43501a2 = c43501a;
            PromoFragment promoFragment = (PromoFragment) this.receiver;
            a aVar = PromoFragment.f123100u0;
            promoFragment.getClass();
            if (c43501a2.f413260a.f134520a instanceof SubmittingSuccessLink) {
                InterfaceC14249c interfaceC14249c = c43501a2.f413261b;
                if (interfaceC14249c instanceof SubmittingSuccessLink.b.C3605b) {
                    ActivityC22955m activityC22955mRequireActivity = promoFragment.requireActivity();
                    Intent intent = new Intent();
                    intent.putExtra("bundle_key_deeplink.promo", ((SubmittingSuccessLink.b.C3605b) interfaceC14249c).f121890b);
                    G0 g02 = G0.f406611a;
                    activityC22955mRequireActivity.setResult(-1, intent);
                    promoFragment.requireActivity().finish();
                } else if (interfaceC14249c instanceof SubmittingSuccessLink.b.a) {
                    promoFragment.requireActivity().setResult(0);
                    promoFragment.requireActivity().finish();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f123114m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.l lVar) {
            super(0);
            this.f123114m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(PromoFragment.this, this.f123114m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PromoFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f123116l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f123116l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f123116l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123117l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123117l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f123117l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123118l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123118l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f123118l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/comfortable_deal/submitting/promo/b;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/comfortable_deal/submitting/promo/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.l<C23060r0, com.avito.android.comfortable_deal.submitting.promo.b> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.comfortable_deal.submitting.promo.b invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            b.a aVar = PromoFragment.this.f123101n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public PromoFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f123102o0 = new O0(m0.f406844a.b(com.avito.android.comfortable_deal.submitting.promo.b.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.comfortable_deal_promo_fragment, viewGroup, false);
        com.avito.konveyor.adapter.a aVar = this.f123103p0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.j jVar = this.f123104q0;
        this.f123107t0 = new nq.c(viewInflate, new b(), new c(), new d(), jVar != null ? jVar : null, new e(), new f(), aVar2);
        ScreenPerformanceTracker screenPerformanceTracker = this.f123106s0;
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, q5(), new g(1, this, PromoFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoOneTimeEvent;)V", 0), new h(1, this, PromoFragment.class, "render", "render(Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoState;)V", 0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f123107t0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f123105r0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new i(2, this, PromoFragment.class, "processDeeplinkResult", "processDeeplinkResult(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4), y.a(aVar.d9())), C22981N.a(getLifecycle()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.submitting.promo.di.a.a().a((com.avito.android.comfortable_deal.submitting.promo.di.c) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.submitting.promo.di.c.class), cv.c.b(this), new C28478k(ComfortableDealPromoScreen.f119743d, s.c(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f123106s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.comfortable_deal.submitting.promo.b q5() {
        return (com.avito.android.comfortable_deal.submitting.promo.b) this.f123102o0.getValue();
    }
}
