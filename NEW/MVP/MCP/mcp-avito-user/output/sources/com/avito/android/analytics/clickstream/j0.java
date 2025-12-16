package com.avito.android.analytics.clickstream;

import com.avito.android.analytics.clickstream.H;
import com.avito.android.service.short_task.ShortTask;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SendClickStreamEventsTaskDelegateImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/analytics/clickstream/H$c;", "it", "Lcom/avito/android/service/short_task/ShortTask$Status;", "apply", "(Ljava/util/List;)Lcom/avito/android/service/short_task/ShortTask$Status;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f89807b;

    public j0(k0 k0Var) {
        this.f89807b = k0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean z12;
        this.f89807b.getClass();
        List list = (List) obj;
        boolean z13 = list instanceof Collection;
        boolean z14 = true;
        if (z13 && list.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((H.c) it.next()) instanceof H.c.a) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        if (z13 && list.isEmpty()) {
            z14 = false;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((H.c) it2.next()) instanceof H.c.C2665c) {
                    break;
                }
            }
            z14 = false;
        }
        return z12 ? ShortTask.Status.f274032d : z14 ? ShortTask.Status.f274031c : ShortTask.Status.f274030b;
    }
}
