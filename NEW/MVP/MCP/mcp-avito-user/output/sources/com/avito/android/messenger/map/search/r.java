package com.avito.android.messenger.map.search;

import com.avito.android.messenger.map.search.h;
import com.avito.android.messenger.map.search.t;
import kotlin.Metadata;

/* compiled from: GeoSearchPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/h$a;", "newInteractorState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/map/search/h$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f196590b;

    public r(t tVar) {
        this.f196590b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        t tVar = this.f196590b;
        tVar.le().s(new t.a(tVar, (h.a) obj));
    }
}
