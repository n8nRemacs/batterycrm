package com.avito.android.libs.saved_searches.domain;

import TV.e;
import com.avito.android.analytics.event.C28449x0;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionInteractorRx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/saved_searches/model/SubscriptionResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/saved_searches/model/SubscriptionResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f181472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f181473c;

    public m(t tVar, String str) {
        this.f181472b = tVar;
        this.f181473c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        t tVar = this.f181472b;
        com.avito.android.db.n nVar = tVar.f181478b;
        String str = this.f181473c;
        nVar.k(str);
        C28449x0 c28449x0 = new C28449x0(tVar.f181478b.q());
        TV.c cVar = tVar.f181479c;
        cVar.e(c28449x0);
        cVar.i(new e.b(str));
    }
}
