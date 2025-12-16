package com.avito.android.verification.verification_form_builder;

import Cd.C13243a;
import TM0.a;
import TM0.b;
import TM0.c;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.verification.inn.list.Hidable;
import com.avito.android.verification.inn.list.select.SelectItem;
import com.avito.android.verification.links.download.VerificationDownloadLink;
import com.avito.android.verification.verification_form_builder.FormBuilderFragment;
import com.avito.android.verification.verification_form_builder.FormBuilderScreenData;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import xM0.C49864d;
import z1.AbstractC50339a;

/* compiled from: FormBuilderFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormBuilderFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f325335u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public r f325336n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f325337o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f325338p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f325339q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f325340r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public m f325341s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final b f325342t0;

    /* compiled from: FormBuilderFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/FormBuilderFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_FORM_BUILDER_ARGS", "Ljava/lang/String;", "TAG_VERIFICATION_SELECT_FRAGMENT", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FormBuilderFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<TM0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(TM0.a aVar) {
            ((q) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: FormBuilderFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<TM0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(TM0.b bVar) {
            TM0.b bVar2 = bVar;
            FormBuilderFragment formBuilderFragment = (FormBuilderFragment) this.receiver;
            a aVar = FormBuilderFragment.f325335u0;
            formBuilderFragment.getClass();
            if (L.f(bVar2, b.a.f15619a)) {
                formBuilderFragment.requireActivity().getF21241d().c();
            } else if (L.f(bVar2, b.C1066b.f15620a)) {
                formBuilderFragment.requireActivity().finish();
            } else if (bVar2 instanceof b.d) {
                m mVar = formBuilderFragment.f325341s0;
                if (mVar != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    f.c.f125255c.getClass();
                    f.c cVarB = f.c.a.b();
                    ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                    com.avito.android.component.toast.c.b(cVar, mVar.f325407i, ((b.d) bVar2).f15622a, null, null, null, cVarB, 0, toastBarPosition, null, false, false, null, null, 4014);
                }
            } else if (bVar2 instanceof b.c) {
                com.avito.android.select.bottom_sheet.c.a(formBuilderFragment, ((b.c) bVar2).f15621a).show(formBuilderFragment.getParentFragmentManager(), "tag.verification_select_fragment");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FormBuilderFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTM0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LTM0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<TM0.c, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(TM0.c cVar) throws Resources.NotFoundException {
            FormBuilderScreenData formBuilderScreenData;
            G0 g02;
            int i12;
            TM0.c cVar2 = cVar;
            FormBuilderFragment formBuilderFragment = FormBuilderFragment.this;
            final m mVar = formBuilderFragment.f325341s0;
            if (mVar != null) {
                boolean z12 = cVar2 instanceof c.b;
                NavBar navBar = mVar.f325407i;
                C49864d c49864d = mVar.f325408j;
                if (z12) {
                    FormBuilderScreenData formBuilderScreenData2 = ((c.b) cVar2).f15624b;
                    AttributedText attributedText = formBuilderScreenData2.f325352c;
                    if (attributedText != null) {
                        final int i13 = 0;
                        attributedText.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.verification.verification_form_builder.j
                            @Override // com.avito.android.deep_linking.links.w
                            public final void i7(DeepLink deepLink) {
                                m mVar2 = mVar;
                                switch (i13) {
                                    case 0:
                                        int i14 = m.f325398k;
                                        mVar2.f325402d.invoke(new a.b(deepLink));
                                        break;
                                    default:
                                        int i15 = m.f325398k;
                                        mVar2.f325402d.invoke(new a.b(deepLink));
                                        break;
                                }
                            }
                        });
                    }
                    AttributedText attributedText2 = formBuilderScreenData2.f325351b;
                    if (attributedText2 != null) {
                        final int i14 = 1;
                        attributedText2.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.verification.verification_form_builder.j
                            @Override // com.avito.android.deep_linking.links.w
                            public final void i7(DeepLink deepLink) {
                                m mVar2 = mVar;
                                switch (i14) {
                                    case 0:
                                        int i142 = m.f325398k;
                                        mVar2.f325402d.invoke(new a.b(deepLink));
                                        break;
                                    default:
                                        int i15 = m.f325398k;
                                        mVar2.f325402d.invoke(new a.b(deepLink));
                                        break;
                                }
                            }
                        });
                    }
                    com.avito.android.util.text.j.a(mVar.f325406h, attributedText2, null);
                    com.avito.android.util.text.j.a(mVar.f325405g, formBuilderScreenData2.f325352c, null);
                    navBar.c(formBuilderScreenData2.f325353d ? R.attr.ic_close24 : R.attr.ic_arrowBack24, new n(mVar));
                    Button button = mVar.f325404f;
                    final FormBuilderScreenData.Button button2 = formBuilderScreenData2.f325350a;
                    if (button2 != null) {
                        int iOrdinal = button2.f325358c.ordinal();
                        if (iOrdinal == 0) {
                            i12 = R.attr.buttonDefaultLarge;
                        } else if (iOrdinal == 1) {
                            i12 = R.attr.buttonPrimaryLarge;
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i12 = R.attr.buttonSecondaryLarge;
                        }
                        button.setAppearance(C35835l0.j(i12, button.getContext()));
                        com.avito.android.lib.design.button.b.a(button, button2.f325356a, false);
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.verification.verification_form_builder.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i15 = m.f325398k;
                                ((FormBuilderFragment.c) mVar.f325402d).invoke(new a.C1065a(button2));
                            }
                        });
                        button.setLoading(button2.f325359d);
                        g02 = G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 == null) {
                        D6.w(button);
                    }
                    List<com.avito.conveyor_item.a> list = formBuilderScreenData2.f325354e;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
                        if (!(aVar instanceof Hidable) || ((Hidable) aVar).getF324099d() == Hidable.Hidden.f323896b) {
                            arrayList.add(obj);
                        }
                    }
                    mVar.f325401c.c(new UV0.c(arrayList));
                    mVar.f325400b.notifyDataSetChanged();
                    Integer num = formBuilderScreenData2.f325355f;
                    if (num != null) {
                        mVar.f325403e.postDelayed(new androidx.camera.video.internal.audio.q(num.intValue(), 16, mVar), 500L);
                        formBuilderScreenData2.f325355f = null;
                    }
                    c49864d.b();
                } else if (cVar2 instanceof c.C1067c) {
                    C49864d.d(c49864d);
                } else if (cVar2 instanceof c.a) {
                    D6.H(navBar);
                    C49864d.c(c49864d, o.f325480l);
                }
            }
            c.b bVar = cVar2 instanceof c.b ? (c.b) cVar2 : null;
            if (bVar != null && (formBuilderScreenData = bVar.f15624b) != null) {
                formBuilderFragment.f325342t0.d(formBuilderScreenData.f325353d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f325344l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f325344l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f325344l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return FormBuilderFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f325346l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f325346l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f325346l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325347l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325347l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f325347l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325348l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325348l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f325348l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FormBuilderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/verification/verification_form_builder/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<q> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = FormBuilderFragment.this.f325336n0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    public FormBuilderFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f325337o0 = new O0(m0.f406844a.b(q.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f325342t0 = new b();
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        final com.avito.android.deeplink_handler.view.impl.i iVar = (com.avito.android.deeplink_handler.view.impl.i) super.e5();
        return new a.g() { // from class: com.avito.android.verification.verification_form_builder.f
            @Override // com.avito.android.deeplink_handler.view.a.g
            public final void g(com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
                DeepLink deepLink;
                FormBuilderFragment.a aVar2 = FormBuilderFragment.f325335u0;
                if (aVar == null || (deepLink = aVar.f134520a) == null || !(deepLink instanceof VerificationDownloadLink)) {
                    iVar.a(z12);
                } else {
                    this.q5().accept(new a.c(deepLink, z12));
                }
            }
        };
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        q5().accept(new a.f(str, list));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f325338p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_verification_form_builder, viewGroup, false);
        com.avito.konveyor.adapter.j jVar = this.f325339q0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f325340r0;
        if (aVar == null) {
            aVar = null;
        }
        this.f325341s0 = new m(new c(1, q5(), q.class, "accept", "accept(Ljava/lang/Object;)V", 0), viewInflate, aVar, jVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f325338p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new d(1, this, FormBuilderFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderOneTimeEvent;)V", 0), new e());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f325341s0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f325342t0);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325338p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.avito.android.verification.verification_form_builder.d] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.avito.android.verification.verification_form_builder.b] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.avito.android.verification.verification_form_builder.c] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.avito.android.verification.verification_form_builder.e] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        FormBuilderArgs formBuilderArgs = (FormBuilderArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key.verification_form_builder_args", FormBuilderArgs.class) : bundleRequireArguments.getParcelable("key.verification_form_builder_args"));
        com.avito.android.verification.di.form_builder.a.a().a(s.c(this), formBuilderArgs, getResources(), new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 19), new com.avito.android.verification.verification_form_builder.a(this, 0), new com.avito.android.verification.inn.list.checkbox.d() { // from class: com.avito.android.verification.verification_form_builder.b
            @Override // com.avito.android.verification.inn.list.checkbox.d
            public final void c(com.avito.android.verification.inn.list.checkbox.a aVar) {
                FormBuilderFragment.a aVar2 = FormBuilderFragment.f325335u0;
                this.f325370b.q5().accept(new a.e(aVar));
            }
        }, new com.avito.android.verification.inn.list.select.c() { // from class: com.avito.android.verification.verification_form_builder.c
            @Override // com.avito.android.verification.inn.list.select.c
            public final void d(SelectItem selectItem) {
                FormBuilderFragment.a aVar = FormBuilderFragment.f325335u0;
                this.f325371b.q5().accept(new a.e(selectItem));
            }
        }, new com.avito.android.verification.inn.list.disclosure.d() { // from class: com.avito.android.verification.verification_form_builder.e
            @Override // com.avito.android.verification.inn.list.disclosure.d
            public final void a(com.avito.android.verification.inn.list.disclosure.a aVar) {
                FormBuilderFragment.a aVar2 = FormBuilderFragment.f325335u0;
                this.f325374b.q5().accept(new a.e(aVar));
            }
        }, new com.avito.android.verification.inn.list.inn_info.d() { // from class: com.avito.android.verification.verification_form_builder.d
            @Override // com.avito.android.verification.inn.list.inn_info.d
            public final void b(com.avito.android.verification.inn.list.inn_info.a aVar) {
                FormBuilderFragment.a aVar2 = FormBuilderFragment.f325335u0;
                this.f325372b.q5().accept(new a.e(aVar));
            }
        }, (com.avito.android.verification.di.form_builder.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.form_builder.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325338p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final q q5() {
        return (q) this.f325337o0.getValue();
    }

    /* compiled from: FormBuilderFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_form_builder/FormBuilderFragment$b", "Landroidx/activity/x;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(false);
        }

        @Override // androidx.view.x
        public final void c() {
        }
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
