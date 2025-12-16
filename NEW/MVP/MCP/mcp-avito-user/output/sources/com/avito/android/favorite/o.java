package com.avito.android.favorite;

import com.avito.android.favorite.AbstractC30569c;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite/c;", "event", "Lkotlin/G0;", "accept", "(Lcom/avito/android/favorite/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f155227b;

    public o(p pVar) {
        this.f155227b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AbstractC30569c abstractC30569c = (AbstractC30569c) obj;
        boolean z12 = abstractC30569c instanceof AbstractC30569c.b;
        p pVar = this.f155227b;
        if (z12) {
            p.a(pVar, ((AbstractC30569c.b) abstractC30569c).f155177a, false);
        } else if (abstractC30569c instanceof AbstractC30569c.a) {
            p.a(pVar, Collections.singletonList(((AbstractC30569c.a) abstractC30569c).f155167a), true);
        }
    }
}
