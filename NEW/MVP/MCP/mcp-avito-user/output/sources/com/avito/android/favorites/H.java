package com.avito.android.favorites;

import com.avito.android.favorites.A;
import com.avito.android.remote.model.AdvertStatus;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsServiceInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", AdvertStatus.REMOVED, "Lcom/avito/android/favorites/A$a;", "apply", "(Ljava/util/List;)Lcom/avito/android/favorites/A$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<String> f156279b;

    public H(List<String> list) {
        this.f156279b = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new A.a((List) obj, this.f156279b);
    }
}
