package com.avito.android.mortgage.root;

import Cd.C13243a;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.avito.android.analytics.screens.MortgageRootScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.compose.design.shared.stepsbar.StepsBarView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.acceptance_dialog.AcceptanceDialog;
import com.avito.android.mortgage.acceptance_dialog.model.AcceptanceDialogArguments;
import com.avito.android.mortgage.acceptance_dialog.model.Accepted;
import com.avito.android.mortgage.api.model.ApplicationHeaderStyle;
import com.avito.android.mortgage.api.model.ConfirmCloseContent;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog;
import com.avito.android.mortgage.applicant_type.model.ApplicantType;
import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import com.avito.android.mortgage.confirm_close.ConfirmCloseDialog;
import com.avito.android.mortgage.confirm_close.model.ConfirmCloseResult;
import com.avito.android.mortgage.document_upload.DocumentUploadFragment;
import com.avito.android.mortgage.landing.LandingFragment;
import com.avito.android.mortgage.person_form.MortgagePersonFormFragment;
import com.avito.android.mortgage.person_form.suggestion.SuggestionFragment;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionArguments;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionResult;
import com.avito.android.mortgage.root.di.b;
import com.avito.android.mortgage.root.list.items.bank.details.MortgageRootBankDetailsDialog;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankDetails;
import com.avito.android.mortgage.root.list.items.immutable_info.description.ImmutableInfoDescriptionDialog;
import com.avito.android.mortgage.root.list.items.immutable_info.description.model.ImmutableInfoDescriptionArguments;
import com.avito.android.mortgage.root.model.BorrowerDeleteAction;
import com.avito.android.mortgage.root.model.MortgageRootApplicationChanged;
import com.avito.android.mortgage.root.model.MortgageRootArguments;
import com.avito.android.mortgage.root.model.SignChangeAction;
import com.avito.android.mortgage.selected_appeal.SelectedAppealDialog;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealArguments;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealResult;
import com.avito.android.mortgage.sending_confirm.SendingConfirmDialog;
import com.avito.android.mortgage.sending_confirm.model.Confirmed;
import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import com.avito.android.mortgage.sign.SignFragment;
import com.avito.android.mortgage.steps_details.StepsDetailsDialog;
import com.avito.android.mortgage.steps_details.model.StepsDetailsArguments;
import com.avito.android.mortgage.terms.MortgageTermsDialog;
import com.avito.android.mortgage.terms.model.MortgageTermsArguments;
import com.avito.android.mortgage.verification_flow.VerificationFlowFragment;
import com.avito.android.mortgage.widgets.StackedImageView;
import com.avito.android.remote.error.ApiError;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import com.avito.konveyor.exception.BlueprintNotSupportedException;
import com.google.android.material.appbar.AppBarLayout;
import cv.InterfaceC39417a;
import f10.InterfaceC40199a;
import f10.c;
import g10.C40511a;
import g10.C40513c;
import g10.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import m.C43852a;
import z1.AbstractC50339a;

