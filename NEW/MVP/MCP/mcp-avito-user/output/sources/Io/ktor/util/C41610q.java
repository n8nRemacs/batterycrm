package io.ktor.util;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: CaseInsensitiveMap.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "", "Lio/ktor/util/w;", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: io.ktor.util.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41610q extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<C41615w, Object>, Map.Entry<String, Object>> {

    /* renamed from: l, reason: collision with root package name */
    public static final C41610q f400544l = new C41610q();

    public C41610q() {
        super(1);
    }

    @Override // Y41.l
    public final Map.Entry<String, Object> invoke(Map.Entry<C41615w, Object> entry) {
        Map.Entry<C41615w, Object> entry2 = entry;
        return new Z(entry2.getKey().f400552a, entry2.getValue());
    }
}
