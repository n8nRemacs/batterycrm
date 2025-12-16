package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar;

import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchPositionBottomBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchPositionBottomBar f221289l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SearchPositionBottomBar searchPositionBottomBar) {
        super(0);
        this.f221289l = searchPositionBottomBar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SearchPositionBottomButtonState searchPositionBottomButtonState;
        e eVar = this.f221289l.f221275i;
        if (eVar != null) {
            e.a aVar = eVar instanceof e.a ? (e.a) eVar : null;
            if (aVar != null && (searchPositionBottomButtonState = aVar.f221296e) != null) {
                searchPositionBottomButtonState.f221283d.invoke(searchPositionBottomButtonState.f221280a);
            }
        }
        return G0.f406611a;
    }
}
