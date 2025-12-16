package ru.avito.messenger.internal;

import com.avito.android.remote.model.messenger.geo.GeoPoint;
import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/geo/GeoSearchSuggests;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f431755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GeoPoint f431756c;

    public m(String str, GeoPoint geoPoint) {
        this.f431755b = str;
        this.f431756c = geoPoint;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((MessengerApi) obj).i(this.f431755b, this.f431756c);
    }
}
