package com.avito.android.advert.item.beduin.v2;

import com.avito.android.advert.item.beduin.v2.g;
import com.avito.beduin.v2.render.android_view.diff.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemCardNativeCellWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/e;", "Lcom/avito/beduin/v2/render/android_view/diff/e$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.a f73306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.conveyor_item.a> f73307b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(g.a aVar, List<? extends com.avito.conveyor_item.a> list) {
        this.f73306a = aVar;
        this.f73307b = list;
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final boolean a(int i12, int i13) {
        g.b bVar = (g.b) this.f73306a.f73349a.getChildAt(i12).getTag();
        com.avito.conveyor_item.a aVar = this.f73307b.get(i13);
        com.avito.conveyor_item.a aVar2 = bVar.f73352a;
        return aVar2.getClass() == aVar.getClass() && L.f(aVar2.getF296143b(), aVar.getF296143b());
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final boolean b(int i12, int i13) {
        g.b bVar = (g.b) this.f73306a.f73349a.getChildAt(i12).getTag();
        return L.f(bVar.f73352a, this.f73307b.get(i13));
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final int c() {
        return this.f73306a.f73349a.getChildCount();
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.e.a
    public final int d() {
        return this.f73307b.size();
    }
}
