package androidx.compose.runtime.snapshots;

import Z41.g;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateMap.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/P;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P implements Map.Entry<Object, Object>, g.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f38665b;

    /* renamed from: c, reason: collision with root package name */
    public Object f38666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q<Object, Object> f38667d;

    public P(Q<Object, Object> q12) {
        this.f38667d = q12;
        this.f38665b = q12.f38671e.getKey();
        this.f38666c = q12.f38671e.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f38665b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f38666c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Q<Object, Object> q12 = this.f38667d;
        if (q12.f38668b.c().f38625d != q12.f38670d) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f38666c;
        q12.f38668b.put(this.f38665b, obj);
        this.f38666c = obj;
        return obj2;
    }
}
