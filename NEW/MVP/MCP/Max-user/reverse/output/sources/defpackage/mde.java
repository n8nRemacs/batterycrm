package defpackage;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class mde {
    public final Clock a;
    public final hf5 b;
    public final ConcurrentLinkedDeque c = new ConcurrentLinkedDeque();
    public final ConcurrentLinkedDeque d = new ConcurrentLinkedDeque();
    public final Object e = new Object();
    public Instant f;
    public volatile boolean g;

    public mde(Clock clock, hf5 hf5Var) {
        this.a = clock;
        this.b = hf5Var;
    }

    public final void a(atc atcVar, Consumer consumer) {
        boolean z = atcVar instanceof yob;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.c;
        if (!z || concurrentLinkedDeque.stream().filter(new kk8(23)).filter(new kk8(24)).count() < 256) {
            concurrentLinkedDeque.addLast(new k16(atcVar, consumer));
        }
    }

    public final void b(boolean z) {
        this.g = true;
        this.c.clear();
        this.d.clear();
        if (z) {
            synchronized (this.e) {
                this.f = null;
            }
        }
    }

    public final List c() {
        List list = (List) this.d.pollFirst();
        if (list != null) {
            return list;
        }
        Object[] objArr = {new r0c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    public final Optional d(int i) {
        if (i < 1) {
            return Optional.empty();
        }
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                lde ldeVar = (lde) it.next();
                if (ldeVar.a() <= i) {
                    it.remove();
                    return Optional.of(ldeVar);
                }
            }
            return Optional.empty();
        } catch (ConcurrentModificationException e) {
            if (this.g) {
                return Optional.empty();
            }
            throw e;
        }
    }

    public final String toString() {
        return "SendRequestQueue[" + this.b + "]";
    }
}
