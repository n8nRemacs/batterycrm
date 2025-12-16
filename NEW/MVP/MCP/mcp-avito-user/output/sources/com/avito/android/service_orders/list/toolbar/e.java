package com.avito.android.service_orders.list.toolbar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceOrdersToolbarActionPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/toolbar/e;", "Lcom/avito/android/service_orders/list/toolbar/c;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.android.service_orders.list.l f279438b;

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ServiceOrdersListState.ServiceOrdersListToolbar.ServiceOrdersButtonAction serviceOrdersButtonAction = (ServiceOrdersListState.ServiceOrdersListToolbar.ServiceOrdersButtonAction) aVar;
        d dVar = new d(this);
        Context context = gVar.f279441b;
        int i13 = serviceOrdersButtonAction.f279584b;
        Drawable drawableH = C35835l0.h(i13, context);
        if (drawableH != null) {
            drawableH.setTint(C35835l0.d(R.attr.black, context));
        } else {
            drawableH = null;
        }
        ImageView imageView = gVar.f279442c;
        imageView.setImageDrawable(drawableH);
        imageView.setTag(Integer.valueOf(i13));
        imageView.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(9, (Y41.l) dVar, (Parcelable) serviceOrdersButtonAction));
    }

    @Override // com.avito.android.service_orders.list.toolbar.c
    public final void e() {
        this.f279438b = null;
    }

    @Override // com.avito.android.service_orders.list.toolbar.c
    public final void w1(@k com.avito.android.service_orders.list.l lVar) {
        this.f279438b = lVar;
    }
}
