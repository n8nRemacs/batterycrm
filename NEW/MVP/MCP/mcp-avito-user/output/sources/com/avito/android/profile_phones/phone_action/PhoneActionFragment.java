package com.avito.android.profile_phones.phone_action;

import Y61.k;
import Y61.l;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.view.P0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile_phones.phone_action.di.b;
import com.avito.android.profile_phones.phone_action.h;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneActionCode;
import com.avito.android.select.Arguments;
import com.avito.android.select.p;
import com.avito.android.ui.fragments.BaseFragment;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.AppBarLayoutWithIconAction;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: PhoneActionFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/PhoneActionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/select/p;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneActionFragment extends BaseFragment implements p, InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @k
    public static final a f227250u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    public AppBarLayoutWithIconAction f227251n0;

    /* renamed from: o0, reason: collision with root package name */
    public View f227252o0;

    /* renamed from: p0, reason: collision with root package name */
    public Button f227253p0;

    /* renamed from: q0, reason: collision with root package name */
    public ComponentContainer f227254q0;

    /* renamed from: r0, reason: collision with root package name */
    public Input f227255r0;

    /* renamed from: s0, reason: collision with root package name */
    public com.avito.android.profile_phones.phone_action.view_model.a f227256s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile_phones.phone_action.view_model.b f227257t0;

    /* compiled from: PhoneActionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/PhoneActionFragment$a;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public PhoneActionFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.select.p
    @l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.select.p
    public final void j(@k String str, @l String str2, @k List list) {
        com.avito.android.profile_phones.phone_action.view_model.a aVar = this.f227256s0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.q(list);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.phone_action_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Input input = this.f227255r0;
        if (input == null) {
            input = null;
        }
        input.f();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.profile_phones.phone_action.view_model.b bVar = this.f227257t0;
        if (bVar == null) {
            bVar = null;
        }
        this.f227256s0 = (com.avito.android.profile_phones.phone_action.view_model.a) new P0(this, bVar).a(com.avito.android.profile_phones.phone_action.view_model.d.class);
        View viewFindViewById = view.findViewById(R.id.action_confirm_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f227253p0 = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.anchor_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f227252o0 = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.phone_input_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f227254q0 = (ComponentContainer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.phone_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById4;
        this.f227255r0 = input;
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179290g);
        Button button = this.f227253p0;
        if (button == null) {
            button = null;
        }
        button.setOnClickListener(new com.avito.android.profile_phones.phone_action.a(this, 0));
        View viewFindViewById5 = view.findViewById(R.id.app_bar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.AppBarLayoutWithIconAction");
        }
        AppBarLayoutWithIconAction appBarLayoutWithIconAction = (AppBarLayoutWithIconAction) viewFindViewById5;
        this.f227251n0 = appBarLayoutWithIconAction;
        CollapsingTitleAppBarLayout.m(appBarLayoutWithIconAction, R.drawable.ic_close_24);
        AppBarLayoutWithIconAction appBarLayoutWithIconAction2 = this.f227251n0;
        if (appBarLayoutWithIconAction2 == null) {
            appBarLayoutWithIconAction2 = null;
        }
        appBarLayoutWithIconAction2.setClickListener(new g(this));
        com.avito.android.profile_phones.phone_action.view_model.a aVar = this.f227256s0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.S0().observe(getViewLifecycleOwner(), new h.a(new b(this)));
        com.avito.android.profile_phones.phone_action.view_model.a aVar2 = this.f227256s0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.z1().observe(getViewLifecycleOwner(), new h.a(new c(this)));
        com.avito.android.profile_phones.phone_action.view_model.a aVar3 = this.f227256s0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.getF227330Q().observe(getViewLifecycleOwner(), new h.a(new d(this)));
        com.avito.android.profile_phones.phone_action.view_model.a aVar4 = this.f227256s0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        aVar4.getF227331R().observe(getViewLifecycleOwner(), new h.a(new e(this)));
        com.avito.android.profile_phones.phone_action.view_model.a aVar5 = this.f227256s0;
        (aVar5 != null ? aVar5 : null).getF227332S().observe(getViewLifecycleOwner(), new h.a(new f(this)));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle bundleRequireArguments = requireArguments();
        com.avito.android.profile_phones.phone_action.di.d dVar = new com.avito.android.profile_phones.phone_action.di.d(getResources(), (PhoneActionCode) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("phone_action", PhoneActionCode.class) : bundleRequireArguments.getParcelable("phone_action")), bundleRequireArguments.getString("phone"), bundleRequireArguments.getInt("adverts_number", 0), bundleRequireArguments.getParcelableArrayList("phones_for_replacement"));
        b.a aVarA = com.avito.android.profile_phones.phone_action.di.a.a();
        aVarA.a(dVar);
        aVarA.b((com.avito.android.profile_phones.phone_action.di.c) C29972i.a(C29972i.b(this), com.avito.android.profile_phones.phone_action.di.c.class));
        aVarA.build().a(this);
    }

    @Override // com.avito.android.select.p
    public final void q(@k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@k String str) {
    }
}
