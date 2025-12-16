package io.ktor.util;

import Z41.g;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CaseInsensitiveMap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/Z;", "Key", "Value", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class Z<Key, Value> implements Map.Entry<Key, Value>, g.a {

    /* renamed from: b, reason: collision with root package name */
    public final Key f400427b;

    /* renamed from: c, reason: collision with root package name */
    public Value f400428c;

    public Z(Key key, Value value) {
        this.f400427b = key;
        this.f400428c = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@Y61.l Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.L.f(entry.getKey(), this.f400427b) && kotlin.jvm.internal.L.f(entry.getValue(), this.f400428c);
    }

    @Override // java.util.Map.Entry
    public final Key getKey() {
        return this.f400427b;
    }

    @Override // java.util.Map.Entry
    public final Value getValue() {
        return this.f400428c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f400428c.hashCode() + this.f400427b.hashCode() + 527;
    }

    @Override // java.util.Map.Entry
    public final Value setValue(Value value) {
        this.f400428c = value;
        return value;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f400427b);
        sb2.append('=');
        sb2.append(this.f400428c);
        return sb2.toString();
    }
}
