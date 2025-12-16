package com.avito.android.rating_form.step.dialog;

import Cd.C13243a;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: FullscreenDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/FullscreenDialogFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/rating_form/h;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FullscreenDialogFragment extends BaseFragment implements InterfaceC28477j.a, com.avito.android.rating_form.h {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f249371s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f249372n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f249373o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f249374p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f249375q0;

    /* renamed from: r0, reason: collision with root package name */
    public com.avito.android.rating_form.step.dialog.i f249376r0;

    /* compiled from: FullscreenDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/FullscreenDialogFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "KEY_DIALOG_INFO", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: FullscreenDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating_form.step.dialog.FullscreenDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C7487a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RatingFormStepArguments f249377l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ DialogInfo f249378m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7487a(RatingFormStepArguments ratingFormStepArguments, DialogInfo dialogInfo) {
                super(1);
                this.f249377l = ratingFormStepArguments;
                this.f249378m = dialogInfo;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("key_arguments", this.f249377l);
                bundle2.putParcelable("key_dialog_info", this.f249378m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static FullscreenDialogFragment a(@Y61.k RatingFormStepArguments ratingFormStepArguments, @Y61.k DialogInfo dialogInfo) {
            FullscreenDialogFragment fullscreenDialogFragment = new FullscreenDialogFragment();
            C35966w1.a(fullscreenDialogFragment, -1, new C7487a(ratingFormStepArguments, dialogInfo));
            return fullscreenDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: FullscreenDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<PrintableText, G0> {
        @Override // Y41.l
        public final G0 invoke(PrintableText printableText) {
            PrintableText printableText2 = printableText;
            FullscreenDialogFragment fullscreenDialogFragment = (FullscreenDialogFragment) this.receiver;
            a aVar = FullscreenDialogFragment.f249371s0;
            fullscreenDialogFragment.getClass();
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.c(cVar, fullscreenDialogFragment, printableText2, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
            return G0.f406611a;
        }
    }

    /* compiled from: FullscreenDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<String, G0> {
        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            invoke2(str);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Y61.k String str) {
            FullscreenDialogFragment fullscreenDialogFragment = (FullscreenDialogFragment) this.receiver;
            InterfaceC35845m2 interfaceC35845m2 = fullscreenDialogFragment.f249375q0;
            if (interfaceC35845m2 == null) {
                interfaceC35845m2 = null;
            }
            C35966w1.g(fullscreenDialogFragment, interfaceC35845m2.u(Uri.parse(str), (6 & 2) == 0, (6 & 4) == 0), new n(fullscreenDialogFragment));
        }
    }

    /* compiled from: FullscreenDialogFragment.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Integer, View> {
        @Override // Y41.l
        public final View invoke(Integer num) {
            View viewFindViewById = ((View) this.receiver).findViewById(num.intValue());
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: FullscreenDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/TextView;", "it", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f249379l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(1);
            this.f249379l = view;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            TextView textView2 = textView;
            LinearLayout linearLayout = (LinearLayout) this.f249379l.findViewById(R.id.frame);
            textView2.setGravity(17);
            linearLayout.addView(textView2, 0);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f249380l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f249380l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f249380l);
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
            return FullscreenDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f249382l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f249382l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f249382l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f249383l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f249383l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f249383l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f249384l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f249384l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f249384l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FullscreenDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating_form/step/dialog/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<l> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = FullscreenDialogFragment.this.f249372n0;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    public FullscreenDialogFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f249373o0 = new O0(m0.f406844a.b(l.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fullscreen_dialog_layout, viewGroup, false);
        Context contextRequireContext = requireContext();
        l lVar = (l) this.f249373o0.getValue();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f249374p0;
        if (aVar == null) {
            aVar = null;
        }
        this.f249376r0 = new com.avito.android.rating_form.step.dialog.i(contextRequireContext, lVar, this, aVar, new b(1, this, FullscreenDialogFragment.class, "showErrorToast", "showErrorToast(Lcom/avito/android/printable_text/PrintableText;)V", 0), new c(1, this, FullscreenDialogFragment.class, "openUrl", "openUrl(Ljava/lang/String;)V", 0), null);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.avito.android.rating_form.step.dialog.i iVar = this.f249376r0;
        if (iVar == null) {
            iVar = null;
        }
        Y41.a<G0> aVar = iVar.f249406j;
        if (aVar != null) {
            ((com.avito.android.rating_form.step.dialog.k) aVar).invoke();
        }
        super.onDestroy();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.rating_form.step.dialog.i iVar = this.f249376r0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.a(new d(1, view, D6.class, "findView", "findView(Landroid/view/View;I)Landroid/view/View;", 1), new e(view));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle bundleRequireArguments = requireArguments();
        int i12 = Build.VERSION.SDK_INT;
        Parcelable parcelable = i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_dialog_info", DialogInfo.class) : bundleRequireArguments.getParcelable("key_dialog_info");
        if (parcelable == null) {
            throw new IllegalArgumentException("Fullscreen dialog info are not provided");
        }
        DialogInfo dialogInfo = (DialogInfo) parcelable;
        Bundle bundleRequireArguments2 = requireArguments();
        Parcelable parcelable2 = i12 >= 34 ? (Parcelable) bundleRequireArguments2.getParcelable("key_arguments", RatingFormStepArguments.class) : bundleRequireArguments2.getParcelable("key_arguments");
        if (parcelable2 == null) {
            throw new IllegalArgumentException("RatingFormStepArguments not set");
        }
        com.avito.android.rating_form.step.dialog.di.a.a().a(getF42820b(), (RatingFormStepArguments) parcelable2, dialogInfo, (com.avito.android.rating_form.di.g) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.g.class), cv.c.b(this), (com.avito.android.rating_form.di.e) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.e.class)).a(this);
    }
}
