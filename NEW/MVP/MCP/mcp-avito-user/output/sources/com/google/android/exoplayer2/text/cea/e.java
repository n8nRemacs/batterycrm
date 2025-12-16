package com.google.android.exoplayer2.text.cea;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.text.i;
import com.google.android.exoplayer2.text.l;
import com.google.android.exoplayer2.text.m;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* compiled from: CeaDecoder.java */
/* loaded from: classes6.dex */
abstract class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f346837a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<m> f346838b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue<b> f346839c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public b f346840d;

    /* renamed from: e, reason: collision with root package name */
    public long f346841e;

    /* renamed from: f, reason: collision with root package name */
    public long f346842f;

    /* compiled from: CeaDecoder.java */
    public static final class b extends l implements Comparable<b> {

        /* renamed from: j, reason: collision with root package name */
        public long f346843j;

        public b() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            if (f(4) == bVar2.f(4)) {
                long j12 = this.f344207f - bVar2.f344207f;
                if (j12 == 0) {
                    j12 = this.f346843j - bVar2.f346843j;
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
    public static final class c extends m {

        /* renamed from: g, reason: collision with root package name */
        public d f346844g;

        public c() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.decoder.g
        public final void h() {
            d dVar = this.f346844g;
            dVar.getClass();
            e eVar = dVar.f346836a;
            this.f344210b = 0;
            this.f346916e = null;
            eVar.f346838b.add(this);
        }
    }

    public e() {
        for (int i12 = 0; i12 < 10; i12++) {
            this.f346837a.add(new b());
        }
        this.f346838b = new ArrayDeque<>();
        for (int i13 = 0; i13 < 2; i13++) {
            ArrayDeque<m> arrayDeque = this.f346838b;
            d dVar = new d(this);
            c cVar = new c();
            cVar.f346844g = dVar;
            arrayDeque.add(cVar);
        }
        this.f346839c = new PriorityQueue<>();
    }

    @Override // com.google.android.exoplayer2.decoder.e
    @P
    public final l a() {
        C36585a.d(this.f346840d == null);
        ArrayDeque<b> arrayDeque = this.f346837a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        b bVarPollFirst = arrayDeque.pollFirst();
        this.f346840d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // com.google.android.exoplayer2.text.i
    public void c(long j12) {
        this.f346841e = j12;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final void d(l lVar) {
        l lVar2 = lVar;
        C36585a.b(lVar2 == this.f346840d);
        b bVar = (b) lVar2;
        if (bVar.f(BeduinInputModel.MIN_TEXT_VERSION)) {
            bVar.h();
            this.f346837a.add(bVar);
        } else {
            long j12 = this.f346842f;
            this.f346842f = 1 + j12;
            bVar.f346843j = j12;
            this.f346839c.add(bVar);
        }
        this.f346840d = null;
    }

    public abstract h e();

    public abstract void f(l lVar);

    @Override // com.google.android.exoplayer2.decoder.e
    public void flush() {
        ArrayDeque<b> arrayDeque;
        this.f346842f = 0L;
        this.f346841e = 0L;
        while (true) {
            PriorityQueue<b> priorityQueue = this.f346839c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f346837a;
            if (zIsEmpty) {
                break;
            }
            b bVarPoll = priorityQueue.poll();
            int i12 = U.f348106a;
            bVarPoll.h();
            arrayDeque.add(bVarPoll);
        }
        b bVar = this.f346840d;
        if (bVar != null) {
            bVar.h();
            arrayDeque.add(bVar);
            this.f346840d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        return null;
     */
    @Override // com.google.android.exoplayer2.decoder.e
    @j.P
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.text.m b() {
        /*
            r12 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.text.m> r0 = r12.f346838b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.e$b> r1 = r12.f346839c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            com.google.android.exoplayer2.text.cea.e$b r3 = (com.google.android.exoplayer2.text.cea.e.b) r3
            int r4 = com.google.android.exoplayer2.util.U.f348106a
            long r3 = r3.f344207f
            long r5 = r12.f346841e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            com.google.android.exoplayer2.text.cea.e$b r1 = (com.google.android.exoplayer2.text.cea.e.b) r1
            r3 = 4
            boolean r4 = r1.f(r3)
            java.util.ArrayDeque<com.google.android.exoplayer2.text.cea.e$b> r5 = r12.f346837a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            com.google.android.exoplayer2.text.m r0 = (com.google.android.exoplayer2.text.m) r0
            r0.e(r3)
            r1.h()
            r5.add(r1)
            return r0
        L41:
            r12.f(r1)
            boolean r3 = r12.h()
            if (r3 == 0) goto L66
            com.google.android.exoplayer2.text.h r9 = r12.e()
            java.lang.Object r0 = r0.pollFirst()
            com.google.android.exoplayer2.text.m r0 = (com.google.android.exoplayer2.text.m) r0
            long r7 = r1.f344207f
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.e.b():com.google.android.exoplayer2.text.m");
    }

    public abstract boolean h();

    @Override // com.google.android.exoplayer2.decoder.e
    public void release() {
    }
}
