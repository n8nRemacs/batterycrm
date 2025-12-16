package com.avito.android.advert.item.beduin.v2;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.advert.item.beduin.v2.g;
import com.avito.beduin.v2.render.android_view.diff.g;
import com.avito.konveyor.exception.ItemNotSupportedException;
import com.avito.konveyor.exception.ViewTypeCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemCardNativeCellWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/f;", "Lcom/avito/beduin/v2/render/android_view/diff/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements com.avito.beduin.v2.render.android_view.diff.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.conveyor_item.a> f73308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.a f73309b;

    /* compiled from: ItemCardNativeCellWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Integer, View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g.a f73310l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g.a aVar) {
            super(1);
            this.f73310l = aVar;
        }

        @Override // Y41.l
        public final View invoke(Integer num) {
            int iIntValue = num.intValue();
            g.a aVar = this.f73310l;
            View viewInflate = aVar.f73351c.inflate(iIntValue, aVar.f73349a, false);
            if (viewInflate != null) {
                return viewInflate;
            }
            throw new IllegalStateException();
        }
    }

    public f(g.a aVar, List list) {
        this.f73308a = list;
        this.f73309b = aVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void a(int i12, int i13) throws ItemNotSupportedException {
        g.a aVar = this.f73309b;
        g.b bVar = (g.b) aVar.f73349a.getChildAt(i12).getTag();
        com.avito.conveyor_item.a aVar2 = this.f73308a.get(i13);
        com.avito.konveyor.adapter.b bVar2 = bVar.f73353b;
        bVar2.itemView.setTag(new g.b(aVar2, bVar2));
        aVar.f73350b.O5(bVar2, aVar2, 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void b(int i12, int i13) {
        this.f73309b.f73349a.removeViews(i12, i13);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void c(int i12, int i13) throws ItemNotSupportedException, ViewTypeCollisionException {
        com.avito.conveyor_item.a aVar = this.f73308a.get(i13);
        g.a aVar2 = this.f73309b;
        com.avito.konveyor.a aVar3 = aVar2.f73350b;
        int iO2 = aVar3.O(aVar);
        a aVar4 = new a(aVar2);
        ViewGroup viewGroup = aVar2.f73349a;
        com.avito.konveyor.adapter.b bVarK = aVar3.k(viewGroup, iO2, aVar4);
        if (bVarK == null) {
            throw new IllegalStateException();
        }
        bVarK.itemView.setTag(new g.b(aVar, bVarK));
        viewGroup.addView(bVarK.itemView, i12);
        aVar2.f73350b.O5(bVarK, aVar, 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void d(int i12, int i13) {
        g.a aVar = this.f73309b;
        View childAt = aVar.f73349a.getChildAt(i12);
        aVar.f73349a.removeViewAt(i12);
        aVar.f73349a.addView(childAt, i13);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void e(int i12, @Y61.k ArrayList arrayList) {
        g.a.a(this, i12, arrayList);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void f(int i12, @Y61.k ArrayList arrayList) {
        g.a.b(this, i12, arrayList);
    }
}
