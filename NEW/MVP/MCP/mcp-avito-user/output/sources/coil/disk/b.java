package coil.disk;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.ui.platform.C22491k0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import okio.I;
import okio.M;
import okio.S;
import okio.X;
import okio.Y;

/* compiled from: DiskLruCache.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcoil/disk/b;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "a", "b", "c", "d", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements Closeable, Flushable {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final C43059p f58320r;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final S f58321b;

    /* renamed from: c, reason: collision with root package name */
    public final long f58322c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final S f58323d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final S f58324e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final S f58325f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashMap<String, c> f58326g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f58327h;

    /* renamed from: i, reason: collision with root package name */
    public long f58328i;

    /* renamed from: j, reason: collision with root package name */
    public int f58329j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public X f58330k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f58331l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f58332m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f58333n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f58334o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f58335p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final coil.disk.c f58336q;

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcoil/disk/b$a;", "", "<init>", "()V", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "Lkotlin/text/p;", "LEGAL_KEY_PATTERN", "Lkotlin/text/p;", "READ", "REMOVE", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DiskLruCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/b$b;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.disk.b$b, reason: collision with other inner class name */
    public final class C2071b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c f58337a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f58338b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final boolean[] f58339c;

        public C2071b(@k c cVar) {
            this.f58337a = cVar;
            b.this.getClass();
            this.f58339c = new boolean[2];
        }

        public final void a(boolean z12) {
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    if (this.f58338b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (L.f(this.f58337a.f58347g, this)) {
                        b.a(bVar, this, z12);
                    }
                    this.f58338b = true;
                    G0 g02 = G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @k
        public final S b(int i12) {
            S s5;
            b bVar = b.this;
            synchronized (bVar) {
                if (this.f58338b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f58339c[i12] = true;
                S s12 = this.f58337a.f58344d.get(i12);
                coil.disk.c cVar = bVar.f58336q;
                S s13 = s12;
                if (!cVar.b(s13)) {
                    coil.util.l.a(cVar.h(s13));
                }
                s5 = s12;
            }
            return s5;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/b$c;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f58341a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final long[] f58342b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList<S> f58343c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList<S> f58344d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f58345e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f58346f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public C2071b f58347g;

        /* renamed from: h, reason: collision with root package name */
        public int f58348h;

        public c(@k String str) {
            this.f58341a = str;
            b.this.getClass();
            this.f58342b = new long[2];
            this.f58343c = new ArrayList<>(2);
            this.f58344d = new ArrayList<>(2);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i12 = 0; i12 < 2; i12++) {
                sb2.append(i12);
                this.f58343c.add(b.this.f58321b.d(sb2.toString()));
                sb2.append(".tmp");
                this.f58344d.add(b.this.f58321b.d(sb2.toString()));
                sb2.setLength(length);
            }
        }

        @l
        public final d a() {
            if (!this.f58345e || this.f58347g != null || this.f58346f) {
                return null;
            }
            ArrayList<S> arrayList = this.f58343c;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                b bVar = b.this;
                if (i12 >= size) {
                    this.f58348h++;
                    return bVar.new d(this);
                }
                if (!bVar.f58336q.b(arrayList.get(i12))) {
                    try {
                        bVar.j(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i12++;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcoil/disk/b$d;", "Ljava/io/Closeable;", "Lokio/Closeable;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f58350b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f58351c;

        public d(@k c cVar) {
            this.f58350b = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f58351c) {
                return;
            }
            this.f58351c = true;
            b bVar = b.this;
            synchronized (bVar) {
                c cVar = this.f58350b;
                int i12 = cVar.f58348h - 1;
                cVar.f58348h = i12;
                if (i12 == 0 && cVar.f58346f) {
                    C43059p c43059p = b.f58320r;
                    bVar.j(cVar);
                }
                G0 g02 = G0.f406611a;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b bVar = b.this;
            synchronized (bVar) {
                if (!bVar.f58332m || bVar.f58333n) {
                    return G0.f406611a;
                }
                try {
                    bVar.k();
                } catch (IOException unused) {
                    bVar.f58334o = true;
                }
                try {
                    if (bVar.f58329j >= 2000) {
                        bVar.n();
                    }
                } catch (IOException unused2) {
                    bVar.f58335p = true;
                    bVar.f58330k = new X(M.b());
                }
                return G0.f406611a;
            }
        }
    }

    static {
        new a(null);
        f58320r = new C43059p("[a-z0-9_-]{1,120}");
    }

    public b(long j12, @k kotlinx.coroutines.scheduling.b bVar, @k I i12, @k S s5) {
        this.f58321b = s5;
        this.f58322c = j12;
        if (j12 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f58323d = s5.d("journal");
        this.f58324e = s5.d("journal.tmp");
        this.f58325f = s5.d("journal.bkp");
        this.f58326g = new LinkedHashMap<>(0, 0.75f, true);
        this.f58327h = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), bVar.q(1)));
        this.f58336q = new coil.disk.c(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0113 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:11:0x0016, B:13:0x001c, B:15:0x002c, B:23:0x003b, B:25:0x0053, B:29:0x0070, B:31:0x007e, B:33:0x0085, B:26:0x0059, B:28:0x0069, B:37:0x00a5, B:39:0x00ac, B:42:0x00b1, B:44:0x00bf, B:47:0x00c4, B:52:0x00ff, B:54:0x010a, B:58:0x0113, B:48:0x00dc, B:50:0x00f1, B:51:0x00fc, B:36:0x0095, B:61:0x0118, B:62:0x011f), top: B:65:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(coil.disk.b r9, coil.disk.b.C2071b r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.b.a(coil.disk.b, coil.disk.b$b, boolean):void");
    }

    public static void m(String str) {
        if (!f58320r.e(str)) {
            throw new IllegalArgumentException(C22491k0.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    @l
    public final synchronized C2071b b(@k String str) {
        try {
            if (this.f58333n) {
                throw new IllegalStateException("cache is closed");
            }
            m(str);
            d();
            c cVar = this.f58326g.get(str);
            if ((cVar != null ? cVar.f58347g : null) != null) {
                return null;
            }
            if (cVar != null && cVar.f58348h != 0) {
                return null;
            }
            if (!this.f58334o && !this.f58335p) {
                X x12 = this.f58330k;
                x12.b2("DIRTY");
                x12.writeByte(32);
                x12.b2(str);
                x12.writeByte(10);
                x12.flush();
                if (this.f58331l) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(str);
                    this.f58326g.put(str, cVar);
                }
                C2071b c2071b = new C2071b(cVar);
                cVar.f58347g = c2071b;
                return c2071b;
            }
            f();
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l
    public final synchronized d c(@k String str) {
        d dVarA;
        if (this.f58333n) {
            throw new IllegalStateException("cache is closed");
        }
        m(str);
        d();
        c cVar = this.f58326g.get(str);
        if (cVar != null && (dVarA = cVar.a()) != null) {
            boolean z12 = true;
            this.f58329j++;
            X x12 = this.f58330k;
            x12.b2("READ");
            x12.writeByte(32);
            x12.b2(str);
            x12.writeByte(10);
            if (this.f58329j < 2000) {
                z12 = false;
            }
            if (z12) {
                f();
            }
            return dVarA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f58332m && !this.f58333n) {
                for (c cVar : (c[]) this.f58326g.values().toArray(new c[0])) {
                    C2071b c2071b = cVar.f58347g;
                    if (c2071b != null) {
                        c cVar2 = c2071b.f58337a;
                        if (L.f(cVar2.f58347g, c2071b)) {
                            cVar2.f58346f = true;
                        }
                    }
                }
                k();
                U.b(this.f58327h, null);
                this.f58330k.close();
                this.f58330k = null;
                this.f58333n = true;
                return;
            }
            this.f58333n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        try {
            if (this.f58332m) {
                return;
            }
            this.f58336q.a(this.f58324e);
            if (this.f58336q.b(this.f58325f)) {
                if (this.f58336q.b(this.f58323d)) {
                    this.f58336q.a(this.f58325f);
                } else {
                    this.f58336q.j(this.f58325f, this.f58323d);
                }
            }
            if (this.f58336q.b(this.f58323d)) {
                try {
                    h();
                    g();
                    this.f58332m = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        coil.util.e.a(this.f58336q, this.f58321b);
                        this.f58333n = false;
                    } catch (Throwable th2) {
                        this.f58333n = false;
                        throw th2;
                    }
                }
            }
            n();
            this.f58332m = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void f() {
        C43259k.d(this.f58327h, null, null, new e(null), 3);
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f58332m) {
            if (this.f58333n) {
                throw new IllegalStateException("cache is closed");
            }
            k();
            this.f58330k.flush();
        }
    }

    public final void g() {
        Iterator<c> it = this.f58326g.values().iterator();
        long j12 = 0;
        while (it.hasNext()) {
            c next = it.next();
            int i12 = 0;
            if (next.f58347g == null) {
                while (i12 < 2) {
                    j12 += next.f58342b[i12];
                    i12++;
                }
            } else {
                next.f58347g = null;
                while (i12 < 2) {
                    S s5 = next.f58343c.get(i12);
                    coil.disk.c cVar = this.f58336q;
                    cVar.a(s5);
                    cVar.a(next.f58344d.get(i12));
                    i12++;
                }
                it.remove();
            }
        }
        this.f58328i = j12;
    }

    public final void h() throws Throwable {
        coil.disk.c cVar = this.f58336q;
        I i12 = cVar.f420162b;
        S s5 = this.f58323d;
        Y y12 = new Y(i12.i(s5));
        try {
            String strX1 = y12.X1(Long.MAX_VALUE);
            String strX12 = y12.X1(Long.MAX_VALUE);
            String strX13 = y12.X1(Long.MAX_VALUE);
            String strX14 = y12.X1(Long.MAX_VALUE);
            String strX15 = y12.X1(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strX1) || !"1".equals(strX12) || !L.f(String.valueOf(1), strX13) || !L.f(String.valueOf(2), strX14) || strX15.length() > 0) {
                throw new IOException("unexpected journal header: [" + strX1 + ", " + strX12 + ", " + strX13 + ", " + strX14 + ", " + strX15 + ']');
            }
            int i13 = 0;
            while (true) {
                try {
                    i(y12.X1(Long.MAX_VALUE));
                    i13++;
                } catch (EOFException unused) {
                    this.f58329j = i13 - this.f58326g.size();
                    if (y12.W2()) {
                        this.f58330k = new X(new coil.disk.e(cVar.f420162b.j(s5), new coil.disk.d(this)));
                    } else {
                        n();
                    }
                    G0 g02 = G0.f406611a;
                    try {
                        y12.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                y12.close();
            } catch (Throwable th4) {
                C42833p.a(th, th4);
            }
        }
    }

    public final void i(String str) throws IOException {
        String strSubstring;
        int iH2 = C43066x.H(' ', 0, 6, str);
        if (iH2 == -1) {
            throw new IOException(G.f("unexpected journal line: ", str));
        }
        int i12 = iH2 + 1;
        int iH3 = C43066x.H(' ', i12, 4, str);
        LinkedHashMap<String, c> linkedHashMap = this.f58326g;
        if (iH3 == -1) {
            strSubstring = str.substring(i12);
            if (iH2 == 6 && C43066x.h0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i12, iH3);
        }
        c cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = cVar;
        if (iH3 == -1 || iH2 != 5 || !C43066x.h0(str, "CLEAN", false)) {
            if (iH3 == -1 && iH2 == 5 && C43066x.h0(str, "DIRTY", false)) {
                cVar2.f58347g = new C2071b(cVar2);
                return;
            } else {
                if (iH3 != -1 || iH2 != 4 || !C43066x.h0(str, "READ", false)) {
                    throw new IOException(G.f("unexpected journal line: ", str));
                }
                return;
            }
        }
        List listE0 = C43066x.e0(str.substring(iH3 + 1), new char[]{' '});
        cVar2.f58345e = true;
        cVar2.f58347g = null;
        int size = listE0.size();
        b.this.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listE0);
        }
        try {
            int size2 = listE0.size();
            for (int i13 = 0; i13 < size2; i13++) {
                cVar2.f58342b[i13] = Long.parseLong((String) listE0.get(i13));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listE0);
        }
    }

    public final void j(c cVar) {
        X x12;
        int i12 = cVar.f58348h;
        String str = cVar.f58341a;
        if (i12 > 0 && (x12 = this.f58330k) != null) {
            x12.b2("DIRTY");
            x12.writeByte(32);
            x12.b2(str);
            x12.writeByte(10);
            x12.flush();
        }
        if (cVar.f58348h > 0 || cVar.f58347g != null) {
            cVar.f58346f = true;
            return;
        }
        for (int i13 = 0; i13 < 2; i13++) {
            this.f58336q.a(cVar.f58343c.get(i13));
            long j12 = this.f58328i;
            long[] jArr = cVar.f58342b;
            this.f58328i = j12 - jArr[i13];
            jArr[i13] = 0;
        }
        this.f58329j++;
        X x13 = this.f58330k;
        if (x13 != null) {
            x13.b2("REMOVE");
            x13.writeByte(32);
            x13.b2(str);
            x13.writeByte(10);
        }
        this.f58326g.remove(str);
        if (this.f58329j >= 2000) {
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        j(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f58328i
            long r2 = r4.f58322c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap<java.lang.String, coil.disk.b$c> r0 = r4.f58326g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            coil.disk.b$c r1 = (coil.disk.b.c) r1
            boolean r2 = r1.f58346f
            if (r2 != 0) goto L12
            r4.j(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f58334o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.b.k():void");
    }

    public final synchronized void n() {
        try {
            X x12 = this.f58330k;
            if (x12 != null) {
                x12.close();
            }
            X x13 = new X(this.f58336q.h(this.f58324e));
            try {
                x13.b2("libcore.io.DiskLruCache");
                x13.writeByte(10);
                x13.b2("1");
                x13.writeByte(10);
                x13.U0(1);
                x13.writeByte(10);
                x13.U0(2);
                x13.writeByte(10);
                x13.writeByte(10);
                for (c cVar : this.f58326g.values()) {
                    if (cVar.f58347g != null) {
                        x13.b2("DIRTY");
                        x13.writeByte(32);
                        x13.b2(cVar.f58341a);
                        x13.writeByte(10);
                    } else {
                        x13.b2("CLEAN");
                        x13.writeByte(32);
                        x13.b2(cVar.f58341a);
                        for (long j12 : cVar.f58342b) {
                            x13.writeByte(32);
                            x13.U0(j12);
                        }
                        x13.writeByte(10);
                    }
                }
                G0 g02 = G0.f406611a;
                try {
                    x13.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    x13.close();
                } catch (Throwable th4) {
                    C42833p.a(th, th4);
                }
            }
            if (th != null) {
                throw th;
            }
            if (this.f58336q.b(this.f58323d)) {
                this.f58336q.j(this.f58323d, this.f58325f);
                this.f58336q.j(this.f58324e, this.f58323d);
                this.f58336q.a(this.f58325f);
            } else {
                this.f58336q.j(this.f58324e, this.f58323d);
            }
            this.f58330k = new X(new coil.disk.e(this.f58336q.f420162b.j(this.f58323d), new coil.disk.d(this)));
            this.f58329j = 0;
            this.f58331l = false;
            this.f58335p = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }
}
