package com.my.tracker.obfuscated;

import com.my.tracker.MyTracker;
import com.my.tracker.obfuscated.a1;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes7.dex */
public final class r1 extends a1 {

    /* renamed from: q, reason: collision with root package name */
    final a f365769q;

    /* renamed from: r, reason: collision with root package name */
    final b f365770r;

    /* renamed from: s, reason: collision with root package name */
    final List<a1.p> f365771s;

    /* renamed from: t, reason: collision with root package name */
    long f365772t;

    /* renamed from: u, reason: collision with root package name */
    String f365773u;

    public static final class a extends a1.q {

        /* renamed from: b, reason: collision with root package name */
        InterfaceC37842p[] f365774b = null;

        private void a(InterfaceC37842p interfaceC37842p, ByteArrayOutputStream byteArrayOutputStream) {
            c1.b(1, interfaceC37842p.a(), byteArrayOutputStream);
            c1.b(2, interfaceC37842p.d(), byteArrayOutputStream);
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            InterfaceC37842p[] interfaceC37842pArr = this.f365774b;
            if (interfaceC37842pArr == null || interfaceC37842pArr.length == 0) {
                return;
            }
            for (InterfaceC37842p interfaceC37842p : interfaceC37842pArr) {
                byteArrayOutputStream2.reset();
                a(interfaceC37842p, byteArrayOutputStream2);
                c1.a(38, byteArrayOutputStream2, byteArrayOutputStream);
            }
        }
    }

    public static final class b extends a1.q {

        /* renamed from: b, reason: collision with root package name */
        j1 f365775b = null;

        /* renamed from: c, reason: collision with root package name */
        j1[] f365776c = null;

        private void a(j1 j1Var, ByteArrayOutputStream byteArrayOutputStream) {
            c1.b(1, j1Var.a(), byteArrayOutputStream);
            c1.a(2, j1Var.c(), (OutputStream) byteArrayOutputStream);
            c1.a(3, j1Var.b(), (OutputStream) byteArrayOutputStream);
        }

        @Override // com.my.tracker.obfuscated.a1.p
        public void a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            if (this.f365775b != null) {
                byteArrayOutputStream2.reset();
                a(this.f365775b, byteArrayOutputStream2);
                c1.a(39, byteArrayOutputStream2, byteArrayOutputStream);
            }
            j1[] j1VarArr = this.f365776c;
            if (j1VarArr == null || j1VarArr.length == 0) {
                return;
            }
            for (j1 j1Var : j1VarArr) {
                byteArrayOutputStream2.reset();
                a(j1Var, byteArrayOutputStream2);
                c1.a(39, byteArrayOutputStream2, byteArrayOutputStream);
            }
        }
    }

    public r1(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        super(byteArrayOutputStream, byteArrayOutputStream2);
        a aVar = new a();
        this.f365769q = aVar;
        b bVar = new b();
        this.f365770r = bVar;
        this.f365771s = C37838l.a(this.f365377a, this.f365378b, this.f365379c, this.f365381e, this.f365383g, aVar, bVar);
    }

    public void a(j1 j1Var) {
        this.f365770r.f365775b = j1Var;
    }

    public void e(long j12) {
        this.f365772t = j12;
    }

    public void w(String str) {
        this.f365773u = str;
    }

    @Override // com.my.tracker.obfuscated.a1, com.my.tracker.obfuscated.h0.a
    public void a(OutputStream outputStream) {
        c1.a(1, MyTracker.VERSION, outputStream);
        c1.a(2, this.f365387k, outputStream);
        c1.a(3, this.f365772t, outputStream);
        for (a1.p pVar : this.f365771s) {
            this.f365385i.reset();
            this.f365386j.reset();
            pVar.a(this.f365385i, this.f365386j, outputStream);
        }
    }

    public void a(j1[] j1VarArr) {
        this.f365770r.f365776c = j1VarArr;
    }

    public void a(InterfaceC37842p[] interfaceC37842pArr) {
        this.f365769q.f365774b = interfaceC37842pArr;
    }

    @Override // com.my.tracker.obfuscated.a1
    public void a(String[] strArr) {
        String str = this.f365773u;
        if (str == null) {
            super.a(new String[0]);
        } else {
            super.a(new String[]{str});
        }
    }
}
