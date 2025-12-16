package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import TI0.a;
import com.avito.android.deep_linking.links.MyAdvertDetailsResult;
import com.avito.android.user_adverts.tab_screens.adverts.n;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutsListListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/Y;", "Lcom/avito/android/user_adverts/tab_screens/adverts/n;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Y implements com.avito.android.user_adverts.tab_screens.adverts.n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e0 f313965a;

    @Inject
    public Y(@Y61.k e0 e0Var) {
        this.f313965a = e0Var;
    }

    @Override // com.avito.android.user_adverts.tab_screens.adverts.n
    public final void a(@Y61.k n.a aVar) {
        boolean z12 = aVar instanceof n.a.C9775a;
        C42822w c42822w = null;
        int i12 = 1;
        boolean z13 = false;
        e0 e0Var = this.f313965a;
        if (!z12) {
            if (aVar instanceof n.a.b) {
                e0Var.accept(new a.h(z13, i12, c42822w));
                e0Var.accept(new a.l(((n.a.b) aVar).f315529a));
                return;
            }
            return;
        }
        MyAdvertDetailsResult myAdvertDetailsResult = ((n.a.C9775a) aVar).f315528a;
        if (myAdvertDetailsResult instanceof MyAdvertDetailsResult.Default) {
            return;
        }
        e0Var.accept(new a.h(z13, i12, c42822w));
        e0Var.accept(new a.l(myAdvertDetailsResult.getF133457b()));
    }
}
