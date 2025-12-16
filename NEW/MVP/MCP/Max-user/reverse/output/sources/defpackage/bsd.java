package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class bsd {
    public final q9b a;
    public final m4e b;
    public final sl7 c;
    public final k18 d;
    public final k18 e;
    public final bwf f = new bwf(new prd(0, this));

    public bsd(q9b q9bVar, m4e m4eVar, sl7 sl7Var, k18 k18Var, k18 k18Var2) {
        this.a = q9bVar;
        this.b = m4eVar;
        this.c = sl7Var;
        this.d = k18Var2;
        this.e = k18Var;
    }

    public static ri9 r(gj9 gj9Var) {
        ri9 ri9Var = new ri9();
        ri9Var.a = gj9Var.a;
        ri9Var.b = gj9Var.b;
        ri9Var.c = gj9Var.c;
        ri9Var.d = gj9Var.d;
        ri9Var.e = gj9Var.e;
        ri9Var.f = gj9Var.f;
        String str = gj9Var.g;
        ri9Var.g = str != null ? str.intern() : null;
        ri9Var.h = gj9Var.y;
        ri9Var.i = gj9Var.h;
        ri9Var.j = gj9Var.i;
        ri9Var.k = gj9Var.j;
        ri9Var.l = gj9Var.k;
        ri9Var.m = gj9Var.l;
        ri9Var.n = gj9Var.m;
        ri9Var.o = gj9Var.p;
        ri9Var.p = gj9Var.s;
        ri9Var.r = gj9Var.t;
        ri9Var.s = gj9Var.u;
        ri9Var.t = gj9Var.v;
        ri9Var.H = gj9Var.J;
        ri9Var.y = gj9Var.x;
        ri9Var.x = gj9Var.w;
        ri9Var.u = gj9Var.o;
        ri9Var.v = gj9Var.z;
        ri9Var.w = gj9Var.A;
        ri9Var.I = gj9Var.K;
        ri9Var.A = gj9Var.B;
        ri9Var.B = gj9Var.C;
        ri9Var.C = gj9Var.D;
        ri9Var.D = gj9Var.E;
        xl9 xl9Var = gj9Var.F;
        long j = gj9Var.I;
        ri9Var.E = xl9Var;
        ri9Var.G = j;
        return ri9Var;
    }

    public final int a(long j, long j2, rs4 rs4Var) {
        lrd lrdVar;
        int iOrdinal = rs4Var.ordinal();
        if (iOrdinal == 0) {
            lq9 lq9VarD = d();
            lrdVar = lq9VarD.a;
            lrdVar.b();
            hq9 hq9Var = lq9VarD.u;
            vk6 vk6VarA = hq9Var.a();
            vk6VarA.k(1, j);
            vk6VarA.k(2, j2);
            try {
                lrdVar.c();
                try {
                    int iW = vk6VarA.w();
                    lrdVar.q();
                    return iW;
                } finally {
                }
            } finally {
                hq9Var.r(vk6VarA);
            }
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        lq9 lq9VarD2 = d();
        lrdVar = lq9VarD2.a;
        lrdVar.b();
        hq9 hq9Var2 = lq9VarD2.v;
        vk6 vk6VarA2 = hq9Var2.a();
        vk6VarA2.k(1, j);
        vk6VarA2.k(2, j2);
        try {
            lrdVar.c();
            try {
                int iW2 = vk6VarA2.w();
                lrdVar.q();
                return iW2;
            } finally {
            }
        } finally {
            hq9Var2.r(vk6VarA2);
        }
    }

    public final si9 b(gj9 gj9Var) throws Throwable {
        w10 w10VarR;
        d10 d10Var;
        ri9 ri9VarR = r(gj9Var);
        Boolean bool = gj9Var.H;
        long j = gj9Var.q;
        ss4 ss4Var = null;
        if (j > 0) {
            gj9 gj9VarD = d().d(j);
            ri9VarR.q = gj9VarD != null ? b(gj9VarD) : null;
        }
        jdc jdcVar = gj9Var.m;
        long j2 = (jdcVar == null || (w10VarR = jdcVar.r(s10.b)) == null || (d10Var = w10VarR.c) == null) ? 0L : d10Var.m;
        if (j2 > 0) {
            gj9 gj9VarD2 = d().d(j2);
            ri9VarR.z = gj9VarD2 != null ? b(gj9VarD2) : null;
        }
        Long l = gj9Var.G;
        if (l != null && bool != null) {
            ss4Var = new ss4(l.longValue(), bool.booleanValue());
        }
        ri9VarR.F = ss4Var;
        return ri9VarR.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable c(long r5, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.srd
            if (r0 == 0) goto L13
            r0 = r7
            srd r0 = (defpackage.srd) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            srd r0 = new srd
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r7)
            goto L55
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r7)
            lq9 r7 = r4.d()
            r0.X = r2
            r7.getClass()
            java.lang.String r1 = "SELECT MAX(update_time,time) FROM messages where id = ?"
            dsd r1 = defpackage.dsd.c(r2, r1)
            android.os.CancellationSignal r5 = defpackage.xrf.m(r1, r2, r5)
            lrd r6 = r7.a
            jq9 r2 = new jq9
            r3 = 10
            r2.<init>(r7, r1, r3)
            java.lang.Object r7 = defpackage.k7j.a(r6, r5, r2, r0)
            g84 r5 = defpackage.g84.a
            if (r7 != r5) goto L55
            return r5
        L55:
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L6b
            int r5 = defpackage.s65.d
            long r5 = r7.longValue()
            y65 r7 = defpackage.y65.MILLISECONDS
            long r5 = defpackage.v9j.i(r5, r7)
            s65 r7 = new s65
            r7.<init>(r5)
            return r7
        L6b:
            s65 r5 = new s65
            r6 = 0
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.c(long, q44):java.lang.Comparable");
    }

    public final lq9 d() {
        return (lq9) this.f.getValue();
    }

    public final long e(final long j, final long j2, final fh9 fh9Var) {
        return ((Number) ((OneMeRoomDatabase) this.a.l()).o(new Callable() { // from class: ord
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(this.a.f(j, j2, fh9Var, false));
            }
        })).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(long r96, long r98, defpackage.fh9 r100, boolean r101) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.f(long, long, fh9, boolean):long");
    }

    public final void g(wjb wjbVar, long j) {
        long j2 = wjbVar.a;
        String str = wjbVar.b;
        jdc jdcVarC = new x10().c();
        boolean z = wjbVar.e;
        r8j r8jVar = rs4.d;
        d().f(new gj9(0L, 0L, 0L, 0L, 0L, j2, str, xi9.d, jm9.ACTIVE, 0L, null, null, jdcVarC, po8.a(jdcVarC), z, 0, 0L, false, 0L, null, null, null, 0, 0L, 0L, 1, j, 0, 0, 0L, 0, 0L, hd5.a, null, null, null, 0L));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.gj9 r11, defpackage.q44 r12) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.h(gj9, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r6
  0x0048: PHI (r6v9 int) = (r6v0 int), (r6v1 int) binds: [B:16:0x0046, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ml9 i(long r47, long r49, defpackage.fh9 r51, defpackage.jm9 r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.i(long, long, fh9, jm9, boolean):ml9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r9 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r7, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.urd
            if (r0 == 0) goto L13
            r0 = r9
            urd r0 = (defpackage.urd) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            urd r0 = new urd
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r9)
            goto L70
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            bsd r7 = r0.d
            defpackage.g8j.b(r9)
            goto L60
        L38:
            defpackage.g8j.b(r9)
            lq9 r9 = r6.d()
            r0.d = r6
            r0.Y = r3
            r9.getClass()
            java.lang.String r1 = "SELECT * FROM messages WHERE id = ?"
            dsd r1 = defpackage.dsd.c(r3, r1)
            android.os.CancellationSignal r7 = defpackage.xrf.m(r1, r3, r7)
            lrd r8 = r9.a
            jq9 r3 = new jq9
            r5 = 0
            r3.<init>(r9, r1, r5)
            java.lang.Object r9 = defpackage.k7j.a(r8, r7, r3, r0)
            if (r9 != r4) goto L5f
            goto L6f
        L5f:
            r7 = r6
        L60:
            gj9 r9 = (defpackage.gj9) r9
            r8 = 0
            if (r9 == 0) goto L73
            r0.d = r8
            r0.Y = r2
            java.lang.Object r9 = r7.h(r9, r0)
            if (r9 != r4) goto L70
        L6f:
            return r4
        L70:
            si9 r9 = (defpackage.si9) r9
            return r9
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.j(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d3 -> B:35:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.Collection r8, defpackage.q44 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.vrd
            if (r0 == 0) goto L13
            r0 = r9
            vrd r0 = (defpackage.vrd) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            vrd r0 = new vrd
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Z
            int r1 = r0.t0
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            java.util.Collection r8 = r0.Y
            java.util.Iterator r1 = r0.X
            java.util.Collection r3 = r0.o
            bsd r5 = r0.d
            defpackage.g8j.b(r9)
            goto Ld4
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            bsd r8 = r0.d
            defpackage.g8j.b(r9)
            goto La2
        L41:
            defpackage.g8j.b(r9)
            lq9 r9 = r7.d()
            r0.d = r7
            r0.t0 = r3
            r9.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "SELECT * FROM messages WHERE id IN ("
            r1.append(r5)
            int r5 = r8.size()
            defpackage.lc4.a(r1, r5)
            java.lang.String r6 = ")"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            dsd r1 = defpackage.dsd.c(r5, r1)
            java.util.Iterator r8 = r8.iterator()
        L71:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r8.next()
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 != 0) goto L83
            r1.S(r3)
            goto L8a
        L83:
            long r5 = r5.longValue()
            r1.k(r3, r5)
        L8a:
            int r3 = r3 + 1
            goto L71
        L8d:
            android.os.CancellationSignal r8 = new android.os.CancellationSignal
            r8.<init>()
            lrd r3 = r9.a
            jq9 r5 = new jq9
            r6 = 1
            r5.<init>(r9, r1, r6)
            java.lang.Object r9 = defpackage.k7j.a(r3, r8, r5, r0)
            if (r9 != r4) goto La1
            goto Ld2
        La1:
            r8 = r7
        La2:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.we3.q(r9, r3)
            r1.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
            r5 = r8
            r8 = r1
            r1 = r9
        Lb6:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto Ldb
            java.lang.Object r9 = r1.next()
            gj9 r9 = (defpackage.gj9) r9
            r0.d = r5
            r0.o = r8
            r0.X = r1
            r0.Y = r8
            r0.t0 = r2
            java.lang.Object r9 = r5.h(r9, r0)
            if (r9 != r4) goto Ld3
        Ld2:
            return r4
        Ld3:
            r3 = r8
        Ld4:
            si9 r9 = (defpackage.si9) r9
            r8.add(r9)
            r8 = r3
            goto Lb6
        Ldb:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.k(java.util.Collection, q44):java.lang.Object");
    }

    public final Object l(long j, long j2, q44 q44Var) {
        return svi.i(((q2b) ((lzf) this.c.a)).b(), new wrd(this, j, j2, null), q44Var);
    }

    public final si9 m(long j, rs4 rs4Var) throws Throwable {
        dsd dsdVar;
        ArrayList arrayListJ;
        boolean z;
        boolean z2;
        int i;
        byte[] blob;
        int iOrdinal = rs4Var.ordinal();
        if (iOrdinal == 0) {
            lq9 lq9VarD = d();
            lq9VarD.getClass();
            dsd dsdVarC = dsd.c(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
            vb9.h(dsdVarC, 1, j, lq9VarD);
            dsdVarC.k(2, 10);
            dsdVarC.k(3, 1L);
            lrd lrdVar = lq9VarD.a;
            lrdVar.b();
            Cursor cursorN = lrdVar.n(dsdVarC);
            try {
                int iC = s7j.c(cursorN, "id");
                int iC2 = s7j.c(cursorN, "server_id");
                int iC3 = s7j.c(cursorN, "time");
                int iC4 = s7j.c(cursorN, "update_time");
                int iC5 = s7j.c(cursorN, "sender");
                int iC6 = s7j.c(cursorN, "cid");
                int iC7 = s7j.c(cursorN, "text");
                int iC8 = s7j.c(cursorN, "delivery_status");
                int iC9 = s7j.c(cursorN, "status");
                int iC10 = s7j.c(cursorN, "time_local");
                int iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                int iC12 = s7j.c(cursorN, "localized_error");
                int iC13 = s7j.c(cursorN, "attaches");
                int iC14 = s7j.c(cursorN, "media_type");
                dsdVar = dsdVarC;
                try {
                    int iC15 = s7j.c(cursorN, "detect_share");
                    int iC16 = s7j.c(cursorN, "msg_link_type");
                    int iC17 = s7j.c(cursorN, "msg_link_id");
                    int iC18 = s7j.c(cursorN, "inserted_from_msg_link");
                    int iC19 = s7j.c(cursorN, "msg_link_chat_id");
                    int iC20 = s7j.c(cursorN, "msg_link_chat_name");
                    int iC21 = s7j.c(cursorN, "msg_link_chat_link");
                    int iC22 = s7j.c(cursorN, "msg_link_chat_icon_url");
                    int iC23 = s7j.c(cursorN, "msg_link_chat_access_type");
                    int iC24 = s7j.c(cursorN, "msg_link_out_chat_id");
                    int iC25 = s7j.c(cursorN, "msg_link_out_msg_id");
                    int iC26 = s7j.c(cursorN, "type");
                    int iC27 = s7j.c(cursorN, "chat_id");
                    int iC28 = s7j.c(cursorN, "channel_views");
                    int iC29 = s7j.c(cursorN, "channel_forwards");
                    int iC30 = s7j.c(cursorN, "view_time");
                    int iC31 = s7j.c(cursorN, "options");
                    int iC32 = s7j.c(cursorN, "live_until");
                    int iC33 = s7j.c(cursorN, "elements");
                    int iC34 = s7j.c(cursorN, "reactions");
                    int iC35 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
                    int iC36 = s7j.c(cursorN, "delayed_attrs_notify_sender");
                    int iC37 = s7j.c(cursorN, "reactions_update_time");
                    int i2 = iC14;
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        long j2 = cursorN.getLong(iC);
                        long j3 = cursorN.getLong(iC2);
                        long j4 = cursorN.getLong(iC3);
                        long j5 = cursorN.getLong(iC4);
                        long j6 = cursorN.getLong(iC5);
                        long j7 = cursorN.getLong(iC6);
                        Boolean boolValueOf = null;
                        String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                        int i3 = cursorN.getInt(iC8);
                        lq9VarD.b().getClass();
                        xi9 xi9VarB = ky9.b(i3);
                        int i4 = cursorN.getInt(iC9);
                        lq9VarD.b().getClass();
                        jm9 jm9VarD = ky9.d(i4);
                        long j8 = cursorN.getLong(iC10);
                        String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                        String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                        byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                        lq9VarD.b().getClass();
                        jdc jdcVarA = ky9.a(blob2);
                        int i5 = i2;
                        int i6 = cursorN.getInt(i5);
                        int i7 = iC;
                        int i8 = iC15;
                        if (cursorN.getInt(i8) != 0) {
                            z2 = false;
                            z = true;
                        } else {
                            z = false;
                            z2 = false;
                        }
                        iC15 = i8;
                        int i9 = iC16;
                        int i10 = cursorN.getInt(i9);
                        iC16 = i9;
                        int i11 = iC17;
                        boolean z3 = z2;
                        long j9 = cursorN.getLong(i11);
                        int i12 = iC18;
                        boolean z4 = cursorN.getInt(i12) != 0 ? true : z3;
                        iC18 = i12;
                        int i13 = iC19;
                        long j10 = cursorN.getLong(i13);
                        iC19 = i13;
                        int i14 = iC20;
                        String string4 = cursorN.isNull(i14) ? null : cursorN.getString(i14);
                        iC20 = i14;
                        int i15 = iC21;
                        String string5 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                        iC21 = i15;
                        int i16 = iC22;
                        String string6 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                        iC22 = i16;
                        int i17 = iC23;
                        Integer numValueOf = cursorN.isNull(i17) ? null : Integer.valueOf(cursorN.getInt(i17));
                        lq9VarD.a().getClass();
                        int iA = m73.a(numValueOf);
                        iC23 = i17;
                        int i18 = iC24;
                        long j11 = cursorN.getLong(i18);
                        iC24 = i18;
                        int i19 = iC25;
                        long j12 = cursorN.getLong(i19);
                        iC25 = i19;
                        int i20 = iC26;
                        int i21 = cursorN.getInt(i20);
                        lq9VarD.b().getClass();
                        int iE = ky9.e(i21);
                        iC26 = i20;
                        int i22 = iC27;
                        long j13 = cursorN.getLong(i22);
                        iC27 = i22;
                        int i23 = iC28;
                        int i24 = cursorN.getInt(i23);
                        iC28 = i23;
                        int i25 = iC29;
                        int i26 = cursorN.getInt(i25);
                        iC29 = i25;
                        int i27 = iC30;
                        long j14 = cursorN.getLong(i27);
                        iC30 = i27;
                        int i28 = iC31;
                        int i29 = cursorN.getInt(i28);
                        iC31 = i28;
                        int i30 = iC32;
                        long j15 = cursorN.getLong(i30);
                        iC32 = i30;
                        int i31 = iC33;
                        byte[] blob3 = cursorN.isNull(i31) ? null : cursorN.getBlob(i31);
                        lq9VarD.b().getClass();
                        List listC = ky9.c(blob3);
                        iC33 = i31;
                        int i32 = iC34;
                        if (cursorN.isNull(i32)) {
                            i = i32;
                            blob = null;
                        } else {
                            i = i32;
                            blob = cursorN.getBlob(i32);
                        }
                        xl9 xl9VarF = lq9VarD.b().f(blob);
                        int i33 = iC35;
                        Long lValueOf = cursorN.isNull(i33) ? null : Long.valueOf(cursorN.getLong(i33));
                        int i34 = iC36;
                        Integer numValueOf2 = cursorN.isNull(i34) ? null : Integer.valueOf(cursorN.getInt(i34));
                        if (numValueOf2 != null) {
                            if (numValueOf2.intValue() != 0) {
                                z3 = true;
                            }
                            boolValueOf = Boolean.valueOf(z3);
                        }
                        iC35 = i33;
                        int i35 = iC37;
                        iC37 = i35;
                        arrayList.add(new gj9(j2, j3, j4, j5, j6, j7, string, xi9VarB, jm9VarD, j8, string2, string3, jdcVarA, i6, z, i10, j9, z4, j10, string4, string5, string6, iA, j11, j12, iE, j13, i24, i26, j14, i29, j15, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i35)));
                        iC36 = i34;
                        iC = i7;
                        iC17 = i11;
                        i2 = i5;
                        iC34 = i;
                    }
                    cursorN.close();
                    dsdVar.y();
                    arrayListJ = arrayList;
                } catch (Throwable th) {
                    th = th;
                    cursorN.close();
                    dsdVar.y();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dsdVar = dsdVarC;
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            arrayListJ = lq9.j(d(), j);
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayListJ, 10));
        Iterator it = arrayListJ.iterator();
        while (it.hasNext()) {
            arrayList2.add(b((gj9) it.next()));
        }
        return (si9) ue3.I(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r9 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(long r7, defpackage.q44 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.yrd
            if (r0 == 0) goto L13
            r0 = r9
            yrd r0 = (defpackage.yrd) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            yrd r0 = new yrd
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r9)
            goto L70
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            bsd r7 = r0.d
            defpackage.g8j.b(r9)
            goto L60
        L38:
            defpackage.g8j.b(r9)
            lq9 r9 = r6.d()
            r0.d = r6
            r0.Y = r3
            r9.getClass()
            java.lang.String r1 = "SELECT * FROM messages WHERE id = ?"
            dsd r1 = defpackage.dsd.c(r3, r1)
            android.os.CancellationSignal r7 = defpackage.xrf.m(r1, r3, r7)
            lrd r8 = r9.a
            jq9 r3 = new jq9
            r5 = 0
            r3.<init>(r9, r1, r5)
            java.lang.Object r9 = defpackage.k7j.a(r8, r7, r3, r0)
            if (r9 != r4) goto L5f
            goto L6f
        L5f:
            r7 = r6
        L60:
            gj9 r9 = (defpackage.gj9) r9
            r8 = 0
            if (r9 == 0) goto L73
            r0.d = r8
            r0.Y = r2
            java.lang.Object r9 = r7.h(r9, r0)
            if (r9 != r4) goto L70
        L6f:
            return r4
        L70:
            si9 r9 = (defpackage.si9) r9
            return r9
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.n(long, q44):java.lang.Object");
    }

    public final m8a o(List list) throws Throwable {
        m8a m8aVar = new m8a(list.size());
        at atVar = new at(2, list);
        bbj.a(200, 200);
        nz5 nz5Var = new nz5(lee.j(new nhg(new at(7, atVar), new iqb(21, this)), zx0.C0));
        while (nz5Var.hasNext()) {
            si9 si9VarB = b((gj9) nz5Var.next());
            m8aVar.f(si9VarB.a, si9VarB);
        }
        return m8aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0212 -> B:67:0x0214). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(long r19, long r21, java.util.Set r23, java.lang.Integer r24, boolean r25, defpackage.q44 r26) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.p(long, long, java.util.Set, java.lang.Integer, boolean, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0114 -> B:43:0x0115). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r11, java.util.Collection r13, java.util.Set r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.q(long, java.util.Collection, java.util.Set, q44):java.lang.Object");
    }

    public final void s(long j, gu3 gu3Var) {
        try {
            ((Number) ((OneMeRoomDatabase) this.a.l()).o(new un6(this, j, gu3Var))).intValue();
        } catch (Throwable th) {
            wqi.e("RoomMessagesDatabase", "Can't update attach", th);
        }
    }

    public final int t(long j, long j2, fh9 fh9Var, jm9 jm9Var, boolean z) {
        int iL;
        xi9 xi9Var = xi9.o;
        ml9 ml9VarI = i(j, 0L, fh9Var, jm9Var, z);
        rk9 rk9Var = fh9Var.s0;
        ml9 ml9VarA = (z || rk9Var == null || rk9Var.a != 3) ? ml9VarI : ml9.a(ml9VarI, 0L, 0L, 0L, 0L, null, null, 0, f(j, j2, rk9Var.c, true), false, 0L, null, null, null, 0, 33552383);
        lq9 lq9VarD = d();
        long j3 = fh9Var.X;
        lrd lrdVar = lq9VarD.a;
        lrdVar.c();
        try {
            gj9 gj9VarH = lq9VarD.h(j, j3);
            if (gj9VarH == null) {
                iL = 0;
            } else {
                ml9 ml9VarG = lq9.g(lq9VarD, gj9VarH, ml9VarA, j, null, Long.valueOf(j3), 8);
                lq9VarD.n(gj9VarH.a, xi9Var);
                iL = lq9VarD.l(ml9VarG);
            }
            lrdVar.q();
            return iL;
        } finally {
            lrdVar.k();
        }
    }

    public final int u(long j, long j2, fh9 fh9Var, boolean z) {
        int iL;
        ml9 ml9VarI = i(j, j2, fh9Var, null, z);
        lq9 lq9VarD = d();
        long j3 = fh9Var.a;
        lrd lrdVar = lq9VarD.a;
        lrdVar.c();
        try {
            gj9 gj9VarC = lq9VarD.c(j, j3);
            if (gj9VarC == null) {
                iL = 0;
            } else {
                ml9 ml9VarG = lq9.g(lq9VarD, gj9VarC, ml9VarI, j, Long.valueOf(j3), null, 16);
                if (j3 != 0 && gj9VarC.h == xi9.d) {
                    lq9VarD.n(gj9VarC.a, xi9.o);
                }
                iL = lq9VarD.l(ml9VarG);
            }
            lrdVar.q();
            return iL;
        } finally {
            lrdVar.k();
        }
    }

    public final void v(long j, Long l, Boolean bool) {
        lq9 lq9VarD = d();
        lrd lrdVar = lq9VarD.a;
        lrdVar.b();
        hq9 hq9Var = lq9VarD.r;
        vk6 vk6VarA = hq9Var.a();
        if (l == null) {
            vk6VarA.S(1);
        } else {
            vk6VarA.k(1, l.longValue());
        }
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            vk6VarA.S(2);
        } else {
            vk6VarA.k(2, r9.intValue());
        }
        vk6VarA.k(3, j);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            hq9Var.r(vk6VarA);
        }
    }
}
