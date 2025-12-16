package com.avito.android.bxcontent.mvi;

import TV.e;
import com.avito.android.bxcontent.C29235n;
import com.avito.android.bxcontent.C29253t0;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BxContentSavedSearchPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTV/e;", "event", "Lkotlin/G0;", "accept", "(LTV/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class R0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0 f111457b;

    public R0(P0 p02) {
        this.f111457b = p02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C29235n c29235n;
        TV.e eVar = (TV.e) obj;
        boolean z12 = eVar instanceof e.a;
        P0 p02 = this.f111457b;
        p02.f111439j = z12;
        C29253t0 c29253t0 = p02.f111438i;
        String str = null;
        if (c29253t0 != null && (c29235n = c29253t0.f112947R) != null) {
            c29235n.accept(new InterfaceC29127b.C0(null, z12, 1, null));
        }
        p02.f111435f.d(p02.f111439j);
        if (z12) {
            str = ((e.a) eVar).f15684a;
        } else if (!(eVar instanceof e.b)) {
            throw new NoWhenBranchMatchedException();
        }
        p02.f111440k = str;
        InlineAction.Predefined.State state = z12 ? InlineAction.Predefined.State.f283118b : InlineAction.Predefined.State.f283119c;
        C29253t0 c29253t02 = p02.f111438i;
        if (c29253t02 != null) {
            c29253t02.Q(state, str, p02.f111439j);
        }
    }
}
