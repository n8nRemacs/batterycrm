package com.avito.android.authorization.gorelkin;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.authorization.gorelkin.event.ParsingPermissionFormOpenSource;
import com.avito.android.authorization.gorelkin.f;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.L4;
import com.avito.android.util.N3;
import j.e0;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ne.C44383a;
import qK0.C47313c;

/* compiled from: ParsingPermissionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/gorelkin/ParsingPermissionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParsingPermissionFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f93867D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f93868E0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93869A0;

    /* renamed from: B0, reason: collision with root package name */
    public ParsingPermissionFormContent f93870B0;

    /* renamed from: C0, reason: collision with root package name */
    public PpFlow f93871C0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f93872n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f93873o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f93874p0;

    /* renamed from: q0, reason: collision with root package name */
    @N3.a
    @Inject
    public L4 f93875q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93876r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93877s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93878t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93879u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93880v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93881w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93882x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93883y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93884z0;

    /* compiled from: ParsingPermissionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/gorelkin/ParsingPermissionFragment$a;", "", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ParsingPermissionFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.authorization.gorelkin.ParsingPermissionFragment$a$a, reason: collision with other inner class name */
        public static final class C2777a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ParsingPermissionFormContent f93885l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ PpFlow f93886m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2777a(ParsingPermissionFormContent parsingPermissionFormContent, PpFlow ppFlow) {
                super(1);
                this.f93885l = parsingPermissionFormContent;
                this.f93886m = ppFlow;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("key_pp_form_content", this.f93885l);
                bundle2.putSerializable("key_pp_flow", this.f93886m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static Profile a(@Y61.k Bundle bundle) {
            return (Profile) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("fragment_result_profile", Profile.class) : bundle.getParcelable("fragment_result_profile"));
        }

        @Y61.k
        public static Session b(@Y61.k Bundle bundle) {
            return (Session) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("fragment_result_session", Session.class) : bundle.getParcelable("fragment_result_session"));
        }

        @Y61.k
        public static ParsingPermissionFragment c(@Y61.k ParsingPermissionFormContent parsingPermissionFormContent, @Y61.k PpFlow ppFlow) {
            ParsingPermissionFragment parsingPermissionFragment = new ParsingPermissionFragment();
            C35966w1.a(parsingPermissionFragment, -1, new C2777a(parsingPermissionFormContent, ppFlow));
            return parsingPermissionFragment;
        }

        public a() {
        }
    }

    static {
        Y y12 = new Y(ParsingPermissionFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0);
        n0 n0Var = m0.f406844a;
        f93868E0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "fioInput", "getFioInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "fioCc", "getFioCc()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "phoneInput", "getPhoneInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "phoneCc", "getPhoneCc()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "denyRli", "getDenyRli()Lcom/avito/android/lib/design/list_item/ListItemRadio;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "allowRli", "getAllowRli()Lcom/avito/android/lib/design/list_item/ListItemRadio;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "maybeRli", "getMaybeRli()Lcom/avito/android/lib/design/list_item/ListItemRadio;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "rootView", "getRootView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ParsingPermissionFragment.class, "progressView", "getProgressView()Landroid/view/View;", 0, n0Var)};
        f93867D0 = new a(null);
    }

    public ParsingPermissionFragment() {
        super(0, 1, null);
        this.f93876r0 = new C47313c(null, 1, null);
        this.f93877s0 = new C47313c(null, 1, null);
        this.f93878t0 = new C47313c(null, 1, null);
        this.f93879u0 = new C47313c(null, 1, null);
        this.f93880v0 = new C47313c(null, 1, null);
        this.f93881w0 = new C47313c(null, 1, null);
        this.f93882x0 = new C47313c(null, 1, null);
        this.f93883y0 = new C47313c(null, 1, null);
        this.f93884z0 = new C47313c(null, 1, null);
        this.f93869A0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.parsing_permission_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C47313c c47313c = this.f93884z0;
        kotlin.reflect.n<Object>[] nVarArr = f93868E0;
        kotlin.reflect.n<Object> nVar = nVarArr[8];
        c47313c.b(this, view);
        View viewFindViewById = view.findViewById(R.id.parsing_permission_continue_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        C47313c c47313c2 = this.f93876r0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        c47313c2.b(this, (Button) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.parsing_permission_fio_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        C47313c c47313c3 = this.f93877s0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        c47313c3.b(this, (Input) viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.parsing_permission_fio_cc);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        C47313c c47313c4 = this.f93878t0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c4.b(this, (ComponentContainer) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.parsing_permission_phone_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById4;
        input.setInputType(3);
        C47313c c47313c5 = this.f93879u0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[3];
        c47313c5.b(this, input);
        View viewFindViewById5 = view.findViewById(R.id.parsing_permission_phone_cc);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        C47313c c47313c6 = this.f93880v0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[4];
        c47313c6.b(this, (ComponentContainer) viewFindViewById5);
        ListItemRadio listItemRadio = (ListItemRadio) view.findViewById(R.id.parsing_permission_denied_rli);
        C47313c c47313c7 = this.f93881w0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c7.b(this, listItemRadio);
        ListItemRadio listItemRadio2 = (ListItemRadio) view.findViewById(R.id.parsing_permission_allowed_rli);
        C47313c c47313c8 = this.f93882x0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[6];
        c47313c8.b(this, listItemRadio2);
        ListItemRadio listItemRadio3 = (ListItemRadio) view.findViewById(R.id.parsing_permission_maybe_rli);
        C47313c c47313c9 = this.f93883y0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[7];
        c47313c9.b(this, listItemRadio3);
        View viewFindViewById6 = view.findViewById(R.id.parsing_permission_pv);
        C47313c c47313c10 = this.f93869A0;
        kotlin.reflect.n<Object> nVar10 = nVarArr[9];
        c47313c10.b(this, viewFindViewById6);
        View viewFindViewById7 = view.findViewById(R.id.parsing_permission_subtitle_0_iv);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        final int i12 = 0;
        ((ImageView) viewFindViewById7).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.authorization.gorelkin.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ParsingPermissionFragment f93895c;

            {
                this.f93895c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ParsingPermissionFragment parsingPermissionFragment = this.f93895c;
                switch (i12) {
                    case 0:
                        ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_0);
                        break;
                    case 1:
                        ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_1);
                        break;
                    case 2:
                        ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
                        AttributedText attributedText = new AttributedText(parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2), Collections.singletonList(new LinkAttribute("full_attribute", parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2_full_attribute), "full_attribute", null, 8, null)), 0, 4, null);
                        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(parsingPermissionFragment.requireContext(), 0, 2, null);
                        dVar.setContentView(R.layout.parsing_permission_bottom_sheet);
                        TextView textView = (TextView) dVar.findViewById(R.id.pp_bs_text);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        attributedText.setOnUrlClickListener(new a(parsingPermissionFragment, 0));
                        com.avito.android.util.text.j.c(textView, attributedText, null);
                        ((Button) dVar.findViewById(R.id.pp_bs_close_button)).setOnClickListener(new S7.a(dVar, 9));
                        dVar.s();
                        com.avito.android.lib.util.g.a(dVar);
                        break;
                    case 3:
                        ParsingPermissionFragment.a aVar4 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_denied_more_text);
                        break;
                    case 4:
                        ParsingPermissionFragment.a aVar5 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_maybe_more_text);
                        break;
                    default:
                        m mVar = parsingPermissionFragment.f93872n0;
                        if (mVar == null) {
                            mVar = null;
                        }
                        C47313c c47313c11 = parsingPermissionFragment.f93877s0;
                        kotlin.reflect.n<Object>[] nVarArr2 = ParsingPermissionFragment.f93868E0;
                        kotlin.reflect.n<Object> nVar11 = nVarArr2[1];
                        CharSequence charSequenceM53getText = ((Input) c47313c11.a()).m53getText();
                        if (charSequenceM53getText == null) {
                            charSequenceM53getText = "";
                        }
                        C47313c c47313c12 = parsingPermissionFragment.f93879u0;
                        kotlin.reflect.n<Object> nVar12 = nVarArr2[3];
                        Editable editableM53getText = ((Input) c47313c12.a()).m53getText();
                        CharSequence charSequence = editableM53getText != null ? editableM53getText : "";
                        PpFlow ppFlow = parsingPermissionFragment.f93871C0;
                        mVar.a3(charSequenceM53getText, charSequence, ppFlow != null ? ppFlow : null);
                        break;
                }
            }
        });
        View viewFindViewById8 = view.findViewById(R.id.parsing_permission_subtitle_1_iv);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        final int i13 = 1;
        ((ImageView) viewFindViewById8).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.authorization.gorelkin.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ParsingPermissionFragment f93895c;

            {
                this.f93895c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ParsingPermissionFragment parsingPermissionFragment = this.f93895c;
                switch (i13) {
                    case 0:
                        ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_0);
                        break;
                    case 1:
                        ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_1);
                        break;
                    case 2:
                        ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
                        AttributedText attributedText = new AttributedText(parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2), Collections.singletonList(new LinkAttribute("full_attribute", parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2_full_attribute), "full_attribute", null, 8, null)), 0, 4, null);
                        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(parsingPermissionFragment.requireContext(), 0, 2, null);
                        dVar.setContentView(R.layout.parsing_permission_bottom_sheet);
                        TextView textView = (TextView) dVar.findViewById(R.id.pp_bs_text);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        attributedText.setOnUrlClickListener(new a(parsingPermissionFragment, 0));
                        com.avito.android.util.text.j.c(textView, attributedText, null);
                        ((Button) dVar.findViewById(R.id.pp_bs_close_button)).setOnClickListener(new S7.a(dVar, 9));
                        dVar.s();
                        com.avito.android.lib.util.g.a(dVar);
                        break;
                    case 3:
                        ParsingPermissionFragment.a aVar4 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_denied_more_text);
                        break;
                    case 4:
                        ParsingPermissionFragment.a aVar5 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_maybe_more_text);
                        break;
                    default:
                        m mVar = parsingPermissionFragment.f93872n0;
                        if (mVar == null) {
                            mVar = null;
                        }
                        C47313c c47313c11 = parsingPermissionFragment.f93877s0;
                        kotlin.reflect.n<Object>[] nVarArr2 = ParsingPermissionFragment.f93868E0;
                        kotlin.reflect.n<Object> nVar11 = nVarArr2[1];
                        CharSequence charSequenceM53getText = ((Input) c47313c11.a()).m53getText();
                        if (charSequenceM53getText == null) {
                            charSequenceM53getText = "";
                        }
                        C47313c c47313c12 = parsingPermissionFragment.f93879u0;
                        kotlin.reflect.n<Object> nVar12 = nVarArr2[3];
                        Editable editableM53getText = ((Input) c47313c12.a()).m53getText();
                        CharSequence charSequence = editableM53getText != null ? editableM53getText : "";
                        PpFlow ppFlow = parsingPermissionFragment.f93871C0;
                        mVar.a3(charSequenceM53getText, charSequence, ppFlow != null ? ppFlow : null);
                        break;
                }
            }
        });
        View viewFindViewById9 = view.findViewById(R.id.parsing_permission_subtitle_2_iv);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        final int i14 = 2;
        ((ImageView) viewFindViewById9).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.authorization.gorelkin.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ParsingPermissionFragment f93895c;

            {
                this.f93895c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ParsingPermissionFragment parsingPermissionFragment = this.f93895c;
                switch (i14) {
                    case 0:
                        ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_0);
                        break;
                    case 1:
                        ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_1);
                        break;
                    case 2:
                        ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
                        AttributedText attributedText = new AttributedText(parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2), Collections.singletonList(new LinkAttribute("full_attribute", parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2_full_attribute), "full_attribute", null, 8, null)), 0, 4, null);
                        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(parsingPermissionFragment.requireContext(), 0, 2, null);
                        dVar.setContentView(R.layout.parsing_permission_bottom_sheet);
                        TextView textView = (TextView) dVar.findViewById(R.id.pp_bs_text);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        attributedText.setOnUrlClickListener(new a(parsingPermissionFragment, 0));
                        com.avito.android.util.text.j.c(textView, attributedText, null);
                        ((Button) dVar.findViewById(R.id.pp_bs_close_button)).setOnClickListener(new S7.a(dVar, 9));
                        dVar.s();
                        com.avito.android.lib.util.g.a(dVar);
                        break;
                    case 3:
                        ParsingPermissionFragment.a aVar4 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_denied_more_text);
                        break;
                    case 4:
                        ParsingPermissionFragment.a aVar5 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_maybe_more_text);
                        break;
                    default:
                        m mVar = parsingPermissionFragment.f93872n0;
                        if (mVar == null) {
                            mVar = null;
                        }
                        C47313c c47313c11 = parsingPermissionFragment.f93877s0;
                        kotlin.reflect.n<Object>[] nVarArr2 = ParsingPermissionFragment.f93868E0;
                        kotlin.reflect.n<Object> nVar11 = nVarArr2[1];
                        CharSequence charSequenceM53getText = ((Input) c47313c11.a()).m53getText();
                        if (charSequenceM53getText == null) {
                            charSequenceM53getText = "";
                        }
                        C47313c c47313c12 = parsingPermissionFragment.f93879u0;
                        kotlin.reflect.n<Object> nVar12 = nVarArr2[3];
                        Editable editableM53getText = ((Input) c47313c12.a()).m53getText();
                        CharSequence charSequence = editableM53getText != null ? editableM53getText : "";
                        PpFlow ppFlow = parsingPermissionFragment.f93871C0;
                        mVar.a3(charSequenceM53getText, charSequence, ppFlow != null ? ppFlow : null);
                        break;
                }
            }
        });
        View viewFindViewById10 = view.findViewById(R.id.parsing_permission_subtitle_1_tv);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById10;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        AttributedText attributedText = new AttributedText(getString(R.string.parsing_permission_subtitle_1), Collections.singletonList(new LinkAttribute("full_attribute", getString(R.string.parsing_permission_subtitle_1_full_attribute), "full_attribute", null, 8, null)), 0, 4, null);
        attributedText.setOnUrlClickListener(new com.avito.android.authorization.gorelkin.a(this, 1));
        com.avito.android.util.text.j.c(textView, attributedText, null);
        ParsingPermissionFormContent parsingPermissionFormContent = this.f93870B0;
        if (parsingPermissionFormContent == null) {
            parsingPermissionFormContent = null;
        }
        String str = parsingPermissionFormContent.f93865b;
        if (str != null) {
            kotlin.reflect.n<Object> nVar11 = nVarArr[1];
            Input.t((Input) c47313c3.a(), str, false, 6);
        }
        String str2 = parsingPermissionFormContent.f93866c;
        if (str2 != null) {
            L4 l42 = this.f93875q0;
            if (l42 == null) {
                l42 = null;
            }
            String strH = com.avito.android.lib.design.input.c.h(l42.a(str2), " ");
            kotlin.reflect.n<Object> nVar12 = nVarArr[3];
            Input.t((Input) c47313c5.a(), strH, false, 6);
            if (!C43066x.K(str2)) {
                kotlin.reflect.n<Object> nVar13 = nVarArr[3];
                ((Input) c47313c5.a()).setEnabled(false);
            }
        }
        r5().e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(1, this, ParsingAllowance.f93861e));
        final int i15 = 3;
        r5().setImageClickedListener(new View.OnClickListener(this) { // from class: com.avito.android.authorization.gorelkin.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ParsingPermissionFragment f93895c;

            {
                this.f93895c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ParsingPermissionFragment parsingPermissionFragment = this.f93895c;
                switch (i15) {
                    case 0:
                        ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_0);
                        break;
                    case 1:
                        ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_1);
                        break;
                    case 2:
                        ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
                        AttributedText attributedText2 = new AttributedText(parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2), Collections.singletonList(new LinkAttribute("full_attribute", parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2_full_attribute), "full_attribute", null, 8, null)), 0, 4, null);
                        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(parsingPermissionFragment.requireContext(), 0, 2, null);
                        dVar.setContentView(R.layout.parsing_permission_bottom_sheet);
                        TextView textView2 = (TextView) dVar.findViewById(R.id.pp_bs_text);
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                        attributedText2.setOnUrlClickListener(new a(parsingPermissionFragment, 0));
                        com.avito.android.util.text.j.c(textView2, attributedText2, null);
                        ((Button) dVar.findViewById(R.id.pp_bs_close_button)).setOnClickListener(new S7.a(dVar, 9));
                        dVar.s();
                        com.avito.android.lib.util.g.a(dVar);
                        break;
                    case 3:
                        ParsingPermissionFragment.a aVar4 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_denied_more_text);
                        break;
                    case 4:
                        ParsingPermissionFragment.a aVar5 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_maybe_more_text);
                        break;
                    default:
                        m mVar = parsingPermissionFragment.f93872n0;
                        if (mVar == null) {
                            mVar = null;
                        }
                        C47313c c47313c11 = parsingPermissionFragment.f93877s0;
                        kotlin.reflect.n<Object>[] nVarArr2 = ParsingPermissionFragment.f93868E0;
                        kotlin.reflect.n<Object> nVar112 = nVarArr2[1];
                        CharSequence charSequenceM53getText = ((Input) c47313c11.a()).m53getText();
                        if (charSequenceM53getText == null) {
                            charSequenceM53getText = "";
                        }
                        C47313c c47313c12 = parsingPermissionFragment.f93879u0;
                        kotlin.reflect.n<Object> nVar122 = nVarArr2[3];
                        Editable editableM53getText = ((Input) c47313c12.a()).m53getText();
                        CharSequence charSequence = editableM53getText != null ? editableM53getText : "";
                        PpFlow ppFlow = parsingPermissionFragment.f93871C0;
                        mVar.a3(charSequenceM53getText, charSequence, ppFlow != null ? ppFlow : null);
                        break;
                }
            }
        });
        q5().e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(1, this, ParsingAllowance.f93859c));
        s5().e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(1, this, ParsingAllowance.f93860d));
        final int i16 = 4;
        s5().setImageClickedListener(new View.OnClickListener(this) { // from class: com.avito.android.authorization.gorelkin.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ParsingPermissionFragment f93895c;

            {
                this.f93895c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ParsingPermissionFragment parsingPermissionFragment = this.f93895c;
                switch (i16) {
                    case 0:
                        ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_0);
                        break;
                    case 1:
                        ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_1);
                        break;
                    case 2:
                        ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
                        AttributedText attributedText2 = new AttributedText(parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2), Collections.singletonList(new LinkAttribute("full_attribute", parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2_full_attribute), "full_attribute", null, 8, null)), 0, 4, null);
                        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(parsingPermissionFragment.requireContext(), 0, 2, null);
                        dVar.setContentView(R.layout.parsing_permission_bottom_sheet);
                        TextView textView2 = (TextView) dVar.findViewById(R.id.pp_bs_text);
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                        attributedText2.setOnUrlClickListener(new a(parsingPermissionFragment, 0));
                        com.avito.android.util.text.j.c(textView2, attributedText2, null);
                        ((Button) dVar.findViewById(R.id.pp_bs_close_button)).setOnClickListener(new S7.a(dVar, 9));
                        dVar.s();
                        com.avito.android.lib.util.g.a(dVar);
                        break;
                    case 3:
                        ParsingPermissionFragment.a aVar4 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_denied_more_text);
                        break;
                    case 4:
                        ParsingPermissionFragment.a aVar5 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_maybe_more_text);
                        break;
                    default:
                        m mVar = parsingPermissionFragment.f93872n0;
                        if (mVar == null) {
                            mVar = null;
                        }
                        C47313c c47313c11 = parsingPermissionFragment.f93877s0;
                        kotlin.reflect.n<Object>[] nVarArr2 = ParsingPermissionFragment.f93868E0;
                        kotlin.reflect.n<Object> nVar112 = nVarArr2[1];
                        CharSequence charSequenceM53getText = ((Input) c47313c11.a()).m53getText();
                        if (charSequenceM53getText == null) {
                            charSequenceM53getText = "";
                        }
                        C47313c c47313c12 = parsingPermissionFragment.f93879u0;
                        kotlin.reflect.n<Object> nVar122 = nVarArr2[3];
                        Editable editableM53getText = ((Input) c47313c12.a()).m53getText();
                        CharSequence charSequence = editableM53getText != null ? editableM53getText : "";
                        PpFlow ppFlow = parsingPermissionFragment.f93871C0;
                        mVar.a3(charSequenceM53getText, charSequence, ppFlow != null ? ppFlow : null);
                        break;
                }
            }
        });
        kotlin.reflect.n<Object> nVar14 = nVarArr[0];
        final int i17 = 5;
        ((Button) c47313c2.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.authorization.gorelkin.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ParsingPermissionFragment f93895c;

            {
                this.f93895c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ParsingPermissionFragment parsingPermissionFragment = this.f93895c;
                switch (i17) {
                    case 0:
                        ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_0);
                        break;
                    case 1:
                        ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_disclaimer_1);
                        break;
                    case 2:
                        ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
                        AttributedText attributedText2 = new AttributedText(parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2), Collections.singletonList(new LinkAttribute("full_attribute", parsingPermissionFragment.getString(R.string.parsing_permission_disclaimer_2_full_attribute), "full_attribute", null, 8, null)), 0, 4, null);
                        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(parsingPermissionFragment.requireContext(), 0, 2, null);
                        dVar.setContentView(R.layout.parsing_permission_bottom_sheet);
                        TextView textView2 = (TextView) dVar.findViewById(R.id.pp_bs_text);
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                        attributedText2.setOnUrlClickListener(new a(parsingPermissionFragment, 0));
                        com.avito.android.util.text.j.c(textView2, attributedText2, null);
                        ((Button) dVar.findViewById(R.id.pp_bs_close_button)).setOnClickListener(new S7.a(dVar, 9));
                        dVar.s();
                        com.avito.android.lib.util.g.a(dVar);
                        break;
                    case 3:
                        ParsingPermissionFragment.a aVar4 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_denied_more_text);
                        break;
                    case 4:
                        ParsingPermissionFragment.a aVar5 = ParsingPermissionFragment.f93867D0;
                        parsingPermissionFragment.t5(R.string.parsing_permission_bs_maybe_more_text);
                        break;
                    default:
                        m mVar = parsingPermissionFragment.f93872n0;
                        if (mVar == null) {
                            mVar = null;
                        }
                        C47313c c47313c11 = parsingPermissionFragment.f93877s0;
                        kotlin.reflect.n<Object>[] nVarArr2 = ParsingPermissionFragment.f93868E0;
                        kotlin.reflect.n<Object> nVar112 = nVarArr2[1];
                        CharSequence charSequenceM53getText = ((Input) c47313c11.a()).m53getText();
                        if (charSequenceM53getText == null) {
                            charSequenceM53getText = "";
                        }
                        C47313c c47313c12 = parsingPermissionFragment.f93879u0;
                        kotlin.reflect.n<Object> nVar122 = nVarArr2[3];
                        Editable editableM53getText = ((Input) c47313c12.a()).m53getText();
                        CharSequence charSequence = editableM53getText != null ? editableM53getText : "";
                        PpFlow ppFlow = parsingPermissionFragment.f93871C0;
                        mVar.a3(charSequenceM53getText, charSequence, ppFlow != null ? ppFlow : null);
                        break;
                }
            }
        });
        m mVar = this.f93872n0;
        if (mVar == null) {
            mVar = null;
        }
        mVar.getF93947Q().observe(getViewLifecycleOwner(), new f.a(new c(this)));
        m mVar2 = this.f93872n0;
        if (mVar2 == null) {
            mVar2 = null;
        }
        mVar2.o0().observe(getViewLifecycleOwner(), new f.a(new d(this)));
        m mVar3 = this.f93872n0;
        (mVar3 != null ? mVar3 : null).getF93946P().observe(getViewLifecycleOwner(), new f.a(new e(this)));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Object serializable;
        Bundle bundleRequireArguments = requireArguments();
        int i12 = Build.VERSION.SDK_INT;
        this.f93870B0 = (ParsingPermissionFormContent) (i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_pp_form_content", ParsingPermissionFormContent.class) : bundleRequireArguments.getParcelable("key_pp_form_content"));
        if (i12 >= 33) {
            serializable = bundleRequireArguments.getSerializable("key_pp_flow", PpFlow.class);
        } else {
            Object serializable2 = bundleRequireArguments.getSerializable("key_pp_flow");
            if (!(serializable2 instanceof PpFlow)) {
                serializable2 = null;
            }
            serializable = (PpFlow) serializable2;
        }
        this.f93871C0 = (PpFlow) serializable;
        com.avito.android.authorization.gorelkin.di.a.a().a((com.avito.android.authorization.gorelkin.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.gorelkin.di.c.class), getF42820b(), this).a(this);
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f93873o0;
            InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
            ParsingPermissionFormOpenSource[] parsingPermissionFormOpenSourceArr = ParsingPermissionFormOpenSource.f93920b;
            interfaceC28373a2.c(new C44383a());
        }
    }

    public final ListItemRadio q5() {
        C47313c c47313c = this.f93882x0;
        kotlin.reflect.n<Object> nVar = f93868E0[6];
        return (ListItemRadio) c47313c.a();
    }

    public final ListItemRadio r5() {
        C47313c c47313c = this.f93881w0;
        kotlin.reflect.n<Object> nVar = f93868E0[5];
        return (ListItemRadio) c47313c.a();
    }

    public final ListItemRadio s5() {
        C47313c c47313c = this.f93883y0;
        kotlin.reflect.n<Object> nVar = f93868E0[7];
        return (ListItemRadio) c47313c.a();
    }

    public final void t5(@e0 int i12) {
        String string = getString(i12);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.setContentView(R.layout.parsing_permission_bottom_sheet);
        ((TextView) dVar.findViewById(R.id.pp_bs_text)).setText(string);
        ((Button) dVar.findViewById(R.id.pp_bs_close_button)).setOnClickListener(new S7.a(dVar, 10));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.s();
        com.avito.android.lib.util.g.a(dVar);
    }
}
