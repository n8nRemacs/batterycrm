package com.yandex.div.internal.widget.tabs;

import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.d;
import com.yandex.div2.DivAction;
import java.util.List;

/* compiled from: TabTitlesLayoutView.java */
/* loaded from: classes7.dex */
class u implements BaseIndicatorTabLayout.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f370512a;

    public u(v vVar) {
        this.f370512a = vVar;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.c
    public final void a(BaseIndicatorTabLayout.f fVar) {
        v vVar = this.f370512a;
        if (vVar.f370513H == null) {
            return;
        }
        int i12 = fVar.f370444b;
        List<? extends d.g.b<ACTION>> list = vVar.f370514I;
        if (list != 0) {
            d.g.b bVar = (d.g.b) list.get(i12);
            DivAction divActionA = bVar == null ? null : bVar.a();
            if (divActionA != null) {
                vVar.f370513H.a(i12, divActionA);
            }
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.c
    public final void b(BaseIndicatorTabLayout.f fVar) {
        d.b.a<ACTION> aVar = this.f370512a.f370513H;
        if (aVar == 0) {
            return;
        }
        aVar.b(fVar.f370444b);
    }
}
