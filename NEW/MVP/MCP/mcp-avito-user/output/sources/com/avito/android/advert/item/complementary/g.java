package com.avito.android.advert.item.complementary;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.favorite.n;
import com.avito.android.section.v;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RestyleComplementarySectionBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/section/v;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/section/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements p<ViewGroup, View, v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f74604l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(2);
        this.f74604l = hVar;
    }

    @Override // Y41.p
    public final v invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        h hVar = this.f74604l;
        return new v(hVar.f74605a, (com.avito.konveyor.adapter.a) hVar.f74606b.get(), (n) hVar.f74607c.get(), (com.avito.android.advert.viewed.f) hVar.f74608d.get(), view2, new com.avito.android.section.title.e(view2), hVar.f74609e, new com.avito.android.section.complementary.a(view2.getResources()));
    }
}
