package com.avito.android.bxcontent.utils;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.remote.model.widget_settings.VerticalMargins;
import com.avito.android.util.y6;
import com.avito.konveyor.adapter.i;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qs0.InterfaceC47435a;

/* compiled from: BxContentCommonItemDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/utils/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<RecyclerView.l> f113024b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Rect f113025c = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k List<? extends RecyclerView.l> list) {
        this.f113024b = list;
    }

    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        for (RecyclerView.l lVar : this.f113024b) {
            Rect rect2 = this.f113025c;
            rect2.setEmpty();
            lVar.getItemOffsets(rect2, view, recyclerView, zVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iU2;
        Object adapter = recyclerView.getAdapter();
        i iVar = adapter instanceof i ? (i) adapter : null;
        TV0.a item = (iVar == null || (iU2 = RecyclerView.U(view)) == -1) ? null : iVar.getItem(iU2);
        if (!(item instanceof InterfaceC47435a)) {
            c(rect, view, recyclerView, zVar);
            return;
        }
        Settings f270101e = ((InterfaceC47435a) item).getF270101e();
        VerticalMargins verticalMargins = f270101e != null ? f270101e.getVerticalMargins() : null;
        if (verticalMargins == null) {
            c(rect, view, recyclerView, zVar);
            return;
        }
        rect.top = y6.b(verticalMargins.getTop());
        rect.bottom = y6.b(verticalMargins.getBottom());
        for (RecyclerView.l lVar : this.f113024b) {
            Rect rect2 = this.f113025c;
            rect2.setEmpty();
            lVar.getItemOffsets(rect2, view, recyclerView, zVar);
            rect.left += rect2.left;
            rect.right += rect2.right;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Iterator<T> it = this.f113024b.iterator();
        while (it.hasNext()) {
            ((RecyclerView.l) it.next()).onDraw(canvas, recyclerView, zVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Iterator<T> it = this.f113024b.iterator();
        while (it.hasNext()) {
            ((RecyclerView.l) it.next()).onDrawOver(canvas, recyclerView, zVar);
        }
    }
}
