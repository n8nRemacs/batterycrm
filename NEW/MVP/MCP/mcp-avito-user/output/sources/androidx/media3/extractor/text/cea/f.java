package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import androidx.media3.extractor.text.i;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.P;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* compiled from: CeaDecoder.java */
/* loaded from: classes.dex */
abstract class f implements androidx.media3.extractor.text.f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f51234a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<i> f51235b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue<b> f51236c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public b f51237d;

    /* renamed from: e, reason: collision with root package name */
    public long f51238e;

    /* renamed from: f, reason: collision with root package name */
    public long f51239f;

    /* compiled from: CeaDecoder.java */
    public static final class b extends androidx.media3.extractor.text.h implements Comparable<b> {

        /* renamed from: j, reason: collision with root package name */
        public long f51240j;

        public b() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            if (f(4) == bVar2.f(4)) {
                long j12 = this.f48325f - bVar2.f48325f;
                if (j12 == 0) {
                    j12 = this.f51240j - bVar2.f51240j;
                    if (j12 == 0) {
                        return 0;
                    }
                }
                if (j12 <= 0) {
                    return -1;
                }
            } else if (!f(4)) {
                return -1;
            }
            return 1;
        }
    }

    /* compiled from: CeaDecoder.java */
    public static final class c extends i {

        /* renamed from: g, reason: collision with root package name */
        public e f51241g;

        public c() {
            throw null;
        }

        @Override // androidx.media3.decoder.f
        public final void h() {
            e eVar = this.f51241g;
            eVar.getClass();
            f fVar = eVar.f51233a;
            this.f48328b = 0;
            this.f51301e = null;
            fVar.f51235b.add(this);
        }
    }

    public f() {
        for (int i12 = 0; i12 < 10; i12++) {
            this.f51234a.add(new b());
        }
        this.f51235b = new ArrayDeque<>();
        for (int i13 = 0; i13 < 2; i13++) {
            ArrayDeque<i> arrayDeque = this.f51235b;
            e eVar = new e(this);
            c cVar = new c();
            cVar.f51241g = eVar;
            arrayDeque.add(cVar);
        }
        this.f51236c = new PriorityQueue<>();
    }

    @Override // androidx.media3.decoder.e
    @P
    public final androidx.media3.extractor.text.h a() {
        C23110a.g(this.f51237d == null);
        ArrayDeque<b> arrayDeque = this.f51234a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        b bVarPollFirst = arrayDeque.pollFirst();
        this.f51237d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // androidx.media3.extractor.text.f
    public void c(long j12) {
        this.f51238e = j12;
    }

    @Override // androidx.media3.decoder.e
    public final void d(androidx.media3.extractor.text.h hVar) {
        androidx.media3.extractor.text.h hVar2 = hVar;
        C23110a.b(hVar2 == this.f51237d);
        b bVar = (b) hVar2;
        if (bVar.f(BeduinInputModel.MIN_TEXT_VERSION)) {
            bVar.h();
            this.f51234a.add(bVar);
        } else {
            long j12 = this.f51239f;
            this.f51239f = 1 + j12;
            bVar.f51240j = j12;
            this.f51236c.add(bVar);
        }
        this.f51237d = null;
    }

    public abstract androidx.media3.extractor.text.e e();

    public abstract void f(androidx.media3.extractor.text.h hVar);

    @Override // androidx.media3.decoder.e
    public void flush() {
        ArrayDeque<b> arrayDeque;
        this.f51239f = 0L;
        this.f51238e = 0L;
        while (true) {
            PriorityQueue<b> priorityQueue = this.f51236c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f51234a;
            if (zIsEmpty) {
                break;
            }
            b bVarPoll = priorityQueue.poll();
            int i12 = M.f47887a;
            bVarPoll.h();
            arrayDeque.add(bVarPoll);
        }
        b bVar = this.f51237d;
        if (bVar != null) {
            bVar.h();
            arrayDeque.add(bVar);
            this.f51237d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        return null;
     */
    @Override // androidx.media3.decoder.e
    @j.P
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.extractor.text.i b() {
        /*
            r12 = this;
            java.util.ArrayDeque<androidx.media3.extractor.text.i> r0 = r12.f51235b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue<androidx.media3.extractor.text.cea.f$b> r1 = r12.f51236c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            androidx.media3.extractor.text.cea.f$b r3 = (androidx.media3.extractor.text.cea.f.b) r3
            int r4 = androidx.media3.common.util.M.f47887a
            long r3 = r3.f48325f
            long r5 = r12.f51238e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            androidx.media3.extractor.text.cea.f$b r1 = (androidx.media3.extractor.text.cea.f.b) r1
            r3 = 4
            boolean r4 = r1.f(r3)
            java.util.ArrayDeque<androidx.media3.extractor.text.cea.f$b> r5 = r12.f51234a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            androidx.media3.extractor.text.i r0 = (androidx.media3.extractor.text.i) r0
            r0.e(r3)
            r1.h()
            r5.add(r1)
            return r0
        L41:
            r12.f(r1)
            boolean r3 = r12.h()
            if (r3 == 0) goto L66
            androidx.media3.extractor.text.e r9 = r12.e()
            java.lang.Object r0 = r0.pollFirst()
            androidx.media3.extractor.text.i r0 = (androidx.media3.extractor.text.i) r0
            long r7 = r1.f48325f
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.i(r7, r9, r10)
            r1.h()
            r5.add(r1)
            return r0
        L66:
            r1.h()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.f.b():androidx.media3.extractor.text.i");
    }

    public abstract boolean h();

    @Override // androidx.media3.decoder.e
    public void release() {
    }
}
