package ru.avito.messenger.internal;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;
import ru.avito.messenger.api.entity.ChannelUser;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "Lru/avito/messenger/api/entity/ChannelUser;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<io.reactivex.rxjava3.core.I<List<ChannelUser>>> f431791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47773d f431792c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f431793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f431794e;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Y41.a<? extends io.reactivex.rxjava3.core.I<List<ChannelUser>>> aVar, C47773d c47773d, String str, List<String> list) {
        this.f431791b = aVar;
        this.f431792c = c47773d;
        this.f431793d = str;
        this.f431794e = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerApi messengerApi = (MessengerApi) obj;
        Y41.a<io.reactivex.rxjava3.core.I<List<ChannelUser>>> aVar = this.f431791b;
        if (aVar != null) {
            return aVar.invoke();
        }
        return this.f431792c.F(messengerApi.getUsers(this.f431793d, this.f431794e).r(s.f431765b), "messenger.getUsers.v2");
    }
}
