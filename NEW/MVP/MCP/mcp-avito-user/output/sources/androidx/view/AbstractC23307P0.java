package androidx.view;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import j.InterfaceC42153i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: NavigatorState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/P0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.P0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23307P0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ReentrantLock f52861a = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Z1<List<C23395u>> f52862b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Z1<Set<C23395u>> f52863c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52864d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n2<List<C23395u>> f52865e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final n2<Set<C23395u>> f52866f;

    public AbstractC23307P0() {
        Z1<List<C23395u>> z1A = p2.a(C42784z0.f406748b);
        this.f52862b = z1A;
        Z1<Set<C23395u>> z1A2 = p2.a(B0.f406639b);
        this.f52863c = z1A2;
        this.f52865e = C43175k.b(z1A);
        this.f52866f = C43175k.b(z1A2);
    }

    @k
    public abstract C23395u a(@k C23317W c23317w, @l Bundle bundle);

    public void b(@k C23395u c23395u) {
        Z1<Set<C23395u>> z12 = this.f52863c;
        z12.setValue(b1.e(z12.getValue(), c23395u));
    }

    @InterfaceC42153i
    public final void c(@k C23395u c23395u) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.f52861a;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList(this.f52865e.getValue());
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (L.f(((C23395u) listIterator.previous()).f53186g, c23395u.f53186g)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayList.set(iNextIndex, c23395u);
            this.f52862b.setValue(arrayList);
            G0 g02 = G0.f406611a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void d(@k C23395u c23395u, boolean z12) {
        ReentrantLock reentrantLock = this.f52861a;
        reentrantLock.lock();
        try {
            Z1<List<C23395u>> z13 = this.f52862b;
            List<C23395u> value = z13.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (L.f((C23395u) obj, c23395u)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            z13.setValue(arrayList);
            G0 g02 = G0.f406611a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void e(@k C23395u c23395u, boolean z12) {
        C23395u c23395uPrevious;
        Z1<Set<C23395u>> z13 = this.f52863c;
        Set<C23395u> value = z13.getValue();
        boolean z14 = value instanceof Collection;
        n2<List<C23395u>> n2Var = this.f52865e;
        if (!z14 || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C23395u) it.next()) == c23395u) {
                    List<C23395u> value2 = n2Var.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((C23395u) it2.next()) == c23395u) {
                        }
                    }
                    return;
                }
            }
        }
        z13.setValue(b1.i(z13.getValue(), c23395u));
        List<C23395u> value3 = n2Var.getValue();
        ListIterator<C23395u> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c23395uPrevious = null;
                break;
            }
            c23395uPrevious = listIterator.previous();
            C23395u c23395u2 = c23395uPrevious;
            if (!L.f(c23395u2, c23395u) && n2Var.getValue().lastIndexOf(c23395u2) < n2Var.getValue().lastIndexOf(c23395u)) {
                break;
            }
        }
        C23395u c23395u3 = c23395uPrevious;
        if (c23395u3 != null) {
            z13.setValue(b1.i(z13.getValue(), c23395u3));
        }
        d(c23395u, z12);
    }

    @InterfaceC42153i
    public void f(@k C23395u c23395u) {
        Z1<Set<C23395u>> z12 = this.f52863c;
        z12.setValue(b1.i(z12.getValue(), c23395u));
    }

    public void g(@k C23395u c23395u) {
        ReentrantLock reentrantLock = this.f52861a;
        reentrantLock.lock();
        try {
            Z1<List<C23395u>> z12 = this.f52862b;
            z12.setValue(C42745f0.i0(c23395u, z12.getValue()));
            G0 g02 = G0.f406611a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void h(@k C23395u c23395u) {
        Z1<Set<C23395u>> z12 = this.f52863c;
        Set<C23395u> value = z12.getValue();
        boolean z13 = value instanceof Collection;
        n2<List<C23395u>> n2Var = this.f52865e;
        if (!z13 || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C23395u) it.next()) == c23395u) {
                    List<C23395u> value2 = n2Var.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((C23395u) it2.next()) == c23395u) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C23395u c23395u2 = (C23395u) C42745f0.S(n2Var.getValue());
        if (c23395u2 != null) {
            z12.setValue(b1.i(z12.getValue(), c23395u2));
        }
        z12.setValue(b1.i(z12.getValue(), c23395u));
        g(c23395u);
    }
}
