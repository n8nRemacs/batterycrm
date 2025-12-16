package com.avito.android.advert.item.complementary.redesign;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.advert.viewed.f;
import com.avito.android.favorite.n;
import com.avito.android.section.o;
import com.avito.android.section.title.e;
import com.avito.android.section.v;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComplementarySectionRedesignBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/section/v;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/section/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements p<ViewGroup, View, v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f74616l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(2);
        this.f74616l = bVar;
    }

    @Override // Y41.p
    public final v invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        b bVar = this.f74616l;
        o oVar = bVar.f74617a;
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) bVar.f74618b.get();
        n nVar = (n) bVar.f74619c.get();
        f fVar = (f) bVar.f74620d.get();
        D6.f(view2, 0, 0, 0, 0, 13);
        G0 g02 = G0.f406611a;
        return new v(oVar, aVar, nVar, fVar, view2, new e(view2), bVar.f74621e, new com.avito.android.section.complementary.a(view2.getResources()));
    }
}
