package e11;

import h11.InterfaceC40761a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class G implements InterfaceC40761a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final ArrayList f394353a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public WeakReference<InterfaceC40761a.InterfaceC11238a> f394354b = null;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public WeakReference<com.my.target.E> f394355c;

    public final void a(@j.N h11.b bVar) {
        this.f394353a.add(bVar);
    }

    @Override // h11.InterfaceC40761a
    public final void dismiss() {
        com.my.target.E e12;
        WeakReference<com.my.target.V> weakReference;
        com.my.target.V v12;
        WeakReference<com.my.target.E> weakReference2 = this.f394355c;
        if (weakReference2 == null || (e12 = weakReference2.get()) == null || (weakReference = e12.f364372i) == null || (v12 = weakReference.get()) == null) {
            return;
        }
        v12.dismiss();
    }
}
