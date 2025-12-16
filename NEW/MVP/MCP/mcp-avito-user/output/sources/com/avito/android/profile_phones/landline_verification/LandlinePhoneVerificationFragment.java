package com.avito.android.profile_phones.landline_verification;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.view.P0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import com.avito.android.profile_phones.landline_verification.di.b;
import com.avito.android.profile_phones.landline_verification.f;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.registration.RequestCodeResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: LandlinePhoneVerificationFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LandlinePhoneVerificationFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f227160z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    public CollapsingTitleAppBarLayout f227161n0;

    /* renamed from: o0, reason: collision with root package name */
    public TextView f227162o0;

    /* renamed from: p0, reason: collision with root package name */
    public TextView f227163p0;

    /* renamed from: q0, reason: collision with root package name */
    public TextView f227164q0;

    /* renamed from: r0, reason: collision with root package name */
    public Button f227165r0;

    /* renamed from: s0, reason: collision with root package name */
    public Button f227166s0;

    /* renamed from: t0, reason: collision with root package name */
    public ViewAnimator f227167t0;

    /* renamed from: u0, reason: collision with root package name */
    public LandlinePhoneVerificationViewModel f227168u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public m f227169v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f227170w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f227171x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f227172y0;

    /* compiled from: LandlinePhoneVerificationFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationFragment$a;", "", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public LandlinePhoneVerificationFragment() {
        super(0, 1, null);
    }

    public static final void q5(LandlinePhoneVerificationFragment landlinePhoneVerificationFragment, boolean z12) {
        Button button = landlinePhoneVerificationFragment.f227165r0;
        if (button == null) {
            button = null;
        }
        boolean z13 = !z12;
        button.setEnabled(z13);
        Button button2 = landlinePhoneVerificationFragment.f227165r0;
        if (button2 == null) {
            button2 = null;
        }
        button2.setLoading(z12);
        Button button3 = landlinePhoneVerificationFragment.f227166s0;
        if (button3 == null) {
            button3 = null;
        }
        button3.setEnabled(z13);
        Button button4 = landlinePhoneVerificationFragment.f227166s0;
        (button4 != null ? button4 : null).setLoading(z12);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.landline_phone_verification, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel = this.f227168u0;
        if (landlinePhoneVerificationViewModel == null) {
            landlinePhoneVerificationViewModel = null;
        }
        landlinePhoneVerificationViewModel.le(landlinePhoneVerificationViewModel.f227178K);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel = this.f227168u0;
        if (landlinePhoneVerificationViewModel == null) {
            landlinePhoneVerificationViewModel = null;
        }
        y yVar = landlinePhoneVerificationViewModel.f227180M;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        m mVar = this.f227169v0;
        if (mVar == null) {
            mVar = null;
        }
        this.f227168u0 = (LandlinePhoneVerificationViewModel) new P0(this, mVar).a(LandlinePhoneVerificationViewModel.class);
        View viewFindViewById = view.findViewById(R.id.subtitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f227162o0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.bot_error);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f227164q0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.state_call_ordered);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        View viewFindViewById4 = view.findViewById(R.id.action_and_state_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ViewAnimator");
        }
        this.f227167t0 = (ViewAnimator) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById5;
        this.f227163p0 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        View viewFindViewById6 = view.findViewById(R.id.app_bar);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.CollapsingTitleAppBarLayout");
        }
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) viewFindViewById6;
        this.f227161n0 = collapsingTitleAppBarLayout;
        CollapsingTitleAppBarLayout.m(collapsingTitleAppBarLayout, R.drawable.ic_back_24);
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout2 = this.f227161n0;
        if (collapsingTitleAppBarLayout2 == null) {
            collapsingTitleAppBarLayout2 = null;
        }
        collapsingTitleAppBarLayout2.setClickListener(new e(this));
        View viewFindViewById7 = view.findViewById(R.id.cancel_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i12 = 2;
        ((Button) viewFindViewById7).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.landline_verification.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LandlinePhoneVerificationFragment f227221c;

            {
                this.f227221c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel;
                String str;
                String str2;
                String str3;
                String str4 = "";
                LandlinePhoneVerificationFragment landlinePhoneVerificationFragment = this.f227221c;
                switch (i12) {
                    case 0:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel2 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel2 != null ? landlinePhoneVerificationViewModel2 : null;
                        landlinePhoneVerificationViewModel.f227181N.setValue(LandlinePhoneVerificationViewModel.d.a.f227210a);
                        LandlinePhoneVerificationViewModel.a aVar = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar != null && (str = aVar.f227200e) != null) {
                            str4 = str;
                        }
                        io.reactivex.rxjava3.internal.observers.m mVar2 = landlinePhoneVerificationViewModel.f227179L;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        j jVar = landlinePhoneVerificationViewModel.f227176E;
                        I<TypedResult<G0>> i13 = jVar.f227232a.i(str4);
                        InterfaceC35745a5 interfaceC35745a5 = jVar.f227234c;
                        landlinePhoneVerificationViewModel.f227179L = (io.reactivex.rxjava3.internal.observers.m) g1.a(i13.z(interfaceC35745a5.a())).s(interfaceC35745a5.e()).x(new q(landlinePhoneVerificationViewModel, str4), new r(landlinePhoneVerificationViewModel));
                        break;
                    case 1:
                        TextView textView2 = landlinePhoneVerificationFragment.f227164q0;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        D6.w(textView2);
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel3 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel3 != null ? landlinePhoneVerificationViewModel3 : null;
                        landlinePhoneVerificationViewModel.f227181N.setValue(LandlinePhoneVerificationViewModel.d.a.f227210a);
                        LandlinePhoneVerificationViewModel.a aVar2 = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar2 != null && (str2 = aVar2.f227200e) != null) {
                            str4 = str2;
                        }
                        io.reactivex.rxjava3.internal.observers.m mVar3 = landlinePhoneVerificationViewModel.f227179L;
                        if (mVar3 != null) {
                            DisposableHelper.a(mVar3);
                        }
                        j jVar2 = landlinePhoneVerificationViewModel.f227176E;
                        jVar2.getClass();
                        RequestCodeV2Source requestCodeV2Source = RequestCodeV2Source.f119426c;
                        I<TypedResult<RequestCodeResult>> iK2 = jVar2.f227233b.k(str4, false, "profile:add");
                        InterfaceC35745a5 interfaceC35745a52 = jVar2.f227234c;
                        landlinePhoneVerificationViewModel.f227179L = (io.reactivex.rxjava3.internal.observers.m) iK2.z(interfaceC35745a52.a()).s(interfaceC35745a52.e()).x(new o(landlinePhoneVerificationViewModel, str4), new p(landlinePhoneVerificationViewModel));
                        break;
                    case 2:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel4 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel4 != null ? landlinePhoneVerificationViewModel4 : null;
                        LandlinePhoneVerificationViewModel.a aVar3 = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar3 != null && (str3 = aVar3.f227200e) != null) {
                            str4 = str3;
                        }
                        landlinePhoneVerificationViewModel.f227182O.setValue(new LandlinePhoneVerificationViewModel.c.C6901c(str4, LandlinePhoneVerificationViewModel.ResultStatus.f227192c));
                        break;
                    default:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel5 = landlinePhoneVerificationFragment.f227168u0;
                        (landlinePhoneVerificationViewModel5 != null ? landlinePhoneVerificationViewModel5 : null).f227182O.setValue(LandlinePhoneVerificationViewModel.c.a.f227206a);
                        break;
                }
            }
        });
        View viewFindViewById8 = view.findViewById(R.id.accept_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById8;
        this.f227166s0 = button;
        final int i13 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.landline_verification.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LandlinePhoneVerificationFragment f227221c;

            {
                this.f227221c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel;
                String str;
                String str2;
                String str3;
                String str4 = "";
                LandlinePhoneVerificationFragment landlinePhoneVerificationFragment = this.f227221c;
                switch (i13) {
                    case 0:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel2 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel2 != null ? landlinePhoneVerificationViewModel2 : null;
                        landlinePhoneVerificationViewModel.f227181N.setValue(LandlinePhoneVerificationViewModel.d.a.f227210a);
                        LandlinePhoneVerificationViewModel.a aVar = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar != null && (str = aVar.f227200e) != null) {
                            str4 = str;
                        }
                        io.reactivex.rxjava3.internal.observers.m mVar2 = landlinePhoneVerificationViewModel.f227179L;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        j jVar = landlinePhoneVerificationViewModel.f227176E;
                        I<TypedResult<G0>> i132 = jVar.f227232a.i(str4);
                        InterfaceC35745a5 interfaceC35745a5 = jVar.f227234c;
                        landlinePhoneVerificationViewModel.f227179L = (io.reactivex.rxjava3.internal.observers.m) g1.a(i132.z(interfaceC35745a5.a())).s(interfaceC35745a5.e()).x(new q(landlinePhoneVerificationViewModel, str4), new r(landlinePhoneVerificationViewModel));
                        break;
                    case 1:
                        TextView textView2 = landlinePhoneVerificationFragment.f227164q0;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        D6.w(textView2);
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel3 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel3 != null ? landlinePhoneVerificationViewModel3 : null;
                        landlinePhoneVerificationViewModel.f227181N.setValue(LandlinePhoneVerificationViewModel.d.a.f227210a);
                        LandlinePhoneVerificationViewModel.a aVar2 = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar2 != null && (str2 = aVar2.f227200e) != null) {
                            str4 = str2;
                        }
                        io.reactivex.rxjava3.internal.observers.m mVar3 = landlinePhoneVerificationViewModel.f227179L;
                        if (mVar3 != null) {
                            DisposableHelper.a(mVar3);
                        }
                        j jVar2 = landlinePhoneVerificationViewModel.f227176E;
                        jVar2.getClass();
                        RequestCodeV2Source requestCodeV2Source = RequestCodeV2Source.f119426c;
                        I<TypedResult<RequestCodeResult>> iK2 = jVar2.f227233b.k(str4, false, "profile:add");
                        InterfaceC35745a5 interfaceC35745a52 = jVar2.f227234c;
                        landlinePhoneVerificationViewModel.f227179L = (io.reactivex.rxjava3.internal.observers.m) iK2.z(interfaceC35745a52.a()).s(interfaceC35745a52.e()).x(new o(landlinePhoneVerificationViewModel, str4), new p(landlinePhoneVerificationViewModel));
                        break;
                    case 2:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel4 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel4 != null ? landlinePhoneVerificationViewModel4 : null;
                        LandlinePhoneVerificationViewModel.a aVar3 = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar3 != null && (str3 = aVar3.f227200e) != null) {
                            str4 = str3;
                        }
                        landlinePhoneVerificationViewModel.f227182O.setValue(new LandlinePhoneVerificationViewModel.c.C6901c(str4, LandlinePhoneVerificationViewModel.ResultStatus.f227192c));
                        break;
                    default:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel5 = landlinePhoneVerificationFragment.f227168u0;
                        (landlinePhoneVerificationViewModel5 != null ? landlinePhoneVerificationViewModel5 : null).f227182O.setValue(LandlinePhoneVerificationViewModel.c.a.f227206a);
                        break;
                }
            }
        });
        View viewFindViewById9 = view.findViewById(R.id.ok_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i14 = 3;
        ((Button) viewFindViewById9).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.landline_verification.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LandlinePhoneVerificationFragment f227221c;

            {
                this.f227221c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel;
                String str;
                String str2;
                String str3;
                String str4 = "";
                LandlinePhoneVerificationFragment landlinePhoneVerificationFragment = this.f227221c;
                switch (i14) {
                    case 0:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel2 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel2 != null ? landlinePhoneVerificationViewModel2 : null;
                        landlinePhoneVerificationViewModel.f227181N.setValue(LandlinePhoneVerificationViewModel.d.a.f227210a);
                        LandlinePhoneVerificationViewModel.a aVar = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar != null && (str = aVar.f227200e) != null) {
                            str4 = str;
                        }
                        io.reactivex.rxjava3.internal.observers.m mVar2 = landlinePhoneVerificationViewModel.f227179L;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        j jVar = landlinePhoneVerificationViewModel.f227176E;
                        I<TypedResult<G0>> i132 = jVar.f227232a.i(str4);
                        InterfaceC35745a5 interfaceC35745a5 = jVar.f227234c;
                        landlinePhoneVerificationViewModel.f227179L = (io.reactivex.rxjava3.internal.observers.m) g1.a(i132.z(interfaceC35745a5.a())).s(interfaceC35745a5.e()).x(new q(landlinePhoneVerificationViewModel, str4), new r(landlinePhoneVerificationViewModel));
                        break;
                    case 1:
                        TextView textView2 = landlinePhoneVerificationFragment.f227164q0;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        D6.w(textView2);
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel3 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel3 != null ? landlinePhoneVerificationViewModel3 : null;
                        landlinePhoneVerificationViewModel.f227181N.setValue(LandlinePhoneVerificationViewModel.d.a.f227210a);
                        LandlinePhoneVerificationViewModel.a aVar2 = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar2 != null && (str2 = aVar2.f227200e) != null) {
                            str4 = str2;
                        }
                        io.reactivex.rxjava3.internal.observers.m mVar3 = landlinePhoneVerificationViewModel.f227179L;
                        if (mVar3 != null) {
                            DisposableHelper.a(mVar3);
                        }
                        j jVar2 = landlinePhoneVerificationViewModel.f227176E;
                        jVar2.getClass();
                        RequestCodeV2Source requestCodeV2Source = RequestCodeV2Source.f119426c;
                        I<TypedResult<RequestCodeResult>> iK2 = jVar2.f227233b.k(str4, false, "profile:add");
                        InterfaceC35745a5 interfaceC35745a52 = jVar2.f227234c;
                        landlinePhoneVerificationViewModel.f227179L = (io.reactivex.rxjava3.internal.observers.m) iK2.z(interfaceC35745a52.a()).s(interfaceC35745a52.e()).x(new o(landlinePhoneVerificationViewModel, str4), new p(landlinePhoneVerificationViewModel));
                        break;
                    case 2:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel4 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel4 != null ? landlinePhoneVerificationViewModel4 : null;
                        LandlinePhoneVerificationViewModel.a aVar3 = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar3 != null && (str3 = aVar3.f227200e) != null) {
                            str4 = str3;
                        }
                        landlinePhoneVerificationViewModel.f227182O.setValue(new LandlinePhoneVerificationViewModel.c.C6901c(str4, LandlinePhoneVerificationViewModel.ResultStatus.f227192c));
                        break;
                    default:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel5 = landlinePhoneVerificationFragment.f227168u0;
                        (landlinePhoneVerificationViewModel5 != null ? landlinePhoneVerificationViewModel5 : null).f227182O.setValue(LandlinePhoneVerificationViewModel.c.a.f227206a);
                        break;
                }
            }
        });
        View viewFindViewById10 = view.findViewById(R.id.state_call_order);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById10;
        this.f227165r0 = button2;
        final int i15 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.landline_verification.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LandlinePhoneVerificationFragment f227221c;

            {
                this.f227221c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel;
                String str;
                String str2;
                String str3;
                String str4 = "";
                LandlinePhoneVerificationFragment landlinePhoneVerificationFragment = this.f227221c;
                switch (i15) {
                    case 0:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel2 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel2 != null ? landlinePhoneVerificationViewModel2 : null;
                        landlinePhoneVerificationViewModel.f227181N.setValue(LandlinePhoneVerificationViewModel.d.a.f227210a);
                        LandlinePhoneVerificationViewModel.a aVar = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar != null && (str = aVar.f227200e) != null) {
                            str4 = str;
                        }
                        io.reactivex.rxjava3.internal.observers.m mVar2 = landlinePhoneVerificationViewModel.f227179L;
                        if (mVar2 != null) {
                            DisposableHelper.a(mVar2);
                        }
                        j jVar = landlinePhoneVerificationViewModel.f227176E;
                        I<TypedResult<G0>> i132 = jVar.f227232a.i(str4);
                        InterfaceC35745a5 interfaceC35745a5 = jVar.f227234c;
                        landlinePhoneVerificationViewModel.f227179L = (io.reactivex.rxjava3.internal.observers.m) g1.a(i132.z(interfaceC35745a5.a())).s(interfaceC35745a5.e()).x(new q(landlinePhoneVerificationViewModel, str4), new r(landlinePhoneVerificationViewModel));
                        break;
                    case 1:
                        TextView textView2 = landlinePhoneVerificationFragment.f227164q0;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        D6.w(textView2);
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel3 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel3 != null ? landlinePhoneVerificationViewModel3 : null;
                        landlinePhoneVerificationViewModel.f227181N.setValue(LandlinePhoneVerificationViewModel.d.a.f227210a);
                        LandlinePhoneVerificationViewModel.a aVar2 = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar2 != null && (str2 = aVar2.f227200e) != null) {
                            str4 = str2;
                        }
                        io.reactivex.rxjava3.internal.observers.m mVar3 = landlinePhoneVerificationViewModel.f227179L;
                        if (mVar3 != null) {
                            DisposableHelper.a(mVar3);
                        }
                        j jVar2 = landlinePhoneVerificationViewModel.f227176E;
                        jVar2.getClass();
                        RequestCodeV2Source requestCodeV2Source = RequestCodeV2Source.f119426c;
                        I<TypedResult<RequestCodeResult>> iK2 = jVar2.f227233b.k(str4, false, "profile:add");
                        InterfaceC35745a5 interfaceC35745a52 = jVar2.f227234c;
                        landlinePhoneVerificationViewModel.f227179L = (io.reactivex.rxjava3.internal.observers.m) iK2.z(interfaceC35745a52.a()).s(interfaceC35745a52.e()).x(new o(landlinePhoneVerificationViewModel, str4), new p(landlinePhoneVerificationViewModel));
                        break;
                    case 2:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel4 = landlinePhoneVerificationFragment.f227168u0;
                        landlinePhoneVerificationViewModel = landlinePhoneVerificationViewModel4 != null ? landlinePhoneVerificationViewModel4 : null;
                        LandlinePhoneVerificationViewModel.a aVar3 = landlinePhoneVerificationViewModel.f227178K;
                        if (aVar3 != null && (str3 = aVar3.f227200e) != null) {
                            str4 = str3;
                        }
                        landlinePhoneVerificationViewModel.f227182O.setValue(new LandlinePhoneVerificationViewModel.c.C6901c(str4, LandlinePhoneVerificationViewModel.ResultStatus.f227192c));
                        break;
                    default:
                        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel5 = landlinePhoneVerificationFragment.f227168u0;
                        (landlinePhoneVerificationViewModel5 != null ? landlinePhoneVerificationViewModel5 : null).f227182O.setValue(LandlinePhoneVerificationViewModel.c.a.f227206a);
                        break;
                }
            }
        });
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel = this.f227168u0;
        if (landlinePhoneVerificationViewModel == null) {
            landlinePhoneVerificationViewModel = null;
        }
        landlinePhoneVerificationViewModel.f227182O.observe(getViewLifecycleOwner(), new f.a(new b(this)));
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel2 = this.f227168u0;
        if (landlinePhoneVerificationViewModel2 == null) {
            landlinePhoneVerificationViewModel2 = null;
        }
        landlinePhoneVerificationViewModel2.f227181N.observe(getViewLifecycleOwner(), new f.a(new c(this)));
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel3 = this.f227168u0;
        if (landlinePhoneVerificationViewModel3 == null) {
            landlinePhoneVerificationViewModel3 = null;
        }
        landlinePhoneVerificationViewModel3.f227183P.observe(getViewLifecycleOwner(), new f.a(new d(this)));
        Bundle bundleRequireArguments = requireArguments();
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel4 = this.f227168u0;
        if (landlinePhoneVerificationViewModel4 == null) {
            landlinePhoneVerificationViewModel4 = null;
        }
        int i16 = bundleRequireArguments.getInt("arg_call_id");
        String string = bundleRequireArguments.getString("arg_title", "");
        String string2 = bundleRequireArguments.getString("arg_subtitle", "");
        AttributedText attributedText = (AttributedText) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arg_description", AttributedText.class) : bundleRequireArguments.getParcelable("arg_description"));
        AttributedText attributedText2 = attributedText == null ? new AttributedText("", C42784z0.f406748b, 0, 4, null) : attributedText;
        String string3 = bundleRequireArguments.getString("arg_phone", "");
        boolean z12 = bundleRequireArguments.getBoolean("arg_is_manual", false);
        if (landlinePhoneVerificationViewModel4.f227178K == null) {
            LandlinePhoneVerificationViewModel.a aVar = new LandlinePhoneVerificationViewModel.a(i16, string, string2, attributedText2, string3, z12, false, 64, null);
            LandlinePhoneVerificationViewModel.a aVar2 = landlinePhoneVerificationViewModel4.f227178K;
            AttributedText attributedText3 = aVar2 != null ? aVar2.f227199d : null;
            if (attributedText3 != null) {
                attributedText3.setOnUrlClickListener(null);
            }
            AttributedText attributedText4 = aVar.f227199d;
            if (attributedText4 != null) {
                attributedText4.setOnUrlClickListener(landlinePhoneVerificationViewModel4.f227177J);
            }
            landlinePhoneVerificationViewModel4.f227178K = aVar;
            landlinePhoneVerificationViewModel4.me(aVar);
            landlinePhoneVerificationViewModel4.le(aVar);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.profile_phones.landline_verification.di.a.a();
        aVarA.a((com.avito.android.profile_phones.landline_verification.di.c) C29972i.a(C29972i.b(this), com.avito.android.profile_phones.landline_verification.di.c.class));
        aVarA.build().a(this);
    }
}
