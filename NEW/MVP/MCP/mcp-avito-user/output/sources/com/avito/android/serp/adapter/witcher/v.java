package com.avito.android.serp.adapter.witcher;

import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.rich_snippets.realty.DevelopmentItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: WitcherItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class v extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<List<PersistableSerpItem>> f273894l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l0.h<List<PersistableSerpItem>> hVar) {
        super(0);
        this.f273894l = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        for (PersistableSerpItem persistableSerpItem : this.f273894l.f406842b) {
            if (persistableSerpItem instanceof AdvertItem) {
                ((AdvertItem) persistableSerpItem).f268421a1 = null;
            } else if (persistableSerpItem instanceof DevelopmentItem) {
                ((DevelopmentItem) persistableSerpItem).f270911t = null;
            } else if (persistableSerpItem instanceof SerpConstructorAdvertItem) {
                ((SerpConstructorAdvertItem) persistableSerpItem).setItemClickListener(null);
            }
        }
        return G0.f406611a;
    }
}
