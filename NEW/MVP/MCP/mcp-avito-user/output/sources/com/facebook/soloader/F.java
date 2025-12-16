package com.facebook.soloader;

import com.facebook.soloader.G;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: UnpackingSoSource.java */
/* loaded from: classes16.dex */
class F implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f340829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f340830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G.b f340831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f340832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f340833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G f340834g;

    public F(G g12, File file, byte[] bArr, G.b bVar, File file2, s sVar) {
        this.f340834g = g12;
        this.f340829b = file;
        this.f340830c = bArr;
        this.f340831d = bVar;
        this.f340832e = file2;
        this.f340833f = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f340833f;
        G g12 = this.f340834g;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f340829b, "rw");
                try {
                    randomAccessFile.write(this.f340830c);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    randomAccessFile = new RandomAccessFile(new File(g12.f340869a, "dso_manifest"), "rw");
                    try {
                        G.b bVar = this.f340831d;
                        randomAccessFile.writeByte(1);
                        G.a[] aVarArr = bVar.f340841a;
                        randomAccessFile.writeInt(aVarArr.length);
                        for (int i12 = 0; i12 < aVarArr.length; i12++) {
                            randomAccessFile.writeUTF(aVarArr[i12].f340839b);
                            randomAccessFile.writeUTF(aVarArr[i12].f340840c);
                        }
                        randomAccessFile.close();
                        File file = g12.f340869a;
                        SysUtil.b(file);
                        G.n(this.f340832e, (byte) 1);
                        Objects.toString(file);
                        sVar.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                Objects.toString(g12.f340869a);
                sVar.close();
                throw th2;
            }
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }
}
