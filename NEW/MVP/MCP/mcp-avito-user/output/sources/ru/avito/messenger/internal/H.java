package ru.avito.messenger.internal;

import Oq.InterfaceC14725a;
import com.google.gson.Gson;
import java.util.Collections;
import k91.AbstractC42547e;
import k91.C42550h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.MessengerResponse;

/* compiled from: MessengerWebsocketMessageParser.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/H;", "Lru/avito/websocket/A;", "Lru/avito/messenger/api/entity/MessengerResponse;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class H implements ru.avito.websocket.A<MessengerResponse> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f431191a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14725a f431192b;

    public H(@Y61.k Gson gson, @Y61.k InterfaceC14725a interfaceC14725a) {
        this.f431191a = gson;
        this.f431192b = interfaceC14725a;
    }

    @Override // ru.avito.websocket.A
    public final MessengerResponse a(String str) {
        Gson gson = this.f431191a;
        try {
            com.google.gson.i iVar = (com.google.gson.i) gson.d(com.google.gson.i.class, str);
            iVar.getClass();
            if (!(iVar instanceof com.google.gson.k)) {
                return new C42550h();
            }
            if (iVar.i().f362194b.containsKey("jsonrpc")) {
                return (MessengerResponse) com.google.gson.internal.A.b(j91.c.class).cast(gson.c(new com.google.gson.internal.bind.a(iVar), j91.c.class));
            }
            return (MessengerResponse) com.google.gson.internal.A.b(AbstractC42547e.class).cast(gson.c(new com.google.gson.internal.bind.a(iVar), AbstractC42547e.class));
        } catch (Throwable th2) {
            InterfaceC14725a.C0808a.a(this.f431192b, new MessengerResponseBodyConverterException(null, th2, 1, null), Collections.singletonMap("textToConvert", str), 2);
            throw th2;
        }
    }
}
