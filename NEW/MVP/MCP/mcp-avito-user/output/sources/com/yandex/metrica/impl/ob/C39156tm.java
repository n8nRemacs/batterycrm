package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.yandex.metrica.impl.ob.tm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39156tm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f381898a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f381899b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final B0 f381900c;

    /* renamed from: d, reason: collision with root package name */
    private File f381901d;

    /* renamed from: e, reason: collision with root package name */
    private FileLock f381902e;

    /* renamed from: f, reason: collision with root package name */
    private RandomAccessFile f381903f;

    /* renamed from: g, reason: collision with root package name */
    private FileChannel f381904g;

    /* renamed from: h, reason: collision with root package name */
    private int f381905h;

    public C39156tm(@j.N Context context, @j.N String str) {
        this(context, str, new B0());
    }

    public synchronized void a() {
        try {
            File fileB = this.f381900c.b(this.f381898a.getFilesDir(), this.f381899b);
            this.f381901d = fileB;
            if (fileB == null) {
                throw new IllegalStateException("Cannot create lock file");
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f381901d, "rw");
            this.f381903f = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f381904g = channel;
            if (this.f381905h == 0) {
                this.f381902e = channel.lock();
            }
            this.f381905h++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        try {
            File file = this.f381901d;
            if (file != null) {
                file.getAbsolutePath();
            }
            int i12 = this.f381905h - 1;
            this.f381905h = i12;
            if (i12 == 0) {
                L0.a(this.f381902e);
            }
            A2.a((Closeable) this.f381903f);
            A2.a((Closeable) this.f381904g);
            this.f381903f = null;
            this.f381902e = null;
            this.f381904g = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        b();
        File file = this.f381901d;
        if (file != null) {
            file.delete();
        }
    }

    @j.k0
    public C39156tm(@j.N Context context, @j.N String str, @j.N B0 b02) {
        this.f381905h = 0;
        this.f381898a = context;
        this.f381899b = androidx.appcompat.app.r.q(str, ".lock");
        this.f381900c = b02;
    }
}
