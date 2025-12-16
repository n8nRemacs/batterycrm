package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes.dex */
public abstract class uni {
    public static final cwf a = new cwf();

    public static byte a(long j) {
        u5j.b(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static Object b(AbstractCollection abstractCollection, Object obj) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static Object c(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object d(ArrayList arrayList) {
        Object next;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList != null) {
                return wy1.d(arrayList, 1);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final rc3 e(ScheduledSendPickerViewModel scheduledSendPickerViewModel) {
        rc3 rc3Var;
        synchronized (a) {
            rc3Var = (rc3) scheduledSendPickerViewModel.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (rc3Var == null) {
                x74 immediate = bd5.a;
                try {
                    ep4 ep4Var = gy4.a;
                    immediate = MainDispatcherLoader.dispatcher.getImmediate();
                } catch (IllegalStateException | oia unused) {
                }
                rc3 rc3Var2 = new rc3(immediate.plus(zk6.a()));
                scheduledSendPickerViewModel.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", rc3Var2);
                rc3Var = rc3Var2;
            }
        }
        return rc3Var;
    }

    public static void f(List list, l7c l7cVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (l7cVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
