package ru.avito.messenger.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import ru.avito.messenger.MessengerApi;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessagesResponse;
import ru.avito.messenger.internal.D;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<io.reactivex.rxjava3.core.I<List<ChatMessage>>> f431802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f431803c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C47773d f431804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f431805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f431806f;

    public x(Y41.a aVar, Long l12, C47773d c47773d, String str, Integer num) {
        this.f431802b = aVar;
        this.f431803c = l12;
        this.f431804d = c47773d;
        this.f431805e = str;
        this.f431806f = num;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerApi messengerApi = (MessengerApi) obj;
        Y41.a<io.reactivex.rxjava3.core.I<List<ChatMessage>>> aVar = this.f431802b;
        if (aVar != null) {
            return aVar.invoke();
        }
        Integer num = this.f431806f;
        String str = this.f431805e;
        C47773d c47773d = this.f431804d;
        Long l12 = this.f431803c;
        return (l12 == null ? c47773d.F(messengerApi.latestMessages(str, num), "messenger.history.v2") : c47773d.F(messengerApi.j(str, l12, num), "messenger.history.v2")).r(new D.a(new h0() { // from class: ru.avito.messenger.internal.w
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj2) {
                return ((ChatMessagesResponse) obj2).getMessages();
            }
        }));
    }
}
