package ru.avito.messenger.internal.gson.adapter;

import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import java.lang.reflect.Type;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.ReadOnlyState;

/* compiled from: ReadOnlyStateTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/internal/gson/adapter/ReadOnlyStateTypeAdapter;", "Lcom/google/gson/h;", "Lru/avito/messenger/api/entity/ReadOnlyState;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ReadOnlyStateTypeAdapter implements h<ReadOnlyState> {
    @Override // com.google.gson.h
    public final ReadOnlyState deserialize(i iVar, Type type, g gVar) {
        if (iVar instanceof j) {
            return null;
        }
        if (iVar instanceof k) {
            String strS = iVar.i().D("reason").s();
            i iVarD = iVar.i().D("description");
            return new ReadOnlyState(strS, iVarD != null ? iVarD.s() : null);
        }
        if (!(iVar instanceof m)) {
            throw new IllegalStateException(("Unsupported readOnly value: " + iVar + ", but false or object expected").toString());
        }
        if (!iVar.d()) {
            return null;
        }
        throw new IllegalStateException(("Unexpected readOnly value: " + iVar + ", but object expected").toString());
    }
}
