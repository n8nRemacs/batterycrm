package com.avito.android.safety.sessions.social_logout;

import com.avito.android.analytics.screens.utils.D;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.safety.sessions.social_logout.i;
import kotlin.Metadata;

/* compiled from: SessionsSocialLogoutPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f258039b;

    public j(q qVar) {
        this.f258039b = qVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        q qVar = this.f258039b;
        w wVar = qVar.f258051g;
        if (wVar != null) {
            Button button = wVar.f258066d;
            button.setLoading(true);
            button.setClickable(false);
        }
        i.b bVar = qVar.f258046b;
        qVar.f258054j = D.b(qVar.f258045a.c(bVar.f258034b, bVar.f258035c, bVar.f258036d, bVar.f258037e).j0(qVar.f258047c.e()).L(new C31684n(qVar, 18)), qVar.f258050f, null, new o(1, qVar, q.class, "handleLoadingResult", "handleLoadingResult(Lcom/avito/android/util/LoadingState;)V", 0), p.f258044l, 6);
    }
}
