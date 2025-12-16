package ru.avito.messenger.internal;

import com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest;
import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/get_settings/GetSettingsResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetSettingsRequest.ForAutoReplies f431764b;

    public r(GetSettingsRequest.ForAutoReplies forAutoReplies) {
        this.f431764b = forAutoReplies;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((MessengerApi) obj).getSettings(this.f431764b.getFields());
    }
}
