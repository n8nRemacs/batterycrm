package com.avito.android.user_adverts.tab_actions.host;

import android.view.ViewGroup;
import com.avito.android.user_adverts.root_screen.adverts_host.C35566d;
import com.avito.android.user_adverts.tab_actions.host.f;

/* compiled from: UserAdvertsActionsView_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class m implements f.c {

    /* renamed from: a, reason: collision with root package name */
    public final l f314376a;

    public m(l lVar) {
        this.f314376a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.user_adverts.tab_actions.host.f.c
    public final f a(ViewGroup viewGroup, C35566d c35566d) {
        l lVar = this.f314376a;
        return new f(viewGroup, c35566d, lVar.f314373a.get(), (com.avito.konveyor.adapter.j) lVar.f314374b.get(), lVar.f314375c.get());
    }
}
