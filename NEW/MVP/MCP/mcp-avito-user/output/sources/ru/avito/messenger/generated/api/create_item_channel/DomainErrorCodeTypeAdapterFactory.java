package ru.avito.messenger.generated.api.create_item_channel;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.generated.api.create_item_channel.DomainError;

/* compiled from: DomainErrorCodeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/DomainErrorCodeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "DomainErrorCodeTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DomainErrorCodeTypeAdapterFactory implements r {

    /* compiled from: DomainErrorCodeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/DomainErrorCodeTypeAdapterFactory$DomainErrorCodeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/create_item_channel/DomainError$Code;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DomainErrorCodeTypeAdapter extends TypeAdapter<DomainError.Code> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<DomainError.Code> f430794a;

        public DomainErrorCodeTypeAdapter(@k TypeAdapter<DomainError.Code> typeAdapter) {
            this.f430794a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final DomainError.Code read(a aVar) {
            DomainError.Code code = this.f430794a.read(aVar);
            return code == null ? DomainError.Code.CoreError : code;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, DomainError.Code code) {
            this.f430794a.write(cVar, code);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), DomainError.Code.class)) {
            return new DomainErrorCodeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(DomainError.Code.class)));
        }
        return null;
    }
}
