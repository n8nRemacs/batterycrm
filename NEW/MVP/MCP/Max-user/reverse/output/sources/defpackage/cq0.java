package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class cq0 {
    public static ThreadPoolExecutor A;
    public static int B;
    public static lk6 C;
    public static boolean w;
    public static final ConcurrentHashMap x = new ConcurrentHashMap();
    public static volatile boolean y;
    public static final int z;
    public final BitmapDrawable a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f;
    public byte[] g;
    public final Object h;
    public int i;
    public boolean j;
    public volatile boolean k;
    public final int l;
    public final File m;
    public int n;
    public final AtomicBoolean o;
    public final ue p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public RandomAccessFile u;
    public BitmapFactory.Options v;

    static {
        z = Math.max(Math.min(r0.d - 2, sxi.a.e), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0117 -> B:69:0x0149). Please report as a decompilation issue!!! */
    public cq0(File file, aq0 aq0Var, zp0 zp0Var, int i, int i2, boolean z2) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new ue(4, this);
        this.a = (BitmapDrawable) aq0Var;
        this.b = i;
        this.c = i2;
        zp0Var.getClass();
        this.l = 100;
        String name = file.getName();
        if (A == null) {
            int i3 = z;
            A = new ThreadPoolExecutor(i3, i3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(sxi.a.c.D(), "acache");
        if (!w) {
            file2.mkdir();
            w = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        File file3 = new File(file2, ho7.l(sb, z2 ? "_nolimit" : " ", ".pcache2"));
        this.m = file3;
        this.f = i < ie.a(60.0f) && i2 < ie.a(60.0f);
        if (!((Boolean) sxi.a.g.invoke()).booleanValue()) {
            this.k = false;
            this.s = false;
            return;
        }
        this.k = file3.exists();
        if (this.k) {
            try {
                try {
                    randomAccessFile = new RandomAccessFile(file3, "r");
                    try {
                        this.s = randomAccessFile.readBoolean();
                        if (this.s && arrayList.isEmpty()) {
                            randomAccessFile.seek(randomAccessFile.readInt());
                            int i4 = randomAccessFile.readInt();
                            d(randomAccessFile, i4 > 10000 ? 0 : i4);
                            if (arrayList.size() == 0) {
                                this.s = false;
                                this.k = false;
                                this.q = true;
                                file3.delete();
                            } else {
                                if (this.u != randomAccessFile) {
                                    a();
                                }
                                this.u = randomAccessFile;
                            }
                        }
                        if (this.u != randomAccessFile) {
                            randomAccessFile.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            this.m.delete();
                            this.k = false;
                            this.q = true;
                            if (this.u != randomAccessFile && randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            this.q = true;
                        } finally {
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th3) {
                randomAccessFile = null;
                th = th3;
            }
        }
        this.q = true;
    }

    public static void c() {
        int i = B - 1;
        B = i;
        if (i <= 0) {
            B = 0;
            RLottieDrawable.lottieCacheGenerateQueue.b(new mc(4));
        }
    }

    public final void a() throws IOException {
        RandomAccessFile randomAccessFile = this.u;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01cf, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01dc, code lost:
    
        r7.close();
        r16.a.releaseForGenerateCache();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
    
        one.me.rlottie.RLottie.getLogger().a("cancelled cache generation");
        r2.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c4, code lost:
    
        if (r14 >= defpackage.cq0.z) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c6, code lost:
    
        r0 = r9[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c8, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ca, code lost:
    
        r0.await();
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098 A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0004, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0098, B:46:0x00a1, B:47:0x00d1, B:49:0x00d5, B:53:0x00dd, B:55:0x00e5, B:58:0x00ed, B:61:0x00f8, B:63:0x00fc, B:65:0x0100, B:69:0x0108, B:68:0x0105, B:70:0x010b, B:71:0x011c, B:73:0x011f, B:74:0x0120, B:75:0x012a, B:77:0x0130, B:78:0x014d, B:79:0x015a, B:81:0x015d, B:82:0x015e, B:86:0x0191, B:89:0x0194, B:90:0x0195, B:93:0x01af, B:94:0x01b6, B:95:0x01c2, B:97:0x01c6, B:99:0x01ca, B:103:0x01d2, B:102:0x01cf, B:107:0x01dc, B:52:0x00da), top: B:141:0x0004, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195 A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0004, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0098, B:46:0x00a1, B:47:0x00d1, B:49:0x00d5, B:53:0x00dd, B:55:0x00e5, B:58:0x00ed, B:61:0x00f8, B:63:0x00fc, B:65:0x0100, B:69:0x0108, B:68:0x0105, B:70:0x010b, B:71:0x011c, B:73:0x011f, B:74:0x0120, B:75:0x012a, B:77:0x0130, B:78:0x014d, B:79:0x015a, B:81:0x015d, B:82:0x015e, B:86:0x0191, B:89:0x0194, B:90:0x0195, B:93:0x01af, B:94:0x01b6, B:95:0x01c2, B:97:0x01c6, B:99:0x01ca, B:103:0x01d2, B:102:0x01cf, B:107:0x01dc, B:52:0x00da), top: B:141:0x0004, outer: #13 }] */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.graphics.drawable.BitmapDrawable, aq0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.graphics.drawable.BitmapDrawable, aq0] */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.graphics.drawable.BitmapDrawable, aq0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.BitmapDrawable, aq0] */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.graphics.drawable.BitmapDrawable, aq0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.graphics.drawable.BitmapDrawable, aq0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq0.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i) throws IOException {
        if (i == 0) {
            return;
        }
        byte[] bArr = new byte[i * 8];
        randomAccessFile.read(bArr);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        for (int i2 = 0; i2 < i; i2++) {
            bq0 bq0Var = new bq0(i2);
            bq0Var.c = byteBufferWrap.getInt();
            bq0Var.b = byteBufferWrap.getInt();
            this.e.add(bq0Var);
        }
    }

    public final byte[] e(bq0 bq0Var) {
        boolean z2 = this.f && Thread.currentThread().getName().startsWith("rlottie-bg-pool");
        byte[] bArr = z2 ? (byte[]) x.get(Thread.currentThread()) : this.g;
        if (bArr != null && bArr.length >= bq0Var.b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (bq0Var.b * 1.3f)];
        if (!z2) {
            this.g = bArr2;
            return bArr2;
        }
        x.put(Thread.currentThread(), bArr2);
        if (!y) {
            y = true;
            ie.e(this.p, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        }
        return bArr2;
    }

    public final int f(Bitmap bitmap, int i) throws IOException {
        RandomAccessFile randomAccessFile;
        if (!this.j) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (this.s || this.k) {
                    if (!this.s || (randomAccessFile = this.u) == null) {
                        randomAccessFile = new RandomAccessFile(this.m, "r");
                        try {
                            this.s = randomAccessFile.readBoolean();
                            if (this.s && this.e.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                d(randomAccessFile, randomAccessFile.readInt());
                            }
                            if (this.e.size() == 0) {
                                this.s = false;
                                this.q = true;
                            }
                            if (!this.s) {
                                randomAccessFile.close();
                                return -1;
                            }
                        } catch (FileNotFoundException unused) {
                            randomAccessFile2 = randomAccessFile;
                            if (this.j && randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            return -1;
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile2 = randomAccessFile;
                            RLottie.getLogger().d(th);
                            int i2 = this.n + 1;
                            this.n = i2;
                            if (i2 > 10) {
                                this.j = true;
                            }
                            if (this.j) {
                                randomAccessFile2.close();
                            }
                            return -1;
                        }
                    }
                    if (this.e.size() != 0) {
                        bq0 bq0Var = (bq0) this.e.get(Math.max(Math.min(i, this.e.size() - 1), 0));
                        randomAccessFile.seek(bq0Var.c);
                        byte[] bArrE = e(bq0Var);
                        randomAccessFile.readFully(bArrE, 0, bq0Var.b);
                        if (this.t) {
                            this.u = null;
                            randomAccessFile.close();
                        } else {
                            if (this.u != randomAccessFile) {
                                a();
                            }
                            this.u = randomAccessFile;
                        }
                        if (this.v == null) {
                            this.v = new BitmapFactory.Options();
                        }
                        BitmapFactory.Options options = this.v;
                        options.inBitmap = bitmap;
                        BitmapFactory.decodeByteArray(bArrE, 0, bq0Var.b, options);
                        this.v.inBitmap = null;
                        return 0;
                    }
                }
            } catch (FileNotFoundException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    public final boolean g() {
        return (this.s && this.k) ? false : true;
    }
}
