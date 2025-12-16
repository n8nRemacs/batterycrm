package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: LockFreeLinkedList.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lio/ktor/util/internal/f;", "", "<init>", "()V", "a", "b", "c", "d", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class f {

    @Y61.k
    volatile /* synthetic */ Object _next = this;

    @Y61.k
    volatile /* synthetic */ Object _prev = this;

    @Y61.k
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/util/internal/f$a;", "Lio/ktor/util/internal/a;", "<init>", "()V", "a", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a extends io.ktor.util.internal.a {

        /* compiled from: LockFreeLinkedList.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/internal/f$a$a;", "Lio/ktor/util/internal/i;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: io.ktor.util.internal.f$a$a, reason: collision with other inner class name */
        public static final class C11420a extends i {
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/internal/f$b;", "Lio/ktor/util/internal/f;", "Lio/ktor/util/internal/Node;", "T", "Lio/ktor/util/internal/f$a;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b<T extends f> extends a {

        @Y61.k
        private volatile /* synthetic */ Object _affectedNode;

        static {
            AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/util/internal/f$c;", "Lio/ktor/util/internal/b;", "Lio/ktor/util/internal/f;", "Lio/ktor/util/internal/Node;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static abstract class c extends io.ktor.util.internal.b<f> {
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/util/internal/f$d;", "T", "Lio/ktor/util/internal/f$a;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d<T> extends a {

        @Y61.k
        private volatile /* synthetic */ Object _affectedNode;

        @Y61.k
        private volatile /* synthetic */ Object _originalNext;

        static {
            AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");
            AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");
        }
    }

    static {
        AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next");
        AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev");
        AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_removedRef");
    }

    @Y61.k
    public final String toString() {
        return m0.f406844a.b(getClass()).l0() + '@' + hashCode();
    }
}
