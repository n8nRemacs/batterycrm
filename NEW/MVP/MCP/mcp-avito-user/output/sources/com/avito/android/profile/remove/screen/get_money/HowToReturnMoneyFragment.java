package com.avito.android.profile.remove.screen.get_money;

import Y41.l;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile.pro.impl.screen.item.recommendations.h;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import cv.c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HowToReturnMoneyFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/remove/screen/get_money/HowToReturnMoneyFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HowToReturnMoneyFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @k
    public static final a f224046r0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f224047n0;

    /* renamed from: o0, reason: collision with root package name */
    public Button f224048o0;

    /* renamed from: p0, reason: collision with root package name */
    public TextView f224049p0;

    /* renamed from: q0, reason: collision with root package name */
    public TextView f224050q0;

    /* compiled from: HowToReturnMoneyFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/screen/get_money/HowToReturnMoneyFragment$a;", "", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: HowToReturnMoneyFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyFragment$a$a, reason: collision with other inner class name */
        public static final class C6787a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ HowToReturnMoneyParams f224051l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6787a(HowToReturnMoneyParams howToReturnMoneyParams) {
                super(1);
                this.f224051l = howToReturnMoneyParams;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arg_key_how_to_return_money_fragment", this.f224051l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static HowToReturnMoneyFragment a(@k HowToReturnMoneyParams howToReturnMoneyParams) {
            HowToReturnMoneyFragment howToReturnMoneyFragment = new HowToReturnMoneyFragment();
            C35966w1.a(howToReturnMoneyFragment, -1, new C6787a(howToReturnMoneyParams));
            return howToReturnMoneyFragment;
        }

        public a() {
        }
    }

    public HowToReturnMoneyFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.how_to_return_money_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.tv_title_return_money);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224049p0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_description_return_money);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224050q0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.btn_return_money);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f224048o0 = (Button) viewFindViewById3;
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arg_key_how_to_return_money_fragment", HowToReturnMoneyParams.class) : bundleRequireArguments.getParcelable("arg_key_how_to_return_money_fragment");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        HowToReturnMoneyParams howToReturnMoneyParams = (HowToReturnMoneyParams) parcelable;
        TextView textView = this.f224049p0;
        if (textView == null) {
            textView = null;
        }
        textView.setText(howToReturnMoneyParams.f224052b);
        TextView textView2 = this.f224050q0;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(howToReturnMoneyParams.f224053c);
        Button button = this.f224048o0;
        if (button == null) {
            button = null;
        }
        button.setText(howToReturnMoneyParams.f224054d);
        Button button2 = this.f224048o0;
        (button2 != null ? button2 : null).setOnClickListener(new h(5, howToReturnMoneyParams, this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.profile.remove.screen.get_money.di.a.a().a(this, c.b(this)).a(this);
    }
}
