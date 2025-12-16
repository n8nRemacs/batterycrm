package com.avito.android.messenger.channels.mvi.view;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsHeaderView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/o;", "Lcom/avito/android/messenger/channels/mvi/view/j;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.view.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31886o implements InterfaceC31881j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f188777b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f188778c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f188779d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.filter.a f188780e;

    /* renamed from: f, reason: collision with root package name */
    public final Resources f188781f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Toolbar f188782g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f188783h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f188784i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Chips f188785j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final b f188786k;

    /* compiled from: ChannelsHeaderView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.view.o$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f188787l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            oVar.a(R.string.messenger_auto_replies_onboarding_tooltip_text);
            return G0.f406611a;
        }
    }

    /* compiled from: Renderer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/arch/mvi/utils/v", "Lcom/avito/android/arch/mvi/utils/u;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.view.o$b */
    public static final class b implements com.avito.android.arch.mvi.utils.u<FY.d, FY.a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public FY.d f188788b;

        public b() {
        }
    }

    public C31886o(@Y61.k View view, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.messenger.channels.filter.a aVar2) {
        this.f188777b = view;
        this.f188778c = aVar;
        this.f188779d = interfaceC28373a;
        this.f188780e = aVar2;
        this.f188781f = view.getResources();
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f188782g = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.screen_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f188783h = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.connection_indicator);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f188784i = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.messenger_channels_toolbar_filter_chips);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f188785j = (Chips) viewFindViewById4;
        this.f188786k = new b();
    }

    public final boolean b() throws Resources.NotFoundException {
        ArrayList<View> arrayList = new ArrayList<>();
        String string = this.f188781f.getString(R.string.messenger_auto_replies_button_description);
        Toolbar toolbar = this.f188782g;
        toolbar.findViewsWithText(arrayList, string, 2);
        View view = (View) C42745f0.G(arrayList);
        if (view == null) {
            return false;
        }
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(toolbar.getContext(), 0, 0, 6, null);
        int i12 = kVar.f181229o;
        kVar.f181228n = -2;
        kVar.f181229o = i12;
        i.b bVar = new i.b(new b.a());
        bVar.f181210c = Integer.valueOf(y6.b(8));
        r.a aVar = new r.a(bVar);
        aVar.m(y6.b(0));
        aVar.j(y6.b(-6));
        kVar.f181224j = aVar;
        com.avito.android.lib.design.tooltip.p.a(kVar, a.f188787l);
        return kVar.f(view) != null;
    }
}
