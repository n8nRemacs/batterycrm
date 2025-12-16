package com.avito.android.publish.screen.step.params;

import Ie0.InterfaceC14065a;
import Ie0.d;
import Je0.C14190a;
import Oi0.InterfaceC14698b;
import Xd0.InterfaceC16992a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.EditParametersScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.PublishParametersScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.photo_list_view.s;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33864h0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33777o1;
import com.avito.android.publish.details.di.C33735p;
import com.avito.android.publish.details.seller_protection.SellerProtectionBottomSheet;
import com.avito.android.publish.details.seller_protection.SellerProtectionDialogResult;
import com.avito.android.publish.objects.N0;
import com.avito.android.publish.objects.di.C33921d;
import com.avito.android.publish.realty_address_submission.RealtyAddressSubmissionActivity;
import com.avito.android.publish.screen.step.params.J;
import com.avito.android.publish.screen.step.params.di.b;
import com.avito.android.publish.slots.contact_info.d;
import com.avito.android.publish.view.ItemDetailsBaseFragment;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionInfo;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.NotFoundException;
import com.avito.android.validation.InterfaceC36014j;
import gj.o;
import iN0.InterfaceC41321b;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kr.C43490a;
import yc.C50213a;
import z1.AbstractC50339a;

/* compiled from: PublishDetailsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/screen/step/params/PublishDetailsFragment;", "Lcom/avito/android/publish/view/ItemDetailsBaseFragment;", "LId0/c;", "Lcom/avito/android/publish/photo_picker/c;", "Lgj/i;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "LJe0/b;", "LiN0/b;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishDetailsFragment extends ItemDetailsBaseFragment implements Id0.c, com.avito.android.publish.photo_picker.c, gj.i, com.avito.android.ui.fragments.c, InterfaceC28477j.b, Je0.b, InterfaceC41321b {

    /* renamed from: j1, reason: collision with root package name */
    @Y61.k
    public static final a f240417j1 = new a(null);

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f240418C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public C50213a f240419D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.analytics.E f240420E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.slots.images_groups_recommendations.analytics.d f240421F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.auction.d f240422G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public InterfaceC14698b f240423H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public C33864h0 f240424I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public InterfaceC33535v f240425J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f240426K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public gj.n f240427L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public InterfaceC16992a f240428M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f240429N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f240430O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.screen.step.params.view.actions.l f240431P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f240432Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public HtmlEditorViewModel f240433R0;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public C0 f240434S0;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public Q1 f240435T0;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public J.b f240436U0;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public final O0 f240437V0;

    /* renamed from: W0, reason: collision with root package name */
    @Inject
    public Pd0.v f240438W0;

    /* renamed from: X0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f240439X0;

    /* renamed from: Y0, reason: collision with root package name */
    @Inject
    public InterfaceC36014j f240440Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.l
    public InterfaceC33777o1 f240441Z0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f240442a1;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f240443b1;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f240444c1;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f240445d1;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.l
    public y f240446e1;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.step.params.view.b f240447f1;

    /* renamed from: g1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.step.params.view.j f240448g1;

    /* renamed from: h1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.step.params.p f240449h1;

    /* renamed from: i1, reason: collision with root package name */
    @Y61.l
    public H2 f240450i1;

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/screen/step/params/PublishDetailsFragment$a;", "", "<init>", "()V", "", "ARG_DRAFT_ID", "Ljava/lang/String;", "ARG_IS_EDITING", "ARG_SLOT_WITH_STEP_CONFIG_ID", "", "RECYCLER_ITEM_CHANGE_DURATION", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static PublishDetailsFragment a(@Y61.k String str, boolean z12, @Y61.l ScreenTransfer screenTransfer, @Y61.l String str2) {
            PublishDetailsFragment publishDetailsFragment = new PublishDetailsFragment();
            publishDetailsFragment.setArguments(C22777e.b(new Q("draft_id", str), new Q("key_is_editing", Boolean.valueOf(z12)), new Q("key_slot_with_step_config_id", str2), new Q("SCREEN_TRANSFER_KEY", screenTransfer)));
            return publishDetailsFragment;
        }

        public a() {
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            PublishDetailsFragment publishDetailsFragment = PublishDetailsFragment.this;
            com.avito.android.publish.screen.step.params.view.actions.l lVar = publishDetailsFragment.f240431P0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.i(zBooleanValue);
            com.avito.android.publish.screen.step.params.view.j jVar = publishDetailsFragment.f240448g1;
            if (jVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            N0 n02 = jVar.f241617o;
            if (n02 != null) {
                n02.f237523b = zBooleanValue;
                ShadowFrameLayout shadowFrameLayout = n02.f237525d;
                if (shadowFrameLayout != null) {
                    n02.a(shadowFrameLayout, zBooleanValue, n02.f237524c);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() throws NotFoundException {
            String string = PublishDetailsFragment.this.requireArguments().getString("draft_id");
            if (string != null) {
                return string;
            }
            throw new NotFoundException("draft_id", (Throwable) null, 2, (C42822w) null);
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(PublishDetailsFragment.this.requireArguments().getBoolean("key_is_editing", false));
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/details/seller_protection/SellerProtectionDialogResult;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/details/seller_protection/SellerProtectionDialogResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<SellerProtectionDialogResult, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SellerProtectionDialogResult sellerProtectionDialogResult) {
            a aVar = PublishDetailsFragment.f240417j1;
            PublishDetailsFragment.this.v5().accept(new InterfaceC14065a.b.e(sellerProtectionDialogResult));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends kotlin.jvm.internal.H implements Y41.l<InterfaceC14065a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14065a interfaceC14065a) {
            ((J) this.receiver).accept(interfaceC14065a);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends kotlin.jvm.internal.H implements Y41.l<Ie0.d, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v54, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v58, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r7v2, types: [Y41.a, kotlin.jvm.internal.N] */
        public final void f(@Y61.k Ie0.d dVar) {
            Intent intentC;
            PublishDetailsFragment publishDetailsFragment = (PublishDetailsFragment) this.receiver;
            a aVar = PublishDetailsFragment.f240417j1;
            publishDetailsFragment.getClass();
            if (!(dVar instanceof d.a)) {
                if (dVar instanceof d.b) {
                    com.avito.android.publish.screen.step.params.view.j jVar = publishDetailsFragment.f240448g1;
                    if (jVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    jVar.f((d.b) dVar);
                    return;
                }
                return;
            }
            d.a aVar2 = (d.a) dVar;
            v vVarU5 = publishDetailsFragment.u5();
            if (aVar2 instanceof d.a.C14077b) {
                y yVar = (y) vVarU5;
                if (androidx.core.content.d.checkSelfPermission(yVar.f241679b.requireContext(), "android.permission.CAMERA") == -1) {
                    yVar.f241671J.b("android.permission.CAMERA");
                    return;
                } else {
                    yVar.a(true);
                    return;
                }
            }
            if (aVar2 instanceof d.a.C14078c) {
                ((y) vVarU5).T4();
                return;
            }
            if (aVar2 instanceof d.a.C0477d) {
                ((y) vVarU5).D0();
                return;
            }
            if (aVar2 instanceof d.a.C14084j) {
                ((y) vVarU5).m2(((d.a.C14084j) aVar2).f8385a);
                return;
            }
            if (aVar2 instanceof d.a.C14085k) {
                d.a.C14085k c14085k = (d.a.C14085k) aVar2;
                ((y) vVarU5).p2(c14085k.f8386a, c14085k.f8387b, c14085k.f8388c);
                return;
            }
            if (aVar2 instanceof d.a.C14086l) {
                ((y) vVarU5).Q2(((d.a.C14086l) aVar2).f8389a);
                return;
            }
            if (aVar2 instanceof d.a.C14087m) {
                ((y) vVarU5).M2();
                return;
            }
            if (aVar2 instanceof d.a.C14088n) {
                ((y) vVarU5).t1();
                return;
            }
            if (aVar2 instanceof d.a.C14089o) {
                ((y) vVarU5).b();
                return;
            }
            if (aVar2 instanceof d.a.C14090p) {
                ((y) vVarU5).G2(((d.a.C14090p) aVar2).f8393a);
                return;
            }
            if (aVar2 instanceof d.a.C14091q) {
                d.a.C14091q c14091q = (d.a.C14091q) aVar2;
                ((y) vVarU5).K2(c14091q.f8394a, c14091q.f8395b);
                return;
            }
            if (aVar2 instanceof d.a.C14092r) {
                ((y) vVarU5).w3(((d.a.C14092r) aVar2).f8396a);
                return;
            }
            if (aVar2 instanceof d.a.C14093s) {
                d.a.C14093s c14093s = (d.a.C14093s) aVar2;
                ((y) vVarU5).r(c14093s.f8397a, c14093s.f8398b);
                return;
            }
            if (aVar2 instanceof d.a.C14094t) {
                ((y) vVarU5).m1();
                return;
            }
            if (aVar2 instanceof d.a.C14095u) {
                d.a.C14095u c14095u = (d.a.C14095u) aVar2;
                ((y) vVarU5).Q3(c14095u.f8400a, c14095u.f8401b);
                return;
            }
            if (aVar2 instanceof d.a.v) {
                ((y) vVarU5).h1();
                return;
            }
            if (aVar2 instanceof d.a.w) {
                d.a.w wVar = (d.a.w) aVar2;
                ((y) vVarU5).t(wVar.f8403a, wVar.f8404b, wVar.f8405c);
                return;
            }
            if (aVar2 instanceof d.a.x) {
                d.a.x xVar = (d.a.x) aVar2;
                ((y) vVarU5).C2(xVar.f8406a, xVar.f8407b, xVar.f8408c);
                return;
            }
            if (aVar2 instanceof d.a.y) {
                ((y) vVarU5).m4(((d.a.y) aVar2).f8409a);
                return;
            }
            if (aVar2 instanceof d.a.z) {
                ((y) vVarU5).v2(((d.a.z) aVar2).f8410a);
                return;
            }
            if (aVar2 instanceof d.a.A) {
                ((y) vVarU5).u2(((d.a.A) aVar2).f8331a);
                return;
            }
            if (aVar2 instanceof d.a.D) {
                PublishDetailsFragment publishDetailsFragment2 = ((y) vVarU5).f241679b;
                InterfaceC35845m2 interfaceC35845m2 = publishDetailsFragment2.f245626x0;
                publishDetailsFragment2.startActivity((interfaceC35845m2 != null ? interfaceC35845m2 : null).i());
                return;
            }
            if (aVar2 instanceof d.a.E) {
                ((y) vVarU5).O2(((d.a.E) aVar2).f8338a);
                return;
            }
            if (aVar2 instanceof d.a.T) {
                ((y) vVarU5).t3(((d.a.T) aVar2).f8372a);
                return;
            }
            if (aVar2 instanceof d.a.F) {
                ((d.a.F) aVar2).getClass();
                ((y) vVarU5).e(null, null);
                return;
            }
            if (aVar2 instanceof d.a.G) {
                ((y) vVarU5).e(((d.a.G) aVar2).f8340b, new com.avito.android.publish.screen.step.params.t(aVar2, publishDetailsFragment));
                return;
            }
            if (aVar2 instanceof d.a.I) {
                d.a.I i12 = (d.a.I) aVar2;
                ((y) vVarU5).T0(i12.f8345a, i12.f8346b);
                return;
            }
            if (aVar2 instanceof d.a.J) {
                d.a.J j12 = (d.a.J) aVar2;
                ((y) vVarU5).F3(j12.f8347a, j12.f8348b, j12.f8349c);
                return;
            }
            if (aVar2 instanceof d.a.K) {
                d.a.K k12 = (d.a.K) aVar2;
                ((y) vVarU5).Z0(k12.f8350a, k12.f8351b, k12.f8352c);
                return;
            }
            if (aVar2 instanceof d.a.L) {
                d.a.L l12 = (d.a.L) aVar2;
                ((y) vVarU5).h2(l12.f8353a, l12.f8354b, l12.f8355c, l12.f8356d, l12.f8357e);
                return;
            }
            if (aVar2 instanceof d.a.M) {
                d.a.M m12 = (d.a.M) aVar2;
                ((y) vVarU5).M3(m12.f8358a, m12.f8359b, m12.f8360c, m12.f8361d, m12.f8362e, m12.f8363f);
                return;
            }
            if (aVar2 instanceof d.a.N) {
                d.a.N n12 = (d.a.N) aVar2;
                ((y) vVarU5).h4(n12.f8364a, n12.f8365b);
                return;
            }
            if (aVar2 instanceof d.a.O) {
                ((y) vVarU5).W4(((d.a.O) aVar2).f8366a);
                return;
            }
            if (aVar2 instanceof d.a.P) {
                d.a.P p12 = (d.a.P) aVar2;
                ((y) vVarU5).g4(p12.f8367a, p12.f8368b);
                return;
            }
            if (aVar2 instanceof d.a.Q) {
                ((y) vVarU5).o(((d.a.Q) aVar2).f8369a);
                return;
            }
            if (aVar2 instanceof d.a.R) {
                ((y) vVarU5).L0();
                return;
            }
            if (aVar2 instanceof d.a.S) {
                ((y) vVarU5).R1(((d.a.S) aVar2).f8371a);
                return;
            }
            if (aVar2 instanceof d.a.C14083i) {
                ((y) vVarU5).E0();
                return;
            }
            if (aVar2 instanceof d.a.B) {
                d.b bVar = ((d.a.B) aVar2).f8332a;
                y yVar2 = (y) vVarU5;
                com.avito.android.phone_confirmation.P p13 = yVar2.f241698u;
                yVar2.f241677P.b((p13 != null ? p13 : null).a(bVar.f243241a, bVar.f243242b, bVar.f243243c, false));
                return;
            }
            if (aVar2 instanceof d.a.C) {
                d.a.C c12 = (d.a.C) aVar2;
                boolean z12 = c12.f8336d;
                y yVar3 = (y) vVarU5;
                String str = c12.f8334b;
                String str2 = c12.f8333a;
                String str3 = c12.f8335c;
                if (z12) {
                    com.avito.android.phone_reverification_info.d dVar2 = yVar3.f241697t;
                    intentC = (dVar2 != null ? dVar2 : null).b(str2, str, str3);
                } else {
                    com.avito.android.phone_reverification_info.d dVar3 = yVar3.f241697t;
                    intentC = (dVar3 != null ? dVar3 : null).c(str2, str, str3, "additem/add_phone/this_phone_in_another_account");
                }
                yVar3.f241678Q.b(intentC);
                return;
            }
            if (aVar2 instanceof d.a.C14081g) {
                d.a.C14081g c14081g = (d.a.C14081g) aVar2;
                Y41.a<G0> aVar3 = c14081g.f8381b;
                Y41.a<G0> aVar4 = c14081g.f8382c;
                com.avito.android.publish.details.iac.e eVar = ((y) vVarU5).f241696s;
                (eVar != null ? eVar : null).b(c14081g.f8380a, aVar3, aVar3, aVar4, E.f240407l, F.f240408l, aVar4, aVar3, G.f240409l);
                return;
            }
            if (aVar2 instanceof d.a.C0476a) {
                RealtyAddressSubmissionInfo realtyAddressSubmissionInfo = ((d.a.C0476a) aVar2).f8374a;
                PublishDetailsFragment publishDetailsFragment3 = ((y) vVarU5).f241679b;
                publishDetailsFragment3.startActivity(new Intent(publishDetailsFragment3.requireContext(), (Class<?>) RealtyAddressSubmissionActivity.class).putExtra("RealtyAddressSubmissionInfo", realtyAddressSubmissionInfo));
                return;
            }
            if (aVar2 instanceof d.a.U) {
                SellerProtectionBottomSheet sellerProtectionBottomSheet = new SellerProtectionBottomSheet();
                PublishDetailsFragment publishDetailsFragment4 = ((y) vVarU5).f241679b;
                com.avito.android.lib.util.g.b(sellerProtectionBottomSheet, publishDetailsFragment4.requireContext(), publishDetailsFragment4.getChildFragmentManager(), "SELLER_PROTECTION_DIALOG_TAG");
            } else {
                if (aVar2 instanceof d.a.C14082h) {
                    ((y) vVarU5).f241680c.j0();
                    return;
                }
                if (aVar2 instanceof d.a.H) {
                    ((y) vVarU5).r4(((d.a.H) aVar2).f8344a);
                    return;
                }
                if (aVar2 instanceof d.a.C14079e) {
                    HtmlEditorViewModel htmlEditorViewModel = publishDetailsFragment.f240433R0;
                    (htmlEditorViewModel != null ? htmlEditorViewModel : null).bd(((d.a.C14079e) aVar2).f8378a);
                } else if (aVar2 instanceof d.a.C14080f) {
                    HtmlEditorViewModel htmlEditorViewModel2 = publishDetailsFragment.f240433R0;
                    (htmlEditorViewModel2 != null ? htmlEditorViewModel2 : null).a7(((d.a.C14080f) aVar2).f8379a);
                }
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Ie0.d dVar) {
            f(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends kotlin.jvm.internal.H implements Y41.l<Ie0.f, G0> {
        @Override // Y41.l
        public final G0 invoke(Ie0.f fVar) {
            ((com.avito.android.publish.screen.step.params.view.d) this.receiver).c(fVar);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends kotlin.jvm.internal.H implements Y41.l<InterfaceC14065a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14065a interfaceC14065a) {
            ((J) this.receiver).accept(interfaceC14065a);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class j extends kotlin.jvm.internal.H implements Y41.l<InterfaceC14065a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14065a interfaceC14065a) {
            ((J) this.receiver).accept(interfaceC14065a);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class k extends kotlin.jvm.internal.H implements Y41.l<InterfaceC14065a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14065a interfaceC14065a) {
            ((J) this.receiver).accept(interfaceC14065a);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/screen/step/params/PublishDetailsFragment$l", "Lcom/avito/android/photo_list_view/s$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements s.a {
        public l() {
        }

        @Override // com.avito.android.photo_list_view.s.a
        public final void P3(@Y61.k com.avito.android.photo_list_view.G g12) {
            PublishDetailsFragment publishDetailsFragment = PublishDetailsFragment.this;
            InterfaceC28373a interfaceC28373a = publishDetailsFragment.f240418C0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            C50213a c50213a = publishDetailsFragment.f240419D0;
            interfaceC28373a.c(new Cd0.G0(c50213a != null ? c50213a : null));
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m extends N implements Y41.a<String> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return PublishDetailsFragment.this.requireArguments().getString("key_slot_with_step_config_id");
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f240458m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Y41.l lVar) {
            super(0);
            this.f240458m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(PublishDetailsFragment.this, this.f240458m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<Fragment> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PublishDetailsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f240460l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.f240460l = oVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f240460l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f240461l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f240461l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f240461l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f240462l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f240462l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f240462l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class s extends N implements Y41.a<Integer> {
        public s() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(PublishDetailsFragment.this.requireArguments().getInt("step_index"));
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/publish/screen/step/params/J;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/publish/screen/step/params/J;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.l<C23060r0, J> {
        public t() {
            super(1);
        }

        @Override // Y41.l
        public final J invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            J.b bVar = PublishDetailsFragment.this.f240436U0;
            if (bVar == null) {
                bVar = null;
            }
            return bVar.a(c23060r02);
        }
    }

    public PublishDetailsFragment() {
        n nVar = new n(new t());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new p(new o()));
        this.f240437V0 = new O0(m0.f406844a.b(J.class), new q(interfaceC42726CB), nVar, new r(interfaceC42726CB));
        this.f240442a1 = C42727D.c(new c());
        this.f240443b1 = C42727D.c(new m());
        this.f240444c1 = C42727D.c(new s());
        this.f240445d1 = C42727D.c(new d());
    }

    @Override // com.avito.android.photo_list_view.x
    public final void A2(int i12, @Y61.l String str, @Y61.l String str2) {
        ((y) u5()).A2(i12, str, str2);
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        return null;
    }

    @Override // com.avito.android.publish.photo_picker.c
    public final void E2(@Y61.k String str) {
        ((y) u5()).E2(str);
    }

    @Override // com.avito.android.publish.photo_picker.c
    public final void I2(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k List list, boolean z12) {
        ((y) u5()).I2(str, str2, str3, list, z12);
    }

    @Override // Id0.c
    public final int K1() {
        Q1 q12 = this.f240435T0;
        if (q12 == null) {
            q12 = null;
        }
        return q12.B().invoke().booleanValue() ? R.layout.publish_details_actions_re23 : R.layout.publish_details_actions;
    }

    @Override // com.avito.android.publish.view.a.b
    public final void K2(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        ((y) u5()).K2(deepLink, null);
    }

    @Override // com.avito.android.publish.view.i.a
    public final void L0() {
        ((y) u5()).L0();
    }

    @Override // com.avito.android.publish.view.i.a
    public final void M2() {
        ((y) u5()).M2();
    }

    @Override // iN0.InterfaceC41321b
    public final void W(@Y61.k String str) {
        C43490a.a(requireContext(), new ToastBarState(com.avito.android.printable_text.b.f(str), null, null, null, null, null, null, 0, false, false, null, null, 4094, null), null, 28);
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return null;
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        return new gj.o(new o.a(requireView(), ToastBarPosition.f181047e), new o.a(requireView(), ToastBarPosition.f181046d));
    }

    @Override // iN0.InterfaceC41321b
    public final void c2(@Y61.l Integer num) {
        InterfaceC33535v interfaceC33535v = this.f240425J0;
        if (interfaceC33535v == null) {
            interfaceC33535v = null;
        }
        C0 c02 = this.f240434S0;
        interfaceC33535v.g0(num, (c02 != null ? c02 : null).Be());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        C33864h0 c33864h0 = this.f240424I0;
        if (c33864h0 != null) {
            return c33864h0;
        }
        return null;
    }

    @Override // Id0.c
    public final void g2() {
        H2 h22 = this.f240450i1;
        if (h22 != null) {
            h22.dispose();
        }
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        v5().accept(new InterfaceC14065a.d.C14075b(false, 1, null));
        return true;
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        Theme.Companion companion = Theme.INSTANCE;
        C0 c02 = this.f240434S0;
        if (c02 == null) {
            c02 = null;
        }
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(companion.isAvitoRe23(c02.ve()) ? R.style.RedesignPublishTheme : R.style.DefaultPublishTheme));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f240441Z0 = (InterfaceC33777o1) context;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.publish.screen.step.params.view.actions.l lVar = this.f240431P0;
        if (lVar == null) {
            lVar = null;
        }
        com.avito.android.publish.details.auction.d dVar = this.f240422G0;
        if (dVar == null) {
            dVar = null;
        }
        lVar.f(dVar);
        com.avito.android.publish.analytics.E e12 = this.f240420E0;
        if (e12 == null) {
            e12 = null;
        }
        e12.b();
        InterfaceC36014j interfaceC36014j = this.f240440Y0;
        (interfaceC36014j != null ? interfaceC36014j : null).e(requireContext());
        SellerProtectionBottomSheet.a aVar = SellerProtectionBottomSheet.f234925h0;
        e eVar = new e();
        aVar.getClass();
        getChildFragmentManager().p0("seller_protection_request_key", this, new com.avito.android.publish.details.seller_protection.b(eVar));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f240439X0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.publish_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.publish.analytics.E e12 = this.f240420E0;
        if (e12 == null) {
            e12 = null;
        }
        e12.a();
        InterfaceC36014j interfaceC36014j = this.f240440Y0;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.d();
        this.f240449h1 = null;
        this.f240447f1 = null;
        this.f240446e1 = null;
    }

    @Override // com.avito.android.details.SelectItemBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        v5().accept(InterfaceC14065a.d.f.f8306a);
        InterfaceC14698b interfaceC14698b = this.f240423H0;
        if (interfaceC14698b == null) {
            interfaceC14698b = null;
        }
        interfaceC14698b.destroy();
        com.avito.android.publish.details.computer_vision.a aVar = ((y) u5()).f241688k;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c();
        com.avito.android.publish.screen.step.params.view.j jVar = this.f240448g1;
        if (jVar != null) {
            com.avito.android.publish.screen.step.params.view.i iVar = jVar.f241616n;
            if (iVar != null) {
                iVar.f241599l.dispose();
                iVar.f241590c.e0();
                iVar.f241588a.removeOnLayoutChangeListener(iVar.f241598k);
            }
            jVar.f241616n = null;
            N0 n02 = jVar.f241617o;
            if (n02 != null) {
                n02.b();
            }
            jVar.f241617o = null;
        }
        this.f240448g1 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f240441Z0 = null;
        super.onDetach();
    }

    @Override // com.avito.android.publish.view.ItemDetailsBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC16992a interfaceC16992a = this.f240428M0;
        if (interfaceC16992a == null) {
            interfaceC16992a = null;
        }
        interfaceC16992a.onResume();
        C0 c02 = this.f240434S0;
        C0 c03 = c02 != null ? c02 : null;
        boolean z12 = c03.f231883u0;
        c03.f231883u0 = false;
        if (z12) {
            v5().accept(InterfaceC14065a.d.q.f8317a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.publish.screen.step.params.view.b bVar = this.f240447f1;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Set<TV0.d<?, ?>> set = this.f240432Q0;
        if (set == null) {
            set = null;
        }
        com.avito.android.publish.details.D d12 = bVar.f241584b;
        if (d12 == null) {
            d12 = null;
        }
        d12.A(bVar.f241585c);
        com.avito.android.publish.details.D d13 = bVar.f241584b;
        if (d13 == null) {
            d13 = null;
        }
        d13.a(set);
        y yVar = (y) u5();
        ((com.avito.android.photo_permission.a) yVar.f241669H.getValue()).c(yVar);
        com.avito.android.publish.details.auction.d dVar = yVar.f241691n;
        (dVar != null ? dVar : null).b3(yVar);
    }

    @Override // com.avito.android.publish.view.ItemDetailsBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.avito.android.publish.screen.step.params.view.b bVar = this.f240447f1;
        if (bVar != null) {
            com.avito.android.publish.details.D d12 = bVar.f241584b;
            if (d12 == null) {
                d12 = null;
            }
            d12.c0();
        }
        y yVar = (y) u5();
        com.avito.android.publish.details.auction.d dVar = yVar.f241691n;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c0();
        com.avito.android.publish.details.iac.e eVar = yVar.f241696s;
        (eVar != null ? eVar : null).dismiss();
    }

    @Override // com.avito.android.publish.view.ItemDetailsBaseFragment, com.avito.android.details.SelectItemBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        RecyclerView.Adapter<?> adapter = this.f240429N0;
        RecyclerView.Adapter<?> adapter2 = adapter != null ? adapter : null;
        com.avito.android.recycler.data_aware.c cVar = this.f240430O0;
        com.avito.android.recycler.data_aware.c cVar2 = cVar != null ? cVar : null;
        f fVar = new f(1, v5(), J.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        InterfaceC28373a interfaceC28373a = this.f240418C0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        Q1 q12 = this.f240435T0;
        Q1 q13 = q12 != null ? q12 : null;
        boolean zBooleanValue = ((Boolean) this.f240445d1.getValue()).booleanValue();
        C0 c02 = this.f240434S0;
        if (c02 == null) {
            c02 = null;
        }
        Boolean boolQe = c02.qe();
        boolean zBooleanValue2 = boolQe != null ? boolQe.booleanValue() : false;
        C0 c03 = this.f240434S0;
        if (c03 == null) {
            c03 = null;
        }
        boolean zMe = c03.me();
        com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar = this.f240421F0;
        this.f240448g1 = new com.avito.android.publish.screen.step.params.view.j(viewGroup, adapter2, cVar2, fVar, interfaceC28373a2, q13, zBooleanValue, zBooleanValue2, zMe, 150L, dVar != null ? dVar : null);
        v5().accept(InterfaceC14065a.d.C0474a.f8301a);
        ScreenPerformanceTracker screenPerformanceTracker = this.f240439X0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        gj.n nVar = this.f240427L0;
        if (nVar == null) {
            nVar = null;
        }
        ((com.avito.android.beduin.view.c) gj.m.a(nVar, this)).l(v5().f240411O);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f240439X0;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        J jV5 = v5();
        g gVar = new g(1, this, PublishDetailsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsOneTimeEvent;)V", 0);
        com.avito.android.publish.screen.step.params.view.j jVar = this.f240448g1;
        if (jVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker3, jV5, gVar, new h(1, jVar, com.avito.android.publish.screen.step.params.view.d.class, "render", "render(Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsState;)V", 0));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.publish.screen.step.params.q(this, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.publish.screen.step.params.r(this, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.publish.screen.step.params.s(this, null), 3);
        com.avito.android.publish.screen.step.params.p pVar = this.f240449h1;
        if (pVar != null) {
            C43259k.d(C22981N.a(pVar.f241516a.getLifecycle()), null, null, new C34047b(pVar, null), 3);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        InterfaceC42726C interfaceC42726C = this.f240445d1;
        boolean zBooleanValue = ((Boolean) interfaceC42726C.getValue()).booleanValue();
        C33735p c33735p = new C33735p(zBooleanValue, com.avito.android.analytics.screens.s.c(this));
        InterfaceC42726C interfaceC42726C2 = this.f240442a1;
        C33921d c33921d = new C33921d((String) interfaceC42726C2.getValue(), this, new l());
        C14190a c14190a = new C14190a(this);
        b.a aVarA = com.avito.android.publish.screen.step.params.di.a.a();
        Resources resources = getResources();
        InterfaceC42726C interfaceC42726C3 = this.f240444c1;
        com.avito.android.publish.screen.step.params.di.b bVarA = aVarA.a(resources, ((Number) interfaceC42726C3.getValue()).intValue(), (String) this.f240443b1.getValue(), ((Boolean) interfaceC42726C.getValue()).booleanValue(), this, c14190a, c33921d, c33735p, (com.avito.android.publish.screen.step.params.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.screen.step.params.di.c.class), cv.c.b(this));
        bVarA.a(this);
        InterfaceC33777o1 interfaceC33777o1 = this.f240441Z0;
        if (interfaceC33777o1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        y yVar = new y(this, interfaceC33777o1, (String) interfaceC42726C2.getValue(), ((Number) interfaceC42726C3.getValue()).intValue(), new i(1, v5(), J.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        bVarA.c(yVar);
        this.f240446e1 = yVar;
        com.avito.android.publish.screen.step.params.view.b bVar = new com.avito.android.publish.screen.step.params.view.b(new j(1, v5(), J.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        bVarA.b(bVar);
        this.f240447f1 = bVar;
        C33864h0 c33864h0 = this.f240424I0;
        C33864h0 c33864h02 = c33864h0 != null ? c33864h0 : null;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f240426K0;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = aVar != null ? aVar : null;
        InterfaceC33535v interfaceC33535v = this.f240425J0;
        InterfaceC33535v interfaceC33535v2 = interfaceC33535v != null ? interfaceC33535v : null;
        C0 c02 = this.f240434S0;
        C0 c03 = c02 != null ? c02 : null;
        com.avito.android.details.b bVar2 = this.f135892n0;
        com.avito.android.details.b bVar3 = bVar2 != null ? bVar2 : null;
        com.avito.android.publish.screen.step.params.view.actions.l lVar = this.f240431P0;
        this.f240449h1 = new com.avito.android.publish.screen.step.params.p(this, c33864h02, aVar2, interfaceC33535v2, c03, bVar3, lVar != null ? lVar : null, new k(1, v5(), J.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker = this.f240439X0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        Pd0.v vVar = this.f240438W0;
        if (vVar == null) {
            vVar = null;
        }
        vVar.u(g5(), this);
        Bundle arguments = getArguments();
        ScreenTransfer screenTransfer = (ScreenTransfer) (arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("SCREEN_TRANSFER_KEY", ScreenTransfer.class) : arguments.getParcelable("SCREEN_TRANSFER_KEY"));
        if (screenTransfer != null) {
            Pd0.v vVar2 = this.f240438W0;
            (vVar2 != null ? vVar2 : null).b(screenTransfer, zBooleanValue ? EditParametersScreen.f90347d : PublishParametersScreen.f90455d, com.avito.android.analytics.screens.s.c(this));
        }
    }

    @Override // gj.i
    public final void t0() {
        i0();
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        com.avito.android.publish.screen.step.params.view.j jVar = this.f240448g1;
        if (jVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.publish.screen.step.params.view.actions.l lVar = this.f240431P0;
        jVar.f241616n = new com.avito.android.publish.screen.step.params.view.i(jVar, jVar.f241603a, view, jVar.f241607e, lVar != null ? lVar : null, jVar.f241605c);
        jVar.f241617o = new N0(jVar.f241603a);
        this.f240450i1 = K2.a(requireActivity(), new b());
        InterfaceC16992a interfaceC16992a = this.f240428M0;
        if (interfaceC16992a == null) {
            interfaceC16992a = null;
        }
        if (interfaceC16992a.b()) {
            Q1 q12 = this.f240435T0;
            Q1 q13 = q12 != null ? q12 : null;
            q13.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[51];
            if (((Boolean) q13.f67473Y.a().invoke()).booleanValue()) {
                D6.w(view);
            }
        }
    }

    public final void t5(@Y61.k InterfaceC14065a.d dVar) {
        v5().accept(dVar);
    }

    public final v u5() {
        y yVar = this.f240446e1;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final J v5() {
        return (J) this.f240437V0.getValue();
    }

    @Override // com.avito.android.publish.view.ItemDetailsBaseFragment
    public final void s5(int i12, int i13, @Y61.l Intent intent) {
    }
}
