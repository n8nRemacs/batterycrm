package com.avito.android.comfortable_deal.deal;

import Ep.InterfaceC13517a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wp.InterfaceC49662a;

/* compiled from: DealView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/g;", "Lcom/avito/android/comfortable_deal/deal/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.view.impl.i f121074a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13517a, G0> f121075b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f121076c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC49662a f121077d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.item_visibility_tracker.b f121078e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f121079f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Toolbar f121080g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final RecyclerView f121081h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final FrameLayout f121082i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinearLayout f121083j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Button f121084k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.comfortable_deal.deal.item.digitalregistration.small.dialog.a f121085l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Boolean f121086m;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k View view, @k j jVar, @k com.avito.android.deeplink_handler.view.impl.i iVar, @k l<? super InterfaceC13517a, G0> lVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC49662a interfaceC49662a, @k com.avito.konveyor.item_visibility_tracker.b bVar, boolean z12) {
        this.f121074a = iVar;
        this.f121075b = lVar;
        this.f121076c = aVar;
        this.f121077d = interfaceC49662a;
        this.f121078e = bVar;
        Context context = view.getContext();
        this.f121079f = context;
        View viewFindViewById = view.findViewById(R.id.application_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f121080g = toolbar;
        View viewFindViewById2 = view.findViewById(R.id.application_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f121081h = recyclerView;
        View viewFindViewById3 = view.findViewById(R.id.loading_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f121082i = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.error_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f121083j = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.retry_btn);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f121084k = (Button) viewFindViewById5;
        recyclerView.setItemAnimator(null);
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        recyclerView.setHasFixedSize(true);
        bVar.a(recyclerView, null);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(C35835l0.d(R.attr.black, context));
        }
        D6.G(toolbar, z12);
    }
}
