package com.avito.android.extended_profile_selection_create.name;

import Cd.C13243a;
import KA.a;
import KA.b;
import KA.c;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateActivity;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameFragment;
import com.avito.android.extended_profile_ui_components.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileSetSelectionNameFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/ExtendedProfileSetSelectionNameFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileSetSelectionNameFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f151810A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f151811B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_selection_create.name.k f151812n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f151813o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f151814p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f151815q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f151816r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151817s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151818t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151819u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151820v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151821w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151822x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151823y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f151824z0;

    /* compiled from: ExtendedProfileSetSelectionNameFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/ExtendedProfileSetSelectionNameFragment$a;", "", "<init>", "()V", "", "ARGS", "Ljava/lang/String;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_selection_create/name/ExtendedProfileSetSelectionNameConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ExtendedProfileSetSelectionNameConfig> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ExtendedProfileSetSelectionNameConfig invoke() {
            Bundle bundleRequireArguments = ExtendedProfileSetSelectionNameFragment.this.requireArguments();
            return (ExtendedProfileSetSelectionNameConfig) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("extended_profile_set_selection_name.args", ExtendedProfileSetSelectionNameConfig.class) : bundleRequireArguments.getParcelable("extended_profile_set_selection_name.args"));
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<KA.b, G0> {
        public final void f(@Y61.k KA.b bVar) {
            ExtendedProfileSetSelectionNameFragment extendedProfileSetSelectionNameFragment = (ExtendedProfileSetSelectionNameFragment) this.receiver;
            a aVar = ExtendedProfileSetSelectionNameFragment.f151810A0;
            extendedProfileSetSelectionNameFragment.getClass();
            boolean z12 = bVar instanceof b.c;
            C47313c c47313c = extendedProfileSetSelectionNameFragment.f151818t0;
            if (z12) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                kotlin.reflect.n<Object> nVar = ExtendedProfileSetSelectionNameFragment.f151811B0[1];
                View view = (View) c47313c.a();
                PrintableText printableTextF = com.avito.android.printable_text.b.f(((b.c) bVar).f9342a);
                ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
                return;
            }
            if (!(bVar instanceof b.C0559b)) {
                if (bVar instanceof b.a) {
                    ExtendedProfileSelectionCreateActivity.a aVar2 = ExtendedProfileSelectionCreateActivity.f151610m;
                    Context contextRequireContext = extendedProfileSetSelectionNameFragment.requireContext();
                    aVar2.getClass();
                    Intent intentPutExtra = new Intent(contextRequireContext, (Class<?>) ExtendedProfileSelectionCreateActivity.class).putExtra("extended_profile.selection.set_selection_image_args", ((b.a) bVar).f9339a).putExtra("extended_profile.selection.screen_name", "extended_profile.selection.set_image_screen");
                    intentPutExtra.setFlags(603979776);
                    extendedProfileSetSelectionNameFragment.startActivity(intentPutExtra);
                    return;
                }
                return;
            }
            p pVar = p.f153373a;
            kotlin.reflect.n<Object> nVar2 = ExtendedProfileSetSelectionNameFragment.f151811B0[1];
            View view2 = (View) c47313c.a();
            b.C0559b c0559b = (b.C0559b) bVar;
            ScreenPerformanceTracker screenPerformanceTracker = extendedProfileSetSelectionNameFragment.f151814p0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            p.c(pVar, view2, c0559b.f9340a, screenPerformanceTracker, new com.avito.android.extended_profile_selection_create.name.b(extendedProfileSetSelectionNameFragment, c0559b.f9341b));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(KA.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKA/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LKA/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<KA.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(KA.c cVar) {
            KA.c cVar2 = cVar;
            a aVar = ExtendedProfileSetSelectionNameFragment.f151810A0;
            ExtendedProfileSetSelectionNameFragment extendedProfileSetSelectionNameFragment = ExtendedProfileSetSelectionNameFragment.this;
            Input.t(extendedProfileSetSelectionNameFragment.q5(), cVar2.f9345b, false, 6);
            C47313c c47313c = extendedProfileSetSelectionNameFragment.f151822x0;
            kotlin.reflect.n<Object>[] nVarArr = ExtendedProfileSetSelectionNameFragment.f151811B0;
            kotlin.reflect.n<Object> nVar = nVarArr[5];
            ((Checkbox) c47313c.a()).setChecked(!cVar2.f9346c);
            C47313c c47313c2 = extendedProfileSetSelectionNameFragment.f151824z0;
            kotlin.reflect.n<Object> nVar2 = nVarArr[7];
            Button button = (Button) c47313c2.a();
            boolean z12 = cVar2.f9347d;
            button.setLoading(z12);
            kotlin.reflect.n<Object> nVar3 = nVarArr[7];
            ((Button) c47313c2.a()).setClickable(!z12);
            C47313c c47313c3 = extendedProfileSetSelectionNameFragment.f151821w0;
            kotlin.reflect.n<Object> nVar4 = nVarArr[4];
            TextView textView = (TextView) c47313c3.a();
            c.b bVar = cVar2.f9348e;
            textView.setText(bVar.f9351a.k0(extendedProfileSetSelectionNameFragment.requireContext()));
            if (bVar.f9352b) {
                Input inputQ5 = extendedProfileSetSelectionNameFragment.q5();
                Input.f179303W.getClass();
                inputQ5.setState(Input.f179305b0);
                kotlin.reflect.n<Object> nVar5 = nVarArr[4];
                ((TextView) c47313c3.a()).setTextColor(C35835l0.d(R.attr.red600, extendedProfileSetSelectionNameFragment.requireContext()));
            } else {
                Input inputQ52 = extendedProfileSetSelectionNameFragment.q5();
                Input.f179303W.getClass();
                inputQ52.setState(Input.f179304a0);
                kotlin.reflect.n<Object> nVar6 = nVarArr[4];
                ((TextView) c47313c3.a()).setTextColor(C35835l0.d(R.attr.gray54, extendedProfileSetSelectionNameFragment.requireContext()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKA/a;", "it", "Lkotlin/G0;", "invoke", "(LKA/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<KA.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(KA.a aVar) {
            a aVar2 = ExtendedProfileSetSelectionNameFragment.f151810A0;
            ExtendedProfileSetSelectionNameFragment.this.r5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ExtendedProfileSetSelectionNameFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ExtendedProfileSetSelectionNameFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return ExtendedProfileSetSelectionNameFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f151831l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f151831l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f151831l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExtendedProfileSetSelectionNameFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f151833l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f151833l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f151833l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f151834l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f151834l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f151834l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f151835l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f151835l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f151835l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile_selection_create/name/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.extended_profile_selection_create.name.j> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.extended_profile_selection_create.name.j invoke() {
            com.avito.android.extended_profile_selection_create.name.k kVar = ExtendedProfileSetSelectionNameFragment.this.f151812n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.extended_profile_selection_create.name.j) kVar.get();
        }
    }

    static {
        Y y12 = new Y(ExtendedProfileSetSelectionNameFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f151811B0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionNameFragment.class, "contentView", "getContentView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionNameFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionNameFragment.class, "inputView", "getInputView()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionNameFragment.class, "hintView", "getHintView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionNameFragment.class, "hiddenCheckboxView", "getHiddenCheckboxView()Lcom/avito/android/lib/design/toggle/Checkbox;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionNameFragment.class, "hiddenCheckboxContainer", "getHiddenCheckboxContainer()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ExtendedProfileSetSelectionNameFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f151810A0 = new a(null);
    }

    public ExtendedProfileSetSelectionNameFragment() {
        super(R.layout.extended_profile_set_selection_name_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        n0 n0Var = m0.f406844a;
        this.f151813o0 = new O0(n0Var.b(com.avito.android.extended_profile_selection_create.name.j.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f151815q0 = new O0(n0Var.b(HA.e.class), new f(), new h(), new g());
        this.f151816r0 = C42727D.c(new b());
        this.f151817s0 = new C47313c(null, 1, null);
        this.f151818t0 = new C47313c(null, 1, null);
        this.f151819u0 = new C47313c(null, 1, null);
        this.f151820v0 = new C47313c(null, 1, null);
        this.f151821w0 = new C47313c(null, 1, null);
        this.f151822x0 = new C47313c(null, 1, null);
        this.f151823y0 = new C47313c(null, 1, null);
        this.f151824z0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f151814p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f151814p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new c(1, this, ExtendedProfileSetSelectionNameFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameOneTimeEvent;)V", 0), new d());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.extended_profile_set_selection_name_nav_bar);
        C47313c c47313c = this.f151817s0;
        kotlin.reflect.n<Object>[] nVarArr = f151811B0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, navBar);
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        ((NavBar) c47313c.a()).c(R.attr.ic_arrowBack24, new com.avito.android.extended_profile_selection_create.name.c(this));
        kotlin.reflect.n<Object> nVar3 = nVarArr[0];
        NavBar.e((NavBar) c47313c.a(), getString(R.string.extended_profile_set_selection_name_nav_bar_title), R.attr.textM20, 4);
        View viewFindViewById = view.findViewById(R.id.extended_profile_set_selection_name_root);
        C47313c c47313c2 = this.f151818t0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        c47313c2.b(this, viewFindViewById);
        TextView textView = (TextView) view.findViewById(R.id.extended_profile_set_selection_name_title);
        C47313c c47313c3 = this.f151819u0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[2];
        c47313c3.b(this, textView);
        Input input = (Input) view.findViewById(R.id.extended_profile_set_selection_name_input);
        C47313c c47313c4 = this.f151820v0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[3];
        c47313c4.b(this, input);
        Checkbox checkbox = (Checkbox) view.findViewById(R.id.extended_profile_set_selection_name_is_hidden_checkbox);
        C47313c c47313c5 = this.f151822x0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c5.b(this, checkbox);
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_set_selection_name_is_hidden_checkbox_container);
        C47313c c47313c6 = this.f151823y0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[6];
        c47313c6.b(this, viewFindViewById2);
        Button button = (Button) view.findViewById(R.id.extended_profile_set_selection_name_continue);
        C47313c c47313c7 = this.f151824z0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[7];
        c47313c7.b(this, button);
        TextView textView2 = (TextView) view.findViewById(R.id.extended_profile_set_selection_name_input_hint);
        C47313c c47313c8 = this.f151821w0;
        kotlin.reflect.n<Object> nVar10 = nVarArr[4];
        c47313c8.b(this, textView2);
        q5().b(new s("", new com.avito.android.extended_profile_selection_create.name.d(this)));
        q5().setOnEditorActionListener(new C27140f(this, 5));
        q5().v();
        kotlin.reflect.n<Object> nVar11 = nVarArr[6];
        View view2 = (View) c47313c6.a();
        final int i12 = 0;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.name.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionNameFragment f151839c;

            {
                this.f151839c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ExtendedProfileSetSelectionNameFragment extendedProfileSetSelectionNameFragment = this.f151839c;
                switch (i12) {
                    case 0:
                        ExtendedProfileSetSelectionNameFragment.a aVar = ExtendedProfileSetSelectionNameFragment.f151810A0;
                        C47313c c47313c9 = extendedProfileSetSelectionNameFragment.f151822x0;
                        n<Object>[] nVarArr2 = ExtendedProfileSetSelectionNameFragment.f151811B0;
                        n<Object> nVar12 = nVarArr2[5];
                        boolean zIsChecked = ((Checkbox) c47313c9.a()).isChecked();
                        n<Object> nVar13 = nVarArr2[5];
                        ((Checkbox) c47313c9.a()).setChecked(!zIsChecked);
                        extendedProfileSetSelectionNameFragment.r5().accept(new a.b(zIsChecked));
                        break;
                    default:
                        ExtendedProfileSetSelectionNameFragment.a aVar2 = ExtendedProfileSetSelectionNameFragment.f151810A0;
                        extendedProfileSetSelectionNameFragment.r5().accept(a.C0558a.f9336a);
                        break;
                }
            }
        });
        kotlin.reflect.n<Object> nVar12 = nVarArr[7];
        final int i13 = 1;
        ((Button) c47313c7.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.extended_profile_selection_create.name.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSetSelectionNameFragment f151839c;

            {
                this.f151839c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ExtendedProfileSetSelectionNameFragment extendedProfileSetSelectionNameFragment = this.f151839c;
                switch (i13) {
                    case 0:
                        ExtendedProfileSetSelectionNameFragment.a aVar = ExtendedProfileSetSelectionNameFragment.f151810A0;
                        C47313c c47313c9 = extendedProfileSetSelectionNameFragment.f151822x0;
                        n<Object>[] nVarArr2 = ExtendedProfileSetSelectionNameFragment.f151811B0;
                        n<Object> nVar122 = nVarArr2[5];
                        boolean zIsChecked = ((Checkbox) c47313c9.a()).isChecked();
                        n<Object> nVar13 = nVarArr2[5];
                        ((Checkbox) c47313c9.a()).setChecked(!zIsChecked);
                        extendedProfileSetSelectionNameFragment.r5().accept(new a.b(zIsChecked));
                        break;
                    default:
                        ExtendedProfileSetSelectionNameFragment.a aVar2 = ExtendedProfileSetSelectionNameFragment.f151810A0;
                        extendedProfileSetSelectionNameFragment.r5().accept(a.C0558a.f9336a);
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker = this.f151814p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.extended_profile_selection_create.name.di.a.a().a(this, getResources(), (ExtendedProfileSetSelectionNameConfig) this.f151816r0.getValue(), ((HA.e) this.f151815q0.getValue()).f6972E, (com.avito.android.extended_profile_selection_create.select.di.c) C29972i.a(C29972i.b(this), com.avito.android.extended_profile_selection_create.select.di.c.class), com.avito.android.analytics.screens.s.c(this), ExtendedProfileSetSelectionNameScreen.f151837d, this, new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f151814p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final Input q5() {
        C47313c c47313c = this.f151820v0;
        kotlin.reflect.n<Object> nVar = f151811B0[3];
        return (Input) c47313c.a();
    }

    public final com.avito.android.extended_profile_selection_create.name.j r5() {
        return (com.avito.android.extended_profile_selection_create.name.j) this.f151813o0.getValue();
    }
}
