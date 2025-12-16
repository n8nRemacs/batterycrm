package com.avito.android.evidence_request.reasons;

import Y41.l;
import Y61.k;
import aA.InterfaceC19746a;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.crm_candidates.view.dialogs.f;
import com.avito.android.di.C29972i;
import com.avito.android.evidence_request.repository.model.ProofType;
import com.avito.android.evidence_request.repository.model.ProofTypesContent;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.radio.RadioButton;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.AppBarLayoutWithTextAction;

/* compiled from: ProofTypesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/evidence_request/reasons/ProofTypesFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProofTypesFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @k
    public static final a f149190r0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    public AppBarLayoutWithTextAction f149191n0;

    /* renamed from: o0, reason: collision with root package name */
    public RadioGroup f149192o0;

    /* renamed from: p0, reason: collision with root package name */
    public Button f149193p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public c f149194q0;

    /* compiled from: ProofTypesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/reasons/ProofTypesFragment$a;", "", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ProofTypesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.evidence_request.reasons.ProofTypesFragment$a$a, reason: collision with other inner class name */
        public static final class C4376a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ProofTypesContent f149195l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4376a(ProofTypesContent proofTypesContent) {
                super(1);
                this.f149195l = proofTypesContent;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_content", this.f149195l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ProofTypesFragment a(@k ProofTypesContent proofTypesContent) {
            ProofTypesFragment proofTypesFragment = new ProofTypesFragment();
            C35966w1.a(proofTypesFragment, -1, new C4376a(proofTypesContent));
            return proofTypesFragment;
        }

        public a() {
        }
    }

    public ProofTypesFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.proof_types_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f149191n0 = (AppBarLayoutWithTextAction) view.findViewById(R.id.app_bar);
        Parcelable parcelable = requireArguments().getParcelable("key_content");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ProofTypesContent proofTypesContent = (ProofTypesContent) parcelable;
        AppBarLayoutWithTextAction appBarLayoutWithTextAction = this.f149191n0;
        if (appBarLayoutWithTextAction == null) {
            appBarLayoutWithTextAction = null;
        }
        String str = proofTypesContent.f149208b;
        appBarLayoutWithTextAction.setTitle(str);
        AppBarLayoutWithTextAction appBarLayoutWithTextAction2 = this.f149191n0;
        if (appBarLayoutWithTextAction2 == null) {
            appBarLayoutWithTextAction2 = null;
        }
        appBarLayoutWithTextAction2.setShortTitle(str);
        AppBarLayoutWithTextAction appBarLayoutWithTextAction3 = this.f149191n0;
        if (appBarLayoutWithTextAction3 == null) {
            appBarLayoutWithTextAction3 = null;
        }
        appBarLayoutWithTextAction3.setSubTitle(proofTypesContent.f149209c);
        AppBarLayoutWithTextAction appBarLayoutWithTextAction4 = this.f149191n0;
        if (appBarLayoutWithTextAction4 == null) {
            appBarLayoutWithTextAction4 = null;
        }
        appBarLayoutWithTextAction4.setClickListener(new b());
        this.f149193p0 = (Button) view.findViewById(R.id.select_button);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.types_group);
        this.f149192o0 = radioGroup;
        radioGroup.b();
        radioGroup.a(-1);
        int i12 = 0;
        for (Object obj : proofTypesContent.f149210d) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ProofType proofType = (ProofType) obj;
            RadioButton radioButton = new RadioButton(requireContext());
            radioButton.setTag(proofType.f149206b);
            radioButton.setId(i12);
            radioButton.setTitle(proofType.f149207c);
            radioGroup.addView(radioButton);
            i12 = i13;
        }
        RadioGroup radioGroup2 = this.f149192o0;
        (radioGroup2 != null ? radioGroup2 : null).setDeprecatedOnCheckedChangeListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 15));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(@Y61.l Bundle bundle) {
        super.onViewStateRestored(bundle);
        Parcelable parcelable = requireArguments().getParcelable("key_content");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ProofTypesContent proofTypesContent = (ProofTypesContent) parcelable;
        RadioGroup radioGroup = this.f149192o0;
        if (radioGroup == null) {
            radioGroup = null;
        }
        int f180133e = radioGroup.getF180133e();
        if (f180133e != -1) {
            Button button = this.f149193p0;
            Button button2 = button != null ? button : null;
            String str = proofTypesContent.f149210d.get(f180133e).f149206b;
            button2.setEnabled(true);
            button2.setOnClickListener(new f(27, this, str));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        ((InterfaceC19746a) C29972i.a(C29972i.b(this), InterfaceC19746a.class)).ba(this);
    }

    /* compiled from: ProofTypesFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/evidence_request/reasons/ProofTypesFragment$b", "Lru/avito/component/toolbar/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ru.avito.component.toolbar.a {
        public b() {
        }

        @Override // ru.avito.component.toolbar.a
        public final void R() {
            ProofTypesFragment.this.requireActivity().onBackPressed();
        }

        @Override // ru.avito.component.toolbar.a
        public final void u() {
        }
    }
}
