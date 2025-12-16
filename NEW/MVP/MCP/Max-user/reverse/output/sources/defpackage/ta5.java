package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class ta5 {
    public static final Object l = new Object();
    public static volatile ta5 m;
    public final ReentrantReadWriteLock a;
    public final xs b;
    public volatile int c;
    public final Handler d;
    public final pa5 e;
    public final sa5 f;
    public final uha g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final sm4 k;

    public ta5(de6 de6Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.h = de6Var.b;
        this.i = de6Var.c;
        sa5 sa5Var = de6Var.a;
        this.f = sa5Var;
        int i = de6Var.e;
        this.j = i;
        this.k = de6Var.f;
        this.d = new Handler(Looper.getMainLooper());
        xs xsVar = new xs(0);
        this.b = xsVar;
        this.g = new uha(19);
        xs xsVar2 = de6Var.d;
        if (xsVar2 != null && !xsVar2.isEmpty()) {
            xsVar.addAll(de6Var.d);
        }
        pa5 pa5Var = new pa5(this);
        this.e = pa5Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                sa5Var.b(new oa5(pa5Var));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static ta5 a() {
        ta5 ta5Var;
        synchronized (l) {
            ta5Var = m;
            z5j.f("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", ta5Var != null);
        }
        return ta5Var;
    }

    public static void c(de6 de6Var) {
        if (m == null) {
            synchronized (l) {
                try {
                    if (m == null) {
                        m = new ta5(de6Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        z5j.f("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.j == 1);
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            pa5 pa5Var = this.e;
            ta5 ta5Var = (ta5) pa5Var.a;
            try {
                ta5Var.f.b(new oa5(pa5Var));
            } catch (Throwable th) {
                ta5Var.e(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new hp(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x011e, code lost:
    
        if (r9 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0120, code lost:
    
        ((defpackage.l7f) r19).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0127, code lost:
    
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0128, code lost:
    
        if (r9 != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:38:0x0076, B:41:0x007b, B:43:0x007f, B:45:0x008c, B:50:0x00a8, B:52:0x00b2, B:54:0x00b5, B:56:0x00b9, B:58:0x00c9, B:59:0x00cc, B:61:0x00da, B:67:0x00e8, B:68:0x00f9, B:70:0x0112, B:48:0x009e), top: B:89:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:38:0x0076, B:41:0x007b, B:43:0x007f, B:45:0x008c, B:50:0x00a8, B:52:0x00b2, B:54:0x00b5, B:56:0x00b9, B:58:0x00c9, B:59:0x00cc, B:61:0x00da, B:67:0x00e8, B:68:0x00f9, B:70:0x0112, B:48:0x009e), top: B:89:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:38:0x0076, B:41:0x007b, B:43:0x007f, B:45:0x008c, B:50:0x00a8, B:52:0x00b2, B:54:0x00b5, B:56:0x00b9, B:58:0x00c9, B:59:0x00cc, B:61:0x00da, B:67:0x00e8, B:68:0x00f9, B:70:0x0112, B:48:0x009e), top: B:89:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:38:0x0076, B:41:0x007b, B:43:0x007f, B:45:0x008c, B:50:0x00a8, B:52:0x00b2, B:54:0x00b5, B:56:0x00b9, B:58:0x00c9, B:59:0x00cc, B:61:0x00da, B:67:0x00e8, B:68:0x00f9, B:70:0x0112, B:48:0x009e), top: B:89:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence f(int r17, int r18, java.lang.CharSequence r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta5.f(int, int, java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final CharSequence g(CharSequence charSequence) {
        return f(0, charSequence == null ? 0 : charSequence.length(), charSequence, Integer.MAX_VALUE, 0);
    }

    public final void h(ra5 ra5Var) {
        z5j.e(ra5Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new hp(Arrays.asList(ra5Var), this.c, (Throwable) null));
            } else {
                this.b.add(ra5Var);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
