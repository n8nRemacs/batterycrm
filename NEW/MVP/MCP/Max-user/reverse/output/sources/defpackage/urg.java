package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

/* loaded from: classes.dex */
public abstract class urg extends hx4 {
    public final Context d;

    public urg(Context context, String str) {
        super(f(context, str), 1);
        this.d = context;
    }

    public static File f(Context context, String str) {
        return new File(ctd.j(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    public static void i(File file, byte b, boolean z) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
        }
    }

    @Override // defpackage.h6f
    public final void d(int i) {
        File file = this.a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
        }
        rw5 rw5Var = null;
        try {
            try {
                rw5 rw5VarD = fwf.d(file, new File(file, "dso_lock"));
                try {
                    cri.e("fb-UnpackingSoSource", "locked dso store " + file);
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!h(rw5VarD, i)) {
                        String str = "dso store is up-to-date: " + file;
                        if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
                            Log.i("fb-UnpackingSoSource", str);
                        }
                        rw5Var = rw5VarD;
                    }
                    if (rw5Var != null) {
                        cri.e("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        rw5Var.close();
                    } else {
                        cri.e("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    rw5Var = rw5VarD;
                    if (rw5Var != null) {
                        cri.e("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        rw5Var.close();
                    } else {
                        cri.e("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (!file.canWrite() || file.setWritable(false)) {
                throw th3;
            }
            throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
        }
    }

    public byte[] e() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarG = g(false);
        try {
            n2[] n2VarArrL = eVarG.l();
            parcelObtain.writeInt(n2VarArrL.length);
            for (n2 n2Var : n2VarArrL) {
                parcelObtain.writeString((String) n2Var.b);
                parcelObtain.writeString((String) n2Var.c);
            }
            eVarG.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                eVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract e g(boolean z);

    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.rw5 r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urg.h(rw5, int):boolean");
    }
}
