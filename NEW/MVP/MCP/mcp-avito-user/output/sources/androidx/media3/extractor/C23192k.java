package androidx.media3.extractor;

import androidx.media3.common.C23108t;
import androidx.media3.extractor.ts.C23197a;
import androidx.media3.extractor.ts.C23199c;
import androidx.media3.extractor.ts.C23201e;
import androidx.media3.extractor.ts.C23203g;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DefaultExtractorsFactory.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23192k implements t {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f50610d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: e, reason: collision with root package name */
    public static final a f50611e = new a(new androidx.media3.exoplayer.analytics.m(7));

    /* renamed from: f, reason: collision with root package name */
    public static final a f50612f = new a(new androidx.media3.exoplayer.analytics.m(8));

    /* renamed from: b, reason: collision with root package name */
    public boolean f50613b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public AbstractC37401r1<C23108t> f50614c;

    /* compiled from: DefaultExtractorsFactory.java */
    /* renamed from: androidx.media3.extractor.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1852a f50615a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f50616b = new AtomicBoolean(false);

        /* compiled from: DefaultExtractorsFactory.java */
        /* renamed from: androidx.media3.extractor.k$a$a, reason: collision with other inner class name */
        public interface InterfaceC1852a {
            @P
            Constructor<? extends p> b();
        }

        public a(InterfaceC1852a interfaceC1852a) {
            this.f50615a = interfaceC1852a;
        }

        @P
        public final p a(Object... objArr) {
            Constructor<? extends p> constructorB;
            synchronized (this.f50616b) {
                if (!this.f50616b.get()) {
                    try {
                        constructorB = this.f50615a.b();
                    } catch (ClassNotFoundException unused) {
                        this.f50616b.set(true);
                    } catch (Exception e12) {
                        throw new RuntimeException("Error instantiating extension", e12);
                    }
                }
                constructorB = null;
            }
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e13) {
                throw new IllegalStateException("Unexpected error creating extractor", e13);
            }
        }
    }

    public final void a(int i12, ArrayList arrayList) {
        switch (i12) {
            case 0:
                arrayList.add(new C23197a());
                break;
            case 1:
                arrayList.add(new C23199c());
                break;
            case 2:
                arrayList.add(new C23201e(this.f50613b ? 1 : 0));
                break;
            case 3:
                arrayList.add(new androidx.media3.extractor.amr.a(this.f50613b ? 1 : 0));
                break;
            case 4:
                p pVarA = f50611e.a(0);
                if (pVarA == null) {
                    arrayList.add(new androidx.media3.extractor.flac.c(0));
                    break;
                } else {
                    arrayList.add(pVarA);
                    break;
                }
            case 5:
                arrayList.add(new androidx.media3.extractor.flv.b());
                break;
            case 6:
                arrayList.add(new androidx.media3.extractor.mkv.d(0));
                break;
            case 7:
                arrayList.add(new androidx.media3.extractor.mp3.d(this.f50613b ? 1 : 0));
                break;
            case 8:
                arrayList.add(new androidx.media3.extractor.mp4.e(0));
                arrayList.add(new androidx.media3.extractor.mp4.g(0));
                break;
            case 9:
                arrayList.add(new androidx.media3.extractor.ogg.c());
                break;
            case 10:
                arrayList.add(new androidx.media3.extractor.ts.w());
                break;
            case 11:
                if (this.f50614c == null) {
                    this.f50614c = AbstractC37401r1.C();
                }
                arrayList.add(new androidx.media3.extractor.ts.C(new androidx.media3.common.util.G(0L), new C23203g(this.f50614c)));
                break;
            case 12:
                arrayList.add(new androidx.media3.extractor.wav.a());
                break;
            case 14:
                arrayList.add(new androidx.media3.extractor.jpeg.a());
                break;
            case 15:
                p pVarA2 = f50612f.a(new Object[0]);
                if (pVarA2 != null) {
                    arrayList.add(pVarA2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new androidx.media3.extractor.avi.b());
                break;
        }
    }
}
