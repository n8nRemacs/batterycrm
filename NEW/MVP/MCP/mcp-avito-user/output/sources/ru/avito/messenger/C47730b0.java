package ru.avito.messenger;

import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;

/* compiled from: Messenger.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/b0;", "Lru/avito/messenger/MessengerApi;", "T", "Lru/avito/messenger/s;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.b0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47730b0<T extends MessengerApi> implements InterfaceC47835s<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f430736a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47728a0 f430737b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f430738c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y81.c f430739d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final T f430740e;

    @Inject
    public C47730b0(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC47728a0 interfaceC47728a0, @Y61.k Gson gson, @Y61.k Y81.c cVar, @Y61.k T t12) {
        this.f430736a = interfaceC47842z;
        this.f430737b = interfaceC47728a0;
        this.f430738c = gson;
        this.f430739d = cVar;
        this.f430740e = t12;
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Y81.c getF430739d() {
        return this.f430739d;
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    public final T b() {
        return this.f430740e;
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final Gson getF430738c() {
        return this.f430738c;
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final InterfaceC47842z getF430736a() {
        return this.f430736a;
    }

    @Override // ru.avito.messenger.InterfaceC47835s
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final InterfaceC47728a0 getF430737b() {
        return this.f430737b;
    }
}
