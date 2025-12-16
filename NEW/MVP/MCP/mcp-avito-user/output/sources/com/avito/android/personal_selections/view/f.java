package com.avito.android.personal_selections.view;

import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.tab_screens.adverts.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PersonalSelectionsItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_selections/view/f;", "Lcom/avito/android/personal_selections/view/d;", "<init>", "()V", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public u.a f215848b;

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        PersonalSelectionsItem personalSelectionsItem = (PersonalSelectionsItem) aVar;
        hVar.K5(personalSelectionsItem.f215839d);
        hVar.iy(personalSelectionsItem.f215837b, personalSelectionsItem.f215838c);
        hVar.zf();
        hVar.X(new e(this));
    }

    @Override // com.avito.android.personal_selections.view.d
    public final void e() {
        this.f215848b = null;
    }

    @Override // com.avito.android.personal_selections.view.d
    public final void l7(@k u.a aVar) {
        this.f215848b = aVar;
    }
}
