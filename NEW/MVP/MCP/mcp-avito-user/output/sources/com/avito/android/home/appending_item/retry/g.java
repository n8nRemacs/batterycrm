package com.avito.android.home.appending_item.retry;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.C29235n;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.inline_filters.InterfaceC31062w;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppendingRetryItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f162237l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(0);
        this.f162237l = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        BxContentFragment.A0 a02 = this.f162237l.f162238b;
        if (a02 == null) {
            a02 = null;
        }
        a02.getClass();
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        BxContentFragment bxContentFragment = BxContentFragment.this;
        C29235n c29235nZ5 = bxContentFragment.Z5();
        InterfaceC31062w interfaceC31062w = bxContentFragment.f108996e1;
        c29235nZ5.accept(new InterfaceC29127b.C29142h0((interfaceC31062w != null ? interfaceC31062w : null).W0()));
        return G0.f406611a;
    }
}
