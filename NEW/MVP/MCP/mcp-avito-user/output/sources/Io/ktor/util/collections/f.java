package io.ktor.util.collections;

import Y61.k;
import Y61.l;
import io.ktor.util.InterfaceC41603j0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: CopyOnWriteHashMap.kt */
@InterfaceC41603j0
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/collections/f;", "", "K", "V", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f<K, V> {

    @k
    private volatile /* synthetic */ Object current = P0.c();

    static {
        AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "current");
    }

    @l
    public final Object a(@k io.ktor.events.a aVar) {
        return ((Map) this.current).get(aVar);
    }
}
