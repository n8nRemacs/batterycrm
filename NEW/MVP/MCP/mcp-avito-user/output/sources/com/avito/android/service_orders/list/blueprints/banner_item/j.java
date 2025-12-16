package com.avito.android.service_orders.list.blueprints.banner_item;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersBannerItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.verification.verification_input_inn.o;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import ku0.InterfaceC43499a;

/* compiled from: ServiceOrdersBannerViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/banner_item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_orders/list/blueprints/banner_item/h;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f279269f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f279270b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f279271c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f279272d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f279273e;

    /* compiled from: ServiceOrdersBannerViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/flexbox/FlexboxLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<FlexboxLayout> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f279274l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f279274l = view;
        }

        @Override // Y41.a
        public final FlexboxLayout invoke() {
            View viewFindViewById = this.f279274l.findViewById(R.id.banner_actions_container);
            if (viewFindViewById != null) {
                return (FlexboxLayout) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
    }

    /* compiled from: ServiceOrdersBannerViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f279275l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f279275l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f279275l.findViewById(R.id.orders_banner_subtitle);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public j(@k View view) {
        super(view);
        this.f279270b = view.getContext();
        this.f279271c = (Banner) view;
        this.f279272d = C42727D.c(new b(view));
        this.f279273e = C42727D.c(new a(view));
    }

    @Override // com.avito.android.service_orders.list.blueprints.banner_item.h
    public final void iX(@k ServiceOrdersBannerItem serviceOrdersBannerItem, @k final l<? super DeepLink, G0> lVar, @k Y41.a<G0> aVar) throws Resources.NotFoundException {
        String str = serviceOrdersBannerItem.f279213c;
        Banner banner = this.f279271c;
        banner.setTitle(str);
        ((TextView) this.f279272d.getValue()).setText(serviceOrdersBannerItem.f279214d);
        banner.setCloseButtonVisible(serviceOrdersBannerItem.f279218h != null);
        banner.setCloseButtonListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(9, aVar));
        banner.setAppearance(C35835l0.j(serviceOrdersBannerItem.f279216f.f279226b, this.f279270b));
        InterfaceC42726C interfaceC42726C = this.f279273e;
        FlexboxLayout flexboxLayout = (FlexboxLayout) interfaceC42726C.getValue();
        flexboxLayout.removeAllViews();
        D6.w(flexboxLayout);
        for (final ServiceOrdersBannerItem.a aVar2 : serviceOrdersBannerItem.f279215e) {
            Button button = (Button) LayoutInflater.from(new androidx.appcompat.view.d(banner.getThemedContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.item_banner_action_button, (ViewGroup) interfaceC42726C.getValue(), false);
            com.avito.android.lib.design.button.b.a(button, aVar2.f279227a, false);
            button.setOnClickListener(new o(21, new l0.g(), new InterfaceC43499a() { // from class: com.avito.android.service_orders.list.blueprints.banner_item.i
                @Override // ku0.InterfaceC43499a
                public final void onClick() {
                    int i12 = j.f279269f;
                    ((d) lVar).invoke(aVar2.f279228b);
                }
            }));
            ((FlexboxLayout) interfaceC42726C.getValue()).addView(button);
        }
        D6.H((FlexboxLayout) interfaceC42726C.getValue());
    }
}
