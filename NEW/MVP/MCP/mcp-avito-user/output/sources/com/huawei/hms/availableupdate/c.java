package com.huawei.hms.availableupdate;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* compiled from: RandomFileOutputStream.java */
/* loaded from: classes7.dex */
public class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public RandomAccessFile f363342a;

    public c(File file, int i12) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            this.f363342a = randomAccessFile;
            randomAccessFile.setLength(i12);
        } catch (FileNotFoundException unused) {
            HMSLog.e("RandomFileOutputStream", "create  file stream failed");
        } catch (IOException unused2) {
            IOUtils.closeQuietly(this.f363342a);
            HMSLog.e("RandomFileOutputStream", "create  file stream failed");
        }
    }

    public void a(long j12) throws IOException {
        RandomAccessFile randomAccessFile = this.f363342a;
        if (randomAccessFile != null) {
            randomAccessFile.seek(j12);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f363342a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i12, int i13) throws IOException {
        RandomAccessFile randomAccessFile = this.f363342a;
        if (randomAccessFile != null) {
            randomAccessFile.write(bArr, i12, i13);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i12) throws IOException {
        write(new byte[]{(byte) i12}, 0, 1);
    }
}
