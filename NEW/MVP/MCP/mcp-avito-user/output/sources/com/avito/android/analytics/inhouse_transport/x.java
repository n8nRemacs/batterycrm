package com.avito.android.analytics.inhouse_transport;

import android.support.v4.media.session.PlaybackStateCompat;
import com.avito.android.util.InterfaceC35863o4;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: OnDiskEventStorage.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/x;", "", "T", "Lcom/avito/android/analytics/inhouse_transport/u;", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class x<T> implements u<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f90216a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f90217b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c<T> f90218c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f90219d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f90220e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @J41.a
    @Y61.k
    public final com.squareup.tape2.c<T> f90221f;

    public x(@Y61.k e eVar, @Y61.k l lVar, @Y61.k c<T> cVar, @Y61.k InterfaceC35863o4 interfaceC35863o4) throws IOException {
        com.squareup.tape2.c<T> cVarG;
        this.f90216a = eVar;
        this.f90217b = lVar;
        this.f90218c = cVar;
        this.f90219d = interfaceC35863o4;
        String strC = lVar.c();
        File fileA = eVar.a();
        if (lVar.b() || strC == null || C43066x.K(strC)) {
            f(fileA);
            String strA = interfaceC35863o4.a();
            lVar.a(strA);
            cVarG = g(strA);
        } else {
            cVarG = g(strC);
        }
        this.f90221f = cVarG;
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final int a() {
        int size;
        synchronized (this.f90220e) {
            size = this.f90221f.size();
        }
        return size;
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void add(@Y61.k T t12) {
        synchronized (this.f90220e) {
            this.f90221f.a(t12);
            G0 g02 = G0.f406611a;
        }
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void b(@Y61.k List<? extends T> list) {
        synchronized (this.f90220e) {
            try {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.f90221f.a(it.next());
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void c() {
        this.f90217b.d(true);
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    @Y61.k
    public final List<T> d() {
        return e(a());
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    @Y61.k
    public final List<T> e(int i12) {
        ArrayList arrayListC;
        synchronized (this.f90220e) {
            com.squareup.tape2.c<T> cVar = this.f90221f;
            int iMin = Math.min(i12, cVar.size());
            ArrayList arrayList = new ArrayList(iMin);
            Iterator<T> it = cVar.iterator();
            for (int i13 = 0; i13 < iMin; i13++) {
                arrayList.add(it.next());
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f90221f.d(listUnmodifiableList.size());
            arrayListC = C42745f0.C(listUnmodifiableList);
        }
        return arrayListC;
    }

    public final void f(File file) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                f(file2);
            } else {
                file2.delete();
            }
        }
        this.f90217b.d(false);
    }

    public final com.squareup.tape2.c<T> g(String str) throws IOException {
        File fileA = this.f90216a.a();
        c<T> cVar = this.f90218c;
        File file = new File(fileA, "v" + cVar.getF91058a() + '_' + str);
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        return com.squareup.tape2.c.b(new com.squareup.tape2.e(new RandomAccessFile(file, "rwd")), cVar);
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f90220e) {
            zIsEmpty = this.f90221f.isEmpty();
        }
        return zIsEmpty;
    }
}
