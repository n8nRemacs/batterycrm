package com.avito.android.favorite_sellers.adapter.advert_list;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.favorite.n;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertListItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/favorite_sellers/adapter/advert_list/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/favorite_sellers/adapter/advert_list/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements p<ViewGroup, View, i> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f155499l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(2);
        this.f155499l = bVar;
    }

    @Override // Y41.p
    public final i invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        b bVar = this.f155499l;
        return new i(bVar.f155520a, (com.avito.konveyor.adapter.a) bVar.f155521b.get(), (n) bVar.f155522c.get(), (com.avito.android.advert.viewed.f) bVar.f155523d.get(), view2, bVar.f155524e);
    }
}
