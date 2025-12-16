package com.facebook.common.statfs;

import I41.h;
import J41.a;
import J41.d;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.u;
import com.facebook.infer.annotation.Nullsafe;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@d
@Nullsafe
/* loaded from: classes5.dex */
public class StatFsHelper {

    /* renamed from: h, reason: collision with root package name */
    public static StatFsHelper f339847h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f339848i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b, reason: collision with root package name */
    @h
    public volatile File f339850b;

    /* renamed from: d, reason: collision with root package name */
    @h
    public volatile File f339852d;

    /* renamed from: e, reason: collision with root package name */
    @a
    public long f339853e;

    /* renamed from: a, reason: collision with root package name */
    @h
    public volatile StatFs f339849a = null;

    /* renamed from: c, reason: collision with root package name */
    @h
    public volatile StatFs f339851c = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f339855g = false;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f339854f = new ReentrantLock();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StorageType {

        /* renamed from: b, reason: collision with root package name */
        public static final StorageType f339856b;

        /* renamed from: c, reason: collision with root package name */
        public static final StorageType f339857c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ StorageType[] f339858d;

        static {
            StorageType storageType = new StorageType("INTERNAL", 0);
            f339856b = storageType;
            StorageType storageType2 = new StorageType("EXTERNAL", 1);
            f339857c = storageType2;
            f339858d = new StorageType[]{storageType, storageType2};
        }

        public StorageType() {
            throw null;
        }

        public static StorageType valueOf(String str) {
            return (StorageType) Enum.valueOf(StorageType.class, str);
        }

        public static StorageType[] values() {
            return (StorageType[]) f339858d.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @h
    public static StatFs b(@h StatFs statFs, @h File file) throws Throwable {
        ?? r02 = 0;
        r02 = 0;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = new StatFs(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            r02 = statFs;
            return r02;
        } catch (IllegalArgumentException unused) {
            return r02;
        } catch (Throwable th2) {
            u.a(th2);
            throw r02;
        }
    }

    public final void a() {
        if (this.f339855g) {
            return;
        }
        this.f339854f.lock();
        try {
            if (!this.f339855g) {
                this.f339850b = Environment.getDataDirectory();
                this.f339852d = Environment.getExternalStorageDirectory();
                this.f339849a = b(this.f339849a, this.f339850b);
                this.f339851c = b(this.f339851c, this.f339852d);
                this.f339853e = SystemClock.uptimeMillis();
                this.f339855g = true;
            }
        } finally {
            this.f339854f.unlock();
        }
    }
}
