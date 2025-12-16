package com.yandex.metrica.impl.ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.q0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39063q0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f381402a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final b f381403b;

    /* renamed from: com.yandex.metrica.impl.ob.q0$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f381404a;

        /* renamed from: b, reason: collision with root package name */
        public final long f381405b;

        public a(long j12, long j13) {
            this.f381404a = j12;
            this.f381405b = j13;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q0$b */
    public static class b {
    }

    public C39063q0(@j.N Context context) {
        this(context, new b());
    }

    @j.N
    public a a() {
        long j12;
        long totalBytes = 0;
        if (!A2.a(26)) {
            if (A2.a(18)) {
                try {
                    this.f381403b.getClass();
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    long blockSizeLong = statFs.getBlockSizeLong();
                    return new a((statFs.getBlockCountLong() * blockSizeLong) / 1024, (statFs.getAvailableBlocksLong() * blockSizeLong) / 1024);
                } catch (Throwable unused) {
                    return new a(0L, 0L);
                }
            }
            try {
                this.f381403b.getClass();
                long blockSize = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
                return new a((r0.getBlockCount() * blockSize) / 1024, (r0.getAvailableBlocks() * blockSize) / 1024);
            } catch (Throwable unused2) {
                return new a(0L, 0L);
            }
        }
        StorageStatsManager storageStatsManager = (StorageStatsManager) this.f381402a.getSystemService("storagestats");
        StorageManager storageManager = (StorageManager) this.f381402a.getSystemService("storage");
        if (storageManager == null || storageStatsManager == null) {
            j12 = 0;
        } else {
            Iterator<StorageVolume> it = storageManager.getStorageVolumes().iterator();
            long freeBytes = 0;
            while (it.hasNext()) {
                try {
                    String uuid = it.next().getUuid();
                    UUID uuidFromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                    totalBytes += storageStatsManager.getTotalBytes(uuidFromString);
                    freeBytes += storageStatsManager.getFreeBytes(uuidFromString);
                } catch (Throwable unused3) {
                }
            }
            long j13 = totalBytes;
            totalBytes = freeBytes;
            j12 = j13;
        }
        return new a(j12 / 1024, totalBytes / 1024);
    }

    @j.k0
    public C39063q0(@j.N Context context, @j.N b bVar) {
        this.f381402a = context;
        this.f381403b = bVar;
    }
}
