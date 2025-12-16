package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/* loaded from: classes7.dex */
public final class Rm {

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Rm> f379339g = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f379340a;

    /* renamed from: b, reason: collision with root package name */
    private FileLock f379341b;

    /* renamed from: c, reason: collision with root package name */
    private FileChannel f379342c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final File f379343d;

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f379344e;

    /* renamed from: f, reason: collision with root package name */
    private Semaphore f379345f = new Semaphore(1, true);

    private Rm(@j.N Context context, @j.N String str) {
        String strQ = androidx.appcompat.app.r.q(str, ".lock");
        this.f379340a = strQ;
        File cacheDir = context.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "appmetrica_locks");
        if (file != null) {
            file.mkdirs();
        }
        this.f379343d = file != null ? new File(file, strQ) : null;
    }

    public static synchronized Rm a(@j.N Context context, @j.N String str) {
        Rm rm2;
        HashMap<String, Rm> map = f379339g;
        rm2 = map.get(str);
        if (rm2 == null) {
            rm2 = new Rm(context, str);
            map.put(str, rm2);
        }
        return rm2;
    }

    public synchronized void b() {
        this.f379345f.release();
        if (this.f379345f.availablePermits() > 0) {
            L0.a(this.f379341b);
            A2.a((Closeable) this.f379342c);
            A2.a((Closeable) this.f379344e);
            this.f379342c = null;
            this.f379344e = null;
        }
    }

    public synchronized void a() {
        try {
            this.f379345f.acquire();
            if (this.f379343d != null) {
                if (this.f379342c == null) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.f379343d, "rw");
                    this.f379344e = randomAccessFile;
                    this.f379342c = randomAccessFile.getChannel();
                }
                this.f379341b = this.f379342c.lock();
            } else {
                throw new IllegalStateException("Lock file is null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
