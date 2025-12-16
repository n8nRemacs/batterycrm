package androidx.media3.session;

import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media3.common.util.C23118i;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.C23206a1;
import androidx.media3.session.C23225h;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23219f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f52455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f52456g;

    public /* synthetic */ RunnableC23219f(C23225h c23225h, C23225h.a aVar, AtomicBoolean atomicBoolean, C23225h.b bVar, AtomicBoolean atomicBoolean2) {
        this.f52451b = 0;
        this.f52452c = c23225h;
        this.f52453d = aVar;
        this.f52454e = atomicBoolean;
        this.f52456g = bVar;
        this.f52455f = atomicBoolean2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i12 = 0;
        Object obj = this.f52456g;
        Object obj2 = this.f52455f;
        Object obj3 = this.f52454e;
        Object obj4 = this.f52453d;
        Object obj5 = this.f52452c;
        switch (this.f52451b) {
            case 0:
                C23225h c23225h = (C23225h) obj5;
                c23225h.getClass();
                ((C23225h.a) obj4).run().N(new RunnableC23222g(c23225h, (AtomicBoolean) obj3, (C23225h.b) obj, (AtomicBoolean) obj2), com.google.common.util.concurrent.Q0.a());
                break;
            case 1:
                int i13 = B0.f51923o;
                ((B0) obj5).getClass();
                AbstractC37401r1 abstractC37401r1 = (AbstractC37401r1) obj3;
                if (((AtomicInteger) obj4).incrementAndGet() == abstractC37401r1.size()) {
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        ArrayList arrayList2 = (ArrayList) obj2;
                        if (i12 >= arrayList2.size()) {
                            ((com.google.common.util.concurrent.e1) obj).n(arrayList);
                            break;
                        } else {
                            com.google.common.util.concurrent.D0 d02 = (com.google.common.util.concurrent.D0) arrayList2.get(i12);
                            if (d02 != null) {
                                try {
                                    bitmap = (Bitmap) C37568u0.b(d02);
                                } catch (CancellationException | ExecutionException e12) {
                                    androidx.media3.common.util.s.a("Failed to get bitmap", e12);
                                    androidx.media3.common.util.s.b();
                                }
                            } else {
                                bitmap = null;
                            }
                            arrayList.add(C1.c((androidx.media3.common.z) abstractC37401r1.get(i12), bitmap));
                            i12++;
                        }
                    }
                }
                break;
            case 2:
                ((AtomicReference) obj4).set(((B0) obj5).f51925n.p((O0.g) obj3, (AbstractServiceC23270w0.b) obj2));
                ((C23118i) obj).d();
                break;
            default:
                C23206a1.d dVar = (C23206a1.d) obj5;
                dVar.getClass();
                ArrayList arrayList3 = (ArrayList) obj3;
                if (((AtomicInteger) obj4).incrementAndGet() == arrayList3.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (true) {
                        ArrayList arrayList5 = (ArrayList) obj2;
                        if (i12 >= arrayList5.size()) {
                            int i14 = androidx.media3.common.util.M.f47887a;
                            C23206a1 c23206a1 = C23206a1.this;
                            if (i14 >= 21) {
                                c23206a1.f52362g.setQueue(arrayList4);
                                break;
                            } else {
                                ArrayList arrayListF = C1.F(arrayList4);
                                androidx.media3.common.P p12 = (androidx.media3.common.P) obj;
                                if (arrayListF.size() != p12.w()) {
                                    arrayListF.size();
                                    p12.w();
                                    androidx.media3.common.util.s.f();
                                }
                                c23206a1.f52362g.setQueue(arrayListF);
                                break;
                            }
                        } else {
                            com.google.common.util.concurrent.D0 d03 = (com.google.common.util.concurrent.D0) arrayList5.get(i12);
                            if (d03 != null) {
                                try {
                                    bitmap2 = (Bitmap) C37568u0.b(d03);
                                } catch (CancellationException | ExecutionException e13) {
                                    androidx.media3.common.util.s.a("Failed to get bitmap", e13);
                                    androidx.media3.common.util.s.b();
                                }
                            } else {
                                bitmap2 = null;
                            }
                            arrayList4.add(new MediaSessionCompat.QueueItem(C1.k((androidx.media3.common.z) arrayList3.get(i12), bitmap2), C1.t(i12)));
                            i12++;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC23219f(Object obj, Serializable serializable, Object obj2, Object obj3, Object obj4, int i12) {
        this.f52451b = i12;
        this.f52452c = obj;
        this.f52453d = serializable;
        this.f52454e = obj2;
        this.f52455f = obj3;
        this.f52456g = obj4;
    }
}
