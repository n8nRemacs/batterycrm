package ru.avito.messenger.internal;

import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f431759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f431760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f431761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f431762e;

    public o(String str, String str2, Integer num, String str3) {
        this.f431759b = str;
        this.f431760c = str2;
        this.f431761d = num;
        this.f431762e = str3;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerApi messengerApi = (MessengerApi) obj;
        String str = this.f431760c;
        Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        String str2 = this.f431762e;
        if (str2 == null) {
            str2 = "";
        }
        return messengerApi.k(this.f431759b, lValueOf, this.f431761d, str2);
    }
}
