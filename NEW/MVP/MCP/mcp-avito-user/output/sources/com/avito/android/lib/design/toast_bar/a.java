package com.avito.android.lib.design.toast_bar;

import com.avito.android.lib.design.toast_bar.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ToastBarProxy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/a;", "Lcom/avito/android/lib/design/toast_bar/c;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements c {
    public final void a(@Y61.k i iVar) {
        Object next;
        i.f181082D.getClass();
        Iterator<T> it = i.f181083E.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((WeakReference) next).get() != null) {
                    break;
                }
            }
        }
        if (next != null) {
            i.a.a(iVar);
        } else {
            i.a.a(iVar);
            iVar.k();
        }
    }
}
