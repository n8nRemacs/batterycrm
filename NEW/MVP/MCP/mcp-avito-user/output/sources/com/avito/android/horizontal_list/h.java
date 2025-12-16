package com.avito.android.horizontal_list;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;
import rs0.InterfaceC47716a;

/* compiled from: HorizontalListWidgetItemViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/horizontal_list/h;", "Lcom/avito/android/horizontal_list/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f162571b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f162572c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f162573d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f162574e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public d f162575f;

    public h(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.h hVar) {
        super(view);
        this.f162571b = hVar;
        j jVar = new j(hVar, aVar);
        this.f162572c = jVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.horizontal_list_widget_recycler_view);
        this.f162573d = recyclerView;
        this.f162574e = (TextView) view.findViewById(R.id.horizontal_list_title);
        recyclerView.setAdapter(jVar);
        recyclerView.o(new g(this));
    }

    @Override // com.avito.android.horizontal_list.f
    public final void U6(@k InterfaceC47716a interfaceC47716a) {
        this.f162575f = (d) interfaceC47716a;
    }

    @Override // com.avito.android.horizontal_list.f
    public final void e3(@l Parcelable parcelable) {
        if (parcelable != null) {
            RecyclerView.m layoutManager = this.f162573d.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.X0(parcelable);
            }
        }
    }

    @Override // com.avito.android.horizontal_list.f
    public final void ie(@k UV0.c cVar) {
        this.f162571b.f338510e = cVar;
        this.f162572c.notifyDataSetChanged();
    }

    @Override // com.avito.android.horizontal_list.f
    @l
    public final Parcelable l1() {
        RecyclerView.m layoutManager = this.f162573d.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.Y0();
        }
        return null;
    }

    @Override // com.avito.android.horizontal_list.f
    public final void setTitle(@l String str) {
        I5.a(this.f162574e, str, false);
    }
}
