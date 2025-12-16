package com.avito.android.avl_entry.impl.ui.external_item;

import com.avito.android.avl_analytics.AvlEntryType;
import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShortVideosItemPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Ig.d f98542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f98543m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f98544n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Ig.d dVar, b bVar, int i12) {
        super(0);
        this.f98542l = dVar;
        this.f98543m = bVar;
        this.f98544n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Ig.d dVar = this.f98542l;
        boolean f98495b = dVar.getF98495b();
        b bVar = this.f98543m;
        if (f98495b) {
            bVar.f98529g.h(this.f98544n, "video_widget", "item", null, null, (56 & 32) != 0 ? null : C35755b0.c(P0.g(new Q("x", dVar.getXHash()), new Q("cid", dVar.getCategoryId()))), (56 & 64) != 0 ? null : dVar.getF98496c());
        }
        String f72937b = dVar.getF317289b();
        String categoryId = dVar.getCategoryId();
        List<BaseAvlVideoItem> listD1 = dVar.d1();
        ArrayList arrayList = null;
        Integer numValueOf = listD1 != null ? Integer.valueOf(listD1.size()) : null;
        Integer numValueOf2 = Integer.valueOf(this.f98544n);
        AvlEntryType avlEntryType = AvlEntryType.f98425b;
        boolean f98495b2 = dVar.getF98495b();
        List<BaseAvlVideoItem> listD12 = dVar.d1();
        if (listD12 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listD12.iterator();
            while (it.hasNext()) {
                String itemId = ((BaseAvlVideoItem) it.next()).getF98644i();
                if (itemId != null) {
                    arrayList2.add(itemId);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        bVar.f98526d.e(f72937b, categoryId, numValueOf, numValueOf2, f98495b2, arrayList, dVar.getXHash());
        bVar.f98527e.b(true);
        return G0.f406611a;
    }
}
