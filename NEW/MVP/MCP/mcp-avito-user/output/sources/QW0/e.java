package QW0;

import QW0.c;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;

/* compiled from: ForwardingControllerListener2.java */
@Nullsafe
/* loaded from: classes10.dex */
public class e<I> extends a<I> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13752b = new ArrayList(2);

    @Override // QW0.a, QW0.c
    public final void a(String str, @I41.h c.a aVar) {
        int size = this.f13752b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                c cVar = (c) this.f13752b.get(i12);
                if (cVar != null) {
                    cVar.a(str, aVar);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // QW0.a, QW0.c
    public final void b(String str, @I41.h I i12, @I41.h c.a aVar) {
        int size = this.f13752b.size();
        for (int i13 = 0; i13 < size; i13++) {
            try {
                c cVar = (c) this.f13752b.get(i13);
                if (cVar != null) {
                    cVar.b(str, i12, aVar);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // QW0.a, QW0.c
    public final void c(String str, @I41.h Throwable th2, @I41.h c.a aVar) {
        int size = this.f13752b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                c cVar = (c) this.f13752b.get(i12);
                if (cVar != null) {
                    cVar.c(str, th2, aVar);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // QW0.a, QW0.c
    public final void d(String str, @I41.h c.a aVar) {
        int size = this.f13752b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                c cVar = (c) this.f13752b.get(i12);
                if (cVar != null) {
                    cVar.d(str, aVar);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }
}
