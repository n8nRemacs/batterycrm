package androidx.work.impl;

import androidx.work.WorkInfo;
import androidx.work.impl.model.H;
import java.util.List;
import q.InterfaceC47174a;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes10.dex */
class X implements InterfaceC47174a<List<H.c>, WorkInfo> {
    @Override // q.InterfaceC47174a
    public final WorkInfo apply(List<H.c> list) {
        List<H.c> list2 = list;
        if (list2 == null || list2.size() <= 0) {
            return null;
        }
        return list2.get(0).a();
    }
}
