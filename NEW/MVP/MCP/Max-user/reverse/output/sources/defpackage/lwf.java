package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.RandomAccessFile;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public final class lwf implements b85 {
    public static lwf a;

    @Override // defpackage.b85
    public int a(Context context, String str, boolean z) {
        return d85.d(context, str, z);
    }

    public void b(Uri uri, RandomAccessFile randomAccessFile, String str, h79 h79Var) throws Throwable {
        Selector selectorOpen;
        ArrayList arrayList = new ArrayList();
        SSLContext sSLContext = (SSLContext) zvg.c.getValue();
        long length = randomAccessFile.length();
        Selector selector = null;
        ng4 ng4Var = null;
        try {
            selectorOpen = Selector.open();
        } catch (Throwable th) {
            th = th;
        }
        try {
            fr3 fr3Var = new fr3(selectorOpen, uri, randomAccessFile, length, str, arrayList.size(), sSLContext);
            fr3Var.c();
            arrayList.add(fr3Var);
            while (true) {
                if (selectorOpen.select() != 0) {
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    Iterator<SelectionKey> it = selectorOpen.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        it.remove();
                        fr3 fr3Var2 = (fr3) next.attachment();
                        if (next.isConnectable() && fr3Var2.i == 2) {
                            fr3Var2.m = ng4Var;
                            fr3Var2.d();
                        } else {
                            try {
                                if (next.isWritable()) {
                                    fr3Var2.g();
                                }
                                if (next.isReadable()) {
                                    fr3Var2.f();
                                    ng4 ng4Var2 = fr3Var2.m;
                                    if (ng4Var2 != null && ng4Var == null) {
                                        for (int i = 0; i < 3; i++) {
                                            fr3 fr3Var3 = new fr3(selectorOpen, uri, randomAccessFile, length, str, arrayList.size(), sSLContext);
                                            fr3Var3.c();
                                            arrayList.add(fr3Var3);
                                        }
                                        ng4Var = ng4Var2;
                                    }
                                    ng4 ng4Var3 = fr3Var2.m;
                                    if (ng4Var3 != null ? ng4Var3.c : false) {
                                        selectorOpen.close();
                                        if (ng4Var != null) {
                                            h79Var.E(ng4Var.a() / length);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                fr3Var2.b();
                                throw th2;
                            }
                        }
                        if (ng4Var != null) {
                            h79Var.E(ng4Var.a() / length);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            selector = selectorOpen;
            if (selector != null) {
                selector.close();
            }
            throw th;
        }
    }

    @Override // defpackage.b85
    public int c(Context context, String str) {
        return d85.a(context, str);
    }
}
