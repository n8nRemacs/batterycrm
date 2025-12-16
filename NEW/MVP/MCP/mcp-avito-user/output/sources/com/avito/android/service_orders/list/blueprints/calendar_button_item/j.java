package com.avito.android.service_orders.list.blueprints.calendar_button_item;

import android.view.View;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrdersListCalendarButtonViewHolder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/calendar_button_item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_orders/list/blueprints/calendar_button_item/g;", "a", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f279290c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItem f279291b;

    /* compiled from: ServiceOrdersListCalendarButtonViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/calendar_button_item/j$a;", "", "<init>", "()V", "", "TOOLTIP_DELAY", "J", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public j(@Y61.k View view) {
        super(view);
        this.f279291b = (ListItem) view;
    }

    @Override // com.avito.android.service_orders.list.blueprints.calendar_button_item.g
    public final void c(@Y61.k final Y41.a<G0> aVar) {
        this.f279291b.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.service_orders.list.blueprints.calendar_button_item.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = j.f279290c;
                aVar.invoke();
            }
        });
    }

    @Override // com.avito.android.service_orders.list.blueprints.calendar_button_item.g
    public final void setTitle(@Y61.k String str) {
        this.f279291b.setTitle(str);
    }

    @Override // com.avito.android.service_orders.list.blueprints.calendar_button_item.g
    public final void ta() {
        this.f279291b.postDelayed(new Runnable() { // from class: com.avito.android.service_orders.list.blueprints.calendar_button_item.i
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = j.f279290c;
                ListItem listItem = this.f279289b.f279291b;
                com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(listItem.getContext(), 0, 0, 6, null);
                p.a(kVar, k.f279292l);
                kVar.f181224j = new r.a(null, 1, null);
                kVar.f(listItem);
            }
        }, 100L);
    }
}
