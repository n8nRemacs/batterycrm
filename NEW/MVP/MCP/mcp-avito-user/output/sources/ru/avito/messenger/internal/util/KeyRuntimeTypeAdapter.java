package ru.avito.messenger.internal.util;

import Y41.p;
import Y61.k;
import com.google.gson.g;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import m91.InterfaceC43936c;

/* compiled from: KeyRuntimeTypeAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/util/KeyRuntimeTypeAdapter;", "T", "Lru/avito/messenger/internal/util/RuntimeTypeAdapter;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class KeyRuntimeTypeAdapter<T> extends RuntimeTypeAdapter<T> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f431795f;

    public KeyRuntimeTypeAdapter() {
        this(null, null, null, null, 15, null);
    }

    @Override // ru.avito.messenger.internal.util.RuntimeTypeAdapter
    public final T a(@k com.google.gson.k kVar, @k Type type, @k g gVar) {
        String str = this.f431795f;
        i iVarD = kVar.D(str);
        iVarD.getClass();
        if (iVarD instanceof com.google.gson.k) {
            return (T) gVar.b(iVarD.i(), type);
        }
        throw new IllegalArgumentException("Unexpected value at json['" + str + "'], where json=" + kVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyRuntimeTypeAdapter(String str, String str2, p pVar, InterfaceC43936c interfaceC43936c, int i12, C42822w c42822w) {
        String str3 = (i12 & 1) != 0 ? "type" : str;
        str2 = (i12 & 2) != 0 ? "value" : str2;
        super(str3, null, (i12 & 4) != 0 ? null : pVar, (i12 & 8) != 0 ? null : interfaceC43936c, null, 18, null);
        this.f431795f = str2;
    }
}
