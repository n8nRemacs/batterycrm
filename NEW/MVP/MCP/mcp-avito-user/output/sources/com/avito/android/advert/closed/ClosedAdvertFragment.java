package com.avito.android.advert.closed;

import V3.a;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.M;
import com.avito.android.R;
import com.avito.android.advert.item.ClosedAdvertArguments;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.P5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rg.C47652a;

/* compiled from: ClosedAdvertFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/closed/ClosedAdvertFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ClosedAdvertFragment extends TabBaseFragment implements InterfaceC28477j.a {

    /* renamed from: x0, reason: collision with root package name */
    @k
    public static final a f68834x0 = new a(null);

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public M f68835t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f68836u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public C47652a f68837v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final NavigationState f68838w0;

    /* compiled from: ClosedAdvertFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/closed/ClosedAdvertFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ClosedAdvertFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert.closed.ClosedAdvertFragment$a$a, reason: collision with other inner class name */
        public static final class C2154a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ClosedAdvertArguments f68839l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2154a(ClosedAdvertArguments closedAdvertArguments) {
                super(1);
                this.f68839l = closedAdvertArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("closed_advert_arguments", this.f68839l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ClosedAdvertFragment a(@k ClosedAdvertArguments closedAdvertArguments) {
            ClosedAdvertFragment closedAdvertFragment = new ClosedAdvertFragment();
            C35966w1.a(closedAdvertFragment, -1, new C2154a(closedAdvertArguments));
            return closedAdvertFragment;
        }

        public a() {
        }
    }

    /* compiled from: ClosedAdvertFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ClosedAdvertFragment() {
        super(0, 1, null);
        this.f68838w0 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.ac_advert_details_closed, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        o5(toolbar);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.setTitle("");
        }
        Button button = (Button) view.findViewById(R.id.ac_action_button);
        TextView textView = (TextView) view.findViewById(R.id.ac_description);
        Bundle arguments = getArguments();
        ClosedAdvertArguments closedAdvertArguments = arguments != null ? (ClosedAdvertArguments) arguments.getParcelable("closed_advert_arguments") : null;
        if (textView != null) {
            textView.setText(closedAdvertArguments != null ? closedAdvertArguments.f71602b : null);
        }
        if (toolbar != null) {
            P5.c(toolbar, R.attr.black);
        }
        if (button != null) {
            button.setOnClickListener(new com.avito.android.advert.closed.b(0, this, closedAdvertArguments));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).Sf().a(cv.c.d(this)).a(this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF188914F0() {
        return this.f68838w0;
    }
}
