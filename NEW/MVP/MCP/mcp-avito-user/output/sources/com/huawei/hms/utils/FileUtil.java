package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* renamed from: a, reason: collision with root package name */
    public static boolean f363678a = false;

    /* renamed from: b, reason: collision with root package name */
    public static ScheduledExecutorService f363679b = Executors.newSingleThreadScheduledExecutor();

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f363680a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f363681b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f363682c;

        public a(File file, long j12, String str) {
            this.f363680a = file;
            this.f363681b = j12;
            this.f363682c = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            File file = this.f363680a;
            if (file == null) {
                HMSLog.e("FileUtil", "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
                HMSLog.e("FileUtil", "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile = null;
            try {
                try {
                    long length = this.f363680a.length();
                    if (length > this.f363681b) {
                        String canonicalPath = this.f363680a.getCanonicalPath();
                        if (!this.f363680a.delete()) {
                            HMSLog.e("FileUtil", "last file delete failed.");
                        }
                        randomAccessFile = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f363680a, "rw");
                        try {
                            randomAccessFile2.seek(length);
                            randomAccessFile = randomAccessFile2;
                        } catch (IOException e12) {
                            e = e12;
                            randomAccessFile = randomAccessFile2;
                            HMSLog.e("FileUtil", "writeFile exception:", e);
                            IOUtils.closeQuietly(randomAccessFile);
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile = randomAccessFile2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    }
                    randomAccessFile.writeBytes(this.f363682c + System.getProperty("line.separator"));
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e13) {
                e = e13;
            }
            IOUtils.closeQuietly(randomAccessFile);
        }
    }

    public static boolean verifyHash(String str, File file) throws Throwable {
        byte[] bArrDigest = SHA256.digest(file);
        return bArrDigest != null && HEX.encodeHexString(bArrDigest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j12) {
        f363679b.execute(new a(file, j12, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j12, int i12) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f363678a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.e("FileUtil", "file delete failed.");
                }
                f363678a = true;
            }
            writeFile(file2, str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + j12 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i12, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
