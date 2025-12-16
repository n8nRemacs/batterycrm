package com.avito.android.profile_phones.confirm_phone;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import com.avito.android.code_confirmation.code_confirmation.j0;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile_phones.confirm_phone.i;
import com.avito.android.profile_phones.confirm_phone.l;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.AppBarLayoutWithIconAction;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: ConfirmPhoneFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/ConfirmPhoneFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ConfirmPhoneFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f226969E0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f226970A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f226971B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<l.b.C6895b> f226972C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<l.b.c> f226973D0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public y f226974n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f226975o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public H2 f226976p0;

    /* renamed from: q0, reason: collision with root package name */
    public AppBarLayoutWithIconAction f226977q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f226978r0;

    /* renamed from: s0, reason: collision with root package name */
    public com.avito.android.lib.design.ticking_button.b f226979s0;

    /* renamed from: t0, reason: collision with root package name */
    public ComponentContainer f226980t0;

    /* renamed from: u0, reason: collision with root package name */
    public Input f226981u0;

    /* renamed from: v0, reason: collision with root package name */
    public j0 f226982v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final IntentFilter f226983w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.google.android.gms.auth.api.phone.f f226984x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public l f226985y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.phone_reverification_info.d f226986z0;

    /* compiled from: ConfirmPhoneFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/ConfirmPhoneFragment$a;", "", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConfirmPhoneFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            Input input = ConfirmPhoneFragment.this.f226981u0;
            if (input == null) {
                input = null;
            }
            Input.t(input, str, false, 6);
        }
    }

    /* compiled from: ConfirmPhoneFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f226988b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to receive sms from code receiver", (Throwable) obj);
        }
    }

    /* compiled from: ConfirmPhoneFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Boolean, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            AppBarLayoutWithIconAction appBarLayoutWithIconAction = ConfirmPhoneFragment.this.f226977q0;
            if (appBarLayoutWithIconAction == null) {
                appBarLayoutWithIconAction = null;
            }
            appBarLayoutWithIconAction.setExpanded(!zBooleanValue);
            return G0.f406611a;
        }
    }

    public ConfirmPhoneFragment() {
        super(0, 1, null);
        this.f226975o0 = new io.reactivex.rxjava3.disposables.c();
        this.f226983w0 = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        this.f226972C0 = registerForActivityResult(new e(this), new C28629h(3));
        this.f226973D0 = registerForActivityResult(new com.avito.android.profile_phones.confirm_phone.d(this), new C28629h(3));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.confirm_phone, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        H2 h22 = this.f226976p0;
        if (h22 != null) {
            h22.dispose();
        }
        Input input = this.f226981u0;
        if (input == null) {
            input = null;
        }
        input.f();
        y yVar = this.f226974n0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f226975o0.e();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        com.avito.android.lib.design.ticking_button.b bVar = this.f226979s0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("key_current_time", bVar.f180945e);
        bundle2.putLong("key_initial_time", bVar.f180946f);
        bundle2.putLong("key_timestamp_sec", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        bundle.putBundle("ticker_button_state", bundle2);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        IntentFilter intentFilter = this.f226983w0;
        com.google.android.gms.auth.api.phone.f fVar = this.f226984x0;
        if (fVar == null) {
            fVar = null;
        }
        this.f226982v0 = new j0(activityC22955mRequireActivity, intentFilter, fVar);
        Bundle bundle2 = bundle != null ? bundle.getBundle("ticker_button_state") : null;
        View viewFindViewById = view.findViewById(R.id.anchor_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f226978r0 = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ticker_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        com.avito.android.lib.design.ticking_button.b bVar = new com.avito.android.lib.design.ticking_button.b((Button) viewFindViewById2, getString(R.string.new_code_text), null, bundle2, 4, null);
        this.f226979s0 = bVar;
        bVar.f180941a.setOnClickListener(new ViewOnClickListenerC31042l(10, new f(this)));
        View viewFindViewById3 = view.findViewById(R.id.phone_confirm_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f226980t0 = (ComponentContainer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.code_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById4;
        this.f226981u0 = input;
        input.setInputType(2);
        Input input2 = this.f226981u0;
        if (input2 == null) {
            input2 = null;
        }
        input2.v();
        l lVar = this.f226985y0;
        if (lVar == null) {
            lVar = null;
        }
        Input input3 = this.f226981u0;
        if (input3 == null) {
            input3 = null;
        }
        lVar.m6(com.avito.android.lib.design.input.n.e(input3));
        View viewFindViewById5 = view.findViewById(R.id.app_bar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.AppBarLayoutWithIconAction");
        }
        AppBarLayoutWithIconAction appBarLayoutWithIconAction = (AppBarLayoutWithIconAction) viewFindViewById5;
        this.f226977q0 = appBarLayoutWithIconAction;
        CollapsingTitleAppBarLayout.m(appBarLayoutWithIconAction, R.drawable.ic_back_24);
        AppBarLayoutWithIconAction appBarLayoutWithIconAction2 = this.f226977q0;
        if (appBarLayoutWithIconAction2 == null) {
            appBarLayoutWithIconAction2 = null;
        }
        appBarLayoutWithIconAction2.setClickListener(new g(this));
        l lVar2 = this.f226985y0;
        if (lVar2 == null) {
            lVar2 = null;
        }
        lVar2.S0().observe(getViewLifecycleOwner(), new i.a(new com.avito.android.profile_phones.confirm_phone.a(this)));
        l lVar3 = this.f226985y0;
        if (lVar3 == null) {
            lVar3 = null;
        }
        lVar3.z1().observe(getViewLifecycleOwner(), new i.a(new com.avito.android.profile_phones.confirm_phone.b(this)));
        l lVar4 = this.f226985y0;
        if (lVar4 == null) {
            lVar4 = null;
        }
        lVar4.getF227081R().observe(getViewLifecycleOwner(), new i.a(new com.avito.android.profile_phones.confirm_phone.c(this)));
        j0 j0Var = this.f226982v0;
        if (j0Var == null) {
            j0Var = null;
        }
        this.f226974n0 = (y) j0Var.connect().v0(new b(), c.f226988b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        int i12 = getResources().getConfiguration().orientation;
        if (i12 == 1) {
            AppBarLayoutWithIconAction appBarLayoutWithIconAction3 = this.f226977q0;
            (appBarLayoutWithIconAction3 != null ? appBarLayoutWithIconAction3 : null).postDelayed(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 22), 200L);
        } else {
            if (i12 != 2) {
                return;
            }
            ActivityC22955m activityC22955mL1 = l1();
            this.f226976p0 = activityC22955mL1 != null ? K2.a(activityC22955mL1, new d()) : null;
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle bundleRequireArguments = requireArguments();
        String string = bundleRequireArguments.getString("phone");
        boolean z12 = bundleRequireArguments.getBoolean("code_request_needed");
        String string2 = bundleRequireArguments.getString("src_code_confirmation");
        if (string2 == null) {
            string2 = "";
        }
        RequestCodeV2Source[] requestCodeV2SourceArrValues = RequestCodeV2Source.values();
        int iF2 = P0.f(requestCodeV2SourceArrValues.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (RequestCodeV2Source requestCodeV2Source : requestCodeV2SourceArrValues) {
            linkedHashMap.put(requestCodeV2Source.f119430b, requestCodeV2Source);
        }
        RequestCodeV2Source requestCodeV2Source2 = linkedHashMap.containsKey(string2) ? (RequestCodeV2Source) linkedHashMap.get(string2) : RequestCodeV2Source.f119426c;
        boolean z13 = bundleRequireArguments.getBoolean("phone_validation_needed");
        Integer numValueOf = bundleRequireArguments.containsKey("code_length") ? Integer.valueOf(bundleRequireArguments.getInt("code_length")) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 5;
        Long lValueOf = bundleRequireArguments.containsKey("timeout") ? Long.valueOf(bundleRequireArguments.getLong("timeout")) : null;
        com.avito.android.profile_phones.confirm_phone.di.e.a().a((com.avito.android.profile_phones.confirm_phone.di.b) C29972i.a(C29972i.b(this), com.avito.android.profile_phones.confirm_phone.di.b.class), cv.c.b(this), requireActivity(), getF42820b(), getResources(), this, new k(string, iIntValue, lValueOf != null ? lValueOf.longValue() : 0L, z12, z13, requestCodeV2Source2)).a(this);
    }
}
