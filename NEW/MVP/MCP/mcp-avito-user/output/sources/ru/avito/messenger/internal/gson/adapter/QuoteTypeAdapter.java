package ru.avito.messenger.internal.gson.adapter;

import com.avito.android.remote.C34328m0;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.Quote;
import ru.avito.messenger.api.entity.body.MessageBody;

/* compiled from: QuoteTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/QuoteTypeAdapter;", "Lcom/google/gson/h;", "Lru/avito/messenger/api/entity/Quote;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QuoteTypeAdapter implements h<Quote> {
    @Override // com.google.gson.h
    public final Quote deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        String strS = kVarI.D("id").s();
        String strS2 = kVarI.D("fromUid").s();
        long jL2 = kVarI.D("created").l();
        i iVarD = kVarI.D("chunkIndex");
        return new Quote(strS, (MessageBody) gVar.b(iVar, MessageBody.class), jL2, strS2, iVarD != null ? C34328m0.b(iVarD) : null);
    }
}
