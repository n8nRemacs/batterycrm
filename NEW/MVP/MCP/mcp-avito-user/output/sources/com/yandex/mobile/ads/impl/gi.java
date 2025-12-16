package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wn;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes8.dex */
abstract class gi implements u71 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f385749a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<y71> f385750b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue<a> f385751c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private a f385752d;

    /* renamed from: e, reason: collision with root package name */
    private long f385753e;

    /* renamed from: f, reason: collision with root package name */
    private long f385754f;

    public static final class a extends x71 implements Comparable<a> {

        /* renamed from: j, reason: collision with root package name */
        private long f385755j;

        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[ORIG_RETURN, RETURN] */
        @Override // java.lang.Comparable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compareTo(com.yandex.mobile.ads.impl.gi.a r7) {
            /*
                r6 = this;
                com.yandex.mobile.ads.impl.gi$a r7 = (com.yandex.mobile.ads.impl.gi.a) r7
                boolean r0 = r6.f()
                boolean r1 = r7.f()
                if (r0 == r1) goto L13
                boolean r7 = r6.f()
                if (r7 == 0) goto L2f
                goto L2d
            L13:
                long r0 = r6.f390953e
                long r2 = r7.f390953e
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L29
                long r0 = r6.f385755j
                long r4 = r7.f385755j
                long r0 = r0 - r4
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L29
                r7 = 0
                goto L30
            L29:
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 <= 0) goto L2f
            L2d:
                r7 = 1
                goto L30
            L2f:
                r7 = -1
            L30:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gi.a.compareTo(java.lang.Object):int");
        }

        public /* synthetic */ a(int i12) {
            this();
        }
    }

    public static final class b extends y71 {

        /* renamed from: e, reason: collision with root package name */
        private wn.a<b> f385756e;

        public b(wn.a<b> aVar) {
            this.f385756e = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.wn
        public final void h() {
            this.f385756e.a(this);
        }
    }

    public gi() {
        int i12 = 0;
        for (int i13 = 0; i13 < 10; i13++) {
            this.f385749a.add(new a(i12));
        }
        this.f385750b = new ArrayDeque<>();
        while (i12 < 2) {
            this.f385750b.add(new b(new G0(this, 0)));
            i12++;
        }
        this.f385751c = new PriorityQueue<>();
    }

    public abstract void b(x71 x71Var);

    public abstract t71 c();

    @Override // com.yandex.mobile.ads.impl.sn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(x71 x71Var) {
        db.a(x71Var == this.f385752d);
        a aVar = (a) x71Var;
        if (aVar.e()) {
            aVar.b();
            this.f385749a.add(aVar);
        } else {
            long j12 = this.f385754f;
            this.f385754f = 1 + j12;
            aVar.f385755j = j12;
            this.f385751c.add(aVar);
        }
        this.f385752d = null;
    }

    @Override // com.yandex.mobile.ads.impl.sn
    @j.P
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public x71 b() {
        db.b(this.f385752d == null);
        if (this.f385749a.isEmpty()) {
            return null;
        }
        a aVarPollFirst = this.f385749a.pollFirst();
        this.f385752d = aVarPollFirst;
        return aVarPollFirst;
    }

    @Override // com.yandex.mobile.ads.impl.sn
    @j.P
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public y71 a() {
        if (this.f385750b.isEmpty()) {
            return null;
        }
        while (!this.f385751c.isEmpty()) {
            a aVarPeek = this.f385751c.peek();
            int i12 = pc1.f388768a;
            if (aVarPeek.f390953e > this.f385753e) {
                break;
            }
            a aVarPoll = this.f385751c.poll();
            if (aVarPoll.f()) {
                y71 y71VarPollFirst = this.f385750b.pollFirst();
                y71VarPollFirst.b(4);
                aVarPoll.b();
                this.f385749a.add(aVarPoll);
                return y71VarPollFirst;
            }
            b(aVarPoll);
            if (h()) {
                t71 t71VarC = c();
                y71 y71VarPollFirst2 = this.f385750b.pollFirst();
                y71VarPollFirst2.a(aVarPoll.f390953e, t71VarC, Long.MAX_VALUE);
                aVarPoll.b();
                this.f385749a.add(aVarPoll);
                return y71VarPollFirst2;
            }
            aVarPoll.b();
            this.f385749a.add(aVarPoll);
        }
        return null;
    }

    @j.P
    public final y71 f() {
        return this.f385750b.pollFirst();
    }

    @Override // com.yandex.mobile.ads.impl.sn
    public void flush() {
        this.f385754f = 0L;
        this.f385753e = 0L;
        while (!this.f385751c.isEmpty()) {
            a aVarPoll = this.f385751c.poll();
            int i12 = pc1.f388768a;
            aVarPoll.b();
            this.f385749a.add(aVarPoll);
        }
        a aVar = this.f385752d;
        if (aVar != null) {
            aVar.b();
            this.f385749a.add(aVar);
            this.f385752d = null;
        }
    }

    public final long g() {
        return this.f385753e;
    }

    public abstract boolean h();

    @Override // com.yandex.mobile.ads.impl.u71
    public void a(long j12) {
        this.f385753e = j12;
    }

    public final void a(y71 y71Var) {
        y71Var.b();
        this.f385750b.add(y71Var);
    }
}
