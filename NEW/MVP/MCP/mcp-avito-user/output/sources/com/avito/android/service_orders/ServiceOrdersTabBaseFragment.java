package com.avito.android.service_orders;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.service_booking_utils.events.HelpLinkClickedEvent;
import com.avito.android.service_orders.ServiceOrdersTabBaseFragment;
import com.avito.android.service_orders.di.b;
import com.avito.android.service_orders.di.t;
import com.avito.android.service_orders.di.u;
import com.avito.android.service_orders.list.ServiceOrdersListFragment;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.ui.fragments.c;
import com.avito.android.util.D6;
import com.google.android.material.appbar.MaterialToolbar;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrdersTabBaseFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/service_orders/ServiceOrdersTabBaseFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/K;", "Lcom/avito/android/service_orders/di/t;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceOrdersTabBaseFragment extends TabBaseFragment implements c, K<t>, InterfaceC28477j.a {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f279053w0 = 0;

    /* renamed from: t0, reason: collision with root package name */
    public t f279054t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f279055u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public iu0.c f279056v0;

    /* compiled from: ServiceOrdersTabBaseFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/ServiceOrdersTabBaseFragment$a;", "", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public ServiceOrdersTabBaseFragment() {
        super(R.layout.service_orders_tab_base_fragment);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        B5(0, null);
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @l
    public final Context m5(@k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        t tVarA = b.a().a((u) C29972i.a(C29972i.b(this), u.class), cv.c.b(this));
        this.f279054t0 = tVarA;
        tVarA.Ji(this);
        super.onCreate(bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        ServiceOrdersArguments serviceOrdersArguments;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serviceOrdersArguments = (ServiceOrdersArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arg.orders_arguments", ServiceOrdersArguments.class) : arguments.getParcelable("arg.orders_arguments"));
        } else {
            serviceOrdersArguments = null;
        }
        if (serviceOrdersArguments == null) {
            throw new IllegalArgumentException("Services orders arguments are not provided");
        }
        Fragment fragmentH = getChildFragmentManager().H("service.bookings_tag");
        if (fragmentH == null) {
            ServiceOrdersListFragment.f279189B0.getClass();
            fragmentH = new ServiceOrdersListFragment();
            Bundle bundle2 = new Bundle(2);
            bundle2.putParcelable("arg.orders_arguments", serviceOrdersArguments);
            fragmentH.setArguments(bundle2);
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(R.id.toolbar);
        final int i12 = 0;
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Hu0.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ServiceOrdersTabBaseFragment f7810c;

            {
                this.f7810c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ServiceOrdersTabBaseFragment serviceOrdersTabBaseFragment = this.f7810c;
                switch (i12) {
                    case 0:
                        int i13 = ServiceOrdersTabBaseFragment.f279053w0;
                        serviceOrdersTabBaseFragment.B5(0, null);
                        serviceOrdersTabBaseFragment.r5();
                        break;
                    default:
                        com.avito.android.deeplink_handler.handler.composite.a aVar = serviceOrdersTabBaseFragment.f279055u0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        b.a.a(aVar, new WebViewLink.OnlyAvitoDomain(Uri.parse("https://support.avito.ru/articles/2796"), null, null, 6, null), null, null, 6);
                        iu0.c cVar = serviceOrdersTabBaseFragment.f279056v0;
                        (cVar != null ? cVar : null).a(HelpLinkClickedEvent.FromPage.f278338c);
                        break;
                }
            }
        });
        materialToolbar.m(R.menu.sb_help_menu);
        View viewFindViewById = view.findViewById(R.id.link_help_textview);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        textView.setText(textView.getResources().getText(R.string.service_booking_help_menu_text));
        final int i13 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Hu0.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ServiceOrdersTabBaseFragment f7810c;

            {
                this.f7810c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ServiceOrdersTabBaseFragment serviceOrdersTabBaseFragment = this.f7810c;
                switch (i13) {
                    case 0:
                        int i132 = ServiceOrdersTabBaseFragment.f279053w0;
                        serviceOrdersTabBaseFragment.B5(0, null);
                        serviceOrdersTabBaseFragment.r5();
                        break;
                    default:
                        com.avito.android.deeplink_handler.handler.composite.a aVar = serviceOrdersTabBaseFragment.f279055u0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        b.a.a(aVar, new WebViewLink.OnlyAvitoDomain(Uri.parse("https://support.avito.ru/articles/2796"), null, null, 6, null), null, null, 6);
                        iu0.c cVar = serviceOrdersTabBaseFragment.f279056v0;
                        (cVar != null ? cVar : null).a(HelpLinkClickedEvent.FromPage.f278338c);
                        break;
                }
            }
        });
        D6.H(textView);
        H hE2 = getChildFragmentManager().e();
        hE2.n(R.id.service_bookings_content, fragmentH, "service.bookings_tag");
        hE2.e();
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        t tVar = this.f279054t0;
        if (tVar != null) {
            return tVar;
        }
        return null;
    }
}
