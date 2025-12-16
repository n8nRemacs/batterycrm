package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: JvmSystemFileSystem.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/I;", "Lokio/v;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class I extends AbstractC44811v {
    public static ArrayList m(S s5, boolean z12) throws IOException {
        File fileE = s5.e();
        String[] list = fileE.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(s5.d(str));
            }
            C42745f0.y0(arrayList);
            return arrayList;
        }
        if (!z12) {
            return null;
        }
        if (fileE.exists()) {
            throw new IOException("failed to list " + s5);
        }
        throw new FileNotFoundException("no such file: " + s5);
    }

    @Override // okio.AbstractC44811v
    public void a(@Y61.k S s5) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = s5.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + s5);
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public List<S> c(@Y61.k S s5) {
        return m(s5, true);
    }

    @Override // okio.AbstractC44811v
    @Y61.l
    public List<S> d(@Y61.k S s5) {
        return m(s5, false);
    }

    @Override // okio.AbstractC44811v
    @Y61.l
    public C44810u f(@Y61.k S s5) {
        File fileE = s5.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !fileE.exists()) {
            return null;
        }
        return new C44810u(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public AbstractC44809t g(@Y61.k S s5) {
        return new H(new RandomAccessFile(s5.e(), "r"));
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public c0 h(@Y61.k S s5) {
        return M.e(s5.e());
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public e0 i(@Y61.k S s5) {
        return M.f(s5.e());
    }

    @Y61.k
    public c0 j(@Y61.k S s5) {
        File fileE = s5.e();
        Logger logger = N.f420027a;
        return M.c(new FileOutputStream(fileE, true));
    }

    public void k(@Y61.k S s5, @Y61.k S s12) throws IOException {
        if (s5.e().renameTo(s12.e())) {
            return;
        }
        throw new IOException("failed to move " + s5 + " to " + s12);
    }

    public void l(@Y61.k S s5) throws IOException {
        if (s5.e().mkdir()) {
            return;
        }
        C44810u c44810uF = f(s5);
        if (c44810uF == null || !c44810uF.f420154b) {
            throw new IOException("failed to create directory: " + s5);
        }
    }

    @Y61.k
    public String toString() {
        return "JvmSystemFileSystem";
    }
}
