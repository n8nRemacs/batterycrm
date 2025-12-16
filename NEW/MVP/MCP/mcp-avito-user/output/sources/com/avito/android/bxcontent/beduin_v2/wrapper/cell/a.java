package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.serp.adapter.l1;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.diff.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BxCellWrapperComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/h;", "Landroid/view/ViewGroup;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC36333c<h, ViewGroup> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f109573m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final e f109574n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public m f109575o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public CellWrapper f109576p;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k com.avito.konveyor.a aVar, @Y61.k e eVar) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f109573m = aVar;
        this.f109574n = eVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, h hVar) {
        ViewGroup viewGroup = (ViewGroup) view;
        h hVar2 = hVar;
        m mVar = this.f109575o;
        if (mVar == null) {
            mVar = new m(viewGroup, this.f109573m);
            this.f109575o = mVar;
        }
        CellWrapper cellWrapper = hVar2.f109585a;
        this.f109576p = cellWrapper;
        u(mVar, cellWrapper);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    public final void u(m mVar, CellWrapper cellWrapper) {
        List<l1> listA = this.f109574n.a(cellWrapper);
        mVar.getClass();
        com.avito.beduin.v2.render.android_view.diff.h.a(e.b.a(com.avito.beduin.v2.render.android_view.diff.e.f337969a, new n(mVar, listA)), new o(mVar, listA));
    }
}
