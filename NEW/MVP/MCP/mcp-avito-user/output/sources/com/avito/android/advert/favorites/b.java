package com.avito.android.advert.favorites;

import com.avito.android.favorite.AbstractC30569c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import l41.r;

/* compiled from: AdvertDetailsFavoriteInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite/c;", "it", "", "test", "(Lcom/avito/android/favorite/c;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f71165b;

    public b(String str) {
        this.f71165b = str;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        AbstractC30569c abstractC30569c = (AbstractC30569c) obj;
        boolean z12 = abstractC30569c instanceof AbstractC30569c.a;
        String str = this.f71165b;
        if (z12) {
            return L.f(str, ((AbstractC30569c.a) abstractC30569c).f155167a);
        }
        if (abstractC30569c instanceof AbstractC30569c.b) {
            return ((AbstractC30569c.b) abstractC30569c).f155177a.contains(str);
        }
        return true;
    }
}
