package ru.avito.messenger.internal;

import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/CreateChunkedVideoFileResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47823g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f431695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f431696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f431697d;

    public C47823g(String str, String str2, String str3) {
        this.f431695b = str;
        this.f431696c = str2;
        this.f431697d = str3;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((MessengerApi) obj).d(this.f431695b, this.f431696c, this.f431697d);
    }
}
