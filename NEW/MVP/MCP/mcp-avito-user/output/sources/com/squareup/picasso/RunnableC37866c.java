package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import com.squareup.picasso.C;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.u;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Y;
import okio.Y.a;
import okio.e0;

/* compiled from: BitmapHunter.java */
/* renamed from: com.squareup.picasso.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class RunnableC37866c implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f366404t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f366405u = new a();

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicInteger f366406v = new AtomicInteger();

    /* renamed from: w, reason: collision with root package name */
    public static final C f366407w = new b();

    /* renamed from: b, reason: collision with root package name */
    public final int f366408b = f366406v.incrementAndGet();

    /* renamed from: c, reason: collision with root package name */
    public final Picasso f366409c;

    /* renamed from: d, reason: collision with root package name */
    public final C37874k f366410d;

    /* renamed from: e, reason: collision with root package name */
    public final r f366411e;

    /* renamed from: f, reason: collision with root package name */
    public final E f366412f;

    /* renamed from: g, reason: collision with root package name */
    public final String f366413g;

    /* renamed from: h, reason: collision with root package name */
    public final A f366414h;

    /* renamed from: i, reason: collision with root package name */
    public int f366415i;

    /* renamed from: j, reason: collision with root package name */
    public final C f366416j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC37864a f366417k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f366418l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f366419m;

    /* renamed from: n, reason: collision with root package name */
    public Future<?> f366420n;

    /* renamed from: o, reason: collision with root package name */
    public Picasso.LoadedFrom f366421o;

    /* renamed from: p, reason: collision with root package name */
    public Exception f366422p;

    /* renamed from: q, reason: collision with root package name */
    public int f366423q;

    /* renamed from: r, reason: collision with root package name */
    public int f366424r;

    /* renamed from: s, reason: collision with root package name */
    public Picasso.Priority f366425s;

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$a */
    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$b */
    public static class b extends C {
        @Override // com.squareup.picasso.C
        public final boolean b(A a12) {
            return true;
        }

        @Override // com.squareup.picasso.C
        public final C.a e(A a12, int i12) {
            throw new IllegalStateException("Unrecognized type of request: " + a12);
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    public static class RunnableC10811c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I f366426b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RuntimeException f366427c;

        public RunnableC10811c(I i12, RuntimeException runtimeException) {
            this.f366426b = i12;
            this.f366427c = runtimeException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new RuntimeException("Transformation " + this.f366426b.key() + " crashed with exception.", this.f366427c);
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$d */
    public static class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f366428b;

        public d(StringBuilder sb2) {
            this.f366428b = sb2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new NullPointerException(this.f366428b.toString());
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$e */
    public static class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I f366429b;

        public e(I i12) {
            this.f366429b = i12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new IllegalStateException("Transformation " + this.f366429b.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$f */
    public static class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I f366430b;

        public f(I i12) {
            this.f366430b = i12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new IllegalStateException("Transformation " + this.f366430b.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public RunnableC37866c(Picasso picasso, C37874k c37874k, r rVar, E e12, AbstractC37864a abstractC37864a, C c12) {
        this.f366409c = picasso;
        this.f366410d = c37874k;
        this.f366411e = rVar;
        this.f366412f = e12;
        this.f366417k = abstractC37864a;
        this.f366413g = abstractC37864a.f366396d;
        A a12 = abstractC37864a.f366394b;
        this.f366414h = a12;
        this.f366425s = a12.f366305q;
        this.f366415i = 0;
        this.f366416j = c12;
        this.f366424r = c12.d();
    }

    public static Bitmap a(List<I> list, Bitmap bitmap) {
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            I i13 = list.get(i12);
            try {
                Bitmap bitmapA = i13.a();
                if (bitmapA == null) {
                    StringBuilder sbR = androidx.compose.foundation.H.r("Transformation ");
                    sbR.append(i13.key());
                    sbR.append(" returned null after ");
                    sbR.append(i12);
                    sbR.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<I> it = list.iterator();
                    while (it.hasNext()) {
                        sbR.append(it.next().key());
                        sbR.append('\n');
                    }
                    Picasso.f366365k.post(new d(sbR));
                    return null;
                }
                if (bitmapA == bitmap && bitmap.isRecycled()) {
                    Picasso.f366365k.post(new e(i13));
                    return null;
                }
                if (bitmapA != bitmap && !bitmap.isRecycled()) {
                    Picasso.f366365k.post(new f(i13));
                    return null;
                }
                i12++;
                bitmap = bitmapA;
            } catch (RuntimeException e12) {
                Picasso.f366365k.post(new RunnableC10811c(i13, e12));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap c(e0 e0Var, A a12) throws IOException {
        Y y12 = new Y(e0Var);
        boolean z12 = y12.F0(0L, K.f366361b) && y12.F0(8L, K.f366362c);
        boolean z13 = a12.f366303o;
        BitmapFactory.Options optionsC = C.c(a12);
        boolean z14 = optionsC != null && optionsC.inJustDecodeBounds;
        int i12 = a12.f366294f;
        int i13 = a12.f366293e;
        if (z12) {
            byte[] bArrJ4 = y12.j4();
            if (z14) {
                BitmapFactory.decodeByteArray(bArrJ4, 0, bArrJ4.length, optionsC);
                C.a(i13, i12, optionsC.outWidth, optionsC.outHeight, optionsC, a12);
            }
            return BitmapFactory.decodeByteArray(bArrJ4, 0, bArrJ4.length, optionsC);
        }
        Y.a aVar = y12.new a();
        if (z14) {
            s sVar = new s(aVar);
            sVar.f366458g = false;
            long j12 = sVar.f366454c + 1024;
            if (sVar.f366456e < j12) {
                sVar.b(j12);
            }
            long j13 = sVar.f366454c;
            BitmapFactory.decodeStream(sVar, null, optionsC);
            C.a(i13, i12, optionsC.outWidth, optionsC.outHeight, optionsC, a12);
            sVar.a(j13);
            sVar.f366458g = true;
            aVar = sVar;
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(aVar, null, optionsC);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static boolean f(int i12, int i13, int i14, int i15, boolean z12) {
        return !z12 || (i14 != 0 && i12 > i14) || (i15 != 0 && i13 > i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap g(com.squareup.picasso.A r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC37866c.g(com.squareup.picasso.A, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void h(A a12) {
        Uri uri = a12.f366289a;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(a12.f366290b);
        StringBuilder sb2 = f366405u.get();
        sb2.ensureCapacity(strValueOf.length() + 8);
        sb2.replace(8, sb2.length(), strValueOf);
        Thread.currentThread().setName(sb2.toString());
    }

    public final boolean b() {
        Future<?> future;
        if (this.f366417k != null) {
            return false;
        }
        ArrayList arrayList = this.f366418l;
        return (arrayList == null || arrayList.isEmpty()) && (future = this.f366420n) != null && future.cancel(false);
    }

    public final void d(AbstractC37864a abstractC37864a) {
        boolean zRemove;
        if (this.f366417k == abstractC37864a) {
            this.f366417k = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.f366418l;
            zRemove = arrayList != null ? arrayList.remove(abstractC37864a) : false;
        }
        if (zRemove) {
            if (abstractC37864a.f366394b.f366305q == this.f366425s) {
                Picasso.Priority priority = Picasso.Priority.f366380b;
                ArrayList arrayList2 = this.f366418l;
                boolean z12 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
                AbstractC37864a abstractC37864a2 = this.f366417k;
                if (abstractC37864a2 != null || z12) {
                    if (abstractC37864a2 != null) {
                        priority = abstractC37864a2.f366394b.f366305q;
                    }
                    if (z12) {
                        int size = this.f366418l.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            Picasso.Priority priority2 = ((AbstractC37864a) this.f366418l.get(i12)).f366394b.f366305q;
                            if (priority2.ordinal() > priority.ordinal()) {
                                priority = priority2;
                            }
                        }
                    }
                }
                this.f366425s = priority;
            }
        }
        this.f366409c.getClass();
    }

    public final Bitmap e() throws IOException {
        Bitmap bitmapA = this.f366411e.a(this.f366413g);
        if (bitmapA != null) {
            this.f366412f.f366332b.sendEmptyMessage(0);
            this.f366421o = Picasso.LoadedFrom.MEMORY;
            this.f366409c.getClass();
            return bitmapA;
        }
        int i12 = this.f366424r == 0 ? 4 : this.f366415i;
        this.f366415i = i12;
        C.a aVarE = this.f366416j.e(this.f366414h, i12);
        if (aVarE != null) {
            this.f366421o = aVarE.f366326a;
            this.f366423q = aVarE.f366329d;
            bitmapA = aVarE.f366327b;
            if (bitmapA == null) {
                e0 e0Var = aVarE.f366328c;
                try {
                    bitmapA = c(e0Var, this.f366414h);
                } finally {
                    try {
                        e0Var.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmapA != null) {
            this.f366409c.getClass();
            E e12 = this.f366412f;
            e12.getClass();
            StringBuilder sb2 = K.f366360a;
            int allocationByteCount = bitmapA.getAllocationByteCount();
            if (allocationByteCount < 0) {
                throw new IllegalStateException("Negative size: " + bitmapA);
            }
            Handler handler = e12.f366332b;
            handler.sendMessage(handler.obtainMessage(2, allocationByteCount, 0));
            A a12 = this.f366414h;
            if (a12.b() || a12.f366292d != null || this.f366423q != 0) {
                synchronized (f366404t) {
                    try {
                        if (this.f366414h.b() || this.f366423q != 0) {
                            bitmapA = g(this.f366414h, bitmapA, this.f366423q);
                            this.f366409c.getClass();
                        }
                        List<I> list = this.f366414h.f366292d;
                        if (list != null) {
                            bitmapA = a(list, bitmapA);
                            this.f366409c.getClass();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bitmapA != null) {
                    E e13 = this.f366412f;
                    e13.getClass();
                    int allocationByteCount2 = bitmapA.getAllocationByteCount();
                    if (allocationByteCount2 < 0) {
                        throw new IllegalStateException("Negative size: " + bitmapA);
                    }
                    Handler handler2 = e13.f366332b;
                    handler2.sendMessage(handler2.obtainMessage(3, allocationByteCount2, 0));
                }
            }
        }
        return bitmapA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37874k c37874k = this.f366410d;
        try {
            try {
                try {
                    h(this.f366414h);
                    this.f366409c.getClass();
                    Bitmap bitmapE = e();
                    this.f366419m = bitmapE;
                    if (bitmapE == null) {
                        Handler handler = c37874k.f366441h;
                        handler.sendMessage(handler.obtainMessage(6, this));
                    } else {
                        c37874k.b(this);
                    }
                } catch (IOException e12) {
                    this.f366422p = e12;
                    Handler handler2 = c37874k.f366441h;
                    handler2.sendMessageDelayed(handler2.obtainMessage(5, this), 500L);
                } catch (Exception e13) {
                    this.f366422p = e13;
                    Handler handler3 = c37874k.f366441h;
                    handler3.sendMessage(handler3.obtainMessage(6, this));
                }
            } catch (u.b e14) {
                this.f366422p = e14;
                Handler handler4 = c37874k.f366441h;
                handler4.sendMessage(handler4.obtainMessage(6, this));
            } catch (OutOfMemoryError e15) {
                StringWriter stringWriter = new StringWriter();
                this.f366412f.a().a(new PrintWriter(stringWriter));
                this.f366422p = new RuntimeException(stringWriter.toString(), e15);
                Handler handler5 = c37874k.f366441h;
                handler5.sendMessage(handler5.obtainMessage(6, this));
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
