package androidx.media3.session;

import android.os.Handler;
import androidx.collection.C20199a;
import androidx.media3.common.InterfaceC23096j;
import com.google.common.util.concurrent.AbstractC37532c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SequencedFutureManager.java */
/* loaded from: classes.dex */
final class J1 {

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public int f52096b;

    /* renamed from: d, reason: collision with root package name */
    @j.B
    @j.P
    public Z f52098d;

    /* renamed from: e, reason: collision with root package name */
    @j.B
    @j.P
    public Handler f52099e;

    /* renamed from: f, reason: collision with root package name */
    @j.B
    public boolean f52100f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f52095a = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public final C20199a<Integer, a<?>> f52097c = new C20199a<>();

    /* compiled from: SequencedFutureManager.java */
    public static final class a<T> extends AbstractC37532c<T> {

        /* renamed from: i, reason: collision with root package name */
        public final int f52101i;

        /* renamed from: j, reason: collision with root package name */
        public final O1 f52102j;

        public a(int i12, O1 o12) {
            this.f52101i = i12;
            this.f52102j = o12;
        }

        public final void r() {
            super.n(this.f52102j);
        }
    }

    public final int a() {
        int i12;
        synchronized (this.f52095a) {
            i12 = this.f52096b;
            this.f52096b = i12 + 1;
        }
        return i12;
    }

    public final void b() {
        ArrayList arrayList;
        synchronized (this.f52095a) {
            try {
                this.f52100f = true;
                arrayList = new ArrayList(this.f52097c.values());
                this.f52097c.clear();
                if (this.f52098d != null) {
                    Handler handler = this.f52099e;
                    handler.getClass();
                    handler.post(this.f52098d);
                    this.f52098d = null;
                    this.f52099e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).r();
        }
    }

    public final void c(int i12, InterfaceC23096j interfaceC23096j) {
        synchronized (this.f52095a) {
            try {
                a<?> aVarRemove = this.f52097c.remove(Integer.valueOf(i12));
                if (aVarRemove != null) {
                    if (aVarRemove.f52102j.getClass() == interfaceC23096j.getClass()) {
                        aVarRemove.n(interfaceC23096j);
                    } else {
                        aVarRemove.f52102j.getClass().toString();
                        interfaceC23096j.getClass().toString();
                        androidx.media3.common.util.s.g();
                    }
                }
                if (this.f52098d != null && this.f52097c.isEmpty()) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
