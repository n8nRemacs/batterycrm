package com.avito.android.seller_coach.adverts_hint.view;

import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import com.avito.android.seller_coach.adverts_hint.view.f;
import kotlin.Metadata;

/* compiled from: ShortAdvicesStackView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/e;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f267333d;

    public e(b bVar) {
        this.f267333d = bVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        b bVar = this.f267333d;
        bVar.f267324b.a(new f.a.b((UserAdvertsHintItem) bVar.f267326d.f442667d.get(i12 % bVar.f267326d.f442667d.size())));
    }
}
