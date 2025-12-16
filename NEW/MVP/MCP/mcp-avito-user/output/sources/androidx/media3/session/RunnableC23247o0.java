package androidx.media3.session;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.media.C;
import androidx.media3.session.C23206a1;
import androidx.media3.session.O0;
import com.google.common.util.concurrent.C37568u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23247o0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52595b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f52599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f52600g;

    public /* synthetic */ RunnableC23247o0(MediaControllerImplLegacy mediaControllerImplLegacy, AtomicInteger atomicInteger, List list, ArrayList arrayList, int i12) {
        this.f52597d = mediaControllerImplLegacy;
        this.f52598e = atomicInteger;
        this.f52599f = list;
        this.f52600g = arrayList;
        this.f52596c = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.f52595b) {
            case 0:
                MediaControllerImplLegacy mediaControllerImplLegacy = (MediaControllerImplLegacy) this.f52597d;
                mediaControllerImplLegacy.getClass();
                int iIncrementAndGet = ((AtomicInteger) this.f52598e).incrementAndGet();
                List list = (List) this.f52599f;
                if (iIncrementAndGet == list.size()) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) this.f52600g;
                        if (i12 >= arrayList.size()) {
                            break;
                        } else {
                            com.google.common.util.concurrent.D0 d02 = (com.google.common.util.concurrent.D0) arrayList.get(i12);
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
                            mediaControllerImplLegacy.f52152g.addQueueItem(C1.k((androidx.media3.common.z) list.get(i12), bitmap), this.f52596c + i12);
                            i12++;
                        }
                    }
                }
                break;
            default:
                C23206a1.g gVar = (C23206a1.g) this.f52600g;
                C23206a1 c23206a1 = (C23206a1) this.f52597d;
                if (!c23206a1.f52357b.f()) {
                    boolean zIsActive = c23206a1.f52362g.isActive();
                    K1 k12 = (K1) this.f52598e;
                    int i13 = this.f52596c;
                    C.b bVar = (C.b) this.f52599f;
                    if (!zIsActive) {
                        Objects.toString(k12 == null ? Integer.valueOf(i13) : k12.f52116c);
                        bVar.b();
                        androidx.media3.common.util.s.g();
                        break;
                    } else {
                        O0.g gVarF = c23206a1.f(bVar);
                        if (gVarF != null) {
                            C23225h<C.b> c23225h = c23206a1.f52356a;
                            if (k12 != null) {
                                if (!c23225h.j(gVarF, k12)) {
                                }
                            } else if (!c23225h.i(gVarF, i13)) {
                            }
                            try {
                                gVar.b(gVarF);
                                break;
                            } catch (RemoteException e13) {
                                androidx.media3.common.util.s.h("Exception in " + gVarF, e13);
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC23247o0(C23206a1 c23206a1, K1 k12, int i12, C.b bVar, C23206a1.g gVar) {
        this.f52597d = c23206a1;
        this.f52598e = k12;
        this.f52596c = i12;
        this.f52599f = bVar;
        this.f52600g = gVar;
    }
}
