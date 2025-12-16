package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar;

import VU.b;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchPositionBottomBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVU/b;", "invoke", "()LVU/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.a<VU.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchPositionBottomBar f221290l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SearchPositionBottomBar searchPositionBottomBar) {
        super(0);
        this.f221290l = searchPositionBottomBar;
    }

    @Override // Y41.a
    public final VU.b invoke() {
        b.a aVar = VU.b.f17147t;
        SearchPositionBottomBar searchPositionBottomBar = this.f221290l;
        Context context = searchPositionBottomBar.getContext();
        int iJ2 = C35835l0.j(R.attr.buttonPrimaryLarge, searchPositionBottomBar.getContext());
        aVar.getClass();
        return b.a.c(iJ2, context);
    }
}
