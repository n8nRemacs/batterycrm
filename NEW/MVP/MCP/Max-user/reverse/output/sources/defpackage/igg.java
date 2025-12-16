package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/* loaded from: classes2.dex */
public final class igg implements su0 {
    public final xw4 a;
    public final LongAdder b = new LongAdder();
    public final LongAdder c = new LongAdder();
    public final AtomicLong d = new AtomicLong();
    public final LongAccumulator e = new LongAccumulator(new hgg(), 0);
    public final LongAdder f = new LongAdder();
    public final LongAdder g = new LongAdder();

    public igg(xw4 xw4Var) {
        this.a = xw4Var;
    }

    @Override // defpackage.su0
    public final ByteBuffer a(int i) {
        long j = i;
        this.b.add(j);
        this.d.addAndGet(j);
        this.f.increment();
        return ByteBuffer.allocateDirect(i);
    }

    @Override // defpackage.su0
    public final void b(ByteBuffer byteBuffer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        long jCapacity = byteBuffer.capacity();
        this.c.add(jCapacity);
        AtomicLong atomicLong = this.d;
        this.e.accumulate(atomicLong.longValue());
        atomicLong.addAndGet(-jCapacity);
        this.g.increment();
        this.a.b(byteBuffer);
    }
}
