package com.avito.android.horizontal_list;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: HorizontalListWidgetItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/horizontal_list/e;", "LXQ/a;", "Lcom/avito/android/horizontal_list/f;", "Lcom/avito/android/horizontal_list/HorizontalListWidgetItem;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements XQ.a<f, HorizontalListWidgetItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final rs0.c f162569b;

    public e(@k rs0.c cVar) {
        this.f162569b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        HorizontalListWidgetItem horizontalListWidgetItem = (HorizontalListWidgetItem) aVar;
        UV0.c cVar = new UV0.c(horizontalListWidgetItem.f162540d);
        fVar.setTitle(horizontalListWidgetItem.f162539c);
        fVar.ie(cVar);
        fVar.e3(this.f162569b.a(horizontalListWidgetItem.f162544h));
        fVar.U6(new d(fVar, this, horizontalListWidgetItem));
    }

    @Override // XQ.a
    @l
    public final XQ.b d0() {
        return null;
    }
}
