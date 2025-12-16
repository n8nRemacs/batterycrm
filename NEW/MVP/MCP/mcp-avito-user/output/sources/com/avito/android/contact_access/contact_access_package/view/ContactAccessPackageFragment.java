package com.avito.android.contact_access.contact_access_package.view;

import Cd.r;
import Dr.AbstractC13434a;
import Fr.InterfaceC13828a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.contact_access.contact_access_package.domain.ContactAccessPackage;
import com.avito.android.contact_access.contact_access_package.domain.CurrentPackageBalance;
import com.avito.android.contact_access.contact_access_package.domain.CurrentPackageSwitchPaymentAction;
import com.avito.android.contact_access.contact_access_package.mvi.d;
import com.avito.android.contact_access.contact_access_package.mvi.entity.ContactAccessPackageState;
import com.avito.android.contact_access.di.access.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.L5;
import iR.C41336a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import yV.C50177a;
import z1.AbstractC50339a;

/* compiled from: ContactAccessPackageFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/view/ContactAccessPackageFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "ResultType", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactAccessPackageFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.contact_access.contact_access_package.view.f f125917h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f125918i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public d.a f125919j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final O0 f125920k0;

    /* renamed from: l0, reason: collision with root package name */
    @k
    public ResultType f125921l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public DeepLink f125922m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public a.b f125923n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public View f125924o0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContactAccessPackageFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/view/ContactAccessPackageFragment$ResultType;", "", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultType {

        /* renamed from: c, reason: collision with root package name */
        public static final ResultType f125925c;

        /* renamed from: d, reason: collision with root package name */
        public static final ResultType f125926d;

        /* renamed from: e, reason: collision with root package name */
        public static final ResultType f125927e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ResultType[] f125928f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f125929g;

        /* renamed from: b, reason: collision with root package name */
        public final int f125930b;

        static {
            ResultType resultType = new ResultType("EmptyResult", 0, 1);
            f125925c = resultType;
            ResultType resultType2 = new ResultType("NeedUpdate", 1, 2);
            f125926d = resultType2;
            ResultType resultType3 = new ResultType("SwitchPayment", 2, 3);
            f125927e = resultType3;
            ResultType[] resultTypeArr = {resultType, resultType2, resultType3};
            f125928f = resultTypeArr;
            f125929g = kotlin.enums.c.a(resultTypeArr);
        }

        public ResultType(String str, int i12, int i13) {
            this.f125930b = i13;
        }

        public static ResultType valueOf(String str) {
            return (ResultType) Enum.valueOf(ResultType.class, str);
        }

        public static ResultType[] values() {
            return (ResultType[]) f125928f.clone();
        }
    }

    /* compiled from: ContactAccessPackageFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<AbstractC13434a, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC13434a abstractC13434a) {
            ((ContactAccessPackageFragment) this.receiver).f5(abstractC13434a);
            return G0.f406611a;
        }
    }

    /* compiled from: ContactAccessPackageFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/mvi/entity/ContactAccessPackageState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/contact_access/contact_access_package/mvi/entity/ContactAccessPackageState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<ContactAccessPackageState, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContactAccessPackageState contactAccessPackageState) {
            View view;
            int i12;
            ContactAccessPackageState contactAccessPackageState2 = contactAccessPackageState;
            ContactAccessPackageFragment contactAccessPackageFragment = ContactAccessPackageFragment.this;
            a.b bVar = contactAccessPackageFragment.f125923n0;
            if (bVar == null || (view = contactAccessPackageFragment.f125924o0) == null) {
                contactAccessPackageFragment.dismiss();
            } else {
                Spinner spinner = (Spinner) view.findViewById(R.id.loading_progress);
                View viewFindViewById = view.findViewById(R.id.content);
                TextView textView = (TextView) view.findViewById(R.id.count_details);
                ProgressBarRe23 progressBarRe23 = (ProgressBarRe23) view.findViewById(R.id.placement_progress);
                TextView textView2 = (TextView) view.findViewById(R.id.details);
                if (contactAccessPackageState2.f125894c) {
                    D6.w(viewFindViewById);
                    D6.H(spinner);
                } else {
                    ContactAccessPackage contactAccessPackage = contactAccessPackageState2.f125893b;
                    if (contactAccessPackage != null) {
                        D6.w(spinner);
                        bVar.setTitle(contactAccessPackage.f125866g);
                        bVar.setSubtitle(contactAccessPackage.f125864e);
                        bVar.H3(new com.avito.android.contact_access.contact_access_package.view.a(contactAccessPackageFragment));
                        bVar.J3();
                        bVar.setButtonsOrientation(1);
                        bVar.L3(contactAccessPackage.f125862c.f125872d, new com.avito.android.contact_access.contact_access_package.view.b(contactAccessPackageFragment));
                        CurrentPackageSwitchPaymentAction currentPackageSwitchPaymentAction = contactAccessPackage.f125865f;
                        if ((currentPackageSwitchPaymentAction != null ? currentPackageSwitchPaymentAction.f125873b : null) != null) {
                            bVar.M3(currentPackageSwitchPaymentAction.f125874c, new com.avito.android.contact_access.contact_access_package.view.c(contactAccessPackageFragment));
                        }
                        CurrentPackageBalance currentPackageBalance = contactAccessPackage.f125861b;
                        if (currentPackageBalance == null) {
                            D6.w(viewFindViewById);
                        } else {
                            D6.H(viewFindViewById);
                            textView.setText(currentPackageBalance.f125869d);
                            I5.a(textView2, currentPackageBalance.f125868c, false);
                            Long l12 = currentPackageBalance.f125867b;
                            if (l12 == null) {
                                D6.w(progressBarRe23);
                            } else {
                                D6.H(progressBarRe23);
                                C50177a.C12902a c12902a = C50177a.f443122g;
                                Context context = progressBarRe23.getContext();
                                Context context2 = progressBarRe23.getContext();
                                int iLongValue = (int) l12.longValue();
                                if (iLongValue < 0 || iLongValue >= 21) {
                                    if (21 <= iLongValue) {
                                    }
                                    i12 = R.attr.progressBarSuccessMedium;
                                } else {
                                    i12 = R.attr.progressBarErrorMedium;
                                }
                                int iJ2 = C35835l0.j(i12, context2);
                                c12902a.getClass();
                                progressBarRe23.setStyle(C50177a.C12902a.b(iJ2, context));
                                progressBarRe23.setProgress(l12.longValue() / 100.0f);
                            }
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ContactAccessPackageFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ContextThemeWrapper f125932l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ContactAccessPackageFragment f125933m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContextThemeWrapper contextThemeWrapper, ContactAccessPackageFragment contactAccessPackageFragment) {
            super(2);
            this.f125932l = contextThemeWrapper;
            this.f125933m = contactAccessPackageFragment;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            View viewInflate = LayoutInflater.from(this.f125932l).inflate(R.layout.cv_paid_choose_package, (ViewGroup) null);
            bVar2.setCustomView(viewInflate);
            bVar2.J3();
            ContactAccessPackageFragment contactAccessPackageFragment = this.f125933m;
            contactAccessPackageFragment.f125923n0 = bVar2;
            contactAccessPackageFragment.f125924o0 = viewInflate;
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f125935m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f125935m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(ContactAccessPackageFragment.this, this.f125935m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ContactAccessPackageFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f125937l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f125937l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f125937l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f125938l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f125938l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f125938l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f125939l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f125939l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f125939l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ContactAccessPackageFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/contact_access/contact_access_package/mvi/d;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/contact_access/contact_access_package/mvi/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<C23060r0, com.avito.android.contact_access.contact_access_package.mvi.d> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.contact_access.contact_access_package.mvi.d invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            d.a aVar = ContactAccessPackageFragment.this.f125919j0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public ContactAccessPackageFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f125920k0 = new O0(m0.f406844a.b(com.avito.android.contact_access.contact_access_package.mvi.d.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f125921l0 = ResultType.f125925c;
    }

    public final void f5(AbstractC13434a abstractC13434a) {
        if (abstractC13434a instanceof AbstractC13434a.d) {
            String strK0 = ((AbstractC13434a.d) abstractC13434a).f3477a.k0(requireContext());
            Context context = getContext();
            if (context != null) {
                L5.b(context, strK0, 1);
                return;
            }
            return;
        }
        if (abstractC13434a instanceof AbstractC13434a.C0197a) {
            AbstractC13434a.C0197a c0197a = (AbstractC13434a.C0197a) abstractC13434a;
            this.f125921l0 = c0197a.f3473a ? ResultType.f125926d : c0197a.f3474b != null ? ResultType.f125927e : ResultType.f125925c;
            this.f125922m0 = c0197a.f3474b;
            dismiss();
            return;
        }
        if (abstractC13434a instanceof AbstractC13434a.b) {
            for (AbstractC13434a abstractC13434a2 : ((AbstractC13434a.b) abstractC13434a).f3475a) {
                if (!(abstractC13434a2 instanceof AbstractC13434a.b)) {
                    f5(abstractC13434a2);
                }
            }
            return;
        }
        if (abstractC13434a instanceof AbstractC13434a.c) {
            CharSequence text = requireContext().getText(R.string.contact_access_purchase_success);
            Context context2 = getContext();
            if (context2 != null) {
                L5.b(context2, text, 1);
            }
        }
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("key_item_id");
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("key_should_to_show_toast", true) : true;
        Bundle arguments2 = getArguments();
        boolean z13 = arguments2 != null ? arguments2.getBoolean("check_employee_balance_for_cv", false) : false;
        a.InterfaceC3742a interfaceC3742aA = com.avito.android.contact_access.di.access.i.a();
        interfaceC3742aA.d((InterfaceC13828a) C29972i.a(C29972i.b(this), InterfaceC13828a.class));
        interfaceC3742aA.a(cv.c.b(this));
        interfaceC3742aA.r(string);
        interfaceC3742aA.c(bundle);
        interfaceC3742aA.e(s.b(this));
        interfaceC3742aA.b(getResources());
        interfaceC3742aA.f(z12);
        interfaceC3742aA.g(z13);
        interfaceC3742aA.build().a(this);
        com.avito.android.contact_access.contact_access_package.view.f fVar = this.f125917h0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.e();
        com.avito.android.contact_access.contact_access_package.view.f fVar2 = this.f125917h0;
        (fVar2 != null ? fVar2 : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    @SuppressLint({"InflateParams"})
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Dialog_Re23));
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, contextThemeWrapperB, new c(contextThemeWrapperB, this));
        com.avito.android.arch.mvi.android.f.a((com.avito.android.contact_access.contact_access_package.mvi.d) this.f125920k0.getValue(), this, Lifecycle.State.f46682e, new a(1, this, ContactAccessPackageFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/contact_access/contact_access_package/mvi/entity/ContactAccessOneTimeEvent;)V", 0), new b());
        com.avito.android.contact_access.contact_access_package.view.f fVar = this.f125917h0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.d();
        return aVarC;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        C41336a.C11375a.a();
        super.onDismiss(dialogInterface);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putInt("contact_access_package_fragment_result_argument", this.f125921l0.f125930b);
        DeepLink deepLink = this.f125922m0;
        if (deepLink != null) {
            bundle.putParcelable("contact_access_package_fragment_switch_payment_argument", deepLink);
        }
        G0 g02 = G0.f406611a;
        parentFragmentManager.o0(bundle, "contact_access_package_fragment_result");
    }
}
