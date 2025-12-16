package com.avito.android.notification_center.list.item;

import android.view.View;
import hr.C40973b;
import hr.InterfaceC40972a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationCenterListItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification_center/list/item/s;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/notification_center/list/item/r;", "Lhr/a;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s extends com.avito.konveyor.adapter.b implements r, InterfaceC40972a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f207633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C40973b f207634c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f207635d;

    public s(@Y61.k View view) {
        super(view);
        this.f207633b = view;
        this.f207634c = new C40973b(view);
    }

    @Override // hr.InterfaceC40972a
    public final void R10() {
        this.f207634c.R10();
    }

    @Override // hr.InterfaceC40972a
    public final void St() {
        this.f207634c.St();
    }

    @Override // hr.InterfaceC40972a
    public final void b0(@Y61.k String str) {
        this.f207634c.b0(str);
    }

    @Override // hr.InterfaceC40972a
    public final void c(@Y61.l Y41.a<G0> aVar) {
        this.f207634c.c(aVar);
    }

    @Override // com.avito.android.notification_center.list.item.r
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f207635d = aVar;
    }

    @Override // hr.InterfaceC40972a
    public final void h(@Y61.k String str) {
        this.f207634c.h(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f207635d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // hr.InterfaceC40972a
    public final void setTitle(@Y61.k String str) {
        this.f207634c.setTitle(str);
    }
}
