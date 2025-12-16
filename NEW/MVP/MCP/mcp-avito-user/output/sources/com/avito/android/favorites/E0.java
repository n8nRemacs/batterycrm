package com.avito.android.favorites;

import com.avito.android.select.Arguments;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class E0 extends kotlin.jvm.internal.N implements Y41.l<kotlin.G0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156214l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(C30684r0 c30684r0) {
        super(1);
        this.f156214l = c30684r0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(kotlin.G0 g02) {
        FavoritesFragment favoritesFragment;
        C30684r0 c30684r0 = this.f156214l;
        OrderEntity orderEntityC = c30684r0.f157460c0.c();
        if (orderEntityC != null && (favoritesFragment = c30684r0.f157455Z) != null) {
            com.avito.android.select.bottom_sheet.c.a(favoritesFragment, new Arguments(false, "", null, c30684r0.f157460c0.f156316e, Collections.singletonList(orderEntityC), "", null, false, false, false, false, true, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -40123, 255, null)).show(favoritesFragment.getParentFragmentManager(), "select_fragment");
        }
        return kotlin.G0.f406611a;
    }
}
