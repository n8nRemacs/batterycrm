package com.avito.android.personal_selections.view;

import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import com.avito.android.user_adverts.tab_screens.adverts.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l70.InterfaceC43570a;

/* compiled from: PersonalSelectionsItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f215847l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(0);
        this.f215847l = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        u.a aVar = this.f215847l.f215848b;
        if (aVar != null) {
            UserAdvertsListMviFragment.C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            aVar.f315724a.v5().accept(InterfaceC43570a.C11775a.f413535a);
        }
        return G0.f406611a;
    }
}