/* compiled from: MortgageRootFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/MortgageRootFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MortgageRootFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final C32677a f202151t0 = new C32677a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f202152n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public b f202153o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f202154p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.root.f f202155q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f202156r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C32678b f202157s0;

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f202158l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f202158l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f202158l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f202159l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f202159l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f202159l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/root/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C extends N implements Y41.a<com.avito.android.mortgage.root.e> {
        public C() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage.root.e invoke() {
            com.avito.android.mortgage.root.f fVar = MortgageRootFragment.this.f202155q0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.mortgage.root.e) fVar.get();
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/mortgage/root/MortgageRootFragment$a;", "", "<init>", "()V", "", "MORTGAGE_ROOT_ARGS", "Ljava/lang/String;", "MORTGAGE_ROOT_REQUEST_KEY", "MORTGAGE_ROOT_RESULT", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.MortgageRootFragment$a, reason: case insensitive filesystem */
    public static final class C32677a {

        /* compiled from: MortgageRootFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.root.MortgageRootFragment$a$a, reason: collision with other inner class name */
        public static final class C6004a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ MortgageRootArguments f202161l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6004a(MortgageRootArguments mortgageRootArguments) {
                super(1);
                this.f202161l = mortgageRootArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("MORTGAGE_ROOT_ARGS", this.f202161l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ C32677a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static MortgageRootFragment a(@Y61.k MortgageRootArguments mortgageRootArguments) {
            MortgageRootFragment mortgageRootFragment = new MortgageRootFragment();
            C35966w1.a(mortgageRootFragment, -1, new C6004a(mortgageRootArguments));
            return mortgageRootFragment;
        }

        public C32677a() {
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/root/MortgageRootFragment$b", "Landroidx/fragment/app/FragmentManager$n;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.MortgageRootFragment$b, reason: case insensitive filesystem */
    public static final class C32678b extends FragmentManager.n {
        public C32678b() {
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentDestroyed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
            if ((fragment instanceof MortgagePersonFormFragment) || (fragment instanceof LandingFragment) || (fragment instanceof DocumentUploadFragment) || (fragment instanceof SignFragment) || (fragment instanceof VerificationFlowFragment)) {
                C32677a c32677a = MortgageRootFragment.f202151t0;
                MortgageRootFragment.this.q5().accept(InterfaceC40199a.v.f395619a);
            }
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/root/MortgageRootFragment$c", "Landroidx/activity/x;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.MortgageRootFragment$c, reason: case insensitive filesystem */
    public static final class C32679c extends androidx.view.x {
        public C32679c() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40211m.f395608a);
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<String, Bundle, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            String value;
            Bundle bundle2 = bundle;
            SuggestionResult suggestionResult = (SuggestionResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("suggestion", SuggestionResult.class) : bundle2.getParcelable("suggestion"));
            if (suggestionResult != null) {
                boolean z12 = suggestionResult instanceof SuggestionResult.SuggestionSelected;
                MortgageRootFragment mortgageRootFragment = MortgageRootFragment.this;
                if (z12) {
                    C32677a c32677a = MortgageRootFragment.f202151t0;
                    com.avito.android.mortgage.root.e eVarQ5 = mortgageRootFragment.q5();
                    SuggestionContainer<? extends Suggestion> suggestionContainer = ((SuggestionResult.SuggestionSelected) suggestionResult).f201419c;
                    value = suggestionContainer != null ? suggestionContainer.getValue() : null;
                    eVarQ5.accept(new InterfaceC40199a.E(value != null ? value : ""));
                } else if (suggestionResult instanceof SuggestionResult.FillByHandsSelected) {
                    C32677a c32677a2 = MortgageRootFragment.f202151t0;
                    com.avito.android.mortgage.root.e eVarQ52 = mortgageRootFragment.q5();
                    SuggestionContainer<? extends Suggestion> suggestionContainer2 = ((SuggestionResult.FillByHandsSelected) suggestionResult).f201417c;
                    value = suggestionContainer2 != null ? suggestionContainer2.getValue() : null;
                    eVarQ52.accept(new InterfaceC40199a.A(value != null ? value : ""));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.p<String, Bundle, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            ApplicantType applicantType = (ApplicantType) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("APPLICANT_TYPE", ApplicantType.class) : bundle2.getParcelable("APPLICANT_TYPE"));
            if (applicantType != null) {
                C32677a c32677a = MortgageRootFragment.f202151t0;
                MortgageRootFragment.this.q5().accept(new InterfaceC40199a.C11121a(applicantType));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<String, Bundle, G0> {
        public f() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (((Accepted) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("ACCEPTANCE_RESULT", Accepted.class) : bundle2.getParcelable("ACCEPTANCE_RESULT"))) != null) {
                C32677a c32677a = MortgageRootFragment.f202151t0;
                MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40206h.f395603a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.p<String, Bundle, G0> {
        public g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            Accepted accepted = (Accepted) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("ACCEPTANCE_RESULT", Accepted.class) : bundle2.getParcelable("ACCEPTANCE_RESULT"));
            if (accepted != null) {
                Parcelable parcelable = accepted.f198194b;
                if (parcelable instanceof BorrowerDeleteAction) {
                    C32677a c32677a = MortgageRootFragment.f202151t0;
                    MortgageRootFragment.this.q5().accept(new InterfaceC40199a.C40205g(((BorrowerDeleteAction) parcelable).f202931b));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.p<String, Bundle, G0> {
        public h() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (((Accepted) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("ACCEPTANCE_RESULT", Accepted.class) : bundle2.getParcelable("ACCEPTANCE_RESULT"))) != null) {
                C32677a c32677a = MortgageRootFragment.f202151t0;
                MortgageRootFragment.this.q5().accept(InterfaceC40199a.z.f395623a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.p<String, Bundle, G0> {
        public i() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            Accepted accepted = (Accepted) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("ACCEPTANCE_RESULT", Accepted.class) : bundle2.getParcelable("ACCEPTANCE_RESULT"));
            if (accepted != null) {
                Parcelable parcelable = accepted.f198194b;
                if (parcelable instanceof SignChangeAction) {
                    C32677a c32677a = MortgageRootFragment.f202151t0;
                    MortgageRootFragment.this.q5().accept(new InterfaceC40199a.O((SignChangeAction) parcelable));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.p<String, Bundle, G0> {
        public j() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (((Confirmed) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("SENDING_CONFIRM_DIALOG_RESULT", Confirmed.class) : bundle2.getParcelable("SENDING_CONFIRM_DIALOG_RESULT"))) != null) {
                C32677a c32677a = MortgageRootFragment.f202151t0;
                MortgageRootFragment.this.q5().accept(InterfaceC40199a.t.f395617a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.p<String, Bundle, G0> {
        public k() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            ConfirmCloseResult confirmCloseResult = (ConfirmCloseResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("CONFIRM_CLOSE_RESULT", ConfirmCloseResult.class) : bundle2.getParcelable("CONFIRM_CLOSE_RESULT"));
            boolean zF2 = L.f(confirmCloseResult, ConfirmCloseResult.Confirmed.f198500b);
            MortgageRootFragment mortgageRootFragment = MortgageRootFragment.this;
            if (zF2) {
                C32677a c32677a = MortgageRootFragment.f202151t0;
                mortgageRootFragment.q5().accept(InterfaceC40199a.C40202d.f395599a);
            } else if (L.f(confirmCloseResult, ConfirmCloseResult.Declined.f198501b)) {
                C32677a c32677a2 = MortgageRootFragment.f202151t0;
                mortgageRootFragment.q5().accept(InterfaceC40199a.C40203e.f395600a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.p<String, Bundle, G0> {
        public l() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (L.f((SelectedAppealResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("SELECTED_APPEAL_RESULT", SelectedAppealResult.class) : bundle2.getParcelable("SELECTED_APPEAL_RESULT")), SelectedAppealResult.ReloadApplication.f203451b)) {
                C32677a c32677a = MortgageRootFragment.f202151t0;
                MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40216r.f395615a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg10/c;", "it", "Lkotlin/G0;", "invoke", "(Lg10/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<C40513c, G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C40513c c40513c) {
            Integer numValueOf;
            Integer numValueOf2;
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment mortgageRootFragment = MortgageRootFragment.this;
            g10.d dVar = c40513c.f396255k;
            if (dVar instanceof d.c) {
                b bVar = mortgageRootFragment.f202153o0;
                if (bVar == null) {
                    bVar = null;
                }
                com.avito.android.progress_overlay.l lVar = bVar.f202207v;
                if (lVar != null) {
                    lVar.k(null);
                }
            } else if (dVar instanceof d.b) {
                b bVar2 = mortgageRootFragment.f202153o0;
                b bVar3 = bVar2 != null ? bVar2 : null;
                ApiError apiError = ((d.b) dVar).f396260a;
                com.avito.android.progress_overlay.l lVar2 = bVar3.f202207v;
                if (lVar2 != null) {
                    lVar2.a(com.avito.android.error.z.k(apiError));
                }
            } else if (dVar instanceof d.a) {
                d.a aVar = (d.a) dVar;
                b bVar4 = mortgageRootFragment.f202153o0;
                if (bVar4 == null) {
                    bVar4 = null;
                }
                com.avito.android.progress_overlay.l lVar3 = bVar4.f202207v;
                if (lVar3 != null) {
                    lVar3.j();
                }
                JZ.c cVar = aVar.f396256a;
                b bVar5 = mortgageRootFragment.f202153o0;
                if (bVar5 == null) {
                    bVar5 = null;
                }
                List<String> listA = cVar.a();
                bVar5.getClass();
                List<String> list = listA;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StackedImageView.b.a((String) it.next(), Integer.valueOf(R.drawable.placeholder_circle_bg), Integer.valueOf(R.drawable.placeholder_circle_bg)));
                }
                List listE0 = arrayList.size() > 3 ? C42745f0.E0(arrayList, 2) : arrayList;
                StackedImageView stackedImageView = bVar5.f202194i;
                if (stackedImageView != null) {
                    stackedImageView.a(arrayList.size() - listE0.size(), listE0);
                }
                StackedImageView stackedImageView2 = bVar5.f202195j;
                if (stackedImageView2 != null) {
                    stackedImageView2.a(arrayList.size() - listE0.size(), listE0);
                }
                b bVar6 = mortgageRootFragment.f202153o0;
                if (bVar6 == null) {
                    bVar6 = null;
                }
                String description = cVar.getDescription();
                TextView textView = bVar6.f202196k;
                if (textView != null) {
                    textView.setText(description);
                }
                b bVar7 = mortgageRootFragment.f202153o0;
                if (bVar7 == null) {
                    bVar7 = null;
                }
                String details = cVar.getDetails();
                TextView textView2 = bVar7.f202197l;
                if (textView2 != null) {
                    I5.a(textView2, details, false);
                }
                AppBarLayout appBarLayout = bVar7.f202190e;
                if (appBarLayout != null) {
                    ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = (int) ((details == null ? 190 : 206) * Resources.getSystem().getDisplayMetrics().density);
                    appBarLayout.setLayoutParams(layoutParams);
                }
                b bVar8 = mortgageRootFragment.f202153o0;
                if (bVar8 == null) {
                    bVar8 = null;
                }
                List<String> listF = cVar.f();
                int currentStepIdx = cVar.getCurrentStepIdx();
                bVar8.getClass();
                List<String> list2 = listF;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new com.avito.android.lib.compose.design.shared.stepsbar.b((String) it2.next(), null, 2, null));
                }
                StepsBarView stepsBarView = bVar8.f202198m;
                if (stepsBarView != null) {
                    stepsBarView.setSteps(arrayList2);
                }
                StepsBarView stepsBarView2 = bVar8.f202198m;
                if (stepsBarView2 != null) {
                    stepsBarView2.setStepPosition(currentStepIdx);
                }
                b bVar9 = mortgageRootFragment.f202153o0;
                if (bVar9 == null) {
                    bVar9 = null;
                }
                JZ.c cVar2 = aVar.f396256a;
                ApplicationHeaderStyle style = cVar2.getStyle();
                int i12 = style == null ? -1 : d.a.C11184a.f396259a[style.ordinal()];
                if (i12 == -1 || i12 == 1) {
                    numValueOf = Integer.valueOf(R.attr.ic_edit20);
                } else if (i12 == 2) {
                    numValueOf = Integer.valueOf(R.attr.ic_exclamationMarkOutline20);
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = null;
                }
                ApplicationHeaderStyle style2 = cVar2.getStyle();
                int i13 = style2 == null ? -1 : d.a.C11184a.f396259a[style2.ordinal()];
                if (i13 == -1 || i13 == 1) {
                    numValueOf2 = Integer.valueOf(R.attr.black);
                } else if (i13 == 2) {
                    numValueOf2 = Integer.valueOf(R.attr.gray28);
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf2 = null;
                }
                bVar9.getClass();
                Integer numValueOf3 = numValueOf != null ? Integer.valueOf(C35835l0.j(numValueOf.intValue(), bVar9.a())) : null;
                ColorStateList colorStateList = numValueOf2 != null ? bVar9.a().getColorStateList(C35835l0.j(numValueOf2.intValue(), bVar9.a())) : null;
                if (numValueOf3 == null || colorStateList == null) {
                    ImageView imageView = bVar9.f202200o;
                    if (imageView != null) {
                        D6.w(imageView);
                    }
                } else {
                    ImageView imageView2 = bVar9.f202200o;
                    if (imageView2 != null) {
                        D6.G(imageView2, true);
                    }
                    ImageView imageView3 = bVar9.f202200o;
                    if (imageView3 != null) {
                        imageView3.setImageResource(numValueOf3.intValue());
                    }
                    ImageView imageView4 = bVar9.f202200o;
                    if (imageView4 != null) {
                        imageView4.setImageTintList(colorStateList);
                    }
                }
                b bVar10 = mortgageRootFragment.f202153o0;
                if (bVar10 == null) {
                    bVar10 = null;
                }
                ApplicationHeaderStyle style3 = cVar2.getStyle();
                int i14 = style3 == null ? -1 : d.a.C11184a.f396259a[style3.ordinal()];
                int i15 = R.attr.warmGray4;
                if (i14 != -1 && i14 != 1 && i14 != 2) {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i15 = R.attr.green50;
                }
                ColorStateList colorStateList2 = bVar10.a().getColorStateList(C35835l0.j(i15, bVar10.a()));
                CardView cardView = bVar10.f202199n;
                if (cardView != null) {
                    cardView.setCardBackgroundColor(colorStateList2);
                }
                b bVar11 = mortgageRootFragment.f202153o0;
                if (bVar11 == null) {
                    bVar11 = null;
                }
                bVar11.f202186a.l(aVar.f396257b, null);
                b bVar12 = mortgageRootFragment.f202153o0;
                if (bVar12 == null) {
                    bVar12 = null;
                }
                C40511a c40511a = aVar.f396258c;
                bVar12.f202209x = c40511a;
                if (bVar12.f202208w) {
                    bVar12.b(null);
                } else {
                    bVar12.b(c40511a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<G0> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40211m.f395608a);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<G0> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40207i.f395604a);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<G0> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(InterfaceC40199a.s.f395616a);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<G0> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40209k.f395606a);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<G0> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40210l.f395607a);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<G0> {
        public s() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40216r.f395615a);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<G0> {
        public t() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(InterfaceC40199a.C40204f.f395601a);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "firstVisible", "lastVisible", "Lkotlin/G0;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends N implements Y41.p<Integer, Integer, G0> {
        public u() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, Integer num2) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(new InterfaceC40199a.L(iIntValue, iIntValue2));
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class v extends H implements Y41.l<f10.c, G0> {
        @Override // Y41.l
        public final G0 invoke(f10.c cVar) {
            f10.c cVar2 = cVar;
            MortgageRootFragment mortgageRootFragment = (MortgageRootFragment) this.receiver;
            C32677a c32677a = MortgageRootFragment.f202151t0;
            mortgageRootFragment.getClass();
            if ((cVar2 instanceof c.b) || (cVar2 instanceof c.C11122c)) {
                mortgageRootFragment.r5();
            } else if (cVar2 instanceof c.h) {
                ConfirmCloseDialog.a aVar = ConfirmCloseDialog.f198479j0;
                ConfirmCloseContent confirmCloseContent = ((c.h) cVar2).f395631a;
                aVar.getClass();
                ConfirmCloseDialog.a.a(confirmCloseContent).show(mortgageRootFragment.getParentFragmentManager(), "mortgage_confirm_close");
            } else if (cVar2 instanceof c.f) {
                ApplicantTypeSelectorDialog.a aVar2 = ApplicantTypeSelectorDialog.f198265l0;
                ApplicantTypeSelectorArguments applicantTypeSelectorArguments = ((c.f) cVar2).f395629a;
                aVar2.getClass();
                ApplicantTypeSelectorDialog.a.a(applicantTypeSelectorArguments).show(mortgageRootFragment.getParentFragmentManager(), "mortgage_applicant_type_selector");
            } else {
                if (cVar2 instanceof c.d) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = mortgageRootFragment.f202154p0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, ((c.d) cVar2).f395627a, null, null, 6);
                } else if (cVar2 instanceof c.i) {
                    StepsDetailsDialog.a aVar4 = StepsDetailsDialog.f203813i0;
                    StepsDetailsArguments stepsDetailsArguments = ((c.i) cVar2).f395632a;
                    aVar4.getClass();
                    StepsDetailsDialog.a.a(stepsDetailsArguments).show(mortgageRootFragment.getParentFragmentManager(), "mortgage_steps_details");
                } else if (cVar2 instanceof c.k) {
                    MortgageTermsDialog.a aVar5 = MortgageTermsDialog.f203827k0;
                    MortgageTermsArguments mortgageTermsArguments = ((c.k) cVar2).f395634a;
                    aVar5.getClass();
                    MortgageTermsDialog.a.a(mortgageTermsArguments).show(mortgageRootFragment.getParentFragmentManager(), "mortgage_terms");
                } else if (cVar2 instanceof c.l) {
                    SelectedAppealDialog.a aVar6 = SelectedAppealDialog.f203389n0;
                    SelectedAppealArguments selectedAppealArguments = ((c.l) cVar2).f395635a;
                    aVar6.getClass();
                    SelectedAppealDialog.a.a(selectedAppealArguments).show(mortgageRootFragment.getParentFragmentManager(), "selected_appeal");
                } else if (cVar2 instanceof c.o) {
                    b bVar = mortgageRootFragment.f202153o0;
                    c.o oVar = (c.o) cVar2;
                    ViewGroup viewGroup = (bVar != null ? bVar : null).f202188c;
                    if (viewGroup != null) {
                        com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                        ApiError apiError = oVar.f395638a;
                        com.avito.android.component.toast.c.b(cVar3, viewGroup, com.avito.android.printable_text.b.f(apiError.getF244063c()), null, null, null, new f.c(apiError), 0, null, null, false, false, null, null, 4078);
                    }
                } else if (cVar2 instanceof c.e) {
                    AcceptanceDialog.a aVar7 = AcceptanceDialog.f198162j0;
                    AcceptanceDialogArguments acceptanceDialogArguments = ((c.e) cVar2).f395628a;
                    aVar7.getClass();
                    AcceptanceDialog.a.a(acceptanceDialogArguments).show(mortgageRootFragment.getParentFragmentManager(), "acceptance_dialog");
                } else if (cVar2 instanceof c.m) {
                    SendingConfirmDialog.a aVar8 = SendingConfirmDialog.f203484l0;
                    SendingConfirmArguments sendingConfirmArguments = ((c.m) cVar2).f395636a;
                    aVar8.getClass();
                    SendingConfirmDialog.a.a(sendingConfirmArguments).show(mortgageRootFragment.getParentFragmentManager(), "mortgage_confirm_sending_dialog");
                } else if (cVar2 instanceof c.j) {
                    ImmutableInfoDescriptionDialog.a aVar9 = ImmutableInfoDescriptionDialog.f202559l0;
                    ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments = ((c.j) cVar2).f395633a;
                    aVar9.getClass();
                    ImmutableInfoDescriptionDialog.a.a(immutableInfoDescriptionArguments).show(mortgageRootFragment.getParentFragmentManager(), "mortgage_immutable_info_description_dialog");
                } else if (cVar2 instanceof c.g) {
                    MortgageRootBankDetailsDialog.a aVar10 = MortgageRootBankDetailsDialog.f202316j0;
                    MortgageRootBankDetails mortgageRootBankDetails = ((c.g) cVar2).f395630a;
                    aVar10.getClass();
                    MortgageRootBankDetailsDialog.a.a(mortgageRootBankDetails).show(mortgageRootFragment.getParentFragmentManager(), "mortgage_bank_details_dialog");
                } else if (cVar2 instanceof c.a) {
                    mortgageRootFragment.requireActivity().finish();
                    com.avito.android.deeplink_handler.handler.composite.a aVar11 = mortgageRootFragment.f202154p0;
                    if (aVar11 == null) {
                        aVar11 = null;
                    }
                    b.a.a(aVar11, ((c.a) cVar2).f395624a, null, null, 6);
                } else if (cVar2 instanceof c.n) {
                    c.n nVar = (c.n) cVar2;
                    b bVar2 = mortgageRootFragment.f202153o0;
                    if (bVar2 == null) {
                        bVar2 = null;
                    }
                    ViewGroup viewGroup2 = bVar2.f202188c;
                    if (viewGroup2 != null) {
                        K2.d(viewGroup2, true);
                    }
                    ViewGroup viewGroup3 = bVar2.f202188c;
                    if (viewGroup3 != null) {
                        viewGroup3.clearFocus();
                    }
                    androidx.fragment.app.H hE2 = mortgageRootFragment.getParentFragmentManager().e();
                    SuggestionFragment.a aVar12 = SuggestionFragment.f201353r0;
                    SuggestionArguments suggestionArguments = nVar.f395637a;
                    aVar12.getClass();
                    hE2.n(R.id.container, SuggestionFragment.a.a(suggestionArguments), null);
                    hE2.c("suggestion");
                    hE2.e();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageRootFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf10/a;", "it", "Lkotlin/G0;", "invoke", "(Lf10/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends N implements Y41.l<InterfaceC40199a, G0> {
        public w() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40199a interfaceC40199a) {
            C32677a c32677a = MortgageRootFragment.f202151t0;
            MortgageRootFragment.this.q5().accept(interfaceC40199a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f202183l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Y41.a aVar) {
            super(0);
            this.f202183l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f202183l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends N implements Y41.a<Fragment> {
        public y() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return MortgageRootFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f202185l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(y yVar) {
            super(0);
            this.f202185l = yVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f202185l.invoke();
        }
    }

    public MortgageRootFragment() {
        super(R.layout.mortgage_root_fragment);
        x xVar = new x(new C());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new z(new y()));
        this.f202156r0 = new O0(m0.f406844a.b(com.avito.android.mortgage.root.e.class), new A(interfaceC42726CB), xVar, new B(interfaceC42726CB));
        this.f202157s0 = new C32678b();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "REALTY_OBJECT_DETAILS_ADDRESS", new d());
        C22960s.b(this, "APPLICANT_TYPE_SELECTOR_KEY", new e());
        C22960s.b(this, "DELETE_APPLICATION_REQUEST_KEY", new f());
        C22960s.b(this, "DELETE_APPLICANT_REQUEST_KEY", new g());
        C22960s.b(this, "DELETE_REALTY_OBJECT_REQUEST_KEY", new h());
        C22960s.b(this, "CHANGE_SIGNATURE_REQUEST_KEY", new i());
        C22960s.b(this, "SENDING_CONFIRM_DIALOG_REQUEST_KEY", new j());
        C22960s.b(this, "CONFIRM_CLOSE_REQUEST_KEY", new k());
        C22960s.b(this, "SELECTED_APPEAL_RESULT_KEY", new l());
        getParentFragmentManager().e0(this.f202157s0, false);
        requireActivity().getF21241d().a(this, new C32679c());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f202152n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        getParentFragmentManager().v0(this.f202157s0);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        b bVar = this.f202153o0;
        if (bVar == null) {
            bVar = null;
        }
        AppBarLayout appBarLayout = bVar.f202190e;
        if (appBarLayout != null) {
            appBarLayout.f(bVar.f202206u);
        }
        bVar.f202190e = null;
        bVar.f202189d = null;
        bVar.f202205t = null;
        bVar.f202192g = null;
        bVar.f202193h = null;
        bVar.f202191f = null;
        bVar.f202194i = null;
        bVar.f202195j = null;
        bVar.f202196k = null;
        bVar.f202197l = null;
        bVar.f202198m = null;
        bVar.f202207v = null;
        bVar.f202199n = null;
        bVar.f202200o = null;
        bVar.f202201p = null;
        bVar.f202202q = null;
        bVar.f202203r = null;
        bVar.f202204s = null;
        bVar.f202188c = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q5().accept(InterfaceC40199a.K.f395587a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) throws BlueprintNotSupportedException, Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        b bVar = this.f202153o0;
        if (bVar == null) {
            bVar = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        bVar.f202188c = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.motion_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.motion.widget.MotionLayout");
        }
        bVar.f202189d = (MotionLayout) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.app_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        bVar.f202190e = (AppBarLayout) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.back_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        bVar.f202191f = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.details_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        bVar.f202192g = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.menu_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        bVar.f202193h = (ImageButton) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.recycler);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        bVar.f202205t = (RecyclerView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.conditions_banks);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.mortgage.widgets.StackedImageView");
        }
        bVar.f202194i = (StackedImageView) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.title_banks);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.mortgage.widgets.StackedImageView");
        }
        bVar.f202195j = (StackedImageView) viewFindViewById8;
        View viewFindViewById9 = viewGroup.findViewById(R.id.conditions);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        bVar.f202196k = (TextView) viewFindViewById9;
        View viewFindViewById10 = viewGroup.findViewById(R.id.conditions_details);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        bVar.f202197l = (TextView) viewFindViewById10;
        View viewFindViewById11 = viewGroup.findViewById(R.id.steps);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.compose.design.shared.stepsbar.StepsBarView");
        }
        bVar.f202198m = (StepsBarView) viewFindViewById11;
        View viewFindViewById12 = viewGroup.findViewById(R.id.conditions_card);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.cardview.widget.CardView");
        }
        bVar.f202199n = (CardView) viewFindViewById12;
        View viewFindViewById13 = viewGroup.findViewById(R.id.action_icon);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        bVar.f202200o = (ImageView) viewFindViewById13;
        View viewFindViewById14 = viewGroup.findViewById(R.id.floating_navigation);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        bVar.f202201p = (ViewGroup) viewFindViewById14;
        View viewFindViewById15 = viewGroup.findViewById(R.id.next);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        bVar.f202202q = (Button) viewFindViewById15;
        View viewFindViewById16 = viewGroup.findViewById(R.id.previous);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        bVar.f202203r = (Button) viewFindViewById16;
        View viewFindViewById17 = viewGroup.findViewById(R.id.legal_text);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById17;
        bVar.f202204s = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        bVar.f202207v = new com.avito.android.progress_overlay.l(bVar.f202188c, R.id.recycler, null, 0, 0, 28, null);
        Activity activityA = C35835l0.a(bVar.a());
        if (activityA != null) {
            K2.a(activityA, new c(bVar, viewGroup));
        }
        StepsBarView stepsBarView = bVar.f202198m;
        if (stepsBarView != null) {
            float dimension = (int) (stepsBarView.getContext().getResources().getDimension(R.dimen.root_steps_bar_progress_height) / Resources.getSystem().getDisplayMetrics().density);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            stepsBarView.m51setProgressHeight0680j_4(dimension);
            stepsBarView.setVisibleStepsCount(3);
        }
        AppBarLayout appBarLayout = bVar.f202190e;
        if (appBarLayout != null) {
            appBarLayout.a(bVar.f202206u);
        }
        RecyclerView recyclerView = bVar.f202205t;
        if (recyclerView != null) {
            recyclerView.setAdapter(bVar.f202186a);
        }
        RecyclerView recyclerView2 = bVar.f202205t;
        if (recyclerView2 != null) {
            bVar.a();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        Resources resources = bVar.a().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.root_horizontal_offset);
        RecyclerView recyclerView3 = bVar.f202205t;
        com.avito.konveyor.a aVar2 = bVar.f202187b;
        if (recyclerView3 != null) {
            recyclerView3.l(new Z00.d(dimensionPixelOffset, resources, aVar2), -1);
        }
        Drawable drawableA = C43852a.a(bVar.a(), R.drawable.mortgage_root_divider);
        if (drawableA != null) {
            int iY2 = aVar2.Y(com.avito.android.mortgage.root.list.items.bank.a.class);
            RecyclerView recyclerView4 = bVar.f202205t;
            if (recyclerView4 != null) {
                recyclerView4.l(new Z00.c(drawableA, iY2, dimensionPixelOffset), -1);
            }
        }
        b bVar2 = this.f202153o0;
        if (bVar2 == null) {
            bVar2 = null;
        }
        n nVar = new n();
        o oVar = new o();
        p pVar = new p();
        q qVar = new q();
        r rVar = new r();
        s sVar = new s();
        t tVar = new t();
        u uVar = new u();
        ImageButton imageButton = bVar2.f202191f;
        if (imageButton != null) {
            imageButton.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(21, nVar));
        }
        ImageButton imageButton2 = bVar2.f202192g;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(22, oVar));
        }
        ImageButton imageButton3 = bVar2.f202193h;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(23, pVar));
        }
        Button button = bVar2.f202202q;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(24, qVar));
        }
        Button button2 = bVar2.f202203r;
        if (button2 != null) {
            button2.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(25, rVar));
        }
        CardView cardView = bVar2.f202199n;
        if (cardView != null) {
            cardView.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(26, tVar));
        }
        com.avito.android.progress_overlay.l lVar = bVar2.f202207v;
        if (lVar != null) {
            lVar.f231600j = sVar;
        }
        RecyclerView recyclerView5 = bVar2.f202205t;
        if (recyclerView5 != null) {
            recyclerView5.o(new com.avito.android.mortgage.root.d(bVar2, uVar));
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f202152n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, q5(), new v(1, this, MortgageRootFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootOneTimeEvent;)V", 0), new m());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f202152n0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgageRootScreen.f90427d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.mortgage.root.di.a.a();
        com.avito.android.mortgage.di.o oVar = (com.avito.android.mortgage.di.o) C29972i.a(C29972i.b(this), com.avito.android.mortgage.di.o.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Bundle bundleRequireArguments = requireArguments();
        aVarA.a(oVar, interfaceC39417aB, (MortgageRootArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("MORTGAGE_ROOT_ARGS", MortgageRootArguments.class) : bundleRequireArguments.getParcelable("MORTGAGE_ROOT_ARGS")), new w(), c28478k).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f202152n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.mortgage.root.e q5() {
        return (com.avito.android.mortgage.root.e) this.f202156r0.getValue();
    }

    public final void r5() {
        getParentFragmentManager().o0(C22777e.b(new Q("MORTGAGE_ROOT_RESULT", MortgageRootApplicationChanged.f202932b)), "MORTGAGE_ROOT_REQUEST_KEY");
        if (getParentFragmentManager().L() == 0) {
            requireActivity().finish();
        } else {
            getParentFragmentManager().Y();
        }
    }
}
