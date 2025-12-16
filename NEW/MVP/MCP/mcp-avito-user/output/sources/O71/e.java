package o71;

import Y61.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.instance.g;
import org.koin.core.logger.Level;
import s71.AbstractC48011b;
import t71.InterfaceC48512a;
import x71.C49789c;

/* compiled from: KoinApplication.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo71/e;", "", "<init>", "()V", "a", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC48512a
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f419400c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f419401a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f419402b;

    /* compiled from: KoinApplication.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo71/e$a;", "", "<init>", "()V", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    public final void a() {
        d dVar = this.f419401a;
        AbstractC48011b abstractC48011b = dVar.f419399c;
        Level level = Level.f421465b;
        if (abstractC48011b.b(level)) {
            abstractC48011b.a(level, "Eager instances ...");
        }
        org.koin.mp.c.f421486a.getClass();
        long jNanoTime = System.nanoTime();
        C49789c c49789c = dVar.f419398b;
        HashMap<Integer, g<?>> map = c49789c.f442252c;
        Collection<g<?>> collectionValues = map.values();
        if (!collectionValues.isEmpty()) {
            d dVar2 = c49789c.f442250a;
            org.koin.core.instance.d dVar3 = new org.koin.core.instance.d(dVar2.f419399c, dVar2.f419397a.f442258d, null, 4, null);
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(dVar3);
            }
        }
        map.clear();
        G0 g02 = G0.f406611a;
        org.koin.mp.c.f421486a.getClass();
        AbstractC48011b abstractC48011b2 = dVar.f419399c;
        String str = "Eager instances created in " + ((System.nanoTime() - jNanoTime) / 1000000.0d) + " ms";
        if (abstractC48011b2.b(level)) {
            abstractC48011b2.a(level, str);
        }
    }

    @k
    public final void b(@k List list) throws DefinitionOverrideException {
        boolean z12 = this.f419402b;
        d dVar = this.f419401a;
        AbstractC48011b abstractC48011b = dVar.f419399c;
        Level level = Level.f421466c;
        if (!abstractC48011b.b(level)) {
            dVar.c(list, z12);
            return;
        }
        org.koin.mp.c.f421486a.getClass();
        long jNanoTime = System.nanoTime();
        dVar.c(list, z12);
        G0 g02 = G0.f406611a;
        double dDoubleValue = Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d).doubleValue();
        int size = dVar.f419398b.f442251b.size();
        dVar.f419399c.a(level, "loaded " + size + " definitions in " + dDoubleValue + " ms");
    }

    public e() {
        this.f419401a = new d();
        this.f419402b = true;
    }
}
