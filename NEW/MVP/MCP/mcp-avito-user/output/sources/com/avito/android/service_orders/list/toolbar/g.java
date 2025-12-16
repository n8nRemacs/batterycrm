package com.avito.android.service_orders.list.toolbar;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrdersToolbarActionViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/list/toolbar/g;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f279440d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f279441b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f279442c;

    public g(@k View view) {
        super(view);
        this.f279441b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.srv_orders_toolbar_action_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f279442c = (ImageView) viewFindViewById;
    }
}
