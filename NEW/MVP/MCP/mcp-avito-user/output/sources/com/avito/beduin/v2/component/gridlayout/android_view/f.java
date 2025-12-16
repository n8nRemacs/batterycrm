package com.avito.beduin.v2.component.gridlayout.android_view;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.beduin.v2.component.gridlayout.state.c;
import kotlin.Metadata;

/* compiled from: GridLayoutComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/android_view/f;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f335787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GridLayoutComponent$onCreateView$1$gridLayoutManager$1 f335788f;

    public f(e eVar, GridLayoutComponent$onCreateView$1$gridLayoutManager$1 gridLayoutComponent$onCreateView$1$gridLayoutManager$1) {
        this.f335787e = eVar;
        this.f335788f = gridLayoutComponent$onCreateView$1$gridLayoutManager$1;
        this.f53673c = true;
        this.f53674d = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        b bVar = this.f335787e.f335779o;
        if (bVar == null) {
            bVar = null;
        }
        c.a aVar = (c.a) bVar.f53650c.f53994f.get(i12);
        int i13 = this.f335788f.f53662H;
        Integer num = aVar.f335854b.f335859d;
        return Math.min(i13, num != null ? num.intValue() : 1);
    }
}
