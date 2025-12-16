package io.ktor.serialization.kotlinx;

import io.ktor.serialization.WebsocketConverterNotFoundException;
import io.ktor.websocket.AbstractC41723i;
import kotlin.Metadata;

/* compiled from: KotlinxWebsocketSerializationConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/serialization/kotlinx/m;", "Lio/ktor/serialization/h;", "ktor-serialization-kotlinx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m implements io.ktor.serialization.h {
    @Override // io.ktor.serialization.h
    @Y61.l
    public final Object a(@Y61.k AbstractC41723i abstractC41723i) throws WebsocketConverterNotFoundException {
        if (b(abstractC41723i)) {
            throw null;
        }
        throw new WebsocketConverterNotFoundException("Unsupported frame " + abstractC41723i.f401558b.name(), null, 2, null);
    }

    @Override // io.ktor.serialization.h
    public final boolean b(@Y61.k AbstractC41723i abstractC41723i) {
        return (abstractC41723i instanceof AbstractC41723i.f) || (abstractC41723i instanceof AbstractC41723i.a);
    }
}
