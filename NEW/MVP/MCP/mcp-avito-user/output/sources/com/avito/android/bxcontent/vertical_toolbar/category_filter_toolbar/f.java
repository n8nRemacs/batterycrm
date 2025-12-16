package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.b;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerticalCategoryFilterToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/e;", "updatedItems", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f113079b;

    public f(b bVar) {
        this.f113079b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.serp.adapter.vertical_main.category_vertical_filter.d dVar;
        Filter.Config config;
        int i12 = b.f113056o;
        b bVar = this.f113079b;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ((List) obj).iterator();
        while (it.hasNext()) {
            Filter filter = ((com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e) it.next()).f273466c;
            if (filter != null) {
                arrayList.add(filter);
            }
        }
        b.C3319b c3319bC = b.c(arrayList);
        bVar.f113066k = c3319bC;
        l lVar = bVar.f113061f;
        if (lVar == null || (dVar = bVar.f113064i) == null) {
            return;
        }
        Filter filter2 = c3319bC.f113070a;
        if (filter2 != null) {
            Filter.Widget widget = filter2.getWidget();
            AttributedText attributedDisplayTitle = (widget == null || (config = widget.getConfig()) == null) ? null : config.getAttributedDisplayTitle();
            if (attributedDisplayTitle != null) {
                lVar.i(attributedDisplayTitle);
            } else {
                String displayTitle = filter2.getDisplayTitle();
                if (displayTitle == null) {
                    displayTitle = filter2.getTitle();
                }
                lVar.f(displayTitle);
            }
            if (L.f(filter2.getId(), "locationGroup")) {
                lVar.c();
            }
        }
        bVar.f(dVar);
        bVar.d(dVar);
    }
}
