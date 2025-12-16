package ru.avito.messenger.internal.util;

import Y41.p;
import Y61.k;
import com.avito.android.C30277e1;
import com.google.gson.g;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InlineRuntimeTypeAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/util/InlineRuntimeTypeAdapter;", "T", "Lru/avito/messenger/internal/util/RuntimeTypeAdapter;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class InlineRuntimeTypeAdapter<T> extends RuntimeTypeAdapter<T> {
    public InlineRuntimeTypeAdapter() {
        this(null, null, null, 7, null);
    }

    @Override // ru.avito.messenger.internal.util.RuntimeTypeAdapter
    public final T a(@k com.google.gson.k kVar, @k Type type, @k g gVar) {
        return (T) gVar.b(kVar, type);
    }

    public InlineRuntimeTypeAdapter(String str, p pVar, C30277e1 c30277e1, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? "type" : str, null, (i12 & 2) != 0 ? null : pVar, null, (i12 & 4) != 0 ? null : c30277e1, 10, null);
    }
}
